package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RateTableSource implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4005466195594382433L;
	private String name;
	private List<String> tier_values;
	private String resolution;
	private RateTableSourceSubField sub_field;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTier_values() {
		return tier_values;
	}
	public void setTier_values(List<String> tier_values) {
		this.tier_values = tier_values;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public RateTableSourceSubField getSub_field() {
		return sub_field;
	}
	public void setSub_field(RateTableSourceSubField sub_field) {
		this.sub_field = sub_field;
	}

}
