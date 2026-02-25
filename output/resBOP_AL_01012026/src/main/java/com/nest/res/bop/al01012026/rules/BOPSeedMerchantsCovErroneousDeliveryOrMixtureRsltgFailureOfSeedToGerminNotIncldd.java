package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd (com.nest.res.bop.al01012026.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd)  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd = BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;

	  
	}
	public void Premium ()  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremium(MathHelper.roundUpDoller(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd,"../../../../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.setPremium(MathHelper.roundUpDoller(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}