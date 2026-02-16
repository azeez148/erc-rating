package com.nest.erc.parser;

import com.nest.erc.domain.alg.ds.DSWrapper;

public interface DSXmlParserService {

	DSWrapper parseXML(String dsfileName);
}
