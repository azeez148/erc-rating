package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn  {

	
	
	
	private com.nest.res.bop.domain.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn;
	
	
	
	public void Premium ()  {
	  this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremium(MathHelper.roundUpDoller(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.getPremium() != (double)0.0){
			this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn (com.nest.res.bop.domain.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn)  {
	  this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn = BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}