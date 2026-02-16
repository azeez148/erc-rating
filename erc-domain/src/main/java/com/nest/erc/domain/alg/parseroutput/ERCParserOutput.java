package com.nest.erc.domain.alg.parseroutput;

import java.util.Map;

import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;

public class ERCParserOutput {
	private Map<String, PojoClassConstruct> pojoClassMap;
	
	private AlgParserOutput algParserOutput;

	public Map<String, PojoClassConstruct> getPojoClassMap() {
		return pojoClassMap;
	}

	public void setPojoClassMap(Map<String, PojoClassConstruct> pojoClassMap) {
		this.pojoClassMap = pojoClassMap;
	}

	public AlgParserOutput getAlgParserOutput() {
		return algParserOutput;
	}

	public void setAlgParserOutput(AlgParserOutput algParserOutput) {
		this.algParserOutput = algParserOutput;
	}
}
