package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.DumperOptions;
import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the beginning of a sequence node.
 * <p>
 * This event is followed by the elements contained in the sequence, and a
 * {@link SequenceEndEvent}.
 * </p>
 * 
 * @see SequenceEndEvent
 */
public final class SequenceStartEvent extends CollectionStartEvent {
    public SequenceStartEvent(String anchor, String tag, boolean implicit, Mark startMark,
            Mark endMark, DumperOptions.FlowStyle flowStyle) {
        super(anchor, tag, implicit, startMark, endMark, flowStyle);
    }

    /*
     * Existed in older versions but replaced with {@link DumperOptions.SequenceStyle}-based constructor.
     * Restored in v1.22 for backwards compatibility.
     * @deprecated Since restored in v1.22.  Use {@link SequenceStartEvent#SequenceStartEvent(String, String, boolean, Mark, Mark, org.yaml.snakeyaml.DumperOptions.FlowStyle) }.
     */
    @Deprecated
    public SequenceStartEvent(String anchor, String tag, boolean implicit, Mark startMark,
            Mark endMark, Boolean flowStyle) {
        this(anchor, tag, implicit, startMark, endMark, DumperOptions.FlowStyle.fromBoolean(flowStyle));
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.SequenceStart == id;
    }
}