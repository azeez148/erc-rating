package com.nest.erc.parser;

import java.io.FileWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nest.erc.domain.LOBName;
import com.nest.erc.domain.alg.rc.RCWrapper;
import com.nest.erc.domain.alg.rc.RateTable;

@Component
public class RateTableLookupCreatorImpl implements RateTableLookupCreator {
	public static void main(String args[]){
		RCXmlRelationSetter rcXmlRelationSetter = new RCXmlRelationSetter();
		RCWrapper rcWrapper = rcXmlRelationSetter.readRcXml("RC-BP-CW-09012019-V01.xml");
		RateTableLookupCreatorImpl rateTableLookupCreator = new RateTableLookupCreatorImpl();
		//LOBName lobName = LOBName.BOP;
		rateTableLookupCreator.createRateTableLookupJson(rcWrapper,"BOP","CW","");
	}
	
	@Autowired
	private ERCParserProjectProperties projectProperties;
	
	@Override
	public void createRateTableLookupJson(RCWrapper rcWrapper, String lobName, String type, String version){
		List<RateTable> rateTableList = rcWrapper.getRateTableList();
		ObjectMapper Obj = new ObjectMapper();
		try {
			String jsonStr = Obj.writeValueAsString(rateTableList);
			writeJsonToFile(jsonStr,lobName,type,version);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	/**
	 * write json file into an out put file
	 * @param json
	 * @return
	 */
	private boolean writeJsonToFile(String json, String lobName, String type, String version) {
		String folderPath = projectProperties.getContainerlocation();
		try (FileWriter file = new FileWriter(folderPath+lobName+"_RateTableJson_"+type+version+".txt")) {
			file.write(json);
			//System.out.println("Successfully Copied JSON to File...");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	/**
	 * 
	 * @param keyList
	 * @param name
	 * @return
	 */
	
}
