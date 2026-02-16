package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedFungiBacteriaCovLiability  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiability;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedFungiBacteriaCovLiability.setPremium(MathHelper.roundUpDoller(this.BOPLimitedFungiBacteriaCovLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovLiability,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovLiability.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedFungiBacteriaCovLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPLimitedFungiBacteriaCovLiability (com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiability)  {
	  this.BOPLimitedFungiBacteriaCovLiability = BOPLimitedFungiBacteriaCovLiability;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPLimitedFungiBacteriaCovLiability.setPremium(MathHelper.roundUpDoller(this.BOPLimitedFungiBacteriaCovLiability.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovLiability,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}