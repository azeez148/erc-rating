package com.nest.erc.domain.alg;

public class VariableType {
	String name; // string/int/double/List
	String type; // if name is a list then type is type of list
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
	
	public VariableType() {
		
	}
	public VariableType(String name,String type) {
		this.name = name;
		this.type = type;
	}
}
