package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAutoNonOwnedCoverage;
import com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage;
import com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAutoHiredCoverage;

public class BOPHiredNonOwnedAuto  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverageRule;
	private List<BOPHiredNonOwnedAutoNonOwnedCoverage> BOPHiredNonOwnedAutoNonOwnedCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageRule;
	private com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAuto BOPHiredNonOwnedAuto;
	private com.nest.res.bop.al09012019.rules.BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverageRule;
	private List<BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage> BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList;
	private List<BOPHiredNonOwnedAutoHiredCoverage> BOPHiredNonOwnedAutoHiredCoverageList;
	
	
	
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	IncrLimitFactor();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPHiredNonOwnedAutoHiredCoverageList){
		for(BOPHiredNonOwnedAutoHiredCoverage BOPHiredNonOwnedAutoHiredCoverage:BOPHiredNonOwnedAutoHiredCoverageList){
			BOPHiredNonOwnedAutoHiredCoverageRule = new com.nest.res.bop.al09012019.rules.BOPHiredNonOwnedAutoHiredCoverage(BOPHiredNonOwnedAutoHiredCoverage);
			BOPHiredNonOwnedAutoHiredCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPHiredNonOwnedAutoNonOwnedCoverageList){
		for(BOPHiredNonOwnedAutoNonOwnedCoverage BOPHiredNonOwnedAutoNonOwnedCoverage:BOPHiredNonOwnedAutoNonOwnedCoverageList){
			BOPHiredNonOwnedAutoNonOwnedCoverageRule = new com.nest.res.bop.al09012019.rules.BOPHiredNonOwnedAutoNonOwnedCoverage(BOPHiredNonOwnedAutoNonOwnedCoverage);
			BOPHiredNonOwnedAutoNonOwnedCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList){
		for(BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage:BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList){
			BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageRule = new com.nest.res.bop.al09012019.rules.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage(BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage);
			BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public  BOPHiredNonOwnedAuto (com.nest.res.bop.al09012019.domain.BOPHiredNonOwnedAuto BOPHiredNonOwnedAuto)  {
	  this.BOPHiredNonOwnedAuto = BOPHiredNonOwnedAuto;
this.BOPHiredNonOwnedAutoNonOwnedCoverageList = BOPHiredNonOwnedAuto.getBOPHiredNonOwnedAutoNonOwnedCoverage();
this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverageList = BOPHiredNonOwnedAuto.getBOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage();
this.BOPHiredNonOwnedAutoHiredCoverageList = BOPHiredNonOwnedAuto.getBOPHiredNonOwnedAutoHiredCoverage();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPHiredNonOwnedAuto.setPremium(MathHelper.getDoubleValue(this.BOPHiredNonOwnedAuto.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto,"BOPHiredNonOwnedAutoHiredCoverage/Premium")))));
this.BOPHiredNonOwnedAuto.setPremium(MathHelper.getDoubleValue(this.BOPHiredNonOwnedAuto.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto,"BOPHiredNonOwnedAutoNonOwnedCoverage/Premium")))));
this.BOPHiredNonOwnedAuto.setPremium(MathHelper.getDoubleValue(this.BOPHiredNonOwnedAuto.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto,"BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage/Premium")))));

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto,"../EachOccLimit"))).equals(MathHelper.getStringValue("300,000"))){
			this.BOPHiredNonOwnedAuto.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HiredNonownedAutoIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAuto,"../EachOccLimit"))))));
		}
		else{
			this.BOPHiredNonOwnedAuto.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	
	
	
	
	


	
}