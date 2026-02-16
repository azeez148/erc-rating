package com.nest.erc.yaml.formatter.snakeyaml.parser;

import java.util.Map;

import com.nest.erc.yaml.formatter.snakeyaml.DumperOptions.Version;

/**
 * Store the internal state for directives
 */
class VersionTagsTuple {
    private Version version;
    private Map<String, String> tags;

    public VersionTagsTuple(Version version, Map<String, String> tags) {
        this.version = version;
        this.tags = tags;
    }

    public Version getVersion() {
        return version;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return String.format("VersionTagsTuple<%s, %s>", version, tags);
    }
}