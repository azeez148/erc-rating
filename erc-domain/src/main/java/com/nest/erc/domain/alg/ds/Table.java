package com.nest.erc.domain.alg.ds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class Table implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7120424467502942034L;
	String id;
	String name;
    String description;
    String comment;
    String type;
    String parentTableName;
    Integer overridePremium;
    List<Column> columnList;
    List<Tables> tablesList;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getOverridePremium() {
		return overridePremium;
	}
	public void setOverridePremium(Integer overridePremium) {
		this.overridePremium = overridePremium;
	}
	public List<Column> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}
	public List<Tables> getTablesList() {
		return tablesList;
	}
	public void setTablesList(List<Tables> tablesList) {
		this.tablesList = tablesList;
	}
	
	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof Column){
			if (this.getColumnList()== null) {
				this.setColumnList(new ArrayList<Column>());
			}
			xmlConstruct.setParent(this);
			this.getColumnList().add((Column)xmlConstruct);
		}
		if(xmlConstruct instanceof Tables){
			if (this.getTablesList()== null) {
				this.setTablesList(new ArrayList<Tables>());
			}
			xmlConstruct.setParent(this);
			this.getTablesList().add((Tables)xmlConstruct);
		}
		
	}
	public String getCharacterContent() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCharacterContent(String characterContent) {
		// TODO Auto-generated method stub
		
	}
	public XmlConstruct getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setParent(XmlConstruct parent) {
		// TODO Auto-generated method stub
		
	}
	public String getElementName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setElementName(String elementName) {
		// TODO Auto-generated method stub
		
	}
	public XmlConstruct getPreviousSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public XmlConstruct getNextSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPreviousSibling(XmlConstruct previousSibling) {
		// TODO Auto-generated method stub
		
	}
	public void setNextSibling(XmlConstruct nextSibling) {
		// TODO Auto-generated method stub
		
	}
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		// TODO Auto-generated method stub
		
	}
	public XmlConstruct getPreviousSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public XmlConstruct getNextSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParentTableName() {
		return parentTableName;
	}
	public void setParentTableName(String parentTableName) {
		this.parentTableName = parentTableName;
	}
    
}
