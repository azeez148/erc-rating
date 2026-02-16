package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.getPremium() != (double)0.0){
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollNumDays"))).equals((String)"60") && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))) > (double)0.0){
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../BusnIncomeOrdinaryPayrollFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium")))));
		}
		else{
			this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.setPremium((double)0.0);
		}
	  
	}
	public  BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage (com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage)  {
	  this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage = BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage;

	  
	}
	
	
	
	
	


	
}