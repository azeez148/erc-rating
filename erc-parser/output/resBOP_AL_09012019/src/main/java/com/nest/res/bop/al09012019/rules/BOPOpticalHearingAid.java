package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOpticalHearingAid  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOpticalHearingAid BOPOpticalHearingAid;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOpticalHearingAid.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOpticalHearingAid.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOpticalHearingAid.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOpticalHearingAid.setPremium(MathHelper.roundUpDoller(this.BOPOpticalHearingAid.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOpticalHearingAid,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPOpticalHearingAid.setPremium(MathHelper.roundUpDoller(this.BOPOpticalHearingAid.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOpticalHearingAid,"../IRPMFactor")))));

	  
	}
	public  BOPOpticalHearingAid (com.nest.res.bop.al09012019.domain.BOPOpticalHearingAid BOPOpticalHearingAid)  {
	  this.BOPOpticalHearingAid = BOPOpticalHearingAid;

	  
	}
	
	
	
	
	


	
}