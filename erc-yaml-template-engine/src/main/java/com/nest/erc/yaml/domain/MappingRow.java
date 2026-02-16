package com.nest.erc.yaml.domain;

public class MappingRow {

	private String className;
	private String type;
	private String typeName;
	private String formattedTypeName;
	private String mappedTypeName;
	private int uuid;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getMappedTypeName() {
		return mappedTypeName;
	}
	public void setMappedTypeName(String mappedTypeName) {
		this.mappedTypeName = mappedTypeName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public String getFormattedTypeName() {
		return formattedTypeName;
	}
	public void setFormattedTypeName(String formattedTypeName) {
		this.formattedTypeName = formattedTypeName;
	}
	
	
}
