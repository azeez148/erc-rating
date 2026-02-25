package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlLiabExposuresCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPAddlLiabExposuresCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("No"))){
		if(this.BOPAddlLiabExposuresCoverage.getCharge() == MathHelper.getDoubleValue(0.0)){
			this.BOPAddlLiabExposuresCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPAddlLiabExposuresCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		}
		else{
			this.BOPAddlLiabExposuresCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAddlLiabExposuresCoverage (com.nest.res.bop.al01012026.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage)  {
	  this.BOPAddlLiabExposuresCoverage = BOPAddlLiabExposuresCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlLiabExposuresCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlLiabExposuresCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlLiabExposuresCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAddlLiabExposuresCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAddlLiabExposuresCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlLiabExposuresCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlLiabExposuresCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAddlLiabExposuresCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlLiabExposuresCoverage,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}