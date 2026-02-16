package com.nest.erc.yaml.service;

import com.nest.erc.yaml.domain.YAMLObject;

public interface YamlService {
	
	public void generateYAML(String fileName);
	public boolean generateYAML(YAMLObject yamlObject, String lobName,String fileName);
	
	public String pingMe();

}
