package com.nest.erc.domain;

import java.util.HashMap;
import java.util.Map;

public class DependencyDetails {
	Map<String,DependencyDetail> dependencyDetailMap = new HashMap<String,DependencyDetail>();

	public Map<String, DependencyDetail> getDependencyDetailMap() {
		return dependencyDetailMap;
	}

	public void setDependencyDetailMap(Map<String, DependencyDetail> dependencyDetailMap) {
		this.dependencyDetailMap = dependencyDetailMap;
	}
	
}
