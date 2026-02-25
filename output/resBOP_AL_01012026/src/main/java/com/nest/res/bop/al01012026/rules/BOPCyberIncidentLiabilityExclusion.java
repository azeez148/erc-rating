package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCyberIncidentLiabilityExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCyberIncidentLiabilityExclusion BOPCyberIncidentLiabilityExclusion;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPCyberIncidentLiabilityExclusion (com.nest.res.bop.al01012026.domain.BOPCyberIncidentLiabilityExclusion BOPCyberIncidentLiabilityExclusion)  {
	  this.BOPCyberIncidentLiabilityExclusion = BOPCyberIncidentLiabilityExclusion;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCyberIncidentLiabilityExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCyberIncidentLiabilityExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCyberIncidentLiabilityExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPCyberIncidentLiabilityExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCyberIncidentLiabilityExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCyberIncidentLiabilityExclusion,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCyberIncidentLiabilityExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCyberIncidentLiabilityExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCyberIncidentLiabilityExclusion,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}