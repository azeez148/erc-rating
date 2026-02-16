package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;
	
	
	
	public  BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants (com.nest.res.bop.al09012019.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants)  {
	  this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants = BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremium(MathHelper.roundUpDoller(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants,"../../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremium(MathHelper.roundUpDoller(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}