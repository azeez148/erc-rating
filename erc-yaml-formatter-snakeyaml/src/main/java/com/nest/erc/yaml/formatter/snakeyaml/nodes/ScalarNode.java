package com.nest.erc.yaml.formatter.snakeyaml.nodes;


import com.nest.erc.yaml.formatter.snakeyaml.DumperOptions;
import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Represents a scalar node.
 * <p>
 * Scalar nodes form the leaves in the node graph.
 * </p>
 */
public class ScalarNode extends Node {
    private DumperOptions.ScalarStyle style;
    private String value;

    public ScalarNode(Tag tag, String value, Mark startMark, Mark endMark, DumperOptions.ScalarStyle style) {
        this(tag, true, value, startMark, endMark, style);
    }

    public ScalarNode(Tag tag, boolean resolved, String value, Mark startMark, Mark endMark,
                      DumperOptions.ScalarStyle style) {
        super(tag, startMark, endMark);
        if (value == null) {
            throw new NullPointerException("value in a Node is required.");
        }
        this.value = value;
        if (style == null) throw new NullPointerException("Scalar style must be provided.");
        this.style = style;
        this.resolved = resolved;
    }

    /*
     * Existed in older versions but replaced with {@link DumperOptions.ScalarStyle}-based constructor.
     * Restored in v1.22 for backwards compatibility.
     * @deprecated Since restored in v1.22.  Use {@link ScalarNode#ScalarNode(Tag, String, Mark, Mark, org.yaml.snakeyaml.DumperOptions.ScalarStyle) }.
     */
    @Deprecated
    public ScalarNode(Tag tag, String value, Mark startMark, Mark endMark, Character style) {
        this(tag, value, startMark, endMark, DumperOptions.ScalarStyle.createStyle(style));
    }

    /*
     * Existed in older versions but replaced with {@link DumperOptions.ScalarStyle}-based constructor.
     * Restored in v1.22 for backwards compatibility.
     * @deprecated Since restored in v1.22.  Use {@link ScalarNode#ScalarNode(Tag, boolean, String, Mark, Mark, org.yaml.snakeyaml.DumperOptions.ScalarStyle) }.
     */
    @Deprecated
    public ScalarNode(Tag tag, boolean resolved, String value, Mark startMark, Mark endMark,
              Character style) {
        this(tag, resolved, value, startMark, endMark, DumperOptions.ScalarStyle.createStyle(style));
    }
    
    /**
     * Get scalar style of this node.
     *
     * @see org.yaml.snakeyaml.events.ScalarEvent
     * @see <a href="http://yaml.org/spec/1.1/#id903915">Chapter 9. Scalar
     *      Styles</a>
     * @return style of this scalar node
     * @deprecated use getScalarStyle instead
     */
    @Deprecated
    public  Character getStyle() {
        return style.getChar();
    }

    /**
     * Get scalar style of this node.
     *
     * @see org.yaml.snakeyaml.events.ScalarEvent
     * @see <a href="http://yaml.org/spec/1.1/#id903915">Chapter 9. Scalar
     *      Styles</a>
     * @return style of this scalar node
     */
    public DumperOptions.ScalarStyle getScalarStyle() {
        return style;
    }

    @Override
    public NodeId getNodeId() {
        return NodeId.scalar;
    }

    /**
     * Value of this scalar.
     *
     * @return Scalar's value.
     */
    public String getValue() {
        return value;
    }

    public String toString() {
        return "<" + this.getClass().getName() + " (tag=" + getTag() + ", value=" + getValue()
                + ")>";
    }

    public boolean isPlain() {
        return  style == DumperOptions.ScalarStyle.PLAIN;
    }
}
