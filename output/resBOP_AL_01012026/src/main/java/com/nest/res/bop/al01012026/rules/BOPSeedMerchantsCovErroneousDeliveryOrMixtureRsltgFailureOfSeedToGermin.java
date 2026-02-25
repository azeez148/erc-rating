package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.setPremium(MathHelper.roundUpDoller(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin,"../../../../IRPMFactor")))));

	  
	}
	public  BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin (com.nest.res.bop.al01012026.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin)  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin = BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.setPremium(MathHelper.roundUpDoller(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin,"../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}