package com.nest.res.bop.al01012026.mq.subscribe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nest.res.bop.al09012019.mq.publish.RatingPublisherService;
import com.nest.res.common.RESRateDriver;
import com.nest.res.common.domain.CommonConfig;
import com.nest.res.common.domain.DependencyDetail;
import com.nest.res.common.domain.DependencyDetails;
import com.nest.res.common.domain.LOBType;
import com.nest.res.common.domain.RESCommon;
import com.nest.res.common.exception.LookupException;
import com.nest.res.common.exception.ParserException;
import com.nest.res.common.lookup.cache.RESLookupDataBase;
import com.nest.res.common.policy.parser.PolicyXmlParser;

@EnableBinding(BaseControllerBinding.class)
public class BaseControllerListener {
	@Value( "${lookupFolder}" )
	private String lookupFolder;
	@Value( "${ercDetailsFile}" )
	private String ercDetailsFile;

	@Autowired
	RatingPublisherService ratingPublisherService;
	
	@StreamListener(target = BaseControllerBinding.CONTROLLER_SUBSCRIBE_CHANNEL)
	public void calculateRate(String policyXML) {
		try {
			
			String commonConfigFile = "CommonConfig.json";
			CommonConfig commonConfig  = null;
			try {
				ObjectMapper mapper = new ObjectMapper();
			    InputStream fileInputStream = new FileInputStream(lookupFolder+commonConfigFile);
			    commonConfig = mapper.readValue(fileInputStream, CommonConfig.class);
			    fileInputStream.close();
			}catch(Exception ex) {
			}
			
			RESLookupDataBase lookupDatabase = new RESLookupDataBase();
			List<DependencyDetail> dependencyDetails = getProjectDependencyDetails(lookupFolder, ercDetailsFile);
			System.out.println("********here producer>> "+policyXML.length());
			//File file = ResourceUtils.getFile("classpath:BOP_RateTableJson_CWAL09012019.txt");
			File file = new File(lookupFolder+"BOP_RateTableJson_CWAL09012019.txt");
			String path = file.getParent()+"\\";
			
			//	String fileName = baseFolderName.concat(module.name()).concat("_RateTableJson_CW"+state+version+".txt");
			
			lookupDatabase.loadDataforModule(file);
			PolicyXmlParser inputXMLParser = new PolicyXmlParser();
			Map<String,String> policyDetail = inputXMLParser.getPolicyDetail(policyXML, commonConfig);
			String projectState = policyDetail.get("state");
			String projectVersion = getProjectVersion(LOBType.BOP.name(), policyDetail.get("effDate"), policyDetail.get("state"), dependencyDetails);
			RESCommon resCommon  = inputXMLParser.parsePolicyXMLByPolicyType(policyXML, LOBType.BOP, projectState, projectVersion);
			RESRateDriver ratingDriver = getRatingDriver(LOBType.BOP, projectState, projectVersion);
			ratingDriver.calculateRate(resCommon);
			lookupDatabase.evicLookupData(LOBType.BOP);
			String output = inputXMLParser.generateOutputDOM4J(resCommon, policyXML, LOBType.BOP);
			System.out.println(">>>>>");
			System.out.println(output);
			
			ratingPublisherService.getPublisher(policyXML);	
			System.out.println("*****************finished*******************");
		}
		catch (LookupException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * this method is to find the respective project  version from list of project
	 * @param path
	 * @param lobName
	 * @param effectiveDate
	 * @return
	 */
    public String getProjectVersion(String lobName, String effectiveDate, String state, List<DependencyDetail> dependencyDetails) {
   
    	if(null != dependencyDetails && dependencyDetails.size() > 0) {
    		for(DependencyDetail dependencyDetail:dependencyDetails) {
        		try {
        			String projectState = dependencyDetail.getState();
        			String lob = dependencyDetail.getLob();
					String version = dependencyDetail.getEffectiveDate();
					SimpleDateFormat sdformat = new SimpleDateFormat("MMddyyyy");
					Date d1 = sdformat.parse(version);
					Date d2 = sdformat.parse(effectiveDate);
					if(lobName.equals(lob) && state.equals(projectState) && d1.compareTo(d2) <= 0 && dependencyDetail.getExpiryDate() == null) {
					     return version;
					} 
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
    	}
    	return "";
    }
	public RESRateDriver getRatingDriver(LOBType lobType, String projectState, String projectVersion ) {
		if(lobType.equals(LOBType.BOP)) {
			String type = "com.nest.res.bop."+projectState.toLowerCase()+projectVersion+".rate.BOPRateDriver";
			Class<?> rateDriver = null;
			try {
				rateDriver = Class.forName(type);
				return (RESRateDriver) rateDriver.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	public List<DependencyDetail>  getProjectDependencyDetails(String lookupFolder, String ercDetailsFile) {
    	//File file = new File(path);
    	DependencyDetails dependencyDetails = new DependencyDetails();
    	try {
			ObjectMapper mapper = new ObjectMapper();
		    InputStream fileInputStream = new FileInputStream(lookupFolder+ercDetailsFile);
		    dependencyDetails = mapper.readValue(fileInputStream, DependencyDetails.class);
		    fileInputStream.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
    	
//    	String[] directories = file.list(new FilenameFilter() {
//    	  @Override
//    	  public boolean accept(File current, String name) {
//    	    return new File(current, name).isDirectory() && new File(current, name).getName().startsWith("res"+lobName);
//    	  }
//    	});
//    	if(null != dependencyDetails.getDependencyDetailList() && dependencyDetails.getDependencyDetailList().size() > 0) {
//    		for(String directory:getDependencyDetailList) {
//        		try {
//        			String projectState = directory.substring(directory.indexOf("_")+1, directory.indexOf("_")+3);
//					String effectiveDate = directory.substring(directory.lastIndexOf("_")+1, directory.length());
//					DependencyDetail dependencyDetail = new DependencyDetail();
//					dependencyDetail.setState(projectState);
//					dependencyDetail.setEffectiveDate(effectiveDate);
//					dependencyDetails.add(dependencyDetail);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//        	}
//    	}
    	setExpiryDate(dependencyDetails.getDependencyDetailMap());
    	return new ArrayList<DependencyDetail>(dependencyDetails.getDependencyDetailMap().values());
    }
	public void setExpiryDate(Map<String,DependencyDetail> dependencyDetailMap ) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy");
        List<Date> dates  = new ArrayList<Date>();
        Map<String,List<Date>> datesMap = new HashMap<String, List<Date>>();
        
        for (Map.Entry<String, DependencyDetail> entry : dependencyDetailMap.entrySet()) {
        	 try {
        		DependencyDetail dependencyDetail = entry.getValue();
        		Date date1 = formatter.parse(dependencyDetail.getEffectiveDate());
     			if(datesMap.get(dependencyDetail.getState()) ==  null) {
     				List<Date> dateList  = new ArrayList<Date>();
     				dateList.add(date1);
     				datesMap.put(dependencyDetail.getState(), dateList);
     			}else {
     				datesMap.get(dependencyDetail.getState()).add(date1);
     			}
     			
     		} catch (ParseException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
        }
        for (Map.Entry<String, DependencyDetail> entry : dependencyDetailMap.entrySet()) {
       	 try {
       		 	DependencyDetail dependencyDetail = entry.getValue();
    			Date date1 = formatter.parse(dependencyDetail.getEffectiveDate());
    			dates.add(date1);
    			List<Date> dateList = datesMap.get(dependencyDetail.getState());
    			Collections.sort(dateList);
    			dependencyDetail.setExpiryDate(getExpiryDate(dateList, date1));
    			
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
       }
        
        
	}
	public String getExpiryDate(List<Date> dates, Date targetDate) {
	    for (int i = 0; i < dates.size(); i++) {
	        Date date = dates.get(i);
	        int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
	        java.text.SimpleDateFormat dateFormat =
	          	new java.text.SimpleDateFormat("MMddyyyy");
	        if(date.compareTo(targetDate) > 0) {
	        	String previousDate = dateFormat.format(date.getTime() - MILLIS_IN_DAY);
	            return previousDate;
	         }
	    }
	    return null;
	}
	}
