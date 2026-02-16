package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions  {

	
	
	
	private com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.getPremium() != (double)0.0){
			this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.setPremium(MathHelper.roundUpDoller(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions,"../IRPMFactor")))));

	  
	}
	public  BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions (com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions)  {
	  this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions = BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}