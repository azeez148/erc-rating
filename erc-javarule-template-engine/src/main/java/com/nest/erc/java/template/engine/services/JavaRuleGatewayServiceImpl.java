package com.nest.erc.java.template.engine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.ERCProjectBuildService;
import com.nest.erc.domain.LOBName;

@Component
public class JavaRuleGatewayServiceImpl implements ERCProjectBuildService {

	@Autowired
	private JavaERCProjectService javaERCProjectService;

	@Override
	public boolean generateProject(ERCProcessorOutput ercProcessorOutput,
			String lobName) {
		// TODO Auto-generated method stub
		return javaERCProjectService.buildJavaProject(ercProcessorOutput, lobName);
	}

	

	
	
	/*
	 * @Override public void generateRuleClasses(String projectMainPackageStructure,
	 * String className, String classFilePath, String subPackage, Map<String,
	 * Object> dataMap) {
	 * ruleGeneratorService.generateRuleClasses(projectMainPackageStructure,
	 * className, classFilePath, subPackage, dataMap);
	 * 
	 * }
	 */

}
