package com.nest.erc.java.template.engine.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.impl.Scope;
import com.nest.erc.domain.alg.impl.XmlElement;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.Method;
import com.nest.erc.domain.alg.Rule;
import com.nest.erc.domain.alg.Variable;
import com.nest.erc.domain.alg.VariableType;
import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.impl.Argument;
import com.nest.erc.domain.alg.impl.Condition;
import com.nest.erc.domain.alg.impl.Lob;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.executable.Assign;
import com.nest.erc.domain.alg.impl.executable.Loop;
import com.nest.erc.domain.alg.impl.expressional.Bracket;
import com.nest.erc.domain.alg.impl.expressional.Expression;
import com.nest.erc.domain.alg.impl.expressional.Function;
import com.nest.erc.domain.alg.impl.expressional.Ratetable;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.alg.re.constructs.impl.PojoVariablesConstruct;
import com.nest.erc.domain.util.Utils;
import com.nest.erc.domain.util.XmlConstructUtils;
import com.nest.erc.java.template.engine.utils.PchProcessor;

import ch.qos.logback.core.joran.spi.XMLUtil;


public class ExpressionEvaluator {

	Reference flowChart;
	static String expressionCharacterContent;
	Lob xmlDetails;
	private String rateTableName;
	Set<String> xPathVariableType;
	Set<String> ordinaryVariables;
	XmlConstructUtils xmlConstructUtils = new XmlConstructUtils();
	Set<String> validPrimitiveOperators = new HashSet<String>();
	Set<String> validFunctionalOperators = new HashSet<String>();
	Set<String> validMathematicalOperators = new HashSet<String>();
	boolean isLoopNode = false;
	Loop parentLoop=null;
	DSWrapper dsWrapper = null;
	Map<String, PojoClassConstruct> classMap = null;
	String lobName = null;
	String state = null;
	String version = null;

	public ExpressionEvaluator(ERCProcessorOutput ercProcessorOutput,Map<String, PojoClassConstruct> classMap, String state, String lobName) {
		
		Map<String,AlgParserOutput> algParserOutputs = ercProcessorOutput.getAlgParserOutputs();
		AlgParserOutput algParserOutput = algParserOutputs.get(state);
		setOperators();
		this.flowChart = algParserOutput.getFlowChart();
		this.xmlDetails = algParserOutput.getXmlDetails();
		dsWrapper = ercProcessorOutput.getDsWrapper();
		this.state = state;
		this.version = ercProcessorOutput.getVersion();
		xPathVariableType = new HashSet<String>();
		xPathVariableType.addAll(Arrays.asList("XPATH_DATE", "XPATH_STRING", "XPATH_NUMERIC", "XPATH"));
		ordinaryVariables = new HashSet<String>();
		ordinaryVariables.addAll(Arrays.asList("LV_INTEGER", "LV_BOOLEAN", "COLUMN_NUMERIC", "LV_TIMESPAN", "LV_DOUBLE",
				"COLUMN_STRING", "LV_DATE", "LV_STRING", "UI"));
		this.classMap = classMap;
		this.lobName = lobName;
	}

	public void setOperators() {
		validPrimitiveOperators.addAll(Arrays.asList("==", "&&", "||", "<=", "*", "+", "-", "/", "<", "!=", ">", ">=", "Subtract"));
		validMathematicalOperators.addAll(Arrays.asList( "<=", "*", "+", "-", "/", "<", "!=", ">", ">=", "Subtract"));
		validFunctionalOperators.addAll(Arrays.asList("Round Up Dollar", "Round To Hundredth", "Round To Thousandth",
				"Round To Ten Thousandth", "Not", "Round To Thousand Millionths"));
	}

	public String evaluateExpression(Expression expression, Rule rule,Loop loop, List<Method> subMethodList) {
		String currentRule = rule.getName();
		String leftExpression = null;
		String rightExpression = null;
		rateTableName="";
		if (expression == null) {
			return null;
		}

		if(expressionCharacterContent == null) {
			expressionCharacterContent = expression.getCharacterContent();
		} else {
			expressionCharacterContent = expressionCharacterContent+"\n"+expression.getCharacterContent();
		}

		if (validPrimitiveOperators.contains(expression.getOperatorAsInElement())) {
			if (expression.getExpressions() != null && expression.getExpressions().size() > 0
					&& expression.getExpressions().get(0) instanceof Bracket) {
				if (((Bracket) expression.getExpressions().get(0)).getExpression().getSide().equals("left")) {
					leftExpression = "("
							+ evaluateExpression(((Bracket) expression.getExpressions().get(0)).getExpression(),rule,loop,subMethodList)
							+ ")";
				} else if (((Bracket) expression.getExpressions().get(0)).getExpression().getSide().equals("right")) {
					rightExpression = "("
							+ evaluateExpression(((Bracket) expression.getExpressions().get(0)).getExpression(),rule,loop,subMethodList)
							+ ")";
				}
			}
			if (expression.getExpressions() != null && expression.getExpressions().size() > 1
					&& expression.getExpressions().get(1) instanceof Bracket) {
				if (((Bracket) expression.getExpressions().get(1)).getExpression().getSide().equals("left")) {
					leftExpression = "("
							+ evaluateExpression(((Bracket) expression.getExpressions().get(1)).getExpression(),rule,loop,subMethodList)
							+ ")";
				} else if (((Bracket) expression.getExpressions().get(1)).getExpression().getSide().equals("right")) {
					rightExpression = "("
							+ evaluateExpression(((Bracket) expression.getExpressions().get(1)).getExpression(),rule,loop,subMethodList)
							+ ")";
				}
			}

			if (expression.getLeftExpression() != null) {
				leftExpression = evaluateExpression(expression.getLeftExpression(),rule,loop,subMethodList);
			}

			if (expression.getRightExpression() != null) {
				rightExpression = evaluateExpression(expression.getRightExpression(),rule,loop,subMethodList);
			}
			if(isDateComparison(expression,rule)) {
				Pch parentPch = xmlConstructUtils.findParentPch(expression);
				Method method = getCurrentMethod(subMethodList, parentPch);
				Set<String> exceptions = new HashSet<String>();
				Utils.addParseExceptions(exceptions);
				method.getExceptions().addAll(exceptions);
				return getDateCompareString(leftExpression, expression.getOperatorAsInElement(), rightExpression);
			}else if(isStringComparison(expression, rule)) {
				return getCompareString(leftExpression, expression.getOperatorAsInElement(), rightExpression);
			}else if(null!=expression.getOperatorAsInElement() && expression.getOperatorAsInElement().equals("Subtract")){
				return getDifferenceExp(expression, leftExpression, rightExpression, rule);
				
			}
			else {
				String castType;
				if(null!=expression.getParent() && expression.getParent() instanceof Assign) {
					Assign assignExp = (Assign)expression.getParent();
					castType = Utils.getAssignCastingType(assignExp, dsWrapper, currentRule, assignExp.getlValue());
					return  castType +"("+leftExpression + " " + expression.getOperatorAsInElement() + " " + rightExpression+")";
				}
				return leftExpression + " " + expression.getOperatorAsInElement() + " " + rightExpression;
			}
		} else if (validFunctionalOperators.contains(expression.getOperatorAsInElement())) {
			Expression functionalExpression = ((Bracket) expression.getExpressions().get(0)).getExpression();
			if(expression.getParent() instanceof Assign) {
				Assign assign = (Assign)expression.getParent();
				String dataType = Utils.getDSVariableType(dsWrapper, rule.getName(), assign.getlValue());
				if(!expression.getOperatorAsInElement().equals("Not") && dataType.matches("integer|int")) {
					return  evaluateExpression(functionalExpression,rule,loop,subMethodList);
				}
			}
			
			return functionalOperatorMapping(expression.getOperatorAsInElement())+ "(" + evaluateExpression(functionalExpression,rule,loop,subMethodList) + ")";
		} else if (expression.getExpressions() != null) {
			if (expression.getExpressions().get(0) instanceof Function) {
				Function function = (Function) expression.getExpressions().get(0);
				return getCommaSeperatedArgs(function.getArgs(),currentRule) + ".size()";
			} else if (expression.getExpressions().get(0) instanceof Ratetable) {
				Ratetable ratetable = (Ratetable) expression.getExpressions().get(0);
				if(ratetable.getArgs() != null) {
					return getRatableExpression(currentRule, ratetable);
				}
				return "check_this_ratetable_scenario" ;
			}
		} else if (expression.getExpressions() == null) {
			if (xPathVariableType.contains(expression.getVariableType())) {
				return getXPathExpression(expression, rule, loop);

			} else if (ordinaryVariables.contains(expression.getVariableType())) {
				// calling a pch from another pch like lookup pchs
				PojoClassConstruct pojoClassConstruct = this.classMap.get(rule.getName());
				Pch currentPch = xmlConstructUtils.findParentPch(expression);
				boolean isMethodExist = false;
				if(null != subMethodList && subMethodList.size() > 0) {
					for(Method method : subMethodList) {
						if(method.getMethodName().equals(expression.getCharacterContent())) {
							isMethodExist = true;
						}
					}
				}
				if( !isMethodExist && Utils.isMethodReference(expression.getCharacterContent(),pojoClassConstruct,currentPch)) {
					return getPCHVariableExpression(expression, rule, subMethodList);
					
				}else if( isMethodExist && Utils.isMethodReference(expression.getCharacterContent(),pojoClassConstruct,currentPch)){
					return "this."+expression.getCharacterContent();
				}else {
					Assign assignExp = xmlConstructUtils.findParentAssign(expression);
					if(null!=assignExp) {
						return getAssignExpression(expression, currentRule, assignExp);
					}
					return  getGetterExpression(expression.getCharacterContent(), currentRule , "");
				}
			} else if (expression.getVariableType().equals("CONSTANT")) {
				if (expression.getCharacterContent().equals("Negative 1")) {
					return "-1";
				}
				Assign parentAssign = xmlConstructUtils.findParentAssign(expression);
				if(null!=parentAssign) {
					return getAssignConstantExp(expression, rule, parentAssign);
				}
				if(null!=expression.getParent() && expression.getParent() instanceof Expression) {
					return getConditionalConstantExp(expression, rule, currentRule);
				}
				return expression.getCharacterContent();
			}
			
			return expression.getCharacterContent();
		}
		return null;

	}
    /**
     * This method returns the parameter of a setter methoded
     * @param expression
     * @param currentRule
     * @param assignExp
     * @return
     */
	private String getAssignExpression(Expression expression, String currentRule, Assign assignExp) {
		String castType ="";
		if(null!=assignExp.getVariableType() &&  assignExp.getVariableType().startsWith("LV_")) {
			castType = Utils.getCastType(assignExp.getVariableType());
		}else {
			String rightDataType = Utils.getDSVariableType(dsWrapper, currentRule, expression.getCharacterContent());
			String leftDataType = Utils.getDSVariableType(dsWrapper, currentRule, assignExp.getlValue());
			if(null!= rightDataType && rightDataType.length()>0 && null!=leftDataType && leftDataType.length()>0 && !rightDataType.equals(leftDataType)) {
				castType = Utils.getCastType(leftDataType);
			}
		}
		if(null!= castType && castType.equals("MathHelper.getIntegerValue")) {// For integer no need to cast value
			castType = "";
		}
		return getGetterExpression(expression.getCharacterContent(), currentRule, castType);
	}
    /**
     * Common method for a getter method call in a class
     * @param expression
     * @param currentRule
     * @param castType
     * @return
     */
	private String getGetterExpression(String variableName, String currentRule, String castType) {
		if(null!= castType && castType.equals("")) {
			return "this."+currentRule+".get"+ Utils.handleSpecialVariable(variableName)+"()";
		}else {
			return  castType +"(this."+currentRule+".get"+ Utils.handleSpecialVariable(variableName)+"())";
		}
	}
    /**
     * When one PCH is called from another PCH then that PCH method is not in rule structure.
     * We could not get this from flowchart work flow.
     * So when such method encountered we add those in to rule structure.
     * @param expression
     * @param rule
     * @param subMethodList
     * @return
     */
	private String getPCHVariableExpression(Expression expression, Rule rule, List<Method> subMethodList) {
		Pch currentPch = xmlConstructUtils.findParentPch(expression);
		Scope currentScope = (Scope)currentPch.getParent();
		Pch localPchRef = currentScope.getPch(expression.getCharacterContent());
		String methodName = null;
		if(expression.getCharacterContent().indexOf("(") == -1) {
			methodName = expression.getCharacterContent();
		}else {
			methodName = expression.getCharacterContent().substring(0, expression.getCharacterContent().indexOf("("));
		}
		Method method = new Method();
		method.setMethodName(methodName);

		method.setContainerClass("self");
		
		if(subMethodList.size() > 0) {
			// new method is added before last method to correct the order of execution
			Method previousMethod = subMethodList.get(subMethodList.size() - 1);
			subMethodList.remove(subMethodList.size() - 1);
			subMethodList.add(method);
			subMethodList.add(previousMethod);
		}else {
			subMethodList.add(method);
		}
		PchProcessor pchProcessor = new PchProcessor(this, classMap, rule, dsWrapper, state, version, lobName);
		pchProcessor.processPch(localPchRef, null, null, method, subMethodList);
		if(null!=expression.getVariableType() && null!=Utils.getJavaVariableType(expression.getVariableType())) {
			String variableName = methodName;
			VariableType variableType = new VariableType(Utils.getJavaVariableType(expression.getVariableType()), "local"); // BOPStructure
			Variable variable = new Variable("private", null, variableType, variableName);

			rule.getVariableList().add(variable);
			rule.getVariableMap().put(variableName, variable);
		}
		if (null != method.getMethodBody()
				&& method.getMethodBody().toString().contains("getRateTableLookupValue")) {
			Set<String> exceptions = new HashSet<String>();
			Utils.addRateTableExceptions(exceptions);
			method.setExceptions(exceptions);
		}
		
		return  "this."+methodName;
	}
	/**
	 * Get constant expression used in conditions after casting, such as condition of if
	 * @param expression
	 * @param rule
	 * @param currentRule
	 * @return
	 */
	private String getConditionalConstantExp(Expression expression, Rule rule, String currentRule) {
		String varType;
		Expression parentExp = (Expression)expression.getParent();
		varType = parentExp.getLeftExpression()==null?"":parentExp.getLeftExpression().getVariableType();
		String varName = parentExp.getLeftExpression().getCharacterContent();
		String castingType = "";
		if(null!=varType && varType.length()>0 && null!= expression.getCharacterContent()) {
			castingType = getConstantCastType(rule, varType, varName);
			if(expression.getCharacterContent().equals("null")) {
				castingType = "";
			}else if(null!=expression.getCharacterContent() && isStringANumber(expression.getCharacterContent()) && castingType.equals("MathHelper.getStringValue") && null!=parentExp && null!= parentExp.getOperatorAsInElement() && validMathematicalOperators.contains(parentExp.getOperatorAsInElement())) {
				castingType = "MathHelper.getDoubleValue";
			}
			if(expression.getCharacterContent().trim().equals("\"\"")){
				if(castingType.toLowerCase().contains("double")) {
					return "0.0";
				}else if(castingType.toLowerCase().contains("integer")) {
					return "0";
				}else if(castingType.toLowerCase().contains("date")) {
					return "\"\"";
				}
			}
			if(null != castingType && castingType.length()>0) {
				return castingType +"("+ expression.getCharacterContent()+")";
			}
			return expression.getCharacterContent();
		}
		return expression.getCharacterContent();
	}
	/**
	 * Get constant expression after casting used in assignment statement.
	 * @param expression
	 * @param rule
	 * @param parentAssign
	 * @return
	 */
	private String getAssignConstantExp(Expression expression, Rule rule, Assign parentAssign) {
		String castingType = "";
		String variableType = parentAssign.getVariableType(); 
		String variableName = parentAssign.getlValue();
		castingType = getConstantCastType(rule, variableType, variableName);
		return castingType +"("+ expression.getCharacterContent()+")";
	}
	/**
	 * method to find the cast type of constant
	 * @param rule
	 * @param variableType
	 * @param variableName
	 * @return
	 */
	private String getConstantCastType(Rule rule, String variableType, String variableName) {
			String castingType = "";
			String dataType = "";
			if(null!=variableType &&  variableType.startsWith("LV_")) {
				castingType = Utils.getCastType(variableType);
			}else {
				if(variableType.startsWith("XPATH")) {
					castingType = Utils.getXPathVarType(rule, variableName, dsWrapper);
				}else {
					dataType = Utils.getDSVariableType(dsWrapper, rule.getName(), variableName);
				}
				if(dataType.length()>0) {
					castingType = Utils.getCastType(dataType);
				}
			}
			return castingType;
		}
    /**
     * Return the method of executing pch
     * @param subMethodList
     * @param parentPch
     * @return
     */
	private Method getCurrentMethod(List<Method> subMethodList, Pch parentPch) {
		for(Method method : subMethodList) {
			if(method.getMethodName().equals(parentPch.getName())) {
				return method;
			}
		}
		return null;
	}
	/**
	 * Method checks the expressions in left and right expression is a date comparison
	 * @param expression
	 * @param rule
	 * @return
	 */
	private boolean isDateComparison(Expression expression, Rule rule) {
		Expression leftExpression = expression.getLeftExpression();
		Expression rightExpression = expression.getRightExpression();
		
		String leftCastingType = "";
		String rightCastingType = "";
		
		if(null!=leftExpression && null!=leftExpression.getVariableType() && leftExpression.getVariableType().contains("XPATH")) {
			leftCastingType = Utils.getXPathVarType(rule, leftExpression.getCharacterContent(), dsWrapper);
		}
		if(null!=rightExpression && null!=rightExpression.getVariableType() && rightExpression.getVariableType().contains("XPATH")) {
			rightCastingType = Utils.getXPathVarType(rule, rightExpression.getCharacterContent(), dsWrapper);
		}
		
		if(null!= expression.getOperatorAsInElement() && expression.getOperatorAsInElement().matches("<|>|=|!=|==") && null!=leftExpression && null!=rightExpression) {
			if((null!=leftCastingType && leftCastingType.length()>0 && leftCastingType.toUpperCase().contains("DATE")) || (null!=rightCastingType && rightCastingType.length()>0 && rightCastingType.toUpperCase().contains("DATE"))) {
				return true;
			}
			else if(null!=leftExpression.getVariableType() && null!=rightExpression.getVariableType() && leftExpression.getVariableType().toUpperCase().contains("DATE")||rightExpression.getVariableType().toUpperCase().contains("DATE")) {
				return true;
			}else if(null!=leftExpression.getVariableType() && null!=rightExpression.getVariableType() && leftExpression.getVariableType().toUpperCase().contains("UI")||rightExpression.getVariableType().toUpperCase().contains("UI")) {
			   String leftVarType = Utils.getDSVariableType(dsWrapper, rule.getName(), leftExpression.getCharacterContent());
			   String rightVarType = Utils.getDSVariableType(dsWrapper, rule.getName(), rightExpression.getCharacterContent());
			   if((null!=leftVarType && leftVarType.toUpperCase().contains("DATE")) || (null!=rightVarType && rightVarType.toUpperCase().contains("DATE"))) {
				   return true;
			   }else {
				   return false;
			   }
				
			}
		}
		return false;
	}
	/**
	 * Check the left and right expressions is a string comparison
	 * @param expression
	 * @param rule
	 * @return
	 */
	private boolean isStringComparison(Expression expression, Rule rule) {
		Expression leftExpression = expression.getLeftExpression();
		Expression rightExpression = expression.getRightExpression();
		
		String leftCastingType = "";
		String rightCastingType = "";
		
		if(null!=leftExpression && null!=leftExpression.getVariableType() && leftExpression.getVariableType().contains("XPATH")) {
			leftCastingType = Utils.getXPathVarType(rule, leftExpression.getCharacterContent(), dsWrapper);
		}
		if(null!=rightExpression && null!=rightExpression.getVariableType() && rightExpression.getVariableType().contains("XPATH")) {
			rightCastingType = Utils.getXPathVarType(rule, rightExpression.getCharacterContent(), dsWrapper);
		}
		
		if(null!= expression.getOperatorAsInElement() && expression.getOperatorAsInElement().matches("==|!=") && null!=leftExpression && null!=rightExpression) {
			if((null!=leftCastingType && leftCastingType.length()>0 && leftCastingType.toUpperCase().contains("STRING")) || (null!=rightCastingType && rightCastingType.length()>0 && rightCastingType.toUpperCase().contains("STRING"))) {
				return true;
			}else if(null!=leftExpression.getVariableType() && null!=rightExpression.getVariableType() && leftExpression.getVariableType().toUpperCase().contains("STRING")||rightExpression.getVariableType().toUpperCase().contains("STRING")) {
				return true;
			}else if(null!=leftExpression.getVariableType() && null!=rightExpression.getVariableType() && leftExpression.getVariableType().toUpperCase().contains("UI")||rightExpression.getVariableType().toUpperCase().contains("UI")) {
			   String leftVarType = Utils.getDSVariableType(dsWrapper, rule.getName(), leftExpression.getCharacterContent());
			   String rightVarType = Utils.getDSVariableType(dsWrapper, rule.getName(), rightExpression.getCharacterContent());
			   if((null!=leftVarType && leftVarType.matches("varbinary|nvarchar|nchar|uniqueidentifier")) || (null!=rightVarType && rightVarType.matches("varbinary|nvarchar|nchar|uniqueidentifier"))) {
				   return true;
			   }else {
				   return false;
			   }
				
			}
		}
		return false;
	}
	/**
	 * method return a date compare expression in java
	 * @param leftExpression
	 * @param operator
	 * @param rightExpression
	 * @return
	 */
	private String getDateCompareString(String leftExpression,String operator,String rightExpression) {
		if(rightExpression.equals("\"\"") || rightExpression.equals("null")) {
			rightExpression = null;
			return leftExpression+" "+operator+" null";
		}
		return leftExpression+".compareTo("+rightExpression+")"+operator+"0";
	}
	/**
	 * Method returns a String compare expression in java
	 * @param leftExpression
	 * @param operator
	 * @param rightExpression
	 * @return
	 */
	private String getCompareString(String leftExpression,String operator,String rightExpression) {
		if(rightExpression.equals("null")) {
			return leftExpression+" "+operator+" null";
		}else {
			if(operator.equals("!=")) {
				return "!"+leftExpression+".equals("+rightExpression+")";
			}else {
				return leftExpression+".equals("+rightExpression+")";
			}
		}
		
	}
	/**
	 * If a subtract keyword is encountered in alg, if it is subtracting two dates then function
	 * returns a date subtract expression in java other wise returns a normal subtraction
	 * @param expression
	 * @param leftExpression
	 * @param rightExpression
	 * @param rule
	 * @return
	 */
	private String getDifferenceExp(Expression expression, String leftExpression, String rightExpression, Rule rule) {
		if(null!=expression.getLeftExpression() && expression.getLeftExpression().getVariableType().contains("DATE")) {
			if(expression.getLeftExpression().getCharacterContent().endsWith(".Date")) {
				leftExpression = getActualDateExpression(expression.getLeftExpression().getCharacterContent(), rule);
			}
			if(null!=expression.getRightExpression() && expression.getRightExpression().getCharacterContent().endsWith(".Date")) {
				rightExpression = getActualDateExpression(expression.getRightExpression().getCharacterContent(), rule);
			}
			return "Math.abs(("+leftExpression+".getTime() - "+rightExpression+".getTime())/86400000)";
		}else {
			return leftExpression+" - "+rightExpression;
		}
	}
 /**
  * The variable name in "Subtract" operator is came with.date at the end.
  * So we removed those .date extension
  * @param variableName
  * @param rule
  * @return
  */
	private String getActualDateExpression(String variableName, Rule rule) {
		String expression;
		String actualVariable = variableName.substring(0,variableName.indexOf(".Date"));
		expression = "this."+rule.getName()+".get"+Utils.handleSpecialVariable(actualVariable)+"()";
		return expression;
	}
	/**
	 * Method return a java statement of xpath expressions
	 * @param expression
	 * @param rule
	 * @param loop
	 * @return
	 */
	private String getXPathExpression(Expression expression, Rule rule, Loop loop) {
		String currentRule = rule.getName();
		String[] splitVariables = expression.getCharacterContent().split("/");
		List<String> validVariables = new ArrayList<String>();
		String castingType ="";
		String loopNode = null;
		Rule parentRule = rule;
		for(String variable : splitVariables) {
			if(variable.equals("..")) {
				if(null!=parentRule) {
					parentRule = parentRule.getParent();
				}
				continue;
			}
			else {
				validVariables.add(variable);
			}
		}
		
		if(validVariables.size() > 0) {
			if(parentRule==null) {
				castingType = Utils.getCommonPolicyVarType(validVariables.get(validVariables.size()-1));
			}
			if (null!=loop) {
				int loopThroughLen = loop.getThrough().length();
				//character content and loop through are same
				if(expression.getCharacterContent().contains(loop.getThrough())) {
					if(loop.getThrough().equals(expression.getCharacterContent())) {
						loopNode = validVariables.get(validVariables.size()-1);
					}else {
						loopNode = expression.getCharacterContent().substring((loopThroughLen+1), expression.getCharacterContent().length());	
					}
				}
				
			}
		}
		String xpathNode = expression.getCharacterContent();
		if(validVariables.size() > 0) {
			String dsColumnName = validVariables.get(validVariables.size()-1);
			String dsTableName = "";
			if(null!=parentRule) {
				dsTableName = parentRule.getName();
			}else {
				dsTableName = currentRule;
			}
			
			if(null!=validVariables && validVariables.size()>=2) {
				dsTableName = validVariables.get(validVariables.size()-2);
			}
			if(castingType.length() == 0) {
				if(dsTableName.contains("ancestor::")) {
					castingType = Utils.getCastType(expression.getVariableType());
//					if(null!=expression.getVariableType() && expression.getVariableType().equals("XPATH_NUMERIC")) {
//						 dsTableName = getAncestorName(dsTableName);
//						 if(null!=dsTableName) {
//							 String varType = Utils.getDSVariableType(dsWrapper, dsTableName, dsColumnName);
//							 castingType = Utils.getCastType(varType);	
//						 }
//					}
					
					
				}else {
					String varType = Utils.getDSVariableType(dsWrapper, dsTableName, dsColumnName);
					castingType = Utils.getCastType(varType);	
				
				}
			}
			//for null checking we can avoid conversion
			if(null!= expression.getParent() && expression.getParent() instanceof Expression) {
				Expression parentExpression = (Expression)expression.getParent();
				if(null!=parentExpression.getRightExpression()) {
					String content =  parentExpression.getRightExpression().getCharacterContent();
					if(null!=content && content.equals("null")) {
						castingType = "";
					}else if(null!=content && isStringANumber(content) && castingType.equals("MathHelper.getStringValue") && null!= parentExpression.getOperatorAsInElement() && validMathematicalOperators.contains(parentExpression.getOperatorAsInElement())) {
						castingType = "MathHelper.getDoubleValue";
					}
				}
			}
			Loop parentLoop = xmlConstructUtils.findParentLoop(expression);
			if(null!=parentLoop) {
				xpathNode = validVariables.get(validVariables.size()-1);
						
			}
		}
		if(validVariables != null && validVariables.size() >=1) {
			if (null!=loopNode){
				return getCastedXpathPolicyExpression(castingType, loopNode);
			}else {
				return getCastedXpathExpression(currentRule, castingType, xpathNode);
			}
		}
		return  expression.getCharacterContent() ;
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public boolean isStringANumber(String str) {
        String regularExpression = "[-+]?[0-9]*\\.?[0-9]+$";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
                
    }
	private String getAncestorName(String dsTableName) {
		
		int firstIdx = dsTableName.indexOf("'");
		int secondIdx = dsTableName.indexOf("'", firstIdx + 1);
		
		dsTableName = dsTableName.substring(firstIdx+1, secondIdx);
		return dsTableName;
	}

	private String getCastedXpathPolicyExpression(String castingType, String loopNode) {
		return "("+castingType+"(XpathNode.selectNodeValue(policy"+",\""+ Utils.handleXPathSpecialVariable(loopNode)+"\")))";
	}

	private String getCastedXpathExpression(String currentRule, String castType, String xpathNode) {
		if(null!=castType && castType.length()>0) {
			return "("+castType+"(XpathNode.selectNodeValue(this."+currentRule+",\""+ Utils.handleXPathSpecialVariable(xpathNode) +"\")))";
		}else {
			return "(XpathNode.selectNodeValue(this."+currentRule+",\""+ Utils.handleXPathSpecialVariable(xpathNode) +"\"))";
		}
	}
	/**
	 * method returns a java expression for a rate table reference
	 * @param currentRule
	 * @param ratetable
	 * @return
	 */
	private String getRatableExpression(String currentRule, Ratetable ratetable) {
		String arguments = "";
		for(Argument arg:ratetable.getArgs()) {
			if(arg.getVariableType().equals("CONSTANT")){
				arguments = arguments +"String.valueOf("+arg.getCharacterContent()+")"+",";
			}else if(arg.getVariableType().contains("XPATH")) {
				arguments = arguments +"String.valueOf"+getCastedXpathExpression(currentRule, "", arg.getCharacterContent().trim())+",";
			}else {
				arguments = arguments +"String.valueOf("+getGetterExpression(arg.getCharacterContent().trim(), currentRule, "")+")"+",";
			}
		}
		if (arguments != null && arguments.length() > 0 && arguments.charAt(arguments.length() - 1) == ',') {
			arguments = arguments.substring(0, arguments.length() - 1);
		}
		String variableName = getVariable(ratetable);
		Assign assignExp = xmlConstructUtils.findParentAssign(ratetable);
		String castType = "";
		if(null!=assignExp) {
			if(null!=assignExp.getVariableType() &&  assignExp.getVariableType().startsWith("LV_")) {
				castType = Utils.getCastType(assignExp.getVariableType());
				return getCastedRateTableExpression(ratetable, arguments, castType);
			}
		}
		String varType = Utils.getDSVariableType(dsWrapper, currentRule, variableName);
		castType = Utils.getCastType(varType);
		return getCastedRateTableExpression(ratetable, arguments, castType);
		
	}
	/**
	 * 
	 * @param ratetable
	 * @param arguments
	 * @param castType
	 * @return
	 */
	private String getCastedRateTableExpression(Ratetable ratetable, String arguments, String castType) {
		return  castType +"((String)RateTableLookup.getRateTableLookupValue(\""+ratetable.getCode().trim()+"\","+arguments+"))";
	}
	/**
	 * 
	 * @param args
	 * @param currentRule
	 * @return
	 */
	private String getCommaSeperatedArgs(List<Argument> args,String currentRule) {
		String commaSeperatedArgs = "";
		for (Argument arg : args) {
			if (commaSeperatedArgs.length() == 0) {
				commaSeperatedArgs += decoratingArguments(arg,currentRule);
			} else {
				commaSeperatedArgs += ", " + decoratingArguments(arg,currentRule);
			}
		}
		return commaSeperatedArgs;
	}
	/**
	 * 
	 * @param arg
	 * @param currentRule
	 * @return
	 */
	private String decoratingArguments(Argument arg,String currentRule) {
		String referenceClass = xmlConstructUtils.findParentReference(arg).getDbTables();
		Loop loop = null;
		if (arg.getVariableType() != null && arg.getVariableType().equals("XPATH")
				|| xPathVariableType.contains(arg.getVariableType())) {
			loop = xmlConstructUtils.findParentLoop(arg);
		}
		String reference = createDomainVariableName(referenceClass);
		if (arg.getVariableType() == null && arg.getParent() instanceof Function) {
			return "XpathNode.selectNodes(this." + currentRule + ",\"" + Utils.handleXPathSpecialVariable(arg.getCharacterContent().trim()) + "\")";
		}
		if (xPathVariableType.contains(arg.getVariableType())) {
			if (loop != null) {
				if (arg.getCharacterContent().contains(loop.getThrough().trim())) {
					String newCharacterContent = arg.getCharacterContent().replace(loop.getThrough().trim() + "/", "")
							.trim();

					return "XpathNode.selectNodeValue(this." + currentRule + ",\"" + Utils.handleXPathSpecialVariable(newCharacterContent) + "\")";
				}
			}

			return "XpathNode.selectNodeValue(this." + currentRule + ",\"" + Utils.handleXPathSpecialVariable(arg.getCharacterContent().trim()) + "\")";
		} else if (ordinaryVariables.contains(arg.getVariableType())) {
			return reference + "." + arg.getCharacterContent().trim();
		} else if (arg.getVariableType().equals("CONSTANT")) {
			return arg.getCharacterContent().trim();
		} else if (arg.getVariableType().equals("XPATH") && arg.getParent() instanceof Ratetable) {
			return "XpathNode.selectNodeValue(this." + currentRule + ",\"" + Utils.handleXPathSpecialVariable(arg.getCharacterContent().trim()) + "\")";
		}
		return arg.getCharacterContent().trim();
	}
	/**
	 * 
	 * @param parentDomainImport
	 * @return
	 */
	public String createDomainVariableName(String parentDomainImport) {
		return "this." + StringUtils.uncapitalize(parentDomainImport);
	}
	/**
	 * 
	 * @param functionalOperator
	 * @return
	 */
	private String functionalOperatorMapping(String functionalOperator) {
		Map<String, String> functionalOperatorMap = new HashMap<String, String>();
		functionalOperatorMap.put("Round Up Dollar", "MathHelper.roundUpDoller");
		functionalOperatorMap.put("Round To Hundredth", "MathHelper.roundToHundred");
		functionalOperatorMap.put("Round To Thousandth", "MathHelper.roundToThousand");
		functionalOperatorMap.put("Round To Ten Thousandth", "MathHelper.roundToTenThousand");
		functionalOperatorMap.put("Round To Thousand Millionths", "MathHelper.roundToThousandMillion");
		functionalOperatorMap.put("Not", "!");
		if (functionalOperatorMap.containsKey(functionalOperator)) {
			return functionalOperatorMap.get(functionalOperator);
		} else {
			return functionalOperator;
		}
	}
	/**
	 * 
	 * @return
	 */
	public static String getExpressionCharacterContent() {
		return expressionCharacterContent;
	}
	/**
	 * 
	 * @param expressionCharacterContent
	 */
	public static void setExpressionCharacterContent(String expressionCharacterContent) {
		ExpressionEvaluator.expressionCharacterContent = expressionCharacterContent;
	}
	/**
	 * 
	 * @return
	 */
	public String getRateTableName() {
		return rateTableName;
	}
	/**
	 * 
	 * @param rateTableName
	 */
	public void setRateTableName(String rateTableName) {
		this.rateTableName = rateTableName;
	}
	/**
	 * 
	 * @param xmlConstruct
	 * @return
	 */
	private String getVariable(XmlConstruct xmlConstruct) {
		if(xmlConstruct.getParent() instanceof Assign){
			Assign assignNode =(Assign) xmlConstruct.getParent();
			return assignNode.getlValue();
		}else if(xmlConstruct.getParent() instanceof Expression){
			Expression condition = (Expression)xmlConstruct.getParent();
			if(null!=condition.getLeftExpression()) {
				return condition.getLeftExpression().getCharacterContent();
			}else {
				return getVariable(xmlConstruct.getParent());
			}
			
		}else {
			return getVariable(xmlConstruct.getParent());
		}
	}

}
