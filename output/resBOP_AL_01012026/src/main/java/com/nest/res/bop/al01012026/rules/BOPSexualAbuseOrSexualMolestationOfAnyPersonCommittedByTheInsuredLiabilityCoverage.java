package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverageDetail;

public class BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage;
	private List<BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverageDetail> BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverageDetailList;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage,"../IRPMFactor")))));

	  
	}
	public  BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage (com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage)  {
	  this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage = BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage;
this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverageDetailList = BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.getBOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverageDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationOfAnyPersonCommittedByTheInsuredLiabilityCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}