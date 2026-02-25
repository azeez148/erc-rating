package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.setPremium(MathHelper.roundUpDoller(this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage (com.nest.res.bop.al01012026.domain.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage)  {
	  this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage = BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.setPremium(MathHelper.roundUpDoller(this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPropertyInProcessOfManufactureByOthersLimitedInternationalCoverage,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}