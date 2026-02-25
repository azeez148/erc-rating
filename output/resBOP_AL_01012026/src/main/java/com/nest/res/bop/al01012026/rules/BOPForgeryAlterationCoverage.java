package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPForgeryAlterationCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPForgeryAlterationCoverage BOPForgeryAlterationCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPForgeryAlterationCoverage.getDsLimit() > this.BOPForgeryAlterationCoverage.getInclddLimit()){
			this.BOPForgeryAlterationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPForgeryAlterationCoverage,"../BOPEmployeeDishtyCoverage/Premium"))) * this.BOPForgeryAlterationCoverage.getFactor())));
		}
		else{
			this.BOPForgeryAlterationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPForgeryAlterationCoverage (com.nest.res.bop.al01012026.domain.BOPForgeryAlterationCoverage BOPForgeryAlterationCoverage)  {
	  this.BOPForgeryAlterationCoverage = BOPForgeryAlterationCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPForgeryAlterationCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("No"))){
			this.BOPForgeryAlterationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPForgeryAlterationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPForgeryAlterationCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPForgeryAlterationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPForgeryAlterationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPForgeryAlterationCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ForgeryAlterationInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPForgeryAlterationCoverage.getDsLimit() > this.BOPForgeryAlterationCoverage.getInclddLimit()){
			this.BOPForgeryAlterationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPForgeryAlterationCoverage,"../BOPEmployeeDishtyCoverage/Premium"))) * this.BOPForgeryAlterationCoverage.getFactor())));
		}
		else{
			this.BOPForgeryAlterationCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPForgeryAlterationCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ForgeryAlterationFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}