package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEarthquake  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPEarthquake BOPEarthquake;
	
	
	
	public void FunctionalBPPValuationPremium ()  {
	  this.BOPEarthquake.setFunctionalBPPValuationPremium(this.BOPEarthquake.getFunctionalBPPValuationPremiumTemp_1());

	  
	}
	public  BOPEarthquake (com.nest.res.bop.al01012026.domain.BOPEarthquake BOPEarthquake)  {
	  this.BOPEarthquake = BOPEarthquake;

	  
	}
	public void FunctionalBuildingValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFunctionalBuildingValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBldgFactor",String.valueOf( "Y"))));

	  
	}
	public void EarthquakeBPPPremium ()  {
	  this.BOPEarthquake.setEarthquakeBPPPremium(this.BOPEarthquake.getEarthquakeBPPPremium_1());

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	FunctionalBuildingValuationFactor();
	
	FunctionalBPPValuationFactor();
	
	EarthquakeBuildingPremium();
	
	earthquakeBPPPremium_1();
	
	EarthquakeBPPPremium();
	
	functionalBPPValuationPremiumTemp_1();
	
	FunctionalBPPValuationPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEarthquake.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEarthquake.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEarthquake.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void FunctionalBPPValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFunctionalBPPValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPEarthquake.setPremium(MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBuildingPremium() + this.BOPEarthquake.getEarthquakeBPPPremium() + this.BOPEarthquake.getFunctionalBPPValuationPremium()));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEarthquake.setPremium(MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBuildingPremium() + this.BOPEarthquake.getEarthquakeBPPPremium() + this.BOPEarthquake.getFunctionalBPPValuationPremium()));

	  
	}
	public void functionalBPPValuationPremiumTemp_1 ()  {
	  this.BOPEarthquake.setFunctionalBPPValuationPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEarthquake,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPEarthquake,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPEarthquake.setFunctionalBPPValuationPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEarthquake.getFunctionalBPPValuationPremiumTemp_1()) + MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBPPRate()) * MathHelper.getDoubleValue(this.BOPEarthquake.getFunctionalBPPValuationFactor())) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / MathHelper.getDoubleValue(100.0))))));
		}		}

	  
	}
	public void EarthquakeBuildingPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../RatingBasis"))).equals(MathHelper.getStringValue("Functional Valuation"))){
			this.BOPEarthquake.setEarthquakeBuildingPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)) * this.BOPEarthquake.getFunctionalBuildingValuationFactor())));
		}
		else{
			this.BOPEarthquake.setEarthquakeBuildingPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
	  
	}
	public void earthquakeBPPPremium_1 ()  {
	  this.BOPEarthquake.setEarthquakeBPPPremium_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEarthquake,"../BOPClassification") ){
			this.BOPEarthquake.setEarthquakeBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBPPPremium_1()) + MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBPPRate()) * MathHelper.getDoubleValue(this.BOPEarthquake.getFactor())) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}

	  
	}
	
	
	
	
	


	
}