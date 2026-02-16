package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisPropertyExclusion  {

	
	
	
	private com.nest.res.bop.domain.BOPCannabisPropertyExclusion BOPCannabisPropertyExclusion;
	
	
	
	public void Premium ()  {
	  this.BOPCannabisPropertyExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCannabisPropertyExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisPropertyExclusion,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisPropertyExclusion.getPremium() != (double)0.0){
			this.BOPCannabisPropertyExclusion.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCannabisPropertyExclusion.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPCannabisPropertyExclusion (com.nest.res.bop.domain.BOPCannabisPropertyExclusion BOPCannabisPropertyExclusion)  {
	  this.BOPCannabisPropertyExclusion = BOPCannabisPropertyExclusion;

	  
	}
	
	
	
	
	


	
}