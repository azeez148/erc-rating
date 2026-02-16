package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage,"../../BOPStructureBuildingCoverage/Premium")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage,"../../BOPStructureBuildingCoverage/Premium")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getBusnIncomeAndExtraExpenseOptionalCoverage().equals(MathHelper.getStringValue("No")) || this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getBusnIncomeAndExtraExpenseOptionalCoverage().equals(MathHelper.getStringValue("")) || this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getBusnIncomeAndExtraExpenseOptionalCoverage().equals(MathHelper.getStringValue("Not Applicable")) || this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getBusnIncomeAndExtraExpenseOptionalCoverage().equals(MathHelper.getStringValue("No Coverage"))){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public  BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage (com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage)  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage = BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;

	  
	}
	
	
	
	
	


	
}