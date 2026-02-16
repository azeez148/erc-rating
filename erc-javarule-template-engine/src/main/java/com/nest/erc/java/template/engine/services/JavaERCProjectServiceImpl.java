package com.nest.erc.java.template.engine.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.transform.impl.AddInitTransformer;
import org.springframework.stereotype.Component;

import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.LOBName;
import com.nest.erc.domain.alg.Method;
import com.nest.erc.domain.alg.Rule;
import com.nest.erc.domain.alg.Variable;
import com.nest.erc.domain.alg.VariableType;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;
import com.nest.erc.domain.alg.re.constructs.impl.PojoVariablesConstruct;


@Component
public class JavaERCProjectServiceImpl implements JavaERCProjectService {
	
	
	

	@Autowired
	private ProjectGeneratorService projectGeneratorService;
	
	@Autowired
	private RuleGeneratorService ruleGeneratorService;

	

	@Override
	public String pingTemplate() {
		return projectGeneratorService.pingMe();
	}

	@Override
	public void generateProject(String containerLocation) {
		projectGeneratorService.generateProject(containerLocation);
		
	}

	@Override
	public void generatePackagesAndClasses(String path, String className, Map<String, Object> dataMap) {
		projectGeneratorService.generatePackagesAndClasses(path, className, dataMap);
		
	}

	@Override
	public void generateMainClass(String packageName, String filePath, String className) {
		projectGeneratorService.generateMainClass(packageName, filePath, className);
		
	}

	@Override
	public void generatePOM(String projectname, String lobName) {
		projectGeneratorService.generatePOM(projectname, lobName);
		
	}

	@Override
	public void generateApplicationProperties(String projectName, String serverport) {
		projectGeneratorService.generateApplicationProperties(projectName, serverport);
		
	}

	@Override
	public String getTopFolderFilePath(String projectName, String projectMainPackageStructure) {
		return projectGeneratorService.getTopFolderFilePath(projectName, projectMainPackageStructure);
	}

	@Override
	public void generateClasses(String projectMainPackageStructure, String className, String classFilePath,
			String subPackage, Map<String, Object> dataMap) {
		projectGeneratorService.generateClasses(projectMainPackageStructure, className, classFilePath, subPackage, dataMap);
		
	}

	
	@Override
	public void copyMVNbatfiles(String sourceFile, String destFile) {
		projectGeneratorService.copyMVNbatfiles(sourceFile, destFile);
		
	}

	@Override
	public void generateRateTableLookup(String projectName, String lobName, String state, String version) {
		projectGeneratorService.generateRateTableLookup(projectName, lobName, state, version);
	}
	
//	@Override
//	public boolean writePojoClass(ERCProcessorOutput ercProcessorOutput , String projectName, String className,
//			String serverport, String projectMainPackageStructure, String lobName, String state)
//			throws FileNotFoundException, IOException {
//		System.out.println("here keri..... @@@@@@@@@@@@@");
//		return projectGeneratorService.writePojoClass(ercProcessorOutput, projectName, className, serverport, projectMainPackageStructure, lobName);
//	}

	@Override
	public void generateRuleClasses(Map<String, Rule> ruleClasses, String projectMainPackageStructure,
			String classFilePath, String lobName, ERCProcessorOutput ercProcessorOutput, String state) {
		
		ruleGeneratorService.generateRuleClasses(ruleClasses, projectMainPackageStructure, classFilePath, lobName, ercProcessorOutput, state);
	}

	@Override
	public boolean buildJavaProject(ERCProcessorOutput ercProcessorOutput,
			String lobName) {
		List<String> availableStates = new ArrayList<>(ercProcessorOutput.getAlgParserOutputs().keySet());
	    int itemIdx = availableStates.indexOf("CW");
	    availableStates.remove(itemIdx); // only state alg is processed in rule engine. CW changes overrided in state ALG s
	    
	    for(String state : availableStates) {
	    	String projectName="res"+lobName+"_"+state+"_"+ercProcessorOutput.getVersion(); 
	    	String className="Res" +lobName+"Application"; 
	    	String serverport = "9090"; 
			String projectMainPackageStructure = "com/nest/res/";
			  
			String classFilePath = getTopFolderFilePath(projectName,projectMainPackageStructure);
			generateProjectSkelton(projectName, className, serverport,projectMainPackageStructure, classFilePath, lobName, state, ercProcessorOutput.getVersion());
			createCommonPolicy(ercProcessorOutput.getClassesMaps().get(state), lobName, state, ercProcessorOutput.getVersion());
				
			try {
				projectGeneratorService.writePojoClass(ercProcessorOutput,projectName, className, serverport, projectMainPackageStructure, lobName, state);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Map<String, Rule> ruleClasses = createRuleStructure(ercProcessorOutput, lobName, state);
			
			addNonPremiumCoverages(ercProcessorOutput.getClassesMaps().get(state), ruleClasses);
			  
			generateRuleClasses(ruleClasses, projectMainPackageStructure, classFilePath, lobName, ercProcessorOutput, state);
	    	
	    }
		return false;
	}
    /**
     * Currently the rule structure contain the sub coverages which can come across the flowchart.
     * Other coverages used in alg which are not used for premium calculation is missing in rule.
     * So we add this coverages from pojo classes
     * @param ercProcessorOutput
     * @param ruleClasses
     */
	private void addNonPremiumCoverages(Map<String, PojoClassConstruct> classMap , Map<String, Rule> ruleClasses) {
		for (Map.Entry<String,Rule> entry : ruleClasses.entrySet())  {
			 Rule rule= entry.getValue();
			 PojoClassConstruct pojoClassConstruct = classMap.get(rule.getName());
			 if(null != pojoClassConstruct) {
				 Map<String, PojoVariablesConstruct> pojoVariableConstruct = pojoClassConstruct.getInstanceVariableMap();
				 for (Map.Entry<String,PojoVariablesConstruct> variable : pojoVariableConstruct.entrySet())  {
					 PojoVariablesConstruct pojoVariablesConstruct = variable.getValue();
					 if(null!=pojoVariablesConstruct.getAdditionalDataStructure() && pojoVariablesConstruct.getAdditionalDataStructure().equals("List")) {
						 Variable var = rule.getVariableMap().get(pojoVariablesConstruct.getVariableName()+"List");
						 if(null == var) {
							 String variableName = pojoVariablesConstruct.getVariableName()+"List";
							 VariableType variableType = new VariableType("List", pojoVariablesConstruct.getVariableName());
							 Variable newVariable = new Variable("private", null, variableType, variableName);
							 rule.getVariableMap().put(variableName, newVariable);
						 }
					 }
				 }
			 }
		}
	}
	/**
	 * Create a common class which is above the Lob
	 * i.e. lob node is the child of this common class
	 * @param classMap
	 * @param lobName
	 */
	private void createCommonPolicy(Map<String,PojoClassConstruct> classMap, String lobName, String stateCode, String version) {
		List<PojoClassConstruct> directChildClasses = new ArrayList<PojoClassConstruct>();
		Map<String, PojoVariablesConstruct> instanceVariableMap = new HashMap<String, PojoVariablesConstruct>();
		PojoVariablesConstruct pojoVariablesConstruct =  createVariable("Id","String",null);
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		pojoVariablesConstruct =  createVariable("Name","String",null);
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		
		PojoClassConstruct state = new PojoClassConstruct("State",instanceVariableMap,null,null);
		classMap.put("State", state);
		
		//----------------------------------------------------------------
		
		instanceVariableMap = new HashMap<String, PojoVariablesConstruct>();
		pojoVariablesConstruct = createVariable("State","State","List");
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		
		pojoVariablesConstruct = createVariable("EffDate","Date",null);
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		
		pojoVariablesConstruct = createVariable("Id","String",null);
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		
		pojoVariablesConstruct = createVariable("StateId","String",null);
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		
		pojoVariablesConstruct = createVariable(lobName,"com.nest.res."+lobName.toLowerCase()+"."+stateCode.toLowerCase()+version+".domain."+lobName,"List");
		instanceVariableMap.put(pojoVariablesConstruct.getVariableName(), pojoVariablesConstruct);
		
		
		directChildClasses = new ArrayList<PojoClassConstruct>();
		directChildClasses.add(classMap.get(lobName));
		
		PojoClassConstruct policyCommon = new PojoClassConstruct("PolicyCommon",instanceVariableMap,directChildClasses,null);
	
		classMap.put("PolicyCommon", policyCommon);
		classMap.get(lobName).setParent(policyCommon);
		
	}

	private PojoVariablesConstruct createVariable(String varName,String varType,String addDataStructure) {
		PojoVariablesConstruct pojoVariablesConstruct;
		pojoVariablesConstruct = new PojoVariablesConstruct();
		pojoVariablesConstruct.setVariableName(varName);
		pojoVariablesConstruct.setVariableType(varType);
		pojoVariablesConstruct.setAdditionalDataStructure(addDataStructure);
		return pojoVariablesConstruct;
	}

	public void generateProjectSkelton (String projectName, String className, String serverport, String projectMainPackageStructure, String classFilePath, String lobName, String state, String version) {
		generateProject(projectName);
		generateMainClass(projectMainPackageStructure+lobName.toLowerCase()+"/", classFilePath+lobName.toLowerCase()+"/", className);
		generateApplicationProperties(projectName, serverport);
		generateRateTableLookup(projectName,lobName, state, version);
		generatePOM(projectName,lobName);
		generateBootStrapProperties(projectName, lobName);
		//generateRatingServiceInterface(projectMainPackageStructure+lobName.toLowerCase()+"/service/", classFilePath+lobName.toLowerCase()+"/service/", "RatingService");
		//generateRatingService(projectMainPackageStructure+lobName.toLowerCase()+"/service/impl/", classFilePath+lobName.toLowerCase()+"/service/impl/", "RatingServiceImpl");
		// creating mq package name, class name etc
		
		String packageName = projectMainPackageStructure+lobName.toLowerCase()+"/"+(state+version).toLowerCase()+"/mq/publish/";
		String filePath = classFilePath+lobName.toLowerCase()+"/"+(state+version).toLowerCase()+"/mq/publish/";
		generateRatingChannel(packageName, filePath, lobName, state, version);
		generateRatingService(packageName, filePath, lobName, state, version);
		generateRatingServiceImpl(packageName, filePath, lobName, state, version);
		generateRatingPublisherService(packageName, filePath);
		generateRatingPublisherServiceImpl(packageName, filePath, lobName, state, version);
		
		packageName = projectMainPackageStructure+lobName.toLowerCase()+"/"+(state+version).toLowerCase()+"/mq/subscribe/";
		filePath = classFilePath+lobName.toLowerCase()+"/"+(state+version).toLowerCase()+"/mq/subscribe/";
		
		generateBaseControllerBinding(packageName, filePath);
		generateBaseControllerListener(packageName, filePath);
		generateJenkinsFile(projectName, lobName, state, version);
		
	}

	@Override
	public  Map<String,Rule> createRuleStructure(ERCProcessorOutput ercProcessorOutput, String lobName, String state) {
		 return ruleGeneratorService.createRuleStructure(ercProcessorOutput, lobName, state);
		
	}

	@Override
	public void generateBootStrapProperties(String projectname, String lobName) {
		projectGeneratorService.generateBootStrapProperties(projectname, lobName);
		
	}

//	@Override
//	public void generateRatingServiceInterface(String packageName, String filePath, String className) {
//		projectGeneratorService.generateRatingServiceInterface(packageName, filePath, className);
//		
//	}
//
//	@Override
//	public void generateRatingService(String packageName, String filePath, String className) {
//		projectGeneratorService.generateRatingService(packageName, filePath, className);
//		
//	}

	@Override
	public void generateRatingChannel(String packageName, String filePath, String lobName, String state,
			String version) {
		projectGeneratorService.generateRatingChannel(packageName, filePath, lobName, state, version);
		
	}

	@Override
	public void generateRatingService(String packageName, String filePath, String lobName, String state,
			String version) {
		projectGeneratorService.generateRatingService(packageName, filePath, lobName, state, version);
		
	}

	@Override
	public void generateRatingServiceImpl(String packageName, String filePath, String lobName, String state,
			String version) {
		projectGeneratorService.generateRatingServiceImpl(packageName, filePath, lobName, state, version);
		
	}

	@Override
	public void generateRatingPublisherService(String packageName, String filePath) {
		projectGeneratorService.generateRatingPublisherService(packageName, filePath);
		
	}

	@Override
	public void generateRatingPublisherServiceImpl(String packageName, String filePath, String lobName, String state,
			String version) {
		projectGeneratorService.generateRatingPublisherServiceImpl(packageName, filePath, lobName, state, version);
		
	}

	@Override
	public void generateBaseControllerBinding(String packageName, String filePath) {
		projectGeneratorService.generateBaseControllerBinding(packageName, filePath);
		
	}

	@Override
	public void generateBaseControllerListener(String packageName, String filePath) {
		projectGeneratorService.generateBaseControllerListener(packageName, filePath);
		
	}

	@Override
	public void generateJenkinsFile(String projectname, String lobName, String state, String version) {
		projectGeneratorService.generateJenkinsFile(projectname, lobName, state, version);
		
	}

}
