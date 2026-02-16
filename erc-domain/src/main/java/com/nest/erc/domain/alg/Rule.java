package com.nest.erc.domain.alg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rule {
	String name;
	List<Variable> variableList = new ArrayList<Variable>();
	Map<String,Variable>variableMap = new HashMap<String,Variable>();
	List<Method> methodList = new ArrayList<Method>();
	List<Rule> subRules  = new ArrayList<Rule>();
	Rule parent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Method> getMethodList() {
		return methodList;
	}

	public void setMethodList(List<Method> methodList) {
		this.methodList = methodList;
	}

	public List<Rule> getSubRules() {
		return subRules;
	}

	public void setSubRules(List<Rule> subRules) {
		this.subRules = subRules;
	}

	public List<Variable> getVariableList() {
		return variableList;
	}

	public void setVariableList(List<Variable> variableList) {
		this.variableList = variableList;
	}

	public Map<String, Variable> getVariableMap() {
		return variableMap;
	}

	public void setVariableMap(Map<String, Variable> variableMap) {
		this.variableMap = variableMap;
	}

	public Rule getParent() {
		return parent;
	}

	public void setParent(Rule parent) {
		this.parent = parent;
	}
	
	
}
