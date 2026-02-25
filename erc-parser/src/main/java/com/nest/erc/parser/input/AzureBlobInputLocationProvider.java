package com.nest.erc.parser.input;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Duration;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;
import com.azure.storage.blob.models.ListBlobsOptions;
import com.nest.erc.parser.ERCParserProjectProperties;
import com.nest.erc.parser.ERCParserProjectProperties.AzureInputProperties;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
public class AzureBlobInputLocationProvider implements InputLocationProvider {

    private static final Logger LOGGER = Logger.getLogger(AzureBlobInputLocationProvider.class);
    private final ERCParserProjectProperties properties;

    public AzureBlobInputLocationProvider(ERCParserProjectProperties properties) {
        this.properties = properties;
    }

    @Override
    public boolean supports(String location) {
        return StringUtils.startsWithIgnoreCase(location, "azure://");
    }

    @Override
    public ResolvedInputLocation resolve(String location) {
        AzureInputProperties azure = properties.getAzure();
        if (azure == null || StringUtils.isBlank(azure.getConnectionString())) {
            throw new IllegalStateException(
                    "parserproject.azure.connectionString must be configured when using azure:// inputs");
        }
        String withoutScheme = location.substring("azure://".length());
        String container;
        String prefix = "";
        int slashIndex = withoutScheme.indexOf('/');
        if (slashIndex >= 0) {
            container = withoutScheme.substring(0, slashIndex);
            prefix = withoutScheme.substring(slashIndex + 1);
        } else {
            container = withoutScheme;
        }
        if (StringUtils.isBlank(container)) {
            throw new IllegalArgumentException("azure:// URI must include the container name");
        }
        try {
            Path tempDir = Files.createTempDirectory("erc-input-azure-");
            BlobServiceClient serviceClient = new BlobServiceClientBuilder()
                    .connectionString(azure.getConnectionString())
                    .buildClient();
            BlobContainerClient containerClient = serviceClient.getBlobContainerClient(container);
            if (!containerClient.exists()) {
                throw new IllegalStateException("Azure container not found: " + container);
            }
            stageBlobs(containerClient, prefix, tempDir);
            return ResolvedInputLocation.temporary(tempDir, () -> deleteRecursively(tempDir),
                    "azure container " + container);
        } catch (IOException ex) {
            throw new IllegalStateException("Failed to stage Azure input into a temp directory", ex);
        }
    }

    private void stageBlobs(BlobContainerClient containerClient, String prefix, Path tempDir) throws IOException {
        boolean downloadedAny = false;
        ListBlobsOptions options = new ListBlobsOptions();
        if (StringUtils.isNotBlank(prefix)) {
            options.setPrefix(prefix);
        }
        for (BlobItem blobItem : containerClient.listBlobs(options, Duration.ofMinutes(5))) {
            BlobClient blobClient = containerClient.getBlobClient(blobItem.getName());
            Path target = tempDir.resolve(relativePath(prefix, blobItem.getName()));
            if (target.getParent() != null) {
                Files.createDirectories(target.getParent());
            }
            blobClient.downloadToFile(target.toString(), true);
            LOGGER.info("Downloaded azure://" + containerClient.getBlobContainerName() + "/" + blobItem.getName());
            downloadedAny = true;
        }
        if (!downloadedAny) {
            throw new IllegalStateException(
                    "No blobs found under azure://" + containerClient.getBlobContainerName() + "/" + prefix);
        }
    }

    private String relativePath(String prefix, String blobName) {
        if (StringUtils.isBlank(prefix)) {
            return blobName;
        }
        if (blobName.startsWith(prefix)) {
            String trimmed = blobName.substring(prefix.length());
            return StringUtils.removeStart(trimmed, "/");
        }
        return blobName;
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
}
