package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPNamedPerilsBusnPrsnlProp  {

	
	
	
	private com.nest.res.bop.domain.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPNamedPerilsBusnPrsnlProp.getPremium() != (double)0.0){
			this.BOPNamedPerilsBusnPrsnlProp.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPNamedPerilsBusnPrsnlProp.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void NonBurglaryRobberyFactor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsBusnPrsnlProp.setNonBurglaryRobberyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf( "No"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPNamedPerilsBusnPrsnlProp (com.nest.res.bop.domain.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp)  {
	  this.BOPNamedPerilsBusnPrsnlProp = BOPNamedPerilsBusnPrsnlProp;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsBusnPrsnlProp.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",((String)XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp," ../../../../BOPNamedPerils/BurglaryRobberyCoverage")))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	NonBurglaryRobberyFactor();
	
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))) == (double)0.0){
			this.BOPNamedPerilsBusnPrsnlProp.setPremium((double)0.0);
		}
		else{
			this.BOPNamedPerilsBusnPrsnlProp.setPremium(-1 * MathHelper.roundUpDoller(this.BOPNamedPerilsBusnPrsnlProp.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
	  
	}
	
	
	
	
	


	
}