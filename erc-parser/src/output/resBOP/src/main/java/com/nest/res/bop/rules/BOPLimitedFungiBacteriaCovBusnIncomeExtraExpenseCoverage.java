package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage;
	
	
	
	public void NumDaysFactor () throws LookupException,NumberFormatException {
	  this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setNumDaysFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiNumDaysFactor",String.valueOf(BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDays()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getPremium() != (double)0.0){
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage (com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage)  {
	  this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage = BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getPremium() < (double)0.0){
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremium((double)0.0);
		}
		else{
			this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage,"../../TotBldgPremium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage,"../../TotBusnPrsnlPropPremium")))) * this.BOPLimitedFungiBacteriaCovBusnIncomeExtraExpenseCoverage.getNumDaysFactor()));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	NumDaysFactor();
	
	  
	}
	public void ProcessPremium2 ()  {
	  
	ProcessPremium2_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium2_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}