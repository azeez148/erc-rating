package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPHigherLimitsLocationDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPHigherLimitsLocationDetail BOPHigherLimitsLocationDetail;
	
	
	
	public void AdditionalPremium ()  {
	  
		if(this.BOPHigherLimitsLocationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Fire Department Service"))){
			this.BOPHigherLimitsLocationDetail.setAdditionalPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPHigherLimitsLocationDetail,"../../BOPLocationFireDeptServiceCoverage/Premium")))));
		}
		else{
			this.BOPHigherLimitsLocationDetail.setAdditionalPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CommonRating1 ()  {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public  BOPHigherLimitsLocationDetail (com.nest.res.bop.al09012019.domain.BOPHigherLimitsLocationDetail BOPHigherLimitsLocationDetail)  {
	  this.BOPHigherLimitsLocationDetail = BOPHigherLimitsLocationDetail;

	  
	}
	public void RevisedAmountOfInsurance ()  {
	  
		if(this.BOPHigherLimitsLocationDetail.getDescriptionOfCoverage().equals(MathHelper.getStringValue("Fire Department Service"))){
			this.BOPHigherLimitsLocationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPHigherLimitsLocationDetail,"../../BOPLocationFireDeptServiceCoverage/dsLimit")))));
		}
		else{
			this.BOPHigherLimitsLocationDetail.setRevisedAmountOfInsurance(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	AdditionalPremium();
	
	RevisedAmountOfInsurance();
	
	  
	}
	
	
	
	
	


	
}