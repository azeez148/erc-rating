package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQOverheadRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../CoveredProperty")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Including Overhead Power Transmission"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Building")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public  BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQPowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../PowerSupply")))));

	  
	}
	
	
	
	
	


	
}