package com.nest.erc.domain.alg.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class PojoClassConstruct {
	private String name;
	private boolean isPojo;
	private String variableType;
	private Stack<String> referenceType;
	private String elementType;

	Map<String, PojoClassConstruct> instanceVariableMap;
	PojoClassConstruct parent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPojo() {
		return isPojo;
	}

	public void setPojo(boolean isPojo) {
		this.isPojo = isPojo;
	}

	public String getVariableType() {
		return variableType;
	}

	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}

	public Map<String, PojoClassConstruct> getInstanceVariableMap() {
		return instanceVariableMap;
	}

	public void setInstanceVariableMap(Map<String, PojoClassConstruct> instanceVariableMap) {
		this.instanceVariableMap = instanceVariableMap;
	}

	public PojoClassConstruct getParent() {
		return parent;
	}

	public void setParent(PojoClassConstruct parent) {
		this.parent = parent;
	}

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public Stack<String> getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(Stack<String> referenceType) {
		this.referenceType = referenceType;
	}

	public String getJavaType() {
		Map<String, String> algTypeToJavaType = new HashMap<String, String>();
		algTypeToJavaType.put("LV_DOUBLE", "double");
		algTypeToJavaType.put("LV_INTEGER", "double");
		algTypeToJavaType.put("COLUMN_NUMERIC", "double");
		algTypeToJavaType.put("COLUMN_STRING", "String");
		algTypeToJavaType.put("LV_STRING", "String");
		algTypeToJavaType.put("LV_DATE", "Date");
		algTypeToJavaType.put("LV_TIMESPAN", "Date");
		algTypeToJavaType.put("LV_BOOLEAN", "boolean");
		Set<String> legalVariableType = new HashSet<String>();
		legalVariableType.addAll(Arrays.asList("LV_DOUBLE", "LV_INTEGER", "COLUMN_NUMERIC", "COLUMN_STRING",
				"LV_STRING", "LV_DATE", "LV_TIMESPAN", "LV_BOOLEAN"));
		if (legalVariableType.contains(variableType)) {
			return algTypeToJavaType.get(variableType);
		} else {
			return variableType;
		}

	}

}
