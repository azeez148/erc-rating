package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverageDetail;

public class BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage  {

	
	
	
	private List<BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverageDetail> BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverageDetailList;
	private com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void Premium ()  {
	  this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage,"../IRPMFactor")))));

	  
	}
	public  BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage (com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage)  {
	  this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage = BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage;
this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverageDetailList = BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.getBOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverageDetail();

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}