package com.nest.erc.yaml.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.nest.erc.yaml.properties.ProjectYamlProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProjectYamlProperties.class)
public class ErcYAMLTemplateEngine {

	public static void main(String[] args) {
		SpringApplication.run(ErcYAMLTemplateEngine.class, args);
	}

}