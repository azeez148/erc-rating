package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantFoodContaminationCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage;
	
	
	
	public  BOPRestaurantFoodContaminationCoverage (com.nest.res.bop.al01012026.domain.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage)  {
	  this.BOPRestaurantFoodContaminationCoverage = BOPRestaurantFoodContaminationCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPRestaurantFoodContaminationCoverage.getDsLimit() > this.BOPRestaurantFoodContaminationCoverage.getInclddLimit()){
			this.BOPRestaurantFoodContaminationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantFoodContaminationCoverage.getBusnIncomeExtraExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantFoodContaminationCoverage,"../../LCM")))) * ((MathHelper.getDoubleValue(this.BOPRestaurantFoodContaminationCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPRestaurantFoodContaminationCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantFoodContaminationCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPRestaurantFoodContaminationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BusnIncomeExtraExpenseAddlCharge () throws LookupException,NumberFormatException {
	  this.BOPRestaurantFoodContaminationCoverage.setBusnIncomeExtraExpenseAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	BusnIncomeExtraExpenseAddlCharge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPRestaurantFoodContaminationCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("FoodContaminationInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPRestaurantFoodContaminationCoverage.getDsLimit() > this.BOPRestaurantFoodContaminationCoverage.getInclddLimit()){
			this.BOPRestaurantFoodContaminationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantFoodContaminationCoverage.getBusnIncomeExtraExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantFoodContaminationCoverage,"../../LCM")))) * ((MathHelper.getDoubleValue(this.BOPRestaurantFoodContaminationCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPRestaurantFoodContaminationCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantFoodContaminationCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPRestaurantFoodContaminationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPRestaurantFoodContaminationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantFoodContaminationCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPRestaurantFoodContaminationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPRestaurantFoodContaminationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}