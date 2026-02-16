package com.nest.erc.java.template.engine.services;

import java.util.Map;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.Rule;

public interface RuleGeneratorService {
	
	public void generateRuleClasses(String projectMainPackageStructure, String className, String classFilePath, String subPackage, Map<String, Object> dataMap);
	
	public void generateRuleClasses(Map<String, Rule> ruleClasses, String projectMainPackageStructure, String classFilePath,String lobName, ERCProcessorOutput ercProcessorOutput, String state);
	/**
	 * This method process the parsed alg contents and create map
	 * contains all coverage's structural representation.
	 * Map - key - String - i.e. Coverage Name
	 * Rule - Value - Contains coverage structure as an Rule object
	 * @param ercProcessorOutput
	 * @return
	 */
	public Map<String,Rule> createRuleStructure(ERCProcessorOutput ercProcessorOutput,String lobName, String state);

}
