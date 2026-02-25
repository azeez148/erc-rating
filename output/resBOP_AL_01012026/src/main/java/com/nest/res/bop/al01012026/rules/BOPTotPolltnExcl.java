package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTotPolltnExcl  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPTotPolltnExcl BOPTotPolltnExcl;
	
	
	
	public void Premium ()  {
	  this.BOPTotPolltnExcl.setPremium(MathHelper.roundUpDoller(this.BOPTotPolltnExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTotPolltnExcl,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPTotPolltnExcl.setPremium(MathHelper.roundUpDoller(this.BOPTotPolltnExcl.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTotPolltnExcl,"../IRPMFactor")))));

	  
	}
	public  BOPTotPolltnExcl (com.nest.res.bop.al01012026.domain.BOPTotPolltnExcl BOPTotPolltnExcl)  {
	  this.BOPTotPolltnExcl = BOPTotPolltnExcl;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTotPolltnExcl.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPTotPolltnExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTotPolltnExcl.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
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