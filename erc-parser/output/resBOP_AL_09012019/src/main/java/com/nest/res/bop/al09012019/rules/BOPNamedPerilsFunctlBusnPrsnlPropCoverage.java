package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPNamedPerilsFunctlBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
	
	
	
	public  BOPNamedPerilsFunctlBusnPrsnlPropCoverage (com.nest.res.bop.al09012019.domain.BOPNamedPerilsFunctlBusnPrsnlPropCoverage BOPNamedPerilsFunctlBusnPrsnlPropCoverage)  {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage = BOPNamedPerilsFunctlBusnPrsnlPropCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void NonBurglaryRobberyFactor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setNonBurglaryRobberyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf( "No"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	NonBurglaryRobberyFactor();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("NamedPerilsBusnPrsnlPropFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage,"../../../../../../BOPNamedPerils/BurglaryRobberyCoverage")))));

	  
	}
	public void Premium ()  {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.getFactor() * -1 * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage,"../BOPFunctlBusnPrsnlPropValtnCoverage/Premium")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(XpathNode.selectNodes(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage,"../../../../../../BOPNamedPerils").size() > 0.0 && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage,"../../../FunctlBusnPrsnlPropValtnApply"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.getFactor() * -1 * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage,"../BOPFunctlBusnPrsnlPropValtnCoverage/Premium")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}