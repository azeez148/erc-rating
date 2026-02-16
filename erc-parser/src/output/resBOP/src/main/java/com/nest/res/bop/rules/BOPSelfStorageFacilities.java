package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSelfStorageFacilities  {

	
	
	
	private com.nest.res.bop.domain.BOPSelfStorageFacilities BOPSelfStorageFacilities;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPSelfStorageFacilities.getPremium() != (double)0.0){
			this.BOPSelfStorageFacilities.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPSelfStorageFacilities.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPSelfStorageFacilities (com.nest.res.bop.domain.BOPSelfStorageFacilities BOPSelfStorageFacilities)  {
	  this.BOPSelfStorageFacilities = BOPSelfStorageFacilities;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	CustomerGoodsInclddLimit();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	SalesDisposalLiabLimit();
	
	  
	}
	public void CustomerGoodsInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPSelfStorageFacilities.setCustomerGoodsInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("SelfStorageCustomerGoodsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPSelfStorageFacilities.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SelfStorageCustomerGoodsLimitRate",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPSelfStorageFacilities.getDsLimit() <= this.BOPSelfStorageFacilities.getCustomerGoodsInclddLimit()){
			this.BOPSelfStorageFacilities.setPremium((double)0.0);
		}
		else{
			this.BOPSelfStorageFacilities.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller((((double)this.BOPSelfStorageFacilities.getDsLimit() - (double)this.BOPSelfStorageFacilities.getCustomerGoodsInclddLimit()) / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundToThousand(this.BOPSelfStorageFacilities.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../CommercialPropertyLCM"))))))));
		}
	  
	}
	public void SalesDisposalLiabLimit () throws LookupException,NumberFormatException {
	  this.BOPSelfStorageFacilities.setSalesDisposalLiabLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("SelfStorageSalesDisposalLiabLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}