package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPolltnExclLimitedExcptnForDesignatedPollutants  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutants;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPPolltnExclLimitedExcptnForDesignatedPollutants (com.nest.res.bop.al09012019.domain.BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutants)  {
	  this.BOPPolltnExclLimitedExcptnForDesignatedPollutants = BOPPolltnExclLimitedExcptnForDesignatedPollutants;

	  
	}
	public void Premium ()  {
	  this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremium(MathHelper.roundUpDoller(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.setPremium(MathHelper.roundUpDoller(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPolltnExclLimitedExcptnForDesignatedPollutants,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}