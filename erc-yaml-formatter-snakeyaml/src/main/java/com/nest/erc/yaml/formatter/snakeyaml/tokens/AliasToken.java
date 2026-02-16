package com.nest.erc.yaml.formatter.snakeyaml.tokens;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

public final class AliasToken extends Token {
    private final String value;

    public AliasToken(String value, Mark startMark, Mark endMark) {
        super(startMark, endMark);
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public Token.ID getTokenId() {
        return ID.Alias;
    }
}