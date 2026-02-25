package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisActivityLiabilityCoverageAggregateLimit  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCannabisActivityLiabilityCoverageAggregateLimit BOPCannabisActivityLiabilityCoverageAggregateLimit;
	
	
	
	public void Premium ()  {
	  this.BOPCannabisActivityLiabilityCoverageAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPCannabisActivityLiabilityCoverageAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisActivityLiabilityCoverageAggregateLimit,"../IRPMFactor")))));

	  
	}
	public  BOPCannabisActivityLiabilityCoverageAggregateLimit (com.nest.res.bop.al01012026.domain.BOPCannabisActivityLiabilityCoverageAggregateLimit BOPCannabisActivityLiabilityCoverageAggregateLimit)  {
	  this.BOPCannabisActivityLiabilityCoverageAggregateLimit = BOPCannabisActivityLiabilityCoverageAggregateLimit;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisActivityLiabilityCoverageAggregateLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisActivityLiabilityCoverageAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisActivityLiabilityCoverageAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisActivityLiabilityCoverageAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPCannabisActivityLiabilityCoverageAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisActivityLiabilityCoverageAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}