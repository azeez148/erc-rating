package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsRestaurantsCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPRestaurantsRestaurantsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsRestaurantsCoverage.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantCharge",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPRestaurantsRestaurantsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsRestaurantsCoverage,"../../LCM"))) * this.BOPRestaurantsRestaurantsCoverage.getCharge()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsRestaurantsCoverage,"../../../IRPMFactor")))));

	  
	}
	public  BOPRestaurantsRestaurantsCoverage (com.nest.res.bop.al01012026.domain.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage)  {
	  this.BOPRestaurantsRestaurantsCoverage = BOPRestaurantsRestaurantsCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPRestaurantsRestaurantsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsRestaurantsCoverage,"../../LCM"))) * this.BOPRestaurantsRestaurantsCoverage.getCharge()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsRestaurantsCoverage,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsRestaurantsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPRestaurantsRestaurantsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPRestaurantsRestaurantsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}