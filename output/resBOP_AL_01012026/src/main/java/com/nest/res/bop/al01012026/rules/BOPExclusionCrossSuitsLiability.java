package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionCrossSuitsLiability  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionCrossSuitsLiability BOPExclusionCrossSuitsLiability;
	
	
	
	public  BOPExclusionCrossSuitsLiability (com.nest.res.bop.al01012026.domain.BOPExclusionCrossSuitsLiability BOPExclusionCrossSuitsLiability)  {
	  this.BOPExclusionCrossSuitsLiability = BOPExclusionCrossSuitsLiability;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionCrossSuitsLiability.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionCrossSuitsLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionCrossSuitsLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionCrossSuitsLiability.setPremium(MathHelper.roundUpDoller(this.BOPExclusionCrossSuitsLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionCrossSuitsLiability,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionCrossSuitsLiability.setPremium(MathHelper.roundUpDoller(this.BOPExclusionCrossSuitsLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionCrossSuitsLiability,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}