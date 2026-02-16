package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

public class RiskType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3042231394850512699L;

	private String name;
	private String label;
	private String description;
	private String risk_name_template;
	private List<RiskField> fields;
	private List<Calculation> calculations;
	private List<RateTable> rate_tables;
	private List<RiskItem> items;
	private RiskTypeEntitiesOrder entities_order;
	private List<RiskType> children;
	
	@JsonIgnore
	private RiskType parentRisk;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getRisk_name_template() {
		return risk_name_template;
	}
	public void setRisk_name_template(String risk_name_template) {
		this.risk_name_template = risk_name_template;
	}
	public List<RiskField> getFields() {
		return fields;
	}
	public void setFields(List<RiskField> fields) {
		this.fields = fields;
	}
	public void addFields(List<RiskField> fields) {
		if(this.fields == null) {
			this.fields = new ArrayList<RiskField> ();
		}
		for(RiskField riskField : fields) {
		this.fields.add(riskField);
		}
	}
	public List<Calculation> getCalculations() {
		return calculations;
	}
	public void setCalculations(List<Calculation> calculations) {
		this.calculations = calculations;
	}
	public List<RateTable> getRate_tables() {
		return rate_tables;
	}
	public void setRate_tables(List<RateTable> rate_tables) {
		this.rate_tables = rate_tables;
	}
	public List<RiskItem> getItems() {
		return items;
	}
	public void setItems(RiskItem item) {
		if(this.items == null) {
			this.items = new ArrayList<RiskItem> ();
		}
		this.items.add(item);
	}
	
	public void setItems(List<RiskItem> items) {	
		this.items =items;
	}
	public RiskTypeEntitiesOrder getEntities_order() {
		return entities_order;
	}
	public void setEntities_order(RiskTypeEntitiesOrder entities_order) {
		this.entities_order = entities_order;
	}
	public List<RiskType> getChildren() {
		return children;
	}
	public void setChildren(RiskType children) {
		if( this.children == null) {
			this.children = new ArrayList<RiskType>();
		}
		this.children.add(children);
	}
	public void setChildren(List<RiskType> children) {		
		this.children= children;
	}


	public void removeRiskItems(RiskItem riskItem) {
		this.items.remove(riskItem);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void addCalculation(Calculation calculation) {
		if( this.calculations == null) {
			this.calculations = new ArrayList<Calculation>();
		}

		this.calculations.add(calculation);

	}
	public RiskType getParentRisk() {
		return parentRisk;
	}
	public void setParentRisk(RiskType parentRisk) {
		this.parentRisk = parentRisk;
	}




}
