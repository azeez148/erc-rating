package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutomaticIncreaseCoverageBuilding  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Pct ()  {
	  this.BOPAutomaticIncreaseCoverageBuilding.setPct((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void AutomaticIncreaseFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() > MathHelper.getIntegerValue(0.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf(this.BOPAutomaticIncreaseCoverageBuilding.getPct())))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.roundUpDoller(this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor() * (this.BOPAutomaticIncreaseCoverageBuilding.getBopStructureBuildingCoveragePremium_1() + this.BOPAutomaticIncreaseCoverageBuilding.getEQBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getEQSubLimitBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getSprinklerLeakageEQBldgPremium())));

	  
	}
	public void EQSubLimitBldgPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEQSubLimit")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setEQSubLimitBldgPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEQSubLimit/BldgPremium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setEQSubLimitBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
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
	public void Premium ()  {
	  this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.roundUpDoller(this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor() * (this.BOPAutomaticIncreaseCoverageBuilding.getBopStructureBuildingCoveragePremium_1() + this.BOPAutomaticIncreaseCoverageBuilding.getEQBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getEQSubLimitBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getSprinklerLeakageEQBldgPremium())));

	  
	}
	public void bopStructureBuildingCoveragePremium_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPStructureBuildingCoverage")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setBopStructureBuildingCoveragePremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPStructureBuildingCoverage/Premium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setBopStructureBuildingCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Pct();
	
	AutomaticIncreaseFactor();
	
	bopStructureBuildingCoveragePremium_1();
	
	EQBldgPremium();
	
	EQSubLimitBldgPremium();
	
	SprinklerLeakageEQBldgPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void SprinklerLeakageEQBldgPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPSprinklerLeakageEQExt")) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setSprinklerLeakageEQBldgPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPSprinklerLeakageEQExt/SprinklerLeakageBuildingPremium")))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setSprinklerLeakageEQBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPAutomaticIncreaseCoverageBuilding.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPAutomaticIncreaseCoverageBuilding (com.nest.res.bop.al01012026.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding)  {
	  this.BOPAutomaticIncreaseCoverageBuilding = BOPAutomaticIncreaseCoverageBuilding;

	  
	}
	
	
	
	
	


	
}