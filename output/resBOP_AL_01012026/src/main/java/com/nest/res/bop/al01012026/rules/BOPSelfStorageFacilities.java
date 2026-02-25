package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSelfStorageFacilities  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSelfStorageFacilities BOPSelfStorageFacilities;
	
	
	
	public void Premium ()  {
	  
		if(this.BOPSelfStorageFacilities.getDsLimit() <= this.BOPSelfStorageFacilities.getCustomerGoodsInclddLimit()){
			this.BOPSelfStorageFacilities.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPSelfStorageFacilities.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPSelfStorageFacilities.getDsLimit()) - MathHelper.getDoubleValue(this.BOPSelfStorageFacilities.getCustomerGoodsInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundToThousand(this.BOPSelfStorageFacilities.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../CommercialPropertyLCM")))))))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void CustomerGoodsInclddLimit () throws LookupException,NumberFormatException {
	  this.BOPSelfStorageFacilities.setCustomerGoodsInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("SelfStorageCustomerGoodsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPSelfStorageFacilities.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SelfStorageCustomerGoodsLimitRate",String.valueOf( "Y"))));

	  
	}
	public void SalesDisposalLiabLimit () throws LookupException,NumberFormatException {
	  this.BOPSelfStorageFacilities.setSalesDisposalLiabLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("SelfStorageSalesDisposalLiabLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	SalesDisposalLiabLimit();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPSelfStorageFacilities.getDsLimit() <= this.BOPSelfStorageFacilities.getCustomerGoodsInclddLimit()){
			this.BOPSelfStorageFacilities.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPSelfStorageFacilities.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((MathHelper.getDoubleValue(this.BOPSelfStorageFacilities.getDsLimit()) - MathHelper.getDoubleValue(this.BOPSelfStorageFacilities.getCustomerGoodsInclddLimit())) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../../../../PropDamageLiabDedFactor"))) * MathHelper.roundToThousand(this.BOPSelfStorageFacilities.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSelfStorageFacilities,"../CommercialPropertyLCM")))))))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSelfStorageFacilities.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSelfStorageFacilities.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSelfStorageFacilities.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	CustomerGoodsInclddLimit();
	
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPSelfStorageFacilities (com.nest.res.bop.al01012026.domain.BOPSelfStorageFacilities BOPSelfStorageFacilities)  {
	  this.BOPSelfStorageFacilities = BOPSelfStorageFacilities;

	  
	}
	
	
	
	
	


	
}