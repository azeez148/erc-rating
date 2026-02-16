package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOpticalHearingAid  {

	
	
	
	private com.nest.res.bop.domain.BOPOpticalHearingAid BOPOpticalHearingAid;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPOpticalHearingAid.getPremium() != (double)0.0){
			this.BOPOpticalHearingAid.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOpticalHearingAid.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPOpticalHearingAid.setPremium(MathHelper.roundUpDoller(this.BOPOpticalHearingAid.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOpticalHearingAid,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPOpticalHearingAid (com.nest.res.bop.domain.BOPOpticalHearingAid BOPOpticalHearingAid)  {
	  this.BOPOpticalHearingAid = BOPOpticalHearingAid;

	  
	}
	
	
	
	
	


	
}