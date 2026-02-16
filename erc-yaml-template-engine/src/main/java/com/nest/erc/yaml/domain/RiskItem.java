package com.nest.erc.yaml.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskItem implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5084060928728832173L;
	private String name;
	private String label;
	private String type;
	private String presence;
	private List<Calculation> variables;
	private Calculation premium;
	private List<Limit> limits;
	private Calculation deductible;
	private boolean deleted;
	
	@JsonIgnore
	private boolean isWrapperAvailable;	
	
	@JsonIgnore
	private RiskType parentRiskType;
	
	public RiskType getParentRiskType() {
		return parentRiskType;
	}
	public void setParentRiskType(RiskType parentRiskType) {
		this.parentRiskType = parentRiskType;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPresence() {
		return presence;
	}
	public void setPresence(String presence) {
		this.presence = presence;
	}
	public List<Calculation> getVariables() {
		return variables;
	}
	public void setVariables(List<Calculation> variables) {
		this.variables = variables;
	}
	public Calculation getPremium() {
		return premium;
	}
	public void setPremium(Calculation premium) {
		this.premium = premium;
	}
	public List<Limit> getLimits() {
		return limits;
	}
	public void setLimits(List<Limit> limits) {
		this.limits = limits;
	}
	public Calculation getDeductible() {
		return deductible;
	}
	public void setDeductible(Calculation deductible) {
		this.deductible = deductible;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	@JsonIgnore
	public boolean isWrapperAvailable() {
		return isWrapperAvailable;
	}
	
	@JsonIgnore
	public void setWrapperAvailable(boolean isWrapperAvailable) {
		this.isWrapperAvailable = isWrapperAvailable;
	}

	
}
