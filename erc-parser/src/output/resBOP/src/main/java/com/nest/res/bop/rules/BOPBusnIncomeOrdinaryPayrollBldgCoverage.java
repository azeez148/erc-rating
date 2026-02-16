package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeOrdinaryPayrollBldgCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverage;
	
	
	
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals((String)"60") && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../TotBldgPremium"))) > (double)0.0){
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../BusnIncomeOrdinaryPayrollFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage,"../TotBldgPremium")))));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremium((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.getPremium() != (double)0.0){
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBldgCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPBusnIncomeOrdinaryPayrollBldgCoverage (com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverage)  {
	  this.BOPBusnIncomeOrdinaryPayrollBldgCoverage = BOPBusnIncomeOrdinaryPayrollBldgCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}