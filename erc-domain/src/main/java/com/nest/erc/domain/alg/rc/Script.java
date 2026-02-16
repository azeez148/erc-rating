package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class Script implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7213803764221112595L;
	String id;
	WorkBook workBook;
	RateBook rateBook;
	String name;
	String title;
	String data;
	String comment;
	String WorkbookId;
	String RatebookId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public WorkBook getWorkBook() {
		return workBook;
	}
	public void setWorkBook(WorkBook workBook) {
		this.workBook = workBook;
	}
	public RateBook getRateBook() {
		return rateBook;
	}
	public void setRateBook(RateBook rateBook) {
		this.rateBook = rateBook;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getWorkbookId() {
		return WorkbookId;
	}
	public void setWorkbookId(String workbookId) {
		WorkbookId = workbookId;
	}
	public String getRatebookId() {
		return RatebookId;
	}
	public void setRatebookId(String ratebookId) {
		RatebookId = ratebookId;
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
	

}
