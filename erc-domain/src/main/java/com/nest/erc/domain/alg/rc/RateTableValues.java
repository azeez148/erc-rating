package com.nest.erc.domain.alg.rc;

import java.util.HashMap;

public class RateTableValues {
	String tableName;
	String lookupType;
	HashMap<String,String> keyValues;
	String rate;
	
	public RateTableValues(){
		keyValues = new HashMap<String,String>();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getLookupType() {
		return lookupType;
	}

	public void setLookupType(String lookupType) {
		this.lookupType = lookupType;
	}

	public HashMap<String, String> getKeyValues() {
		return keyValues;
	}

	public void setKeyValues(HashMap<String, String> keyValues) {
		this.keyValues = keyValues;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	
}
