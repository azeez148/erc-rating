package com.nest.erc.domain.alg.re.constructs.impl;

import com.nest.erc.domain.alg.impl.Lob;
import com.nest.erc.domain.alg.impl.Reference;

public class AlgParserOutput {
	Lob xmlDetails;
	Reference flowChart;
	Reference tables;
	
	public Lob getXmlDetails() {
		return xmlDetails;
	}
	public void setXmlDetails(Lob xmlDetails) {
		this.xmlDetails = xmlDetails;
	}
	public Reference getFlowChart() {
		return flowChart;
	}
	public void setFlowChart(Reference flowChart) {
		this.flowChart = flowChart;
	}
	public Reference getTables() {
		return tables;
	}
	public void setTables(Reference tables) {
		this.tables = tables;
	} 

}
