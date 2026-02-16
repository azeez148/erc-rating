package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage;
	
	
	
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))))));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))))));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage (com.nest.res.bop.al09012019.domain.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage)  {
	  this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage = BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals(MathHelper.getStringValue(""))){
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))) > MathHelper.getDoubleValue(60.0)){
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}