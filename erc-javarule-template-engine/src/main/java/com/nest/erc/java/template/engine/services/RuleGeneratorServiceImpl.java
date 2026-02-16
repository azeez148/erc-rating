package com.nest.erc.java.template.engine.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.Method;
import com.nest.erc.domain.alg.Rule;
import com.nest.erc.domain.alg.Variable;
import com.nest.erc.domain.alg.VariableType;
import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.impl.ClassComponent;
import com.nest.erc.domain.alg.impl.FlowClass;
import com.nest.erc.domain.alg.impl.FlowVariable;
import com.nest.erc.domain.alg.impl.Pch;
import com.nest.erc.domain.alg.impl.Reference;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.util.Utils;
import com.nest.erc.domain.util.XmlConstructUtils;
import com.nest.erc.java.template.engine.dto.ClassMethodDTO;
import com.nest.erc.java.template.engine.utils.PchProcessor;
import com.nest.erc.java.template.engine.utils.RuleTemplateEngine;
import com.nest.erc.java.template.engine.utils.TemplateEngineUtils;

/**
 * This class is used to
 * 1. After reading erc parser output it create a rule structure map.
 *    Having a map key as string "java class name" and value as object "Rule"
 *    Inside the rule object is contains all variables and member methods structure of that java class
 *    
 * 2. Iterating this Rule map create a freemarker specified a DTO object
 *    and this object is given to freemarker for creating .java classes.
 *
 */
@Component
public class RuleGeneratorServiceImpl implements RuleGeneratorService {

	@Autowired
	private RuleTemplateEngine ruleTemplateEngine;

	@Autowired
	private TemplateEngineUtils templateEngineUtils;

	Map<String, PojoClassConstruct> classMap = new HashMap<String, PojoClassConstruct>();
	Map<String, Rule> rules = new HashMap<String, Rule>();
	
	ExpressionEvaluator expressionHandling = null;
	XmlConstructUtils xmlConstructUtils = new XmlConstructUtils();
	DSWrapper dsWrapper = null;
	String state = null;
	String version = null;
	String lobName = null;
	/**
	 * 
	 * .java rule classes are generated in specified path
	 * @param path
	 * @param className
	 * @param dataMap
	 */
	public void generatePackagesAndRuleClasses(String path, String className, Map<String, Object> dataMap) {
		StringBuilder filePath = new StringBuilder();
		filePath.append(path);
		filePath.append("/");
		filePath.append(className);
		filePath.append(".java");

		File file = new File(filePath.toString());
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		if(className.equals("CommercialPropertyValueReportingForm")){
			System.out.println("here1");
		}

		templateEngineUtils.createJavaClass(ruleTemplateEngine.getEngine(), filePath.toString(), dataMap);

	}

	@Override
	public void generateRuleClasses(String projectMainPackageStructure, String className, String classFilePath,
			String subPackage, Map<String, Object> dataMap) {
		String packageName = templateEngineUtils.getFilePath(projectMainPackageStructure, "", "", subPackage);
		String subPath = templateEngineUtils.getFilePath(classFilePath, "", "", subPackage);
		dataMap.put("type", "class");
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("name", className);
		generatePackagesAndRuleClasses(subPath, className, dataMap);

	}

	@Override
	public void generateRuleClasses(Map<String, Rule> ruleClasses, String projectMainPackageStructure,
			String classFilePath, String lobName, ERCProcessorOutput ercProcessorOutput, String state) {
		classMap = ercProcessorOutput.getClassesMaps().get(state);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		rules = ruleClasses;
		String subPackageFilePath = "/" + lobName.toLowerCase() + "/" + state.toLowerCase()+ercProcessorOutput.getVersion();
		String subPackage = lobName.toLowerCase() + "." + state.toLowerCase()+ercProcessorOutput.getVersion();
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
				classPackages.add("java.text.ParseException");

				Rule rule = entry.getValue();
				ClassMethodDTO setPremiumMethod = new ClassMethodDTO();
				setPremiumMethod.setMethodName("setPremium");
				setPremiumMethod.setAccessSpecifier("public");
				setPremiumMethod.setReturnType("void");
				StringBuilder methodBody = new StringBuilder();
				methodBody.append("\n\t\tdouble finalPremium = 0;");
				boolean isChildCoverageExist = false;
				if (null != rule.getVariableMap() && rule.getVariableMap().size() > 0) {
					isChildCoverageExist = createMemberVariables(subPackage, dataMap, classPackages, rule, methodBody,
							isChildCoverageExist);
				}
				methodBody.append("\n\t\tthis."+rule.getName()+".setPremium(finalPremium) ;");
				setPremiumMethod.setBody(methodBody.toString());
				Set<ClassMethodDTO> classMethodDTOList = new HashSet<ClassMethodDTO>();
				if(isChildCoverageExist) {
					//classMethodDTOList.add(setPremiumMethod);
				}
				String totpremiumMethodCallName = getMethodInvokeTotalPremium(rule.getMethodList());
				for (Method method : rule.getMethodList()) {
					if(method.getMethodName().equals("setPremium")) {
						//System.out.println("here");
					}//StandardDeductible
					createMethods(subPackage, rule, isChildCoverageExist, classMethodDTOList, totpremiumMethodCallName,
							method);

				}
				dataMap.put("classmethods", classMethodDTOList);

				this.generateRuleClasses(projectMainPackageStructure, entry.getKey(), classFilePath,
						subPackageFilePath + "/rules", dataMap);

			}
		}

	}
	/**
	 * This method populate a Method DTO class with corresponding methods in a rule engine
	 * @param lobName
	 * @param rule
	 * @param isChildCoverageExist
	 * @param classMethodDTOList
	 * @param totpremiumMethodCallName
	 * @param method
	 */
	private void createMethods(String subPackage, Rule rule, boolean isChildCoverageExist,
			Set<ClassMethodDTO> classMethodDTOList, String totpremiumMethodCallName, Method method) {
		Set<String> parentExceptions = new HashSet<String>();
		ClassMethodDTO methodDTO = createClassMethodDTO(method, subPackage, rule);
		if (!method.getSubMethods().isEmpty()) {
			methodDTO = createClassMethodDTOBody(method.getSubMethods(), methodDTO, subPackage);
		}
		if(isChildCoverageExist && isTotalPremiumMethodExist(rule)) {
			if(methodDTO.getMethodName().equals(totpremiumMethodCallName)) {
				String body = methodDTO.getBody();
				body = body +"\n\tsetTotalPremiumForCoverage();";
				methodDTO.setBody(body);
			}
		}
		for (Method subMethod : method.getSubMethods()) {
			Set<String> exceptions = new HashSet<String>();
			ClassMethodDTO subMethodDTO = createClassMethodDTO(subMethod, subPackage, rule);
			if (!subMethod.getSubMethods().isEmpty()) {
				subMethodDTO = createClassMethodDTOBody(subMethod.getSubMethods(), subMethodDTO, subPackage);
			}else {
				propagateExceptions(subMethod, exceptions);
			}
		
			for (Method subMethod1 : subMethod.getSubMethods()) {
				ClassMethodDTO subMethodDTO1 = createClassMethodDTO(subMethod1, subPackage, rule);
				if (!subMethod1.getSubMethods().isEmpty()) {
					subMethodDTO1 = createClassMethodDTOBody(subMethod1.getSubMethods(), subMethodDTO1, subPackage);
				} else {
					subMethodDTO1.setBody(subMethod1.getMethodBody().toString());
				}
				if (null != subMethod1.getExceptions() && subMethod1.getExceptions().size() > 0) {
					subMethodDTO1
							.setThrowsSection("throws " + String.join(",", subMethod1.getExceptions()));
					exceptions.addAll(subMethod1.getExceptions());
				}
				if (subMethod1.getContainerClass().equals("self") && !isExists(subMethodDTO1, classMethodDTOList)) {
					classMethodDTOList.add(subMethodDTO1);
				}

			}
			if (exceptions.size() > 0) {
				subMethodDTO.setThrowsSection("throws " + String.join(",", exceptions));
				parentExceptions.addAll(exceptions);
			}

			if (subMethod.getContainerClass().equals("self") && !isExists(subMethodDTO, classMethodDTOList)) {
				classMethodDTOList.add(subMethodDTO);
			}
		}
		if (parentExceptions.size() > 0) {
			methodDTO.setThrowsSection("throws " + String.join(",", parentExceptions));
		}
		if (method.getContainerClass().equals("self") && !isExists(methodDTO, classMethodDTOList)) {
			if(method.getMethodName().equals("setTotalPremiumForCoverage")) {
				methodDTO.setBody(method.getMethodBody().toString());
			}
			classMethodDTOList.add(methodDTO);
			
		}
	}
	/**
	 * create a member variables of rule class.
	 * pojo classes are keep as a list in rule
	 * @param lobName
	 * @param dataMap
	 * @param classPackages
	 * @param rule
	 * @param methodBody
	 * @param isChildCoverageExist
	 * @return
	 */
	private boolean createMemberVariables(String subPackage, Map<String, Object> dataMap, List<String> classPackages,
			Rule rule, StringBuilder methodBody, boolean isChildCoverageExist) {
		List<String> memberVariableList = new ArrayList<String>();
		for (Map.Entry<String, Variable> varEntry : rule.getVariableMap().entrySet()) {
			Variable variable = varEntry.getValue();

			if (variable.getVariableName().equalsIgnoreCase("entry.getKey()")) {
				classPackages.add("com.nest.res." + subPackage + ".domain."
						+ variable.getVariableType().getType());
			}

			StringBuilder memberVariable = new StringBuilder();

			if (variable.getVariableType().getName().equalsIgnoreCase("List")) {
				memberVariable.append("List<");
				memberVariable.append(variable.getVariableType().getType());
				memberVariable.append("> ");
				memberVariable.append(variable.getVariableName());
				classPackages.add("com.nest.res." + subPackage + ".domain."
						+ variable.getVariableType().getType());
				
				// method body for setPremium common method
				getSetPremiumMethodbody(methodBody, variable, subPackage);
				isChildCoverageExist = true;
				
			} else {
				if(null!=variable.getVariableType().getType() && variable.getVariableType().getType().equalsIgnoreCase("local")) {
					memberVariable.append(variable.getVariableType().getName());
					memberVariable.append(" ");
					memberVariable.append(variable.getVariableName());
				}else {
					if (variable.getVariableName().equals(rule.getName())) {
						memberVariable.append("com.nest.res." + subPackage + ".domain.");
					} else {
						memberVariable.append("com.nest.res." + subPackage + ".rules.");
					}
					memberVariable.append(variable.getVariableType().getName());
					memberVariable.append(" ");
					memberVariable.append(variable.getVariableName());
				}
			}
			memberVariableList.add(memberVariable.toString());
		}

		dataMap.put("classPackages", classPackages);

		dataMap.put("membervariablelist", memberVariableList);
		return isChildCoverageExist;
	}
	/**
	 * generate the method body for method setPremium()
	 * @param methodBody
	 * @param variable
	 */
	private void getSetPremiumMethodbody(StringBuilder methodBody, Variable variable, String subPackage) {
		methodBody.append("\n\t\tif(this."+variable.getVariableName()+" != null && this."+variable.getVariableName()+".size() > 0){");
		methodBody.append("\n\t\t\tfor(com.nest.res."+subPackage+".domain."+variable.getVariableType().getType()+" "+ variable.getVariableType().getType()+" : "+ variable.getVariableName()+") {");
		methodBody.append("\n\t\t\t\tfinalPremium = finalPremium + "+variable.getVariableType().getType()+".getPremium();");
		methodBody.append("\n\t\t\t}");
		methodBody.append("\n\t\t}");
	}
	/**
	 * setPremium() method should call from the last premium calculation method.
	 * So this method returns the method name of last premium calculation method.
	 * @param methodList
	 * @return
	 */
	private String getMethodInvokeTotalPremium(List<Method> methodList) {
		List<Integer> sequence = new ArrayList<Integer>();
		Pattern p = Pattern.compile( "[0-9]" );

		for(Method method : methodList) {
			String methodName = method.getMethodName();
			if(methodName.startsWith("ProcessPremium")){
				String no = methodName.substring("ProcessPremium".length(), methodName.length());
				Matcher m = p.matcher(no);
				if(m.find()) {
					int seqNo = Integer.parseInt(no);
					sequence.add(seqNo);
				}
			}
		}
		if(null!=sequence && sequence.size()>0) {
			Collections.sort(sequence, Collections.reverseOrder());
			String methodName = "ProcessPremium"+String.valueOf(sequence.get(0));
			return methodName;
		}
		return null;
	}
	/**
	 * If any exceptions defined in throw in sub method 
	 * It should add to the parent method also
	 * @param subMethod
	 * @param exceptions
	 */
	private void propagateExceptions(Method subMethod, Set<String> exceptions) {
		if (!subMethod.getContainerClass().equals("self")) {
			Rule ruleRef = rules.get(subMethod.getContainerClass());
			if (null != ruleRef.getMethodList()) {
				for (Method methodRef : ruleRef.getMethodList()) {
					if (null != methodRef.getMethodName()
							&& methodRef.getMethodName().equals(subMethod.getMethodName())) {
						if (methodRef.getExceptions().size() > 0) {
							exceptions.addAll(methodRef.getExceptions());
						}
						if(methodRef.getSubMethods()!=null && methodRef.getSubMethods().size()>0) {
							for(Method subMethod1:methodRef.getSubMethods()) {
								propagateExceptions(subMethod1, exceptions);
							}
							
						}
						
					}
				}

			}
		}
	}
	/**
	 * create a method dto from method in rule structure.
	 * This DTO object is used as crate methods in .java using freemarker
	 * @param method
	 * @param lobName
	 * @param rule
	 * @return
	 */
	private ClassMethodDTO createClassMethodDTO(Method method, String subPackage, Rule rule) {
		ClassMethodDTO dto = new ClassMethodDTO();

		if (method.isConstructor()) {
			dto.setAccessSpecifier("public");
			dto.setReturnType("");
			dto.setMethodName(method.getMethodName());
			dto.setReturnValue("");
			dto.setParams("com.nest.res." + subPackage + ".domain." + method.getMethodName() + " "
					+ method.getMethodName());
			createMethodBodyForConstructor(rule, dto);

		} else {

			if ("self".equalsIgnoreCase(method.getContainerClass())) {
				dto.setAccessSpecifier("public");
				dto.setReturnType("void");
				dto.setMethodName(method.getMethodName().replace("/", "Slash"));
				dto.setReturnValue("");

			} else {
				dto.setAccessSpecifier("public");
				dto.setReturnType(method.getContainerClass());
				dto.setMethodName(method.getContainerClass() + "_" + method.getMethodName().replace("/", "Slash"));
				dto.setReturnValue("return null;");
			}
		}
		return dto;
	}
    /**
     * create a DTO method for a constructor in a rule class
     * @param rule
     * @param classMethodDTO
     * @return
     */
	private ClassMethodDTO createMethodBodyForConstructor(Rule rule, ClassMethodDTO classMethodDTO) {
		StringBuilder constructorBody = new StringBuilder();
		constructorBody.append("this." + rule.getName() + " = " + rule.getName() + ";\n");
		for (Map.Entry<String, Variable> varEntry : rule.getVariableMap().entrySet()) {
			Variable variable = varEntry.getValue();
			if (variable.getVariableType().getName().equalsIgnoreCase("List")) {
				String domainVarName = variable.getVariableName() != null
						? variable.getVariableName().substring(0, variable.getVariableName().length() - 4)
						: "";
				constructorBody.append("this." + variable.getVariableName() + " = " + rule.getName() + ".get"
						+ Utils.handleSpecialVariable(domainVarName) + "();\n");

			}
		}
		classMethodDTO.setBody(constructorBody.toString());
		return classMethodDTO;
	}
	/**
	 * create a method body for DTO object
	 * @param methodList
	 * @param classMethodDTO
	 * @return
	 */
	private ClassMethodDTO createClassMethodDTOBody(List<Method> methodList, ClassMethodDTO classMethodDTO, String subPackage) {
		StringBuilder bodyBuilder = new StringBuilder();
		Set<String> exceptions = new HashSet<String>();
		for (Method method : methodList) {

			if (method.getMethodName().contains("/") || method.getMethodName().contains("..")) {
				method.setMethodName(method.getMethodName().replace("/", "_"));
				method.setMethodName(method.getMethodName().replace("..", ""));
			}
			if ("self".equalsIgnoreCase(method.getContainerClass())) {
				bodyBuilder.append("\n\t"+method.getMethodName().replace("/", "Slash") + "();\n\t");
			} else {
				bodyBuilder.append("\n\tif(null != "+method.getContainerClass()+"List){");
				bodyBuilder.append("\n\t\tfor("+method.getContainerClass()+" "+method.getContainerClass()+":"+method.getContainerClass()+"List){");
				bodyBuilder.append("\n\t\t\t"+method.getContainerClass()+"Rule = new com.nest.res."+subPackage+".rules."+method.getContainerClass()+"("+method.getContainerClass()+");");
//				if(isCoverageOnPolicyIndicatorExist(method.getContainerClass())) {
//					bodyBuilder.append("\n\t\t\tif("+method.getContainerClass()+".getCoverageOnPolicyIndicator()>0){");
//					bodyBuilder.append("\n\t\t\t\t"+method.getContainerClass() + "Rule." + method.getMethodName().replace("/", "Slash") + "();\n");
//					bodyBuilder.append("\t\t\t}");
//				}else {
//					bodyBuilder.append("\n\t\t\t"+method.getContainerClass() + "Rule." + method.getMethodName().replace("/", "Slash") + "();\n");
//				}
				bodyBuilder.append("\n\t\t\t"+method.getContainerClass() + "Rule." + method.getMethodName().replace("/", "Slash") + "();\n");
				bodyBuilder.append("\n\t\t}");
				bodyBuilder.append("\n\t}");
			}
			// calling other class methods
			if (!method.getContainerClass().equals("self")) {
				Rule ruleRef = rules.get(method.getContainerClass());
				if (null != ruleRef.getMethodList()) {
					for (Method methodRef : ruleRef.getMethodList()) {
						if (null != methodRef.getMethodName()
								&& methodRef.getMethodName().equals(method.getMethodName())) {
							if (methodRef.getExceptions().size() > 0) {
								exceptions.addAll(methodRef.getExceptions());
							}
						}
					}

				}
			} else {
				exceptions.addAll(method.getExceptions());
			}

		}
		classMethodDTO.setBody(bodyBuilder.toString() + "");
		if (exceptions.size() > 0) {
			classMethodDTO.setThrowsSection("throws " + String.join(",", exceptions));
		}
		return classMethodDTO;
	}
	/**
	 * check the pojo class having the attribute "CoverageOnPolicyIndicator"
	 * @param domain
	 * @return
	 */
	private boolean isCoverageOnPolicyIndicatorExist(String domain) {
		PojoClassConstruct pojoClassConstruct = classMap.get(domain);
		if(pojoClassConstruct.getInstanceVariableMap().containsKey("CoverageOnPolicyIndicator")) {
			return true;
		}
		return false;
	}
	/**
	 * check a method already exist in DTO List
	 * @param dto
	 * @param classMethodDTOList
	 * @return
	 */
	private boolean isExists(ClassMethodDTO dto, Set<ClassMethodDTO> classMethodDTOList) {

		for (ClassMethodDTO classMethodDTO : classMethodDTOList) {
			if (StringUtils.compare(dto.getAccessSpecifier(), classMethodDTO.getAccessSpecifier()) == 0
					&& StringUtils.compare(dto.getReturnType(), classMethodDTO.getReturnType()) == 0
					&& StringUtils.compare(dto.getMethodName(), classMethodDTO.getMethodName()) == 0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Map<String, Rule> createRuleStructure(ERCProcessorOutput ercProcessorOutput, String lobName, String stateCode) {
		this.classMap = ercProcessorOutput.getClassesMaps().get(stateCode);
		this.expressionHandling = new ExpressionEvaluator(ercProcessorOutput, classMap, stateCode, lobName);
		this.dsWrapper = ercProcessorOutput.getDsWrapper();
		this.state = stateCode;
		this.version = ercProcessorOutput.getVersion();
		this.lobName = lobName;
		Map<String, Rule> ruleClasses = new HashMap<String, Rule>();
		Map<String,AlgParserOutput> algParserOutputs = ercProcessorOutput.getAlgParserOutputs();
		processFlowClass(algParserOutputs.get(stateCode), ruleClasses);
		return ruleClasses;

	}
	 /**
     * This method extract the flowchart object from alg 
     * and generated the class structure by reading the workflow of flow chart
     * @param algParserOutput
     * @param ruleClasses
     * @return
     */
	private Map<String, Rule> processFlowClass(AlgParserOutput algParserOutput, Map<String, Rule> ruleClasses) {
		Reference flowChart = algParserOutput.getFlowChart();
		List<FlowClass> flowClassList = flowChart.getClasses();
		if (null != flowClassList) {
			for (FlowClass flowClass : flowClassList) {
				if (null != flowClass) {
					Map<String, Rule> rules = new HashMap<String, Rule>();
					rules = processSubComponents(rules, flowClass, algParserOutput);
					ruleClasses.putAll(rules);
				}

			}
		}
		return ruleClasses;
	}
	/**
	 * Currently we are taking only premium calculation and common  rating classes
	 * and create a rule for respective classes.
	 * A rule contains variables for the classes and corresponding methods.
	 * If a premium calculation or common rating class found we create the parent method as ProcessPremium1/CommonRating1.
	 * Then process the sub components it may a rating/premium node so we create a sub method as ProcessPremium1_ProcessPremiumSub1 for parent method Process Premium1
	 * In side this iterate the flow variable and create the PCH methods.
	 * So workflow of methods like this ProcessPremium1 --> ProcessPremium1_ProcessPremiumSub1 -->pch medthod name
	 * @param rules
	 * @param xmlConstruct
	 * @param algParserOutput
	 * @return
	 */
	private Map<String, Rule> processSubComponents(Map<String, Rule> rules, XmlConstruct xmlConstruct,
			AlgParserOutput algParserOutput) {
		if (xmlConstruct instanceof FlowClass) {
			FlowClass flowclass = (FlowClass) xmlConstruct;
			if (null != flowclass.getType() && flowclass.getType().matches("Premium Calculation|Common Rating")) {
				Rule rule = rules.get(flowclass.getName());
				if (null == rule) {
					Method constructor = createConstructor(flowclass);
					rule = getRule(flowclass);
					if(flowclass.getParent() instanceof FlowClass){
						FlowClass parentFlowClass = (FlowClass)flowclass.getParent();
						Rule parentRule = rules.get(parentFlowClass.getName());
						rule.setParent(parentRule);
					}
					rule.getMethodList().add(constructor);
					rules.put(flowclass.getName(), rule);
				}
				String methodName = "";
				List<Method> methodList = rule.getMethodList();
				if (flowclass.getType().matches("Premium Calculation")) {
					methodName = getMainMethodName(methodList, "ProcessPremium1", "ProcessPremium");
					if(!isTotalPremiumMethodExist(rule)) {
						Method subMethod = createPchMethods(algParserOutput, flowclass, rule);
						rule.getMethodList().add(subMethod);
					}
				}
				if (flowclass.getType().matches("Common Rating")) {
					methodName = getMainMethodName(methodList, "CommonRating1", "CommonRating");
				}
				Method method = new Method(methodName,"self");
				rule.getMethodList().add(method);

				// Adding new instance variable for domain class
				createDomainVariable(flowclass, rule);
				if (null != flowclass.getParent()) {
					if (flowclass.getParent() instanceof FlowClass) {
						createSubRulesAndMethodRefrence(rules, flowclass, rule, method.getMethodName());
					}
				}
			}
			if (null != flowclass.getSubComponents() && flowclass.getSubComponents().size() > 0) {
				for (XmlConstruct xmlConstruct1 : flowclass.getSubComponents()) {
					processSubComponents(rules, xmlConstruct1, algParserOutput);
				}
			}
		} else if (xmlConstruct instanceof ClassComponent) {
			ClassComponent classComponent = (ClassComponent) xmlConstruct;
			if (null != classComponent.getElementName() && classComponent.getElementName().matches("rating|premium|coverageOnPolicyIndicator")) {
				if (null != classComponent.getParent()) {
					FlowClass flowClassParent = (FlowClass) classComponent.getParent();
					Rule parentRule = rules.get(flowClassParent.getName());
					Method parentMethod = null;
					if (null != parentRule) {
						parentMethod = parentRule.getMethodList().get(parentRule.getMethodList().size() - 1);
					}
					String methodName = "";
					if (classComponent.getType().equals("Common Rating")) {
						methodName = getMainMethodName(parentMethod.getSubMethods(),
								parentMethod.getMethodName() + "_CommonRatingSub1",
								parentMethod.getMethodName() + "_CommonRatingSub");
					}
					if (classComponent.getType().equals("Premium Calculation")) {
						methodName = getMainMethodName(parentMethod.getSubMethods(),
								parentMethod.getMethodName() + "_ProcessPremiumSub1",
								parentMethod.getMethodName() + "_ProcessPremiumSub");
					}
					if (classComponent.getType().equals("Policy Indicator")) {
						methodName = "PolicyIndicator_Calculation";
					}
					Method method = new Method(methodName,"self");
					Set<String> exceptions = new HashSet<String>();
					List<Method> subMethodList = createPchMethods(algParserOutput, classComponent, exceptions, parentRule);
					method.getSubMethods().addAll(subMethodList);
					addExceptions(method, exceptions);
					if (null != parentMethod) {
						parentMethod.getSubMethods().add(method);
						addExceptions(parentMethod, exceptions);
					}

				}

			}
		}
		return rules;
	}

	private boolean isTotalPremiumMethodExist(Rule rule) {
		List<Method> methods = rule.getMethodList();
		if(methods.size()>0) {
			for(Method method:methods) {
				if(method.getMethodName().equals("setTotalPremiumForCoverage")) {
					return true;
				}
			}
		}
		return false;
	}
    /**
     * if multiple rating/premium component reference inside one flow class then method name
     * should be in sequence order. commonRating1/commonRating2 like that.
     * @param methodList
     * @param methodName
     * @param base
     * @return
     */
	private String getMainMethodName(List<Method> methodList, String methodName, String base) {
		for (Method method1 : methodList) {
			if (method1.getMethodName().contains(base)) {
				String methodCount = method1.getMethodName().substring(method1.getMethodName().length() - 1);
				methodName = method1.getMethodName().substring(0, method1.getMethodName().length() - 1);
				int count = (Integer.parseInt(methodCount) + 1);
				methodName = methodName + count;
			}
		}
		return methodName;
	}
    /**
     * Each flow variable is a pch reference. From the name of flow variable find out the corresponding PCH.
     * by reading the PCH create the method body and attached to the method.
     * @param algParserOutput
     * @param classComponent
     * @param exceptions
     * @param parentRule
     * @return
     */
	
	private List<Method> createPchMethods(AlgParserOutput algParserOutput, ClassComponent classComponent,
			Set<String> exceptions, Rule parentRule) {
		List<Method> subMethodList = new ArrayList<Method>();
		PchProcessor pchProcessor = new PchProcessor(expressionHandling, classMap, parentRule, dsWrapper , state, version, lobName);
		
		if (null != classComponent.getVariables()) {
			for (FlowVariable variable : classComponent.getVariables()) {
				if (null != variable) {
					Method subMethod = new Method(variable.getName(), "self");
					subMethodList.add(subMethod);
					Reference matchedReference = algParserOutput.getXmlDetails()
							.getReferenceFromDbTablesAndType(classComponent.getClassName(), classComponent.getType());
					Pch matchedPch = null;
					if (null != matchedReference) {
						matchedPch = matchedReference.getScope(classComponent.getClassName(), variable.getPass())
								.getPch(variable.getName());
						if (null != matchedPch) {
							pchProcessor.processPch(matchedPch, null, null, subMethod, subMethodList);
						}
					}
					if(null!=subMethod.getExceptions() && subMethod.getExceptions().size()>0) {
						exceptions.addAll(subMethod.getExceptions());
					}
					if (null != subMethod.getMethodBody()
							&& subMethod.getMethodBody().toString().contains("getRateTableLookupValue")) {
						Utils.addRateTableExceptions(exceptions);
						subMethod.getExceptions().addAll(exceptions);
					}
				}
			}

		}
		return subMethodList;
	}
	/**
	 * Create total premium pch method
	 * @param algParserOutput
	 * @param flowClass
	 * @param rule
	 * @return
	 */
	private Method createPchMethods(AlgParserOutput algParserOutput, FlowClass flowClass, Rule rule) {
		List<Method> subMethodList = new ArrayList<Method>();
		PchProcessor pchProcessor = new PchProcessor(expressionHandling, classMap, rule, dsWrapper, state, version, lobName);
		Method subMethod = null;
		if (null != flowClass) {
			subMethod = new Method("setTotalPremiumForCoverage", "self");
			rule.getMethodList().add(subMethod);
			Reference matchedReference = algParserOutput.getXmlDetails()
							.getReferenceFromDbTablesAndType(flowClass.getName(), flowClass.getType());
			Pch matchedPch = null;
			if (null != matchedReference) {
				matchedPch = matchedReference.getScope(flowClass.getName(), "1").getPch("Premium");
				if (null != matchedPch) {
					pchProcessor.processPch(matchedPch, null, null, subMethod, subMethodList);
				}
			}
					
		}
		return subMethod;
	}
	/**
	 * 
	 * @param method
	 * @param exceptions
	 */
	private void addExceptions(Method method, Set<String> exceptions) {
		if (exceptions.size() > 0) {
			method.setExceptions(exceptions);
		}
	}
    /**
     * create domain class variables. i.e. pojo class reference in rule
     * @param flowclass
     * @param rule
     */
	private void createDomainVariable(FlowClass flowclass, Rule rule) {
		String variableName = flowclass.getName();
		VariableType variableType = new VariableType(flowclass.getName(), null); // BOPStructure
		Variable variable = new Variable("private", null, variableType, variableName);
		rule.getVariableList().add(variable);
		rule.getVariableMap().put(variableName, variable);
	}
	/**
	 * create a constructor method object in rule structure
	 * @param flowclass
	 * @return
	 */
	private Method createConstructor(FlowClass flowclass) {
		VariableType variableType = new VariableType();
		variableType.setName(flowclass.getName());

		Variable variable = new Variable();
		variable.setVariableName(flowclass.getName());
		variable.setVariableType(variableType);

		List<Variable> parameters = new ArrayList<Variable>();
		parameters.add(variable);

		Method constructor = new Method(flowclass.getName(),"self",true,parameters,"");
		return constructor;
	}
	/**
	 * Create a rule object using flow class name
	 * @param flowClass
	 * @return
	 */
	private Rule getRule(FlowClass flowClass) {
		Rule rule = new Rule();
		rule.setName(flowClass.getName());
		return rule;
	}
	/**
	 * create the sub method calls of parent method.
	 * @param rules
	 * @param flowclass
	 * @param rule
	 * @param methodName
	 */
	private void createSubRulesAndMethodRefrence(Map<String, Rule> rules, FlowClass flowclass, Rule rule,
			String methodName) {
		FlowClass parentClass = (FlowClass) flowclass.getParent();
		Rule parentRule = rules.get(parentClass.getName());
		if (null != parentRule) {
			Method parentMethod = parentRule.getMethodList().get(parentRule.getMethodList().size() - 1);
			parentRule.getSubRules().add(rule);
			Method subMethod = new Method(methodName,rule.getName());
			if (null != parentMethod) {
				parentMethod.getSubMethods().add(subMethod);
				
			}

			// Adding new instance variable for domain class
			String variableName = flowclass.getName() + "List";
			VariableType variableType = new VariableType("List", flowclass.getName()); // List<BOPStructure>
			Variable variable = new Variable("private", null, variableType, variableName);
			parentRule.getVariableList().add(variable);
			parentRule.getVariableMap().put(variableName, variable);

			// Adding new instance variable for rule class itself

			variableName = flowclass.getName() + "Rule";
			variableType = new VariableType(flowclass.getName(), null); // BOPStructure
			variable = new Variable("private", null, variableType, variableName);
			parentRule.getVariableList().add(variable);
			parentRule.getVariableMap().put(variableName, variable);

		}

	}


}
