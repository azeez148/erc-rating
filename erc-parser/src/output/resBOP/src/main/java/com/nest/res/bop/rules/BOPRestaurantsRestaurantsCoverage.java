package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsRestaurantsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsRestaurantsCoverage.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantCharge",String.valueOf( "Y"))));

	  
	}
	public  BOPRestaurantsRestaurantsCoverage (com.nest.res.bop.domain.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage)  {
	  this.BOPRestaurantsRestaurantsCoverage = BOPRestaurantsRestaurantsCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPRestaurantsRestaurantsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsRestaurantsCoverage,"../../LCM"))) * this.BOPRestaurantsRestaurantsCoverage.getCharge()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsRestaurantsCoverage,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsRestaurantsCoverage.getPremium() != (double)0.0){
			this.BOPRestaurantsRestaurantsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPRestaurantsRestaurantsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}