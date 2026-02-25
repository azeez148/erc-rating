package com.nest.erc.adapter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.ERCProjectBuildService;
import com.nest.erc.domain.ERCProjectType;
import com.nest.erc.domain.LOBName;
import com.nest.erc.java.template.engine.services.JavaRuleGatewayServiceImpl;
import com.nest.erc.yaml.service.YamlGatewayServiceImpl;

@Component
public class MainGatewayService implements AdapterService {

	@Autowired
	private JavaRuleGatewayServiceImpl javaRuleGatewayService;

	@Autowired
	private YamlGatewayServiceImpl yamlGatewayService;

	@Override
	public boolean buildProject(ERCProcessorOutput ercProcessorOutput, String lobName, String ercProjectType) throws Exception {		

		ERCProjectBuildService ercProjectBuildService = getERCProject(ercProjectType);

		if(ercProjectBuildService!= null) {

			return ercProjectBuildService.generateProject(ercProcessorOutput, lobName);
		}
		return false;	

	}


	private ERCProjectBuildService getERCProject(String ercProjectType) {

		if(ercProjectType.equals(ERCProjectType.JAVA.name())) {
			return javaRuleGatewayService;
		}
		else if(ercProjectType.equals(ERCProjectType.YAML.name())){
			return yamlGatewayService;
		}
		return null;
	}


}
