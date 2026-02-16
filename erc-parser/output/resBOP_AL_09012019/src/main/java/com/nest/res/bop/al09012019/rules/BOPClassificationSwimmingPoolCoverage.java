package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationSwimmingPoolCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPClassificationSwimmingPoolCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SwimmingPoolRate",String.valueOf( "Y"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationSwimmingPoolCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationSwimmingPoolCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationSwimmingPoolCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPClassificationSwimmingPoolCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationSwimmingPoolCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPClassificationSwimmingPoolCoverage.getNumSwimmingPools()) * MathHelper.roundUpDoller(this.BOPClassificationSwimmingPoolCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationSwimmingPoolCoverage,"../GeneralLiabilityLCM")))))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationSwimmingPoolCoverage.getNumSwimmingPools() == MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationSwimmingPoolCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationSwimmingPoolCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public  BOPClassificationSwimmingPoolCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage)  {
	  this.BOPClassificationSwimmingPoolCoverage = BOPClassificationSwimmingPoolCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPClassificationSwimmingPoolCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationSwimmingPoolCoverage,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPClassificationSwimmingPoolCoverage.getNumSwimmingPools()) * MathHelper.roundUpDoller(this.BOPClassificationSwimmingPoolCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationSwimmingPoolCoverage,"../GeneralLiabilityLCM")))))));

	  
	}
	
	
	
	
	


	
}