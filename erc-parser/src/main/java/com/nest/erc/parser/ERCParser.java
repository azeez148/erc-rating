package com.nest.erc.parser;


import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nest.erc.adapter.service.AdapterService;
import com.nest.erc.domain.AvailableLOBCoverage;
import com.nest.erc.domain.CommonConfig;
import com.nest.erc.domain.DependencyDetail;
import com.nest.erc.domain.DependencyDetails;
import com.nest.erc.domain.ERCProcessorOutput;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.rc.RCWrapper;
import com.nest.erc.domain.alg.re.constructs.impl.AlgParserOutput;
import com.nest.erc.domain.alg.re.constructs.impl.PojoClassConstruct;

@SpringBootApplication(scanBasePackages={ "com.nest.erc" })
public class ERCParser implements CommandLineRunner{

	private String baseFolder ="" ;
	
	@Autowired
	private ERCParserProjectProperties projectProperties;


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ERCParser.class);
		app.run(args);
	}

	static Logger logger = Logger.getLogger(ERCParser.class);

	@Autowired 
	ALGXMLParserService algxmlParserService;
	@Autowired 
	DSXmlParserService dsXmlParserService;
	@Autowired 
	RateTableLookupCreator rateTableLookupCreator;	
	@Autowired 
	ERCProcessorService ercProcessorService;
	@Autowired
	AdapterService adapterService;
	@Autowired
	ALGAvailableCoverageXMLParser algAvailableCoverageXMLParser;	
	@Autowired
	RCXmlRelationSetter rcXmlRelationSetter;
	
	public void generateERCProject()  {		

		try {
			System.out.println("Working directory: " + System.getProperty("user.dir"));
            String inputDirectory = projectProperties.getInputFilelocation();
            if(inputDirectory == null || inputDirectory.trim().isEmpty()) {
                throw new IllegalStateException("Property parserproject.inputFilelocation is not configured");
            }

			System.out.println("Input directory: " + inputDirectory);
			System.out.println("Absolute path: " + new File(inputDirectory).getAbsolutePath());

            File[] algFiles = getAlgFiles(inputDirectory);
            if(algFiles.length == 0) {
                throw new IllegalStateException("No XML input files found under " + inputDirectory);
            }

			 // Read DS file first
			 DSWrapper dsWrapper = null;
			 for(File file:algFiles) {
				 if(null!=file.getName() && file.getName().startsWith(projectProperties.getDsFileNameStartCharacter())) {
					 dsWrapper= dsXmlParserService.parseXML(file.getName());
					 break;
				 }
			 }
			 // Read alg and rc files
			 Map<String, AlgParserOutput>algParserOutputs = new HashedMap<String, AlgParserOutput>();
			 Map<String,RCWrapper> rcWrappers = new HashedMap<String, RCWrapper>();
			 Map<String, Map<String, PojoClassConstruct>> classesMaps = new HashMap<String, Map<String,PojoClassConstruct>>();
			 ERCProcessorOutput ercProcessorOutput = new ERCProcessorOutput();	
			 
			 logger.info("Reading input files completed");
			 for(File file:algFiles) {
				 String fileName = file.getName();
				 if(fileName.startsWith(projectProperties.getAlgFileNameStartCharcter())) {
					 String state = fileName.substring(projectProperties.getAlgFileNameStartCharcter().length(),projectProperties.getAlgFileNameStartCharcter().length()+2);
					 updateERCPackageDetails(projectProperties.getLobName(), state, projectProperties.getVersion(), "");
					 AlgParserOutput algParserOutput = algxmlParserService.parseAlg(fileName);
					 ercProcessorService.processErc(algParserOutput, dsWrapper, projectProperties.getLobName());
					 if(!state.equals("CW")) {
						 classesMaps.put(state,ercProcessorService.getClassMap());
					 }
					 algParserOutputs.put(state, algParserOutput);
				 }else if(fileName.startsWith(projectProperties.getRcFileNameStartCharcter())){
					 String state = fileName.substring(projectProperties.getRcFileNameStartCharcter().length(),projectProperties.getRcFileNameStartCharcter().length()+2);
					 RCWrapper rcWrapper = rcXmlRelationSetter.readRcXml(fileName);
					 rcWrappers.put(state, rcWrapper);
					 rateTableLookupCreator.createRateTableLookupJson(rcWrapper,projectProperties.getLobName(),state,projectProperties.getVersion());
					 
				 }else {
					 //logger.info("other xmls");
				 }
				 
				 
			 }
			logger.info("File mapping object creation completed");
			AvailableLOBCoverage availableLOBCoverages =algAvailableCoverageXMLParser.parseExcel(projectProperties.getCoverageAvailabiltyFileName());// algAvailableCoverageXMLParser.parseXML(baseFolder+coverageAvailabiltyFileName);
			
		
			//Create merged lookup files and wrapper object
			Map<String,RCWrapper> rcWrappersMerged = new HashedMap<String, RCWrapper>();
			
			for (Map.Entry<String,RCWrapper> entry : rcWrappers.entrySet()) { 
	            if(!entry.getKey().equals("CW")) {
	            	RCWrapper rcWrapperCWCopy = SerializationUtils.clone(rcWrappers.get("CW"));
	            	RCWrapper rcWrapperCombined = rcXmlRelationSetter.mergeRateContent(rcWrapperCWCopy, entry.getValue());
					rateTableLookupCreator.createRateTableLookupJson(rcWrapperCombined,projectProperties.getLobName(),"CW"+entry.getKey(),projectProperties.getVersion());
					rcWrappersMerged.put("CW"+entry.getKey(), rcWrapperCombined);
	            }
	        }
			rcWrappers.putAll(rcWrappersMerged);
			
			//ERCProcessorOutput ercProcessorOutput = ercProcessorService.getErcProcessorOutput();		
				
			ercProcessorOutput.setAlgParserOutputs(algParserOutputs);
			ercProcessorOutput.setDsWrapper(dsWrapper);
			ercProcessorOutput.setRcWrappers(rcWrappers);
			ercProcessorOutput.setAvailableLOBCoverage(availableLOBCoverages);
			ercProcessorOutput.setClassesMaps(classesMaps);
			ercProcessorOutput.setVersion(projectProperties.getVersion());
			
			try {
				ObjectMapper mapper = new ObjectMapper();
			    InputStream fileInputStream = new FileInputStream(baseFolder+projectProperties.getCommonConfigFile());
			    CommonConfig commonConfig = mapper.readValue(fileInputStream, CommonConfig.class);
			    fileInputStream.close();
			    ercProcessorOutput.setCommonConfig(commonConfig);
			}catch(Exception ex) {
				logger.info("Reading common config "+ex.getMessage());
			}
	
			logger.info("Building rate engine project started");
			boolean projectGenerated = adapterService.buildProject(ercProcessorOutput, projectProperties.getLobName(), projectProperties.getProjectType());
			logger.info("********** Automation Process completed successfully ***********");
			
			if(projectGenerated) {
				logger.info("Project Geenerated Successfully");
				logger.info("********** Automation Process completed successfully ***********");
			}
			else {
				//logger.info("Unable to Generate Project, please contact your Administrator !");
			}



		} catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
			logger.error(e.getMessage());	
			System.exit(1);
		}
		
		System.exit(0);

	}

	public File[] getAlgFiles( String dirName){
        if(dirName == null || dirName.trim().isEmpty()) {
            logger.error("Input directory path is blank");
            return new File[0];
        }
        File dir = new File(dirName);
        if(!dir.exists() || !dir.isDirectory()) {
            logger.error("Input directory does not exist or is not a directory: " + dirName);
            return new File[0];
        }

        return dir.listFiles(new FilenameFilter() {
                 public boolean accept(File dir, String filename)
                      { return filename.endsWith(".xml"); }
        } );

    }
	/**
	 * This method is used to keep an external json file for erc contents parsing details.
	 * @param lob
	 * @param state
	 * @param effectiveDate
	 * @param expiryDate
	 */
	public void updateERCPackageDetails( String lob, String state, String effectiveDate, String expiryDate) {
		 try {
			 	File file = new File(projectProperties.getErcPackageDetails()+"ErcPackageDetails.json");
			 	DependencyDetails dependecyDetails = null;
			 	ObjectMapper objectMapper = new ObjectMapper();
		        if(!file.exists()){
		        	file.createNewFile();
		        	dependecyDetails = new DependencyDetails();
		        }else {
		        	dependecyDetails = objectMapper.readValue(new FileInputStream(projectProperties.getErcPackageDetails()+"ErcPackageDetails.json"), DependencyDetails.class);
		        }
		        DependencyDetail dependencyDetail = new DependencyDetail();
		        dependencyDetail.setLob(lob);
		        dependencyDetail.setState(state);
		        dependencyDetail.setEffectiveDate(effectiveDate);
		        dependencyDetail.setExpiryDate(expiryDate);
		        
		        if(dependecyDetails.getDependencyDetailMap() == null) {
		        	Map<String, DependencyDetail> dependecyDetailMap= new HashedMap<String, DependencyDetail>();
		        	dependecyDetailMap.put(lob+state+effectiveDate, dependencyDetail);
		        	dependecyDetails.setDependencyDetailMap(dependecyDetailMap);
		        	
		        }else {
		        	dependecyDetails.getDependencyDetailMap().put(lob+state+effectiveDate, dependencyDetail);
		        }
		        
		        objectMapper.writeValue(new File(projectProperties.getErcPackageDetails()+"ErcPackageDetails.json"), dependecyDetails );
		   } catch (IOException e) {
		            e.printStackTrace();
		   }

	}
	
//	private void getForm(List<Forms> formsList) {
//		if(null!=formsList) {
//			for(Forms forms:formsList) {
//				Form form = forms.getForm();
//				if(form.getTableName().equals("BOPPharmacistsBroadCov")) {//BOPPharmacistsBroadCov
//					System.out.println("here");
//					List<Field> fields = form.getFieldList();
//				}else {
//					getForm(form.getFormsList());
//				}
//			}
//		}
//		
//	}
//	
	@Override
	public void run(String... args) throws Exception {
		baseFolder = projectProperties.getInputFilelocation();
		generateERCProject();
	}

}
