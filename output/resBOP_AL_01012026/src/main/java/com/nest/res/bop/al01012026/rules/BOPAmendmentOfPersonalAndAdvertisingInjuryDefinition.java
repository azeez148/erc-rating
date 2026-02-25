package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition;
	
	
	
	public  BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition (com.nest.res.bop.al01012026.domain.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition)  {
	  this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition = BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}