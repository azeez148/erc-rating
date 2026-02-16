package com.nest.erc.java.template.engine.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.Method;
import com.nest.erc.domain.alg.Rule;
import com.nest.erc.domain.alg.RuleEvaluationData;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.Scope;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.executable.IfAndElse;
import com.nest.erc.domain.alg.impl.executable.Loop;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.util.Utils;
import com.nest.erc.domain.util.XmlConstructUtils;
import com.nest.erc.java.template.engine.services.ExpressionEvaluator;

public class PchProcessor {
	ExpressionEvaluator expressionHandling = null;
	Map<String, PojoClassConstruct> classMap = null;
	XmlConstructUtils xmlConstructUtils = new XmlConstructUtils();
	Rule rule = null;
	DSWrapper dsWrapper = null;
	String state = null;
	String version = null;
	String lobName = null;
	
	public PchProcessor() {
		
	}
	public PchProcessor(ExpressionEvaluator expressionHandling, Map<String, PojoClassConstruct> classMap, Rule rule, DSWrapper dsWrapper, String state, String version, String lobName) {
		this.expressionHandling = expressionHandling;
		this.classMap = classMap;
		this.rule = rule;
		this.dsWrapper = dsWrapper;
		this.state = state;
		this.version = version;
		this.lobName = lobName;
		
	}
	/**
	 * This method process each line in pch
	 * @param hasExecutable
	 * @param parentRule
	 * @param condition
	 * @param subMethod
	 * @param subMethodList
	 */
	public void processPch(HasExecutable hasExecutable, RuleEvaluationData parentRule, String condition,
			Method subMethod, List<Method> subMethodList) {
		if (hasExecutable.getExecutables() != null) {
			String varName = ((Pch) hasExecutable).getName();
			for (RatingExecutable ratingExecutable : hasExecutable.getExecutables()) {
				if (ratingExecutable instanceof IfAndElse) {
					handleIfAndElseOnly((IfAndElse) ratingExecutable,varName,rule,subMethod, subMethodList);
				} else if (ratingExecutable instanceof Assign) {
					handleAssignOnly((Assign) ratingExecutable, varName, rule, subMethod, subMethodList);
				} else if (ratingExecutable instanceof Loop) {
					handleLoopOnly((Loop) ratingExecutable, varName, rule, subMethod, subMethodList);
				}
			}
		}

	}
	/**
	 * 
	 * @param ratingExecutable
	 * @param varName
	 * @param rule
	 * @param method
	 * @param subMethodList
	 */
	private void handleAssignOnly(Assign ratingExecutable, String varName, Rule rule, Method method, List<Method> subMethodList) {
		String currentRule = rule.getName();
		String assignExpression = handleAssign(ratingExecutable, rule, null, subMethodList);
		String assignExp = null;
		PojoClassConstruct pojoClassConstruct = this.classMap.get(rule.getName());
		Pch currentPch = xmlConstructUtils.findParentPch(ratingExecutable);
		if(Utils.isMethodReference(varName,pojoClassConstruct,currentPch)) { // method refernce variable is local variable and it is not present in pojo.So does not have a setter method
			assignExp = "this."+varName+" = "+assignExpression+";\n";;
		}else {
			varName = Utils.handleSpecialVariable(varName);
			assignExp = "this." + currentRule + ".set" + varName + "(" + assignExpression + ");\n";
		}
		method.getMethodBody().append(assignExp);
	}
	/**
	 * 
	 * @param ratingExecutable
	 * @param rule
	 * @param loop
	 * @param subMethodList
	 * @return
	 */
	private String handleAssign(Assign ratingExecutable, Rule rule, Loop loop, List<Method> subMethodList) {
		return expressionHandling.evaluateExpression(ratingExecutable.getExpression(), rule, loop, subMethodList);
	}
	/**
	 * 
	 * @param ratingExecutable
	 * @param varName
	 * @param rule
	 * @param method
	 * @param subMethodList
	 */
	private void handleLoopOnly(Loop ratingExecutable, String varName, Rule rule, Method method, List<Method> subMethodList) {
		String loopExpression = handleLoop(ratingExecutable, rule, varName, subMethodList);
		method.getMethodBody().append(loopExpression);
	}
	/**
	 * 
	 * @param ratingExecutable
	 * @param rule
	 * @param varName
	 * @param subMethodList
	 * @return
	 */
	private String handleLoop(Loop ratingExecutable, Rule rule, String varName, List<Method> subMethodList) {
		String currentRule= rule.getName();
		StringBuilder loopExp = new StringBuilder();
		try {
			for (int i = 0; i < ratingExecutable.getExecutables().size(); i++) {
				String loopElement = ratingExecutable.getThrough();
				String loopNode;
				List<String> validVariables = extractedXPath(loopElement);
				if (validVariables.size() > 0) {
					loopNode = validVariables.get(validVariables.size() - 1);
					if (null == classMap.get(loopNode)) {
						loopElement = loopElement.substring(0, loopElement.length() - (loopNode.length() + 1));
					}
				}
				RatingExecutable exec = ratingExecutable.getExecutables().get(i);
				String listLoopingStart = "\n\t\tfor( Policy policy : XpathNode.selectNodes(" + currentRule + ",\""
						+ loopElement + "\") ){";
				loopExp.append(listLoopingStart + "\n");
				if (exec.getElementName().equals("assign")) {
					Assign execAssign = (Assign) exec;
					String assignExpression = handleAssign(execAssign, rule, ratingExecutable,subMethodList);
					//String addLoop = "this." + currentRule + ".get" + Utils.handleSpecialVariable(varName) + "()+"+ assignExpression;
					String assignExp = "\t\t\tthis." + currentRule + ".set" + Utils.handleSpecialVariable(varName) + "("+ assignExpression + ");";
					loopExp.append(assignExp + "\n");
				} else if(exec instanceof IfAndElse) {
					IfAndElse execIfAndElse = (IfAndElse)exec;
					StringBuilder ifStmts= handleIfAndElse(execIfAndElse, "", rule, ratingExecutable, subMethodList);
					loopExp.append(ifStmts);
				}
				String listLoopingEnd = "\t\t}";
				loopExp.append(listLoopingEnd + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return loopExp.toString();
	}
	/**
	 * return s the nodes in xpath
	 * @param loopElement
	 * @return
	 */
	private List<String> extractedXPath(String loopElement) {
		String[] splitVariables = loopElement.split("/");
		List<String> validVariables = new ArrayList<String>();
		for (String variable : splitVariables) {
			if (variable.equals("..")) {
				continue;
			} else {
				validVariables.add(variable);
			}
		}
		return validVariables;
	}
	/**
	 * 
	 * @param ratingExecutable
	 * @param varName
	 * @param rule
	 * @param method
	 * @param subMethodList
	 */
	private void handleIfAndElseOnly(IfAndElse ratingExecutable,String varName, Rule rule, Method method, List<Method> subMethodList) {
		StringBuilder statements = new StringBuilder();
		statements = handleIfAndElse(ratingExecutable, varName, rule, null, subMethodList);
		method.getMethodBody().append(statements);
	}
	/**
	 * 
	 * @param ratingExecutable
	 * @param varName
	 * @param rule
	 * @param loop
	 * @param subMethodList
	 * @return
	 */
	private StringBuilder handleIfAndElse(IfAndElse ratingExecutable, String varName, Rule rule, Loop loop, List<Method> subMethodList) {
		String currentRule = rule.getName();
		StringBuilder statements = new StringBuilder();
		String ifCondition = expressionHandling.evaluateExpression(ratingExecutable.getCondition().getTheCondition(),rule,loop, subMethodList);
		String openBracket = "{";
		statements.append("\n\t\tif("+ifCondition+")"+openBracket);
		
		List<RatingExecutable> executablesInThen = ratingExecutable.getThenPart().getStatementsInThen();
		List<RatingExecutable> executablesInElse = null;
		if(ratingExecutable.getElsePart() != null && ratingExecutable.getElsePart().getStatementsInElse() != null) {
			executablesInElse = ratingExecutable.getElsePart().getStatementsInElse();
		}
		for (int i = 0; i < executablesInThen.size(); i++) {
			createIfElseSubcomponents(varName, rule, loop, subMethodList, currentRule, statements, executablesInThen, i);
		}
        String closeBracket = "\n\t\t}";
        statements.append(closeBracket);

		if(executablesInElse != null) {
			String elseCondition ="\n\t\telse"+openBracket;
			statements.append(elseCondition);
			for (int i = 0; i < executablesInElse.size(); i++) {
				createIfElseSubcomponents(varName, rule, loop, subMethodList, currentRule, statements, executablesInElse, i);
			}
			statements.append(closeBracket);
		}
		return statements;
	}
	/**
	 * Handle the assignment, loop and ifelse inside an if or else
	 * @param varName
	 * @param rule
	 * @param loop
	 * @param subMethodList
	 * @param currentRule
	 * @param statements
	 * @param executables
	 * @param i
	 */
	private void createIfElseSubcomponents(String varName, Rule rule, Loop loop, List<Method> subMethodList,
			String currentRule, StringBuilder statements, List<RatingExecutable> executables, int i) {
		String assignVariable;
		String subPackage = lobName.toLowerCase()+"."+state.toLowerCase()+version;
		if (executables.get(i) instanceof Assign) {
			Assign assign = (Assign)executables.get(i);
			assignVariable =handleAssign((Assign) executables.get(i),rule,loop,subMethodList);
			PojoClassConstruct pojoClassConstruct = this.classMap.get(rule.getName());
			Pch currentPch = xmlConstructUtils.findParentPch(assign);
			if(null!=assign.getlValue() && Utils.isMethodReference(assign.getlValue(),pojoClassConstruct,currentPch)) {
				if( assign.getlValue().indexOf("(") == -1) {
					statements.append("\n\t\t\tthis."+assign.getlValue()+" = "+assignVariable+";");
				}else {
					statements.append("\n\t\t\tthis."+assign.getlValue().substring(0, assign.getlValue().indexOf("("))+" = "+assignVariable+";");
				}
			}else {
				String xpath = assign.getlValue();
				List<String> validVariables = extractedXPath(xpath);
				if (validVariables.size() >=2) {
					String xpathVariable = validVariables.get(validVariables.size() - 1);
					String xpathNode = validVariables.get(validVariables.size() - 2);
					if(assign.getlValue().equals(varName)) {
						statements.append("\n\t\tfor(com.nest.res."+subPackage+".domain."+xpathNode+" "+xpathNode+" :"+xpathNode+"List){");
						statements.append("\n\t\t"+xpathNode+".set"+Utils.handleSpecialVariable(xpathVariable)+"("+assignVariable+");");
						statements.append("\n\t\t}");
					}else {
						statements.append("\n\t\tcom.nest.res."+subPackage+".domain."+xpathNode+" "+xpathNode+"= (com.nest.res."+subPackage+".domain."+xpathNode+")policy;");
						statements.append("\n\t\t"+xpathNode+".set"+Utils.handleSpecialVariable(xpathVariable)+"("+assignVariable+");");
					}
				}
				else {
					String castType = Utils.getAssignCastingType(assign, dsWrapper, currentRule, assign.getlValue());
					assignVariable = castType+"("+assignVariable+")";
					statements.append("\n\t\t\tthis."+currentRule+".set"+Utils.handleSpecialVariable(assign.getlValue())+"("+assignVariable+");");
				}
			}
			
		} else {			
			if (executables.get(i) instanceof Loop) {
				String loopStatements = handleLoop((Loop)executables.get(i),rule,varName,subMethodList);
				statements.append(loopStatements);
			} else if (executables.get(i) instanceof IfAndElse) {
				StringBuilder ifStmts = handleIfAndElse((IfAndElse)executables.get(i), varName,rule,loop,subMethodList);
				statements.append(ifStmts);
			}
		}
	}
}
