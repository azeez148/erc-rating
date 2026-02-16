package com.nest.erc.parser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.impl.AlgExtractorStack;
import com.nest.erc.domain.alg.impl.Argument;
import com.nest.erc.domain.alg.impl.AttachStatement;
import com.nest.erc.domain.alg.impl.ClassComponent;
import com.nest.erc.domain.alg.impl.ColumnNode;
import com.nest.erc.domain.alg.impl.Condition;
import com.nest.erc.domain.alg.impl.ElsePart;
import com.nest.erc.domain.alg.impl.FlowClass;
import com.nest.erc.domain.alg.impl.FlowVariable;
import com.nest.erc.domain.alg.impl.Lob;
import com.nest.erc.domain.alg.impl.OptOutForm;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.Scope;
import com.nest.erc.domain.alg.impl.TableName;
import com.nest.erc.domain.alg.impl.ThenPart;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.executable.IfAndElse;
import com.nest.erc.domain.alg.impl.executable.Loop;
import com.nest.erc.domain.alg.impl.expressional.Bracket;
import com.nest.erc.domain.alg.impl.expressional.Expression;
import com.nest.erc.domain.alg.impl.expressional.Function;
import com.nest.erc.domain.alg.impl.expressional.Ratetable;


public class ALGDetailsExtractor {
	Lob xmlDetails = null;
	
	AlgExtractorStack algExtractorStack = new AlgExtractorStack();
	Set<String> validXmlElementTypes = new HashSet<String>();
	Set<String> referenceType = new HashSet<String>();
	
	public XmlConstruct handleParentChildInDetailExtraction() {
 		XmlConstruct child = algExtractorStack.pop();
 		XmlConstruct parent = null;
 		if(algExtractorStack.peek() != null) {
 			parent = algExtractorStack.peek();
 			parent.addChildren(child);
 		}
 		/*
 		if(child.getElementName().equals("LOB")) {
 			//System.out.println("Types: "+referenceType);
 		}
		*/
		return child;
 	}
	public void processingXmlCharacters(String characterContent) {
		if (algExtractorStack.peek() != null && algExtractorStack.peek().getCharacterContent() == null) {
			algExtractorStack.peek().setCharacterContent(characterContent);
		} else if(algExtractorStack.peek() != null){
			algExtractorStack.peek().setCharacterContent(algExtractorStack.peek().getCharacterContent() + characterContent);
		}
	}


	public void addElementAndDetails(String elementName, Map<String, String> attribs) {
		validXmlElementTypes.addAll(Arrays.asList("rating", "stat", "err", "formAttachment", "premium", "totalpremium", "xpath", "decvar", "coverageOnPolicyIndicator"));
		XmlConstruct xmlConstruct = null;
		if ("LOB".equals(elementName)) {
			xmlConstruct = new Lob();
		}
		else if ("reference".equals(elementName)) {
			xmlConstruct = new Reference();
			referenceType.add(attribs.get("type"));
		}
		else if ("class".equals(elementName)) {
			xmlConstruct = new FlowClass();
		}
		else if ("scope".equals(elementName)) {
			xmlConstruct = new Scope();
		}
		else if ("TableName".equals(elementName)) {
			xmlConstruct = new TableName();
		}
		else if ("if".equals(elementName)) {
			xmlConstruct = new IfAndElse();
		}
		else if ("PCH".equals(elementName)) {
			xmlConstruct = new Pch();
		}
		else if ("assign".equals(elementName)) {
			xmlConstruct = new Assign();
		}
		else if ("loop".equals(elementName)) {
			xmlConstruct = new Loop();
		}
		else if ("ATTACH".equals(elementName)) {
			xmlConstruct = new AttachStatement();
		}
		else if ("OptOutForm".equals(elementName)) {
			xmlConstruct = new OptOutForm();
		}
		else if ("then".equals(elementName)) {
			xmlConstruct = new ThenPart();
		}
		else if ("else".equals(elementName)) {
			xmlConstruct = new ElsePart();
		}
		else if (validXmlElementTypes.contains(elementName)) {
			xmlConstruct = new ClassComponent();
		}
		else if ("function".equals(elementName)) {
			xmlConstruct = new Function();
		}
		else if ("arg".equals(elementName)) {
			xmlConstruct = new Argument();
		}
		else if ("ratetable".equals(elementName)) {
			xmlConstruct = new Ratetable();
		}
		else if ("condition".equals(elementName)) {
			xmlConstruct = new Condition();
		}
		else if ("expression".equals(elementName)) {
			xmlConstruct = new Expression();
		}
		else if ("bracket".equals(elementName)) {
			xmlConstruct = new Bracket();
		}
		else if ("ColumnNode".equals(elementName)) {
			xmlConstruct = new ColumnNode();
		}
		else if ("variable".equals(elementName)) {
			xmlConstruct = new FlowVariable();
		}
		xmlConstruct.setAllAttribute(elementName, attribs);
		algExtractorStack.push(xmlConstruct);
		
	}
}
