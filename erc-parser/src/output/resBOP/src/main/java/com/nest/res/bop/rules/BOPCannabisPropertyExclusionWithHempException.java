package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisPropertyExclusionWithHempException  {

	
	
	
	private com.nest.res.bop.domain.BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempException;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisPropertyExclusionWithHempException.getPremium() != (double)0.0){
			this.BOPCannabisPropertyExclusionWithHempException.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCannabisPropertyExclusionWithHempException.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPCannabisPropertyExclusionWithHempException (com.nest.res.bop.domain.BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempException)  {
	  this.BOPCannabisPropertyExclusionWithHempException = BOPCannabisPropertyExclusionWithHempException;

	  
	}
	public void Premium ()  {
	  this.BOPCannabisPropertyExclusionWithHempException.setPremium(MathHelper.roundUpDoller(this.BOPCannabisPropertyExclusionWithHempException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisPropertyExclusionWithHempException,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}