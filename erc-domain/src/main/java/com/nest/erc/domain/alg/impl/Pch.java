package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;

/**
 * Class for storing the information of PCH elements
 * @author 
 *
 */
public class Pch extends XmlElement implements HasExecutable{
	private String state;
	private String number;
	private String name;
	private String recordType;
	private String excelSheet;
	private int excelRow;
	private String overridden;
	
	private List<RatingExecutable> executables;
	private List<FlowClass> classes;
	private List<AttachStatement> AttachStatements;
	private List<OptOutForm> OptOutForms;
	private ThenPart thenPart;
	private ElsePart elsePart;
	
	public List<RatingExecutable> getExecutables() {
		return executables;
	}

	public void setExecutables(List<RatingExecutable> executables) {
		this.executables = executables;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		

	public  void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RatingExecutable) {
			if (this.getExecutables() == null) {
				this.setExecutables(new ArrayList<RatingExecutable>());
			}
			xmlConstruct.setParent(this);
			this.getExecutables().add((RatingExecutable)xmlConstruct);
		}
		
		
		if(xmlConstruct instanceof FlowClass) {
			if (this.getClasses() == null) {
				this.setClasses(new ArrayList<FlowClass>());
			}
			xmlConstruct.setParent(this);
			this.getClasses().add((FlowClass)xmlConstruct);
		}
		if(xmlConstruct instanceof AttachStatement) {
			if (this.getAttachStatements() == null) {
				this.setAttachStatements(new ArrayList<AttachStatement>());
			}
			xmlConstruct.setParent(this);
			this.getAttachStatements().add((AttachStatement)xmlConstruct);
		}
if(xmlConstruct instanceof OptOutForm) {
			if (this.getOptOutForms() == null) {
				this.setOptOutForms(new ArrayList<OptOutForm>());
			}
			xmlConstruct.setParent(this);
			this.getOptOutForms().add((OptOutForm)xmlConstruct);
		}
if(xmlConstruct instanceof ThenPart) {
	this.setThenPart((ThenPart)xmlConstruct);
	xmlConstruct.setParent(this);
		}
if(xmlConstruct instanceof ElsePart) {
	this.setElsePart((ElsePart)xmlConstruct);
	xmlConstruct.setParent(this);
	
		}
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getExcelSheet() {
		return excelSheet;
	}

	public void setExcelSheet(String excelSheet) {
		this.excelSheet = excelSheet;
	}

	public int getExcelRow() {
		return excelRow;
	}

	public void setExcelRow(int excelRow) {
		this.excelRow = excelRow;
	}

	public String getOverridden() {
		return overridden;
	}

	public void setOverridden(String overridden) {
		this.overridden = overridden;
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

	public List<OptOutForm> getOptOutForms() {
		return OptOutForms;
	}

	public void setOptOutForms(List<OptOutForm> optOutForms) {
		OptOutForms = optOutForms;
	}

	public ThenPart getThenPart() {
		return thenPart;
	}

	public void setThenPart(ThenPart thenPart) {
		this.thenPart = thenPart;
	}

	public ElsePart getElsePart() {
		return elsePart;
	}

	public void setElsePart(ElsePart elsePart) {
		this.elsePart = elsePart;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setState(attribs.getOrDefault("state",null));
		this.setNumber(attribs.getOrDefault("number",null));
		this.setName(attribs.getOrDefault("name",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
		this.setExcelSheet(attribs.getOrDefault("excelSheet",null));
		this.setExcelRow(Integer.parseInt(attribs.getOrDefault("excelRow",null)));
		this.setOverridden(attribs.getOrDefault("overridden",null));
	}

}
