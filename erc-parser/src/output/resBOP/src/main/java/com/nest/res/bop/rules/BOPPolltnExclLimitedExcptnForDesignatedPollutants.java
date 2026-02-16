package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPolltnExclLimitedExcptnForDesignatedPollutants  {

	
	
	
	private com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutants;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.getPremium() != (double)0.0){
			this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremium(MathHelper.roundUpDoller(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants,"../IRPMFactor")))));

	  
	}
	public  BOPPolltnExclLimitedExcptnForDesignatedPollutants (com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutants)  {
	  this.BOPPolltnExclLimitedExcptnForDesignatedPollutants = BOPPolltnExclLimitedExcptnForDesignatedPollutants;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}