package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPRestaurantsRestaurantsCoverage;
import com.nest.res.bop.domain.BOPRestaurantsSpoilageCoverage;
import com.nest.res.bop.domain.BOPRestaurantsAdvertisingExpenseCoverage;
import com.nest.res.bop.domain.BOPRestaurantFoodContaminationCoverage;

public class BOPRestaurants  {

	
	
	
	private com.nest.res.bop.rules.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverageRule;
	private com.nest.res.bop.rules.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverageRule;
	private List<BOPRestaurantsRestaurantsCoverage> BOPRestaurantsRestaurantsCoverageList;
	private com.nest.res.bop.rules.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverageRule;
	private List<BOPRestaurantsSpoilageCoverage> BOPRestaurantsSpoilageCoverageList;
	private com.nest.res.bop.domain.BOPRestaurants BOPRestaurants;
	private List<BOPRestaurantsAdvertisingExpenseCoverage> BOPRestaurantsAdvertisingExpenseCoverageList;
	private com.nest.res.bop.rules.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverageRule;
	private List<BOPRestaurantFoodContaminationCoverage> BOPRestaurantFoodContaminationCoverageList;
	
	
	
	public  BOPRestaurants (com.nest.res.bop.domain.BOPRestaurants BOPRestaurants)  {
	  this.BOPRestaurants = BOPRestaurants;
this.BOPRestaurantsRestaurantsCoverageList = BOPRestaurants.getBOPRestaurantsRestaurantsCoverage();
this.BOPRestaurantsSpoilageCoverageList = BOPRestaurants.getBOPRestaurantsSpoilageCoverage();
this.BOPRestaurantsAdvertisingExpenseCoverageList = BOPRestaurants.getBOPRestaurantsAdvertisingExpenseCoverage();
this.BOPRestaurantFoodContaminationCoverageList = BOPRestaurants.getBOPRestaurantFoodContaminationCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPRestaurantFoodContaminationCoverageList){
		for(BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage:BOPRestaurantFoodContaminationCoverageList){
			BOPRestaurantFoodContaminationCoverageRule = new com.nest.res.bop.rules.BOPRestaurantFoodContaminationCoverage(BOPRestaurantFoodContaminationCoverage);
			BOPRestaurantFoodContaminationCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsAdvertisingExpenseCoverageList){
		for(BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage:BOPRestaurantsAdvertisingExpenseCoverageList){
			BOPRestaurantsAdvertisingExpenseCoverageRule = new com.nest.res.bop.rules.BOPRestaurantsAdvertisingExpenseCoverage(BOPRestaurantsAdvertisingExpenseCoverage);
			BOPRestaurantsAdvertisingExpenseCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsRestaurantsCoverageList){
		for(BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage:BOPRestaurantsRestaurantsCoverageList){
			BOPRestaurantsRestaurantsCoverageRule = new com.nest.res.bop.rules.BOPRestaurantsRestaurantsCoverage(BOPRestaurantsRestaurantsCoverage);
			BOPRestaurantsRestaurantsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsSpoilageCoverageList){
		for(BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage:BOPRestaurantsSpoilageCoverageList){
			BOPRestaurantsSpoilageCoverageRule = new com.nest.res.bop.rules.BOPRestaurantsSpoilageCoverage(BOPRestaurantsSpoilageCoverage);
			BOPRestaurantsSpoilageCoverageRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPRestaurantsRestaurantsCoverageList != null && this.BOPRestaurantsRestaurantsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage : BOPRestaurantsRestaurantsCoverageList) {
				finalPremium = finalPremium + BOPRestaurantsRestaurantsCoverage.getPremium();
			}
		}
		if(this.BOPRestaurantsSpoilageCoverageList != null && this.BOPRestaurantsSpoilageCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage : BOPRestaurantsSpoilageCoverageList) {
				finalPremium = finalPremium + BOPRestaurantsSpoilageCoverage.getPremium();
			}
		}
		if(this.BOPRestaurantsAdvertisingExpenseCoverageList != null && this.BOPRestaurantsAdvertisingExpenseCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage : BOPRestaurantsAdvertisingExpenseCoverageList) {
				finalPremium = finalPremium + BOPRestaurantsAdvertisingExpenseCoverage.getPremium();
			}
		}
		if(this.BOPRestaurantFoodContaminationCoverageList != null && this.BOPRestaurantFoodContaminationCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage : BOPRestaurantFoodContaminationCoverageList) {
				finalPremium = finalPremium + BOPRestaurantFoodContaminationCoverage.getPremium();
			}
		}
this.BOPRestaurants.setPremium(finalPremium) ;
	  
	}
	
	
	
	
	


	
}