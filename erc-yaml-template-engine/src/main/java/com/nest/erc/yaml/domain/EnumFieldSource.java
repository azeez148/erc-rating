package com.nest.erc.yaml.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EnumFieldSource implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5297152469165671633L;
	
	private String name;
	private String type;
	private String label_template;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabel_template() {
		return label_template;
	}
	public void setLabel_template(String label_template) {
		this.label_template = label_template;
	}

}
