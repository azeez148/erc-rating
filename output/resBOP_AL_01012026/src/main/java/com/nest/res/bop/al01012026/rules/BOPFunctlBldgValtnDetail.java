package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtnCoverage;

public class BOPFunctlBldgValtnDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtnDetail BOPFunctlBldgValtnDetail;
	private com.nest.res.bop.al01012026.rules.BOPFunctlBldgValtnCoverage BOPFunctlBldgValtnCoverageRule;
	private List<BOPFunctlBldgValtnCoverage> BOPFunctlBldgValtnCoverageList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFunctlBldgValtnDetail.setPremium(MathHelper.getDoubleValue(this.BOPFunctlBldgValtnDetail.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnDetail,"BOPFunctlBldgValtnCoverage/Premium")))));

	  
	}
	public  BOPFunctlBldgValtnDetail (com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtnDetail BOPFunctlBldgValtnDetail)  {
	  this.BOPFunctlBldgValtnDetail = BOPFunctlBldgValtnDetail;
this.BOPFunctlBldgValtnCoverageList = BOPFunctlBldgValtnDetail.getBOPFunctlBldgValtnCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPFunctlBldgValtnCoverageList){
		for(BOPFunctlBldgValtnCoverage BOPFunctlBldgValtnCoverage:BOPFunctlBldgValtnCoverageList){
			BOPFunctlBldgValtnCoverageRule = new com.nest.res.bop.al01012026.rules.BOPFunctlBldgValtnCoverage(BOPFunctlBldgValtnCoverage);
			BOPFunctlBldgValtnCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}