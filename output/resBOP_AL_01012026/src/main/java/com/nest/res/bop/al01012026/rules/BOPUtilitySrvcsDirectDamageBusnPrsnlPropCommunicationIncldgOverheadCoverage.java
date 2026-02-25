package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage;
	
	
	
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Public Utility-Including Overhead Communication Lines")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Including Overhead Communication Lines"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Business Personal Property"))){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageOverheadRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../CoveredProperty")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageCommunicationSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage,"../CommunicationSupply")))));

	  
	}
	
	
	
	
	


	
}