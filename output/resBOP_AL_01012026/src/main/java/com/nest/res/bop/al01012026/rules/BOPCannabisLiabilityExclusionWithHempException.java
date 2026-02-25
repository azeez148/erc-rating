package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusionWithHempException  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempException;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisLiabilityExclusionWithHempException.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempException,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusionWithHempException.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempException,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPCannabisLiabilityExclusionWithHempException (com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempException)  {
	  this.BOPCannabisLiabilityExclusionWithHempException = BOPCannabisLiabilityExclusionWithHempException;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusionWithHempException.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisLiabilityExclusionWithHempException.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisLiabilityExclusionWithHempException.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}