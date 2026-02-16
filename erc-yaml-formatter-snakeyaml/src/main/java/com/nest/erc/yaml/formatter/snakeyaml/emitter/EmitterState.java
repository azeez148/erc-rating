package com.nest.erc.yaml.formatter.snakeyaml.emitter;

import java.io.IOException;

/**
 * Python's methods are first class object. Java needs a class.
 */
interface EmitterState {
    void expect() throws IOException;
}
