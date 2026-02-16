package com.nest.erc.domain.alg.ds;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class DSWrapper implements XmlConstruct {
	Tables Tables;
	

	public Tables getTables() {
		return Tables;
	}


	public void setTables(Tables tables) {
		Tables = tables;
	}


	public void addChildren(XmlConstruct xmlConstruct) {
		this.setTables((Tables)xmlConstruct);
		
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
