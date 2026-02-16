package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;


public class RCWrapper implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5754395148569477818L;
	RateBook rateBook;
	List<WorkBook> workBookList;
	List<Company>companyList;
	Locale locale;
	LOB lob;
	State state;
	RateBookTables ratebookTables;
	RateBookColumns rateBookColumns;
	List<DomainTable> domainTableList;
	List<RateTable> rateTableList;
	List<Resource> resourceList;
	List<Script> scriptList;
	List<Forms> formsList;
	Map<String,RateTable> rateTableMap = new HashMap<String, RateTable>();
	Map<String,DomainTable> domainTableMap = new HashMap<String, DomainTable>();
	Map<String,Resource> resourceMap = new HashMap<String, Resource>();
	Map<String,Script> scriptMap = new HashMap<String, Script>();
	
	public RCWrapper(){
		
	}
	public RCWrapper(RCWrapper rcWrapperCopy) {
		this.rateBook = rcWrapperCopy.getRateBook();
		this.workBookList = rcWrapperCopy.getWorkBookList();
		this.companyList = rcWrapperCopy.getCompanyList();
		this.locale = rcWrapperCopy.getLocale();
		this.lob = rcWrapperCopy.getLob();
		this.state = rcWrapperCopy.getState();
		this.ratebookTables = rcWrapperCopy.getRatebookTables();
		this.rateBookColumns = rcWrapperCopy.getRateBookColumns();
		this.domainTableList = rcWrapperCopy.getDomainTableList();
		this.rateTableList = rcWrapperCopy.getRateTableList();
		this.resourceList = rcWrapperCopy.getResourceList();
		this.scriptList = rcWrapperCopy.getScriptList();
		this.formsList = rcWrapperCopy.getFormsList();
		this.rateTableMap = rcWrapperCopy.getRateTableMap();
		this.domainTableMap = rcWrapperCopy.getDomainTableMap();
		this.resourceMap = rcWrapperCopy.getResourceMap();
		this.scriptMap = rcWrapperCopy.getScriptMap();
	}
	public RateBook getRateBook() {
		return rateBook;
	}

	public void setRateBook(RateBook rateBook) {
		this.rateBook = rateBook;
	}

	public List<WorkBook> getWorkBookList() {
		return workBookList;
	}

	public void setWorkBookList(List<WorkBook> workBookList) {
		this.workBookList = workBookList;
	}

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public LOB getLob() {
		return lob;
	}

	public void setLob(LOB lob) {
		this.lob = lob;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public RateBookTables getRatebookTables() {
		return ratebookTables;
	}

	public void setRatebookTables(RateBookTables ratebookTables) {
		this.ratebookTables = ratebookTables;
	}

	public RateBookColumns getRateBookColumns() {
		return rateBookColumns;
	}

	public void setRateBookColumns(RateBookColumns rateBookColumns) {
		this.rateBookColumns = rateBookColumns;
	}

	public List<DomainTable> getDomainTableList() {
		return domainTableList;
	}

	public void setDomainTableList(List<DomainTable> domainTableList) {
		this.domainTableList = domainTableList;
	}

	public List<RateTable> getRateTableList() {
		return rateTableList;
	}

	public void setRateTableList(List<RateTable> rateTableList) {
		this.rateTableList = rateTableList;
	}

	public List<Resource> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}

	public List<Script> getScriptList() {
		return scriptList;
	}

	public void setScriptList(List<Script> scriptList) {
		this.scriptList = scriptList;
	}
	
	public List<Forms> getFormsList() {
		return formsList;
	}

	public void setForms(List<Forms> formsList) {
		this.formsList = formsList;
	}

	public Map<String, RateTable> getRateTableMap() {
		return rateTableMap;
	}

	public void setRateTableMap(Map<String, RateTable> rateTableMap) {
		this.rateTableMap = rateTableMap;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RateBook ){
			this.setRateBook((RateBook)xmlConstruct);
		}
		if(xmlConstruct instanceof WorkBook){
			if (this.getWorkBookList()== null) {
				this.setWorkBookList(new ArrayList<WorkBook>());
			}
			xmlConstruct.setParent(this);
			this.getWorkBookList().add((WorkBook)xmlConstruct);
		}
		if(xmlConstruct instanceof Company){
			if (this.getCompanyList()== null) {
				this.setCompanyList(new ArrayList<Company>());
			}
			xmlConstruct.setParent(this);
			this.getCompanyList().add((Company)xmlConstruct);
		}
		if(xmlConstruct instanceof Locale ){
			this.setLocale((Locale)xmlConstruct);
		}
		if(xmlConstruct instanceof LOB ){
			this.setLob((LOB)xmlConstruct);
		}
		if(xmlConstruct instanceof State ){
			this.setState((State)xmlConstruct);
		}
		if(xmlConstruct instanceof RateBookTables ){
			this.setRatebookTables((RateBookTables)xmlConstruct);
		}
		if(xmlConstruct instanceof RateBookColumns ){
			this.setRateBookColumns((RateBookColumns)xmlConstruct);
		}
		if(xmlConstruct instanceof Forms ){
			if (this.getFormsList()== null) {
				this.setForms(new ArrayList<Forms>());
			}
			xmlConstruct.setParent(this);
			this.getFormsList().add((Forms)xmlConstruct);
		}
		if(xmlConstruct instanceof Resource ){
			if (this.getResourceList()== null) {
				this.setResourceList(new ArrayList<Resource>());
			}
			xmlConstruct.setParent(this);
			this.getResourceList().add((Resource)xmlConstruct);
			Resource resource =(Resource)xmlConstruct;
			this.getResourceMap().put(resource.getName(), resource);
			
		}
		if(xmlConstruct instanceof Script ){
			if (this.getScriptList()== null) {
				this.setScriptList(new ArrayList<Script>());
			}
			xmlConstruct.setParent(this);
			this.getScriptList().add((Script)xmlConstruct);
			Script script = (Script)xmlConstruct;
			this.getScriptMap().put(script.getName(), script);
			
		}
		if(xmlConstruct instanceof DomainTable){
			if (this.getDomainTableList()== null) {
				this.setDomainTableList(new ArrayList<DomainTable>());
			}
			xmlConstruct.setParent(this);
			this.getDomainTableList().add((DomainTable)xmlConstruct);
			DomainTable domainTable = (DomainTable)xmlConstruct;
			this.getDomainTableMap().put(domainTable.getName(),domainTable);
		}
		if(xmlConstruct instanceof RateTable){
			if (this.getRateTableList()== null) {
				this.setRateTableList(new ArrayList<RateTable>());
			}
			xmlConstruct.setParent(this);
			this.getRateTableList().add((RateTable)xmlConstruct);
			RateTable rateTable = (RateTable)xmlConstruct;
			this.getRateTableMap().put(rateTable.getName(),rateTable);
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

	public Map<String, DomainTable> getDomainTableMap() {
		return domainTableMap;
	}

	public void setDomainTableMap(Map<String, DomainTable> domainTableMap) {
		this.domainTableMap = domainTableMap;
	}

	public Map<String, Resource> getResourceMap() {
		return resourceMap;
	}

	public void setResourceMap(Map<String, Resource> resourceMap) {
		this.resourceMap = resourceMap;
	}

	public Map<String, Script> getScriptMap() {
		return scriptMap;
	}

	public void setScriptMap(Map<String, Script> scriptMap) {
		this.scriptMap = scriptMap;
	}

}
