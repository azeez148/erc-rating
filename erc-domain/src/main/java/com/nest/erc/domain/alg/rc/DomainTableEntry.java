package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class DomainTableEntry implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2976838550008795762L;
	RateBook rateBook;
	String RatebookId;
	String addChangeDeleteFlag;
	String sequence;
	String dataValue ;
	String displayValue;
	String minimumValue;
	String maximumValue;
	HashMap<String, String> domainKeyValues = new HashMap<String,String>();
	
	public RateBook getRateBook() {
		return rateBook;
	}
	public void setRateBook(RateBook rateBook) {
		this.rateBook = rateBook;
	}
	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}
	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public String getDisplayValue() {
		return displayValue;
	}
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}
	public String getMinimumValue() {
		return minimumValue;
	}
	public void setMinimumValue(String minimumValue) {
		this.minimumValue = minimumValue;
	}
	public String getMaximumValue() {
		return maximumValue;
	}
	public void setMaximumValue(String maximumValue) {
		this.maximumValue = maximumValue;
	}
	
	public String getRatebookId() {
		return RatebookId;
	}
	public void setRatebookId(String ratebookId) {
		RatebookId = ratebookId;
	}
	public HashMap<String, String> getDomainKeyValues() {
		return domainKeyValues;
	}
	public void setDomainKeyValues(HashMap<String, String> domainKeyValues) {
		this.domainKeyValues = domainKeyValues;
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
