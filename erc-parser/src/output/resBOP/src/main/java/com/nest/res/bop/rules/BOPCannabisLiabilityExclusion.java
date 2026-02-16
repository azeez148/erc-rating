package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusion  {

	
	
	
	private com.nest.res.bop.domain.BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusion;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusion,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusion.getPremium() != (double)0.0){
			this.BOPCannabisLiabilityExclusion.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCannabisLiabilityExclusion.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPCannabisLiabilityExclusion (com.nest.res.bop.domain.BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusion)  {
	  this.BOPCannabisLiabilityExclusion = BOPCannabisLiabilityExclusion;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}