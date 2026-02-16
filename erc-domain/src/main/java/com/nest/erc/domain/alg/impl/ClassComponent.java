package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
/**
 * Class for storing the premium/rating elements in flowchart
 * @author 
 *
 */
public class ClassComponent extends XmlElement implements XmlConstruct{
	String className;
	String type;
	List<FlowVariable> variables;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<FlowVariable> getVariables() {
		return variables;
	}
	public void setVariables(List<FlowVariable> variables) {
		this.variables = variables;
	}
	

	public  void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof FlowVariable) {
		if (this.getVariables() == null) {
			this.setVariables(new ArrayList<FlowVariable>());
		}
		xmlConstruct.setParent(this);
		this.getVariables().add((FlowVariable)xmlConstruct);
		}
		if(this.getVariables().size() > 0) {
			xmlConstruct.setPreviousSibling(this.getVariables().get(this.getVariables().size()-1));
			this.getVariables().get(this.getVariables().size()-1).setNextSibling(xmlConstruct);
		}
		
	}
	
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setClassName(attribs.getOrDefault("className",null));
		this.setType(attribs.getOrDefault("type",null));
	}

}
