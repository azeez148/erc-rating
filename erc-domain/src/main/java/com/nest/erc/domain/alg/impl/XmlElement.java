package com.nest.erc.domain.alg.impl;


import com.nest.erc.domain.alg.XmlConstruct;

public class XmlElement {

	String elementName;
	String characterContent;
	XmlConstruct parent;
	XmlConstruct previousSibling;
	XmlConstruct nextSibling;

	public String getCharacterContent() {
		return characterContent;
	}

	public void setCharacterContent(String characterContent) {
		this.characterContent = characterContent;
	}

	public XmlConstruct getParent() {
		return parent;
	}

	public void setParent(XmlConstruct parent) {
		this.parent = parent;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	
	public XmlConstruct getPreviousSibling() {
		return previousSibling;
	}
	
	public XmlConstruct getNextSibling() {
		return nextSibling;
	}
	
	public void setPreviousSibling(XmlConstruct previousSibling) {
		this.previousSibling = previousSibling;
	}

	public void setNextSibling(XmlConstruct nextSibling) {
		this.nextSibling = nextSibling;
	}
	
	public XmlConstruct getPreviousSimilarSibling() {
		XmlConstruct previousSiblingIterated = this.previousSibling;
		while(previousSiblingIterated != null) {
			if(previousSiblingIterated.getElementName().equals(this.elementName)) {
				return previousSiblingIterated;
			}
			else {
				previousSiblingIterated = previousSiblingIterated.getPreviousSibling();
			}
		}
		return null;
	}
	
	public XmlConstruct getNextSimilarSibling() {
		XmlConstruct nextSiblingIterated = this.nextSibling;
		while(nextSiblingIterated != null) {
			if(nextSiblingIterated.getElementName().equals(this.elementName)) {
				return nextSiblingIterated;
			}
			else {
				nextSiblingIterated = nextSiblingIterated.getNextSibling();
			}
		}
		return null;
	}
	
	

}
