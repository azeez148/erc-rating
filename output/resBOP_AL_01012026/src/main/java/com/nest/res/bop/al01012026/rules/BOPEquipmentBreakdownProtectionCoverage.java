package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEquipmentBreakdownProtectionCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage;
	
	
	
	public void Each100000AddlCharge ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() > MathHelper.getIntegerValue(599999.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setEach100000AddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit()) - MathHelper.getDoubleValue(599999.0)) / MathHelper.getDoubleValue(100000.0)))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setEach100000AddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void OptionalTimeDedFactor () throws LookupException,NumberFormatException {
	  this.BOPEquipmentBreakdownProtectionCoverage.setOptionalTimeDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptionalTimeDedFactors",String.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDed()))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	equipmentBreakdownLimitTemp_1();
	
	EquipmentBreakdownLimit();
	
	BaseCharge();
	
	AddlCharge();
	
	OptionalPropDmgDedFactor();
	
	OptionalTimeDedFactor();
	
	Each100000AddlCharge();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void equipmentBreakdownLimitTemp_1 ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEquipmentBreakdownProtectionCoverage,"../BOPStructure") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))))));
		}		}

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPEquipmentBreakdownProtectionCoverage (com.nest.res.bop.al01012026.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage)  {
	  this.BOPEquipmentBreakdownProtectionCoverage = BOPEquipmentBreakdownProtectionCoverage;

	  
	}
	public void EquipmentBreakdownLimit ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimitTemp_1());

	  
	}
	public void OptionalPropDmgDedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDamgDed() != MathHelper.getIntegerValue(0.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setOptionalPropDmgDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptionalPropDamageDedFactors",String.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDamgDed())))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setOptionalPropDmgDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
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
	public void Premium ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) + this.BOPEquipmentBreakdownProtectionCoverage.getEach100000AddlCharge()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDmgDedFactor()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDedFactor()));

	  
	}
	public void AddlCharge () throws LookupException,NumberFormatException {
	  this.BOPEquipmentBreakdownProtectionCoverage.setAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) + this.BOPEquipmentBreakdownProtectionCoverage.getEach100000AddlCharge()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDmgDedFactor()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDedFactor()));

	  
	}
	public void BaseCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() > MathHelper.getIntegerValue(0.0) && this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() <= MathHelper.getIntegerValue(599999.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownBaseCharge",String.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit())))));
		}
		else{
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() > MathHelper.getIntegerValue(599999.0)){
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownBaseCharge",String.valueOf( 599999)))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	
	
	
	
	


	
}