package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class Company    extends Policy  {
	private String FinancialAdvisorType;
	private Date Modified;
	private String GLCode;
	private String Symbol;
	private int Employees;
	private String CorporationType;
	private String TaxId;
	private Date Created;
	private String Name;
	private String Identifier;
	private String Number;
	private String StateOfIncorporation;
	private String VersionedId;
	private String YearOfIncorporation;
	private String CounselorType;
	private int WorkbookCompany;
	private String TradeExchange;
	private String CreatedBy;
	private Date Expiration;
	private Date Effective;
	private String CountryOfIncorporation;
	private double AnnualSales;
	private String ContactPreference;
	private String WebSite;
	private String Id;
	private String SICCode;
	
	
	
	
	
	
	


	public String  getIdentifier() {
		return this.Identifier;
	}
	public String  getWebSite() {
		return this.WebSite;
	}
	public String  getName() {
		return this.Name;
	}
	public String  getTaxId() {
		return this.TaxId;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public String  getCounselorType() {
		return this.CounselorType;
	}
	public String  getYearOfIncorporation() {
		return this.YearOfIncorporation;
	}
	public String  getId() {
		return this.Id;
	}
	public String  getFinancialAdvisorType() {
		return this.FinancialAdvisorType;
	}
	public String  getTradeExchange() {
		return this.TradeExchange;
	}
	public double  getAnnualSales() {
		return this.AnnualSales;
	}
	public String  getCountryOfIncorporation() {
		return this.CountryOfIncorporation;
	}
	public String  getSymbol() {
		return this.Symbol;
	}
	public String  getGLCode() {
		return this.GLCode;
	}
	public String  getContactPreference() {
		return this.ContactPreference;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public String  getSICCode() {
		return this.SICCode;
	}
	public String  getStateOfIncorporation() {
		return this.StateOfIncorporation;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public int  getWorkbookCompany() {
		return this.WorkbookCompany;
	}
	public int  getEmployees() {
		return this.Employees;
	}
	public String  getNumber() {
		return this.Number;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public Date  getModified() {
		return this.Modified;
	}
	public String  getCorporationType() {
		return this.CorporationType;
	}
	
	public void setEmployees(int Employees) {
		this.Employees = Employees;
	}
	public void setWorkbookCompany(int WorkbookCompany) {
		this.WorkbookCompany = WorkbookCompany;
	}
	public void setFinancialAdvisorType(String FinancialAdvisorType) {
		this.FinancialAdvisorType = FinancialAdvisorType;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setStateOfIncorporation(String StateOfIncorporation) {
		this.StateOfIncorporation = StateOfIncorporation;
	}
	public void setSICCode(String SICCode) {
		this.SICCode = SICCode;
	}
	public void setCountryOfIncorporation(String CountryOfIncorporation) {
		this.CountryOfIncorporation = CountryOfIncorporation;
	}
	public void setTradeExchange(String TradeExchange) {
		this.TradeExchange = TradeExchange;
	}
	public void setSymbol(String Symbol) {
		this.Symbol = Symbol;
	}
	public void setAnnualSales(double AnnualSales) {
		this.AnnualSales = AnnualSales;
	}
	public void setCorporationType(String CorporationType) {
		this.CorporationType = CorporationType;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setGLCode(String GLCode) {
		this.GLCode = GLCode;
	}
	public void setYearOfIncorporation(String YearOfIncorporation) {
		this.YearOfIncorporation = YearOfIncorporation;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setCounselorType(String CounselorType) {
		this.CounselorType = CounselorType;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setIdentifier(String Identifier) {
		this.Identifier = Identifier;
	}
	public void setNumber(String Number) {
		this.Number = Number;
	}
	public void setWebSite(String WebSite) {
		this.WebSite = WebSite;
	}
	public void setTaxId(String TaxId) {
		this.TaxId = TaxId;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setContactPreference(String ContactPreference) {
		this.ContactPreference = ContactPreference;
	}
}