package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail;
import com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
import com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
import com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
import com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
import com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;

public class BOPContrctrsInstalltnToolsAndEquipmtCov  {

	
	
	
	private List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetailList;
	private List<BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList;
	private List<BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageRule;
	private List<BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageRule;
	private List<BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage> BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageRule;
	private List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList;
	private com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCov;
	private com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageRule;
	
	
	
	public  BOPContrctrsInstalltnToolsAndEquipmtCov (com.nest.res.bop.al01012026.domain.BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCov)  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov = BOPContrctrsInstalltnToolsAndEquipmtCov;
this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetailList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail();
this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage();
this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList = BOPContrctrsInstalltnToolsAndEquipmtCov.getBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage();

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	limit_1();
	
	ScheduledLimit();
	
	TotalLimit();
	
	DeductibleFactor();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage:BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageRule = new com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage(BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage:BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageRule = new com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage(BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage:BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageRule = new com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage(BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage:BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageRule = new com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage(BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList){
		for(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage:BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageList){
			BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageRule = new com.nest.res.bop.al01012026.rules.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage);
			BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void limit_1 ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setLimit_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))))));
		}		}

	  
	}
	public void TotalLimit ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setTotalLimit(MathHelper.getIntegerValue(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage/dsLimit"))) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage/dsLimit"))) + this.BOPContrctrsInstalltnToolsAndEquipmtCov.getScheduledLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage/dsLimit")))) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage/dsLimit")))));

	  
	}
	public void DeductibleFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect().equals(MathHelper.getStringValue("250"))){
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("Optnl250FixedDedFactor",String.valueOf( "Y")))));
		}
		else{
		if(!this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect().equals(MathHelper.getStringValue("0")) && !this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect().equals(MathHelper.getStringValue(""))){
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",String.valueOf(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getDeductibleSelect()),String.valueOf(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getTotalLimit())))));
		}
		else{
			this.BOPContrctrsInstalltnToolsAndEquipmtCov.setDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setPremium(MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage/Premium")))));
this.BOPContrctrsInstalltnToolsAndEquipmtCov.setPremium(MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage/Premium")))));
this.BOPContrctrsInstalltnToolsAndEquipmtCov.setPremium(MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage/Premium")))));
this.BOPContrctrsInstalltnToolsAndEquipmtCov.setPremium(MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage/Premium")))));
this.BOPContrctrsInstalltnToolsAndEquipmtCov.setPremium(MathHelper.getDoubleValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPContrctrsInstalltnToolsAndEquipmtCov,"BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage/Premium")))));

	  
	}
	public void ScheduledLimit ()  {
	  this.BOPContrctrsInstalltnToolsAndEquipmtCov.setScheduledLimit(this.BOPContrctrsInstalltnToolsAndEquipmtCov.getLimit_1());

	  
	}
	
	
	
	
	


	
}