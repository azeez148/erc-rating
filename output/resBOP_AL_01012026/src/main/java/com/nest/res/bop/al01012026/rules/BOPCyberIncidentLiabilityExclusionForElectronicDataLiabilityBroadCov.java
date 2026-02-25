package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov;
	
	
	
	public void Premium ()  {
	  this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.setPremium(MathHelper.roundUpDoller(this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.setPremium(MathHelper.roundUpDoller(this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov (com.nest.res.bop.al01012026.domain.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov)  {
	  this.BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov = BOPCyberIncidentLiabilityExclusionForElectronicDataLiabilityBroadCov;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}