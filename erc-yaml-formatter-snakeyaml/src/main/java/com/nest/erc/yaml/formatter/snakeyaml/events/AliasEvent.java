package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the inclusion of a previously anchored node.
 */
public final class AliasEvent extends NodeEvent {
    public AliasEvent(String anchor, Mark startMark, Mark endMark) {
        super(anchor, startMark, endMark);
        if(anchor == null) throw new NullPointerException();
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.Alias == id;
    }
}
