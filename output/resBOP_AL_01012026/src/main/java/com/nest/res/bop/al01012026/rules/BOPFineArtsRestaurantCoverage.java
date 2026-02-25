package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFineArtsRestaurantCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFineArtsRestaurantCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPFineArtsRestaurantCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFineArtsRestaurantCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFineArtsRestaurantCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFineArtsRestaurantCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Charge ()  {
	  this.BOPFineArtsRestaurantCoverage.setCharge((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../RestaurantCharge"))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPFineArtsRestaurantCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPFineArtsRestaurantCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../LCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../../IRPMFactor")))));

	  
	}
	public  BOPFineArtsRestaurantCoverage (com.nest.res.bop.al01012026.domain.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage)  {
	  this.BOPFineArtsRestaurantCoverage = BOPFineArtsRestaurantCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPFineArtsRestaurantCoverage,"../../BOPRestaurants")) != null){
			this.BOPFineArtsRestaurantCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFineArtsRestaurantCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Charge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}