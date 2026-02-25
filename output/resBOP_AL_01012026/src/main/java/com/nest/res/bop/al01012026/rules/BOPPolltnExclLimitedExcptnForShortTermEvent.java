package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPolltnExclLimitedExcptnForShortTermEvent  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEvent;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremium(MathHelper.roundUpDoller(this.BOPPolltnExclLimitedExcptnForShortTermEvent.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPolltnExclLimitedExcptnForShortTermEvent,"../IRPMFactor")))));

	  
	}
	public  BOPPolltnExclLimitedExcptnForShortTermEvent (com.nest.res.bop.al01012026.domain.BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEvent)  {
	  this.BOPPolltnExclLimitedExcptnForShortTermEvent = BOPPolltnExclLimitedExcptnForShortTermEvent;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremium(MathHelper.roundUpDoller(this.BOPPolltnExclLimitedExcptnForShortTermEvent.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPolltnExclLimitedExcptnForShortTermEvent,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPolltnExclLimitedExcptnForShortTermEvent.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPolltnExclLimitedExcptnForShortTermEvent.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}