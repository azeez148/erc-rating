package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCovExcessCoverage;
import com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage;

public class BOPLimitedFungiBacteriaCov  {

	
	
	
	private List<BOPLimitedFungiBacteriaCovExcessCoverage> BOPLimitedFungiBacteriaCovExcessCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverageRule;
	private List<BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage> BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule;
	private com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov;
	
	
	
	public  BOPLimitedFungiBacteriaCov (com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov)  {
	  this.BOPLimitedFungiBacteriaCov = BOPLimitedFungiBacteriaCov;
this.BOPLimitedFungiBacteriaCovExcessCoverageList = BOPLimitedFungiBacteriaCov.getBOPLimitedFungiBacteriaCovExcessCoverage();
this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList = BOPLimitedFungiBacteriaCov.getBOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedFungiBacteriaCov.setPremium(MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCov,"BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage/Premium")))));
this.BOPLimitedFungiBacteriaCov.setPremium(MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCov,"BOPLimitedFungiBacteriaCovExcessCoverage/Premium")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
		for(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage:BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule = new com.nest.res.bop.al09012019.rules.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage);
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedFungiBacteriaCovExcessCoverageList){
		for(BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage:BOPLimitedFungiBacteriaCovExcessCoverageList){
			BOPLimitedFungiBacteriaCovExcessCoverageRule = new com.nest.res.bop.al09012019.rules.BOPLimitedFungiBacteriaCovExcessCoverage(BOPLimitedFungiBacteriaCovExcessCoverage);
			BOPLimitedFungiBacteriaCovExcessCoverageRule.ProcessPremium1();

		}
	}
	  
	}
	public void ProcessPremium2 ()  {
	  
	if(null != BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
		for(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage:BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageList){
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule = new com.nest.res.bop.al09012019.rules.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage);
			BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverageRule.ProcessPremium2();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}