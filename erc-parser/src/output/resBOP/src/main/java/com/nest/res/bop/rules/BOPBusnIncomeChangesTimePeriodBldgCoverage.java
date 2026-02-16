package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeChangesTimePeriodBldgCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPBusnIncomeChangesTimePeriodBldgCoverage (com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage)  {
	  this.BOPBusnIncomeChangesTimePeriodBldgCoverage = BOPBusnIncomeChangesTimePeriodBldgCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeChangesTimePeriodBldgCoverage.getPremium() != (double)0.0){
			this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../Factor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../../TotBldgPremium")))));

	  
	}
	
	
	
	
	


	
}