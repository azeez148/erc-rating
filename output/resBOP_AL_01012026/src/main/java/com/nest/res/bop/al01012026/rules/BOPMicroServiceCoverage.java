package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroServiceCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroServiceCoverage BOPMicroServiceCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPMicroServiceCoverage (com.nest.res.bop.al01012026.domain.BOPMicroServiceCoverage BOPMicroServiceCoverage)  {
	  this.BOPMicroServiceCoverage = BOPMicroServiceCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroServiceCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../MicroLCM")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../BOPMicroServiceTheftCoverage/TheftPremium"))) + this.BOPMicroServiceCoverage.getAnimalsPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroServiceCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroServiceCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroServiceCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPMicroServiceCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroServiceCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../MicroLCM")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../BOPMicroServiceTheftCoverage/TheftPremium"))) + this.BOPMicroServiceCoverage.getAnimalsPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPMicroServiceCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void LossCost () throws LookupException,NumberFormatException {
	  this.BOPMicroServiceCoverage.setLossCost(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroServiceEndorsementLossCost",String.valueOf( "Y"))));

	  
	}
	public void AnimalsPremium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription"))).equals(MathHelper.getStringValue(""))){
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription"))).equals(MathHelper.getStringValue("Aquarium Cleaning Services")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription"))).equals(MathHelper.getStringValue("Pet Grooming")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription"))).equals(MathHelper.getStringValue("Pet Walking and Sitting"))) && (XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)){
			this.BOPMicroServiceCoverage.setAnimalsPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/LossCost"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../MicroLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/BOPMicroClassificationLiabMedExpensesCoverage/LiabilityHazardGroupFactor")))) * this.BOPMicroServiceCoverage.getAnimalsFactor())));
		}
		else{
			this.BOPMicroServiceCoverage.setAnimalsPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPMicroServiceCoverage.setAnimalsPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LossCost();
	
	AnimalsFactor();
	
	AnimalsPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void AnimalsFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassCode")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassCode"))).equals(MathHelper.getStringValue("")) && (XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription"))).equals(MathHelper.getStringValue("")) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassCode"))).equals(MathHelper.getStringValue("78403")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassCode"))).equals(MathHelper.getStringValue("78462")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassCode"))).equals(MathHelper.getStringValue("78466")))){
			this.BOPMicroServiceCoverage.setAnimalsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroAnimalsFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassCode")),String.valueOf(XpathNode.selectNodeValue(this.BOPMicroServiceCoverage,"../../BOPMicroLocation/BOPMicroClassification/ClassDescription"))))));
		}
		else{
			this.BOPMicroServiceCoverage.setAnimalsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	
	
	
	
	


	
}