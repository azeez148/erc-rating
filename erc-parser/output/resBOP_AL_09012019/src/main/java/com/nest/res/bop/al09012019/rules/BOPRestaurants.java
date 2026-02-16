package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPRestaurantsRestaurantsCoverage;
import com.nest.res.bop.al09012019.domain.BOPRestaurantsSpoilageCoverage;
import com.nest.res.bop.al09012019.domain.BOPRestaurantsAdvertisingExpenseCoverage;
import com.nest.res.bop.al09012019.domain.BOPRestaurantFoodContaminationCoverage;

public class BOPRestaurants  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverageRule;
	private List<BOPRestaurantsRestaurantsCoverage> BOPRestaurantsRestaurantsCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverageRule;
	private List<BOPRestaurantsSpoilageCoverage> BOPRestaurantsSpoilageCoverageList;
	private com.nest.res.bop.al09012019.domain.BOPRestaurants BOPRestaurants;
	private List<BOPRestaurantsAdvertisingExpenseCoverage> BOPRestaurantsAdvertisingExpenseCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverageRule;
	private List<BOPRestaurantFoodContaminationCoverage> BOPRestaurantFoodContaminationCoverageList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPRestaurants.setPremium(MathHelper.getDoubleValue(this.BOPRestaurants.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurants,"BOPRestaurantFoodContaminationCoverage/Premium")))));
this.BOPRestaurants.setPremium(MathHelper.getDoubleValue(this.BOPRestaurants.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurants,"BOPRestaurantsAdvertisingExpenseCoverage/Premium")))));
this.BOPRestaurants.setPremium(MathHelper.getDoubleValue(this.BOPRestaurants.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurants,"BOPRestaurantsRestaurantsCoverage/Premium")))));
this.BOPRestaurants.setPremium(MathHelper.getDoubleValue(this.BOPRestaurants.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPRestaurants,"BOPRestaurantsSpoilageCoverage/Premium")))));

	  
	}
	public  BOPRestaurants (com.nest.res.bop.al09012019.domain.BOPRestaurants BOPRestaurants)  {
	  this.BOPRestaurants = BOPRestaurants;
this.BOPRestaurantsRestaurantsCoverageList = BOPRestaurants.getBOPRestaurantsRestaurantsCoverage();
this.BOPRestaurantsSpoilageCoverageList = BOPRestaurants.getBOPRestaurantsSpoilageCoverage();
this.BOPRestaurantsAdvertisingExpenseCoverageList = BOPRestaurants.getBOPRestaurantsAdvertisingExpenseCoverage();
this.BOPRestaurantFoodContaminationCoverageList = BOPRestaurants.getBOPRestaurantFoodContaminationCoverage();

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	if(null != BOPRestaurantFoodContaminationCoverageList){
		for(BOPRestaurantFoodContaminationCoverage BOPRestaurantFoodContaminationCoverage:BOPRestaurantFoodContaminationCoverageList){
			BOPRestaurantFoodContaminationCoverageRule = new com.nest.res.bop.al09012019.rules.BOPRestaurantFoodContaminationCoverage(BOPRestaurantFoodContaminationCoverage);
			BOPRestaurantFoodContaminationCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsAdvertisingExpenseCoverageList){
		for(BOPRestaurantsAdvertisingExpenseCoverage BOPRestaurantsAdvertisingExpenseCoverage:BOPRestaurantsAdvertisingExpenseCoverageList){
			BOPRestaurantsAdvertisingExpenseCoverageRule = new com.nest.res.bop.al09012019.rules.BOPRestaurantsAdvertisingExpenseCoverage(BOPRestaurantsAdvertisingExpenseCoverage);
			BOPRestaurantsAdvertisingExpenseCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsRestaurantsCoverageList){
		for(BOPRestaurantsRestaurantsCoverage BOPRestaurantsRestaurantsCoverage:BOPRestaurantsRestaurantsCoverageList){
			BOPRestaurantsRestaurantsCoverageRule = new com.nest.res.bop.al09012019.rules.BOPRestaurantsRestaurantsCoverage(BOPRestaurantsRestaurantsCoverage);
			BOPRestaurantsRestaurantsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsSpoilageCoverageList){
		for(BOPRestaurantsSpoilageCoverage BOPRestaurantsSpoilageCoverage:BOPRestaurantsSpoilageCoverageList){
			BOPRestaurantsSpoilageCoverageRule = new com.nest.res.bop.al09012019.rules.BOPRestaurantsSpoilageCoverage(BOPRestaurantsSpoilageCoverage);
			BOPRestaurantsSpoilageCoverageRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}