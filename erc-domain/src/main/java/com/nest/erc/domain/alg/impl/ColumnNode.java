package com.nest.erc.domain.alg.impl;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class ColumnNode extends XmlElement implements XmlConstruct{
	private String usage;

	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setUsage(attribs.getOrDefault("usage",null));
	}
}
