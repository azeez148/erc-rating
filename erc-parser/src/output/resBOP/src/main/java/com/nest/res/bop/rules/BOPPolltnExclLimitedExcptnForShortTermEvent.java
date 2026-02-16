package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPolltnExclLimitedExcptnForShortTermEvent  {

	
	
	
	private com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEvent;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPPolltnExclLimitedExcptnForShortTermEvent (com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEvent)  {
	  this.BOPPolltnExclLimitedExcptnForShortTermEvent = BOPPolltnExclLimitedExcptnForShortTermEvent;

	  
	}
	public void Premium ()  {
	  this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremium(MathHelper.roundUpDoller(this.BOPPolltnExclLimitedExcptnForShortTermEvent.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPolltnExclLimitedExcptnForShortTermEvent,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPolltnExclLimitedExcptnForShortTermEvent.getPremium() != (double)0.0){
			this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}