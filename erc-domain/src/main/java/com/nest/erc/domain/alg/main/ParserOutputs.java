package com.nest.erc.domain.alg.main;

import java.util.Map;

import com.nest.erc.domain.alg.impl.FlowClass;
import com.nest.erc.domain.alg.impl.Lob;

/**
 * Class for storing the outputs from the ALG parser
 * @author
 *
 */
public class ParserOutputs {
	
	Map<String, PojoClassConstruct> classesMap;
	Lob xmlDetails;
	FlowClass flowChart;
	
	public Map<String, PojoClassConstruct> getClassesMap() {
		return classesMap;
	}
	public void setClassesMap(Map<String, PojoClassConstruct> classesMap) {
		this.classesMap = classesMap;
	}
	public Lob getXmlDetails() {
		return xmlDetails;
	}
	public void setXmlDetails(Lob xmlDetails) {
		this.xmlDetails = xmlDetails;
	}
	public FlowClass getFlowChart() {
		return flowChart;
	}
	public void setFlowChart(FlowClass flowChart) {
		this.flowChart = flowChart;
	}

}
