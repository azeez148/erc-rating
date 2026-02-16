package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTotPolltnExcl  {

	
	
	
	private com.nest.res.bop.domain.BOPTotPolltnExcl BOPTotPolltnExcl;
	
	
	
	public  BOPTotPolltnExcl (com.nest.res.bop.domain.BOPTotPolltnExcl BOPTotPolltnExcl)  {
	  this.BOPTotPolltnExcl = BOPTotPolltnExcl;

	  
	}
	public void Premium ()  {
	  this.BOPTotPolltnExcl.setPremium(MathHelper.roundUpDoller(this.BOPTotPolltnExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTotPolltnExcl,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTotPolltnExcl.getPremium() != (double)0.0){
			this.BOPTotPolltnExcl.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPTotPolltnExcl.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}