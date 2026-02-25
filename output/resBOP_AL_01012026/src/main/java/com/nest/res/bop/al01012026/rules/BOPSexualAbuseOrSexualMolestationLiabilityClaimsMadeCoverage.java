package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverageDetail;

public class BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage  {

	
	
	
	private List<BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverageDetail> BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverageDetailList;
	private com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage (com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage)  {
	  this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage = BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage;
this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverageDetailList = BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.getBOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverageDetail();

	  
	}
	public void Premium ()  {
	  this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}