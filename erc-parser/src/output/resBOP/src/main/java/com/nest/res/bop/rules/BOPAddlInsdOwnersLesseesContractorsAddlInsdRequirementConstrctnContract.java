package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract (com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract)  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract = BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.getPremium() != (double)0.0){
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}