package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage;
	
	
	
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage (com.nest.res.bop.al09012019.domain.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage)  {
	  this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage = BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals(MathHelper.getStringValue(""))){
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodNumDays"))) > MathHelper.getDoubleValue(60.0)){
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))))));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))))));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}