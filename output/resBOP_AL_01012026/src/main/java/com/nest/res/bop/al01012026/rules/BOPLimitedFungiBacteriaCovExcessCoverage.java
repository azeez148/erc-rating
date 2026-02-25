package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedFungiBacteriaCovExcessCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage;
	
	
	
	public void LocationLimitPremium ()  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setLocationLimitPremium(this.BOPLimitedFungiBacteriaCovExcessCoverage.getLocationLimitPremiumTemp_1());

	  
	}
	public void StructureLimitPremium ()  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setStructureLimitPremium(this.BOPLimitedFungiBacteriaCovExcessCoverage.getStructureLimitPremiumTemp_1());

	  
	}
	public void locationLimitPremiumTemp_1 ()  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setLocationLimitPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))) != 0.0){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLocationLimitPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getLocationLimitPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))))));
		}		}

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	numLocationsTemp_1();
	
	NumLocations();
	
	numStructuresTemp_1();
	
	NumStructures();
	
	PerPremisesLocationsRate();
	
	locationLimitPremiumTemp_1();
	
	LocationLimitPremium();
	
	structureLimitPremiumTemp_1();
	
	StructureLimitPremium();
	
	LimitPremium();
	
	AdditionalPremisesLocationsPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPremium() < MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPLimitedFungiBacteriaCovExcessCoverage.getLimitPremium() + this.BOPLimitedFungiBacteriaCovExcessCoverage.getAdditionalPremisesLocationsPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../IRPMFactor"))))));
		}
	  
	}
	public void NumStructures ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructures(MathHelper.getIntegerValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumStructuresTemp_1()));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructures(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPLimitedFungiBacteriaCovExcessCoverage (com.nest.res.bop.al01012026.domain.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage)  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage = BOPLimitedFungiBacteriaCovExcessCoverage;

	  
	}
	public void PerPremisesLocationsRate () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPerPremisesLocationsRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiPerPremisesLocationsRate",String.valueOf( "Y")))));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPerPremisesLocationsRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void structureLimitPremiumTemp_1 ()  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setStructureLimitPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation/BOPStructure") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))) != 0.0){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setStructureLimitPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getStructureLimitPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))))));
		}		}

	  
	}
	public void AdditionalPremisesLocationsPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setAdditionalPremisesLocationsPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPerPremisesLocationsRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../LCM")))) * MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumLocations()) + MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumStructures()) - MathHelper.getDoubleValue(1.0)))));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setAdditionalPremisesLocationsPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void numStructuresTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructuresTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation/BOPStructure") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"SeparateAnnualAggregateLimit"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructuresTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumStructuresTemp_1() + MathHelper.getIntegerValue(1.0))));
		}		}

		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiExcessLimitRate",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void LimitPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparateLimitsForEachPremisesOrLocations"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLimitPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getLocationLimitPremium() + this.BOPLimitedFungiBacteriaCovExcessCoverage.getStructureLimitPremium())));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparateLimitsForEachPremisesOrLocations"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../RevisedLimit"))) > MathHelper.getIntegerValue(15000.0)){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLimitPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPLimitedFungiBacteriaCovExcessCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../LCM")))) * (((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../RevisedLimit"))) - MathHelper.getDoubleValue(15000.0)) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLimitPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void NumLocations ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocations(MathHelper.getIntegerValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumLocationsTemp_1()));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocations(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPremium() < MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPLimitedFungiBacteriaCovExcessCoverage.getLimitPremium() + this.BOPLimitedFungiBacteriaCovExcessCoverage.getAdditionalPremisesLocationsPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../IRPMFactor"))))));
		}
	  
	}
	public void numLocationsTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocationsTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"SeparateAnnualAggregateLimit"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocationsTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumLocationsTemp_1() + MathHelper.getIntegerValue(1.0))));
		}		}

		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}