package com.nest.erc.domain;

import java.util.List;

public class CommonDomainTable {
	
	private String name;
	private List<CommonDomainEntry> domainEntries ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CommonDomainEntry> getDomainEntries() {
		return domainEntries;
	}
	public void setDomainEntries(List<CommonDomainEntry> domainEntries) {
		this.domainEntries = domainEntries;
	}

}
