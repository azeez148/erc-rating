package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSprinklerLeakageEQExt  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPSprinklerLeakageEQExt.setPremium(MathHelper.getDoubleValue(this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBuildingPremium() + this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPPremium() + this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationPremium()));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	FunctionalBuildingValuationFactor();
	
	FunctionalBPPValuationFactor();
	
	SprinklerLeakageBuildingPremium();
	
	SprinklerLeakageBPPPremium();
	
	FunctionalBPPValuationPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPSprinklerLeakageEQExt.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SprinklerLeakageEQFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPSprinklerLeakageEQExt (com.nest.res.bop.al09012019.domain.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt)  {
	  this.BOPSprinklerLeakageEQExt = BOPSprinklerLeakageEQExt;

	  
	}
	public void SprinklerLeakageBuildingPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../RatingBasis"))).equals(MathHelper.getStringValue("Functional Valuation"))){
			this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBuildingPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageRate() * this.BOPSprinklerLeakageEQExt.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)) * this.BOPSprinklerLeakageEQExt.getFunctionalBuildingValuationFactor())));
		}
		else{
			this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBuildingPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageRate() * this.BOPSprinklerLeakageEQExt.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSprinklerLeakageEQExt.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSprinklerLeakageEQExt.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSprinklerLeakageEQExt.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSprinklerLeakageEQExt.setPremium(MathHelper.getDoubleValue(this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBuildingPremium() + this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPPremium() + this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationPremium()));

	  
	}
	public void FunctionalBuildingValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPSprinklerLeakageEQExt.setFunctionalBuildingValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBldgFactor",String.valueOf( "Y"))));

	  
	}
	public void SprinklerLeakageBPPPremium ()  {
	  this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBPPPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPSprinklerLeakageEQExt,"../BOPClassification") ){
			this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBPPPremium(MathHelper.getDoubleValue(this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPPremium() + MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPRate() * this.BOPSprinklerLeakageEQExt.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}

	  
	}
	public void FunctionalBPPValuationPremium ()  {
	  this.BOPSprinklerLeakageEQExt.setFunctionalBPPValuationPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPSprinklerLeakageEQExt,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPSprinklerLeakageEQExt,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPSprinklerLeakageEQExt.setFunctionalBPPValuationPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationPremium() + MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPRate() * this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / MathHelper.getDoubleValue(100.0))))));
		}		}

	  
	}
	public void FunctionalBPPValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPSprinklerLeakageEQExt.setFunctionalBPPValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}