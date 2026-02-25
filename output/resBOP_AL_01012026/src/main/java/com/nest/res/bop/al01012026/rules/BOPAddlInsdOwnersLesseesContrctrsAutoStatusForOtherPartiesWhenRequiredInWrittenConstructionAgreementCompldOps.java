package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps;
	
	
	
	public  BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps (com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps)  {
	  this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps = BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContrctrsAutoStatusForOtherPartiesWhenRequiredInWrittenConstructionAgreementCompldOps,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}