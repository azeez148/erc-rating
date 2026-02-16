package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlLiabExposuresCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage;
	
	
	
	public  BOPAddlLiabExposuresCoverage (com.nest.res.bop.al09012019.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage)  {
	  this.BOPAddlLiabExposuresCoverage = BOPAddlLiabExposuresCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlLiabExposuresCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAddlLiabExposuresCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlLiabExposuresCoverage,"../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPAddlLiabExposuresCoverage.getCharge() == MathHelper.getDoubleValue(0.0)){
			this.BOPAddlLiabExposuresCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPAddlLiabExposuresCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAddlLiabExposuresCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAddlLiabExposuresCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlLiabExposuresCoverage,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlLiabExposuresCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlLiabExposuresCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlLiabExposuresCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}