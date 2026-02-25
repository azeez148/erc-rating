package com.nest.erc.parser.input;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nest.erc.parser.ERCParserProjectProperties;
import com.nest.erc.parser.ERCParserProjectProperties.S3InputProperties;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.core.sync.ResponseTransformer;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.S3ClientBuilder;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Response;
import software.amazon.awssdk.services.s3.model.S3Object;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class S3InputLocationProvider implements InputLocationProvider {

    private static final Logger LOGGER = Logger.getLogger(S3InputLocationProvider.class);
    private final ERCParserProjectProperties properties;

    public S3InputLocationProvider(ERCParserProjectProperties properties) {
        this.properties = properties;
    }

    @Override
    public boolean supports(String location) {
        return StringUtils.startsWithIgnoreCase(location, "s3://");
    }

    @Override
    public ResolvedInputLocation resolve(String location) {
        URI uri = URI.create(location);
        String bucket = uri.getHost();
        if (StringUtils.isBlank(bucket)) {
            throw new IllegalArgumentException("s3:// URI must include a bucket name");
        }
        String prefix = StringUtils.removeStart(StringUtils.defaultString(uri.getPath()), "/");
        try {
            Path tempDir = Files.createTempDirectory("erc-input-s3-");
            S3Client client = buildClient();
            downloadObjects(client, bucket, prefix, tempDir);
            return ResolvedInputLocation.temporary(tempDir, () -> deleteRecursively(tempDir), "s3 bucket " + bucket);
        } catch (IOException ex) {
            throw new IllegalStateException("Failed to stage S3 input into a temp directory", ex);
        }
    }

    private void downloadObjects(S3Client client, String bucket, String prefix, Path tempDir) throws IOException {
        boolean downloadedAny = false;
        String continuationToken = null;
        do {
            ListObjectsV2Request.Builder requestBuilder = ListObjectsV2Request.builder()
                    .bucket(bucket);
            if (StringUtils.isNotBlank(prefix)) {
                requestBuilder.prefix(prefix);
            }
            if (continuationToken != null) {
                requestBuilder.continuationToken(continuationToken);
            }
            ListObjectsV2Response response = client.listObjectsV2(requestBuilder.build());
            for (S3Object object : response.contents()) {
                if (object.key() == null || object.key().endsWith("/")) {
                    continue;
                }
                Path target = tempDir.resolve(relativeKey(prefix, object.key()));
                Files.createDirectories(target.getParent());
                client.getObject(GetObjectRequest.builder().bucket(bucket).key(object.key()).build(),
                        ResponseTransformer.toFile(target));
                LOGGER.info("Downloaded s3://" + bucket + "/" + object.key());
                downloadedAny = true;
            }
            continuationToken = response.nextContinuationToken();
            if (!response.isTruncated()) {
                break;
            }
        } while (true);

        if (!downloadedAny) {
            throw new IllegalStateException("No objects found under s3://" + bucket + "/" + prefix);
        }
    }

    private String relativeKey(String prefix, String key) {
        if (StringUtils.isBlank(prefix)) {
            return key;
        }
        if (key.startsWith(prefix)) {
            String trimmed = key.substring(prefix.length());
            return StringUtils.removeStart(trimmed, "/");
        }
        return key;
    }

    private void deleteRecursively(Path directory) throws IOException {
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.deleteIfExists(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.deleteIfExists(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private S3Client buildClient() {
        S3InputProperties s3 = properties.getS3();
        if (s3 == null || StringUtils.isBlank(s3.getRegion())) {
            throw new IllegalStateException("parserproject.s3.region must be configured when using s3:// inputs");
        }
        S3ClientBuilder builder = S3Client.builder()
                .region(Region.of(s3.getRegion()));

        if (StringUtils.isNotBlank(s3.getEndpointOverride())) {
            builder = builder.endpointOverride(URI.create(s3.getEndpointOverride()));
        }

        builder = builder.credentialsProvider(credentialsProvider(s3));
        return builder.build();
    }

    private AwsCredentialsProvider credentialsProvider(S3InputProperties s3) {
        if (StringUtils.isNotBlank(s3.getProfile())) {
            return ProfileCredentialsProvider.create(s3.getProfile());
        }
        return DefaultCredentialsProvider.create();
    }
}
