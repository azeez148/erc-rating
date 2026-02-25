package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
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
	  this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement (com.nest.res.bop.al01012026.domain.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement)  {
	  this.BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement = BOPAddlInsdVendorsAutomaticStatusWhenRequiredInAgreement;

	  
	}
	
	
	
	
	


	
}