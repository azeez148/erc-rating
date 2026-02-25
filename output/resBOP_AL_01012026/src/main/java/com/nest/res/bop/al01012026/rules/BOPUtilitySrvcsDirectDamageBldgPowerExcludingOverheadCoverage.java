package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Not Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Not Including Overhead Power Transmission"))) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../CoveredProperty"))).equals(MathHelper.getStringValue("Building"))){
			this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamagePowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../CoveredProperty")),String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../PowerSupply")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public  BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}