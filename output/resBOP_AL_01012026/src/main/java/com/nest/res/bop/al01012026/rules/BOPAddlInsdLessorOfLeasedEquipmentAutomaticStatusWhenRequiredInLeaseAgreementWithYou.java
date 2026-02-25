package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou (com.nest.res.bop.al01012026.domain.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou)  {
	  this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou = BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou;

	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdLessorOfLeasedEquipmentAutomaticStatusWhenRequiredInLeaseAgreementWithYou.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}