package com.nest.erc.yaml.formatter.snakeyaml.scanner;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;
import com.nest.erc.yaml.formatter.snakeyaml.error.MarkedYAMLException;

/**
 * Exception thrown by the {@link Scanner} implementations in case of malformed
 * input.
 */
public class ScannerException extends MarkedYAMLException {

    private static final long serialVersionUID = 4782293188600445954L;

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
     *            Position of the <code>problem</code> within the document.
     * @param note
     *            Message for the user with further information about the
     *            problem.
     */
    public ScannerException(String context, Mark contextMark, String problem, Mark problemMark,
            String note) {
        super(context, contextMark, problem, problemMark, note);
    }

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
     *            Position of the <code>problem</code> within the document.
     */
    public ScannerException(String context, Mark contextMark, String problem, Mark problemMark) {
        this(context, contextMark, problem, problemMark, null);
    }
}
