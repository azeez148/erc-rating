package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodNumDays"))).equals((String)"60") && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium"))) > (double)0.0){
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../BusnIncomeExtddPeriodFactor"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage,"../TotBusnPrsnlPropPremium")))));
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremium((double)0.0);
		}
	  
	}
	public  BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage (com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage)  {
	  this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage = BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.getPremium() != (double)0.0){
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}