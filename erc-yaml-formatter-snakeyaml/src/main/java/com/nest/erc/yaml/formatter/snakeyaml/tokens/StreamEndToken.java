package com.nest.erc.yaml.formatter.snakeyaml.tokens;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

public final class StreamEndToken extends Token {

    public StreamEndToken(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public Token.ID getTokenId() {
        return ID.StreamEnd;
    }
}
