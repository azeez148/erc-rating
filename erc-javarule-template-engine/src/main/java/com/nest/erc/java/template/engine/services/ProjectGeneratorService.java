package com.nest.erc.java.template.engine.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;

public interface ProjectGeneratorService {
	
	public String pingMe();

	public void generateProject(String containerLocation);
	public void generatePackagesAndClasses(String path, String className, Map<String, Object> dataMap);
	public void generateMainClass(String packageName, String filePath, String className);
	public void generatePOM(String projectname,String lobName);
	public void generateApplicationProperties(String projectName, String serverport);
	public String getTopFolderFilePath(String projectName, String projectMainPackageStructure);
	public void generateClasses(String projectMainPackageStructure, String className, String classFilePath, String subPackage, Map<String, Object> dataMap);
	
	public  void copyMVNbatfiles(String sourceFile, String destFile);
	public void generateRateTableLookup(String projectName,String lobName, String state, String version);
	
	public boolean writePojoClass(ERCProcessorOutput ercProcessorOutput, String projectName, String className, String serverport, String projectMainPackageStructure,String lobName,String state)
			throws FileNotFoundException, IOException;
	
	// Changes for micro service
	public void generateBootStrapProperties(String projectname, String lobName);
	//public void generateRatingServiceInterface(String packageName, String filePath, String className);
	//public void generateRatingService(String packageName, String filePath, String className);
	public void generateRatingChannel(String packageName, String filePath, String lobName, String state, String version);
	public void generateRatingService(String packageName, String filePath, String lobName, String state, String version);
	public void generateRatingServiceImpl(String packageName, String filePath, String lobName, String state, String version);
	public void generateRatingPublisherService(String packageName, String filePath);
	public void generateRatingPublisherServiceImpl(String packageName, String filePath, String lobName, String state, String version);
	public void generateBaseControllerBinding(String packageName, String filePath);
	public void generateBaseControllerListener(String packageName, String filePath);
	public void generateJenkinsFile(String projectname, String lobName, String state, String version);
	
}
