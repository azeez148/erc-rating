package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
/**
 * Class for storing the else part
 * @author
 *
 */
public class ElsePart extends XmlElement implements XmlConstruct, HasExecutable{
	private String state;
	private String recordType;
	private String excelSheet;
	private int excelRow;

	private List<RatingExecutable> statementsInElse;
	private List<AttachStatement> AttachStatements;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<RatingExecutable> getStatementsInElse() {
		return statementsInElse;
	}
	public void setStatementsInElse(List<RatingExecutable> statementsInElse) {
		this.statementsInElse = statementsInElse;
	}
		

	public  void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RatingExecutable) {
		if (this.getStatementsInElse() == null) {
			this.setStatementsInElse(new ArrayList<RatingExecutable>());
		}
		xmlConstruct.setParent(this);
		this.getStatementsInElse().add((RatingExecutable)xmlConstruct);
		}
		
		if(xmlConstruct instanceof AttachStatement) {
			if (this.getAttachStatements() == null) {
				this.setAttachStatements(new ArrayList<AttachStatement>());
			}
			xmlConstruct.setParent(this);
			this.getAttachStatements().add((AttachStatement)xmlConstruct);
		}
		
		/*
		if(this.getStatementsInElse().size() > 0) {
			xmlConstruct.setPreviousSibling((XmlConstruct)this.getStatementsInElse().get(this.getStatementsInElse().size()-1));
			this.getStatementsInElse().get(this.getStatementsInElse().size()-1).setNextSibling(xmlConstruct);
		}
		*/
		
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
	public List<AttachStatement> getAttachStatements() {
		return AttachStatements;
	}
	public void setAttachStatements(List<AttachStatement> attachStatements) {
		AttachStatements = attachStatements;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setState(attribs.getOrDefault("state",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
		this.setExcelSheet(attribs.getOrDefault("excelSheet",null));
		this.setExcelRow(Integer.parseInt(attribs.getOrDefault("excelRow",null)));
	}
	public List<RatingExecutable> getExecutables() {
		// TODO Auto-generated method stub
		return statementsInElse;
	}
	
	

}
