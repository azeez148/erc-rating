package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage;
	
	
	
	public  BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage (com.nest.res.bop.al01012026.domain.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage)  {
	  this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage = BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AggregateLimit ()  {
	  
		if(XpathNode.selectNodes(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage,"../BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage").size() > 0.0){
			this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setAggregateLimit(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage,"../BOPSexualAbuseOrSexualMolestationLiabilityClaimsMadeCoverage/AggregateLimit")))));
		}
		else{
		if(XpathNode.selectNodes(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage,"../BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage").size() > 0.0){
			this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setAggregateLimit(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage,"../BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityClaimsMadeCoverage/AggregateLimit")))));
		}
		else{
			this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setAggregateLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
	  
	}
	public void Premium ()  {
	  this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSupplementalExtendedReportingPeriodEndorsementForSexualAbuseOrSexualMolestationLiabilityCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	AggregateLimit();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}