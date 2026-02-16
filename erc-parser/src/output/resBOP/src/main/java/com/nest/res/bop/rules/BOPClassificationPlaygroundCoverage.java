package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationPlaygroundCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationPlaygroundCoverage.getPremium() != (double)0.0){
			this.BOPClassificationPlaygroundCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationPlaygroundCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPClassificationPlaygroundCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationPlaygroundCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationPlaygroundCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPClassificationPlaygroundCoverage (com.nest.res.bop.domain.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage)  {
	  this.BOPClassificationPlaygroundCoverage = BOPClassificationPlaygroundCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}