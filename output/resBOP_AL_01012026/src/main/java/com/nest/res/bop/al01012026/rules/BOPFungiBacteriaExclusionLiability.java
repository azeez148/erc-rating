package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFungiBacteriaExclusionLiability  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiability;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFungiBacteriaExclusionLiability.setPremium(MathHelper.roundUpDoller(this.BOPFungiBacteriaExclusionLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFungiBacteriaExclusionLiability,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPFungiBacteriaExclusionLiability (com.nest.res.bop.al01012026.domain.BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiability)  {
	  this.BOPFungiBacteriaExclusionLiability = BOPFungiBacteriaExclusionLiability;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFungiBacteriaExclusionLiability.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFungiBacteriaExclusionLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFungiBacteriaExclusionLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPFungiBacteriaExclusionLiability.setPremium(MathHelper.roundUpDoller(this.BOPFungiBacteriaExclusionLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFungiBacteriaExclusionLiability,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}