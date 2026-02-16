package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RateTable implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7236306162747841091L;
	
	private String name;
	private String label;
	private List<RateTableSource> sources;
	private String data_file;
	private String defaultValue;
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
	public List<RateTableSource> getSources() {
		return sources;
	}
	public void setSources(List<RateTableSource> sources) {
		this.sources = sources;
	}
	public String getData_file() {
		return data_file;
	}
	public void setData_file(String data_file) {
		this.data_file = data_file;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	
	
}
