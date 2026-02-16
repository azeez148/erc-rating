package com.nest.erc.yaml.formatter.snakeyaml.tokens;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

public final class BlockEntryToken extends Token {

    public BlockEntryToken(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public Token.ID getTokenId() {
        return ID.BlockEntry;
    }
}