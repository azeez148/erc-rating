package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEquipmentBreakdownProtectionCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage;
	
	
	
	public void equipmentBreakdownLimit ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEquipmentBreakdownProtectionCoverage,"../BOPStructure") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))))));
		}		}

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void AddlCharge () throws LookupException,NumberFormatException {
	  this.BOPEquipmentBreakdownProtectionCoverage.setAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void OptionalTimeDedFactor () throws LookupException,NumberFormatException {
	  this.BOPEquipmentBreakdownProtectionCoverage.setOptionalTimeDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptionalTimeDedFactors",String.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDed()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getIncluded().equals(MathHelper.getStringValue("No"))){
			this.BOPEquipmentBreakdownProtectionCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) + this.BOPEquipmentBreakdownProtectionCoverage.getEach100000AddlCharge()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDmgDedFactor()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDedFactor()));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) + this.BOPEquipmentBreakdownProtectionCoverage.getEach100000AddlCharge()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDmgDedFactor()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDedFactor()));

	  
	}
	public void Each100000AddlCharge ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() > MathHelper.getIntegerValue(599999.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setEach100000AddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) * MathHelper.roundUpDoller((this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() - MathHelper.getDoubleValue(599999.0)) / MathHelper.getDoubleValue(100000.0)))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setEach100000AddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPEquipmentBreakdownProtectionCoverage (com.nest.res.bop.al09012019.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage)  {
	  this.BOPEquipmentBreakdownProtectionCoverage = BOPEquipmentBreakdownProtectionCoverage;

	  
	}
	public void BaseCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() <= MathHelper.getIntegerValue(599999.0)){
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownBaseCharge",String.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit())))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownBaseCharge",String.valueOf( 599999)))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void OptionalPropDmgDedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDamgDed() != MathHelper.getIntegerValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setOptionalPropDmgDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptionalPropDamageDedFactors",String.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDamgDed())))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setOptionalPropDmgDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	equipmentBreakdownLimit();
	
	BaseCharge();
	
	AddlCharge();
	
	OptionalPropDmgDedFactor();
	
	OptionalTimeDedFactor();
	
	Each100000AddlCharge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}