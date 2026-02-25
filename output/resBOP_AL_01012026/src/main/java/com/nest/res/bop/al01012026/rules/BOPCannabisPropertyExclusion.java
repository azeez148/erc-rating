package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisPropertyExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCannabisPropertyExclusion BOPCannabisPropertyExclusion;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisPropertyExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisPropertyExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisPropertyExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisPropertyExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCannabisPropertyExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisPropertyExclusion,"../IRPMFactor")))));

	  
	}
	public  BOPCannabisPropertyExclusion (com.nest.res.bop.al01012026.domain.BOPCannabisPropertyExclusion BOPCannabisPropertyExclusion)  {
	  this.BOPCannabisPropertyExclusion = BOPCannabisPropertyExclusion;

	  
	}
	public void Premium ()  {
	  this.BOPCannabisPropertyExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCannabisPropertyExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisPropertyExclusion,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}