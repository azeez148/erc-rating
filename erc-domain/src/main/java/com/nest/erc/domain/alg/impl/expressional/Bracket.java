package com.nest.erc.domain.alg.impl.expressional;

import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.Expressional;
import com.nest.erc.domain.alg.impl.XmlElement;

public class Bracket extends XmlElement implements Expressional{
	Expression expression;

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	

	public  void addChildren(XmlConstruct xmlConstruct) {
		this.setExpression((Expression)xmlConstruct);
		xmlConstruct.setParent(this);
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
	}

	

}
