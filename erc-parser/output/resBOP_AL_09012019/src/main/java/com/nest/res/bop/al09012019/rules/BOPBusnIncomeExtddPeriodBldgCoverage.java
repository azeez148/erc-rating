package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeExtddPeriodBldgCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverage;
	
	
	
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../TotBldgPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../TotBldgPremium"))))));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeExtddPeriodBldgCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPBusnIncomeExtddPeriodBldgCoverage (com.nest.res.bop.al09012019.domain.BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverage)  {
	  this.BOPBusnIncomeExtddPeriodBldgCoverage = BOPBusnIncomeExtddPeriodBldgCoverage;

	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals(MathHelper.getStringValue("60")) && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../TotBldgPremium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../TotBldgPremium"))))));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals(MathHelper.getStringValue(""))){
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodNumDays"))) > MathHelper.getDoubleValue(60.0)){
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}