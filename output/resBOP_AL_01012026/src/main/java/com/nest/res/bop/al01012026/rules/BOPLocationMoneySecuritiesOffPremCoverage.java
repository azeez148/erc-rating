package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationMoneySecuritiesOffPremCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPLocationMoneySecuritiesOffPremCoverage,"../BOPStructure/BOPClassification").size() != 0.0){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../RatingPropertyType"))).equals(MathHelper.getStringValue(""))){
			this.BOPLocationMoneySecuritiesOffPremCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOffPremisesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../RatingTerritory")),String.valueOf(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../RatingPropertyType"))))));
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationMoneySecuritiesOffPremCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLocationMoneySecuritiesOffPremCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLocationMoneySecuritiesOffPremCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPLocationMoneySecuritiesOffPremCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPLocationMoneySecuritiesOffPremCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../CrimeLCM")))))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPLocationMoneySecuritiesOffPremCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPLocationMoneySecuritiesOffPremCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPLocationMoneySecuritiesOffPremCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPLocationMoneySecuritiesOffPremCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPLocationMoneySecuritiesOffPremCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../CrimeLCM")))))));

	  
	}
	public  BOPLocationMoneySecuritiesOffPremCoverage (com.nest.res.bop.al01012026.domain.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage)  {
	  this.BOPLocationMoneySecuritiesOffPremCoverage = BOPLocationMoneySecuritiesOffPremCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}