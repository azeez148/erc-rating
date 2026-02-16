package com.nest.erc.domain.alg.impl;

import java.util.Stack;

import com.nest.erc.domain.alg.XmlConstruct;

public class AlgExtractorStack {
	private Stack<XmlConstruct> elements = new Stack<XmlConstruct>();
	private Stack<XmlConstruct> siblings = new Stack<XmlConstruct>();

	public XmlConstruct pop() {
		XmlConstruct popedElement = null;
		if (!elements.empty()) {
			popedElement = elements.pop();
			while(!siblings.empty()) {
				siblings.pop();
			}
			siblings.push(popedElement);
		}
		return popedElement;
	}

	public XmlConstruct peek() {
		XmlConstruct peekedElement = null;
		if (!elements.empty()) {
			peekedElement = elements.peek();
		}
		return peekedElement;
	}

	public boolean push(XmlConstruct xmlConstruct) {
		XmlConstruct previousSibling = null;
		if (!siblings.empty()) {
			previousSibling = siblings.pop();
		}
		settingSibling(previousSibling, xmlConstruct);
		elements.push(xmlConstruct);
		return true;
	}

	private void settingSibling(XmlConstruct previousSibling, XmlConstruct nextSibling) {
		nextSibling.setPreviousSibling(previousSibling);
		if(previousSibling != null) {
			previousSibling.setNextSibling(nextSibling);
		}
	}

}
