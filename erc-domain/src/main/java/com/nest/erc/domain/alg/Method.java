package com.nest.erc.domain.alg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Method {
	String methodName;
	String containerClass;
	String returnType = "void";
	boolean constructor = false;
	List<Variable> paramters;
	Set<String> exceptions=new HashSet<String>();  
	List<Method> subMethods = new ArrayList<Method>();
	StringBuilder methodBody = new StringBuilder();
	
	public Method() {
		
	}
	public Method(String methodName,String containerClass) {
		this.methodName = methodName;
		this.containerClass = containerClass;
	}
	public Method(String methodName,String containerClass,boolean constructor,List<Variable> paramters,String returnType) {
		this.methodName = methodName;
		this.containerClass = containerClass;
		this.constructor = constructor;
		this.paramters = paramters;
		this.returnType = returnType;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public List<Method> getSubMethods() {
		return subMethods;
	}
	public void setSubMethods(List<Method> subMethods) {
		this.subMethods = subMethods;
	}
	public String getContainerClass() {
		return containerClass;
	}
	public void setContainerClass(String containerClass) {
		this.containerClass = containerClass;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public List<Variable> getParamters() {
		return paramters;
	}
	public void setParamters(List<Variable> paramters) {
		this.paramters = paramters;
	}
	public StringBuilder getMethodBody() {
		return methodBody;
	}
	public void setMethodBody(StringBuilder methodBody) {
		this.methodBody = methodBody;
	}
	public boolean isConstructor() {
		return constructor;
	}
	public void setConstructor(boolean constructor) {
		this.constructor = constructor;
	}
	public Set<String> getExceptions() {
		return exceptions;
	}
	public void setExceptions(Set<String> exceptions) {
		this.exceptions = exceptions;
	}
	
}
