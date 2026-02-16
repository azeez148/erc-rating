package com.nest.erc.domain.alg;

import java.util.List;

public class Variable {
	String accessModifier = "private";
	List<String> nonAcessModifiers;
	VariableType variableType;
	String variableName;
	
	public Variable() {
		
	}
	public Variable(String accessModifier,List<String>nonAcessModifiers,VariableType variableType,String variableName) {
		this.accessModifier = accessModifier;
		this.nonAcessModifiers = nonAcessModifiers;
		this.variableType = variableType;
		this.variableName = variableName;
	}
	public String getAccessModifier() {
		return accessModifier;
	}
	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}
	public List<String> getNonAcessModifiers() {
		return nonAcessModifiers;
	}
	public void setNonAcessModifiers(List<String> nonAcessModifiers) {
		this.nonAcessModifiers = nonAcessModifiers;
	}
	public VariableType getVariableType() {
		return variableType;
	}
	public void setVariableType(VariableType variableType) {
		this.variableType = variableType;
	}
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	
}
