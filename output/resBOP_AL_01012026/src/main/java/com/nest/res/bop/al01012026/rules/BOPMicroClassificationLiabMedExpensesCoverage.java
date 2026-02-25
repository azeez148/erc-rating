package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroClassificationLiabMedExpensesCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroClassificationLiabMedExpensesCoverage BOPMicroClassificationLiabMedExpensesCoverage;
	
	
	
	public void LossCost () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../RatingGroup")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../RatingGroup"))).equals(MathHelper.getStringValue("")) && (XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroPerOccurrenceLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroPerOccurrenceLimit"))).equals(MathHelper.getStringValue("")) && (XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroAggregateLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroAggregateLimit"))).equals(MathHelper.getStringValue("")) && (XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroAnnualGrossSalesRange")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroAnnualGrossSalesRange"))).equals(MathHelper.getStringValue(""))){
			this.BOPMicroClassificationLiabMedExpensesCoverage.setLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroLiabilityAndMedicalExpensesLossCosts",String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../RatingGroup")),String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroPerOccurrenceLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroAggregateLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../MicroAnnualGrossSalesRange"))))));
		}
		else{
			this.BOPMicroClassificationLiabMedExpensesCoverage.setLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPMicroClassificationLiabMedExpensesCoverage (com.nest.res.bop.al01012026.domain.BOPMicroClassificationLiabMedExpensesCoverage BOPMicroClassificationLiabMedExpensesCoverage)  {
	  this.BOPMicroClassificationLiabMedExpensesCoverage = BOPMicroClassificationLiabMedExpensesCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPMicroClassificationLiabMedExpensesCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroClassificationLiabMedExpensesCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../MicroLCM")))) * this.BOPMicroClassificationLiabMedExpensesCoverage.getLiabilityHazardGroupFactor() * this.BOPMicroClassificationLiabMedExpensesCoverage.getArtisanSalesFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPMicroClassificationLiabMedExpensesCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroClassificationLiabMedExpensesCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroClassificationLiabMedExpensesCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../MicroLCM")))) * this.BOPMicroClassificationLiabMedExpensesCoverage.getLiabilityHazardGroupFactor() * this.BOPMicroClassificationLiabMedExpensesCoverage.getArtisanSalesFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroClassificationLiabMedExpensesCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroClassificationLiabMedExpensesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroClassificationLiabMedExpensesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LossCost();
	
	LiabilityHazardGroupFactor();
	
	ArtisanSalesFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void LiabilityHazardGroupFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../LiabilityHazardGroup")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../LiabilityHazardGroup"))).equals(MathHelper.getStringValue(""))){
			this.BOPMicroClassificationLiabMedExpensesCoverage.setLiabilityHazardGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroLiabilityHazardGroupFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../LiabilityHazardGroup"))))));
		}
		else{
			this.BOPMicroClassificationLiabMedExpensesCoverage.setLiabilityHazardGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void ArtisanSalesFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../ArtisanSales")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../ArtisanSales"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroClassificationLiabMedExpensesCoverage,"../ArtisanSales"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPMicroClassificationLiabMedExpensesCoverage.setArtisanSalesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroArtisanManufacturingOnlineSalesFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPMicroClassificationLiabMedExpensesCoverage.setArtisanSalesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	
	
	
	
	


	
}