package com.nest.erc.parser.input;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Objects;

/**
 * Represents a materialized input directory that ERC parser can work with. The
 * underlying location might be a real folder on disk or a temporary directory
 * populated from remote storage (S3/Azure/etc.).
 */
public final class ResolvedInputLocation implements AutoCloseable {

    private final Path localDirectory;
    private final boolean cleanupRequired;
    private final CleanupAction cleanupAction;
    private final String description;

    private ResolvedInputLocation(Path localDirectory,
            boolean cleanupRequired,
            CleanupAction cleanupAction,
            String description) {
        this.localDirectory = Objects.requireNonNull(localDirectory, "localDirectory");
        this.cleanupRequired = cleanupRequired;
        this.cleanupAction = cleanupAction == null ? () -> {
        } : cleanupAction;
        this.description = description == null ? localDirectory.toString() : description;
    }

    public static ResolvedInputLocation permanent(Path directory, String description) {
        return new ResolvedInputLocation(directory, false, null, description);
    }

    public static ResolvedInputLocation temporary(Path directory, CleanupAction cleanupAction, String description) {
        return new ResolvedInputLocation(directory, true, cleanupAction, description);
    }

    public Path getLocalDirectory() {
        return localDirectory;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void close() throws IOException {
        if (cleanupRequired) {
            cleanupAction.run();
        }
    }

    @FunctionalInterface
    public interface CleanupAction {

        void run() throws IOException;
    }
}
