package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsAdvertisingExpenseCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsAdvertisingExpenseCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingExpenseAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	AddlAdvertisingExpenseInclddLimit();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void AddlAdvertisingExpenseInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPRestaurantsAdvertisingExpenseCoverage.setAddlAdvertisingExpenseInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("AddlAdvertisingInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPRestaurantsAdvertisingExpenseCoverage.getDsLimit() > this.BOPRestaurantsAdvertisingExpenseCoverage.getAddlAdvertisingExpenseInclddLimit()){
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPRestaurantsAdvertisingExpenseCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsAdvertisingExpenseCoverage,"../../LCM")))) * (((double)this.BOPRestaurantsAdvertisingExpenseCoverage.getDsLimit() - (double)this.BOPRestaurantsAdvertisingExpenseCoverage.getAddlAdvertisingExpenseInclddLimit()) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurantsAdvertisingExpenseCoverage,"../../../IRPMFactor")))));
		}
		else{
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPRestaurantsAdvertisingExpenseCoverage.getPremium() != (double)0.0){
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPRestaurantsAdvertisingExpenseCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPRestaurantsAdvertisingExpenseCoverage (com.nest.res.bop.domain.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage)  {
	  this.BOPRestaurantsAdvertisingExpenseCoverage = BOPRestaurantsAdvertisingExpenseCoverage;

	  
	}
	
	
	
	
	


	
}