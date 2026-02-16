package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDisclosurePursuantToTRIA2002  {

	
	
	
	private com.nest.res.bop.domain.BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002;
	
	
	
	public void Premium ()  {
	  this.BOPDisclosurePursuantToTRIA2002.setPremium(MathHelper.roundUpDoller(this.BOPDisclosurePursuantToTRIA2002.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDisclosurePursuantToTRIA2002,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDisclosurePursuantToTRIA2002.getPremium() != (double)0.0){
			this.BOPDisclosurePursuantToTRIA2002.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPDisclosurePursuantToTRIA2002.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPDisclosurePursuantToTRIA2002 (com.nest.res.bop.domain.BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002)  {
	  this.BOPDisclosurePursuantToTRIA2002 = BOPDisclosurePursuantToTRIA2002;

	  
	}
	
	
	
	
	


	
}