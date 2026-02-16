package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutomaticIncreaseCoverageBuilding  {

	
	
	
	private com.nest.res.bop.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding;
	
	
	
	public void Premium ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) == (int)8.0 || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))) == (int)0.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setPremium((double)0.0);
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setPremium(MathHelper.roundUpDoller(this.BOPAutomaticIncreaseCoverageBuilding.getFactor() * (this.BOPAutomaticIncreaseCoverageBuilding.getBopStructureBuildingCoveragePremium_1() + this.BOPAutomaticIncreaseCoverageBuilding.getEQBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getEQSubLimitBldgPremium() + this.BOPAutomaticIncreaseCoverageBuilding.getSprinklerLeakageEQBldgPremium())));
		}
	  
	}
	public  BOPAutomaticIncreaseCoverageBuilding (com.nest.res.bop.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding)  {
	  this.BOPAutomaticIncreaseCoverageBuilding = BOPAutomaticIncreaseCoverageBuilding;

	  
	}
	public void SprinklerLeakageEQBldgPremium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPSprinklerLeakageEQExt"))) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setSprinklerLeakageEQBldgPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPSprinklerLeakageEQExt/SprinklerLeakageBuildingPremium"))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setSprinklerLeakageEQBldgPremium((double)0.0);
		}
	  
	}
	public void Factor ()  {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() >= (int)2.0 && this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= (int)6.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor() * -1);
		}
		else{
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() >= (int)10.0 && this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= (int)16.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor());
		}
		else{
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() >= (int)18.0 || this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= (int)24.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor(((((double)this.BOPAutomaticIncreaseCoverageBuilding.getPct() - (double)16.0) / (double)2.0) * this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseExcessFactor()) + this.BOPAutomaticIncreaseCoverageBuilding.getAutomaticIncreaseFactor());
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setFactor((double)0.0);
		}
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPremium() != (double)0.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setPremiumIndicator((int)0.0);
		}
	  
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
	public void bopStructureBuildingCoveragePremium_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPStructureBuildingCoverage"))) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setBopStructureBuildingCoveragePremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPStructureBuildingCoverage/Premium"))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setBopStructureBuildingCoveragePremium_1((double)0.0);
		}
	  
	}
	public void EQSubLimitBldgPremium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEQSubLimit"))) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setEQSubLimitBldgPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEQSubLimit/BldgPremium"))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setEQSubLimitBldgPremium((double)0.0);
		}
	  
	}
	public void AutomaticIncreaseExcessFactor () throws LookupException,NumberFormatException {
	  this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseExcessFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseExcessFactor",String.valueOf( "Y"))));

	  
	}
	public void EQBldgPremium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEarthquake"))) != null){
			this.BOPAutomaticIncreaseCoverageBuilding.setEQBldgPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../BOPEarthquake/EarthquakeBuildingPremium"))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setEQBldgPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Pct ()  {
	  this.BOPAutomaticIncreaseCoverageBuilding.setPct((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPAutomaticIncreaseCoverageBuilding,"../AutomaticIncreasePct"))));

	  
	}
	public void AutomaticIncreaseFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() > (int)0.0 && this.BOPAutomaticIncreaseCoverageBuilding.getPct() <= (int)16.0 && this.BOPAutomaticIncreaseCoverageBuilding.getPct() != (int)8.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf(BOPAutomaticIncreaseCoverageBuilding.getPct()))));
		}
		else{
		if(this.BOPAutomaticIncreaseCoverageBuilding.getPct() > (int)16.0){
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf( 16))));
		}
		else{
			this.BOPAutomaticIncreaseCoverageBuilding.setAutomaticIncreaseFactor((double)0.0);
		}
		}
	  
	}
	
	
	
	
	


	
}