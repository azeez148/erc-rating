package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the end of a stream that might have contained multiple documents.
 * <p>
 * This event is the last event that a parser emits. Together with
 * {@link StreamStartEvent} (which is the first event a parser emits) they mark
 * the beginning and the end of a stream of documents.
 * </p>
 * <p>
 * See {@link Event} for an exemplary output.
 * </p>
 */
public final class StreamEndEvent extends Event {
    public StreamEndEvent(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.StreamEnd == id;
    }
}