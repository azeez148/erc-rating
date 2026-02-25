package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceCoverage BOPAutoServiceCoverage;
	
	
	
	public  BOPAutoServiceCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceCoverage BOPAutoServiceCoverage)  {
	  this.BOPAutoServiceCoverage = BOPAutoServiceCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPAutoServiceCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceCoverage,"../../CommercialAutoLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceCoverage,"../../IRPMFactor")))));

	  
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
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPAutoServiceCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceCoverage,"../../CommercialAutoLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceCoverage,"../../IRPMFactor")))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(this.BOPAutoServiceCoverage.getNumberOfEmployees() >= MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutoServiceRisksRate",String.valueOf(this.BOPAutoServiceCoverage.getNumberOfEmployees())))));
		}
		else{
			this.BOPAutoServiceCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPAutoServiceCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	
	
	
	
	


	
}