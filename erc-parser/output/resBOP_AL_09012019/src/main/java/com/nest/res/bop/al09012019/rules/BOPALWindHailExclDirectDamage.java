package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPALWindHailExclDirectDamage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage;
	
	
	
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public  BOPALWindHailExclDirectDamage (com.nest.res.bop.al09012019.domain.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage)  {
	  this.BOPALWindHailExclDirectDamage = BOPALWindHailExclDirectDamage;

	  
	}
	public void BldgCreditFactor () throws LookupException,NumberFormatException {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals(MathHelper.getStringValue("005"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals(MathHelper.getStringValue("006")))){
			this.BOPALWindHailExclDirectDamage.setBldgCreditFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailExclDirectDamageBldgCreditFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))))));
		}
		else{
			this.BOPALWindHailExclDirectDamage.setBldgCreditFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	BldgCreditFactor();
	
	BusnPrsnlPropCreditFactor();
	
	  
	}
	public void BusnPrsnlPropCreditFactor () throws LookupException,NumberFormatException {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals(MathHelper.getStringValue("005"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))).equals(MathHelper.getStringValue("006")))){
			this.BOPALWindHailExclDirectDamage.setBusnPrsnlPropCreditFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailExclDirectDamageBusnPrsnlPropCreditFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPALWindHailExclDirectDamage,"../../RatingTerritory"))))));
		}
		else{
			this.BOPALWindHailExclDirectDamage.setBusnPrsnlPropCreditFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}