package com.nest.erc.domain.alg.impl.expressional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.Expressional;
import com.nest.erc.domain.alg.impl.XmlElement;

public class Expression extends XmlElement implements Expressional{
	private String asText;
	private String operatorAsInElement;
	private String side;
	private String variableType;
	private String ruleReference;
	private String recordType;

	
	
	Expression leftExpression;
	Expression rightExpression;

	List<Expressional> expressions;
	//String value;

	public String getAsText() {
		return asText;
	}

	public void setAsText(String asText) {
		this.asText = asText;
	}

	public String getOperatorAsInElement() {
		return operatorAsInElement;
	}

	public void setOperatorAsInElement(String operatorAsInElement) {
		this.operatorAsInElement = operatorAsInElement;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}
	
	/*
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	*/

	public List<Expressional> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<Expressional> expressions) {
		this.expressions = expressions;
	}

	public Expression getLeftExpression() {
		return leftExpression;
	}

	public void setLeftExpression(Expression leftExpression) {
		this.leftExpression = leftExpression;
	}

	public Expression getRightExpression() {
		return rightExpression;
	}

	public void setRightExpression(Expression rightExpression) {
		this.rightExpression = rightExpression;
	}

	public String getVariableType() {
		return variableType;
	}

	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}


	public void addChildren(XmlConstruct xmlConstruct) {
		if (xmlConstruct instanceof Expression) {
			Expression expressionChild = (Expression) xmlConstruct;
			if (expressionChild.getSide().equals("left")) {
				this.setLeftExpression(expressionChild);
			} else if (expressionChild.getSide().equals("right")) {
				this.setRightExpression(expressionChild);
			}
		} else {
			if (this.getExpressions() == null) {
				this.setExpressions(new ArrayList<Expressional>());
			}
			this.getExpressions().add((Expressional) xmlConstruct);

		}
		xmlConstruct.setParent(this);
	}

	public String getRuleReference() {
		return ruleReference;
	}

	public void setRuleReference(String ruleReference) {
		this.ruleReference = ruleReference;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setSide(attribs.getOrDefault("side",null));
		this.setRuleReference(attribs.getOrDefault("ruleReference",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
		this.setOperatorAsInElement(attribs.getOrDefault("op",null));
		this.setAsText(attribs.getOrDefault("asText",null));
		this.setVariableType(attribs.getOrDefault("variableType",null));
	}
	

}
