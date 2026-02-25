package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHiredNonOwnedAutoHiredCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPHiredNonOwnedAutoHiredCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HiredAutoRate",String.valueOf( "Y"))));

	  
	}
	public  BOPHiredNonOwnedAutoHiredCoverage (com.nest.res.bop.al01012026.domain.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage)  {
	  this.BOPHiredNonOwnedAutoHiredCoverage = BOPHiredNonOwnedAutoHiredCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoHiredCoverage.getLiabilityCoverage().equals(MathHelper.getStringValue("Yes"))){
			this.BOPHiredNonOwnedAutoHiredCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPHiredNonOwnedAutoHiredCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoHiredCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPHiredNonOwnedAutoHiredCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPHiredNonOwnedAutoHiredCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPHiredNonOwnedAutoHiredCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../IncrLimitFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../../CommercialAutoLCM"))) * this.BOPHiredNonOwnedAutoHiredCoverage.getRate()))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPHiredNonOwnedAutoHiredCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../IncrLimitFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoHiredCoverage,"../../CommercialAutoLCM"))) * this.BOPHiredNonOwnedAutoHiredCoverage.getRate()))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}