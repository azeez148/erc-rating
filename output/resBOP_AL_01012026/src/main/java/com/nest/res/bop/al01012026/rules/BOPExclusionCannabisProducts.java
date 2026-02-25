package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionCannabisProducts  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionCannabisProducts BOPExclusionCannabisProducts;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionCannabisProducts.setPremium(MathHelper.roundUpDoller(this.BOPExclusionCannabisProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionCannabisProducts,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionCannabisProducts.setPremium(MathHelper.roundUpDoller(this.BOPExclusionCannabisProducts.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionCannabisProducts,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionCannabisProducts.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionCannabisProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionCannabisProducts.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExclusionCannabisProducts (com.nest.res.bop.al01012026.domain.BOPExclusionCannabisProducts BOPExclusionCannabisProducts)  {
	  this.BOPExclusionCannabisProducts = BOPExclusionCannabisProducts;

	  
	}
	
	
	
	
	


	
}