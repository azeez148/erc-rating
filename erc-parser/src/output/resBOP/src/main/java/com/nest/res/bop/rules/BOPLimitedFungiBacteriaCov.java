package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovExcessCoverage;
import com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage;

public class BOPLimitedFungiBacteriaCov  {

	
	
	
	private List<BOPLimitedFungiBacteriaCovExcessCoverage> BOPLimitedFungiBacteriaCovExcessCoverageList;
	private com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverageRule;
	private List<BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage> BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList;
	private com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule;
	private com.nest.res.bop.domain.BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov;
	
	
	
	public  BOPLimitedFungiBacteriaCov (com.nest.res.bop.domain.BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov)  {
	  this.BOPLimitedFungiBacteriaCov = BOPLimitedFungiBacteriaCov;
this.BOPLimitedFungiBacteriaCovExcessCoverageList = BOPLimitedFungiBacteriaCov.getBOPLimitedFungiBacteriaCovExcessCoverage();
this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList = BOPLimitedFungiBacteriaCov.getBOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage();

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPLimitedFungiBacteriaCovExcessCoverageList != null && this.BOPLimitedFungiBacteriaCovExcessCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage : BOPLimitedFungiBacteriaCovExcessCoverageList) {
				finalPremium = finalPremium + BOPLimitedFungiBacteriaCovExcessCoverage.getPremium();
			}
		}
		if(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList != null && this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage : BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList) {
				finalPremium = finalPremium + BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getPremium();
			}
		}
this.BOPLimitedFungiBacteriaCov.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
		for(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage:BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule = new com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage);
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedFungiBacteriaCovExcessCoverageList){
		for(BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage:BOPLimitedFungiBacteriaCovExcessCoverageList){
			BOPLimitedFungiBacteriaCovExcessCoverageRule = new com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovExcessCoverage(BOPLimitedFungiBacteriaCovExcessCoverage);
			BOPLimitedFungiBacteriaCovExcessCoverageRule.ProcessPremium1();

		}
	}
	  
	}
	public void ProcessPremium2 ()  {
	  
	if(null != BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
		for(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage:BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule = new com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage);
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule.ProcessPremium2();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}