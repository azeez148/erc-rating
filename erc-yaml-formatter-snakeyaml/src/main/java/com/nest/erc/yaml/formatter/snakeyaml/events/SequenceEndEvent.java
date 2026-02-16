package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the end of a sequence.
 * 
 * @see SequenceStartEvent
 */
public final class SequenceEndEvent extends CollectionEndEvent {

    public SequenceEndEvent(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.SequenceEnd == id;
    }
}