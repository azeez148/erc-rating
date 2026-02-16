package com.nest.erc.yaml.formatter.snakeyaml.tokens;

import java.util.List;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;
import com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException;


public final class DirectiveToken<T> extends Token {
    private final String name;
    private final List<T> value;

    public DirectiveToken(String name, List<T> value, Mark startMark, Mark endMark) {
        super(startMark, endMark);
        this.name = name;
        if (value != null && value.size() != 2) {
            throw new YAMLException("Two strings must be provided instead of "
                    + String.valueOf(value.size()));
        }
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public List<T> getValue() {
        return this.value;
    }

    @Override
    public Token.ID getTokenId() {
        return ID.Directive;
    }
}