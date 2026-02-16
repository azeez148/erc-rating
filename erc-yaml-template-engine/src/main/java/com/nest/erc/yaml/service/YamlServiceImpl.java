package com.nest.erc.yaml.service;

import java.io.File;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.LOBName;
import com.nest.erc.yaml.domain.YAMLObject;
import com.nest.erc.yaml.domain.YamlBase;
import com.nest.erc.yaml.properties.ProjectYamlProperties;
import com.nest.erc.yaml.utils.LOBEngine;
import com.nest.erc.yaml.utils.YamlEngineUtils;

@Component
public class YamlServiceImpl implements YamlService {


	@Autowired
	private LOBEngine lobEngine;

	//@Value( "${yaml.basePath}" )
	//private String yamlBasePath;

	@Autowired
	private ProjectYamlProperties projectYamlProperties;


	@Autowired
	private YamlEngineUtils yamlEngineUtils;

	@Override
	public void generateYAML(String fileName) {
		StringBuilder filePath = new StringBuilder();
		filePath.append(projectYamlProperties.getContainerlocation());
		filePath.append(fileName);
		File file = new File(filePath.toString());
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		yamlEngineUtils.createLOB(lobEngine.getEngine(), filePath.toString(), dataMap);
	}

	@Override
	public String pingMe() {
		return "yaml created";
	}

	@Override
	public boolean generateYAML(YAMLObject yamlObject, String lobName, String fileName) {

		YamlBase yamlBase = yamlObject.getYamlBase();

		StringBuilder filePath = new StringBuilder();
		if(yamlObject.isStateData()) {
			filePath.append(projectYamlProperties.getStateContainerLocation()+yamlObject.getState().toLowerCase()+"\\");
		}
		else {
			filePath.append(projectYamlProperties.getContainerlocation());
		}
		File directory = new File(filePath.toString());
		if (! directory.exists()){
		    directory.mkdirs();
		} 
		filePath.append(fileName);

		return yamlEngineUtils.createYAMlFileforLOB(yamlBase, lobName, filePath.toString());
	}



}
