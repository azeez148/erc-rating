package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceForgeryOrAlterationCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceForgeryOrAlterationCoverage BOPAutoServiceForgeryOrAlterationCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPAutoServiceForgeryOrAlterationCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceForgeryOrAlterationCoverage BOPAutoServiceForgeryOrAlterationCoverage)  {
	  this.BOPAutoServiceForgeryOrAlterationCoverage = BOPAutoServiceForgeryOrAlterationCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPAutoServiceForgeryOrAlterationCoverage.getDsLimit() > MathHelper.getIntegerValue(5000.0)){
			this.BOPAutoServiceForgeryOrAlterationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceForgeryOrAlterationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPAutoServiceForgeryOrAlterationCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ForgeryAlterationFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceForgeryOrAlterationCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceForgeryOrAlterationCoverage,"../../BOPEmployeeDishtyCoverage/Premium"))) * this.BOPAutoServiceForgeryOrAlterationCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceForgeryOrAlterationCoverage,"../../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceForgeryOrAlterationCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceForgeryOrAlterationCoverage,"../../BOPEmployeeDishtyCoverage/Premium"))) * this.BOPAutoServiceForgeryOrAlterationCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceForgeryOrAlterationCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceForgeryOrAlterationCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceForgeryOrAlterationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceForgeryOrAlterationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}