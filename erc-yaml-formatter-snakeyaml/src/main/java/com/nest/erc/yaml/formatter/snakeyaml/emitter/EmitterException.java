package com.nest.erc.yaml.formatter.snakeyaml.emitter;

import com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException;

public class EmitterException extends YAMLException {
    private static final long serialVersionUID = -8280070025452995908L;

    public EmitterException(String msg) {
        super(msg);
    }
}
