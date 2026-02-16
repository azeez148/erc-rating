package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPrintersErrorsOmissions  {

	
	
	
	private com.nest.res.bop.domain.BOPPrintersErrorsOmissions BOPPrintersErrorsOmissions;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPPrintersErrorsOmissions.getPremium() != (double)0.0){
			this.BOPPrintersErrorsOmissions.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPrintersErrorsOmissions.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPPrintersErrorsOmissions.setPremium(MathHelper.roundUpDoller(this.BOPPrintersErrorsOmissions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPrintersErrorsOmissions,"../IRPMFactor")))));

	  
	}
	public  BOPPrintersErrorsOmissions (com.nest.res.bop.domain.BOPPrintersErrorsOmissions BOPPrintersErrorsOmissions)  {
	  this.BOPPrintersErrorsOmissions = BOPPrintersErrorsOmissions;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}