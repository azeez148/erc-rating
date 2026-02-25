package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract (com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract)  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract = BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract;

	  
	}
	
	
	
	
	


	
}