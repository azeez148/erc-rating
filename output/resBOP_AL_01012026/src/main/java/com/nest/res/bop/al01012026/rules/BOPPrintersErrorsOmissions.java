package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPrintersErrorsOmissions  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPPrintersErrorsOmissions BOPPrintersErrorsOmissions;
	
	
	
	public  BOPPrintersErrorsOmissions (com.nest.res.bop.al01012026.domain.BOPPrintersErrorsOmissions BOPPrintersErrorsOmissions)  {
	  this.BOPPrintersErrorsOmissions = BOPPrintersErrorsOmissions;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPrintersErrorsOmissions.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPrintersErrorsOmissions.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPrintersErrorsOmissions.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPPrintersErrorsOmissions.setPremium(MathHelper.roundUpDoller(this.BOPPrintersErrorsOmissions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPrintersErrorsOmissions,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPPrintersErrorsOmissions.setPremium(MathHelper.roundUpDoller(this.BOPPrintersErrorsOmissions.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPrintersErrorsOmissions,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}