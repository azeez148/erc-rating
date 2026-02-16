package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHiredNonOwnedAutoNonOwnedCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPHiredNonOwnedAutoNonOwnedCoverage (com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage)  {
	  this.BOPHiredNonOwnedAutoNonOwnedCoverage = BOPHiredNonOwnedAutoNonOwnedCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPHiredNonOwnedAutoNonOwnedCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NonownedAutoRate",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../IncrLimitFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../../CommercialAutoLCM"))) * this.BOPHiredNonOwnedAutoNonOwnedCoverage.getRate()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoNonOwnedCoverage.getPremium() != (double)0.0){
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}