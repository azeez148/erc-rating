package com.nest.erc.yaml.formatter.snakeyaml.serializer;

import com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException;

public class SerializerException extends YAMLException {
    private static final long serialVersionUID = 2632638197498912433L;

    public SerializerException(String message) {
        super(message);
    }
}