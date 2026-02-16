package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedFungiBacteriaCovLiability  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiability;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovLiability.getPremium() != (double)0.0){
			this.BOPLimitedFungiBacteriaCovLiability.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitedFungiBacteriaCovLiability.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPLimitedFungiBacteriaCovLiability (com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiability)  {
	  this.BOPLimitedFungiBacteriaCovLiability = BOPLimitedFungiBacteriaCovLiability;

	  
	}
	public void Premium ()  {
	  this.BOPLimitedFungiBacteriaCovLiability.setPremium(MathHelper.roundUpDoller(this.BOPLimitedFungiBacteriaCovLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovLiability,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}