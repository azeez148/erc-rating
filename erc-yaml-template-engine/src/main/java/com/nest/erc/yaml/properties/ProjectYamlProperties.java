package com.nest.erc.yaml.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("parserproject")
public class ProjectYamlProperties {
	private String containerlocation;
	private String inputFilelocation;
	private String yamlSchemaversion;
	private String yamlTemplateText;
	private String stateContainerLocation;
	private String rateTableFolderName;
	private String convertedCalculations;
	
	public String getStateContainerLocation() {
		return stateContainerLocation;
	}

	public void setStateContainerLocation(String stateContainerLocation) {
		this.stateContainerLocation = stateContainerLocation;
	}

	public String getYamlSchemaversion() {
		return yamlSchemaversion;
	}

	public void setYamlSchemaversion(String yamlSchemaversion) {
		this.yamlSchemaversion = yamlSchemaversion;
	}
	
	public String getContainerlocation() {
		return containerlocation;
	}

	public void setContainerlocation(String containerlocation) {
		this.containerlocation = containerlocation;
	}

	public String getYamlTemplateText() {
		return yamlTemplateText;
	}

	public void setYamlTemplateText(String yamlTemplateText) {
		this.yamlTemplateText = yamlTemplateText;
	}

	public String getRateTableFolderName() {
		return rateTableFolderName;
	}

	public void setRateTableFolderName(String rateTableFolderName) {
		this.rateTableFolderName = rateTableFolderName;
	}

	public String getInputFilelocation() {
		return inputFilelocation;
	}

	public void setInputFilelocation(String inputFilelocation) {
		this.inputFilelocation = inputFilelocation;
	}

	public String getConvertedCalculations() {
		return convertedCalculations;
	}

	public void setConvertedCalculations(String convertedCalculations) {
		this.convertedCalculations = convertedCalculations;
	}
	

}
