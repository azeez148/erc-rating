package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdAutomaticStatusForDesignatedOperationsDetail;

public class BOPAddlInsdAutomaticStatusForDesignatedOperations  {

	
	
	
	private List<BOPAddlInsdAutomaticStatusForDesignatedOperationsDetail> BOPAddlInsdAutomaticStatusForDesignatedOperationsDetailList;
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdAutomaticStatusForDesignatedOperations BOPAddlInsdAutomaticStatusForDesignatedOperations;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdAutomaticStatusForDesignatedOperations.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdAutomaticStatusForDesignatedOperations.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdAutomaticStatusForDesignatedOperations,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdAutomaticStatusForDesignatedOperations.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdAutomaticStatusForDesignatedOperations.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdAutomaticStatusForDesignatedOperations.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdAutomaticStatusForDesignatedOperations.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdAutomaticStatusForDesignatedOperations.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdAutomaticStatusForDesignatedOperations,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdAutomaticStatusForDesignatedOperations (com.nest.res.bop.al01012026.domain.BOPAddlInsdAutomaticStatusForDesignatedOperations BOPAddlInsdAutomaticStatusForDesignatedOperations)  {
	  this.BOPAddlInsdAutomaticStatusForDesignatedOperations = BOPAddlInsdAutomaticStatusForDesignatedOperations;
this.BOPAddlInsdAutomaticStatusForDesignatedOperationsDetailList = BOPAddlInsdAutomaticStatusForDesignatedOperations.getBOPAddlInsdAutomaticStatusForDesignatedOperationsDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}