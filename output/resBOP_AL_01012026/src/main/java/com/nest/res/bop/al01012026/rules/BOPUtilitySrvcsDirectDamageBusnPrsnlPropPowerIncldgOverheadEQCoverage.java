package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Including Overhead Power Transmission"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Business Personal Property")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQPowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../PowerSupply")))));

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQOverheadRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../CoveredProperty")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}