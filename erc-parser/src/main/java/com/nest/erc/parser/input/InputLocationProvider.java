package com.nest.erc.parser.input;

/**
 * Implementations translate a user-provided location (local path, network
 * share, cloud bucket, etc.) into a real directory that the parser can read
 * from. Providers can pull remote content down to a temporary folder when
 * necessary.
 */
public interface InputLocationProvider {

    /**
     * @param location raw location string passed via configuration
     * @return {@code true} when this provider can resolve the location
     */
    boolean supports(String location);

    /**
     * Resolve the location into a folder that can be consumed by downstream
     * services. Implementations may download remote content and return a
     * temporary directory that will be cleaned up when {@link
     * ResolvedInputLocation#close()} is invoked.
     */
    ResolvedInputLocation resolve(String location);
}
