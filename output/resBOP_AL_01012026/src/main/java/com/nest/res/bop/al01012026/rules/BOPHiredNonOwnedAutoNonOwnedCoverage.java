package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHiredNonOwnedAutoNonOwnedCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoNonOwnedCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
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
	public  BOPHiredNonOwnedAutoNonOwnedCoverage (com.nest.res.bop.al01012026.domain.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage)  {
	  this.BOPHiredNonOwnedAutoNonOwnedCoverage = BOPHiredNonOwnedAutoNonOwnedCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../NumberOfEmployees"))) >= MathHelper.getIntegerValue(0.0)){
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NonownedAutoLiabilityWithDeliveryRate",String.valueOf(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../NumberOfEmployees"))))));
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../IncrLimitFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../../CommercialAutoLCM"))) * this.BOPHiredNonOwnedAutoNonOwnedCoverage.getRate()))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoNonOwnedCoverage.getLiabilityCoverage().equals(MathHelper.getStringValue("Yes"))){
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPHiredNonOwnedAutoNonOwnedCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../IncrLimitFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedCoverage,"../../CommercialAutoLCM"))) * this.BOPHiredNonOwnedAutoNonOwnedCoverage.getRate()))));

	  
	}
	
	
	
	
	


	
}