package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage;
	
	
	
	public  BOPClassificationBusnPrsnlPropCoverage (com.nest.res.bop.domain.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage)  {
	  this.BOPClassificationBusnPrsnlPropCoverage = BOPClassificationBusnPrsnlPropCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPClassificationBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../FinalBusnPrsnlPropRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationBusnPrsnlPropCoverage.getPremium() != (double)0.0){
			this.BOPClassificationBusnPrsnlPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationBusnPrsnlPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}