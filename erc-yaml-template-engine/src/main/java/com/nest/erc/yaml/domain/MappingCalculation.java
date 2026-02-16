package com.nest.erc.yaml.domain;

import java.util.ArrayList;
import java.util.List;

public class MappingCalculation {
	String className;
	List<Calculation> calculations = new ArrayList<Calculation>();
	List<RateTable> rateTables = new ArrayList<RateTable>();
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Calculation> getCalculations() {
		return calculations;
	}
	public void setCalculations(List<Calculation> calculations) {
		this.calculations = calculations;
	}
	public List<RateTable> getRateTables() {
		return rateTables;
	}
	public void setRateTables(List<RateTable> rateTables) {
		this.rateTables = rateTables;
	}
	
}
