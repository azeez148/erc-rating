package com.nest.erc.yaml.formatter.snakeyaml.constructor;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

public class DuplicateKeyException extends ConstructorException {

    protected DuplicateKeyException(Mark contextMark, Object key,
                                    Mark problemMark) {
        super("while constructing a mapping", contextMark, "found duplicate key " + String.valueOf(key), problemMark);
    }
}
