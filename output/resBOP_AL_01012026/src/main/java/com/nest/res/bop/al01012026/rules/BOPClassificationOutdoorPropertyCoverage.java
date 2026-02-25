package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationOutdoorPropertyCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
			this.BOPClassificationOutdoorPropertyCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPClassificationOutdoorPropertyCoverage.getFactor() * this.BOPClassificationOutdoorPropertyCoverage.getClassFinalBusnPrsnlPropRate_1()) * MathHelper.getDoubleValue(this.BOPClassificationOutdoorPropertyCoverage.getRatingLimit())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPClassificationOutdoorPropertyCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage)  {
	  this.BOPClassificationOutdoorPropertyCoverage = BOPClassificationOutdoorPropertyCoverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationOutdoorPropertyCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OutdoorPropertyFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	classFinalBusnPrsnlPropRate_1();
	
	RatingLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void classFinalBusnPrsnlPropRate_1 ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
		if((XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../FinalBusnPrsnlPropRate")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../FinalBusnPrsnlPropRate"))) != 0.0){
			this.BOPClassificationOutdoorPropertyCoverage.setClassFinalBusnPrsnlPropRate_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../FinalBusnPrsnlPropRate")))));
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setClassFinalBusnPrsnlPropRate_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationOutdoorPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPClassificationOutdoorPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void RatingLimit ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
			this.BOPClassificationOutdoorPropertyCoverage.setRatingLimit(MathHelper.getIntegerValue((this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() - this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()) / MathHelper.getIntegerValue(100.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationOutdoorPropertyCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OutdoorPropertyCoverageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
			this.BOPClassificationOutdoorPropertyCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPClassificationOutdoorPropertyCoverage.getFactor() * this.BOPClassificationOutdoorPropertyCoverage.getClassFinalBusnPrsnlPropRate_1()) * MathHelper.getDoubleValue(this.BOPClassificationOutdoorPropertyCoverage.getRatingLimit())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}