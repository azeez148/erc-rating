package com.nest.erc.domain.alg.re.constructs.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PojoVariablesConstruct {
	String variableName;
	String variableType;
	String additionalDataStructure;
	String dsVariableType;
	
	public String getJavaType() {
		Map<String, String> algTypeToJavaType = new HashMap<String, String>();
		algTypeToJavaType.put("LV_DOUBLE", "double");
		algTypeToJavaType.put("LV_INTEGER", "int");
		algTypeToJavaType.put("COLUMN_NUMERIC", "double");
		algTypeToJavaType.put("COLUMN_STRING", "String");
		algTypeToJavaType.put("LV_STRING", "String");
		algTypeToJavaType.put("LV_DATE", "Date");
		algTypeToJavaType.put("LV_TIMESPAN", "long");
		algTypeToJavaType.put("LV_BOOLEAN", "boolean");
		algTypeToJavaType.put("XPATH_STRING", "String");
		algTypeToJavaType.put("XPATH_DATE", "Date");
		algTypeToJavaType.put("XPATH_NUMERIC", "double");
		
		
		Map<String, String> dcTypeToJavaType = new HashMap<String, String>();
		dcTypeToJavaType.put("varbinary", "String");
		dcTypeToJavaType.put("datetime", "Date");
		dcTypeToJavaType.put("nvarchar", "String");
		dcTypeToJavaType.put("nchar", "String");
		dcTypeToJavaType.put("uniqueidentifier", "String");
		dcTypeToJavaType.put("integer", "int");
		dcTypeToJavaType.put("decimal", "double");
		dcTypeToJavaType.put("float", "double");
		dcTypeToJavaType.put("int", "int");
		
		Set<String> legalVariableType = new HashSet<String>();
		legalVariableType.addAll(Arrays.asList("LV_DOUBLE", "LV_INTEGER", "COLUMN_NUMERIC", "COLUMN_STRING",
				"LV_STRING", "LV_DATE", "LV_TIMESPAN", "LV_BOOLEAN","XPATH_STRING","XPATH_DATE","XPATH_NUMERIC"));
		if(dsVariableType != null && dsVariableType.length()>0) {
			return dcTypeToJavaType.get(dsVariableType);
		}else {
			if (legalVariableType.contains(variableType)) {
				return algTypeToJavaType.get(variableType);
			}else {
//				if(null!= variableType && variableType.equals("XPATH_NUMERIC")){
//					System.out.println("herte");
//				}
//				if(null!=variableType && variableType.equals("XPATH_STRING|XPATH|XPATH_NUMERIC")){
//					return null;
//				}
				return variableType;
			}
			
		}

	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getVariableType() {
		return variableType;
	}

	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}

	public String getAdditionalDataStructure() {
		return additionalDataStructure;
	}

	public void setAdditionalDataStructure(String additionalDataStructure) {
		this.additionalDataStructure = additionalDataStructure;
	}


	public String getDsVariableType() {
		return dsVariableType;
	}

	public void setDsVariableType(String dsVariableType) {
		this.dsVariableType = dsVariableType;
	}
}
