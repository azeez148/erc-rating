package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly  {

	
	
	
	private com.nest.res.bop.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly;
	
	
	
	public  BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly (com.nest.res.bop.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly)  {
	  this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly = BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremium(MathHelper.roundUpDoller(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.getPremium() != (double)0.0){
			this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}