package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
import com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtnCoverage;

public class BOPFunctlBusnPrsnlPropValtnDetail  {

	
	
	
	private List<BOPNamedPerilsFunctlBusnPrsnlPropCoverage> BOPNamedPerilsFunctlBusnPrsnlPropCoverageList;
	private List<BOPFunctlBusnPrsnlPropValtnCoverage> BOPFunctlBusnPrsnlPropValtnCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverageRule;
	private com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail;
	
	
	
	public  BOPFunctlBusnPrsnlPropValtnDetail (com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtnDetail BOPFunctlBusnPrsnlPropValtnDetail)  {
	  this.BOPFunctlBusnPrsnlPropValtnDetail = BOPFunctlBusnPrsnlPropValtnDetail;
this.BOPNamedPerilsFunctlBusnPrsnlPropCoverageList = BOPFunctlBusnPrsnlPropValtnDetail.getBOPNamedPerilsFunctlBusnPrsnlPropCoverage();
this.BOPFunctlBusnPrsnlPropValtnCoverageList = BOPFunctlBusnPrsnlPropValtnDetail.getBOPFunctlBusnPrsnlPropValtnCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPFunctlBusnPrsnlPropValtnCoverageList){
		for(BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage:BOPFunctlBusnPrsnlPropValtnCoverageList){
			BOPFunctlBusnPrsnlPropValtnCoverageRule = new com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtnCoverage(BOPFunctlBusnPrsnlPropValtnCoverage);
			BOPFunctlBusnPrsnlPropValtnCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsFunctlBusnPrsnlPropCoverageList){
		for(BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage:BOPNamedPerilsFunctlBusnPrsnlPropCoverageList){
			BOPNamedPerilsFunctlBusnPrsnlPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPNamedPerilsFunctlBusnPrsnlPropCoverage(BOPNamedPerilsFunctlBusnPrsnlPropCoverage);
			BOPNamedPerilsFunctlBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFunctlBusnPrsnlPropValtnDetail.setPremium(MathHelper.getDoubleValue(this.BOPFunctlBusnPrsnlPropValtnDetail.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnDetail,"BOPFunctlBusnPrsnlPropValtnCoverage/Premium")))));
this.BOPFunctlBusnPrsnlPropValtnDetail.setPremium(MathHelper.getDoubleValue(this.BOPFunctlBusnPrsnlPropValtnDetail.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnDetail,"BOPNamedPerilsFunctlBusnPrsnlPropCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}