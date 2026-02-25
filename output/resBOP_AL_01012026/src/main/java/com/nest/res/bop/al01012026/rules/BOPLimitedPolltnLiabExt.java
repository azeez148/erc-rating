package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedPolltnLiabExt  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExt;
	
	
	
	public  BOPLimitedPolltnLiabExt (com.nest.res.bop.al01012026.domain.BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExt)  {
	  this.BOPLimitedPolltnLiabExt = BOPLimitedPolltnLiabExt;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedPolltnLiabExt.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedPolltnLiabExt.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedPolltnLiabExt.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLimitedPolltnLiabExt.setPremium(MathHelper.roundUpDoller(this.BOPLimitedPolltnLiabExt.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedPolltnLiabExt,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedPolltnLiabExt.setPremium(MathHelper.roundUpDoller(this.BOPLimitedPolltnLiabExt.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedPolltnLiabExt,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}