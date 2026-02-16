package com.nest.erc.domain.alg.impl;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class AttachStatement extends XmlElement implements XmlConstruct {
	private String state;
	private String recordType;
	private String form;
	
	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setState(attribs.getOrDefault("state",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
		this.setForm(attribs.getOrDefault("form",null));
	}

}
