package com.nest.erc.domain;

import java.util.ArrayList;
import java.util.List;

public class CommonConfig {
	private List<ClientState> states = new ArrayList<ClientState>();
	private List<CommonDomainTable> commonDomainTables;

	public List<ClientState> getStates() {
		return states;
	}

	public void setStates(List<ClientState> states) {
		this.states = states;
	}

	public List<CommonDomainTable> getCommonDomainTables() {
		return commonDomainTables;
	}

	public void setCommonDomainTables(List<CommonDomainTable> commonDomainTables) {
		this.commonDomainTables = commonDomainTables;
	}
	

}
