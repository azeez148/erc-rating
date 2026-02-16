package com.nest.erc.java.template.engine.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import org.springframework.stereotype.Component;

import freemarker.template.Template;

@Component
public class TemplateEngineUtils {
	
	public void createJavaClass(Template template, String filePath, Map<String, Object> dataMap) {
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
			//System.out.println("Success");

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
	
	
	public void createPOM(Template template, String filePath, Map<String, Object> dataMap) {
		Writer fileWriter = null;
		try {
			File file = new File(filePath + "/pom.xml");
			if (! file.exists()){
				file.getParentFile().mkdirs();
		    }
			fileWriter = new FileWriter(new File(filePath + "/pom.xml"));
			template.process(dataMap, fileWriter);
			fileWriter.flush();
			//System.out.println("Successfully POM created");

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
	
	public void createJenkinsFile(Template template, String filePath, Map<String, Object> dataMap) {
		Writer fileWriter = null;
		try {
			File file = new File(filePath + "/Jenkinsfile");
			if (! file.exists()){
				file.getParentFile().mkdirs();
		    }
			fileWriter = new FileWriter(new File(filePath + "/Jenkinsfile"));
			template.process(dataMap, fileWriter);
			fileWriter.flush();
			//System.out.println("Successfully Jenkinsfile created");

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
	
	public void createApplicationProperties(Template template, String filePath, Map<String, Object> dataMap) {
		Writer fileWriter = null;
		try {
			File file = new File(filePath);
			if (! file.exists()){
				file.getParentFile().mkdirs();
		    }
			fileWriter = new FileWriter(new File(filePath));
			template.process(dataMap, fileWriter);
			fileWriter.flush();
			//System.out.println("Successfully POM created");

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
	
	public String getFilePath(String containerLocation, String projectName, String topFolderStructureJava, String projectMainPackageStructure) {
		StringBuilder filePath = new StringBuilder();
		filePath.append(containerLocation);
		filePath.append(projectName);
		filePath.append(topFolderStructureJava);
		filePath.append(projectMainPackageStructure);
		return filePath.toString();
	}
	
	public String getPackageName(String packageName) {
		String formattedPackageName = packageName.replace("//", "/").replace("/", ".");
		if (formattedPackageName.charAt(formattedPackageName.length() - 1) == '.') {
			formattedPackageName = formattedPackageName.substring(0, packageName.length() - 1);
		}
		
		return formattedPackageName;
	}
	
//	

}
