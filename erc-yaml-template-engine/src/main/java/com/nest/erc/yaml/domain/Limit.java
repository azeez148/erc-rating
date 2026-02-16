package com.nest.erc.yaml.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Limit implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8700620985550497396L;
	
	private String name;
	private String label;
	private String type;
	private Calculation calculation;
	private boolean deleted;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Calculation getCalculation() {
		return calculation;
	}
	public void setCalculation(Calculation calculation) {
		this.calculation = calculation;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	
	
}
