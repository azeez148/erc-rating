package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionHiredAutoLiability  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionHiredAutoLiability BOPExclusionHiredAutoLiability;
	
	
	
	public void Premium ()  {
	  this.BOPExclusionHiredAutoLiability.setPremium(MathHelper.roundUpDoller(this.BOPExclusionHiredAutoLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionHiredAutoLiability,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionHiredAutoLiability.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionHiredAutoLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionHiredAutoLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPExclusionHiredAutoLiability (com.nest.res.bop.al01012026.domain.BOPExclusionHiredAutoLiability BOPExclusionHiredAutoLiability)  {
	  this.BOPExclusionHiredAutoLiability = BOPExclusionHiredAutoLiability;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionHiredAutoLiability.setPremium(MathHelper.roundUpDoller(this.BOPExclusionHiredAutoLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionHiredAutoLiability,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}