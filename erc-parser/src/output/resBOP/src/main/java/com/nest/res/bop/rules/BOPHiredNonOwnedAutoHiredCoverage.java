package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHiredNonOwnedAutoHiredCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPHiredNonOwnedAutoHiredCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HiredAutoRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPHiredNonOwnedAutoHiredCoverage (com.nest.res.bop.domain.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage)  {
	  this.BOPHiredNonOwnedAutoHiredCoverage = BOPHiredNonOwnedAutoHiredCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoHiredCoverage.getPremium() != (double)0.0){
			this.BOPHiredNonOwnedAutoHiredCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPHiredNonOwnedAutoHiredCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPHiredNonOwnedAutoHiredCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../IncrLimitFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../../CommercialAutoLCM"))) * this.BOPHiredNonOwnedAutoHiredCoverage.getRate()))));

	  
	}
	
	
	
	
	


	
}