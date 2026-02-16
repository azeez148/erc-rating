package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class Forms implements XmlConstruct, Serializable {
	Form form;

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		this.setForm((Form)xmlConstruct);
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
