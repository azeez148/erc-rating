package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract;
	
	
	
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract (com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract)  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract = BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.getPremium() != (double)0.0){
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}