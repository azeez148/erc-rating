package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;

/**
 * Class for storing the information of scope element
 * 
 * @author
 *
 */
public class Scope extends XmlElement implements XmlConstruct {

	private String ruleReference;
	private String recordType;
	private String dbTables;
	private String pass;
	private String state;
	private String inherited;

	List<Pch> pchs;
	private List<RatingExecutable> executables;
	private List<FlowClass> classes;
	private List<AttachStatement> AttachStatements;

	public List<Pch> getPchs() {
		return pchs;
	}

	public void setPchs(List<Pch> pchs) {
		this.pchs = pchs;
	}

	public String getRuleReference() {
		return ruleReference;
	}

	public void setRuleReference(String ruleReference) {
		this.ruleReference = ruleReference;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDbTables() {
		return dbTables;
	}

	public void setDbTables(String dbTables) {
		this.dbTables = dbTables;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Pch getPch(String name) {
		for (Pch pch : pchs) {
			if (pch.getName().equals(name)) {
				return pch;
			}
		}
		return null;
	}

	public void addChildren(XmlConstruct xmlConstruct) {

		if (xmlConstruct instanceof Pch) {
			if (this.getPchs() == null) {
				this.setPchs(new ArrayList<Pch>());
			}
			xmlConstruct.setParent(this);
			this.getPchs().add((Pch) xmlConstruct);
		} else if (xmlConstruct instanceof RatingExecutable) {
			if (this.getExecutables() == null) {
				this.setExecutables(new ArrayList<RatingExecutable>());
			}
			xmlConstruct.setParent(this);
			this.getExecutables().add((RatingExecutable) xmlConstruct);
		}

		else if (xmlConstruct instanceof FlowClass) {
			if (this.getClasses() == null) {
				this.setClasses(new ArrayList<FlowClass>());
			}
			xmlConstruct.setParent(this);
			this.getClasses().add((FlowClass) xmlConstruct);
		} else if (xmlConstruct instanceof AttachStatement) {
			if (this.getAttachStatements() == null) {
				this.setAttachStatements(new ArrayList<AttachStatement>());
			}
			xmlConstruct.setParent(this);
			this.getAttachStatements().add((AttachStatement) xmlConstruct);
		}

	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getInherited() {
		return inherited;
	}

	public void setInherited(String inherited) {
		this.inherited = inherited;
	}

	public List<RatingExecutable> getExecutables() {
		return executables;
	}

	public void setExecutables(List<RatingExecutable> executables) {
		this.executables = executables;
	}

	public List<FlowClass> getClasses() {
		return classes;
	}

	public void setClasses(List<FlowClass> classes) {
		this.classes = classes;
	}

	public List<AttachStatement> getAttachStatements() {
		return AttachStatements;
	}

	public void setAttachStatements(List<AttachStatement> attachStatements) {
		AttachStatements = attachStatements;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setRuleReference(attribs.getOrDefault("ruleReference",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
		this.setDbTables(attribs.getOrDefault("dbTables",null));
		this.setPass(attribs.getOrDefault("pass",null));
		this.setState(attribs.getOrDefault("state",null));
		this.setInherited(attribs.getOrDefault("inherited",null));
	}

}
