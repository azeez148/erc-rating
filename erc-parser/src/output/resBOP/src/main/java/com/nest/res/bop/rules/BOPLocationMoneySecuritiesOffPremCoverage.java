package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLocationMoneySecuritiesOffPremCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPLocationMoneySecuritiesOffPremCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPLocationMoneySecuritiesOffPremCoverage.getDsLimit() / (double)100.0) * MathHelper.roundToThousand(this.BOPLocationMoneySecuritiesOffPremCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../CrimeLCM")))))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPLocationMoneySecuritiesOffPremCoverage (com.nest.res.bop.domain.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage)  {
	  this.BOPLocationMoneySecuritiesOffPremCoverage = BOPLocationMoneySecuritiesOffPremCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPLocationMoneySecuritiesOffPremCoverage,"../BOPStructure/BOPClassification").size() != 0.0){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../RatingTerritory"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage,"../RatingPropertyType"))).equals((String)"")){
			this.BOPLocationMoneySecuritiesOffPremCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOffPremisesRate",((String)XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage," ../RatingTerritory ")),((String)XpathNode.selectNodeValue(this.BOPLocationMoneySecuritiesOffPremCoverage," ../RatingPropertyType")))));
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setRate((double)0.0);
		}
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setRate((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLocationMoneySecuritiesOffPremCoverage.getPremium() != (double)0.0){
			this.BOPLocationMoneySecuritiesOffPremCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLocationMoneySecuritiesOffPremCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}