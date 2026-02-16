package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the end of a mapping node.
 * 
 * @see MappingStartEvent
 */
public final class MappingEndEvent extends CollectionEndEvent {

    public MappingEndEvent(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.MappingEnd == id;
    }
}