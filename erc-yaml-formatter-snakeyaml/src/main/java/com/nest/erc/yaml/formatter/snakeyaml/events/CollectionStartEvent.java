package com.nest.erc.yaml.formatter.snakeyaml.events;


import com.nest.erc.yaml.formatter.snakeyaml.DumperOptions;
import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Base class for the start events of the collection nodes.
 */
public abstract class CollectionStartEvent extends NodeEvent {
    private final String tag;
    // The implicit flag of a collection start event indicates if the tag may be
    // omitted when the collection is emitted
    private final boolean implicit;
    // flag indicates if a collection is block or flow
    private final DumperOptions.FlowStyle flowStyle;

    public CollectionStartEvent(String anchor, String tag, boolean implicit, Mark startMark,
            Mark endMark, DumperOptions.FlowStyle flowStyle) {
        super(anchor, startMark, endMark);
        this.tag = tag;
        this.implicit = implicit;
        if(flowStyle == null) throw new NullPointerException("Flow style must be provided.");
        this.flowStyle = flowStyle;
    }
    
    /*
     * Existed in older versions but replaced with {@link DumperOptions.FlowStyle}-based constructor.
     * Restored in v1.22 for backwards compatibility.
     * @deprecated Since restored in v1.22.  Use {@link CollectionStartEvent#CollectionStartEvent(String, String, boolean, Mark, Mark, org.yaml.snakeyaml.DumperOptions.FlowStyle) }.
     */
    @Deprecated
    public CollectionStartEvent(String anchor, String tag, boolean implicit, Mark startMark, 
            Mark endMark, Boolean flowStyle) {
        this(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.fromBoolean(flowStyle));
    }

    /**
     * Tag of this collection.
     * 
     * @return The tag of this collection, or <code>null</code> if no explicit
     *         tag is available.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * <code>true</code> if the tag can be omitted while this collection is
     * emitted.
     * 
     * @return True if the tag can be omitted while this collection is emitted.
     */
    public boolean getImplicit() {
        return this.implicit;
    }

    /**
     * <code>true</code> if this collection is in flow style, <code>false</code>
     * for block style.
     * 
     * @return If this collection is in flow style.
     */
    public DumperOptions.FlowStyle getFlowStyle() {
        return this.flowStyle;
    }

    @Override
    protected String getArguments() {
        return super.getArguments() + ", tag=" + tag + ", implicit=" + implicit;
    }

    public boolean isFlow() {
        return DumperOptions.FlowStyle.FLOW == flowStyle;
    }
}

