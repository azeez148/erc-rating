package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroOptionalPerPersonMedicalExpensesCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroOptionalPerPersonMedicalExpensesCoverage BOPMicroOptionalPerPersonMedicalExpensesCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroPerPersonMedicalExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getDsLimit() != MathHelper.getIntegerValue(0.0) && this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getDsLimit() > this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getIncludedLimit() && (XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/LossCost"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../MicroLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/LiabilityHazardGroupFactor")))) * this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPMicroOptionalPerPersonMedicalExpensesCoverage (com.nest.res.bop.al01012026.domain.BOPMicroOptionalPerPersonMedicalExpensesCoverage BOPMicroOptionalPerPersonMedicalExpensesCoverage)  {
	  this.BOPMicroOptionalPerPersonMedicalExpensesCoverage = BOPMicroOptionalPerPersonMedicalExpensesCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncludedLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getDsLimit() != MathHelper.getIntegerValue(0.0) && this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getDsLimit() > this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getIncludedLimit() && (XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/LossCost"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../MicroLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/LiabilityHazardGroupFactor")))) * this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void IncludedLimit () throws LookupException,NumberFormatException {
	  this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setIncludedLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MicroOptionalPerPersonMedicalExpensesIncludedLimit",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroOptionalPerPersonMedicalExpensesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}