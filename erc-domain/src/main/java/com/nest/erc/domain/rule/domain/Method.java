package com.nest.erc.domain.rule.domain;

import java.util.List;

public class Method {
	String accessModifier;
	String methodName;
	List<String>  paramList;
	String returnType;
	StringBuilder methodBody;
	
	public Method(){
		
	}
	public Method(String methodName){
		this.setMethodName(methodName);
	}

	
	public String getAccessModifier() {
		return accessModifier;
	}
	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}
	public String getMethodNameName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		if(!this.methodName.equals("processPremium")) {
			this.methodName = "set"+methodName;
		}
		this.methodName = methodName;
	}
	public List<String> getParamList() {
		return paramList;
	}
	public void setParamList(List<String> paramList) {
		this.paramList = paramList;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public StringBuilder getMethodBody() {
		return methodBody;
	}
	public void setMethodBody(StringBuilder methodBody) {
		this.methodBody = methodBody;
	}
	
}
