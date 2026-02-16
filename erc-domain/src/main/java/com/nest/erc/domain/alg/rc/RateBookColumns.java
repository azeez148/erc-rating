package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class RateBookColumns implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -244362378711880368L;
	List<RateBookColumn> rateBookColumns;
	Map<String,RateBookColumn>rateBookColumnsMap = new HashMap<String, RateBookColumn>();
	
	public List<RateBookColumn> getRateBookColumns() {
		return rateBookColumns;
	}

	public void setRateBookColumns(List<RateBookColumn> rateBookColumns) {
		this.rateBookColumns = rateBookColumns;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RateBookColumn){
			if (this.getRateBookColumns()== null) {
				this.setRateBookColumns(new ArrayList<RateBookColumn>());
			}
			xmlConstruct.setParent(this);
			this.getRateBookColumns().add((RateBookColumn)xmlConstruct);
			RateBookColumn rateBookColumn = (RateBookColumn)xmlConstruct;
			this.getRateBookColumnsMap().put(rateBookColumn.getTableName()+rateBookColumn.getColumnName(), rateBookColumn);
			
		}
		
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

	public Map<String, RateBookColumn> getRateBookColumnsMap() {
		return rateBookColumnsMap;
	}

	public void setRateBookColumnsMap(Map<String, RateBookColumn> rateBookColumnsMap) {
		this.rateBookColumnsMap = rateBookColumnsMap;
	}
	
}
