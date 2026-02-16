package com.nest.erc.domain.alg.rc;

import java.util.List;

public class RateBookContent {
	RateBook rateBook;
	List<WorkBook>workBookList;
	List<Company>companyList;
	Locale locale;
	LOB lob;
	State state;
	RateBookTables rateBookTables;
	RateBookColumns rateBookColumns;
	List<DomainTable> domainTableList;
	List<RateTable> rateTableList;
	Forms forms;
	List<Resource> resourceList;
	List<Script> scriptList;
	AOPresenation aoPresenation;
	
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
	public AOPresenation getAoPresenation() {
		return aoPresenation;
	}
	public void setAoPresenation(AOPresenation aoPresenation) {
		this.aoPresenation = aoPresenation;
	}
}
