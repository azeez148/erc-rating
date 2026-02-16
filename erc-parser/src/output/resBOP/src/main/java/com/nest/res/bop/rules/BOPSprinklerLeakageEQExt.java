package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSprinklerLeakageEQExt  {

	
	
	
	private com.nest.res.bop.domain.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt;
	
	
	
	public void FunctionalBPPValuationPremium ()  {
	  this.BOPSprinklerLeakageEQExt.setFunctionalBPPValuationPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPSprinklerLeakageEQExt,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPSprinklerLeakageEQExt,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPSprinklerLeakageEQExt.setFunctionalBPPValuationPremium(this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationPremium() + MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPRate() * this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / (double)100.0)));
		}		}

	  
	}
	public void FunctionalBPPValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPSprinklerLeakageEQExt.setFunctionalBPPValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBusnPrsnlPropFactor",String.valueOf( "Y"))));

	  
	}
	public void SprinklerLeakageBPPPremium ()  {
	  this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBPPPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPSprinklerLeakageEQExt,"../BOPClassification") ){
			this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBPPPremium(this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPPremium()+this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPPremium() + MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPRate() * this.BOPSprinklerLeakageEQExt.getFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit"))) / (double)100.0)));
		}

	  
	}
	public void Premium ()  {
	  this.BOPSprinklerLeakageEQExt.setPremium(this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBuildingPremium() + this.BOPSprinklerLeakageEQExt.getSprinklerLeakageBPPPremium() + this.BOPSprinklerLeakageEQExt.getFunctionalBPPValuationPremium());

	  
	}
	public void FunctionalBuildingValuationFactor () throws LookupException,NumberFormatException {
	  this.BOPSprinklerLeakageEQExt.setFunctionalBuildingValuationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQFunctlBldgFactor",String.valueOf( "Y"))));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPSprinklerLeakageEQExt.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SprinklerLeakageEQFactor",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSprinklerLeakageEQExt.getPremium() != (double)0.0){
			this.BOPSprinklerLeakageEQExt.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPSprinklerLeakageEQExt.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPSprinklerLeakageEQExt (com.nest.res.bop.domain.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt)  {
	  this.BOPSprinklerLeakageEQExt = BOPSprinklerLeakageEQExt;

	  
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
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void SprinklerLeakageBuildingPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../RatingBasis"))).equals((String)"Functional Valuation")){
			this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBuildingPremium(MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageRate() * this.BOPSprinklerLeakageEQExt.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../BuildingLimit"))) / (double)100.0) * this.BOPSprinklerLeakageEQExt.getFunctionalBuildingValuationFactor()));
		}
		else{
			this.BOPSprinklerLeakageEQExt.setSprinklerLeakageBuildingPremium(MathHelper.roundUpDoller((this.BOPSprinklerLeakageEQExt.getSprinklerLeakageRate() * this.BOPSprinklerLeakageEQExt.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPSprinklerLeakageEQExt,"../BuildingLimit"))) / (double)100.0)));
		}
	  
	}
	
	
	
	
	


	
}