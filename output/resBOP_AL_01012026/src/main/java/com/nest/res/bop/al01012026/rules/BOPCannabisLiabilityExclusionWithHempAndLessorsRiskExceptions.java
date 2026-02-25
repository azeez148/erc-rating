package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions (com.nest.res.bop.al01012026.domain.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions)  {
	  this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions = BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions;

	  
	}
	
	
	
	
	


	
}