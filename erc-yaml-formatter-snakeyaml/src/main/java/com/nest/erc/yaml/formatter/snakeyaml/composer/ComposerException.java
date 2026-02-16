package com.nest.erc.yaml.formatter.snakeyaml.composer;


import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;
import com.nest.erc.yaml.formatter.snakeyaml.error.MarkedYAMLException;

public class ComposerException extends MarkedYAMLException {
    private static final long serialVersionUID = 2146314636913113935L;

    protected ComposerException(String context, Mark contextMark, String problem, Mark problemMark) {
        super(context, contextMark, problem, problemMark);
    }
}
