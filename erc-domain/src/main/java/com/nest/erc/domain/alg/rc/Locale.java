package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class Locale implements XmlConstruct, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1473656972722278546L;
	String id;
	String ratebookId;
	String addChangeDeleteFlag;
	String code;
	String name;
	
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
	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}
	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
