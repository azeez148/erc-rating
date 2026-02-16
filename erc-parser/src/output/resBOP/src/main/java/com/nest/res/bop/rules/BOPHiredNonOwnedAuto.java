package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedCoverage;
import com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage;
import com.nest.res.bop.domain.BOPHiredNonOwnedAutoHiredCoverage;

public class BOPHiredNonOwnedAuto  {

	
	
	
	private com.nest.res.bop.rules.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverageRule;
	private List<BOPHiredNonOwnedAutoNonOwnedCoverage> BOPHiredNonOwnedAutoNonOwnedCoverageList;
	private com.nest.res.bop.rules.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageRule;
	private com.nest.res.bop.domain.BOPHiredNonOwnedAuto BOPHiredNonOwnedAuto;
	private com.nest.res.bop.rules.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverageRule;
	private List<BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage> BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList;
	private List<BOPHiredNonOwnedAutoHiredCoverage> BOPHiredNonOwnedAutoHiredCoverageList;
	
	
	
	public  BOPHiredNonOwnedAuto (com.nest.res.bop.domain.BOPHiredNonOwnedAuto BOPHiredNonOwnedAuto)  {
	  this.BOPHiredNonOwnedAuto = BOPHiredNonOwnedAuto;
this.BOPHiredNonOwnedAutoNonOwnedCoverageList = BOPHiredNonOwnedAuto.getBOPHiredNonOwnedAutoNonOwnedCoverage();
this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList = BOPHiredNonOwnedAuto.getBOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage();
this.BOPHiredNonOwnedAutoHiredCoverageList = BOPHiredNonOwnedAuto.getBOPHiredNonOwnedAutoHiredCoverage();

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	IncrLimitFactor();
	
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPHiredNonOwnedAutoNonOwnedCoverageList != null && this.BOPHiredNonOwnedAutoNonOwnedCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage : BOPHiredNonOwnedAutoNonOwnedCoverageList) {
				finalPremium = finalPremium + BOPHiredNonOwnedAutoNonOwnedCoverage.getPremium();
			}
		}
		if(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList != null && this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage : BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList) {
				finalPremium = finalPremium + BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.getPremium();
			}
		}
		if(this.BOPHiredNonOwnedAutoHiredCoverageList != null && this.BOPHiredNonOwnedAutoHiredCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage : BOPHiredNonOwnedAutoHiredCoverageList) {
				finalPremium = finalPremium + BOPHiredNonOwnedAutoHiredCoverage.getPremium();
			}
		}
this.BOPHiredNonOwnedAuto.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPHiredNonOwnedAutoHiredCoverageList){
		for(BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage:BOPHiredNonOwnedAutoHiredCoverageList){
			BOPHiredNonOwnedAutoHiredCoverageRule = new com.nest.res.bop.rules.BOPHiredNonOwnedAutoHiredCoverage(BOPHiredNonOwnedAutoHiredCoverage);
			BOPHiredNonOwnedAutoHiredCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPHiredNonOwnedAutoNonOwnedCoverageList){
		for(BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage:BOPHiredNonOwnedAutoNonOwnedCoverageList){
			BOPHiredNonOwnedAutoNonOwnedCoverageRule = new com.nest.res.bop.rules.BOPHiredNonOwnedAutoNonOwnedCoverage(BOPHiredNonOwnedAutoNonOwnedCoverage);
			BOPHiredNonOwnedAutoNonOwnedCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList){
		for(BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage:BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList){
			BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageRule = new com.nest.res.bop.rules.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage(BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage);
			BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto,"../EachOccLimit"))).equals((String)"300,000")){
			this.BOPHiredNonOwnedAuto.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HiredNonownedAutoIncrLimitFactor",((String)XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto," ../EachOccLimit")))));
		}
		else{
			this.BOPHiredNonOwnedAuto.setIncrLimitFactor((double)1.0);
		}
	  
	}
	
	
	
	
	


	
}