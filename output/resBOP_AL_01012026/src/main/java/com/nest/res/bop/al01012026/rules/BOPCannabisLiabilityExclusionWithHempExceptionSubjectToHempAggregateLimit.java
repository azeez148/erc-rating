package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit,"../IRPMFactor")))));

	  
	}
	public  BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit (com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit)  {
	  this.BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit = BOPCannabisLiabilityExclusionWithHempExceptionSubjectToHempAggregateLimit;

	  
	}
	
	
	
	
	


	
}