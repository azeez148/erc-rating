package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
import com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
import com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
import com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
import com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;

public class BOPContrctrsInstalltnToolsAndEquipmtCov  {

	
	
	
	private List<BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList;
	private List<BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList;
	private com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageRule;
	private List<BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList;
	private com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageRule;
	private com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageRule;
	private List<BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage> BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList;
	private com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageRule;
	private List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList;
	private com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCov;
	private com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageRule;
	
	
	
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	limit_1();
	
	ScheduledLimit();
	
	TotalLimit();
	
	DeductibleFactor();
	
	  
	}
	public  BOPContrctrsInstalltnToolsAndEquipmtCov (com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCov)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov = BOPContrctrsInstalltnToolsAndEquipmtCov;
this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage();

	  
	}
	public void limit_1 ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setLimit_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))) > (int)0.0){
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setLimit_1(Integer.valueOf(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))));
		}		}

	  
	}
	public void TotalLimit ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setTotalLimit(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage/dsLimit"))) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage/dsLimit"))) + this.BOPContrctrsInstalltnToolsAndEquipmtCov.getScheduledLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage/dsLimit")))) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage/dsLimit"))));

	  
	}
	public void DeductibleFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect().equals((String)"250")){
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setDeductibleFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("Optnl250FixedDedFactor",String.valueOf( "Y"))));
		}
		else{
		if(!this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect().equals((String)"0") && !this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect().equals((String)"")){
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setDeductibleFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",String.valueOf(BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect()),String.valueOf(BOPContrctrsInstalltnToolsAndEquipmtCov.getTotalLimit()))));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setDeductibleFactor((double)1.0);
		}
		}
	  
	}
	public void ScheduledLimit ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setScheduledLimit(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getLimit_1());

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList != null && this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage : BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList) {
				finalPremium = finalPremium + BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage.getPremium();
			}
		}
		if(this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList != null && this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage : BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList) {
				finalPremium = finalPremium + BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage.getPremium();
			}
		}
		if(this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList != null && this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage : BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList) {
				finalPremium = finalPremium + BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage.getPremium();
			}
		}
		if(this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList != null && this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage : BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList) {
				finalPremium = finalPremium + BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage.getPremium();
			}
		}
		if(this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList != null && this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage : BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList) {
				finalPremium = finalPremium + BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage.getPremium();
			}
		}
this.BOPContrctrsInstalltnToolsAndEquipmtCov.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage:BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageRule = new com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage(BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage:BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageRule = new com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage(BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage:BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageRule = new com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage(BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage:BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageRule = new com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage(BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage:BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageRule = new com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}