package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeChangesTimePeriodBldgCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage;
	
	
	
	public  BOPBusnIncomeChangesTimePeriodBldgCoverage (com.nest.res.bop.al09012019.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage)  {
	  this.BOPBusnIncomeChangesTimePeriodBldgCoverage = BOPBusnIncomeChangesTimePeriodBldgCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../Factor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../../TotBldgPremium")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeChangesTimePeriodBldgCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../Factor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../../TotBldgPremium")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBldgCoverage,"../../TotBldgPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeChangesTimePeriodBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}