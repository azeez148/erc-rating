package com.nest.erc.domain.alg;

import com.fasterxml.jackson.annotation.JsonSetter;

public class RuleEvaluationData  {
	
	private String description;
	private String assignment;
	private String newVarName;
	private String evalCode;
	private String varName;
	private boolean omitFromTotal;
	private String type;
	private boolean _final;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public String getNewVarName() {
		return newVarName;
	}
	public void setNewVarName(String newVarName) {
		this.newVarName = newVarName;
	}
	public String getEvalCode() {
		return evalCode;
	}
	public void setEvalCode(String evalCode) {
		this.evalCode = evalCode;
	}
	public String getVarName() {
		return varName;
	}
	public void setVarName(String varName) {
		this.varName = varName;
	}
	public boolean isOmitFromTotal() {
		return omitFromTotal;
	}
	public void setOmitFromTotal(boolean omitFromTotal) {
		this.omitFromTotal = omitFromTotal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean get_final() {
		return _final;
	}
	
	@JsonSetter("final")
	public void set_final(boolean _final) {
		this._final = _final;
	}
	
	

}
