package com.nest.erc.parser.input;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Default fallback: treat the configured value as a folder on the local file
 * system (absolute path, relative path, UNC share, etc.).
 */
@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class FileSystemInputLocationProvider implements InputLocationProvider {

    @Override
    public boolean supports(String location) {
        return !StringUtils.isBlank(location);
    }

    @Override
    public ResolvedInputLocation resolve(String location) {
        try {
            Path candidate;
            if (location.startsWith("file:")) {
                candidate = Paths.get(URI.create(location));
            } else {
                candidate = Paths.get(location);
            }
            Path directory = candidate.toAbsolutePath().normalize();
            if (!Files.exists(directory) || !Files.isDirectory(directory)) {
                throw new IllegalArgumentException("Input directory does not exist: " + directory);
            }
            return ResolvedInputLocation.permanent(directory, "local file system path");
        } catch (IllegalArgumentException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new IllegalStateException("Failed to resolve local path " + location, ex);
        }
    }
}
