package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn;
	
	
	
	public  BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn (com.nest.res.bop.al01012026.domain.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn)  {
	  this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn = BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremium(MathHelper.roundUpDoller(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremium(MathHelper.roundUpDoller(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}