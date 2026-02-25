package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroDamageToPremisesRentedToYouCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroDamageToPremisesRentedToYouCoverage BOPMicroDamageToPremisesRentedToYouCoverage;
	
	
	
	public  BOPMicroDamageToPremisesRentedToYouCoverage (com.nest.res.bop.al01012026.domain.BOPMicroDamageToPremisesRentedToYouCoverage BOPMicroDamageToPremisesRentedToYouCoverage)  {
	  this.BOPMicroDamageToPremisesRentedToYouCoverage = BOPMicroDamageToPremisesRentedToYouCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void IncludedLimit () throws LookupException,NumberFormatException {
	  this.BOPMicroDamageToPremisesRentedToYouCoverage.setIncludedLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MicroDamageToPremisesRentedToYouIncludedLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroDamageToPremisesRentedToYouCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPMicroDamageToPremisesRentedToYouCoverage.getDsLimit() > this.BOPMicroDamageToPremisesRentedToYouCoverage.getIncludedLimit()){
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroDamageToPremisesRentedToYouCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroDamageToPremisesRentedToYouCoverage,"../MicroLCM")))) * ((MathHelper.getDoubleValue(this.BOPMicroDamageToPremisesRentedToYouCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPMicroDamageToPremisesRentedToYouCoverage.getIncludedLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroDamageToPremisesRentedToYouCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void LossCost () throws LookupException,NumberFormatException {
	  this.BOPMicroDamageToPremisesRentedToYouCoverage.setLossCost(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroDamageToPremisesRentedToYouLossCost",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncludedLimit();
	
	LossCost();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroDamageToPremisesRentedToYouCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPMicroDamageToPremisesRentedToYouCoverage.getDsLimit() > this.BOPMicroDamageToPremisesRentedToYouCoverage.getIncludedLimit()){
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroDamageToPremisesRentedToYouCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroDamageToPremisesRentedToYouCoverage,"../MicroLCM")))) * ((MathHelper.getDoubleValue(this.BOPMicroDamageToPremisesRentedToYouCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPMicroDamageToPremisesRentedToYouCoverage.getIncludedLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroDamageToPremisesRentedToYouCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPMicroDamageToPremisesRentedToYouCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}