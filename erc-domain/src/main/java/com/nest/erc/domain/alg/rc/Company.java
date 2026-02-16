package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class Company implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3056182944300549414L;
	String versionedId;
	String id;
	String effective;
	String expiration;
	String created;
	String createdBy;
	String modified;
	String identifier;
	String number;
	String name;
	String webSite;
	String taxId;
	String tradeExchange;
	String symbol;
	String corporationType;
	String yearOfIncorporation;
	String countryOfIncorporation;
	String stateOfIncorporation;
	String counselorType;
	String financialAdvisorType;
	String sicCode;
	String glCode;
	String annualSales;
	String employees;
	String contactPreference;
	String workbookCompany;

	public String getVersionedId() {
		return versionedId;
	}
	public void setVersionedId(String versionedId) {
		this.versionedId = versionedId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEffective() {
		return effective;
	}
	public void setEffective(String effective) {
		this.effective = effective;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getTradeExchange() {
		return tradeExchange;
	}
	public void setTradeExchange(String tradeExchange) {
		this.tradeExchange = tradeExchange;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCorporationType() {
		return corporationType;
	}
	public void setCorporationType(String corporationType) {
		this.corporationType = corporationType;
	}
	public String getYearOfIncorporation() {
		return yearOfIncorporation;
	}
	public void setYearOfIncorporation(String yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}
	public String getCountryOfIncorporation() {
		return countryOfIncorporation;
	}
	public void setCountryOfIncorporation(String countryOfIncorporation) {
		this.countryOfIncorporation = countryOfIncorporation;
	}
	public String getStateOfIncorporation() {
		return stateOfIncorporation;
	}
	public void setStateOfIncorporation(String stateOfIncorporation) {
		this.stateOfIncorporation = stateOfIncorporation;
	}
	public String getCounselorType() {
		return counselorType;
	}
	public void setCounselorType(String counselorType) {
		this.counselorType = counselorType;
	}
	public String getFinancialAdvisorType() {
		return financialAdvisorType;
	}
	public void setFinancialAdvisorType(String financialAdvisorType) {
		this.financialAdvisorType = financialAdvisorType;
	}
	public String getSicCode() {
		return sicCode;
	}
	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}
	public String getGlCode() {
		return glCode;
	}
	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}
	public String getAnnualSales() {
		return annualSales;
	}
	public void setAnnualSales(String annualSales) {
		this.annualSales = annualSales;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getContactPreference() {
		return contactPreference;
	}
	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}
	public String getWorkbookCompany() {
		return workbookCompany;
	}
	public void setWorkbookCompany(String workbookCompany) {
		this.workbookCompany = workbookCompany;
	}
	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
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
	public XmlConstruct getPreviousSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	public XmlConstruct getNextSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
