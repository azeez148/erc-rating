package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Base class for all events that mark the beginning of a node.
 */
public abstract class NodeEvent extends Event {

    private final String anchor;

    public NodeEvent(String anchor, Mark startMark, Mark endMark) {
        super(startMark, endMark);
        this.anchor = anchor;
    }

    /**
     * Node anchor by which this node might later be referenced by a
     * {@link AliasEvent}.
     * <p>
     * Note that {@link AliasEvent}s are by it self <code>NodeEvent</code>s and
     * use this property to indicate the referenced anchor.
     * 
     * @return Anchor of this node or <code>null</code> if no anchor is defined.
     */
    public String getAnchor() {
        return this.anchor;
    }

    @Override
    protected String getArguments() {
        return "anchor=" + anchor;
    }
}

