package com.nest.erc.yaml.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RateTableSourceSubField implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6661658421757362941L;
	private String name;
	private String risk_type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRisk_type() {
		return risk_type;
	}
	public void setRisk_type(String risk_type) {
		this.risk_type = risk_type;
	}
	
}
