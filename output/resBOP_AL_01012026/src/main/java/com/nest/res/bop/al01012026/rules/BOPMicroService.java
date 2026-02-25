package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPMicroServiceKeyAndLockReplacementCoverage;
import com.nest.res.bop.al01012026.domain.BOPMicroServiceRewardPaymentCoverage;
import com.nest.res.bop.al01012026.domain.BOPMicroServiceCoverage;
import com.nest.res.bop.al01012026.domain.BOPMicroServiceTheftCoverage;

public class BOPMicroService  {

	
	
	
	private List<BOPMicroServiceKeyAndLockReplacementCoverage> BOPMicroServiceKeyAndLockReplacementCoverageList;
	private List<BOPMicroServiceRewardPaymentCoverage> BOPMicroServiceRewardPaymentCoverageList;
	private List<BOPMicroServiceCoverage> BOPMicroServiceCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPMicroServiceCoverage BOPMicroServiceCoverageRule;
	private com.nest.res.bop.al01012026.domain.BOPMicroService BOPMicroService;
	private List<BOPMicroServiceTheftCoverage> BOPMicroServiceTheftCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPMicroServiceTheftCoverage BOPMicroServiceTheftCoverageRule;
	
	
	
	public  BOPMicroService (com.nest.res.bop.al01012026.domain.BOPMicroService BOPMicroService)  {
	  this.BOPMicroService = BOPMicroService;
this.BOPMicroServiceKeyAndLockReplacementCoverageList = BOPMicroService.getBOPMicroServiceKeyAndLockReplacementCoverage();
this.BOPMicroServiceRewardPaymentCoverageList = BOPMicroService.getBOPMicroServiceRewardPaymentCoverage();
this.BOPMicroServiceCoverageList = BOPMicroService.getBOPMicroServiceCoverage();
this.BOPMicroServiceTheftCoverageList = BOPMicroService.getBOPMicroServiceTheftCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPMicroServiceTheftCoverageList){
		for(BOPMicroServiceTheftCoverage BOPMicroServiceTheftCoverage:BOPMicroServiceTheftCoverageList){
			BOPMicroServiceTheftCoverageRule = new com.nest.res.bop.al01012026.rules.BOPMicroServiceTheftCoverage(BOPMicroServiceTheftCoverage);
			BOPMicroServiceTheftCoverageRule.CommonRating1();

		}
	}
	if(null != BOPMicroServiceCoverageList){
		for(BOPMicroServiceCoverage BOPMicroServiceCoverage:BOPMicroServiceCoverageList){
			BOPMicroServiceCoverageRule = new com.nest.res.bop.al01012026.rules.BOPMicroServiceCoverage(BOPMicroServiceCoverage);
			BOPMicroServiceCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroService.setPremium(MathHelper.getDoubleValue(this.BOPMicroService.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroService,"BOPMicroServiceCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}