package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsAdvertisingExpenseCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage;
	
	
	
	public void AddlAdvertisingExpenseInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsAdvertisingExpenseCoverage.setAddlAdvertisingExpenseInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingInclddLimit",String.valueOf( "Y"))));

	  
	}
	public  BOPRestaurantsAdvertisingExpenseCoverage (com.nest.res.bop.al09012019.domain.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage)  {
	  this.BOPRestaurantsAdvertisingExpenseCoverage = BOPRestaurantsAdvertisingExpenseCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlAdvertisingExpenseInclddLimit();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPRestaurantsAdvertisingExpenseCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPRestaurantsAdvertisingExpenseCoverage.getDsLimit() > this.BOPRestaurantsAdvertisingExpenseCoverage.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantsAdvertisingExpenseCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsAdvertisingExpenseCoverage,"../../LCM")))) * ((MathHelper.getDoubleValue(this.BOPRestaurantsAdvertisingExpenseCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPRestaurantsAdvertisingExpenseCoverage.getAddlAdvertisingExpenseInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsAdvertisingExpenseCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsAdvertisingExpenseCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingExpenseAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPRestaurantsAdvertisingExpenseCoverage.getDsLimit() > this.BOPRestaurantsAdvertisingExpenseCoverage.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantsAdvertisingExpenseCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsAdvertisingExpenseCoverage,"../../LCM")))) * ((MathHelper.getDoubleValue(this.BOPRestaurantsAdvertisingExpenseCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPRestaurantsAdvertisingExpenseCoverage.getAddlAdvertisingExpenseInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsAdvertisingExpenseCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsAdvertisingExpenseCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}