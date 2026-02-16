package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability;
	
	
	
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	LimitConverted();
	
	  
	}
	public void LimitConverted ()  {
	  
		if(this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.getNumLimits() != MathHelper.getIntegerValue(0.0)){
			this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.setLimitConverted(MathHelper.getIntegerValue(this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.getNumLimits()));
		}
		else{
			this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.setLimitConverted(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability (com.nest.res.bop.al09012019.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability)  {
	  this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability = BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability;

	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}