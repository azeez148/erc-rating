package com.nest.erc.yaml.service;

import java.util.List;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.LOBName;
import com.nest.erc.yaml.domain.YAMLObject;
import com.nest.erc.yaml.domain.YamlBase;

public interface YamlERCProjectService {

	/**
	 * Method for creating Yaml project.
	 * @param ercProcessorOutput
	 * @param lobName
	 * @return
	 * @throws Exception 
	 */
	List<YAMLObject> buildYAMLProject(ERCProcessorOutput ercProcessorOutput,String lobName ) throws Exception;
}

