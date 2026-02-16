package com.nest.erc.domain.alg.impl;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

/**
 * Class for storing the flowchart variables
 * @author 
 *
 */
public class FlowVariable extends XmlElement implements XmlConstruct{
	String name;
	String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	
	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setName(attribs.getOrDefault("name",null));
		this.setPass(attribs.getOrDefault("pass",null));
	}
}
