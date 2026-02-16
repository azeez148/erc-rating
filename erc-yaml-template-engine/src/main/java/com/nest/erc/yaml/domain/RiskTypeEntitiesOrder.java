package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RiskTypeEntitiesOrder implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9202301392950219777L;
	private List<String> fields;
	private List<String> calculations;
	private List<String> rate_tables;
	private List<String> items;
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public List<String> getCalculations() {
		return calculations;
	}
	public void setCalculations(List<String> calculations) {
		this.calculations = calculations;
	}
	public List<String> getRate_tables() {
		return rate_tables;
	}
	public void setRate_tables(List<String> rate_tables) {
		this.rate_tables = rate_tables;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	
	
}
