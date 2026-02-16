package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeExtddPeriodBldgCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverage;
	
	
	
	public  BOPBusnIncomeExtddPeriodBldgCoverage (com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverage)  {
	  this.BOPBusnIncomeExtddPeriodBldgCoverage = BOPBusnIncomeExtddPeriodBldgCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals((String)"60") && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../TotBldgPremium"))) > (double)0.0){
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../BusnIncomeExtddPeriodFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBldgCoverage,"../TotBldgPremium")))));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeExtddPeriodBldgCoverage.getPremium() != (double)0.0){
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeExtddPeriodBldgCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}