package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationOutdoorSignsCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPLocationOutdoorSignsCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OutdoorSignsRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationOutdoorSignsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLocationOutdoorSignsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLocationOutdoorSignsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPLocationOutdoorSignsCoverage (com.nest.res.bop.al01012026.domain.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage)  {
	  this.BOPLocationOutdoorSignsCoverage = BOPLocationOutdoorSignsCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLocationOutdoorSignsCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationOutdoorSignsCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPLocationOutdoorSignsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPLocationOutdoorSignsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationOutdoorSignsCoverage,"../InlandMarineLCM")))))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPLocationOutdoorSignsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPLocationOutdoorSignsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPLocationOutdoorSignsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPLocationOutdoorSignsCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationOutdoorSignsCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPLocationOutdoorSignsCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPLocationOutdoorSignsCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationOutdoorSignsCoverage,"../InlandMarineLCM")))))));

	  
	}
	
	
	
	
	


	
}