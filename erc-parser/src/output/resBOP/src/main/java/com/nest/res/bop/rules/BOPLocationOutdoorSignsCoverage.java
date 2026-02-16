package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationOutdoorSignsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPLocationOutdoorSignsCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationOutdoorSignsCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPLocationOutdoorSignsCoverage.getDsLimit() / (double)100.0) * MathHelper.roundToThousand(this.BOPLocationOutdoorSignsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationOutdoorSignsCoverage,"../InlandMarineLCM")))))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPLocationOutdoorSignsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OutdoorSignsRate",String.valueOf( "Y"))));

	  
	}
	public  BOPLocationOutdoorSignsCoverage (com.nest.res.bop.domain.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage)  {
	  this.BOPLocationOutdoorSignsCoverage = BOPLocationOutdoorSignsCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationOutdoorSignsCoverage.getPremium() != (double)0.0){
			this.BOPLocationOutdoorSignsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLocationOutdoorSignsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}