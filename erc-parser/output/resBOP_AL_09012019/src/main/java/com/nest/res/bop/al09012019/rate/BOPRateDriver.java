package com.nest.res.bop.al09012019.rate;


import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.nest.res.common.RESRateDriver;
import com.nest.res.bop.al09012019.rules.BOP;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.domain.RESCommon;
import com.nest.res.common.exception.LookupException;
import com.nest.res.common.exception.ParserException;
import com.nest.res.common.lookup.cache.RESLookupDataBase;
import java.text.ParseException;;

public class BOPRateDriver  implements RESRateDriver    {
	
	
	
	private Double processRate (RESCommon resCommon) throws LookupException, FileNotFoundException, NumberFormatException, ParseException {
	  Policy policy = resCommon.getData();
	  com.nest.res.bop.al09012019.domain.PolicyCommon policyCommon = (com.nest.res.bop.al09012019.domain.PolicyCommon)policy;
	  BOP BOPRule = new BOP(policyCommon.getBOP().get(0));
	  BOPRule.ProcessPremium1();
	  resCommon.setData(policy);
	  policy.setTotalPremium(policyCommon.getBOP().get(0).getPremium());
	  return policy.getTotalPremium();
	}
	
	@Override
	public Double calculateRate (RESCommon resCommon) throws ParserException, LookupException, XMLStreamException, IOException, NumberFormatException, ParseException {
	  
	  return processRate(resCommon);
	}
	
	
	


	
}