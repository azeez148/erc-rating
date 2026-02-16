package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.Column;

public class RateBookColumn implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9003593140001401337L;
	String id;
	RateBook ratebook;
	Column column;
	String addChangeDeleteFlag;
	String ratingRequired;
	String ratingRequiredCondition;
	String tableName;
	String columnName;
	String comment;
	String ratebookId;
	String columnId;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public RateBook getRatebook() {
		return ratebook;
	}
	public void setRatebook(RateBook ratebook) {
		this.ratebook = ratebook;
	}
	
	public Column getColumn() {
		return column;
	}
	public void setColumn(Column column) {
		this.column = column;
	}
	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}
	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}
	public String getRatingRequired() {
		return ratingRequired;
	}
	public void setRatingRequired(String ratingRequired) {
		this.ratingRequired = ratingRequired;
	}
	public String getRatingRequiredCondition() {
		return ratingRequiredCondition;
	}
	public void setRatingRequiredCondition(String ratingRequiredCondition) {
		this.ratingRequiredCondition = ratingRequiredCondition;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getRatebookId() {
		return ratebookId;
	}
	public void setRatebookId(String ratebookId) {
		this.ratebookId = ratebookId;
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public void addChildren(XmlConstruct xmlConstruct) {
		
		
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
