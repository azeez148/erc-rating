package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEarthquake  {

	
	
	
	private com.nest.res.bop.domain.BOPEarthquake BOPEarthquake;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPEarthquake.getPremium() != (double)0.0){
			this.BOPEarthquake.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEarthquake.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFactor",String.valueOf( "Y"))));

	  
	}
	public void FunctionalBPPValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFunctionalBPPValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPEarthquake.setPremium(this.BOPEarthquake.getEarthquakeBuildingPremium() + this.BOPEarthquake.getEarthquakeBPPPremium() + this.BOPEarthquake.getFunctionalBPPValuationPremium());

	  
	}
	public  BOPEarthquake (com.nest.res.bop.domain.BOPEarthquake BOPEarthquake)  {
	  this.BOPEarthquake = BOPEarthquake;

	  
	}
	public void FunctionalBuildingValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPEarthquake.setFunctionalBuildingValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBldgFactor",String.valueOf( "Y"))));

	  
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
	public void EarthquakeBuildingPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../RatingBasis"))).equals((String)"Functional Valuation")){
			this.BOPEarthquake.setEarthquakeBuildingPremium(MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../BuildingLimit"))) / (double)100.0) * this.BOPEarthquake.getFunctionalBuildingValuationFactor()));
		}
		else{
			this.BOPEarthquake.setEarthquakeBuildingPremium(MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPEarthquake,"../BuildingLimit"))) / (double)100.0)));
		}
	  
	}
	public void FunctionalBPPValuationPremium ()  {
	  this.BOPEarthquake.setFunctionalBPPValuationPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEarthquake,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPEarthquake,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPEarthquake.setFunctionalBPPValuationPremium(this.BOPEarthquake.getFunctionalBPPValuationPremium() + MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeBPPRate() * this.BOPEarthquake.getFunctionalBPPValuationFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / (double)100.0)));
		}		}

	  
	}
	public void EarthquakeBPPPremium ()  {
	  this.BOPEarthquake.setEarthquakeBPPPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEarthquake,"../BOPClassification") ){
			this.BOPEarthquake.setEarthquakeBPPPremium(this.BOPEarthquake.getEarthquakeBPPPremium()+this.BOPEarthquake.getEarthquakeBPPPremium() + MathHelper.roundUpDoller((this.BOPEarthquake.getEarthquakeBPPRate() * this.BOPEarthquake.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) / (double)100.0)));
		}

	  
	}
	
	
	
	
	


	
}