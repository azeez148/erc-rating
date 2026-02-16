package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationAmusementAreaCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationAmusementAreaCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationAmusementAreaCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationAmusementAreaCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPClassificationAmusementAreaCoverage (com.nest.res.bop.al09012019.domain.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage)  {
	  this.BOPClassificationAmusementAreaCoverage = BOPClassificationAmusementAreaCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPClassificationAmusementAreaCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationAmusementAreaCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAmusementAreaCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPClassificationAmusementAreaCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationAmusementAreaCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAmusementAreaCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPClassificationAmusementAreaCoverage.getAmusementArea().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassificationAmusementAreaCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationAmusementAreaCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}