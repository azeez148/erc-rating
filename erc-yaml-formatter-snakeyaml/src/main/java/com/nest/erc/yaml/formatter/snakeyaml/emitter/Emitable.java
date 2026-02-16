package com.nest.erc.yaml.formatter.snakeyaml.emitter;

import java.io.IOException;

import com.nest.erc.yaml.formatter.snakeyaml.events.Event;

public interface Emitable {
    void emit(Event event) throws IOException;
}