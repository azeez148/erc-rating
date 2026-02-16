package com.nest.erc.yaml.formatter.snakeyaml.tokens;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * @deprecated it will be removed because it is not used
 */
public class CommentToken extends Token {
    public CommentToken(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public ID getTokenId() {
        return ID.Comment;
    }
}

