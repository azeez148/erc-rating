package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

/**
 * Class for storing the Reference element
 * 
 * @author
 *
 */
public class Reference extends XmlElement implements XmlConstruct {
	private String number;
	private String name;
	private String type;
	private String dbTables;
	private String state;
	private String inherited;

	private List<FlowClass> classes;
	private List<Scope> scopes;
	private List<TableName> TableNames;

	public List<Scope> getScopes() {
		return scopes;
	}

	public void setScopes(List<Scope> scopes) {
		this.scopes = scopes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDbTables() {
		return dbTables;
	}

	public void setDbTables(String dbTables) {
		this.dbTables = dbTables;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Scope getScope(String dbTables, String pass) {
		for (Scope scope : scopes) {
			if (scope.getDbTables().equals(dbTables) && scope.getPass().equals(pass)) {
				return scope;
			}
		}
		return null;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if (xmlConstruct instanceof FlowClass) {
			if (this.getClasses() == null) {
				this.setClasses(new ArrayList<FlowClass>());
			}
			xmlConstruct.setParent(this);
			this.getClasses().add((FlowClass) xmlConstruct);
		}
		else if (xmlConstruct instanceof Scope) {
			if (this.getScopes() == null) {
				this.setScopes(new ArrayList<Scope>());
			}
			xmlConstruct.setParent(this);
			this.getScopes().add((Scope) xmlConstruct);
		}
		else if (xmlConstruct instanceof TableName) {
			if (this.getTableNames() == null) {
				this.setTableNames(new ArrayList<TableName>());
			}
			xmlConstruct.setParent(this);
			this.getTableNames().add((TableName) xmlConstruct);
		}

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getInherited() {
		return inherited;
	}

	public void setInherited(String inherited) {
		this.inherited = inherited;
	}

	public List<FlowClass> getClasses() {
		return classes;
	}

	public void setClasses(List<FlowClass> classes) {
		this.classes = classes;
	}

	public List<TableName> getTableNames() {
		return TableNames;
	}

	public void setTableNames(List<TableName> tableNames) {
		TableNames = tableNames;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setNumber(attribs.getOrDefault("number",null));
		this.setName(attribs.getOrDefault("name",null));
		this.setType(attribs.getOrDefault("type",null));
		this.setDbTables(attribs.getOrDefault("dbTables",null));
		this.setState(attribs.getOrDefault("state",null));
		this.setInherited(attribs.getOrDefault("inherited",null));
	}
}
