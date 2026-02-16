package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

/**
 * Class for storing the information of class elements in flowchart
 * 
 * @author
 *
 */
public class FlowClass extends XmlElement implements XmlConstruct {
	String name;
	String type;
	String pass;
	List<ClassComponent> classComponents;
	List<FlowClass> subClasses;
	List<XmlConstruct> subComponents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public List<ClassComponent> getClassComponents() {
		return classComponents;
	}

	public void setClassComponents(List<ClassComponent> classComponents) {
		this.classComponents = classComponents;
	}

	public List<FlowClass> getSubClasses() {
		return subClasses;
	}

	public void setSubClasses(List<FlowClass> subClasses) {
		this.subClasses = subClasses;
	}

	public List<XmlConstruct> getSubComponents() {
		return subComponents;
	}

	public void setSubComponents(List<XmlConstruct> subComponents) {
		this.subComponents = subComponents;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if(this.getSubComponents() == null) {
			this.setSubComponents(new ArrayList<XmlConstruct>());
		}
		xmlConstruct.setParent(this);
		this.getSubComponents().add(xmlConstruct);
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setName(attribs.getOrDefault("name",null));
		this.setType(attribs.getOrDefault("type",null));
		this.setPass(attribs.getOrDefault("pass",null));
	}

}
