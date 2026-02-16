package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition  {

	
	
	
	private com.nest.res.bop.domain.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.getPremium() != (double)0.0){
			this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition (com.nest.res.bop.domain.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition)  {
	  this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition = BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition;

	  
	}
	public void Premium ()  {
	  this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}