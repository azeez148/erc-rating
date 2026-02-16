package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedPolltnLiabExt  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExt;
	
	
	
	public void Premium ()  {
	  this.BOPLimitedPolltnLiabExt.setPremium(MathHelper.roundUpDoller(this.BOPLimitedPolltnLiabExt.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedPolltnLiabExt,"../IRPMFactor")))));

	  
	}
	public  BOPLimitedPolltnLiabExt (com.nest.res.bop.domain.BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExt)  {
	  this.BOPLimitedPolltnLiabExt = BOPLimitedPolltnLiabExt;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedPolltnLiabExt.getPremium() != (double)0.0){
			this.BOPLimitedPolltnLiabExt.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitedPolltnLiabExt.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}