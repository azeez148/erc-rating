package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutomaticIncreaseCoverageBuilding  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding;
	
	
	
	public void Pct ()  {
	  this.BOPAutomaticIncreaseCoverageBuilding.setPct((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))));

	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) == MathHelper.getIntegerValue(8.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPAutomaticIncreaseCoverageBuilding.getFactor() * (this.BOPAutomaticIncreaseCoverageBuilding.getBopStructureBuildingCoveragePremium_1() + this.BOPAutomaticIncreaseCoverageBuilding.getEQBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getEQSubLimitBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getSprinklerLeakageEQBldgPremium()))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AutomaticIncreaseExcessFactor () throws LookupException,NumberFormatException {
	  this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseExcessFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseExcessFactor",String.valueOf( "Y"))));

	  
	}
	public void bopStructureBuildingCoveragePremium_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPStructureBuildingCoverage")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setBopStructureBuildingCoveragePremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPStructureBuildingCoverage/Premium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setBopStructureBuildingCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void EQBldgPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEarthquake")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setEQBldgPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEarthquake/EarthquakeBuildingPremium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setEQBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPAutomaticIncreaseCoverageBuilding (com.nest.res.bop.al09012019.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding)  {
	  this.BOPAutomaticIncreaseCoverageBuilding = BOPAutomaticIncreaseCoverageBuilding;

	  
	}
	public void AutomaticIncreaseFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() > MathHelper.getIntegerValue(0.0) && this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= MathHelper.getIntegerValue(16.0) && this.BOPAutomaticIncreaseCoverageBuilding.getPct() != MathHelper.getIntegerValue(8.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf(this.BOPAutomaticIncreaseCoverageBuilding.getPct())))));
		}
		else{
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() > MathHelper.getIntegerValue(16.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf( 16)))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void EQSubLimitBldgPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEQSubLimit")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setEQSubLimitBldgPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEQSubLimit/BldgPremium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setEQSubLimitBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Pct();
	
	AutomaticIncreaseFactor();
	
	AutomaticIncreaseExcessFactor();
	
	Factor();
	
	bopStructureBuildingCoveragePremium_1();
	
	EQBldgPremium();
	
	EQSubLimitBldgPremium();
	
	SprinklerLeakageEQBldgPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Factor ()  {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() >= MathHelper.getIntegerValue(2.0) && this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= MathHelper.getIntegerValue(6.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor() * -1)));
		}
		else{
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() >= MathHelper.getIntegerValue(10.0) && this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= MathHelper.getIntegerValue(16.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(MathHelper.getDoubleValue(this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor()));
		}
		else{
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() >= MathHelper.getIntegerValue(18.0) || this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= MathHelper.getIntegerValue(24.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((((MathHelper.getDoubleValue(this.BOPAutomaticIncreaseCoverageBuilding.getPct()) - MathHelper.getDoubleValue(16.0)) / MathHelper.getDoubleValue(2.0)) * this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseExcessFactor()) + this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor())));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) == MathHelper.getIntegerValue(8.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPAutomaticIncreaseCoverageBuilding.getFactor() * (this.BOPAutomaticIncreaseCoverageBuilding.getBopStructureBuildingCoveragePremium_1() + this.BOPAutomaticIncreaseCoverageBuilding.getEQBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getEQSubLimitBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getSprinklerLeakageEQBldgPremium()))));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) != MathHelper.getIntegerValue(8.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void SprinklerLeakageEQBldgPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPSprinklerLeakageEQExt")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setSprinklerLeakageEQBldgPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPSprinklerLeakageEQExt/SprinklerLeakageBuildingPremium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setSprinklerLeakageEQBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}