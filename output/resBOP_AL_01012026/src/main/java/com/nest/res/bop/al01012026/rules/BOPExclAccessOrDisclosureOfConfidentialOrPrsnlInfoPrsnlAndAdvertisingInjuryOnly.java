package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremium(MathHelper.roundUpDoller(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremium(MathHelper.roundUpDoller(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly,"../IRPMFactor")))));

	  
	}
	public  BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly (com.nest.res.bop.al01012026.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly)  {
	  this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly = BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}