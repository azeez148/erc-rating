package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEquipmentBreakdownProtectionCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage;
	
	
	
	public void Each100000AddlCharge ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() > (int)599999.0){
			this.BOPEquipmentBreakdownProtectionCoverage.setEach100000AddlCharge(MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) * MathHelper.roundUpDoller((this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() - (double)599999.0) / (double)100000.0));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setEach100000AddlCharge((double)0.0);
		}
	  
	}
	public void equipmentBreakdownLimit ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEquipmentBreakdownProtectionCoverage,"../BOPStructure") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))) > (int)0.0){
			this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit(Integer.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit"))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setEquipmentBreakdownLimit(Integer.valueOf(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))));
		}		}

	  
	}
	public void OptionalPropDmgDedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDamgDed() != (int)0.0){
			this.BOPEquipmentBreakdownProtectionCoverage.setOptionalPropDmgDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptionalPropDamageDedFactors",String.valueOf(BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDamgDed()))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setOptionalPropDmgDedFactor((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getPremium() != (double)0.0){
			this.BOPEquipmentBreakdownProtectionCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void BaseCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() <= (int)599999.0){
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() != (int)0.0){
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownBaseCharge",String.valueOf(BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit()))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge((double)0.0);
		}
		}
		else{
		if(this.BOPEquipmentBreakdownProtectionCoverage.getEquipmentBreakdownLimit() != (int)0.0){
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownBaseCharge",String.valueOf( 599999))));
		}
		else{
			this.BOPEquipmentBreakdownProtectionCoverage.setBaseCharge((double)0.0);
		}
		}
	  
	}
	public void OptionalTimeDedFactor () throws LookupException,NumberFormatException {
	  this.BOPEquipmentBreakdownProtectionCoverage.setOptionalTimeDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptionalTimeDedFactors",String.valueOf(BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDed()))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
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
	public  BOPEquipmentBreakdownProtectionCoverage (com.nest.res.bop.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage)  {
	  this.BOPEquipmentBreakdownProtectionCoverage = BOPEquipmentBreakdownProtectionCoverage;

	  
	}
	public void AddlCharge () throws LookupException,NumberFormatException {
	  this.BOPEquipmentBreakdownProtectionCoverage.setAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EquipmentBreakdownAddlCharge",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPEquipmentBreakdownProtectionCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.roundUpDoller(this.BOPEquipmentBreakdownProtectionCoverage.getBaseCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEquipmentBreakdownProtectionCoverage,"../BoilerMachineryLCM")))) + this.BOPEquipmentBreakdownProtectionCoverage.getEach100000AddlCharge()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalPropDmgDedFactor()) * this.BOPEquipmentBreakdownProtectionCoverage.getOptionalTimeDedFactor()));

	  
	}
	
	
	
	
	


	
}