package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFungiBacteriaExclusionLiability  {

	
	
	
	private com.nest.res.bop.domain.BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiability;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFungiBacteriaExclusionLiability.getPremium() != (double)0.0){
			this.BOPFungiBacteriaExclusionLiability.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFungiBacteriaExclusionLiability.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPFungiBacteriaExclusionLiability.setPremium(MathHelper.roundUpDoller(this.BOPFungiBacteriaExclusionLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFungiBacteriaExclusionLiability,"../IRPMFactor")))));

	  
	}
	public  BOPFungiBacteriaExclusionLiability (com.nest.res.bop.domain.BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiability)  {
	  this.BOPFungiBacteriaExclusionLiability = BOPFungiBacteriaExclusionLiability;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}