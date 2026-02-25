package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;
	
	
	
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../WaterSupply"))).equals(MathHelper.getStringValue("No Coverage")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../WaterSupply"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Business Personal Property")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQWaterSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../WaterSupply")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}