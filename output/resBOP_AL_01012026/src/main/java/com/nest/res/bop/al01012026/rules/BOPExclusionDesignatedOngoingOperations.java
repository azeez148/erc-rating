package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedOngoingOperationsDetail;

public class BOPExclusionDesignatedOngoingOperations  {

	
	
	
	private List<BOPExclusionDesignatedOngoingOperationsDetail> BOPExclusionDesignatedOngoingOperationsDetailList;
	private com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedOngoingOperations BOPExclusionDesignatedOngoingOperations;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionDesignatedOngoingOperations.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionDesignatedOngoingOperations.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionDesignatedOngoingOperations.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExclusionDesignatedOngoingOperations (com.nest.res.bop.al01012026.domain.BOPExclusionDesignatedOngoingOperations BOPExclusionDesignatedOngoingOperations)  {
	  this.BOPExclusionDesignatedOngoingOperations = BOPExclusionDesignatedOngoingOperations;
this.BOPExclusionDesignatedOngoingOperationsDetailList = BOPExclusionDesignatedOngoingOperations.getBOPExclusionDesignatedOngoingOperationsDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionDesignatedOngoingOperations.setPremium(MathHelper.roundUpDoller(this.BOPExclusionDesignatedOngoingOperations.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionDesignatedOngoingOperations,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionDesignatedOngoingOperations.setPremium(MathHelper.roundUpDoller(this.BOPExclusionDesignatedOngoingOperations.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionDesignatedOngoingOperations,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}