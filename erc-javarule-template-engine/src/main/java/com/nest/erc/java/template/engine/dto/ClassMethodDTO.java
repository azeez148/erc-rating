package com.nest.erc.java.template.engine.dto;

import java.io.Serializable;

public class ClassMethodDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accessSpecifier;
	private String returnType;
	private String methodName;
	private String params;
	private String body;
	private String returnValue;
	private String throwsSection;
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getReturnValue() {
		return returnValue;
	}
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}
	public String getAccessSpecifier() {
		return accessSpecifier;
	}
	public void setAccessSpecifier(String accessSpecifier) {
		this.accessSpecifier = accessSpecifier;
	}
	public String getThrowsSection() {
		return throwsSection;
	}
	public void setThrowsSection(String throwsSection) {
		this.throwsSection = throwsSection;
	}
	
	//public 

}
