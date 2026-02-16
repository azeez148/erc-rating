package com.nest.erc.yaml.formatter.snakeyaml.parser;

import com.nest.erc.yaml.formatter.snakeyaml.events.Event;

/**
 * Helper for {@link ParserImpl}. A grammar rule to apply given the symbols on
 * top of its stack and the next input token
 * 
 * @see <a href="http://en.wikipedia.org/wiki/LL_parser"></a>
 */
interface Production {
    Event produce();
}

