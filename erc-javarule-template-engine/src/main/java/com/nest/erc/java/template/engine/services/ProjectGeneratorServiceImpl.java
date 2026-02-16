package com.nest.erc.java.template.engine.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.ClientState;
import com.nest.erc.domain.CommonConfig;
import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.parseroutput.ERCParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.alg.re.constructs.impl.PojoVariablesConstruct;
import com.nest.erc.java.template.engine.dto.ClassMethodDTO;
import com.nest.erc.java.template.engine.utils.BaseControllerBindingTemplate;
import com.nest.erc.java.template.engine.utils.BaseControllerListenerTemplate;
import com.nest.erc.java.template.engine.utils.BootstrapTemplateEngine;
import com.nest.erc.java.template.engine.utils.JavaTemplateEngine;
import com.nest.erc.java.template.engine.utils.JenkinsFileTemplate;
import com.nest.erc.java.template.engine.utils.MainJavaTemplateEngine;
import com.nest.erc.java.template.engine.utils.POMTemplateEngine;
import com.nest.erc.java.template.engine.utils.ProjectTemplateProperties;
import com.nest.erc.java.template.engine.utils.PropertiesTemplateEngine;
import com.nest.erc.java.template.engine.utils.RateServiceImplTemplate;
import com.nest.erc.java.template.engine.utils.RateServiceTemplate;
import com.nest.erc.java.template.engine.utils.RatingChannelTemplate;
import com.nest.erc.java.template.engine.utils.RatingPublisherServiceImplTemplate;
import com.nest.erc.java.template.engine.utils.RatingPublisherServiceTemplate;
import com.nest.erc.java.template.engine.utils.TemplateEngineUtils;




@Component
public class ProjectGeneratorServiceImpl implements ProjectGeneratorService{

	@Autowired
	private MainJavaTemplateEngine mainJavaTemplateEngine;

	@Autowired
	private POMTemplateEngine pomTemplateEngine;

	@Autowired
	private PropertiesTemplateEngine propertiesTemplateEngine;

	@Autowired
	private JavaTemplateEngine javaTemplateEngine;

	@Autowired
	private TemplateEngineUtils templateEngineUtils;
	
	@Autowired
	private ProjectTemplateProperties projectTemplateProperties;
	
	@Autowired
	private BootstrapTemplateEngine bootstrapTemplateEngine;
	
	@Autowired
	private RateServiceTemplate rateServiceTemplate;
	
	@Autowired
	private RatingChannelTemplate ratingChannelTemplate;
	
	@Autowired
	private RateServiceImplTemplate rateServiceImplTemplate;
	
	@Autowired
	private RatingPublisherServiceTemplate ratingPublisherServiceTemplate;
	
	@Autowired
	private RatingPublisherServiceImplTemplate ratingPublisherServiceImplTemplate;
	
	@Autowired
	private BaseControllerBindingTemplate baseControllerBindingTemplate;
	
	@Autowired
	private BaseControllerListenerTemplate baseControllerListerTemplate;
	
	@Autowired
	private JenkinsFileTemplate jenkinsFileTemplate;
	
	
	
	private static final String PROJECT_TOP_FOLDER_JAVA = "/src/main/java/";
	private static final String PROJECT_TOP_FOLDER_RESOURCES = "/src/main/resources/";
	
	public String pingMe() {
		return "template created";
	}

	public void generateProject(String projectName) {
		StringBuilder filePath = new StringBuilder();
		filePath.append(projectTemplateProperties.getResProjectLocation());
		filePath.append("/");
		filePath.append(projectName);
		File file = new File(filePath.toString());
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
	}

	public void generatePackagesAndClasses(String path, String className, Map<String, Object> dataMap) {
		StringBuilder filePath = getFilePath(path, className);

		File file = new File(filePath.toString());
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		
		templateEngineUtils.createJavaClass(javaTemplateEngine.getEngine(), filePath.toString(), dataMap);

	}
	
	

	public void generateMainClass(String packageName, String filePath, String className) {
		
		List<String> includedPackages = new ArrayList<String>();
		includedPackages.add("org.springframework.boot.SpringApplication");
		includedPackages.add("org.springframework.boot.autoconfigure.SpringBootApplication");
		includedPackages.add("org.springframework.web.bind.annotation.GetMapping");
		includedPackages.add("org.springframework.web.bind.annotation.RestController");
		includedPackages.add("org.springframework.cloud.client.discovery.EnableDiscoveryClient");
		
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("name", className);
		dataMap.put("classPackages", includedPackages);
		dataMap.put("return", "String");
		dataMap.put("methodname", "hello");
		dataMap.put("params", "String name");
		dataMap.put("body", "String res= \"Hi\" + name;\n System.out.println(res);");
		dataMap.put("val", "res;");
		
		
		StringBuilder fileAndPath = getFilePath(filePath, className);
		templateEngineUtils.createJavaClass(mainJavaTemplateEngine.getEngine(), fileAndPath.toString(), dataMap);
	}

	public void generatePOM(String projectname, String lobName) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("packagename", "com.nest.res."+lobName.toLowerCase());
		dataMap.put("projectname", projectname);

		templateEngineUtils.createPOM(pomTemplateEngine.getEngine(), projectTemplateProperties.getResProjectLocation() + projectname, dataMap);
	}

	public void generateApplicationProperties(String projectName, String serverport) {
		StringBuilder applicationProperties = new StringBuilder();
		applicationProperties.append(projectTemplateProperties.getResProjectLocation());
		applicationProperties.append(projectName);
		applicationProperties.append(PROJECT_TOP_FOLDER_RESOURCES);
		applicationProperties.append("/application.properties");
		
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("serverport", serverport);
		dataMap.put("projectname", projectName);

		templateEngineUtils.createApplicationProperties(propertiesTemplateEngine.getEngine(), applicationProperties.toString(), dataMap);
	}

	@Override
	public String getTopFolderFilePath(String projectName, String projectMainPackageStructure) {
		return templateEngineUtils.getFilePath(projectTemplateProperties.getResProjectLocation(), projectName, PROJECT_TOP_FOLDER_JAVA, projectMainPackageStructure);
	}

	@Override
	public void generateClasses(String projectMainPackageStructure, String className, String classFilePath,
			String subPackage, Map<String, Object> dataMap) {
		String packageName = templateEngineUtils.getFilePath(projectMainPackageStructure, "", "", subPackage);
		String subPath = templateEngineUtils.getFilePath(classFilePath, "", "", subPackage);
		dataMap.put("type", "class");
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("name", className);
		generatePackagesAndClasses(subPath, className, dataMap);
		
	}
	
	
	
	@Override
	public  void copyMVNbatfiles(String sourceFile, String destFile) {
		File source = new File(sourceFile);
		File dest = new File(destFile);

		try {
			copyFileUsingJava7Files(source, dest);
		} catch (IOException e) {
			//System.out.println("Not Copied");
			e.printStackTrace();
		}
	}
	
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
		if (!dest.exists()) {
			Files.copy(source.toPath(), dest.toPath());
		}
			
	}

	@Override
	public void generateRateTableLookup(String projectName, String lobName, String state, String version) {
		StringBuilder filePath = new StringBuilder();
		filePath.append(projectTemplateProperties.getResProjectLocation());
		filePath.append("input/"+lobName+"_RateTableJson_CW"+state+version+".txt"); 
		
		
		File source = new File(projectTemplateProperties.getContainerlocation()+lobName+"_RateTableJson_CW"+state+version+".txt");
		File dest = new File(filePath.toString());
		
        try {
        	copyFileUsingStream(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    if (! dest.exists()){
	    	dest.getParentFile().mkdirs();
	    }
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	

	
	private List<String> getClassPackages() {
		List<String> classPackages = new ArrayList<String>();
		classPackages.add("java.util.ArrayList");
		classPackages.add("java.util.List");
		classPackages.add("java.util.Date");
		classPackages.add("com.nest.res.common.domain.Policy");
		return classPackages;
	}
	
	/**
	 * Generate instance variable for the reference class
	 * 
	 * @param variable
	 * @return
	 */
	private String generateMemberVariables(PojoVariablesConstruct variable) {

		// return String.format(instanceVariableTemplate, variable.getVariableType(),
		// variable.getName());
		StringBuilder memberVariables = new StringBuilder();
		if (variable.getAdditionalDataStructure() != null && variable.getAdditionalDataStructure().equals("List")) {
			memberVariables.append("List<");
			memberVariables.append(variable.getJavaType());
			memberVariables.append("> ");
			memberVariables.append(variable.getVariableName());
		} else {
			memberVariables.append(variable.getJavaType());
			memberVariables.append(" ");
			memberVariables.append(variable.getVariableName());
		}

		return memberVariables.toString();
	}

	/**
	 * Generate getters vaiables
	 * 
	 * @param instantVariables
	 * @return
	 */

	private String generateGetters(PojoVariablesConstruct variable) {
		StringBuilder builder = new StringBuilder();
		if (variable.getAdditionalDataStructure() != null && variable.getAdditionalDataStructure().equals("List")) {
			builder.append("List<");
			builder.append(variable.getJavaType());
			builder.append("> get");
			builder.append(StringUtils.capitalize(variable.getVariableName()));
			builder.append("()");
		} else {
			builder.append(variable.getJavaType());
			builder.append("  get");
			builder.append(StringUtils.capitalize(variable.getVariableName()));
			builder.append("()");
		}
		return builder.toString();
	}

	/**
	 * Generate getters vaiables
	 * 
	 * @param instantVariables
	 * @return
	 */

	private String generateSetters(PojoVariablesConstruct variable) {

		StringBuilder builder = new StringBuilder();
		if (variable.getAdditionalDataStructure() != null && variable.getAdditionalDataStructure().equals("List")) {
			builder.append(StringUtils.capitalize(variable.getVariableName()));
			builder.append("(List<");
			builder.append(variable.getJavaType());
			builder.append("> ");
			builder.append(variable.getVariableName());
			builder.append(")");
		} else {
			builder.append(StringUtils.capitalize(variable.getVariableName()));
			builder.append("(");
			builder.append(variable.getJavaType());
			builder.append(" ");
			builder.append(variable.getVariableName());
			builder.append(")");
		}
		return builder.toString();
	}
	
	@Override
	public boolean writePojoClass(ERCProcessorOutput ercProcessorOutput, String projectName, String className,
			String serverport, String projectMainPackageStructure, String lobName, String stateCode)
			throws FileNotFoundException, IOException {
		
		Map<String, PojoClassConstruct> classesMap = ercProcessorOutput.getClassesMaps().get(stateCode);
		CommonConfig commonConfig = ercProcessorOutput.getCommonConfig();

		String classFilePath = this.getTopFolderFilePath(projectName, projectMainPackageStructure);
		String subPackageFilePath = "/"+lobName.toLowerCase()+"/"+stateCode.toLowerCase()+ercProcessorOutput.getVersion();
		String subPackage = lobName.toLowerCase()+"."+stateCode.toLowerCase()+ercProcessorOutput.getVersion();

		Map<String, Object> dataMap = new HashMap<String, Object>();
//		dataMap = new HashMap<String, Object>();
//		this.generateClasses(projectMainPackageStructure, "ProcessRule", classFilePath, "/"+lobName.toLowerCase()+"/rate",
//				dataMap);
//		dataMap = new HashMap<String, Object>();
		Iterator<Entry<String, PojoClassConstruct>> pojoClassesIterator = classesMap.entrySet().iterator();
		while (pojoClassesIterator.hasNext()) {
			dataMap.remove("childpolicylists");
			dataMap.remove("classmethods");
			dataMap.remove("otherGetterContents");
			Entry<String, PojoClassConstruct> pojoClass = pojoClassesIterator.next();
			if(pojoClass.getKey().equals("State")) {
				Set<ClassMethodDTO> classMethodDTOList = new HashSet<ClassMethodDTO>();
				ClassMethodDTO constructor = new ClassMethodDTO();
				constructor.setAccessSpecifier("public");
				constructor.setMethodName(pojoClass.getKey());
				constructor.setParams("String Id, String Name");
				constructor.setBody("this.Id = Id;\n\t\tthis.Name = Name;");
				constructor.setReturnType("");
				classMethodDTOList.add(constructor);
				dataMap.put("classmethods", classMethodDTOList);
			}
			if(pojoClass.getKey().equals("PolicyCommon")) {
				Set<ClassMethodDTO> classMethodDTOList = new HashSet<ClassMethodDTO>();
				ClassMethodDTO constructor = new ClassMethodDTO();
				constructor.setAccessSpecifier("public");
				constructor.setMethodName(pojoClass.getKey());
				constructor.setParams("");
				StringBuilder body = new StringBuilder();
				body.append("\tState = new ArrayList<State>();\n");
				if(null!=commonConfig.getStates() && commonConfig.getStates().size()>0) {
					for(ClientState state : commonConfig.getStates()) {
						body.append("\t\tState.add(new State(\""+state.getId()+"\",\""+state.getName()+"\"));\n");
					}
				}
				constructor.setBody(body.toString());
				constructor.setReturnType("");
				classMethodDTOList.add(constructor);
				dataMap.put("classmethods", classMethodDTOList);
				
			}
			
			if (pojoClass.getValue().getInstanceVariableMap() != null) {

				Iterator<Entry<String, PojoVariablesConstruct>> variablesIterator = pojoClass.getValue()
						.getInstanceVariableMap().entrySet().iterator();

				List<String> memberVariableList = new ArrayList<String>();
				Map<String, Object> getters = new HashMap<String, Object>();
				Map<String, Object> setters = new HashMap<String, Object>();
				

				List<String> childpolicylist = new ArrayList<String>();//getChildCreator(toGetChildCreator);

				while (variablesIterator.hasNext()) {
					
					PojoVariablesConstruct variable = variablesIterator.next().getValue();
					if (variable.getVariableName().contains(".")) {
						String varName = variable.getVariableName();
						varName = varName.replace(".", "_");
						variable.setVariableName(varName);
					}
					if (variable.getVariableName().equals("Class")) {
						String varName = "Classs";
						variable.setVariableName(varName);
					}
					if (variable.getVariableName().equals("Limit")) {
						String varName = "dsLimit";
						variable.setVariableName(varName);
					}
					if (variable.getVariableName().equals("NumEmployees")) {
						String varName = "dsNumEmployees";
						variable.setVariableName(varName);
					}
					if (variable.getJavaType() != null) {
						memberVariableList.add(generateMemberVariables(variable));
						getters.put(generateGetters(variable), variable.getVariableName());
						setters.put(generateSetters(variable), variable.getVariableName());

					}
					if (null!=variable.getAdditionalDataStructure() && variable.getAdditionalDataStructure().equals("List")) {
						childpolicylist.add(variable.getVariableName());
					}
				}
				dataMap.put("classPackages", getClassPackages());
				dataMap.put("extendedclass", "Policy");


				dataMap.put("membervariablelist", memberVariableList);

				dataMap.put("getters", getters);

				dataMap.put("setters", setters);
				
				if(childpolicylist.size() > 0) {
					dataMap.put("childpolicylists", childpolicylist);
				}
				if(null!= pojoClass.getKey() && !pojoClass.getKey().equals("Policy")) {
					this.generateClasses(projectMainPackageStructure, pojoClass.getKey(), classFilePath,
						subPackageFilePath+"/domain", dataMap);
				}
			}
		}
		
		
		
		
		List<String> classPackages = new ArrayList<String>();
		classPackages.add("java.io.FileNotFoundException");
		classPackages.add("java.io.IOException");

		classPackages.add("javax.xml.stream.XMLStreamException");

		classPackages.add("org.apache.logging.log4j.LogManager");
		classPackages.add("org.apache.logging.log4j.Logger");

		classPackages.add("com.nest.res.common.RESRateDriver");
		classPackages.add("com.nest.res."+subPackage+".rules."+lobName);
		classPackages.add("com.nest.res.common.domain.Policy");
		classPackages.add("com.nest.res.common.domain.RESCommon");
		classPackages.add("com.nest.res.common.exception.LookupException");
		classPackages.add("com.nest.res.common.exception.ParserException");
		classPackages.add("com.nest.res.common.lookup.cache.RESLookupDataBase");
		classPackages.add("java.text.ParseException;");
		
		List<ClassMethodDTO> classMethodDTOList = new ArrayList<ClassMethodDTO>();
		ClassMethodDTO classMethodDTO = new ClassMethodDTO();
		classMethodDTO.setAccessSpecifier("private");
		classMethodDTO.setReturnType("Double");
		classMethodDTO.setMethodName("processRate");
		classMethodDTO.setParams("RESCommon resCommon");
		classMethodDTO.setThrowsSection("throws LookupException, FileNotFoundException, NumberFormatException, ParseException");
		classMethodDTO.setReturnValue("return policy.getTotalPremium();");
		
		StringBuilder methodBody = new StringBuilder("Policy policy = resCommon.getData();\n");
		methodBody.append("\t  com.nest.res."+subPackage+".domain.PolicyCommon policyCommon = (com.nest.res."+subPackage+".domain.PolicyCommon)policy;\n");
		methodBody.append("\t  "+lobName+" "+lobName+"Rule = new "+lobName+"(policyCommon.get"+lobName+"().get(0));\n");
		methodBody.append("\t  "+lobName+"Rule.ProcessPremium1();\n");
		methodBody.append("\t  resCommon.setData(policy);\n");
		methodBody.append("\t  policy.setTotalPremium(policyCommon.get"+lobName+"().get(0).getPremium());");
	
		classMethodDTO.setBody(methodBody.toString());
		classMethodDTOList.add(classMethodDTO);
		
		List<ClassMethodDTO> interfaceMethodDTOList = new ArrayList<ClassMethodDTO>();
		ClassMethodDTO interfaceMethodDTO = new ClassMethodDTO();
		interfaceMethodDTO.setAccessSpecifier("public");
		interfaceMethodDTO.setReturnType("Double");
		interfaceMethodDTO.setMethodName("calculateRate");
		interfaceMethodDTO.setParams("RESCommon resCommon");
		interfaceMethodDTO.setThrowsSection("throws ParserException, LookupException, XMLStreamException, IOException, NumberFormatException, ParseException");
		interfaceMethodDTO.setReturnValue("return processRate(resCommon);");
		interfaceMethodDTO.setBody("");
		
		interfaceMethodDTOList.add(interfaceMethodDTO);
		
		
		List<String> classVariableList = new ArrayList<String>();
		classVariableList.add("RESLookupDataBase lookupDatabase");
		classVariableList.add("static Logger log = Logger.getLogger("+lobName+"RateDriver.class)");
		
		
		
		dataMap = new HashMap<String, Object>();
		dataMap.put("classPackages", classPackages);
		dataMap.put("interface", "RESRateDriver");
		dataMap.put("classmethods", classMethodDTOList);
		dataMap.put("interfacemethods", interfaceMethodDTOList);
		
		dataMap.put("classvariablelist", classVariableList);
		
		
		this.generateClasses(projectMainPackageStructure, lobName+"RateDriver", classFilePath,
				subPackageFilePath+"/rate", dataMap);
		return false;
	}

	@Override
	public void generateBootStrapProperties(String projectName, String lobName) {
		StringBuilder bootStrapProperties = new StringBuilder();
		bootStrapProperties.append(projectTemplateProperties.getResProjectLocation());
		bootStrapProperties.append(projectName);
		bootStrapProperties.append(PROJECT_TOP_FOLDER_RESOURCES);
		bootStrapProperties.append("/bootstrap.properties");
		
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("host_name", "${vcap.application.uris[0]:localhost}");
		dataMap.put("metadataMap", "${vcap.application.instance_id:${spring.application.name}:${spring.application.instance_id:${server.port}}}");
		dataMap.put("serviceUrl", "${vcap.services.pwa-eureka-service.credentials.uri}/eureka/");

		templateEngineUtils.createApplicationProperties(bootstrapTemplateEngine.getEngine(), bootStrapProperties.toString(), dataMap);
		
	}

//	@Override
//	public void generateRatingServiceInterface(String packageName, String filePath, String className) {
//		
//		
//		Map<String, Object> dataMap = new HashMap<String, Object>();
//		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
//	
//		StringBuilder fileAndPath = new StringBuilder();
//		fileAndPath.append(filePath);
//		fileAndPath.append("/");
//		fileAndPath.append(className);
//		fileAndPath.append(".java");
//		
//		templateEngineUtils.createJavaClass(ratingServiceInterfaceTempate.getEngine(), fileAndPath.toString(), dataMap);
//		
//	}

//	@Override
//	public void generateRatingService(String packageName, String filePath, String className) {
//		Map<String, Object> dataMap = new HashMap<String, Object>();
//		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
//	
//		StringBuilder fileAndPath = new StringBuilder();
//		fileAndPath.append(filePath);
//		fileAndPath.append("/");
//		fileAndPath.append(className);
//		fileAndPath.append(".java");
//		
//		templateEngineUtils.createJavaClass(ratingServiceTemplate.getEngine(), fileAndPath.toString(), dataMap);
//		
//	}
//	
	@Override
	public void generateRatingChannel(String packageName, String filePath, String lobName, String state, String version) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("rateChannelName", (lobName+state+version).toUpperCase()+"Channel");
		dataMap.put("outputChannelName", (lobName+state+version).toLowerCase()+"Channel");
		dataMap.put("publishMethodName", "publishTo"+(lobName+state+version).toUpperCase());
	
		StringBuilder fileAndPath = getFilePath(filePath, (lobName+state+version).toUpperCase()+"Channel");
		
		templateEngineUtils.createJavaClass(ratingChannelTemplate.getEngine(), fileAndPath.toString(), dataMap);
		
		
	}

	@Override
	public void generateRatingService(String packageName, String filePath, String lobName, String state,
			String version) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("interfaceName", (lobName+state+version).toUpperCase()+"Service");
	
		StringBuilder fileAndPath = getFilePath(filePath, (lobName+state+version).toUpperCase()+"Service");
		
		templateEngineUtils.createJavaClass(rateServiceTemplate.getEngine(), fileAndPath.toString(), dataMap);
		
	}

	@Override
	public void generateRatingServiceImpl(String packageName, String filePath, String lobName, String state,
			String version) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("rateServiceImpl", (lobName+state+version).toUpperCase()+"ServiceImpl");
		dataMap.put("rateChannel", (lobName+state+version).toUpperCase()+"Channel");
		dataMap.put("rateService", (lobName+state+version).toUpperCase()+"Service");
		dataMap.put("version", (lobName+state+version).toUpperCase());
	
		StringBuilder fileAndPath = getFilePath(filePath, (lobName+state+version).toUpperCase()+"ServiceImpl");
		
		templateEngineUtils.createJavaClass(rateServiceImplTemplate.getEngine(), fileAndPath.toString(), dataMap);
		
	}

	private StringBuilder getFilePath(String filePath, String className) {
		StringBuilder fileAndPath = new StringBuilder();
		fileAndPath.append(filePath);
		fileAndPath.append("/");
		fileAndPath.append(className);
		fileAndPath.append(".java");
		return fileAndPath;
	}

	@Override
	public void generateRatingPublisherService(String packageName, String filePath) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));

		StringBuilder fileAndPath = getFilePath(filePath,"RatingPublisherService");
		templateEngineUtils.createJavaClass(ratingPublisherServiceTemplate.getEngine(), fileAndPath.toString(), dataMap);
	}

	@Override
	public void generateRatingPublisherServiceImpl(String packageName, String filePath, String lobName, String state,
			String version) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("rateService", (lobName+state+version).toUpperCase()+"Service");
	
		StringBuilder fileAndPath = getFilePath(filePath, "RatingPublisherServiceImpl");
		
		templateEngineUtils.createJavaClass(ratingPublisherServiceImplTemplate.getEngine(), fileAndPath.toString(), dataMap);
		
	}

	@Override
	public void generateBaseControllerBinding(String packageName, String filePath) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
	
		StringBuilder fileAndPath = getFilePath(filePath, "BaseControllerBinding");
		
		templateEngineUtils.createJavaClass(baseControllerBindingTemplate.getEngine(), fileAndPath.toString(), dataMap);
		
	}

	@Override
	public void generateBaseControllerListener(String packageName, String filePath) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("package", templateEngineUtils.getPackageName(packageName));
		dataMap.put("lookupFolder",  "${lookupFolder}");
		dataMap.put("ercDetailsFile",  "${ercDetailsFile}");
		

	
		StringBuilder fileAndPath = getFilePath(filePath, "BaseControllerListener");
		
		templateEngineUtils.createJavaClass(baseControllerListerTemplate.getEngine(), fileAndPath.toString(), dataMap);
		
	}

	@Override
	public void generateJenkinsFile(String projectname, String lobName, String state,
			String version) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("version", (lobName+state+version).toUpperCase());

		templateEngineUtils.createJenkinsFile(jenkinsFileTemplate.getEngine(), projectTemplateProperties.getResProjectLocation() + projectname, dataMap);
		
	}

}
