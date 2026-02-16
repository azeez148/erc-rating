package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPALWindHailExclDirectDamage  {

	
	
	
	private com.nest.res.bop.domain.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage;
	
	
	
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void BusnPrsnlPropCreditFactor () throws LookupException,NumberFormatException {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals((String)"005")) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals((String)"006"))){
			this.BOPALWindHailExclDirectDamage.setBusnPrsnlPropCreditFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailExclDirectDamageBusnPrsnlPropCreditFactor",((String)XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage," ../../RatingTerritory")))));
		}
		else{
			this.BOPALWindHailExclDirectDamage.setBusnPrsnlPropCreditFactor((double)0.0);
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	BldgCreditFactor();
	
	BusnPrsnlPropCreditFactor();
	
	  
	}
	public void BldgCreditFactor () throws LookupException,NumberFormatException {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals((String)"005")) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals((String)"006"))){
			this.BOPALWindHailExclDirectDamage.setBldgCreditFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailExclDirectDamageBldgCreditFactor",((String)XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage," ../../RatingTerritory")))));
		}
		else{
			this.BOPALWindHailExclDirectDamage.setBldgCreditFactor((double)0.0);
		}
	  
	}
	public  BOPALWindHailExclDirectDamage (com.nest.res.bop.domain.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage)  {
	  this.BOPALWindHailExclDirectDamage = BOPALWindHailExclDirectDamage;

	  
	}
	
	
	
	
	


	
}