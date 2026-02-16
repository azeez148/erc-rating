package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage;
import com.nest.res.bop.al09012019.domain.BOPBusnIncomeChangesTimePeriodBldgCoverage;

public class BOPBusnIncomeChangesTimePeriod  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriod;
	private List<BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage> BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList;
	private List<BOPBusnIncomeChangesTimePeriodBldgCoverage> BOPBusnIncomeChangesTimePeriodBldgCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageRule;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPBusnIncomeChangesTimePeriodBldgCoverageList){
		for(BOPBusnIncomeChangesTimePeriodBldgCoverage BOPBusnIncomeChangesTimePeriodBldgCoverage:BOPBusnIncomeChangesTimePeriodBldgCoverageList){
			BOPBusnIncomeChangesTimePeriodBldgCoverageRule = new com.nest.res.bop.al09012019.rules.BOPBusnIncomeChangesTimePeriodBldgCoverage(BOPBusnIncomeChangesTimePeriodBldgCoverage);
			BOPBusnIncomeChangesTimePeriodBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList){
		for(BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage:BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList){
			BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage(BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage);
			BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusnIncomeChangesTimePeriod.setPremium(MathHelper.getDoubleValue(this.BOPBusnIncomeChangesTimePeriod.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriod,"BOPBusnIncomeChangesTimePeriodBldgCoverage/Premium")))));
this.BOPBusnIncomeChangesTimePeriod.setPremium(MathHelper.getDoubleValue(this.BOPBusnIncomeChangesTimePeriod.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeChangesTimePeriod,"BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage/Premium")))));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPBusnIncomeChangesTimePeriod.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeChangesTimePeriodFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPBusnIncomeChangesTimePeriod (com.nest.res.bop.al09012019.domain.BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriod)  {
	  this.BOPBusnIncomeChangesTimePeriod = BOPBusnIncomeChangesTimePeriod;
this.BOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverageList = BOPBusnIncomeChangesTimePeriod.getBOPBusnIncomeChangesTimePeriodBusnPrsnlPropCoverage();
this.BOPBusnIncomeChangesTimePeriodBldgCoverageList = BOPBusnIncomeChangesTimePeriod.getBOPBusnIncomeChangesTimePeriodBldgCoverage();

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	  
	}
	
	
	
	
	


	
}