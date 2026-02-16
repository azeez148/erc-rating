package com.nest.erc.domain.alg.re.constructs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "directChildClasses", "parent"})
public class PojoClassConstruct {
	private String name;
	//private Stack<String> referenceType;

	Map<String, PojoVariablesConstruct> instanceVariableMap;
	List<PojoClassConstruct> directChildClasses;
	PojoClassConstruct parent;
	
	public PojoClassConstruct(){
	}
	public PojoClassConstruct(String name){
		this.name = name;
	}
	public PojoClassConstruct(String name,Map<String, PojoVariablesConstruct> instanceVariableMap,List<PojoClassConstruct> directChildClasses,PojoClassConstruct parent){
		this.name = name;
		this.instanceVariableMap = instanceVariableMap;
		this.directChildClasses = directChildClasses;
		this.parent = parent;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PojoClassConstruct getParent() {
		return parent;
	}

	public void setParent(PojoClassConstruct parent) {
		this.parent = parent;
	}

	/*
	public Stack<String> getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(Stack<String> referenceType) {
		this.referenceType = referenceType;
	}
	*/

	public Map<String, PojoVariablesConstruct> getInstanceVariableMap() {
		return instanceVariableMap;
	}

	public void setInstanceVariableMap(Map<String, PojoVariablesConstruct> instanceVariableMap) {
		this.instanceVariableMap = instanceVariableMap;
	}
	
	public void addInstanceVariable(PojoVariablesConstruct variable) {
		if(instanceVariableMap == null) {
			instanceVariableMap = new HashMap<String, PojoVariablesConstruct>();
		}
		instanceVariableMap.put(variable.getVariableName(), variable);
	}

	
	public void addDirectChild(PojoClassConstruct child) {
		if(directChildClasses == null) {
			directChildClasses = new ArrayList<PojoClassConstruct>();
		}
		directChildClasses.add(child);
	}

	public List<PojoClassConstruct> getDirectChildClasses() {
		return directChildClasses;
	}

	public void setDirectChildClasses(List<PojoClassConstruct> directChildClasses) {
		this.directChildClasses = directChildClasses;
	}

	

}
