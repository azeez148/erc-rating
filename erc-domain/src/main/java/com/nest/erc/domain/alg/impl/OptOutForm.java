package com.nest.erc.domain.alg.impl;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class OptOutForm extends XmlElement implements XmlConstruct{
	private String OptOut;
	private String Key;
	private String FormNumber;
	private String state;
	private String FormName;
	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}
	public String getOptOut() {
		return OptOut;
	}
	public void setOptOut(String optOut) {
		OptOut = optOut;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getFormNumber() {
		return FormNumber;
	}
	public void setFormNumber(String formNumber) {
		FormNumber = formNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFormName() {
		return FormName;
	}
	public void setFormName(String formName) {
		FormName = formName;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setKey(attribs.getOrDefault("Key",null));
		this.setFormNumber(attribs.getOrDefault("FormNumber",null));
		this.setState(attribs.getOrDefault("state",null));
		this.setFormName(attribs.getOrDefault("FormName",null));
	}

}
