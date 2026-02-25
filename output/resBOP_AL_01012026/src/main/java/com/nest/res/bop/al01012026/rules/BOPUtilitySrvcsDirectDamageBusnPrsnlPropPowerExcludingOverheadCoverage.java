package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamagePowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../PowerSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Not Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Not Including Overhead Power Transmission"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Business Personal Property"))){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}