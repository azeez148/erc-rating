package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroProfessionalLiability  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroProfessionalLiability BOPMicroProfessionalLiability;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroProfessionalLiability.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroProfessionalLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroProfessionalLiability.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPMicroProfessionalLiability (com.nest.res.bop.al01012026.domain.BOPMicroProfessionalLiability BOPMicroProfessionalLiability)  {
	  this.BOPMicroProfessionalLiability = BOPMicroProfessionalLiability;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroProfessionalLiability.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroProfessionalLiability.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../MicroLCM")))) * this.BOPMicroProfessionalLiability.getHazardGroupFactor()) + this.BOPMicroProfessionalLiability.getSupplementalExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void LossCost () throws LookupException,NumberFormatException {
	  
		if(!this.BOPMicroProfessionalLiability.getAggregateLimitOfInsurance().equals(MathHelper.getStringValue("")) && !this.BOPMicroProfessionalLiability.getDeductibleAmountPerClaim().equals(MathHelper.getStringValue("")) && (XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../MicroAnnualGrossSalesRange")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../MicroAnnualGrossSalesRange"))).equals(MathHelper.getStringValue(""))){
			this.BOPMicroProfessionalLiability.setLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroProfessionalLiabilityEndorsementLossCosts",String.valueOf(this.BOPMicroProfessionalLiability.getAggregateLimitOfInsurance()),String.valueOf(this.BOPMicroProfessionalLiability.getAggregateLimitOfInsurance()),String.valueOf(this.BOPMicroProfessionalLiability.getDeductibleAmountPerClaim()),String.valueOf(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../MicroAnnualGrossSalesRange"))))));
		}
		else{
			this.BOPMicroProfessionalLiability.setLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void HazardGroupFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../BOPMicroLocation/BOPMicroClassification/ProfessionalLiabilityHazardGroup")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../BOPMicroLocation/BOPMicroClassification/ProfessionalLiabilityHazardGroup"))).equals(MathHelper.getStringValue(""))){
			this.BOPMicroProfessionalLiability.setHazardGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroProfessionalLiabilityHazardGroupFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../BOPMicroLocation/BOPMicroClassification/ProfessionalLiabilityHazardGroup"))))));
		}
		else{
			this.BOPMicroProfessionalLiability.setHazardGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPMicroProfessionalLiability.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroProfessionalLiability.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../MicroLCM")))) * this.BOPMicroProfessionalLiability.getHazardGroupFactor()) + this.BOPMicroProfessionalLiability.getSupplementalExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LossCost();
	
	HazardGroupFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ValidationCheckPremium ()  {
	  this.BOPMicroProfessionalLiability.setValidationCheckPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroProfessionalLiability.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroProfessionalLiability,"../MicroLCM")))) * this.BOPMicroProfessionalLiability.getHazardGroupFactor()));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	LossCost();
	
	HazardGroupFactor();
	
	ValidationCheckPremium();
	
	  
	}
	
	
	
	
	


	
}