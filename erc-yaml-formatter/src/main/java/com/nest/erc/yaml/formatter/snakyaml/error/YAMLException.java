package com.nest.erc.yaml.formatter.snakyaml.error;

import com.fasterxml.jackson.core.JsonParser;
import com.nest.erc.yaml.formatter.JacksonYAMLParseException;


/**
 * Replacement for formerly shaded exception type from SnakeYAML; included
 * in 2.8 solely for backwards compatibility: new code that relies on Jackson 2.8
 * and after should NOT use this type but only base type {@link JacksonYAMLParseException}.
 *
 * @deprecated Since 2.8
 */
@Deprecated
public class YAMLException extends JacksonYAMLParseException
{
    private static final long serialVersionUID = 1L;

    public YAMLException(JsonParser p,
    		com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException src) {
        super(p, src.getMessage(), src);
    }

    public static YAMLException from(JsonParser p,
    		com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException src) {
        return new YAMLException(p, src);
    }
}
