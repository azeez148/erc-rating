package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationMoneySecuritiesOnPremCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPLocationMoneySecuritiesOnPremCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPLocationMoneySecuritiesOnPremCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public  BOPLocationMoneySecuritiesOnPremCoverage (com.nest.res.bop.al09012019.domain.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage)  {
	  this.BOPLocationMoneySecuritiesOnPremCoverage = BOPLocationMoneySecuritiesOnPremCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLocationMoneySecuritiesOnPremCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPLocationMoneySecuritiesOnPremCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPLocationMoneySecuritiesOnPremCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../CrimeLCM")))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationMoneySecuritiesOnPremCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLocationMoneySecuritiesOnPremCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLocationMoneySecuritiesOnPremCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPLocationMoneySecuritiesOnPremCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand(this.BOPLocationMoneySecuritiesOnPremCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../CrimeLCM")))))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPLocationMoneySecuritiesOnPremCoverage,"../BOPStructure/BOPClassification").size() != 0.0){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../RatingPropertyType"))).equals(MathHelper.getStringValue(""))){
			this.BOPLocationMoneySecuritiesOnPremCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../RatingTerritory")),String.valueOf(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../RatingPropertyType"))))));
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}