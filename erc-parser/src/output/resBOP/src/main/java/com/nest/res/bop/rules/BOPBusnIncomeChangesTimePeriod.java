package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage;
import com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage;

public class BOPBusnIncomeChangesTimePeriod  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriod;
	private List<BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage> BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList;
	private List<BOPBusnIncomeChangesTimePeriodBldgCoverage> BOPBusnIncomeChangesTimePeriodBldgCoverageList;
	private com.nest.res.bop.rules.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverageRule;
	private com.nest.res.bop.rules.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageRule;
	
	
	
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList != null && this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage : BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage.getPremium();
			}
		}
		if(this.BOPBusnIncomeChangesTimePeriodBldgCoverageList != null && this.BOPBusnIncomeChangesTimePeriodBldgCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage : BOPBusnIncomeChangesTimePeriodBldgCoverageList) {
				finalPremium = finalPremium + BOPBusnIncomeChangesTimePeriodBldgCoverage.getPremium();
			}
		}
this.BOPBusnIncomeChangesTimePeriod.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPBusnIncomeChangesTimePeriodBldgCoverageList){
		for(BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage:BOPBusnIncomeChangesTimePeriodBldgCoverageList){
			BOPBusnIncomeChangesTimePeriodBldgCoverageRule = new com.nest.res.bop.rules.BOPBusnIncomeChangesTimePeriodBldgCoverage(BOPBusnIncomeChangesTimePeriodBldgCoverage);
			BOPBusnIncomeChangesTimePeriodBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList){
		for(BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage:BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList){
			BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage(BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage);
			BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public  BOPBusnIncomeChangesTimePeriod (com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriod)  {
	  this.BOPBusnIncomeChangesTimePeriod = BOPBusnIncomeChangesTimePeriod;
this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList = BOPBusnIncomeChangesTimePeriod.getBOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage();
this.BOPBusnIncomeChangesTimePeriodBldgCoverageList = BOPBusnIncomeChangesTimePeriod.getBOPBusnIncomeChangesTimePeriodBldgCoverage();

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPBusnIncomeChangesTimePeriod.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeChangesTimePeriodFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}