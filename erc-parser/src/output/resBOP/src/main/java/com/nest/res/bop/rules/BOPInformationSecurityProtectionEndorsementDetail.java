package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPInformationSecurityProtectionEndorsementDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail;
	
	
	
	public void TierRate ()  {
	  this.BOPInformationSecurityProtectionEndorsementDetail.setTierRate(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPInformationSecurityProtectionEndorsementDetail.getTierLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../LCM"))))));

	  
	}
	public void RiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusiness().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor((double)0.0);
		}
	  
	}
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
	public void RiskCharacteristicInsuredDoesNotHaveWebsiteFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredDoesNotHaveWebsite().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredDoesNotHaveWebsiteFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredDoesNotHaveWebsiteFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredDoesNotHaveWebsiteFactor((double)0.0);
		}
	  
	}
	public void RiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredHasActiveSocialMediaProfiles().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor((double)0.0);
		}
	  
	}
	public void RiskCharacteristicTotalFactor ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getIncludeRiskCharacteristics().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicTotalFactor((this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredConductsOnlineTransactionsFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredDoesNotHaveWebsiteFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredHasActiveSocialMediaProfilesFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsInformationOnMinorsFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesMedicalRecordsInDailyBusinessFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredEmploysEncryptionFactor() + this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicHighHazardClassificationsFactor()) + (double)1.0);
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicTotalFactor((double)1.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getPremium() != (double)0.0){
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void RiskCharacteristicInsuredCollectsInformationOnMinorsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsInformationOnMinors().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsInformationOnMinorsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredCollectsAndRetainsInformationOnMinorsFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsInformationOnMinorsFactor((double)0.0);
		}
	  
	}
	public  BOPInformationSecurityProtectionEndorsementDetail (com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsementDetail BOPInformationSecurityProtectionEndorsementDetail)  {
	  this.BOPInformationSecurityProtectionEndorsementDetail = BOPInformationSecurityProtectionEndorsementDetail;

	  
	}
	public void RiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicRemoteAccessToInsuredsComputerSystem().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicRemoteAccessToInsuredsComputerSystemsFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicRemoteAccessToInsuredsComputerSystemFactor((double)0.0);
		}
	  
	}
	public void RiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecks().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredUtilizesBackgroundAndCreditChecksFactor((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getSupplementalExtendedReportingPeriod().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremium(MathHelper.roundUpDoller((this.BOPInformationSecurityProtectionEndorsementDetail.getTierPremium() + this.BOPInformationSecurityProtectionEndorsementDetail.getSupplementalExtendedReportingPeriodPremium()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../IRPMFactor")))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setPremium(MathHelper.roundUpDoller(this.BOPInformationSecurityProtectionEndorsementDetail.getTierPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInformationSecurityProtectionEndorsementDetail,"../../IRPMFactor")))));
		}
	  
	}
	public void TierPremium ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getIncludeRiskCharacteristics().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPInformationSecurityProtectionEndorsementDetail.getTierRate() * this.BOPInformationSecurityProtectionEndorsementDetail.getWaitingPeriodFactor()) * this.BOPInformationSecurityProtectionEndorsementDetail.getContractedSecurityBreachServicesFactor()) * this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicTotalFactor())));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPInformationSecurityProtectionEndorsementDetail.getTierRate() * this.BOPInformationSecurityProtectionEndorsementDetail.getWaitingPeriodFactor()) * this.BOPInformationSecurityProtectionEndorsementDetail.getContractedSecurityBreachServicesFactor())));
		}
	  
	}
	public void RiskCharacteristicHighHazardClassificationsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicHighHazardClassifications().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicHighHazardClassificationsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicrHighHazardClassificationsFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicHighHazardClassificationsFactor((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void TierLossCost () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getCoverageTierSelect().equals((String)"Tier 1")){
		if(!this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit().equals((String)"") && !this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible().equals((String)"")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InformationSecurityProtectionTier1LossCosts",String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit()),String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getDeductible()))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost((double)0.0);
		}
		}
		else{
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getCoverageTierSelect().equals((String)"Tier 1 and 2")){
		if(!this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit().equals((String)"") && !this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible().equals((String)"")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InformationSecurityProtectionTier1and2LossCosts",String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit()),String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getDeductible()))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost((double)0.0);
		}
		}
		else{
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getCoverageTierSelect().equals((String)"Tier 1, 2 and 3")){
		if(!this.BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit().equals((String)"") && !this.BOPInformationSecurityProtectionEndorsementDetail.getDeductible().equals((String)"")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InformationSecurityProtectionTier1and2and3LossCosts",String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getAggregateLimit()),String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getDeductible()))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost((double)0.0);
		}
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setTierLossCost((double)0.0);
		}
		}
		}
	  
	}
	public void RiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredCollectsDataRequiredToBeProtected().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredCollectsDataRequiredByLawToBeProtectedFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredCollectsDataRequiredToBeProtectedFactor((double)0.0);
		}
	  
	}
	public void RiskCharacteristicInsuredEmploysEncryptionFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredEmploysEncryption().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredEmploysEncryptionFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredEmploysEncryptionInCustomerCommunicationsFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredEmploysEncryptionFactor((double)0.0);
		}
	  
	}
	public void ContractedSecurityBreachServicesFactor () throws LookupException,NumberFormatException {
	  
		if((this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesIDT911().equals((String)"Yes") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther1().equals((String)"") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther2().equals((String)"")) && (this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesIDT911().equals((String)"No") && this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther1().equals((String)"") && this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther2().equals((String)""))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PreSecurityBreachServicesContractFactor",String.valueOf( "Y"))));
		}
		else{
		if((this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesIDT911().equals((String)"No") && this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther1().equals((String)"") && this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther2().equals((String)"")) && (this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesIDT911().equals((String)"Yes") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther1().equals((String)"") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther2().equals((String)""))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PostSecurityBreachServicesContractFactor",String.valueOf( "Y"))));
		}
		else{
		if((this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesIDT911().equals((String)"Yes") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther1().equals((String)"") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPreSecurityBreachServicesOther2().equals((String)"")) && (this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesIDT911().equals((String)"Yes") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther1().equals((String)"") || !this.BOPInformationSecurityProtectionEndorsementDetail.getPostSecurityBreachServicesOther2().equals((String)""))){
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PreAndPostSecurityBreachServicesContractFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setContractedSecurityBreachServicesFactor((double)1.0);
		}
		}
		}
	  
	}
	public void businessIncomeAndExtraExpenseWaitingPeriodHoursNumeric ()  {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHours().equals((String)"8")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setBusinessIncomeAndExtraExpenseWaitingPeriodHoursNumeric(Integer.valueOf(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHours()));
		}
	  
	}
	public void RiskCharacteristicInsuredConductsOnlineTransactionsFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getRiskCharacteristicInsuredConductsOnlineTransactions().equals((String)"Yes")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredConductsOnlineTransactionsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RiskCharacteristicInsuredConductsOnlineTransactionsFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setRiskCharacteristicInsuredConductsOnlineTransactionsFactor((double)0.0);
		}
	  
	}
	public void WaitingPeriodFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHours().equals((String)"8")){
			this.BOPInformationSecurityProtectionEndorsementDetail.setWaitingPeriodFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WaitingPeriodFactor",String.valueOf(BOPInformationSecurityProtectionEndorsementDetail.getBusinessIncomeAndExtraExpenseWaitingPeriodHoursNumeric()))));
		}
		else{
			this.BOPInformationSecurityProtectionEndorsementDetail.setWaitingPeriodFactor((double)1.0);
		}
	  
	}
	
	
	
	
	


	
}