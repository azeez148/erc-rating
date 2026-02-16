package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Base class for the end events of the collection nodes.
 */
public abstract class CollectionEndEvent extends Event {

    public CollectionEndEvent(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }
}