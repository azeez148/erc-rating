package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;



public class RateTable implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3621512310510824247L;
	String id;
	RateBook rateBook;
	String ratebookId;
	String tableId;
	String name;
	String title;
	String bureauRuleNumber;
	String comment;
	String workbookId;
	String maskingTable;
	List<RateTableKey> rateTableKeyList;
	List<RateTableValue> rateTableValueList;
	List<RateTableEntry> rateTableEntryList;
	// this field not in RC it is added for convenice . if all rate table entry is deleted then this field is set to D.
	String addChangeDeleteFlag; 
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRatebookId() {
		return ratebookId;
	}
	public void setRatebookId(String ratebookId) {
		this.ratebookId = ratebookId;
	}
	public RateBook getRateBook() {
		return rateBook;
	}
	public void setRateBook(RateBook rateBook) {
		this.rateBook = rateBook;
	}
	
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getWorkbookId() {
		return workbookId;
	}
	public void setWorkbookId(String workbookId) {
		this.workbookId = workbookId;
	}
	public String getMaskingTable() {
		return maskingTable;
	}
	public void setMaskingTable(String maskingTable) {
		this.maskingTable = maskingTable;
	}
	public List<RateTableKey> getRateTableKeyList() {
		return rateTableKeyList;
	}
	public void setRateTableKeyList(List<RateTableKey> rateTableKeyList) {
		this.rateTableKeyList = rateTableKeyList;
	}
	public List<RateTableValue> getRateTableValueList() {
		return rateTableValueList;
	}
	public void setRateTableValueList(List<RateTableValue> rateTableValueList) {
		this.rateTableValueList = rateTableValueList;
	}
	public List<RateTableEntry> getRateTableEntryList() {
		return rateTableEntryList;
	}
	public void setRateTableEntryList(List<RateTableEntry> rateTableEntryList) {
		this.rateTableEntryList = rateTableEntryList;
	}
	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}
	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}
	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RateTableKey){
			if (this.getRateTableKeyList()== null) {
				this.setRateTableKeyList(new ArrayList<RateTableKey>());
			}
			xmlConstruct.setParent(this);
			this.getRateTableKeyList().add((RateTableKey)xmlConstruct);
		}
		if(xmlConstruct instanceof RateTableValue){
			if (this.getRateTableValueList()== null) {
				this.setRateTableValueList(new ArrayList<RateTableValue>());
			}
			xmlConstruct.setParent(this);
			this.getRateTableValueList().add((RateTableValue)xmlConstruct);
		}
		if(xmlConstruct instanceof RateTableEntry){
			if (this.getRateTableEntryList()== null) {
				this.setRateTableEntryList(new ArrayList<RateTableEntry>());
			}
			xmlConstruct.setParent(this);
			this.getRateTableEntryList().add((RateTableEntry)xmlConstruct);
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
	
	
}
