package com.nest.res.bop.rate;


import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.nest.res.RESRateDriver;
import com.nest.res.bop.rules.BOP;
import com.nest.res.domain.Policy;
import com.nest.res.domain.RESCommon;
import com.nest.res.exception.LookupException;
import com.nest.res.exception.ParserException;
import com.nest.res.lookup.cache.RESLookupDataBase;
import java.text.ParseException;;

public class BOPRateDriver  implements RESRateDriver    {
	
	
	
	private Double processRate (RESCommon resCommon) throws LookupException, FileNotFoundException, NumberFormatException, ParseException {
	  Policy policy = resCommon.getData();
	  com.nest.res.bop.domain.PolicyCommon policyCommon = (com.nest.res.bop.domain.PolicyCommon)policy;
	  BOP BOPRule = new BOP(policyCommon.getBOP().get(0));
	  BOPRule.ProcessPremium1();
	  resCommon.setData(policy);
	  return policy.getTotalPremium();
	}
	
	@Override
	public Double calculateRate (RESCommon resCommon) throws ParserException, LookupException, XMLStreamException, IOException, NumberFormatException, ParseException {
	  
	  return processRate(resCommon);
	}
	
	
	


	
}