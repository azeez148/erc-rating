package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
	  
	}
	public void ProcessPremium2 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium2_ProcessPremiumSub1();
	
	  
	}
	public  BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage (com.nest.res.bop.al09012019.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage)  {
	  this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage = BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays().equals(MathHelper.getStringValue("None")) || this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays().equals(MathHelper.getStringValue("")) || this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays().equals(MathHelper.getStringValue("No Coverage")) || this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays().equals(MathHelper.getStringValue("Not Applicable")) || this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays().equals(MathHelper.getStringValue("No"))){
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getPremium() < MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage,"../../TotBldgPremium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage,"../../TotBusnPrsnlPropPremium")))) * this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDaysFactor())));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void NumDaysFactor () throws LookupException,NumberFormatException {
	  this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setNumDaysFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiNumDaysFactor",String.valueOf(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays()))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	NumDaysFactor();
	
	  
	}
	
	
	
	
	


	
}