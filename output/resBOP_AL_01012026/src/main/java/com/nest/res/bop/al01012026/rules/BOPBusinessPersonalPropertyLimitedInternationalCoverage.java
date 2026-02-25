package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusinessPersonalPropertyLimitedInternationalCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBusinessPersonalPropertyLimitedInternationalCoverage BOPBusinessPersonalPropertyLimitedInternationalCoverage;
	
	
	
	public  BOPBusinessPersonalPropertyLimitedInternationalCoverage (com.nest.res.bop.al01012026.domain.BOPBusinessPersonalPropertyLimitedInternationalCoverage BOPBusinessPersonalPropertyLimitedInternationalCoverage)  {
	  this.BOPBusinessPersonalPropertyLimitedInternationalCoverage = BOPBusinessPersonalPropertyLimitedInternationalCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.setPremium(MathHelper.roundUpDoller(this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusinessPersonalPropertyLimitedInternationalCoverage,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.setPremium(MathHelper.roundUpDoller(this.BOPBusinessPersonalPropertyLimitedInternationalCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusinessPersonalPropertyLimitedInternationalCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}