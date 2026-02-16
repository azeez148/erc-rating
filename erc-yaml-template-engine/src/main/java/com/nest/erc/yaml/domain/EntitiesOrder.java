package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EntitiesOrder implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 865983763094555205L;
	
	private List<String> entityName;

	public List<String> getEntityName() {
		return entityName;
	}

	public void setEntityName(List<String> entityName) {
		this.entityName = entityName;
	}
}
