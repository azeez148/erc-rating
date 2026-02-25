package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != 0.0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/CoverageTierSelect"))).equals(MathHelper.getStringValue("Tier 1 and 2")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/CoverageTierSelect"))).equals(MathHelper.getStringValue("Tier 1, 2 and 3"))){
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) * this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PaymentCardIndustryCoverageFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage (com.nest.res.bop.al01012026.domain.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage)  {
	  this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage = BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != 0.0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/CoverageTierSelect"))).equals(MathHelper.getStringValue("Tier 1 and 2")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/CoverageTierSelect"))).equals(MathHelper.getStringValue("Tier 1, 2 and 3"))){
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) * this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}