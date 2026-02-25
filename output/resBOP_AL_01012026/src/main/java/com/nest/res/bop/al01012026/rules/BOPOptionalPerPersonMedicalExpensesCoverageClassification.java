package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOptionalPerPersonMedicalExpensesCoverageClassification  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification;
	
	
	
	public  BOPOptionalPerPersonMedicalExpensesCoverageClassification (com.nest.res.bop.al01012026.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification)  {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification = BOPOptionalPerPersonMedicalExpensesCoverageClassification;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../OptionalMedicalCovLimitPerPerson")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../OptionalMedicalCovLimitPerPerson"))) > this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getInclddLimit() && (XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getFinalRateBPP() * this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getFactor()) * this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getRatingLimitBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RatingLimitBPP ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit"))) != 0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setRatingLimitBPP(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit")))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setRatingLimitBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OptionalPerPersonMedExpnsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../OptionalMedicalCovLimitPerPerson")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../OptionalMedicalCovLimitPerPerson"))) > this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getInclddLimit() && (XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getFinalRateBPP() * this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getFactor()) * this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getRatingLimitBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LimitPerPersonMedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	InclddLimit();
	
	RatingLimitBPP();
	
	FinalRateBPP();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void FinalRateBPP ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/FinalRate")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/FinalRate"))) != 0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setFinalRateBPP(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/FinalRate")))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setFinalRateBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}