package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisPropertyExclusionWithHempException  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempException;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisPropertyExclusionWithHempException.setPremium(MathHelper.roundUpDoller(this.BOPCannabisPropertyExclusionWithHempException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisPropertyExclusionWithHempException,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPCannabisPropertyExclusionWithHempException.setPremium(MathHelper.roundUpDoller(this.BOPCannabisPropertyExclusionWithHempException.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisPropertyExclusionWithHempException,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPCannabisPropertyExclusionWithHempException (com.nest.res.bop.al09012019.domain.BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempException)  {
	  this.BOPCannabisPropertyExclusionWithHempException = BOPCannabisPropertyExclusionWithHempException;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisPropertyExclusionWithHempException.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisPropertyExclusionWithHempException.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisPropertyExclusionWithHempException.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}