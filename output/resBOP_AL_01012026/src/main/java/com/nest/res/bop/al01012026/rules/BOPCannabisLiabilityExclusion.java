package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusion;
	
	
	
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusion,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisLiabilityExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusion,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisLiabilityExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisLiabilityExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPCannabisLiabilityExclusion (com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusion)  {
	  this.BOPCannabisLiabilityExclusion = BOPCannabisLiabilityExclusion;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}