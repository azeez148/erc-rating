package com.nest.erc.yaml.formatter.snakeyaml.parser;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;
import com.nest.erc.yaml.formatter.snakeyaml.error.MarkedYAMLException;

/**
 * Exception thrown by the {@link Parser} implementations in case of malformed
 * input.
 */
public class ParserException extends MarkedYAMLException {
    private static final long serialVersionUID = -2349253802798398038L;

    /**
     * Constructs an instance.
     * 
     * @param context
     *            Part of the input document in which vicinity the problem
     *            occurred.
     * @param contextMark
     *            Position of the <code>context</code> within the document.
     * @param problem
     *            Part of the input document that caused the problem.
     * @param problemMark
     *            Position of the <code>problem</code>. within the document.
     */
    public ParserException(String context, Mark contextMark, String problem, Mark problemMark) {
        super(context, contextMark, problem, problemMark, null, null);
    }
}
