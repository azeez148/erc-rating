package com.nest.erc.parser.input;

import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Delegates user-provided paths to the first provider that supports the given
 * scheme. Providers are ordered via
 * {@link org.springframework.core.annotation.Order} so more specific
 * implementations (S3, Azure) win over the fallback local provider.
 */
@Component
public class InputLocationResolver {

    private static final Logger LOGGER = Logger.getLogger(InputLocationResolver.class);

    private final List<InputLocationProvider> providers;

    public InputLocationResolver(List<InputLocationProvider> providers) {
        this.providers = providers;
        this.providers.sort(Comparator.comparingInt(provider -> {
            org.springframework.core.annotation.Order orderAnn
                    = provider.getClass().getAnnotation(org.springframework.core.annotation.Order.class);
            return orderAnn != null ? orderAnn.value() : Ordered.LOWEST_PRECEDENCE;
        }));
    }

    public ResolvedInputLocation resolve(String location) {
        if (StringUtils.isBlank(location)) {
            throw new IllegalArgumentException("Input location was blank – configure parserproject.inputFilelocation");
        }

        return providers.stream()
                .filter(provider -> provider.supports(location))
                .findFirst()
                .map(provider -> {
                    ResolvedInputLocation resolved = provider.resolve(location);
                    LOGGER.info("Resolved input location via " + provider.getClass().getSimpleName()
                            + " -> " + resolved.getLocalDirectory());
                    return resolved;
                })
                .orElseThrow(() -> new IllegalArgumentException(
                "No InputLocationProvider could handle location: " + location));
    }
}
