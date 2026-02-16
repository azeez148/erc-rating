package com.nest.erc.domain.alg.impl.executable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
import com.nest.erc.domain.alg.impl.XmlElement;



public class Loop  extends XmlElement implements RatingExecutable,HasExecutable {
	private String through;
	private String state;
	private String recordType;

	List<RatingExecutable> executables;
	
	public String getThrough() {
		return through;
	}
	public void setThrough(String through) {
		this.through = through;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<RatingExecutable> getExecutables() {
		return executables;
	}
	public void setExecutables(List<RatingExecutable> executables) {
		this.executables = executables;
	}
	/*
	public void addExecutable(RatingExecutable ratingExecutable) {
		if (this.getExecutables() == null) {
			this.setExecutables(new ArrayList<RatingExecutable>());
		}
		this.getExecutables().add(ratingExecutable);

	}
	*/

	public  void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RatingExecutable) {
		if (this.getExecutables() == null) {
			this.setExecutables(new ArrayList<RatingExecutable>());
		}
		xmlConstruct.setParent(this);
		this.getExecutables().add((RatingExecutable)xmlConstruct);
		}
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setThrough(attribs.getOrDefault("through",null));
		this.setState(attribs.getOrDefault("state",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
	}
	
	

}
