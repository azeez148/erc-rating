package com.nest.erc.yaml.formatter.snakeyaml.reader;


import com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException;

public class ReaderException extends YAMLException {
    private static final long serialVersionUID = 8710781187529689083L;
    private final String name;
    private final int codePoint;
    private final int position;

    public ReaderException(String name, int position, int codePoint, String message) {
        super(message);
        this.name = name;
        this.codePoint = codePoint;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getCodePoint() {
        return codePoint;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        final String s = new String(Character.toChars(codePoint));
        return "unacceptable code point '" + s + "' (0x"
                + Integer.toHexString(codePoint).toUpperCase() + ") " + getMessage()
                + "\nin \"" + name + "\", position " + position;
    }
}
