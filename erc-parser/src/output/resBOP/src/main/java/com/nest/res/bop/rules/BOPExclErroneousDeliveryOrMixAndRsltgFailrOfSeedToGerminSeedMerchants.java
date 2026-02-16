package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants  {

	
	
	
	private com.nest.res.bop.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremium(MathHelper.roundUpDoller(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants,"../../../../IRPMFactor")))));

	  
	}
	public  BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants (com.nest.res.bop.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants)  {
	  this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants = BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.getPremium() != (double)0.0){
			this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}