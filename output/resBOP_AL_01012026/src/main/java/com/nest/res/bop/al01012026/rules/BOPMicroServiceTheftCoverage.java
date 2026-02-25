package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroServiceTheftCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroServiceTheftCoverage BOPMicroServiceTheftCoverage;
	
	
	
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	PropertyOfOthersTheftFactor();
	
	TheftPremium();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPMicroServiceTheftCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPMicroServiceTheftCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPMicroServiceTheftCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void PropertyOfOthersTheftFactor () throws LookupException,NumberFormatException {
	  this.BOPMicroServiceTheftCoverage.setPropertyOfOthersTheftFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroPropertyOfOthersTheftFactor",String.valueOf( "Y"))));

	  
	}
	public void TheftPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroServiceTheftCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationBusnPrsnlPropCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceTheftCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationBusnPrsnlPropCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPMicroServiceTheftCoverage.setTheftPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceTheftCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationBusnPrsnlPropCoverage/Premium"))) * this.BOPMicroServiceTheftCoverage.getPropertyOfOthersTheftFactor())));
		}
		else{
			this.BOPMicroServiceTheftCoverage.setTheftPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPMicroServiceTheftCoverage (com.nest.res.bop.al01012026.domain.BOPMicroServiceTheftCoverage BOPMicroServiceTheftCoverage)  {
	  this.BOPMicroServiceTheftCoverage = BOPMicroServiceTheftCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}