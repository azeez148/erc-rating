package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd  {

	
	
	
	private com.nest.res.bop.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremium(MathHelper.roundUpDoller(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd,"../../../../IRPMFactor")))));

	  
	}
	public  BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd (com.nest.res.bop.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd)  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd = BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.getPremium() != (double)0.0){
			this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}