package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../PostLossBusinessIncomeExtraExpenseFactor")))) * this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getEarthquakeCoveragePremium_1()));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../PostLossBusinessIncomeExtraExpenseFactor")))) * this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getEarthquakeCoveragePremium_1()));

	  
	}
	public  BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage (com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage)  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage = BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;

	  
	}
	public void earthquakeCoveragePremium_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setEarthquakeCoveragePremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEarthquake/EarthquakeBuildingPremium")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setEarthquakeCoveragePremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEQSubLimit/BldgPremium")))));
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setEarthquakeCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationEQFactor",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage/BusnIncomeAndExtraExpenseOptionalCoverage"))).equals(MathHelper.getStringValue("Yes")) && (XpathNode.selectNodes(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEarthquake").size() > 0.0 || XpathNode.selectNodes(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEQSubLimit").size() > 0.0)){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	earthquakeCoveragePremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}