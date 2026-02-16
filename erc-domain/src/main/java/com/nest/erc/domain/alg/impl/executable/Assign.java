package com.nest.erc.domain.alg.impl.executable;




import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
import com.nest.erc.domain.alg.impl.XmlElement;
import com.nest.erc.domain.alg.impl.expressional.Expression;


public class Assign extends XmlElement implements RatingExecutable {
	private String state;
	private String recordType;
	private String lValue;
	private String variableType;

	private Expression expression;
	
	
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getVariableType() {
		return variableType;
	}
	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}
	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	public String getlValue() {
		return lValue;
	}
	public void setlValue(String lValue) {
		this.lValue = lValue;
	}
	

	public  void addChildren(XmlConstruct xmlConstruct) {
		this.setExpression((Expression)xmlConstruct);
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
		this.setlValue(attribs.getOrDefault("lValue",null));
		this.setVariableType(attribs.getOrDefault("variableType",null));
	}
	
	
	
}
