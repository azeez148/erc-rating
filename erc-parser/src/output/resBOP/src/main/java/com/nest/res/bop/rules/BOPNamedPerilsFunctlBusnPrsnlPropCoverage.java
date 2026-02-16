package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPNamedPerilsFunctlBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void NonBurglaryRobberyFactor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setNonBurglaryRobberyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf( "No"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	NonBurglaryRobberyFactor();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.getPremium() != (double)0.0){
			this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPNamedPerilsFunctlBusnPrsnlPropCoverage (com.nest.res.bop.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage)  {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage = BOPNamedPerilsFunctlBusnPrsnlPropCoverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",((String)XpathNode.selectNodeValue(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage," ../../../../../../BOPNamedPerils/BurglaryRobberyCoverage")))));

	  
	}
	public void Premium ()  {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.getFactor() * -1 * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage,"../BOPFunctlBusnPrsnlPropValtnCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}