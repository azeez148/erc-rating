package com.nest.erc.yaml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.ERCProjectBuildService;
import com.nest.erc.domain.LOBName;
import com.nest.erc.yaml.domain.YAMLObject;
import com.nest.erc.yaml.domain.YamlBase;

@Component
public class YamlGatewayServiceImpl implements ERCProjectBuildService {

	@Autowired
	private YamlERCProjectService yamlERCProjectService;

	@Autowired
	YamlService yamlService;


	@Override
	public boolean generateProject(ERCProcessorOutput ercProcessorOutput,
			String lobName) throws Exception {
		List<YAMLObject> yamlBase = yamlERCProjectService.buildYAMLProject(ercProcessorOutput, lobName);

		return generateYAMLFile(yamlBase, lobName);
	}



	/*
	 * @Override public String pingYaml() { return yamlService.pingMe();
	 * 
	 * }
	 * 
	 * @Override public void generateYAML(String fileName) {
	 * yamlService.generateYAML(fileName); }
	 */

	/**
	 * Generate YAML file based on the YAML object.
	 * 
	 * @param lobName
	 * @return
	 */
	private boolean generateYAMLFile(List<YAMLObject> yamlObjects, String lobName) {

		if (yamlObjects == null) {
			return false;
		} else {
			for(YAMLObject yamlObject : yamlObjects) {
				//YamlBase yamlBase = 
				yamlService.generateYAML(yamlObject, lobName, "product.yaml"); // file name should get from configuration file.
			}

		}
		return true;

	}

}
