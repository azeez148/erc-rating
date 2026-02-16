package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Product implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6579528305995778414L;
	private String name;
	private String label;
	private ArrayList<Lines> lines;
	private RiskType risk_type;
	private ArrayList<String> children;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public ArrayList<Lines> getLines() {
		return lines;
	}
	public void setLines(ArrayList<Lines> lines) {
		this.lines = lines;
	}	
	public ArrayList<String> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<String> children) {
		this.children = children;
	}
	public RiskType getRisk_type() {
		return risk_type;
	}
	public void setRisk_type(RiskType risk_type) {
		this.risk_type = risk_type;
	}
	

	
}
