package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOptionalPerPersonMedicalExpensesCoverageClassification  {

	
	
	
	private com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification;
	
	
	
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OptionalPerPersonMedExpnsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void RatingLimitBPP ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit"))) != 0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setRatingLimitBPP((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit"))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setRatingLimitBPP((double)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LimitPerPersonMedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	InclddLimit();
	
	RatingLimitBPP();
	
	FinalRateBPP();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../OptionalMedicalCovLimitPerPerson"))) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../OptionalMedicalCovLimitPerPerson"))) > this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getInclddLimit() && ((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) > (double)0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getFinalRateBPP() * this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getFactor()) * this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getRatingLimitBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../../../../IRPMFactor")))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.getPremium() != (double)0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPOptionalPerPersonMedicalExpensesCoverageClassification (com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification)  {
	  this.BOPOptionalPerPersonMedicalExpensesCoverageClassification = BOPOptionalPerPersonMedicalExpensesCoverageClassification;

	  
	}
	public void FinalRateBPP ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/FinalRate"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/FinalRate"))) != 0.0){
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setFinalRateBPP((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOptionalPerPersonMedicalExpensesCoverageClassification,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/FinalRate"))));
		}
		else{
			this.BOPOptionalPerPersonMedicalExpensesCoverageClassification.setFinalRateBPP((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}