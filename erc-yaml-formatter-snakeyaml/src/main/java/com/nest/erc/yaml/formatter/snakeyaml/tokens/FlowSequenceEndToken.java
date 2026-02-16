package com.nest.erc.yaml.formatter.snakeyaml.tokens;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

public final class FlowSequenceEndToken extends Token {

    public FlowSequenceEndToken(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public Token.ID getTokenId() {
        return ID.FlowSequenceEnd;
    }
}

