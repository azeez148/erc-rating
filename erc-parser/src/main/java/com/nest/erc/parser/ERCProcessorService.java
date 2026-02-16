package com.nest.erc.parser;

import java.util.Map;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;

public interface ERCProcessorService {

	void processErc(AlgParserOutput algParserOutput, DSWrapper dsWrapper, String lobName);
	ERCProcessorOutput getErcProcessorOutput();
	AlgParserOutput getAlgParserOutput();
	Map<String, PojoClassConstruct> getClassMap();
}
