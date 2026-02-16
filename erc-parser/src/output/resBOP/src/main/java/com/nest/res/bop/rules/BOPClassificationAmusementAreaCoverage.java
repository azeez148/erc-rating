package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationAmusementAreaCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage;
	
	
	
	public  BOPClassificationAmusementAreaCoverage (com.nest.res.bop.domain.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage)  {
	  this.BOPClassificationAmusementAreaCoverage = BOPClassificationAmusementAreaCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPClassificationAmusementAreaCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationAmusementAreaCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationAmusementAreaCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationAmusementAreaCoverage.getPremium() != (double)0.0){
			this.BOPClassificationAmusementAreaCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationAmusementAreaCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}