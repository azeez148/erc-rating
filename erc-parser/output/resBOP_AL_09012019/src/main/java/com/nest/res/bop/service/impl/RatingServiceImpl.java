package com.nest.res.bop.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nest.res.common.RESRateDriver;
import com.nest.res.common.domain.LOBType;
import com.nest.res.common.domain.RESCommon;
import com.nest.res.common.exception.LookupException;
import com.nest.res.common.exception.ParserException;
import com.nest.res.common.lookup.cache.RESLookupDataBase;
import com.nest.res.common.policy.parser.PolicyXmlParser;
import com.nest.res.common.util.Util;
import com.nest.res.bop.service.RatingService;

public class RatingServiceImpl implements RatingService{
	private static final Logger log = LogManager.getLogger(RatingServiceImpl.class);

	@Override
	public String ratePolicy(String policyXML, String lob, String projectState, String projectVersion, String lookupFolder) throws NumberFormatException, ParserException, XMLStreamException, IOException, ParseException, IllegalAccessException, NoSuchFieldException, SecurityException, InvocationTargetException, NoSuchMethodException {
		long startTime = System.nanoTime();
		log.info("startTime ****************************"+startTime);
		
		PolicyXmlParser inputXMLParser = new PolicyXmlParser();
		RESLookupDataBase lookupDatabase = new RESLookupDataBase();
		RESCommon resCommon = null;
		String output = "";
		Util util = new Util();
		LOBType lobType = LOBType.getTypeForValue(lob);
		try {
			//lookupDatabase.loadDataforModule(lobType, lookupFolder, projectState, projectVersion);
			resCommon = inputXMLParser.parsePolicyXMLByPolicyType(policyXML, lobType, projectState, projectVersion);
			
			RESRateDriver ratingDriver = getRatingDriver(lobType, projectState, projectVersion);
			
			if(ratingDriver == null) {
				log.info("Did'nt get  the rate driver for state  "+projectState+" for version: "+projectVersion);
				return "Could not get rate driver for state : "+projectState+" for version: "+projectVersion;
			}
			log.info("got the rate driver object "+ratingDriver);	
			log.info("Parsing completed and beginning to rate policy....");
			ratingDriver.calculateRate(resCommon);
			log.info("Rating completed....");
			
			lookupDatabase.evicLookupData(lobType);
			log.info("Generating output XML....");
			output = inputXMLParser.generateOutputDOM4J(resCommon, policyXML, lobType);
			log.info("Output XML generated for " +lobType + " ....");	
		} catch (LookupException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Completed rating Policy for " + lobType + "....");
		log.info("****************************");
		util.logElapsedTime(startTime, "Rule Evaluation Time is : ", log);
		return output;
	}
	/**
	 * 
	 * @param lobType
	 * @param projectState
	 * @param projectVersion
	 * @return
	 */
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
}
