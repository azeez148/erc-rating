package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationLiabilityCoverageDetail;

public class BOPSexualAbuseOrSexualMolestationLiabilityCoverage  {

	
	
	
	private List<BOPSexualAbuseOrSexualMolestationLiabilityCoverageDetail> BOPSexualAbuseOrSexualMolestationLiabilityCoverageDetailList;
	private com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationLiabilityCoverage BOPSexualAbuseOrSexualMolestationLiabilityCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.getEndorsementManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPSexualAbuseOrSexualMolestationLiabilityCoverage (com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationLiabilityCoverage BOPSexualAbuseOrSexualMolestationLiabilityCoverage)  {
	  this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage = BOPSexualAbuseOrSexualMolestationLiabilityCoverage;
this.BOPSexualAbuseOrSexualMolestationLiabilityCoverageDetailList = BOPSexualAbuseOrSexualMolestationLiabilityCoverage.getBOPSexualAbuseOrSexualMolestationLiabilityCoverageDetail();

	  
	}
	public void Premium ()  {
	  this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage.getEndorsementManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationLiabilityCoverage,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}