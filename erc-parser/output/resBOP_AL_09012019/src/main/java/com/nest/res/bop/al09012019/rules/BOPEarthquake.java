package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEarthquake  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPEarthquake BOPEarthquake;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPEarthquake.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEarthquake.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEarthquake.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	FunctionalBuildingValuationFactor();
	
	FunctionalBPPValuationFactor();
	
	EarthquakeBuildingPremium();
	
	EarthquakeBPPPremium();
	
	FunctionalBPPValuationPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPEarthquake (com.nest.res.bop.al09012019.domain.BOPEarthquake BOPEarthquake)  {
	  this.BOPEarthquake = BOPEarthquake;

	  
	}
	public void FunctionalBPPValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFunctionalBPPValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void EarthquakeBPPPremium ()  {
	  this.BOPEarthquake.setEarthquakeBPPPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEarthquake,"../BOPClassification") ){
			this.BOPEarthquake.setEarthquakeBPPPremium(MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBPPPremium() + MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeBPPRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEarthquake.setPremium(MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBuildingPremium() + this.BOPEarthquake.getEarthquakeBPPPremium() + this.BOPEarthquake.getFunctionalBPPValuationPremium()));

	  
	}
	public void Premium ()  {
	  this.BOPEarthquake.setPremium(MathHelper.getDoubleValue(this.BOPEarthquake.getEarthquakeBuildingPremium() + this.BOPEarthquake.getEarthquakeBPPPremium() + this.BOPEarthquake.getFunctionalBPPValuationPremium()));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFactor",String.valueOf( "Y"))));

	  
	}
	public void EarthquakeBuildingPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../RatingBasis"))).equals(MathHelper.getStringValue("Functional Valuation"))){
			this.BOPEarthquake.setEarthquakeBuildingPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)) * this.BOPEarthquake.getFunctionalBuildingValuationFactor())));
		}
		else{
			this.BOPEarthquake.setEarthquakeBuildingPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
	  
	}
	public void FunctionalBuildingValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFunctionalBuildingValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBldgFactor",String.valueOf( "Y"))));

	  
	}
	public void FunctionalBPPValuationPremium ()  {
	  this.BOPEarthquake.setFunctionalBPPValuationPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEarthquake,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPEarthquake,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPEarthquake.setFunctionalBPPValuationPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEarthquake.getFunctionalBPPValuationPremium() + MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeBPPRate() * this.BOPEarthquake.getFunctionalBPPValuationFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / MathHelper.getDoubleValue(100.0))))));
		}		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}