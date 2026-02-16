package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage;
	
	
	
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) != 0.0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/CoverageTierSelect"))).equals((String)"Tier 1 and 2") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/CoverageTierSelect"))).equals((String)"Tier 1, 2 and 3")){
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../BOPInformationSecurityProtectionEndorsement/BOPInformationSecurityProtectionEndorsementDetail/TierPremium"))) * this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.getFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage,"../IRPMFactor")))));
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium((double)0.0);
		}
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremium((double)0.0);
		}
	  
	}
	public  BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage (com.nest.res.bop.domain.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage)  {
	  this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage = BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.getPremium() != (double)0.0){
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PaymentCardIndustryCoverageFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}