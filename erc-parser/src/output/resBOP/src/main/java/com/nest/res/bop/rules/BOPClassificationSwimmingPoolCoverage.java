package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationSwimmingPoolCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage;
	
	
	
	public  BOPClassificationSwimmingPoolCoverage (com.nest.res.bop.domain.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage)  {
	  this.BOPClassificationSwimmingPoolCoverage = BOPClassificationSwimmingPoolCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPClassificationSwimmingPoolCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SwimmingPoolRate",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationSwimmingPoolCoverage.getPremium() != (double)0.0){
			this.BOPClassificationSwimmingPoolCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationSwimmingPoolCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPClassificationSwimmingPoolCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationSwimmingPoolCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((double)this.BOPClassificationSwimmingPoolCoverage.getNumSwimmingPools() * MathHelper.roundUpDoller(this.BOPClassificationSwimmingPoolCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationSwimmingPoolCoverage,"../GeneralLiabilityLCM")))))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}