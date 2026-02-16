package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPFineArtsApartmentCoverage;
import com.nest.res.bop.domain.BOPFineArtsRestaurantCoverage;

public class BOPFineArts  {

	
	
	
	private List<BOPFineArtsApartmentCoverage> BOPFineArtsApartmentCoverageList;
	private List<BOPFineArtsRestaurantCoverage> BOPFineArtsRestaurantCoverageList;
	private com.nest.res.bop.rules.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverageRule;
	private com.nest.res.bop.rules.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverageRule;
	private com.nest.res.bop.domain.BOPFineArts BOPFineArts;
	
	
	
	public void ApartmentCharge ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) != null && ((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) != null){
		if(this.BOPFineArts.getApartmentBuildingsCharge() >= this.BOPFineArts.getRestaurantsFineArtsCharge()){
			this.BOPFineArts.setApartmentCharge(this.BOPFineArts.getApartmentBuildingsCharge());
		}
		else{
			this.BOPFineArts.setApartmentCharge((double)0.0);
		}
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) == null && ((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) != null){
			this.BOPFineArts.setApartmentCharge((double)0.0);
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) != null && ((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) == null){
			this.BOPFineArts.setApartmentCharge(this.BOPFineArts.getApartmentBuildingsCharge());
		}
		else{
			this.BOPFineArts.setApartmentCharge((double)0.0);
		}
		}
		}
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPFineArtsApartmentCoverageList != null && this.BOPFineArtsApartmentCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage : BOPFineArtsApartmentCoverageList) {
				finalPremium = finalPremium + BOPFineArtsApartmentCoverage.getPremium();
			}
		}
		if(this.BOPFineArtsRestaurantCoverageList != null && this.BOPFineArtsRestaurantCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage : BOPFineArtsRestaurantCoverageList) {
				finalPremium = finalPremium + BOPFineArtsRestaurantCoverage.getPremium();
			}
		}
this.BOPFineArts.setPremium(finalPremium) ;
	  
	}
	public  BOPFineArts (com.nest.res.bop.domain.BOPFineArts BOPFineArts)  {
	  this.BOPFineArts = BOPFineArts;
this.BOPFineArtsApartmentCoverageList = BOPFineArts.getBOPFineArtsApartmentCoverage();
this.BOPFineArtsRestaurantCoverageList = BOPFineArts.getBOPFineArtsRestaurantCoverage();

	  
	}
	public void ApartmentBuildingsCharge () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) != null){
			this.BOPFineArts.setApartmentBuildingsCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FineArtsCharge",String.valueOf( "Y"))));
		}
		else{
			this.BOPFineArts.setApartmentBuildingsCharge((double)0.0);
		}
	  
	}
	public void RestaurantsFineArtsCharge () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) != null){
			this.BOPFineArts.setRestaurantsFineArtsCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantFineArts",String.valueOf( "Y"))));
		}
		else{
			this.BOPFineArts.setRestaurantsFineArtsCharge((double)0.0);
		}
	  
	}
	public void RestaurantCharge ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) != null && ((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) != null){
		if(this.BOPFineArts.getApartmentBuildingsCharge() >= this.BOPFineArts.getRestaurantsFineArtsCharge()){
			this.BOPFineArts.setRestaurantCharge((double)0.0);
		}
		else{
			this.BOPFineArts.setRestaurantCharge(this.BOPFineArts.getRestaurantsFineArtsCharge());
		}
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) == null && ((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) != null){
			this.BOPFineArts.setRestaurantCharge(this.BOPFineArts.getRestaurantsFineArtsCharge());
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings"))) != null && ((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants"))) == null){
			this.BOPFineArts.setRestaurantCharge((double)0.0);
		}
		else{
			this.BOPFineArts.setRestaurantCharge((double)0.0);
		}
		}
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	ApartmentBuildingsCharge();
	
	RestaurantsFineArtsCharge();
	
	ApartmentCharge();
	
	RestaurantCharge();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPFineArtsApartmentCoverageList){
		for(BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage:BOPFineArtsApartmentCoverageList){
			BOPFineArtsApartmentCoverageRule = new com.nest.res.bop.rules.BOPFineArtsApartmentCoverage(BOPFineArtsApartmentCoverage);
			BOPFineArtsApartmentCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPFineArtsRestaurantCoverageList){
		for(BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage:BOPFineArtsRestaurantCoverageList){
			BOPFineArtsRestaurantCoverageRule = new com.nest.res.bop.rules.BOPFineArtsRestaurantCoverage(BOPFineArtsRestaurantCoverage);
			BOPFineArtsRestaurantCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}