package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
import com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnCoverage;

public class BOPFunctlBusnPrsnlPropValtnDetail  {

	
	
	
	private List<BOPNamedPerilsFunctlBusnPrsnlPropCoverage> BOPNamedPerilsFunctlBusnPrsnlPropCoverageList;
	private List<BOPFunctlBusnPrsnlPropValtnCoverage> BOPFunctlBusnPrsnlPropValtnCoverageList;
	private com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverageRule;
	private com.nest.res.bop.rules.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverageRule;
	private com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPFunctlBusnPrsnlPropValtnCoverageList){
		for(BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage:BOPFunctlBusnPrsnlPropValtnCoverageList){
			BOPFunctlBusnPrsnlPropValtnCoverageRule = new com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtnCoverage(BOPFunctlBusnPrsnlPropValtnCoverage);
			BOPFunctlBusnPrsnlPropValtnCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsFunctlBusnPrsnlPropCoverageList){
		for(BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage:BOPNamedPerilsFunctlBusnPrsnlPropCoverageList){
			BOPNamedPerilsFunctlBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPNamedPerilsFunctlBusnPrsnlPropCoverage(BOPNamedPerilsFunctlBusnPrsnlPropCoverage);
			BOPNamedPerilsFunctlBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public  BOPFunctlBusnPrsnlPropValtnDetail (com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail)  {
	  this.BOPFunctlBusnPrsnlPropValtnDetail = BOPFunctlBusnPrsnlPropValtnDetail;
this.BOPNamedPerilsFunctlBusnPrsnlPropCoverageList = BOPFunctlBusnPrsnlPropValtnDetail.getBOPNamedPerilsFunctlBusnPrsnlPropCoverage();
this.BOPFunctlBusnPrsnlPropValtnCoverageList = BOPFunctlBusnPrsnlPropValtnDetail.getBOPFunctlBusnPrsnlPropValtnCoverage();

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverageList != null && this.BOPNamedPerilsFunctlBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage : BOPNamedPerilsFunctlBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPNamedPerilsFunctlBusnPrsnlPropCoverage.getPremium();
			}
		}
		if(this.BOPFunctlBusnPrsnlPropValtnCoverageList != null && this.BOPFunctlBusnPrsnlPropValtnCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage : BOPFunctlBusnPrsnlPropValtnCoverageList) {
				finalPremium = finalPremium + BOPFunctlBusnPrsnlPropValtnCoverage.getPremium();
			}
		}
this.BOPFunctlBusnPrsnlPropValtnDetail.setPremium(finalPremium) ;
	  
	}
	
	
	
	
	


	
}