package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPFineArtsApartmentCoverage;
import com.nest.res.bop.al01012026.domain.BOPFineArtsRestaurantCoverage;

public class BOPFineArts  {

	
	
	
	private List<BOPFineArtsApartmentCoverage> BOPFineArtsApartmentCoverageList;
	private List<BOPFineArtsRestaurantCoverage> BOPFineArtsRestaurantCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverageRule;
	private com.nest.res.bop.al01012026.domain.BOPFineArts BOPFineArts;
	
	
	
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	ApartmentBuildingsCharge();
	
	RestaurantsFineArtsCharge();
	
	ApartmentCharge();
	
	RestaurantCharge();
	
	  
	}
	public void ApartmentBuildingsCharge () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) != null){
			this.BOPFineArts.setApartmentBuildingsCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FineArtsCharge",String.valueOf( "Y")))));
		}
		else{
			this.BOPFineArts.setApartmentBuildingsCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ApartmentCharge ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) != null && (XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) != null){
		if(this.BOPFineArts.getApartmentBuildingsCharge() >= this.BOPFineArts.getRestaurantsFineArtsCharge()){
			this.BOPFineArts.setApartmentCharge(MathHelper.getDoubleValue(this.BOPFineArts.getApartmentBuildingsCharge()));
		}
		else{
			this.BOPFineArts.setApartmentCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) == null && (XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) != null){
			this.BOPFineArts.setApartmentCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) != null && (XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) == null){
			this.BOPFineArts.setApartmentCharge(MathHelper.getDoubleValue(this.BOPFineArts.getApartmentBuildingsCharge()));
		}
		else{
			this.BOPFineArts.setApartmentCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void RestaurantsFineArtsCharge () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) != null){
			this.BOPFineArts.setRestaurantsFineArtsCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RestaurantFineArts",String.valueOf( "Y")))));
		}
		else{
			this.BOPFineArts.setRestaurantsFineArtsCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPFineArts (com.nest.res.bop.al01012026.domain.BOPFineArts BOPFineArts)  {
	  this.BOPFineArts = BOPFineArts;
this.BOPFineArtsApartmentCoverageList = BOPFineArts.getBOPFineArtsApartmentCoverage();
this.BOPFineArtsRestaurantCoverageList = BOPFineArts.getBOPFineArtsRestaurantCoverage();

	  
	}
	public void RestaurantCharge ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) != null && (XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) != null){
		if(this.BOPFineArts.getApartmentBuildingsCharge() >= this.BOPFineArts.getRestaurantsFineArtsCharge()){
			this.BOPFineArts.setRestaurantCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPFineArts.setRestaurantCharge(MathHelper.getDoubleValue(this.BOPFineArts.getRestaurantsFineArtsCharge()));
		}
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) == null && (XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) != null){
			this.BOPFineArts.setRestaurantCharge(MathHelper.getDoubleValue(this.BOPFineArts.getRestaurantsFineArtsCharge()));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPFineArts,"../BOPApartmentBuildings")) != null && (XpathNode.selectNodeValue(this.BOPFineArts,"../BOPRestaurants")) == null){
			this.BOPFineArts.setRestaurantCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPFineArts.setRestaurantCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFineArts.setPremium(MathHelper.getDoubleValue(this.BOPFineArts.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArts,"BOPFineArtsApartmentCoverage/Premium")))));
this.BOPFineArts.setPremium(MathHelper.getDoubleValue(this.BOPFineArts.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFineArts,"BOPFineArtsRestaurantCoverage/Premium")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPFineArtsApartmentCoverageList){
		for(BOPFineArtsApartmentCoverage BOPFineArtsApartmentCoverage:BOPFineArtsApartmentCoverageList){
			BOPFineArtsApartmentCoverageRule = new com.nest.res.bop.al01012026.rules.BOPFineArtsApartmentCoverage(BOPFineArtsApartmentCoverage);
			BOPFineArtsApartmentCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPFineArtsRestaurantCoverageList){
		for(BOPFineArtsRestaurantCoverage BOPFineArtsRestaurantCoverage:BOPFineArtsRestaurantCoverageList){
			BOPFineArtsRestaurantCoverageRule = new com.nest.res.bop.al01012026.rules.BOPFineArtsRestaurantCoverage(BOPFineArtsRestaurantCoverage);
			BOPFineArtsRestaurantCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}