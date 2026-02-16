package com.nest.erc.yaml.domain;

public class YAMLObject {

	private YamlBase yamlBase;
	private String name;
	private boolean isStateData;
	private String state;
	
	public YamlBase getYamlBase() {
		return yamlBase;
	}
	public void setYamlBase(YamlBase yamlBase) {
		this.yamlBase = yamlBase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStateData() {
		return isStateData;
	}
	public void setStateData(boolean isStateData) {
		this.isStateData = isStateData;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
