package com.nest.erc.domain.alg.impl;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.impl.expressional.Expression;
/**
 * Class for adding condition element details
 * @author 
 *
 */
public class Condition extends XmlElement  implements XmlConstruct{
	private String state;
	private Expression theCondition;
	private String recordType;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Expression getTheCondition() {
		return theCondition;
	}
	public void setTheCondition(Expression theCondition) {
		this.theCondition = theCondition;
	}
	

	public  void addChildren(XmlConstruct xmlConstruct) {
		this.setTheCondition((Expression)xmlConstruct);
		xmlConstruct.setParent(this);
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setState(attribs.getOrDefault("state",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
	}
}
