package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class RateTableEntry implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5919245190578942614L;
	String ratebookId;
	String addChangeDeleteFlag;
	String constant;
	String sequence;
	String code;
	HashMap<String, String> rateTableKeyValues = new HashMap<String,String>();
	
	public String getRatebookId() {
		return ratebookId;
	}
	public void setRatebookId(String ratebookId) {
		this.ratebookId = ratebookId;
	}
	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}
	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}
	public String getConstant() {
		return constant;
	}
	public void setConstant(String constant) {
		this.constant = constant;
	}

	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public HashMap<String, String> getRateTableKeyValues() {
		return rateTableKeyValues;
	}
	public void setRateTableKeyValues(HashMap<String, String> rateTableKeyValues) {
		this.rateTableKeyValues = rateTableKeyValues;
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
