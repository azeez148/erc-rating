package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract (com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract)  {
	  this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract = BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}