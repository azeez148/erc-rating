package com.nest.erc.domain.alg;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "parent", "previousSibling", "nextSibling", "previousSimilarSibling", "nextSimilarSibling"})
public interface XmlConstruct {
	
	public String getCharacterContent();

	public void setCharacterContent(String characterContent);

	public XmlConstruct getParent();

	public void setParent(XmlConstruct parent);

	public String getElementName();

	public void setElementName(String elementName);
	
	public XmlConstruct getPreviousSibling();
	
	public XmlConstruct getNextSibling();
	
	public void addChildren(XmlConstruct xmlConstruct);

	public void setPreviousSibling(XmlConstruct previousSibling);

	public void setNextSibling(XmlConstruct nextSibling);
	
	public void setAllAttribute(String elementName, Map<String, String> attribs);
	
	public XmlConstruct getPreviousSimilarSibling();
	
	public XmlConstruct getNextSimilarSibling();

}
