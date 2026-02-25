package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQCommunicationSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../CommunicationSupply")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Public Utility-Not Including Overhead Communication Lines")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Not Including Overhead Communication Lines"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Business Personal Property")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}