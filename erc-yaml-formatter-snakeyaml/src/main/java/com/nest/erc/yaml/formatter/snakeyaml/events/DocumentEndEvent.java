package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the end of a document.
 * <p>
 * This event follows the document's content.
 * </p>
 */
public final class DocumentEndEvent extends Event {
    private final boolean explicit;

    public DocumentEndEvent(Mark startMark, Mark endMark, boolean explicit) {
        super(startMark, endMark);
        this.explicit = explicit;
    }

    public boolean getExplicit() {
        return explicit;
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.DocumentEnd == id;
    }
}