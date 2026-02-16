package com.nest.erc.yaml.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nest.erc.domain.LOBName;
import com.nest.erc.yaml.domain.YamlBase;

import freemarker.template.Template;

@Component
public class YamlEngineUtils {
	
	public void createLOB(Template template, String filePath, Map<String, Object> dataMap) {
		Writer fileWriter = null;
		File file = null;
		try {

			file = new File(filePath);
			if (!file.exists()) {
				file.getParentFile().mkdirs();
			}

			fileWriter = new FileWriter(file);
			template.process(dataMap, fileWriter);
			fileWriter.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	public void createJSON(Template template, String filePath, Map<String, Object> dataMap) {
		Writer fileWriter = null;
		File file = null;
		try {

			file = new File(filePath);
			if (!file.exists()) {
				file.getParentFile().mkdirs();
			}

			fileWriter = new FileWriter(file);
			template.process(dataMap, fileWriter);
			fileWriter.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public boolean createYAMlFileforLOB(YamlBase yamlObject , String lobName,String filePath) {
		ObjectMapper mapper = new ObjectMapper(new com.nest.erc.yaml.formatter.YAMLFactory());
		
		//mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
		com.nest.erc.yaml.formatter.YAMLFactory yamlFactory = new com.nest.erc.yaml.formatter.YAMLFactory();	
		yamlFactory.disable(com.nest.erc.yaml.formatter.YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
		//yamlFactory.enable(Feature.LITERAL_BLOCK_STYLE);
		yamlFactory.enable(com.nest.erc.yaml.formatter.YAMLGenerator.Feature.MINIMIZE_QUOTES);
	
		mapper = new ObjectMapper(yamlFactory);		
		
		try {
			mapper.writeValue(new File(filePath), yamlObject);
			return true;
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	

}
