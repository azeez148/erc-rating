package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationPlaygroundCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage;
	
	
	
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationPlaygroundCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationPlaygroundCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationPlaygroundCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPClassificationPlaygroundCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationPlaygroundCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPlaygroundCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPClassificationPlaygroundCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationPlaygroundCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPlaygroundCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationPlaygroundCoverage.getPlayground().equals(MathHelper.getStringValue("None")) || this.BOPClassificationPlaygroundCoverage.getPlayground().equals(MathHelper.getStringValue("")) || this.BOPClassificationPlaygroundCoverage.getPlayground().equals(MathHelper.getStringValue("No Coverage")) || this.BOPClassificationPlaygroundCoverage.getPlayground().equals(MathHelper.getStringValue("Not Applicable")) || this.BOPClassificationPlaygroundCoverage.getPlayground().equals(MathHelper.getStringValue("No"))){
			this.BOPClassificationPlaygroundCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPClassificationPlaygroundCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public  BOPClassificationPlaygroundCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage)  {
	  this.BOPClassificationPlaygroundCoverage = BOPClassificationPlaygroundCoverage;

	  
	}
	
	
	
	
	


	
}