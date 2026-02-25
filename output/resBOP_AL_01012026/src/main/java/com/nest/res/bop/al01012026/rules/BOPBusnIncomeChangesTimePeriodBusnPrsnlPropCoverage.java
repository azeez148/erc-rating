package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage,"../Factor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage,"../../TotBusnPrsnlPropPremium")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage,"../Factor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage,"../../TotBusnPrsnlPropPremium")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage (com.nest.res.bop.al01012026.domain.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage)  {
	  this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage = BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage,"../../TotBusnPrsnlPropPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}