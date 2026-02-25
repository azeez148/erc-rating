package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage;
	
	
	
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQCommunicationSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../CommunicationSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Public Utility-Not Including Overhead Communication Lines")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Not Including Overhead Communication Lines"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Building")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}