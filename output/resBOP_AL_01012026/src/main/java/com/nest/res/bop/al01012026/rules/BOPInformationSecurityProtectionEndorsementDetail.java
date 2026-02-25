package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPInformationSecurityProtectionEndorsementDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	RiskCharacteristicInsuredConductsOnlineTransactionsFactor();
	
	RiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor();
	
	RiskCharacteristicInsuredDoesNotHaveWebsiteFactor();
	
	RiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor();
	
	RiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor();
	
	RiskCharacteristicInsuredCollectsInformationOnMinorsFactor();
	
	RiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor();
	
	RiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor();
	
	RiskCharacteristicInsuredEmploysEncryptionFactor();
	
	RiskCharacteristicHighHazardClassificationsFactor();
	
	RiskCharacteristicTotalFactor();
	
	TierLossCost();
	
	TierRate();
	
	businessIncomeAndExtraExpenseWaitingPeriodHoursNumeric();
	
	WaitingPeriodFactor();
	
	ContractedSecurityBreachServicesFactor();
	
	TierPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ContractedSecurityBreachServicesFactor () throws LookupException,NumberFormatException {
	  
		if((this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesIDT911().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther1Select().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther2Select().equals(MathHelper.getStringValue("Yes"))) && (this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesIDT911().equals(MathHelper.getStringValue("No")) && this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther1Select().equals(MathHelper.getStringValue("No")) && this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther2Select().equals(MathHelper.getStringValue("No")))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PreSecurityBreachServicesContractFactor",String.valueOf( "Y")))));
		}
		else{
		if((this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesIDT911().equals(MathHelper.getStringValue("No")) && this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther1Select().equals(MathHelper.getStringValue("No")) && this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther2Select().equals(MathHelper.getStringValue("No"))) && (this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesIDT911().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther1Select().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther2Select().equals(MathHelper.getStringValue("Yes")))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PostSecurityBreachServicesContractFactor",String.valueOf( "Y")))));
		}
		else{
		if((this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesIDT911().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther1Select().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther2Select().equals(MathHelper.getStringValue("Yes"))) && (this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesIDT911().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther1Select().equals(MathHelper.getStringValue("Yes")) || this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther2Select().equals(MathHelper.getStringValue("Yes")))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PreAndPostSecurityBreachServicesContractFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
		}
	  
	}
	public void TierLossCost () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getCoverageTierSelect().equals(MathHelper.getStringValue("Tier 1"))){
		if(!this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit().equals(MathHelper.getStringValue("")) && !this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InformationSecurityProtectionTier1LossCosts",String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit()),String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible())))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getCoverageTierSelect().equals(MathHelper.getStringValue("Tier 1 and 2"))){
		if(!this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit().equals(MathHelper.getStringValue("")) && !this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InformationSecurityProtectionTier1and2LossCosts",String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit()),String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible())))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getCoverageTierSelect().equals(MathHelper.getStringValue("Tier 1, 2 and 3"))){
		if(!this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit().equals(MathHelper.getStringValue("")) && !this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InformationSecurityProtectionTier1and2and3LossCosts",String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit()),String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible())))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public  BOPInformationSecurityProtectionEndorsementDetail (com.nest.res.bop.al01012026.domain.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail)  {
	  this.BOPInformationSecurityProtectionEndorsementDetail = BOPInformationSecurityProtectionEndorsementDetail;

	  
	}
	public void Premium ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getSupplementalExtendedReportingPeriod().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPInformationSecurityProtectionEndorsementDetail.getTierPremium() + this.BOPInformationSecurityProtectionEndorsementDetail.getSupplementalExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../IRPMFactor"))))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPInformationSecurityProtectionEndorsementDetail.getTierPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../IRPMFactor"))))));
		}
	  
	}
	public void TierRate ()  {
	  this.BOPInformationSecurityProtectionEndorsementDetail.setTierRate(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPInformationSecurityProtectionEndorsementDetail.getTierLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../LCM"))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsDataRequiredToBeProtected().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredCollectsDataRequiredByLawToBeProtectedFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecks().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusiness().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredEmploysEncryptionFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredEmploysEncryption().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredEmploysEncryptionFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredEmploysEncryptionInCustomerCommunicationsFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredEmploysEncryptionFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredHasActiveSocialMediaProfiles().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredConductsOnlineTransactionsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredConductsOnlineTransactions().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredConductsOnlineTransactionsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredConductsOnlineTransactionsFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredConductsOnlineTransactionsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void RiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicRemoteAccessToInsuredsComputerSystem().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicRemoteAccessToInsuredsComputerSystemsFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicHighHazardClassificationsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicHighHazardClassifications().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicHighHazardClassificationsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicrHighHazardClassificationsFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicHighHazardClassificationsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getSupplementalExtendedReportingPeriod().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPInformationSecurityProtectionEndorsementDetail.getTierPremium() + this.BOPInformationSecurityProtectionEndorsementDetail.getSupplementalExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../IRPMFactor"))))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPInformationSecurityProtectionEndorsementDetail.getTierPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../IRPMFactor"))))));
		}
	  
	}
	public void WaitingPeriodFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHours().equals(MathHelper.getStringValue("8"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setWaitingPeriodFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WaitingPeriodFactor",String.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHoursNumeric())))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setWaitingPeriodFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void RiskCharacteristicInsuredCollectsInformationOnMinorsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsInformationOnMinors().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsInformationOnMinorsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredCollectsAndRetainsInformationOnMinorsFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsInformationOnMinorsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TierPremium ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getIncludeRiskCharacteristics().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPInformationSecurityProtectionEndorsementDetail.getTierRate() * this.BOPInformationSecurityProtectionEndorsementDetail.getWaitingPeriodFactor()) * this.BOPInformationSecurityProtectionEndorsementDetail.getContractedSecurityBreachServicesFactor()) * this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicTotalFactor()))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPInformationSecurityProtectionEndorsementDetail.getTierRate() * this.BOPInformationSecurityProtectionEndorsementDetail.getWaitingPeriodFactor()) * this.BOPInformationSecurityProtectionEndorsementDetail.getContractedSecurityBreachServicesFactor()))));
		}
	  
	}
	public void businessIncomeAndExtraExpenseWaitingPeriodHoursNumeric ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHours().equals(MathHelper.getStringValue("8"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setBusinessIncomeAndExtraExpenseWaitingPeriodHoursNumeric(MathHelper.getIntegerValue(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHours()));
		}
	  
	}
	public void RiskCharacteristicInsuredDoesNotHaveWebsiteFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredDoesNotHaveWebsite().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredDoesNotHaveWebsiteFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredDoesNotHaveWebsiteFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredDoesNotHaveWebsiteFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RiskCharacteristicTotalFactor ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getIncludeRiskCharacteristics().equals(MathHelper.getStringValue("Yes"))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicTotalFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredConductsOnlineTransactionsFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredDoesNotHaveWebsiteFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsInformationOnMinorsFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredEmploysEncryptionFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicHighHazardClassificationsFactor()) + MathHelper.getDoubleValue(1.0))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicTotalFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	
	
	
	
	


	
}