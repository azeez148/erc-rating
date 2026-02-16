package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability  {

	
	
	
	private com.nest.res.bop.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability;
	
	
	
	public void LimitConverted ()  {
	  
		if(this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.getNumLimits() != (int)0.0){
			this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.setLimitConverted(this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.getNumLimits());
		}
		else{
			this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.setLimitConverted((int)0.0);
		}
	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public  BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability (com.nest.res.bop.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability)  {
	  this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability = BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability;

	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	LimitConverted();
	
	  
	}
	
	
	
	
	


	
}