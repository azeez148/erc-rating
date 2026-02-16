package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlLiabExposuresCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage;
	
	
	
	public  BOPAddlLiabExposuresCoverage (com.nest.res.bop.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage)  {
	  this.BOPAddlLiabExposuresCoverage = BOPAddlLiabExposuresCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPAddlLiabExposuresCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAddlLiabExposuresCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlLiabExposuresCoverage,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlLiabExposuresCoverage.getPremium() != (double)0.0){
			this.BOPAddlLiabExposuresCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAddlLiabExposuresCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}