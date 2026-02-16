package com.nest.erc.domain.alg.ds;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class Column implements XmlConstruct, Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -3983628969900507858L;
	String id;
	 String comment;
     String dataType;
     Integer dataSize;
     String name;
     Integer encrypted;
     String distortion;
     
     
    public Column(){
    	
    }
    
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Integer getDataSize() {
		return dataSize;
	}
	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEncrypted() {
		return encrypted;
	}
	public void setEncrypted(Integer encrypted) {
		this.encrypted = encrypted;
	}
	public String getDistortion() {
		return distortion;
	}
	public void setDistortion(String distortion) {
		this.distortion = distortion;
	}
	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}
	public String getCharacterContent() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCharacterContent(String characterContent) {
		// TODO Auto-generated method stub
		
	}
	public XmlConstruct getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setParent(XmlConstruct parent) {
		// TODO Auto-generated method stub
		
	}
	public String getElementName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setElementName(String elementName) {
		// TODO Auto-generated method stub
		
	}
	public XmlConstruct getPreviousSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public XmlConstruct getNextSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPreviousSibling(XmlConstruct previousSibling) {
		// TODO Auto-generated method stub
		
	}
	public void setNextSibling(XmlConstruct nextSibling) {
		// TODO Auto-generated method stub
		
	}
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		// TODO Auto-generated method stub
		
	}
	public XmlConstruct getPreviousSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public XmlConstruct getNextSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
     
}
