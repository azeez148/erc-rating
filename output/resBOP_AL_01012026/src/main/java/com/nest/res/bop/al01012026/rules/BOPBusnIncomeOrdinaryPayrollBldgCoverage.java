package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeOrdinaryPayrollBldgCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverage;
	
	
	
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../TotBldgPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../TotBldgPremium"))))));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPBusnIncomeOrdinaryPayrollBldgCoverage (com.nest.res.bop.al01012026.domain.BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverage)  {
	  this.BOPBusnIncomeOrdinaryPayrollBldgCoverage = BOPBusnIncomeOrdinaryPayrollBldgCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("No"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals(MathHelper.getStringValue(""))){
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))) > MathHelper.getDoubleValue(60.0)){
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../TotBldgPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../TotBldgPremium"))))));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}