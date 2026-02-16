package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFunctlBusnPrsnlPropValtnCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../FinalBusnPrsnlPropRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFunctlBusnPrsnlPropValtnCoverage.getPremium() != (double)0.0){
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPFunctlBusnPrsnlPropValtnCoverage (com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage)  {
	  this.BOPFunctlBusnPrsnlPropValtnCoverage = BOPFunctlBusnPrsnlPropValtnCoverage;

	  
	}
	
	
	
	
	


	
}