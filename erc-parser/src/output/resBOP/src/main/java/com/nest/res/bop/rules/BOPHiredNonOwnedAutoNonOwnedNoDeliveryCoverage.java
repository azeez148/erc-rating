package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage;
	
	
	
	public  BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage (com.nest.res.bop.domain.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage)  {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage = BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NonownedAutoWithoutDeliveryRate",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../../CommercialAutoLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../IncrLimitFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.getPremium() != (double)0.0){
			this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPHiredNonOwnedAutoNonOwnedNoDeliveryCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}