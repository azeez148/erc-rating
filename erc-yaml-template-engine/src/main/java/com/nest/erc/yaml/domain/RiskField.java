package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RiskField implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7571291956490432234L;
	private String name;
	private String label;
	private String type;
	private String field_format;
	private String description;
	private ArrayList<EnumFieldOption> options;
	private EnumFieldSource source;
	private String calculation;
	@JsonProperty("default")
	private String defaultValue;
	private boolean supplemental;
	private boolean optional;
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
	public String getField_format() {
		return field_format;
	}
	public void setField_format(String field_format) {
		this.field_format = field_format;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<EnumFieldOption> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<EnumFieldOption> options) {
		this.options = options;
	}
	public EnumFieldSource getSource() {
		return source;
	}
	public void setSource(EnumFieldSource source) {
		this.source = source;
	}
	public String getCalculation() {
		return calculation;
	}
	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public boolean isSupplemental() {
		return supplemental;
	}
	public void setSupplemental(boolean supplemental) {
		this.supplemental = supplemental;
	}
	public boolean isOptional() {
		return optional;
	}
	public void setOptional(boolean optional) {
		this.optional = optional;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


}
