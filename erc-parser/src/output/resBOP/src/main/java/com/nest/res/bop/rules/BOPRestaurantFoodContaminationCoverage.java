package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantFoodContaminationCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	BusnIncomeExtraExpenseAddlCharge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantFoodContaminationCoverage.getPremium() != (double)0.0){
			this.BOPRestaurantFoodContaminationCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPRestaurantFoodContaminationCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPRestaurantFoodContaminationCoverage (com.nest.res.bop.domain.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage)  {
	  this.BOPRestaurantFoodContaminationCoverage = BOPRestaurantFoodContaminationCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPRestaurantFoodContaminationCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("FoodContaminationInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void BusnIncomeExtraExpenseAddlCharge () throws LookupException,NumberFormatException {
	  this.BOPRestaurantFoodContaminationCoverage.setBusnIncomeExtraExpenseAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPRestaurantFoodContaminationCoverage.getDsLimit() > this.BOPRestaurantFoodContaminationCoverage.getInclddLimit()){
			this.BOPRestaurantFoodContaminationCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantFoodContaminationCoverage.getBusnIncomeExtraExpenseAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantFoodContaminationCoverage,"../../LCM")))) * (((double)this.BOPRestaurantFoodContaminationCoverage.getDsLimit() - (double)this.BOPRestaurantFoodContaminationCoverage.getInclddLimit()) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantFoodContaminationCoverage,"../../../IRPMFactor")))));
		}
		else{
			this.BOPRestaurantFoodContaminationCoverage.setPremium((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}