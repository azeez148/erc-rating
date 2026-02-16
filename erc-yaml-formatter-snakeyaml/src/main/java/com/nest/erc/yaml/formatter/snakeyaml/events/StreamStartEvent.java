package com.nest.erc.yaml.formatter.snakeyaml.events;

import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Marks the start of a stream that might contain multiple documents.
 * <p>
 * This event is the first event that a parser emits. Together with
 * {@link StreamEndEvent} (which is the last event a parser emits) they mark the
 * beginning and the end of a stream of documents.
 * </p>
 * <p>
 * See {@link Event} for an exemplary output.
 * </p>
 */
public final class StreamStartEvent extends Event {

    public StreamStartEvent(Mark startMark, Mark endMark) {
        super(startMark, endMark);
    }

    @Override
    public boolean is(Event.ID id) {
        return ID.StreamStart == id;
    }
}