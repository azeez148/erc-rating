package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPEarthMovementExclusionForDesignatedOperationsOrProjectsDetail;

public class BOPEarthMovementExclusionForDesignatedOperationsOrProjects  {

	
	
	
	private List<BOPEarthMovementExclusionForDesignatedOperationsOrProjectsDetail> BOPEarthMovementExclusionForDesignatedOperationsOrProjectsDetailList;
	private com.nest.res.bop.al01012026.domain.BOPEarthMovementExclusionForDesignatedOperationsOrProjects BOPEarthMovementExclusionForDesignatedOperationsOrProjects;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.setPremium(MathHelper.roundUpDoller(this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPEarthMovementExclusionForDesignatedOperationsOrProjects (com.nest.res.bop.al01012026.domain.BOPEarthMovementExclusionForDesignatedOperationsOrProjects BOPEarthMovementExclusionForDesignatedOperationsOrProjects)  {
	  this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects = BOPEarthMovementExclusionForDesignatedOperationsOrProjects;
this.BOPEarthMovementExclusionForDesignatedOperationsOrProjectsDetailList = BOPEarthMovementExclusionForDesignatedOperationsOrProjects.getBOPEarthMovementExclusionForDesignatedOperationsOrProjectsDetail();

	  
	}
	public void Premium ()  {
	  this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.setPremium(MathHelper.roundUpDoller(this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEarthMovementExclusionForDesignatedOperationsOrProjects,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}