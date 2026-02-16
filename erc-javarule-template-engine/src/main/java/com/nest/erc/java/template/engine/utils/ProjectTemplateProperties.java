package com.nest.erc.java.template.engine.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("parserproject")
public class ProjectTemplateProperties {
	private String containerlocation;
	private String resProjectLocation;

	public String getContainerlocation() {
		return containerlocation;
	}

	public void setContainerlocation(String containerlocation) {
		this.containerlocation = containerlocation;
	}

	public String getResProjectLocation() {
		return resProjectLocation;
	}

	public void setResProjectLocation(String resProjectLocation) {
		this.resProjectLocation = resProjectLocation;
	}
	
	
}
