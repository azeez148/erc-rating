package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHigherLimitsLocationDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPHigherLimitsLocationDetail BOPHigherLimitsLocationDetail;
	
	
	
	public void RevisedAmountOfInsurance ()  {
	  
		if(this.BOPHigherLimitsLocationDetail.getDescriptionOfCoverage().equals((String)"Fire Department Service")){
			this.BOPHigherLimitsLocationDetail.setRevisedAmountOfInsurance((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsLocationDetail,"../../BOPLocationFireDeptServiceCoverage/dsLimit"))));
		}
		else{
			this.BOPHigherLimitsLocationDetail.setRevisedAmountOfInsurance((int)0.0);
		}
	  
	}
	public void AdditionalPremium ()  {
	  
		if(this.BOPHigherLimitsLocationDetail.getDescriptionOfCoverage().equals((String)"Fire Department Service")){
			this.BOPHigherLimitsLocationDetail.setAdditionalPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsLocationDetail,"../../BOPLocationFireDeptServiceCoverage/Premium"))));
		}
		else{
			this.BOPHigherLimitsLocationDetail.setAdditionalPremium((double)0.0);
		}
	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	AdditionalPremium();
	
	RevisedAmountOfInsurance();
	
	  
	}
	public  BOPHigherLimitsLocationDetail (com.nest.res.bop.domain.BOPHigherLimitsLocationDetail BOPHigherLimitsLocationDetail)  {
	  this.BOPHigherLimitsLocationDetail = BOPHigherLimitsLocationDetail;

	  
	}
	
	
	
	
	


	
}