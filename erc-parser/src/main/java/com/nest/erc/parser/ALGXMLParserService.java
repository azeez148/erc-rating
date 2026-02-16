package com.nest.erc.parser;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;

public interface ALGXMLParserService {
	
	AlgParserOutput parseAlg(String filePath) throws XMLStreamException, FileNotFoundException;

}
