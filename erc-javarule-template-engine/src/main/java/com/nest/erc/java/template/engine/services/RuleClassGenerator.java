package com.nest.erc.java.template.engine.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nest.erc.domain.alg.Method;
import com.nest.erc.domain.alg.Rule;
import com.nest.erc.domain.alg.Variable;
import com.nest.erc.domain.alg.VariableType;
import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.impl.ClassComponent;
import com.nest.erc.domain.alg.impl.FlowClass;
import com.nest.erc.domain.alg.impl.FlowVariable;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.util.Utils;
import com.nest.erc.java.template.engine.dto.ClassMethodDTO;


@Service
public class RuleClassGenerator {

	
	static Logger logger = Logger.getLogger(RuleClassGenerator.class);
	String fileName;
	Utils commonUtils = new Utils();
	
	public Map<String,Rule>  createRuleClass(Reference flowChart){
		List<FlowClass> flowClassList = flowChart.getClasses();
		Map<String,Rule> ruleClasses = new HashMap<String,Rule>();
		if(null!=flowClassList){
			processFlowClass(flowClassList,ruleClasses);
		}
		
		return ruleClasses;

		
	
	}

	private Map<String,Rule>  processFlowClass(List<FlowClass> flowClassList,Map<String,Rule> ruleClasses) {
		
		for(FlowClass flowClass:flowClassList){
			if(null!=flowClass){
				Map<String,Rule> rules = new HashMap<String,Rule>();
				rules = processSubComponents(rules, flowClass);
				ruleClasses.putAll(rules);
			}
			
		}
		return ruleClasses;
	}

	private Map<String, Rule>  processSubComponents1(Map<String, Rule> rules, XmlConstruct xmlConstruct) {
		String premiumMethodName = "";
		if(xmlConstruct instanceof FlowClass){
			FlowClass flowclass = (FlowClass)xmlConstruct;
			if(null!= flowclass.getType() && flowclass.getType().matches("Premium Calculation|Common Rating")){
				Rule rule = getRule(flowclass);
				rules.put(flowclass.getName(), rule);
				/*
				 * if(flowclass.getName().equals("BOPLocation")) { System.out.println("here"); }
				 */
				Method method = new Method();
				if(flowclass.getType().matches("Premium Calculation")) {
					
					premiumMethodName = "ProcessPremium1";
					for(Method method1: rule.getMethodList()) {
						if(method1.getMethodName().contains("ProcessPremium")) {
							String methodCount = method1.getMethodName().substring(method1.getMethodName().length() - 1);
							premiumMethodName = method.getMethodName().substring(0, method.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							premiumMethodName = premiumMethodName+count;
						}
					}
					
					method.setMethodName(premiumMethodName);
					method.setContainerClass("self");
					rule.getMethodList().add(method);
				}
				if(flowclass.getType().matches("Common Rating")) {
					
					String newMethodNameCr = "CommonRating1";
					for(Method method1: rule.getMethodList()) {
						if(method1.getMethodName().contains("CommonRating")) {
							String methodCount = method1.getMethodName().substring(method1.getMethodName().length() - 1);
							newMethodNameCr = method.getMethodName().substring(0, method.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							newMethodNameCr = newMethodNameCr+count;
						}
					}
					
					method.setMethodName(newMethodNameCr);
					method.setContainerClass("self");
					//rule.getMethodList().add(method);
				}
				
				if(null!=flowclass.getParent()) {
					if(flowclass.getParent() instanceof FlowClass) {
						createSubRulesAndMethodRefrence(rules, flowclass, rule,method.getMethodName());
					}
				}
			}
			if(null!=flowclass.getSubComponents() && flowclass.getSubComponents().size()>0){
				for(XmlConstruct xmlConstruct1:flowclass.getSubComponents()){
					processSubComponents(rules, xmlConstruct1);
				}
			}
  	}else if (xmlConstruct instanceof ClassComponent){
		ClassComponent classComponent = (ClassComponent)xmlConstruct;
		if(null!= classComponent.getElementName() && classComponent.getElementName().equals("rating")) {
			if(classComponent.getType().equals("Common Rating")) {
				if(null!=classComponent.getParent()) {
					FlowClass flowClassParent = (FlowClass)classComponent.getParent();
					Rule rule = rules.get(flowClassParent.getName());
			
					// get method name
					String newMethodName1 = "CommonRating1";
					for(Method method : rule.getMethodList()) {
						if(method.getMethodName().contains("CommonRating")) {
							String methodCount = method.getMethodName().substring(method.getMethodName().length() - 1);
							newMethodName1 = method.getMethodName().substring(0, method.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							newMethodName1 = newMethodName1+count;
						}
					}
					Method method = new Method();
					method.setMethodName(newMethodName1);
					method.setContainerClass("self");
					List<Method> subMethodList = new ArrayList<Method>();
					if(null!=classComponent.getVariables()) {
						for(FlowVariable variable:classComponent.getVariables()) {
							if(null!=variable) {
								Method subMethod = new Method();
								subMethod.setMethodName(variable.getName());
								subMethodList.add(subMethod);
							}
						}
			
					}
					method.setSubMethods(subMethodList);
					rule.getMethodList().add(method);
				}
			}
		//System.out.println("herte");
		}
//		//Premium calculation
//
//		if(null!= classComponent.getElementName() && classComponent.getElementName().equals("premium")) {
//		if(classComponent.getType().equals("Premium Calculation")) {
//		if(null!=classComponent.getParent()) {
//		FlowClass flowClassParent = (FlowClass)classComponent.getParent();
//		Rule rule = rules.get(flowClassParent.getName());
//
//		// get method name
//		String newMethodName = "ProcessPremium1";
//		for(Method method : rule.getMethodList()) {
//		if(method.getMethodName().contains("ProcessPremium")) {
//		String methodCount = method.getMethodName().substring(method.getMethodName().length() - 1);
//		newMethodName = newMethodName+Integer.parseInt(methodCount);
//		}
//		}
//
//
//		Method method = new Method();
//		method.setMethodName(newMethodName);
//		List<Method> subMethodList = new ArrayList<Method>();
//		if(null!=classComponent.getVariables()) {
//		for(FlowVariable variable:classComponent.getVariables()) {
//		if(null!=variable) {
//		Method subMethod = new Method();
//		subMethod.setMethodName(variable.getName());
//		subMethodList.add(subMethod);
//		}
//		}
//
//		}
//		method.setSubMethods(subMethodList);
//		rule.getMethodList().add(method);
//		}
//		}
//		//System.out.println("herte");
	}
		
		return rules;
		}
	
	private Map<String, Rule>  processSubComponents(Map<String, Rule> rules, XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof FlowClass){
			FlowClass flowclass = (FlowClass)xmlConstruct;
			if(null!= flowclass.getType() && flowclass.getType().matches("Premium Calculation|Common Rating")){
				Rule rule = rules.get(flowclass.getName());
				if(null==rule) {
				  rule = getRule(flowclass);
				  rules.put(flowclass.getName(), rule);
				}
				
				
				/*
				 * if(flowclass.getName().equals("BOPLocation")) { 

.out.println("here"); }
				 */
				Method method = new Method();
				if(flowclass.getType().matches("Premium Calculation")) {
					
					String premiumMethodName = "ProcessPremium1";
					for(Method method1: rule.getMethodList()) {
						if(method1.getMethodName().contains("ProcessPremium")) {
							String methodCount = method1.getMethodName().substring(method1.getMethodName().length() - 1);
							premiumMethodName = method1.getMethodName().substring(0, method1.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							premiumMethodName = premiumMethodName+count;
						}
					}
					
					method.setMethodName(premiumMethodName);
					method.setContainerClass("self");
					rule.getMethodList().add(method);
					
					//Adding new instance variable for domain class
					
					String variableName = flowclass.getName();
				    VariableType variableType = new VariableType(flowclass.getName(),null); //BOPStructure
				    Variable variable = new Variable("private",null,variableType,variableName);
		
				    rule.getVariableList().add(variable);
				    rule.getVariableMap().put(variableName, variable);
				}
				if(flowclass.getType().matches("Common Rating")) {
					
					String newMethodNameCr = "CommonRating1";
					for(Method method1: rule.getMethodList()) {
						if(method1.getMethodName().contains("CommonRating")) {
							String methodCount = method1.getMethodName().substring(method1.getMethodName().length() - 1);
							newMethodNameCr = method1.getMethodName().substring(0, method1.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							newMethodNameCr = newMethodNameCr+count;
						}
					}
					
					method.setMethodName(newMethodNameCr);
					method.setContainerClass("self");
					rule.getMethodList().add(method);
				}
				
				if(null!=flowclass.getParent()) {
					if(flowclass.getParent() instanceof FlowClass) {
						createSubRulesAndMethodRefrence(rules, flowclass, rule,method.getMethodName());
					}
				}
			}
			if(null!=flowclass.getSubComponents() && flowclass.getSubComponents().size()>0){
				for(XmlConstruct xmlConstruct1:flowclass.getSubComponents()){
					processSubComponents(rules, xmlConstruct1);
				}
			}
  	}else if (xmlConstruct instanceof ClassComponent){
		ClassComponent classComponent = (ClassComponent)xmlConstruct;
		if(null!= classComponent.getElementName() && classComponent.getElementName().equals("rating")) {
			if(classComponent.getType().equals("Common Rating")) 
				if(null!=classComponent.getParent()) {
					FlowClass flowClassParent = (FlowClass)classComponent.getParent();
					Rule parentRule = rules.get(flowClassParent.getName());
					Method parentMethod = null;
					if(null!=parentRule) {
						parentMethod = parentRule.getMethodList().get(parentRule.getMethodList().size()-1);
					}
			
					// get method name
					String newMethodName1 = parentMethod.getMethodName()+"_CommonRatingSub1";
					for(Method method : parentMethod.getSubMethods()) {
						if(method.getMethodName().contains(parentMethod.getMethodName()+"_CommonRatingSub")) {
						String methodCount = method.getMethodName().substring(method.getMethodName().length() - 1);
							newMethodName1 = method.getMethodName().substring(0, method.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							newMethodName1 = newMethodName1+count;
						}
					}
					Method method = new Method();
					method.setMethodName(newMethodName1);
					method.setContainerClass("self");
					
					
					List<Method> subMethodList = new ArrayList<Method>();
					if(null!=classComponent.getVariables()) {
						for(FlowVariable variable:classComponent.getVariables()) {
							if(null!=variable) {
								Method subMethod = new Method();
								subMethod.setMethodName(variable.getName());
								subMethod.setContainerClass("self");
								subMethodList.add(subMethod);
							}
						}
			
					}
					method.getSubMethods().addAll(subMethodList);
					if(null!=parentMethod) {
						parentMethod.getSubMethods().add(method);
					}
					
				}
			}
		if(null!= classComponent.getElementName() && classComponent.getElementName().equals("premium")) {
			if(classComponent.getType().equals("Premium Calculation")) 
				if(null!=classComponent.getParent()) {
					FlowClass flowClassParent = (FlowClass)classComponent.getParent();
					Rule parentRule = rules.get(flowClassParent.getName());
					Method parentMethod = null;
					if(null!=parentRule) {
						parentMethod = parentRule.getMethodList().get(parentRule.getMethodList().size()-1);
					}
			
					// get method name
					String newMethodName1 = "ProcessPremiumSub1";
					for(Method method : parentMethod.getSubMethods()) {
						if(method.getMethodName().contains("ProcessPremiumSub")) {
						String methodCount = method.getMethodName().substring(method.getMethodName().length() - 1);
							newMethodName1 = method.getMethodName().substring(0, method.getMethodName().length() - 1);
							int count = (Integer.parseInt(methodCount)+1);
							newMethodName1 = newMethodName1+count;
						}
					}
					Method method = new Method();
					method.setMethodName(newMethodName1);
					method.setContainerClass("self");
					
					
					List<Method> subMethodList = new ArrayList<Method>();
					if(null!=classComponent.getVariables()) {
						for(FlowVariable variable:classComponent.getVariables()) {
							if(null!=variable) {
								Method subMethod = new Method();
								subMethod.setMethodName(variable.getName());
								subMethod.setContainerClass("self");
								subMethodList.add(subMethod);
							}
						}
			
					}
					method.getSubMethods().addAll(subMethodList);
					if(null!=parentMethod) {
						parentMethod.getSubMethods().add(method);
					}
					
				}
			}
		}

	
		
		return rules;
		}


	private String getMethodName(Rule rule,String methodName) {
		String newMethodName=methodName+"1";
		for(Method method : rule.getMethodList()) {
			if(method.getMethodName().contains(methodName)) {
				String methodCount = method.getMethodName().substring(method.getMethodName().length() - 1);
				newMethodName = newMethodName+Integer.parseInt(methodCount);
			}
		}
		return newMethodName;
	}

	private void createSubRulesAndMethodRefrence(Map<String, Rule> rules, FlowClass flowclass, Rule rule, String methodName) {
		FlowClass parentClass = (FlowClass)flowclass.getParent();
		Rule parentRule = rules.get(parentClass.getName());
		if(null!=parentRule) {
			Method parentMethod = parentRule.getMethodList().get(parentRule.getMethodList().size()-1);
			parentRule.getSubRules().add(rule);
			Method subMethod = new Method();
			subMethod.setMethodName(methodName);
			subMethod.setContainerClass(rule.getName());
			if(null!=parentMethod) {
				parentMethod.getSubMethods().add(subMethod);
			}
			
			//Adding new instance variable for domain class
			String variableName = flowclass.getName()+"List";
			VariableType variableType = new VariableType("List",flowclass.getName()); //List<BOPStructure>
			Variable variable = new Variable("private",null,variableType,variableName);
			parentRule.getVariableList().add(variable);
			parentRule.getVariableMap().put(variableName, variable);
			
			//Adding new instance variable for rule class
			
			variableName = flowclass.getName()+"Rule";
		    variableType = new VariableType(flowclass.getName(),null); //BOPStructure
		    variable = new Variable("private",null,variableType,variableName);
			parentRule.getVariableList().add(variable);
			parentRule.getVariableMap().put(variableName, variable);
			
			
		}
		
	}
	private void createSubRulesAndMethodRefrence1(Map<String, Rule> rules, FlowClass flowclass, Rule rule, String methodName) {
		FlowClass parentClass = (FlowClass)flowclass.getParent();
		Rule parentRule = rules.get(parentClass.getName());
		if(null!=parentRule) {
			parentRule.getSubRules().add(rule);
			Method parentMethod = new Method();
			parentMethod.setMethodName(methodName);
			parentMethod.setContainerClass(rule.getName());
			if(null!=parentRule.getMethodList()) {
				parentRule.getMethodList().add(parentMethod);
			}
		}
		
	}
	
	private Rule getRule(FlowClass flowClass){
		Rule rule = new Rule();
		rule.setName(flowClass.getName());
		return rule;
	}
	

	public void generateRuleClasses(Map<String, Rule> ruleClasses, String projectMainPackageStructure, String classFilePath,String lobName) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		for (Map.Entry<String, Rule> entry : ruleClasses.entrySet()) {
			if (null != entry.getKey()) {
				
				List<String> classPackages = new ArrayList<String>();
				classPackages.add("com.nest.res.common.exception.LookupException");
				classPackages.add("com.nest.res.common.rule.PolicyRule");
				classPackages.add("com.nest.res.common.domain.Policy");
				classPackages.add("com.nest.res.common.lookup.service.RateTableLookup");
				classPackages.add("com.nest.res.common.util.MathHelper");
				classPackages.add("com.nest.res.common.util.XpathNode");
				
				
				
				classPackages.add("java.util.List");
				
					Rule rule = entry.getValue();
					
					 if(null!=rule.getVariableMap() && rule.getVariableMap().size()>0) {
						 List<String> memberVariableList = new ArrayList<String>();
						 for (Map.Entry<String,Variable> varEntry : rule.getVariableMap().entrySet())  {
							 Variable variable= varEntry.getValue();
							 
							 if (variable.getVariableName().equalsIgnoreCase("entry.getKey()")) {
									classPackages.add("com.nest.res."+ lobName.toLowerCase() +".domain."+variable.getVariableType().getType());
								}
							 
							 StringBuilder memberVariable = new StringBuilder();
							 
								if (variable.getVariableType().getName().equalsIgnoreCase("List")) {
									memberVariable.append("List<");
									memberVariable.append(variable.getVariableType().getType());
									memberVariable.append("> ");
									memberVariable.append(variable.getVariableName());
									classPackages.add("com.nest.res."+ lobName.toLowerCase() +".domain."+variable.getVariableType().getType());
								} else {
									memberVariable.append("com.nest.res."+ lobName.toLowerCase() +".rules.");
									memberVariable.append(variable.getVariableType().getName());
									memberVariable.append(" ");
									memberVariable.append(variable.getVariableName());
									
									
								}
								
								memberVariableList.add(memberVariable.toString());
								
								 
						 
						 }

						 dataMap.put("classPackages", classPackages);

						dataMap.put("membervariablelist", memberVariableList);
					 }
					
					
					Set<ClassMethodDTO> classMethodDTOList = new HashSet<ClassMethodDTO>();
					 for(Method method:rule.getMethodList()) {
						 ClassMethodDTO methodDTO = createClassMethodDTO(method);
						 if (!method.getSubMethods().isEmpty()) {
							 methodDTO = createClassMethodDTOBody(method.getSubMethods(), methodDTO);
						 }
						 if (!isExists(methodDTO, classMethodDTOList)) {
							 classMethodDTOList.add(methodDTO);
						 }
						 
						 
						 for(Method subMethod:method.getSubMethods()) {
							 ClassMethodDTO subMethodDTO = createClassMethodDTO(subMethod);
							 if (!subMethod.getSubMethods().isEmpty()) {
								 subMethodDTO = createClassMethodDTOBody(subMethod.getSubMethods(), subMethodDTO);
							 }
							 
							 if (!isExists(subMethodDTO, classMethodDTOList)) {
								 classMethodDTOList.add(subMethodDTO);
							 }
							 for(Method subMethod1:subMethod.getSubMethods()) {
								 ClassMethodDTO subMethodDTO1 = createClassMethodDTO(subMethod1);
								 if (!subMethod1.getSubMethods().isEmpty()) {
									 subMethodDTO1 = createClassMethodDTOBody(subMethod1.getSubMethods(), subMethodDTO1);
								 }
								 if (!isExists(subMethodDTO1, classMethodDTOList)) {
									 classMethodDTOList.add(subMethodDTO1);
								 }
							 }
						 }
						 
					 }
					 dataMap.put("classmethods", classMethodDTOList);
				
				
				
				
				//To Do Eldho

				/*
				 * ruleprojectGeneratorService.generateRuleClasses(projectMainPackageStructure,
				 * entry.getKey(), classFilePath, "/"+ lobName.toLowerCase() +"/rules",
				 * dataMap);
				 */

			}
		}
	}
	
	private ClassMethodDTO createClassMethodDTO(Method method) {
		ClassMethodDTO dto = new ClassMethodDTO();

		if ("self".equalsIgnoreCase(method.getContainerClass())) {
			dto.setAccessSpecifier("public");
			dto.setReturnType("void");
			if(method.getMethodName().contains("/") || method.getMethodName().contains("..")) {
				//System.out.println(method.getMethodName());
			}
			dto.setMethodName(method.getMethodName().replace("/", "Slash"));
			dto.setReturnValue("");

		} else {
			if(method.getMethodName().contains("/") || method.getMethodName().contains("..")) {
				//System.out.println(method.getMethodName());
			}
			dto.setAccessSpecifier("public");
			dto.setReturnType(method.getContainerClass());
			dto.setMethodName(method.getContainerClass()+"_"+method.getMethodName().replace("/", "Slash"));
			dto.setReturnValue("return null;");
		}
		return dto;
	}
	
	private ClassMethodDTO createClassMethodDTOBody(List<Method> methodList, ClassMethodDTO classMethodDTO) {
		StringBuilder bodyBuilder = new StringBuilder();
		for (Method method : methodList) {
			
			if(method.getMethodName().contains("/") || method.getMethodName().contains("..")) {				
				method.setMethodName(method.getMethodName().replace("/", "_"));
				method.setMethodName(method.getMethodName().replace("..", ""));
			}
			if ("self".equalsIgnoreCase(method.getContainerClass())) {
				bodyBuilder.append(method.getMethodName().replace("/", "Slash")+"();\n\t");
			 }
			 else {
				bodyBuilder.append(method.getContainerClass()+"Rule."+method.getMethodName().replace("/", "Slash")+"();\n");
			 }
		}
		classMethodDTO.setBody(bodyBuilder.toString()+"");
		return classMethodDTO;
	}
	
	private boolean isExists(ClassMethodDTO dto, Set<ClassMethodDTO> classMethodDTOList) {
		
		for (ClassMethodDTO classMethodDTO : classMethodDTOList) {
			if (StringUtils.compare(dto.getAccessSpecifier(), classMethodDTO.getAccessSpecifier()) == 0 && StringUtils.compare(dto.getReturnType(), classMethodDTO.getReturnType()) == 0
					&& StringUtils.compare(dto.getMethodName(), classMethodDTO.getMethodName()) == 0) {
				return true;
			}
		}
		return false;
	}
	
	 
}
