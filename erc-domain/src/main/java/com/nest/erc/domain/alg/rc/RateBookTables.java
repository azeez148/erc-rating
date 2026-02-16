package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class RateBookTables implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2828462463120778400L;
	List<RateBookTable> rateBookTableList;
	Map<String,RateBookTable> rateBookTableMap = new HashMap<String, RateBookTable>();


	public List<RateBookTable> getRateBookTableList() {
		return rateBookTableList;
	}

	public void setRateBookTableList(List<RateBookTable> rateBookTableList) {
		this.rateBookTableList = rateBookTableList;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RateBookTable){
			if (this.getRateBookTableList()== null) {
				this.setRateBookTableList(new ArrayList<RateBookTable>());
			}
			xmlConstruct.setParent(this);
			this.getRateBookTableList().add((RateBookTable)xmlConstruct);
			RateBookTable rateBookTable = (RateBookTable)xmlConstruct;
			this.getRateBookTableMap().put(rateBookTable.getTableName(), rateBookTable);
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

	public Map<String, RateBookTable> getRateBookTableMap() {
		return rateBookTableMap;
	}

	public void setRateBookTableMap(Map<String, RateBookTable> rateBookTableMap) {
		this.rateBookTableMap = rateBookTableMap;
	}
	
}
