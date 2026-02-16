package com.nest.erc.domain.rule.domain;

import java.util.ArrayList;
import java.util.List;

public class Rule {
	String name;
	List<Method> methodList = new ArrayList<Method>();

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
	
}
