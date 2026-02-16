package com.nest.erc.yaml.formatter.snakeyaml.events;


import com.nest.erc.yaml.formatter.snakeyaml.error.Mark;

/**
 * Basic unit of output from a {@link org.yaml.snakeyaml.parser.Parser} or input
 * of a {@link org.yaml.snakeyaml.emitter.Emitter}.
 */
public abstract class Event {
    public enum ID {
        Alias, DocumentEnd, DocumentStart, MappingEnd, MappingStart, Scalar, SequenceEnd, SequenceStart, StreamEnd, StreamStart
    }

    private final Mark startMark;
    private final Mark endMark;

    public Event(Mark startMark, Mark endMark) {
        this.startMark = startMark;
        this.endMark = endMark;
    }

    public String toString() {
        return "<" + this.getClass().getName() + "(" + getArguments() + ")>";
    }

    public Mark getStartMark() {
        return startMark;
    }

    public Mark getEndMark() {
        return endMark;
    }

    /**
     * Generate human readable representation of the Event
     * @see "__repr__ for Event in PyYAML"
     * @return representation fore humans
     */
    protected String getArguments() {
        return "";
    }

    public abstract boolean is(Event.ID id);

    /*
     * for tests only
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Event) {
            return toString().equals(obj.toString());
        } else {
            return false;
        }
    }

    /*
     * for tests only
     */
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
