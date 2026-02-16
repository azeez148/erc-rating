package com.nest.erc.domain.alg.rc;

public class RCAttributes {
	private String type;
	private String description;
	
	public RCAttributes(){
		
	}
	public RCAttributes(String type, String description){
		this.setType(type);
		this.description = description;
	}
	/**
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}
	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
