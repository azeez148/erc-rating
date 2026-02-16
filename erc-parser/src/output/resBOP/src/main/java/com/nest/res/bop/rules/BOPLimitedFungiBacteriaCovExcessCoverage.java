package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedFungiBacteriaCovExcessCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage;
	
	
	
	public void NumStructures ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructures((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation/BOPStructure") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"SeparateAnnualAggregateLimit"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructures(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumStructures() + (int)1.0);
		}		}

		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumStructures((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPremium() < (double)0.0){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremium((double)0.0);
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremium(MathHelper.roundUpDoller((this.BOPLimitedFungiBacteriaCovExcessCoverage.getLimitPremium() + this.BOPLimitedFungiBacteriaCovExcessCoverage.getAdditionalPremisesLocationsPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../IRPMFactor")))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void NumLocations ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocations((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"SeparateAnnualAggregateLimit"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocations(this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumLocations() + (int)1.0);
		}		}

		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setNumLocations((int)0.0);
		}
	  
	}
	public void PerPremisesLocationsRate () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPerPremisesLocationsRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiPerPremisesLocationsRate",String.valueOf( "Y"))));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPerPremisesLocationsRate((double)0.0);
		}
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiExcessLimitRate",String.valueOf( "Y"))));

	  
	}
	public void LocationLimitPremium ()  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage.setLocationLimitPremium((double)0.0);

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))) != 0.0){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLocationLimitPremium(this.BOPLimitedFungiBacteriaCovExcessCoverage.getLocationLimitPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))));
		}		}

		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPremium() != (double)0.0){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void AdditionalPremisesLocationsPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setAdditionalPremisesLocationsPremium(MathHelper.roundUpDoller(this.BOPLimitedFungiBacteriaCovExcessCoverage.getPerPremisesLocationsRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../LCM")))) * MathHelper.roundUpDoller((double)this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumLocations() + (double)this.BOPLimitedFungiBacteriaCovExcessCoverage.getNumStructures() - (double)1.0));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setAdditionalPremisesLocationsPremium((double)0.0);
		}
	  
	}
	public void StructureLimitPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setStructureLimitPremium((double)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation/BOPStructure") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"SeparateAnnualAggregateLimit"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setStructureLimitPremium(this.BOPLimitedFungiBacteriaCovExcessCoverage.getStructureLimitPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FungiExcessLimitPremium"))));
		}		}

		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setStructureLimitPremium((double)0.0);
		}
	  
	}
	public void LimitPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLimitPremium(this.BOPLimitedFungiBacteriaCovExcessCoverage.getLocationLimitPremium() + this.BOPLimitedFungiBacteriaCovExcessCoverage.getStructureLimitPremium());
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"No")){
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLimitPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPLimitedFungiBacteriaCovExcessCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../../LCM")))) * (((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../dsLimit"))) - (double)15000.0) / (double)100.0)));
		}
		else{
			this.BOPLimitedFungiBacteriaCovExcessCoverage.setLimitPremium((double)0.0);
		}
		}
	  
	}
	public  BOPLimitedFungiBacteriaCovExcessCoverage (com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovExcessCoverage BOPLimitedFungiBacteriaCovExcessCoverage)  {
	  this.BOPLimitedFungiBacteriaCovExcessCoverage = BOPLimitedFungiBacteriaCovExcessCoverage;

	  
	}
	public void __BOPLocation_BOPStructure_FungiExcessLimitPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"../SeparatePremisesLocationsOption"))).equals((String)"Yes")){
		for( Policy policy : XpathNode.selectNodes(BOPLimitedFungiBacteriaCovExcessCoverage,"../../BOPLocation/BOPStructure") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"SeparateAnnualAggregateLimit"))).equals((String)"Yes")){
		com.nest.res.bop.domain.BOPStructure BOPStructure= (com.nest.res.bop.domain.BOPStructure)policy;
		BOPStructure.setFungiExcessLimitPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPLimitedFungiBacteriaCovExcessCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedFungiBacteriaCovExcessCoverage,"LCM")))) * (((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"FungiLimit"))) - (double)15000.0) / (double)100.0)));
		}
		else{
		com.nest.res.bop.domain.BOPStructure BOPStructure= (com.nest.res.bop.domain.BOPStructure)policy;
		BOPStructure.setFungiExcessLimitPremium((double)0.0);
		}		}

		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	NumLocations();
	
	PerPremisesLocationsRate();
	
	LocationLimitPremium();
	
	StructureLimitPremium();
	
	NumStructures();
	
	__BOPLocation_BOPStructure_FungiExcessLimitPremium();
	
	LimitPremium();
	
	AdditionalPremisesLocationsPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}