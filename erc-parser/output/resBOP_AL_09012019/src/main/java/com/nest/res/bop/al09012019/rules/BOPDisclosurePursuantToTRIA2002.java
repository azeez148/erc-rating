package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDisclosurePursuantToTRIA2002  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPDisclosurePursuantToTRIA2002.setPremium(MathHelper.roundUpDoller(this.BOPDisclosurePursuantToTRIA2002.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDisclosurePursuantToTRIA2002,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDisclosurePursuantToTRIA2002.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDisclosurePursuantToTRIA2002.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDisclosurePursuantToTRIA2002.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPDisclosurePursuantToTRIA2002 (com.nest.res.bop.al09012019.domain.BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002)  {
	  this.BOPDisclosurePursuantToTRIA2002 = BOPDisclosurePursuantToTRIA2002;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPDisclosurePursuantToTRIA2002.setPremium(MathHelper.roundUpDoller(this.BOPDisclosurePursuantToTRIA2002.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDisclosurePursuantToTRIA2002,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}