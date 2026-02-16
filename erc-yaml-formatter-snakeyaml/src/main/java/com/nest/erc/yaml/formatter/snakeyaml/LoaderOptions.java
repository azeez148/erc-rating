package com.nest.erc.yaml.formatter.snakeyaml;

public class LoaderOptions {

    private boolean allowDuplicateKeys = true;
    private boolean wrappedToRootException = false;

    public boolean isAllowDuplicateKeys() {
        return allowDuplicateKeys;
    }

    /**
     * Allow/Reject duplicate map keys in the YAML file.
     *
     * Default is to allow.
     *
     * YAML 1.1 is slightly vague around duplicate entries in the YAML file. The
     * best reference is <a href="http://www.yaml.org/spec/1.1/#id862121">
     * 3.2.1.3. Nodes Comparison</a> where it hints that a duplicate map key is
     * an error.
     *
     * For future reference, YAML spec 1.2 is clear. The keys MUST be unique.
     * <a href="http://www.yaml.org/spec/1.2/spec.html#id2759572">1.3. Relation
     * to JSON</a>
     * @param allowDuplicateKeys false to reject duplicate mapping keys
     */
    public void setAllowDuplicateKeys(boolean allowDuplicateKeys) {
        this.allowDuplicateKeys = allowDuplicateKeys;
    }

    public boolean isWrappedToRootException() {
        return wrappedToRootException;
    }

    /**
     * Wrap runtime exception to YAMLException during parsing or leave them as they are
     *
     * Default is to leave original exceptions
     *
     * @param wrappedToRootException - true to convert runtime exception to YAMLException
     */
    public void setWrappedToRootException(boolean wrappedToRootException) {
        this.wrappedToRootException = wrappedToRootException;
    }
}
