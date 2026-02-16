package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPNamedPerilsBusnPrsnlProp  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	NonBurglaryRobberyFactor();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPNamedPerilsBusnPrsnlProp.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsBusnPrsnlProp.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPNamedPerilsBusnPrsnlProp.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsBusnPrsnlProp.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPNamedPerilsBusnPrsnlProp.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(-1 * MathHelper.roundUpDoller(this.BOPNamedPerilsBusnPrsnlProp.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))))));
		}
	  
	}
	public void NonBurglaryRobberyFactor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsBusnPrsnlProp.setNonBurglaryRobberyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf( "No"))));

	  
	}
	public  BOPNamedPerilsBusnPrsnlProp (com.nest.res.bop.al09012019.domain.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp)  {
	  this.BOPNamedPerilsBusnPrsnlProp = BOPNamedPerilsBusnPrsnlProp;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsBusnPrsnlProp.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPNamedPerilsBusnPrsnlProp.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(-1 * MathHelper.roundUpDoller(this.BOPNamedPerilsBusnPrsnlProp.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsBusnPrsnlProp.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPNamedPerilsBusnPrsnlProp,"../../../../BOPNamedPerils/BurglaryRobberyCoverage")))));

	  
	}
	
	
	
	
	


	
}