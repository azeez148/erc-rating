package com.nest.erc.yaml.formatter.snakeyaml.introspector;

/**
 * Control instance variables.
 */
public enum BeanAccess {
    /** use JavaBean properties and public fields */
    DEFAULT,

    /** use all declared fields (including inherited) */
    FIELD,

    /** reserved */
    PROPERTY;
}