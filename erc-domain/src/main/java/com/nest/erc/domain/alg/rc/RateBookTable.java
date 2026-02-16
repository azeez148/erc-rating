package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.Table;

public class RateBookTable implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4835984138818702376L;
	String id;
	RateBook ratebook;
	Table table;
	String addChangeDeleteFlag;
	String bureauRuleNumber;
	String comment;
	String tableName;
	String ratebookId;
	String tableId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public RateBook getRatebook() {
		return ratebook;
	}
	public void setRatebook(RateBook ratebook) {
		this.ratebook = ratebook;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}
	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}
	public String getBureauRuleNumber() {
		return bureauRuleNumber;
	}
	public void setBureauRuleNumber(String bureauRuleNumber) {
		this.bureauRuleNumber = bureauRuleNumber;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getRatebookId() {
		return ratebookId;
	}
	public void setRatebookId(String ratebookId) {
		this.ratebookId = ratebookId;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
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
	
	
}
