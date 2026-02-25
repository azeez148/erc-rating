package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement;
	
	
	
	public  BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement (com.nest.res.bop.al01012026.domain.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement)  {
	  this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement = BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdAutomaticStatusWhenRequiredInWrittenContractOrAgreement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}