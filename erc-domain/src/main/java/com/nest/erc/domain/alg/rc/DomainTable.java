package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class DomainTable implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4163772475181342826L;
	String id;
	String RatebookId;
	String tableId;
	String name;
	String title;
	String type;
	String bureauRuleNumber;
	String comment;
	String assemblyName;
	String assemblyType;
	String assemblyMethod;
	String xmlType;
	String WorkbookId;
	String maskingTable;
	List<DomainTableKey> domainTableKeyList;
	List<DomainTableValue> domainTableValueList;
	List<DomainTableEntry> domainTableEntryList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getAssemblyName() {
		return assemblyName;
	}
	public void setAssemblyName(String assemblyName) {
		this.assemblyName = assemblyName;
	}
	public String getAssemblyType() {
		return assemblyType;
	}
	public void setAssemblyType(String assemblyType) {
		this.assemblyType = assemblyType;
	}
	public String getAssemblyMethod() {
		return assemblyMethod;
	}
	public void setAssemblyMethod(String assemblyMethod) {
		this.assemblyMethod = assemblyMethod;
	}
	public String getXmlType() {
		return xmlType;
	}
	public void setXmlType(String xmlType) {
		this.xmlType = xmlType;
	}
	public String getMaskingTable() {
		return maskingTable;
	}
	public void setMaskingTable(String maskingTable) {
		this.maskingTable = maskingTable;
	}
	public List<DomainTableKey> getDomainTableKeyList() {
		return domainTableKeyList;
	}
	public void setDomainTableKeyList(List<DomainTableKey> domainTableKeyList) {
		this.domainTableKeyList = domainTableKeyList;
	}
	public List<DomainTableValue> getDomainTableValueList() {
		return domainTableValueList;
	}
	public void setDomainTableValueList(List<DomainTableValue> domainTableValueList) {
		this.domainTableValueList = domainTableValueList;
	}
	public List<DomainTableEntry> getDomainTableEntryList() {
		return domainTableEntryList;
	}
	public void setDomainTableEntryList(List<DomainTableEntry> domainTableEntryList) {
		this.domainTableEntryList = domainTableEntryList;
	}
	public String getRatebookId() {
		return RatebookId;
	}
	public void setRatebookId(String ratebookId) {
		RatebookId = ratebookId;
	}
	public String getWorkbookId() {
		return WorkbookId;
	}
	public void setWorkbookId(String workbookId) {
		WorkbookId = workbookId;
	}
	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof DomainTableKey){
			if (this.getDomainTableKeyList()== null) {
				this.setDomainTableKeyList(new ArrayList<DomainTableKey>());
			}
			xmlConstruct.setParent(this);
			this.getDomainTableKeyList().add((DomainTableKey)xmlConstruct);
		}
		if(xmlConstruct instanceof DomainTableValue){
			if (this.getDomainTableValueList()== null) {
				this.setDomainTableValueList(new ArrayList<DomainTableValue>());
			}
			xmlConstruct.setParent(this);
			this.getDomainTableValueList().add((DomainTableValue)xmlConstruct);
		}
		if(xmlConstruct instanceof DomainTableEntry){
			if (this.getDomainTableEntryList()== null) {
				this.setDomainTableEntryList(new ArrayList<DomainTableEntry>());
			}
			xmlConstruct.setParent(this);
			this.getDomainTableEntryList().add((DomainTableEntry)xmlConstruct);
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
