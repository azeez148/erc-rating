package com.nest.erc.domain;

import java.util.Map;

import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.rc.RCWrapper;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;

public class ERCProcessorOutput {
	
	Map<String, PojoClassConstruct> classesMap;
	Map<String, Map<String, PojoClassConstruct>> classesMaps;
	private Map<String,AlgParserOutput> algParserOutputs;
	private ERCProcessorOutput ercProcessorOutput;
	private DSWrapper dsWrapper;
	private Map<String,RCWrapper> rcWrappers;
	private AvailableLOBCoverage availableLOBCoverage;
	private CommonConfig commonConfig;
	private String version;

	public AvailableLOBCoverage getAvailableLOBCoverage() {
		return availableLOBCoverage;
	}

	public void setAvailableLOBCoverage(AvailableLOBCoverage availableLOBCoverage) {
		this.availableLOBCoverage = availableLOBCoverage;
	}
	
	public Map<String, AlgParserOutput> getAlgParserOutputs() {
		return algParserOutputs;
	}

	public void setAlgParserOutputs(Map<String, AlgParserOutput> algParserOutputs) {
		this.algParserOutputs = algParserOutputs;
	}

	public ERCProcessorOutput getErcProcessorOutput() {
		return ercProcessorOutput;
	}

	public void setErcProcessorOutput(ERCProcessorOutput ercProcessorOutput) {
		this.ercProcessorOutput = ercProcessorOutput;
	}

	public DSWrapper getDsWrapper() {
		return dsWrapper;
	}

	public void setDsWrapper(DSWrapper dsWrapper) {
		this.dsWrapper = dsWrapper;
	}

	public Map<String, RCWrapper> getRcWrappers() {
		return rcWrappers;
	}

	public void setRcWrappers(Map<String, RCWrapper> rcWrappers) {
		this.rcWrappers = rcWrappers;
	}

	public Map<String, PojoClassConstruct> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(Map<String, PojoClassConstruct> classesMap) {
		this.classesMap = classesMap;
	}

	public CommonConfig getCommonConfig() {
		return commonConfig;
	}

	public void setCommonConfig(CommonConfig commonConfig) {
		this.commonConfig = commonConfig;
	}

	public Map<String, Map<String, PojoClassConstruct>> getClassesMaps() {
		return classesMaps;
	}

	public void setClassesMaps(Map<String, Map<String, PojoClassConstruct>> classesMaps) {
		this.classesMaps = classesMaps;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}
