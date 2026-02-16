package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class TableName extends XmlElement implements XmlConstruct {
	private String ruleReference;
	private String name;
	private String foundInLayer;
	private boolean multipleAllowed;
	private boolean hasPremium;
	private List<TableName> TableNames;
	private List<ColumnNode> ColumnNodes;

	public void addChildren(XmlConstruct xmlConstruct) {
		if (xmlConstruct instanceof TableName) {
			if (this.getTableNames() == null) {
				this.setTableNames(new ArrayList<TableName>());
			}
			xmlConstruct.setParent(this);
			this.getTableNames().add((TableName) xmlConstruct);
		} else if (xmlConstruct instanceof ColumnNode) {
			if (this.getColumnNodes() == null) {
				this.setColumnNodes(new ArrayList<ColumnNode>());
			}
			xmlConstruct.setParent(this);
			this.getColumnNodes().add((ColumnNode) xmlConstruct);
		}

	}

	public String getRuleReference() {
		return ruleReference;
	}

	public void setRuleReference(String ruleReference) {
		this.ruleReference = ruleReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoundInLayer() {
		return foundInLayer;
	}

	public void setFoundInLayer(String foundInLayer) {
		this.foundInLayer = foundInLayer;
	}

	public boolean isMultipleAllowed() {
		return multipleAllowed;
	}

	public void setMultipleAllowed(boolean multipleAllowed) {
		this.multipleAllowed = multipleAllowed;
	}

	public boolean isHasPremium() {
		return hasPremium;
	}

	public void setHasPremium(boolean hasPremium) {
		this.hasPremium = hasPremium;
	}

	public List<TableName> getTableNames() {
		return TableNames;
	}

	public void setTableNames(List<TableName> tableNames) {
		TableNames = tableNames;
	}

	public List<ColumnNode> getColumnNodes() {
		return ColumnNodes;
	}

	public void setColumnNodes(List<ColumnNode> columnNodes) {
		ColumnNodes = columnNodes;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setRuleReference(attribs.getOrDefault("ruleReference",null));
		this.setName(attribs.getOrDefault("name",null));
		this.setFoundInLayer(attribs.getOrDefault("foundInLayer",null));
		this.setMultipleAllowed(Boolean.parseBoolean(attribs.getOrDefault("multipleAllowed",null)));
		this.setHasPremium(Boolean.parseBoolean(attribs.getOrDefault("hasPremium",null)));
	}
}
