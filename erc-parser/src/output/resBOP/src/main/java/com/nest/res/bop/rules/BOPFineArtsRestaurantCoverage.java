package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFineArtsRestaurantCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPFineArtsRestaurantCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPFineArtsRestaurantCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../../IRPMFactor")))));

	  
	}
	public  BOPFineArtsRestaurantCoverage (com.nest.res.bop.domain.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage)  {
	  this.BOPFineArtsRestaurantCoverage = BOPFineArtsRestaurantCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFineArtsRestaurantCoverage.getPremium() != (double)0.0){
			this.BOPFineArtsRestaurantCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFineArtsRestaurantCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Charge ()  {
	  this.BOPFineArtsRestaurantCoverage.setCharge((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../RestaurantCharge"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}