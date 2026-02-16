package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusionWithHempException  {

	
	
	
	private com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempException;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusionWithHempException.getPremium() != (double)0.0){
			this.BOPCannabisLiabilityExclusionWithHempException.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCannabisLiabilityExclusionWithHempException.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusionWithHempException.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempException,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPCannabisLiabilityExclusionWithHempException (com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempException)  {
	  this.BOPCannabisLiabilityExclusionWithHempException = BOPCannabisLiabilityExclusionWithHempException;

	  
	}
	
	
	
	
	


	
}