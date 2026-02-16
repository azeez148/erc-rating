package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPForgeryAlterationCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPForgeryAlterationCoverage BOPForgeryAlterationCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPForgeryAlterationCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ForgeryAlterationFactor",String.valueOf( "Y"))));

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPForgeryAlterationCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ForgeryAlterationInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPForgeryAlterationCoverage.getDsLimit() > this.BOPForgeryAlterationCoverage.getInclddLimit()){
			this.BOPForgeryAlterationCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPForgeryAlterationCoverage,"../BOPEmployeeDishtyCoverage/Premium"))) * this.BOPForgeryAlterationCoverage.getFactor()));
		}
		else{
			this.BOPForgeryAlterationCoverage.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPForgeryAlterationCoverage (com.nest.res.bop.domain.BOPForgeryAlterationCoverage BOPForgeryAlterationCoverage)  {
	  this.BOPForgeryAlterationCoverage = BOPForgeryAlterationCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPForgeryAlterationCoverage.getPremium() != (double)0.0){
			this.BOPForgeryAlterationCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPForgeryAlterationCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}