package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../BusnPrsnlPropLimit"))) / (double)100.0)));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage," ../CommunicationSupply")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;

	  
	}
	
	
	
	
	


	
}