package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationMoneySecuritiesOnPremCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage;
	
	
	
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPLocationMoneySecuritiesOnPremCoverage,"../BOPStructure/BOPClassification").size() != 0.0){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../RatingTerritory"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../RatingPropertyType"))).equals((String)"")){
			this.BOPLocationMoneySecuritiesOnPremCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",((String)XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage," ../RatingTerritory ")),((String)XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage," ../RatingPropertyType")))));
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setRate((double)0.0);
		}
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setRate((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPLocationMoneySecuritiesOnPremCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPLocationMoneySecuritiesOnPremCoverage.getDsLimit() / (double)100.0) * MathHelper.roundToThousand(this.BOPLocationMoneySecuritiesOnPremCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOnPremCoverage,"../CrimeLCM")))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationMoneySecuritiesOnPremCoverage.getPremium() != (double)0.0){
			this.BOPLocationMoneySecuritiesOnPremCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLocationMoneySecuritiesOnPremCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPLocationMoneySecuritiesOnPremCoverage (com.nest.res.bop.domain.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage)  {
	  this.BOPLocationMoneySecuritiesOnPremCoverage = BOPLocationMoneySecuritiesOnPremCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}