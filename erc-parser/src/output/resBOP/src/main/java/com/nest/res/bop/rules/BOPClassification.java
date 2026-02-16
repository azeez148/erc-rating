package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPResidentialCleaningServices;
import com.nest.res.bop.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;
import com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalCovs;
import com.nest.res.bop.domain.BOPFoodContamination;
import com.nest.res.bop.domain.BOPNamedPerilsBusnPrsnlProp;
import com.nest.res.bop.domain.BOPClassificationOutdoorPropertyCoverage;
import com.nest.res.bop.domain.BOPBrandsAndLabels;
import com.nest.res.bop.domain.BOPSelfStorageFacilities;
import com.nest.res.bop.domain.BOPUtilitySrvcsTimeElement;
import com.nest.res.bop.domain.BOPMotelLiabGuestsProp;
import com.nest.res.bop.domain.BOPMedExpensesExcl;
import com.nest.res.bop.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;
import com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;
import com.nest.res.bop.domain.BOPSpoilgCov;
import com.nest.res.bop.domain.BOPClassificationBusnPrsnlPropCoverage;
import com.nest.res.bop.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;
import com.nest.res.bop.domain.BOPTheftLimitationsCoverage;
import com.nest.res.bop.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
import com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamage;
import com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtn;
import com.nest.res.bop.domain.BOPClassificationValuablePapersCoverage;
import com.nest.res.bop.domain.BOPClassificationPermanentYardsStorageCoverage;
import com.nest.res.bop.domain.BOPClassificationBusnIncomeDependentPropCoverage;
import com.nest.res.bop.domain.BOPClassificationPlaygroundCoverage;
import com.nest.res.bop.domain.BOPClassificationSwimmingPoolCoverage;
import com.nest.res.bop.domain.BOPElectronicDataLiabilityLimitedCov;
import com.nest.res.bop.domain.BOPElectronicDataLiabilityBroadCov;
import com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification;
import com.nest.res.bop.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov;
import com.nest.res.bop.domain.BOPMotels;
import com.nest.res.bop.domain.BOPClassificationAmusementAreaCoverage;
import com.nest.res.bop.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin;
import com.nest.res.bop.domain.BOPClassificationAccountsReceivableCoverage;
import com.nest.res.bop.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;

public class BOPClassification  {

	
	
	
	private com.nest.res.bop.rules.BOPMotels BOPMotelsRule;
	private com.nest.res.bop.rules.BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElementRule;
	private com.nest.res.bop.rules.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverageRule;
	private List<BOPResidentialCleaningServices> BOPResidentialCleaningServicesList;
	private com.nest.res.bop.rules.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule;
	private com.nest.res.bop.rules.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCovRule;
	private List<BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd> BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList;
	private com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtnRule;
	private List<BOPCondoCommlUnitOwnersOptionalCovs> BOPCondoCommlUnitOwnersOptionalCovsList;
	private List<BOPFoodContamination> BOPFoodContaminationList;
	private List<BOPNamedPerilsBusnPrsnlProp> BOPNamedPerilsBusnPrsnlPropList;
	private com.nest.res.bop.rules.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverageRule;
	private List<BOPClassificationOutdoorPropertyCoverage> BOPClassificationOutdoorPropertyCoverageList;
	private com.nest.res.bop.domain.BOPClassification BOPClassification;
	private List<BOPBrandsAndLabels> BOPBrandsAndLabelsList;
	private List<BOPSelfStorageFacilities> BOPSelfStorageFacilitiesList;
	private com.nest.res.bop.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule;
	private com.nest.res.bop.rules.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverageRule;
	private com.nest.res.bop.rules.BOPResidentialCleaningServices BOPResidentialCleaningServicesRule;
	private List<BOPUtilitySrvcsTimeElement> BOPUtilitySrvcsTimeElementList;
	private double LookupRateNumberFactorBldg_1 ;
	private List<BOPMotelLiabGuestsProp> BOPMotelLiabGuestsPropList;
	private com.nest.res.bop.rules.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlPropRule;
	private List<BOPMedExpensesExcl> BOPMedExpensesExclList;
	private com.nest.res.bop.rules.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule;
	private List<BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage> BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList;
	private List<BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP> BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList;
	private List<BOPSpoilgCov> BOPSpoilgCovList;
	private com.nest.res.bop.rules.BOPFoodContamination BOPFoodContaminationRule;
	private List<BOPClassificationBusnPrsnlPropCoverage> BOPClassificationBusnPrsnlPropCoverageList;
	private List<BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage> BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList;
	private List<BOPTheftLimitationsCoverage> BOPTheftLimitationsCoverageList;
	private com.nest.res.bop.rules.BOPMedExpensesExcl BOPMedExpensesExclRule;
	private List<BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises> BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList;
	private com.nest.res.bop.rules.BOPBrandsAndLabels BOPBrandsAndLabelsRule;
	private com.nest.res.bop.rules.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovRule;
	private com.nest.res.bop.rules.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule;
	private com.nest.res.bop.rules.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCovRule;
	private List<BOPUtilitySrvcsDirectDamage> BOPUtilitySrvcsDirectDamageList;
	private List<BOPFunctlBusnPrsnlPropValtn> BOPFunctlBusnPrsnlPropValtnList;
	private com.nest.res.bop.rules.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovsRule;
	private com.nest.res.bop.rules.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverageRule;
	private List<BOPClassificationValuablePapersCoverage> BOPClassificationValuablePapersCoverageList;
	private List<BOPClassificationPermanentYardsStorageCoverage> BOPClassificationPermanentYardsStorageCoverageList;
	private com.nest.res.bop.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule;
	private com.nest.res.bop.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule;
	private com.nest.res.bop.rules.BOPSpoilgCov BOPSpoilgCovRule;
	private com.nest.res.bop.rules.BOPMotelLiabGuestsProp BOPMotelLiabGuestsPropRule;
	private double LookupRateNumberFactorBldg ;
	private com.nest.res.bop.rules.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverageRule;
	private List<BOPClassificationBusnIncomeDependentPropCoverage> BOPClassificationBusnIncomeDependentPropCoverageList;
	private List<BOPClassificationPlaygroundCoverage> BOPClassificationPlaygroundCoverageList;
	private List<BOPClassificationSwimmingPoolCoverage> BOPClassificationSwimmingPoolCoverageList;
	private List<BOPElectronicDataLiabilityLimitedCov> BOPElectronicDataLiabilityLimitedCovList;
	private com.nest.res.bop.rules.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule;
	private com.nest.res.bop.rules.BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamageRule;
	private List<BOPElectronicDataLiabilityBroadCov> BOPElectronicDataLiabilityBroadCovList;
	private com.nest.res.bop.rules.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverageRule;
	private List<BOPOptionalPerPersonMedicalExpensesCoverageClassification> BOPOptionalPerPersonMedicalExpensesCoverageClassificationList;
	private com.nest.res.bop.rules.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule;
	private List<BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov> BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList;
	private List<BOPMotels> BOPMotelsList;
	private com.nest.res.bop.rules.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverageRule;
	private com.nest.res.bop.rules.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverageRule;
	private List<BOPClassificationAmusementAreaCoverage> BOPClassificationAmusementAreaCoverageList;
	private com.nest.res.bop.rules.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverageRule;
	private List<BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin> BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList;
	private com.nest.res.bop.rules.BOPSelfStorageFacilities BOPSelfStorageFacilitiesRule;
	private com.nest.res.bop.rules.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverageRule;
	private List<BOPClassificationAccountsReceivableCoverage> BOPClassificationAccountsReceivableCoverageList;
	private List<BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants> BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList;
	
	
	
	public  BOPClassification (com.nest.res.bop.domain.BOPClassification BOPClassification)  {
	  this.BOPClassification = BOPClassification;
this.BOPResidentialCleaningServicesList = BOPClassification.getBOPResidentialCleaningServices();
this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList = BOPClassification.getBOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd();
this.BOPCondoCommlUnitOwnersOptionalCovsList = BOPClassification.getBOPCondoCommlUnitOwnersOptionalCovs();
this.BOPFoodContaminationList = BOPClassification.getBOPFoodContamination();
this.BOPNamedPerilsBusnPrsnlPropList = BOPClassification.getBOPNamedPerilsBusnPrsnlProp();
this.BOPClassificationOutdoorPropertyCoverageList = BOPClassification.getBOPClassificationOutdoorPropertyCoverage();
this.BOPBrandsAndLabelsList = BOPClassification.getBOPBrandsAndLabels();
this.BOPSelfStorageFacilitiesList = BOPClassification.getBOPSelfStorageFacilities();
this.BOPUtilitySrvcsTimeElementList = BOPClassification.getBOPUtilitySrvcsTimeElement();
this.BOPMotelLiabGuestsPropList = BOPClassification.getBOPMotelLiabGuestsProp();
this.BOPMedExpensesExclList = BOPClassification.getBOPMedExpensesExcl();
this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList = BOPClassification.getBOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage();
this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList = BOPClassification.getBOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP();
this.BOPSpoilgCovList = BOPClassification.getBOPSpoilgCov();
this.BOPClassificationBusnPrsnlPropCoverageList = BOPClassification.getBOPClassificationBusnPrsnlPropCoverage();
this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList = BOPClassification.getBOPClassificationLiabMedExpensesBusnPrsnlPropCoverage();
this.BOPTheftLimitationsCoverageList = BOPClassification.getBOPTheftLimitationsCoverage();
this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList = BOPClassification.getBOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises();
this.BOPUtilitySrvcsDirectDamageList = BOPClassification.getBOPUtilitySrvcsDirectDamage();
this.BOPFunctlBusnPrsnlPropValtnList = BOPClassification.getBOPFunctlBusnPrsnlPropValtn();
this.BOPClassificationValuablePapersCoverageList = BOPClassification.getBOPClassificationValuablePapersCoverage();
this.BOPClassificationPermanentYardsStorageCoverageList = BOPClassification.getBOPClassificationPermanentYardsStorageCoverage();
this.BOPClassificationBusnIncomeDependentPropCoverageList = BOPClassification.getBOPClassificationBusnIncomeDependentPropCoverage();
this.BOPClassificationPlaygroundCoverageList = BOPClassification.getBOPClassificationPlaygroundCoverage();
this.BOPClassificationSwimmingPoolCoverageList = BOPClassification.getBOPClassificationSwimmingPoolCoverage();
this.BOPElectronicDataLiabilityLimitedCovList = BOPClassification.getBOPElectronicDataLiabilityLimitedCov();
this.BOPElectronicDataLiabilityBroadCovList = BOPClassification.getBOPElectronicDataLiabilityBroadCov();
this.BOPOptionalPerPersonMedicalExpensesCoverageClassificationList = BOPClassification.getBOPOptionalPerPersonMedicalExpensesCoverageClassification();
this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList = BOPClassification.getBOPExtendedReportingPeriodElectronicDataLiabilityBroadCov();
this.BOPMotelsList = BOPClassification.getBOPMotels();
this.BOPClassificationAmusementAreaCoverageList = BOPClassification.getBOPClassificationAmusementAreaCoverage();
this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList = BOPClassification.getBOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin();
this.BOPClassificationAccountsReceivableCoverageList = BOPClassification.getBOPClassificationAccountsReceivableCoverage();
this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList = BOPClassification.getBOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants();

	  
	}
	public void busnPrsnlPropCreditFactor_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage"))) != null){
			this.BOPClassification.setBusnPrsnlPropCreditFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage/BusnPrsnlPropCreditFactor"))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropCreditFactor_1((double)0.0);
		}
	  
	}
	public void BOPClassificationBusnIncomeDependentPropCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > (int)0.0) || (this.BOPClassification.getBusnPrsnlPropLimit() <= (int)0.0 && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals((String)"Yes"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBusnIncomeDependentPropCoverage/dsLimit"))) < (int)5000.0){
		for(com.nest.res.bop.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage :BOPClassificationBusnIncomeDependentPropCoverageList){
		BOPClassificationBusnIncomeDependentPropCoverage.setDsLimit((int)5000.0);
		}
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage :BOPClassificationBusnIncomeDependentPropCoverageList){
		BOPClassificationBusnIncomeDependentPropCoverage.setDsLimit((int)0.0);
		}
		}
	  
	}
	public void BusnPrsnlPropRate () throws LookupException,NumberFormatException {
	  
		if(!(this.BOPClassification.getRABOPWanted().equals((String)"Yes") && this.BOPClassification.getRABOPType().equals((String)"Smoothed"))){
		if(!(this.BOPClassification.getRABOPWanted().equals((String)"Yes") && this.BOPClassification.getRABOPType().equals((String)"Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals((String)"")){
			this.BOPClassification.setBusnPrsnlPropRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRate",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../RatingTerritory")))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRate((double)0.0);
		}
		}
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPFunctlBusnPrsnlPropValtnList){
		for(BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn:BOPFunctlBusnPrsnlPropValtnList){
			BOPFunctlBusnPrsnlPropValtnRule = new com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtn(BOPFunctlBusnPrsnlPropValtn);
			BOPFunctlBusnPrsnlPropValtnRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void ClassPropertyType ()  {
	  
		if(!this.BOPClassification.getStructurePropertyType().equals((String)"Mixed")){
			this.BOPClassification.setClassPropertyType(this.BOPClassification.getStructurePropertyType());
		}
	  
	}
	public void TerrsmBusnPrsnlPropPremium ()  {
	  this.BOPClassification.setTerrsmBusnPrsnlPropPremium((double)0.0);

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals((String)"Yes")){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBPPRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPreProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * (double)this.BOPClassification.getBusnPrsnlPropLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses")){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBPPRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPreProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor"))) * this.BOPClassification.getTerrorismBPPNuclBiolChemRadFactor()) * (double)this.BOPClassification.getBusnPrsnlPropLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals((String)"Limitations Of Coverage For Certified Acts Of Terrorism")){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBPPRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPreProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * (double)this.BOPClassification.getTerrsmSubLimit() / (double)100.0));
		}
		}
		}
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TRIPTerminatesBeforeExpirationDate"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TRIAExtended"))).equals((String)"No") && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002"))) == null && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002"))) == null && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002"))) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals((String)"Yes")){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPostProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * (double)this.BOPClassification.getBusnPrsnlPropLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses")){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPostProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor"))) * this.BOPClassification.getTerrorismBPPNuclBiolChemRadFactor()) * (double)this.BOPClassification.getBusnPrsnlPropLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals((String)"Limitations Of Coverage For Certified Acts Of Terrorism")){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPostProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * (double)this.BOPClassification.getTerrsmSubLimit() / (double)100.0));
		}
		}
		}
		}
	  
	}
	public void FinalBusnPrsnlPropRate ()  {
	  this.BOPClassification.setFinalBusnPrsnlPropRate(MathHelper.roundToThousand(((MathHelper.roundToThousand(this.BOPClassification.getBppRateToUse_1() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getBusnPrsnlPropCreditFactor_1() * this.BOPClassification.getLCM())) - MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPClassification.getWindstormOrHailExclBusnPrsnlPropFactor() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getBusnPrsnlPropCreditFactor_1() * this.BOPClassification.getLCM())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindMitigationDiscount"))))) * this.BOPClassification.getRateNumberFactorBPP() * this.BOPClassification.getConstructionTypeFactorBPP() * this.BOPClassification.getBusnPersonalPropertyLimitOfInsuranceRelativityFactor() * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BldgCodeEffectivenessGradeFactor"))) * this.BOPClassification.getSprinkleredFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))));

	  
	}
	public void ProcessPremium7_CommonRatingSub6 ()  {
	  
	BOPClassificationBusnIncomeDependentPropCoverage_Limit();
	
	  
	}
	public void BOPClassificationAccountsReceivableCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > (int)0.0) || (this.BOPClassification.getBusnPrsnlPropLimit() <= (int)0.0 && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals((String)"Yes"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationAccountsReceivableCoverage/dsLimit"))) < (int)10000.0){
		for(com.nest.res.bop.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage :BOPClassificationAccountsReceivableCoverageList){
		BOPClassificationAccountsReceivableCoverage.setDsLimit((int)10000.0);
		}
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage :BOPClassificationAccountsReceivableCoverageList){
		BOPClassificationAccountsReceivableCoverage.setDsLimit((int)0.0);
		}
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	TotBusnPrsnlPropLimit();
	
	  
	}
	public void ProcessPremium6 () throws LookupException,NumberFormatException {
	  
	ProcessPremium6_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium7_CommonRatingSub3 ()  {
	  
	BOPClassificationValuablePapersCoverage_Limit();
	
	  
	}
	public void ConstructionTypeFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals((String)"")){
			this.BOPClassification.setConstructionTypeFactorBPP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ConstructionTypeFactorBPP",((String)XpathNode.selectNodeValue(this.BOPClassification," ../ConstructionType")))));
		}
		else{
			this.BOPClassification.setConstructionTypeFactorBPP((double)0.0);
		}
	  
	}
	public void ProcessPremium7_CommonRatingSub7 ()  {
	  
	StructurePctOwnerOccupied();
	
	terrorismPreProRateFactor_1();
	
	terrorismPostProRateFactor_1();
	
	TerrsmBusnPrsnlPropPremium();
	
	  
	}
	public void FinalMaxBusnPrsnlPropRateFlag ()  {
	  this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlag((String)"Yes");

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))) != 0.0){
		if(this.BOPClassification.getFinalBusnPrsnlPropRate() < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate")))){
			this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlag((String)"No");
		}
		}		}

	  
	}
	public void TotBusnPrsnlPropLimit ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassification,"BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassification.setTotBusnPrsnlPropLimit(this.BOPClassification.getBusnPrsnlPropLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))));
		}
		else{
			this.BOPClassification.setTotBusnPrsnlPropLimit(this.BOPClassification.getBusnPrsnlPropLimit());
		}
	  
	}
	public void LookupRateNumberFactorBldg  () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals((String)"Mixed")){
		if(this.BOPClassification.getPredominantTypeFlag().equals((String)"Yes")){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals((String)"Yes")){
		if(!(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))){
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"RateNumber"))).equals((String)"")){
			this.LookupRateNumberFactorBldg  = MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBldg",((String)XpathNode.selectNodeValue(this.BOPClassification," RateNumber"))));
		}
		else{
			this.LookupRateNumberFactorBldg  = (double)0.0;
		}
		}
		}
		}		}

		}
		}
	  
	}
	public void BusnPrsnlPropRateRABOP () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPWanted().equals((String)"Yes") && this.BOPClassification.getRABOPType().equals((String)"Smoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals((String)"Other")){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals((String)"Other")){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../ZipCodeOverride")))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateRABOP((double)0.0);
		}
		}
		}
		else{
		if(this.BOPClassification.getRABOPWanted().equals((String)"Yes") && this.BOPClassification.getRABOPType().equals((String)"Unsmoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals((String)"Other")){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals((String)"Other")){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../ZipCodeOverride")))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateRABOP((double)0.0);
		}
		}
		}
		}
	  
	}
	public void BOPTheftLimitationsCoverage_Limit ()  {
	  
		if(this.BOPClassification.getBusnPrsnlPropLimit() > (int)0.0){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPTheftLimitationsCoverage/dsLimit"))) < (int)2500.0){
		for(com.nest.res.bop.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage :BOPTheftLimitationsCoverageList){
		BOPTheftLimitationsCoverage.setDsLimit((int)2500.0);
		}
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage :BOPTheftLimitationsCoverageList){
		BOPTheftLimitationsCoverage.setDsLimit((int)0.0);
		}
		}
	  
	}
	public void terrorismPreProRateFactor_1 ()  {
	  this.BOPClassification.setTerrorismPreProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPreProRateFactor"))));

	  
	}
	public void ProcessPremium4 () throws LookupException,NumberFormatException {
	  
	ProcessPremium4_CommonRatingSub1();
	
	  
	}
	public void TerrorismBPPRate () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBPPRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABusnPrsnlPropRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium7_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	HurricaneLossCostsBPP();
	
	GeneralLiabilityLCM();
	
	CommercialPropertyLCM();
	
	CrimeLCM();
	
	LCM();
	
	BusnPrsnlPropRateRABOP();
	
	BusnPrsnlPropRate();
	
	WindstormOrHailExclBusnPrsnlPropFactor();
	
	ConstructionTypeFactorBPP();
	
	PublicProtectionFactorBPP();
	
	BusnPrsnlPropSusceptibilityGrade();
	
	SprinkleredFactorBPP();
	
	BusnPersonalPropertyLimitOfInsuranceRelativityFactor();
	
	bppRateToUse_1();
	
	busnPrsnlPropCreditFactor_1();
	
	FinalBusnPrsnlPropRate();
	
	TerrorismBPPRate();
	
	TerrorismBusnPrsnlPropFullRate();
	
	TerrorismBPPNuclBiolChemRadFactor();
	
	BusnPrsnlPropRateGrade();
	
	  
	}
	public void ProcessPremium7_CommonRatingSub2 ()  {
	  
	BOPClassificationAccountsReceivableCoverage_Limit();
	
	  
	}
	public void ProcessPremium4_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	RateNumberFactorBPP();
	
	  
	}
	public void TerrorismBPPNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBPPNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABPPNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium9 ()  {
	  
	  
	}
	public void LCM ()  {
	  this.BOPClassification.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../LCM"))));

	  
	}
	public void ProcessPremium10_CommonRatingSub1 ()  {
	  
	FinalMaxBusnPrsnlPropRateFlag();
	
	  
	}
	public void terrorismPostProRateFactor_1 ()  {
	  this.BOPClassification.setTerrorismPostProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPostProRateFactor"))));

	  
	}
	public void PublicProtectionFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals((String)"")){
			this.BOPClassification.setPublicProtectionFactorBPP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PublicProtectionClassPPCFactorBPP",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../FireProtectionClassPPC")))));
		}
		else{
			this.BOPClassification.setPublicProtectionFactorBPP((double)0.0);
		}
	  
	}
	public void LookupRateNumberFactorBldg_1  () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals((String)"Mixed")){
		if(this.BOPClassification.getPredominantTypeFlag().equals((String)"Yes")){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals((String)"Yes")){
		if(!(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))){
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RateNumber"))).equals((String)"")){
			this.LookupRateNumberFactorBldg_1  = MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBldg",((String)XpathNode.selectNodeValue(this.BOPClassification," ../BOPClassification/RateNumber"))));
		}
		else{
			this.LookupRateNumberFactorBldg_1  = (double)0.0;
		}
		}
		}
		}		}

		}
		}
	  
	}
	public void ProcessPremium3_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	LocationMoneyFlag();
	
	PredominantTypeFlag();
	
	PredominantOccupancy();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	  
	}
	public void ProcessPremium6_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	LocationMoneyFlag();
	
	PredominantTypeFlag();
	
	PredominantOccupancy();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	  
	}
	public void bppRateToUse_1 ()  {
	  
		if(this.BOPClassification.getRABOPWanted().equals((String)"Yes") && (this.BOPClassification.getRABOPType().equals((String)"Smoothed") || this.BOPClassification.getRABOPType().equals((String)"Unsmoothed"))){
			this.BOPClassification.setBppRateToUse_1(Double.valueOf(this.BOPClassification.getBusnPrsnlPropRateRABOP()) + Double.valueOf(this.BOPClassification.getHurricaneLossCostsBPP()));
		}
		else{
			this.BOPClassification.setBppRateToUse_1(Double.valueOf(this.BOPClassification.getBusnPrsnlPropRate()));
		}
	  
	}
	public void ProcessPremium10 ()  {
	  
	ProcessPremium10_CommonRatingSub1();
	
	setPremium();
	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPClassification.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../GeneralLiabilityLCM"))));

	  
	}
	public void PredominantTypeFlag ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals((String)"Mixed")){
			this.BOPClassification.setPredominantTypeFlag((String)"No");
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals((String)"Restaurant")){
		if(this.BOPClassification.getClassPropertyType().equals((String)"Restaurant-Fast Food") || this.BOPClassification.getClassPropertyType().equals((String)"Restaurant-Limited Cooking") || this.BOPClassification.getClassPropertyType().equals((String)"Restaurant-Fine Dining") || this.BOPClassification.getClassPropertyType().equals((String)"Restaurant-Casual Dining")){
			this.BOPClassification.setPredominantTypeFlag((String)"Yes");
		}
		else{
			this.BOPClassification.setPredominantTypeFlag((String)"No");
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals((String)"Apartment")){
		if(this.BOPClassification.getClassPropertyType().equals((String)"Apartment Condominium Association") || this.BOPClassification.getClassPropertyType().equals((String)"Apartment")){
			this.BOPClassification.setPredominantTypeFlag((String)"Yes");
		}
		else{
			this.BOPClassification.setPredominantTypeFlag((String)"No");
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals((String)"Office")){
		if(this.BOPClassification.getClassPropertyType().equals((String)"Office") || this.BOPClassification.getClassPropertyType().equals((String)"Office Condominium")){
			this.BOPClassification.setPredominantTypeFlag((String)"Yes");
		}
		else{
			this.BOPClassification.setPredominantTypeFlag((String)"No");
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals((String)"OfficeApartmentOther")){
		if(!this.BOPClassification.getClassPropertyType().equals((String)"Office") && !this.BOPClassification.getClassPropertyType().equals((String)"Office Condominium") && !this.BOPClassification.getClassPropertyType().equals((String)"Apartment Condominium Association") && !this.BOPClassification.getClassPropertyType().equals((String)"Apartment")){
			this.BOPClassification.setPredominantTypeFlag((String)"Yes");
		}
		else{
			this.BOPClassification.setPredominantTypeFlag((String)"No");
		}
		}
		else{
			this.BOPClassification.setPredominantTypeFlag((String)"Yes");
		}
		}
		}
		}
		}
	  
	}
	public void PredominantOccupancy ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals((String)"Mixed")){
			this.BOPClassification.setPredominantOccupancy((String)"Yes");
		if(this.BOPClassification.getPredominantTypeFlag().equals((String)"Yes")){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals((String)"Yes")){
		if(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
			this.BOPClassification.setPredominantOccupancy((String)"No");
		}
		else{
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(this.LookupRateNumberFactorBldg  < this.LookupRateNumberFactorBldg_1 ){
			this.BOPClassification.setPredominantOccupancy((String)"No");
		}
		}
		}
		}		}

		}
		else{
			this.BOPClassification.setPredominantOccupancy((String)"No");
		}
		}
		else{
			this.BOPClassification.setPredominantOccupancy((String)"Yes");
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
			this.BOPClassification.setPredominantOccupancy((String)"No");
		}
		else{
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
		if(this.BOPClassification.getRateNumberFactorBPP() < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"RateNumberFactorBPP")))){
			this.BOPClassification.setPredominantOccupancy((String)"No");
		}
		}
		}
		}		}

		}
	  
	}
	public void ProcessPremium7_CommonRatingSub4 ()  {
	  
	BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage_Limit();
	
	  
	}
	public void StructurePctOwnerOccupied ()  {
	  this.BOPClassification.setStructurePctOwnerOccupied((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PctOwnerOccupied"))));

	  
	}
	public void BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > (int)0.0) || (this.BOPClassification.getBusnPrsnlPropLimit() <= (int)0.0 && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals((String)"Yes"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage/dsLimit"))) < (int)10000.0){
		for(com.nest.res.bop.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage :BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setDsLimit((int)10000.0);
		}
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage :BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setDsLimit((int)0.0);
		}
		}
	  
	}
	public void ProcessPremium7_CommonRatingSub5 ()  {
	  
	BOPTheftLimitationsCoverage_Limit();
	
	  
	}
	public void CurrentMoneyRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassPropertyType().equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals((String)"")){
			this.BOPClassification.setCurrentMoneyRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../RatingTerritory ")),String.valueOf(BOPClassification.getClassPropertyType()))));
		}
		else{
			this.BOPClassification.setCurrentMoneyRate((double)0.0);
		}
	  
	}
	public void HurricaneLossCostsBPP () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPWanted().equals((String)"Yes") && (this.BOPClassification.getRABOPType().equals((String)"Smoothed") || this.BOPClassification.getRABOPType().equals((String)"Unsmoothed")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals((String)"")){
			this.BOPClassification.setHurricaneLossCostsBPP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HurricaneLossCostsBPP",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../RatingTerritory")))));
		}
		else{
			this.BOPClassification.setHurricaneLossCostsBPP((double)0.0);
		}
	  
	}
	public void SprinkleredFactorBPP () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals((String)"Yes")){
		if(!this.BOPClassification.getRateNumber().equals((String)"")){
			this.BOPClassification.setSprinkleredFactorBPP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SprinkleredFactorBPP",String.valueOf(BOPClassification.getRateNumber()))));
		}
		else{
			this.BOPClassification.setSprinkleredFactorBPP((double)0.0);
		}
		}
		else{
			this.BOPClassification.setSprinkleredFactorBPP((double)1.0);
		}
	  
	}
	public void ProcessPremium8 ()  {
	  
	if(null != BOPMedExpensesExclList){
		for(BOPMedExpensesExcl BOPMedExpensesExcl:BOPMedExpensesExclList){
			BOPMedExpensesExclRule = new com.nest.res.bop.rules.BOPMedExpensesExcl(BOPMedExpensesExcl);
			BOPMedExpensesExclRule.ProcessPremium2();

		}
	}
	  
	}
	public void WindstormOrHailExclBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  
		if((((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion"))) != null) || (((XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))).equals((String)"Yes"))){
			this.BOPClassification.setWindstormOrHailExclBusnPrsnlPropFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBusnPrsnlPropFactor",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../RatingTerritory")))));
		}
		else{
			this.BOPClassification.setWindstormOrHailExclBusnPrsnlPropFactor((double)0.0);
		}
	  
	}
	public void RateNumberFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getRateNumber().equals((String)"")){
			this.BOPClassification.setRateNumberFactorBPP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBPP",String.valueOf(BOPClassification.getRateNumber()))));
		}
		else{
			this.BOPClassification.setRateNumberFactorBPP((double)0.0);
		}
	  
	}
	public void ProcessPremium5_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	LocationMoneyFlag();
	
	PredominantTypeFlag();
	
	PredominantOccupancy();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	  
	}
	public void CrimeLCM ()  {
	  this.BOPClassification.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../CrimeLCM"))));

	  
	}
	public void BusnPrsnlPropRateGrade () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassDescription().equals((String)"")){
			this.BOPClassification.setBusnPrsnlPropRateGrade(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("EQBusnPrsnlPropRateGrade",String.valueOf(BOPClassification.getClassDescription()))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateGrade((String)"");
		}
	  
	}
	public void ProcessPremium5 () throws LookupException,NumberFormatException {
	  
	ProcessPremium5_CommonRatingSub1();
	
	  
	}
	public void TerrorismBusnPrsnlPropFullRate () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBusnPrsnlPropFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABusnPrsnlPropFullRate",String.valueOf( "Y"))));

	  
	}
	public void LocationMoneyFlag () throws LookupException,NumberFormatException {
	  this.BOPClassification.setLocationMoneyFlag((String)"Yes");

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../../BOPStructure/BOPClassification") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"") && ((XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))).equals((String)"Yes")){
		if(this.BOPClassification.getCurrentMoneyRate() < MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",((String)XpathNode.selectNodeValue(this.BOPClassification," ../../RatingTerritory ")),((String)XpathNode.selectNodeValue(this.BOPClassification," ../../BOPStructure/BOPClassification/ClassPropertyType"))))){
			this.BOPClassification.setLocationMoneyFlag((String)"No");
		}
		}		}

	  
	}
	public void BOPClassificationValuablePapersCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > (int)0.0) || (this.BOPClassification.getBusnPrsnlPropLimit() <= (int)0.0 && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals((String)"Yes"))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationValuablePapersCoverage/dsLimit"))) < (int)10000.0){
		for(com.nest.res.bop.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage :BOPClassificationValuablePapersCoverageList){
		BOPClassificationValuablePapersCoverage.setDsLimit((int)10000.0);
		}
		}
		}
		else{
		for(com.nest.res.bop.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage :BOPClassificationValuablePapersCoverageList){
		BOPClassificationValuablePapersCoverage.setDsLimit((int)0.0);
		}
		}
	  
	}
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	RateNumberFactorBPP();
	
	  
	}
	public void BusnPrsnlPropSusceptibilityGrade () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassDescription().equals((String)"")){
			this.BOPClassification.setBusnPrsnlPropSusceptibilityGrade(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("SprinklerLeakageSusceptibilityGrade",String.valueOf(BOPClassification.getClassDescription()))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropSusceptibilityGrade((String)"");
		}
	  
	}
	public void ProcessPremium7 () throws LookupException,NumberFormatException {
	  
	ProcessPremium7_CommonRatingSub1();
	
	ProcessPremium7_CommonRatingSub2();
	
	ProcessPremium7_CommonRatingSub3();
	
	ProcessPremium7_CommonRatingSub4();
	
	ProcessPremium7_CommonRatingSub5();
	
	ProcessPremium7_CommonRatingSub6();
	
	if(null != BOPClassificationBusnPrsnlPropCoverageList){
		for(BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage:BOPClassificationBusnPrsnlPropCoverageList){
			BOPClassificationBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPClassificationBusnPrsnlPropCoverage(BOPClassificationBusnPrsnlPropCoverage);
			BOPClassificationBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBrandsAndLabelsList){
		for(BOPBrandsAndLabels BOPBrandsAndLabels:BOPBrandsAndLabelsList){
			BOPBrandsAndLabelsRule = new com.nest.res.bop.rules.BOPBrandsAndLabels(BOPBrandsAndLabels);
			BOPBrandsAndLabelsRule.ProcessPremium1();

		}
	}
	if(null != BOPFunctlBusnPrsnlPropValtnList){
		for(BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn:BOPFunctlBusnPrsnlPropValtnList){
			BOPFunctlBusnPrsnlPropValtnRule = new com.nest.res.bop.rules.BOPFunctlBusnPrsnlPropValtn(BOPFunctlBusnPrsnlPropValtn);
			BOPFunctlBusnPrsnlPropValtnRule.ProcessPremium2();

		}
	}
	if(null != BOPClassificationAccountsReceivableCoverageList){
		for(BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage:BOPClassificationAccountsReceivableCoverageList){
			BOPClassificationAccountsReceivableCoverageRule = new com.nest.res.bop.rules.BOPClassificationAccountsReceivableCoverage(BOPClassificationAccountsReceivableCoverage);
			BOPClassificationAccountsReceivableCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationAmusementAreaCoverageList){
		for(BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage:BOPClassificationAmusementAreaCoverageList){
			BOPClassificationAmusementAreaCoverageRule = new com.nest.res.bop.rules.BOPClassificationAmusementAreaCoverage(BOPClassificationAmusementAreaCoverage);
			BOPClassificationAmusementAreaCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		for(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage:BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
			BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule = new com.nest.res.bop.rules.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage);
			BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule.CommonRating1();

		}
	}
	if(null != BOPClassificationBusnIncomeDependentPropCoverageList){
		for(BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage:BOPClassificationBusnIncomeDependentPropCoverageList){
			BOPClassificationBusnIncomeDependentPropCoverageRule = new com.nest.res.bop.rules.BOPClassificationBusnIncomeDependentPropCoverage(BOPClassificationBusnIncomeDependentPropCoverage);
			BOPClassificationBusnIncomeDependentPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList){
		for(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage:BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList){
			BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage);
			BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationOutdoorPropertyCoverageList){
		for(BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage:BOPClassificationOutdoorPropertyCoverageList){
			BOPClassificationOutdoorPropertyCoverageRule = new com.nest.res.bop.rules.BOPClassificationOutdoorPropertyCoverage(BOPClassificationOutdoorPropertyCoverage);
			BOPClassificationOutdoorPropertyCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPermanentYardsStorageCoverageList){
		for(BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage:BOPClassificationPermanentYardsStorageCoverageList){
			BOPClassificationPermanentYardsStorageCoverageRule = new com.nest.res.bop.rules.BOPClassificationPermanentYardsStorageCoverage(BOPClassificationPermanentYardsStorageCoverage);
			BOPClassificationPermanentYardsStorageCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPlaygroundCoverageList){
		for(BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage:BOPClassificationPlaygroundCoverageList){
			BOPClassificationPlaygroundCoverageRule = new com.nest.res.bop.rules.BOPClassificationPlaygroundCoverage(BOPClassificationPlaygroundCoverage);
			BOPClassificationPlaygroundCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationSwimmingPoolCoverageList){
		for(BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage:BOPClassificationSwimmingPoolCoverageList){
			BOPClassificationSwimmingPoolCoverageRule = new com.nest.res.bop.rules.BOPClassificationSwimmingPoolCoverage(BOPClassificationSwimmingPoolCoverage);
			BOPClassificationSwimmingPoolCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationValuablePapersCoverageList){
		for(BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage:BOPClassificationValuablePapersCoverageList){
			BOPClassificationValuablePapersCoverageRule = new com.nest.res.bop.rules.BOPClassificationValuablePapersCoverage(BOPClassificationValuablePapersCoverage);
			BOPClassificationValuablePapersCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondoCommlUnitOwnersOptionalCovsList){
		for(BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs:BOPCondoCommlUnitOwnersOptionalCovsList){
			BOPCondoCommlUnitOwnersOptionalCovsRule = new com.nest.res.bop.rules.BOPCondoCommlUnitOwnersOptionalCovs(BOPCondoCommlUnitOwnersOptionalCovs);
			BOPCondoCommlUnitOwnersOptionalCovsRule.ProcessPremium1();

		}
	}
	if(null != BOPElectronicDataLiabilityBroadCovList){
		for(BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov:BOPElectronicDataLiabilityBroadCovList){
			BOPElectronicDataLiabilityBroadCovRule = new com.nest.res.bop.rules.BOPElectronicDataLiabilityBroadCov(BOPElectronicDataLiabilityBroadCov);
			BOPElectronicDataLiabilityBroadCovRule.ProcessPremium1();

		}
	}
	if(null != BOPElectronicDataLiabilityLimitedCovList){
		for(BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov:BOPElectronicDataLiabilityLimitedCovList){
			BOPElectronicDataLiabilityLimitedCovRule = new com.nest.res.bop.rules.BOPElectronicDataLiabilityLimitedCov(BOPElectronicDataLiabilityLimitedCov);
			BOPElectronicDataLiabilityLimitedCovRule.ProcessPremium1();

		}
	}
	if(null != BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList){
		for(BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants:BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList){
			BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule = new com.nest.res.bop.rules.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants(BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants);
			BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule.ProcessPremium1();

		}
	}
	if(null != BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList){
		for(BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov:BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList){
			BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovRule = new com.nest.res.bop.rules.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov(BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov);
			BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovRule.ProcessPremium1();

		}
	}
	if(null != BOPFoodContaminationList){
		for(BOPFoodContamination BOPFoodContamination:BOPFoodContaminationList){
			BOPFoodContaminationRule = new com.nest.res.bop.rules.BOPFoodContamination(BOPFoodContamination);
			BOPFoodContaminationRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList){
		for(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP:BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList){
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule = new com.nest.res.bop.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP);
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule.ProcessPremium1();

		}
	}
	if(null != BOPMedExpensesExclList){
		for(BOPMedExpensesExcl BOPMedExpensesExcl:BOPMedExpensesExclList){
			BOPMedExpensesExclRule = new com.nest.res.bop.rules.BOPMedExpensesExcl(BOPMedExpensesExcl);
			BOPMedExpensesExclRule.ProcessPremium1();

		}
	}
	if(null != BOPMotelLiabGuestsPropList){
		for(BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp:BOPMotelLiabGuestsPropList){
			BOPMotelLiabGuestsPropRule = new com.nest.res.bop.rules.BOPMotelLiabGuestsProp(BOPMotelLiabGuestsProp);
			BOPMotelLiabGuestsPropRule.ProcessPremium1();

		}
	}
	if(null != BOPMotelsList){
		for(BOPMotels BOPMotels:BOPMotelsList){
			BOPMotelsRule = new com.nest.res.bop.rules.BOPMotels(BOPMotels);
			BOPMotelsRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsBusnPrsnlPropList){
		for(BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp:BOPNamedPerilsBusnPrsnlPropList){
			BOPNamedPerilsBusnPrsnlPropRule = new com.nest.res.bop.rules.BOPNamedPerilsBusnPrsnlProp(BOPNamedPerilsBusnPrsnlProp);
			BOPNamedPerilsBusnPrsnlPropRule.ProcessPremium1();

		}
	}
	if(null != BOPOptionalPerPersonMedicalExpensesCoverageClassificationList){
		for(BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification:BOPOptionalPerPersonMedicalExpensesCoverageClassificationList){
			BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule = new com.nest.res.bop.rules.BOPOptionalPerPersonMedicalExpensesCoverageClassification(BOPOptionalPerPersonMedicalExpensesCoverageClassification);
			BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule.ProcessPremium1();

		}
	}
	if(null != BOPResidentialCleaningServicesList){
		for(BOPResidentialCleaningServices BOPResidentialCleaningServices:BOPResidentialCleaningServicesList){
			BOPResidentialCleaningServicesRule = new com.nest.res.bop.rules.BOPResidentialCleaningServices(BOPResidentialCleaningServices);
			BOPResidentialCleaningServicesRule.ProcessPremium1();

		}
	}
	if(null != BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList){
		for(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin:BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList){
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule = new com.nest.res.bop.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin);
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule.ProcessPremium1();

		}
	}
	if(null != BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList){
		for(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd:BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList){
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule = new com.nest.res.bop.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd);
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule.ProcessPremium1();

		}
	}
	if(null != BOPSelfStorageFacilitiesList){
		for(BOPSelfStorageFacilities BOPSelfStorageFacilities:BOPSelfStorageFacilitiesList){
			BOPSelfStorageFacilitiesRule = new com.nest.res.bop.rules.BOPSelfStorageFacilities(BOPSelfStorageFacilities);
			BOPSelfStorageFacilitiesRule.ProcessPremium1();

		}
	}
	if(null != BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList){
		for(BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises:BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList){
			BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule = new com.nest.res.bop.rules.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises(BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises);
			BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule.ProcessPremium1();

		}
	}
	if(null != BOPSpoilgCovList){
		for(BOPSpoilgCov BOPSpoilgCov:BOPSpoilgCovList){
			BOPSpoilgCovRule = new com.nest.res.bop.rules.BOPSpoilgCov(BOPSpoilgCov);
			BOPSpoilgCovRule.ProcessPremium1();

		}
	}
	if(null != BOPTheftLimitationsCoverageList){
		for(BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage:BOPTheftLimitationsCoverageList){
			BOPTheftLimitationsCoverageRule = new com.nest.res.bop.rules.BOPTheftLimitationsCoverage(BOPTheftLimitationsCoverage);
			BOPTheftLimitationsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPUtilitySrvcsDirectDamageList){
		for(BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamage:BOPUtilitySrvcsDirectDamageList){
			BOPUtilitySrvcsDirectDamageRule = new com.nest.res.bop.rules.BOPUtilitySrvcsDirectDamage(BOPUtilitySrvcsDirectDamage);
			BOPUtilitySrvcsDirectDamageRule.ProcessPremium1();

		}
	}
	if(null != BOPUtilitySrvcsTimeElementList){
		for(BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElement:BOPUtilitySrvcsTimeElementList){
			BOPUtilitySrvcsTimeElementRule = new com.nest.res.bop.rules.BOPUtilitySrvcsTimeElement(BOPUtilitySrvcsTimeElement);
			BOPUtilitySrvcsTimeElementRule.ProcessPremium1();

		}
	}
	ProcessPremium7_CommonRatingSub7();
	
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPResidentialCleaningServicesList != null && this.BOPResidentialCleaningServicesList.size() > 0){
			for(com.nest.res.bop.domain.BOPResidentialCleaningServices BOPResidentialCleaningServices : BOPResidentialCleaningServicesList) {
				finalPremium = finalPremium + BOPResidentialCleaningServices.getPremium();
			}
		}
		if(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList != null && this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList.size() > 0){
			for(com.nest.res.bop.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd : BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList) {
				finalPremium = finalPremium + BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd.getPremium();
			}
		}
		if(this.BOPCondoCommlUnitOwnersOptionalCovsList != null && this.BOPCondoCommlUnitOwnersOptionalCovsList.size() > 0){
			for(com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs : BOPCondoCommlUnitOwnersOptionalCovsList) {
				finalPremium = finalPremium + BOPCondoCommlUnitOwnersOptionalCovs.getPremium();
			}
		}
		if(this.BOPFoodContaminationList != null && this.BOPFoodContaminationList.size() > 0){
			for(com.nest.res.bop.domain.BOPFoodContamination BOPFoodContamination : BOPFoodContaminationList) {
				finalPremium = finalPremium + BOPFoodContamination.getPremium();
			}
		}
		if(this.BOPNamedPerilsBusnPrsnlPropList != null && this.BOPNamedPerilsBusnPrsnlPropList.size() > 0){
			for(com.nest.res.bop.domain.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp : BOPNamedPerilsBusnPrsnlPropList) {
				finalPremium = finalPremium + BOPNamedPerilsBusnPrsnlProp.getPremium();
			}
		}
		if(this.BOPClassificationOutdoorPropertyCoverageList != null && this.BOPClassificationOutdoorPropertyCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage : BOPClassificationOutdoorPropertyCoverageList) {
				finalPremium = finalPremium + BOPClassificationOutdoorPropertyCoverage.getPremium();
			}
		}
		if(this.BOPBrandsAndLabelsList != null && this.BOPBrandsAndLabelsList.size() > 0){
			for(com.nest.res.bop.domain.BOPBrandsAndLabels BOPBrandsAndLabels : BOPBrandsAndLabelsList) {
				finalPremium = finalPremium + BOPBrandsAndLabels.getPremium();
			}
		}
		if(this.BOPSelfStorageFacilitiesList != null && this.BOPSelfStorageFacilitiesList.size() > 0){
			for(com.nest.res.bop.domain.BOPSelfStorageFacilities BOPSelfStorageFacilities : BOPSelfStorageFacilitiesList) {
				finalPremium = finalPremium + BOPSelfStorageFacilities.getPremium();
			}
		}
		if(this.BOPUtilitySrvcsTimeElementList != null && this.BOPUtilitySrvcsTimeElementList.size() > 0){
			for(com.nest.res.bop.domain.BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElement : BOPUtilitySrvcsTimeElementList) {
				finalPremium = finalPremium + BOPUtilitySrvcsTimeElement.getPremium();
			}
		}
		if(this.BOPMotelLiabGuestsPropList != null && this.BOPMotelLiabGuestsPropList.size() > 0){
			for(com.nest.res.bop.domain.BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp : BOPMotelLiabGuestsPropList) {
				finalPremium = finalPremium + BOPMotelLiabGuestsProp.getPremium();
			}
		}
		if(this.BOPMedExpensesExclList != null && this.BOPMedExpensesExclList.size() > 0){
			for(com.nest.res.bop.domain.BOPMedExpensesExcl BOPMedExpensesExcl : BOPMedExpensesExclList) {
				finalPremium = finalPremium + BOPMedExpensesExcl.getPremium();
			}
		}
		if(this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList != null && this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage : BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList) {
				finalPremium = finalPremium + BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.getPremium();
			}
		}
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList != null && this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList.size() > 0){
			for(com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP : BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList) {
				finalPremium = finalPremium + BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPremium();
			}
		}
		if(this.BOPSpoilgCovList != null && this.BOPSpoilgCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPSpoilgCov BOPSpoilgCov : BOPSpoilgCovList) {
				finalPremium = finalPremium + BOPSpoilgCov.getPremium();
			}
		}
		if(this.BOPClassificationBusnPrsnlPropCoverageList != null && this.BOPClassificationBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage : BOPClassificationBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPClassificationBusnPrsnlPropCoverage.getPremium();
			}
		}
		if(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList != null && this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage : BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getPremium();
			}
		}
		if(this.BOPTheftLimitationsCoverageList != null && this.BOPTheftLimitationsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage : BOPTheftLimitationsCoverageList) {
				finalPremium = finalPremium + BOPTheftLimitationsCoverage.getPremium();
			}
		}
		if(this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList != null && this.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList.size() > 0){
			for(com.nest.res.bop.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises : BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList) {
				finalPremium = finalPremium + BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises.getPremium();
			}
		}
		if(this.BOPUtilitySrvcsDirectDamageList != null && this.BOPUtilitySrvcsDirectDamageList.size() > 0){
			for(com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamage : BOPUtilitySrvcsDirectDamageList) {
				finalPremium = finalPremium + BOPUtilitySrvcsDirectDamage.getPremium();
			}
		}
		if(this.BOPFunctlBusnPrsnlPropValtnList != null && this.BOPFunctlBusnPrsnlPropValtnList.size() > 0){
			for(com.nest.res.bop.domain.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn : BOPFunctlBusnPrsnlPropValtnList) {
				finalPremium = finalPremium + BOPFunctlBusnPrsnlPropValtn.getPremium();
			}
		}
		if(this.BOPClassificationValuablePapersCoverageList != null && this.BOPClassificationValuablePapersCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage : BOPClassificationValuablePapersCoverageList) {
				finalPremium = finalPremium + BOPClassificationValuablePapersCoverage.getPremium();
			}
		}
		if(this.BOPClassificationPermanentYardsStorageCoverageList != null && this.BOPClassificationPermanentYardsStorageCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage : BOPClassificationPermanentYardsStorageCoverageList) {
				finalPremium = finalPremium + BOPClassificationPermanentYardsStorageCoverage.getPremium();
			}
		}
		if(this.BOPClassificationBusnIncomeDependentPropCoverageList != null && this.BOPClassificationBusnIncomeDependentPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage : BOPClassificationBusnIncomeDependentPropCoverageList) {
				finalPremium = finalPremium + BOPClassificationBusnIncomeDependentPropCoverage.getPremium();
			}
		}
		if(this.BOPClassificationPlaygroundCoverageList != null && this.BOPClassificationPlaygroundCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage : BOPClassificationPlaygroundCoverageList) {
				finalPremium = finalPremium + BOPClassificationPlaygroundCoverage.getPremium();
			}
		}
		if(this.BOPClassificationSwimmingPoolCoverageList != null && this.BOPClassificationSwimmingPoolCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage : BOPClassificationSwimmingPoolCoverageList) {
				finalPremium = finalPremium + BOPClassificationSwimmingPoolCoverage.getPremium();
			}
		}
		if(this.BOPElectronicDataLiabilityLimitedCovList != null && this.BOPElectronicDataLiabilityLimitedCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov : BOPElectronicDataLiabilityLimitedCovList) {
				finalPremium = finalPremium + BOPElectronicDataLiabilityLimitedCov.getPremium();
			}
		}
		if(this.BOPElectronicDataLiabilityBroadCovList != null && this.BOPElectronicDataLiabilityBroadCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov : BOPElectronicDataLiabilityBroadCovList) {
				finalPremium = finalPremium + BOPElectronicDataLiabilityBroadCov.getPremium();
			}
		}
		if(this.BOPOptionalPerPersonMedicalExpensesCoverageClassificationList != null && this.BOPOptionalPerPersonMedicalExpensesCoverageClassificationList.size() > 0){
			for(com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification : BOPOptionalPerPersonMedicalExpensesCoverageClassificationList) {
				finalPremium = finalPremium + BOPOptionalPerPersonMedicalExpensesCoverageClassification.getPremium();
			}
		}
		if(this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList != null && this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov : BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList) {
				finalPremium = finalPremium + BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov.getPremium();
			}
		}
		if(this.BOPMotelsList != null && this.BOPMotelsList.size() > 0){
			for(com.nest.res.bop.domain.BOPMotels BOPMotels : BOPMotelsList) {
				finalPremium = finalPremium + BOPMotels.getPremium();
			}
		}
		if(this.BOPClassificationAmusementAreaCoverageList != null && this.BOPClassificationAmusementAreaCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage : BOPClassificationAmusementAreaCoverageList) {
				finalPremium = finalPremium + BOPClassificationAmusementAreaCoverage.getPremium();
			}
		}
		if(this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList != null && this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList.size() > 0){
			for(com.nest.res.bop.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin : BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList) {
				finalPremium = finalPremium + BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin.getPremium();
			}
		}
		if(this.BOPClassificationAccountsReceivableCoverageList != null && this.BOPClassificationAccountsReceivableCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage : BOPClassificationAccountsReceivableCoverageList) {
				finalPremium = finalPremium + BOPClassificationAccountsReceivableCoverage.getPremium();
			}
		}
		if(this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList != null && this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants : BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList) {
				finalPremium = finalPremium + BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants.getPremium();
			}
		}
this.BOPClassification.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium3 () throws LookupException,NumberFormatException {
	  
	ProcessPremium3_CommonRatingSub1();
	
	  
	}
	public void BusnPersonalPropertyLimitOfInsuranceRelativityFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getTotBusnPrsnlPropLimit() != (int)0.0){
			this.BOPClassification.setBusnPersonalPropertyLimitOfInsuranceRelativityFactor(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnPropLimitOfInsRelativityFactor",String.valueOf(BOPClassification.getTotBusnPrsnlPropLimit())))));
		}
		else{
			this.BOPClassification.setBusnPersonalPropertyLimitOfInsuranceRelativityFactor((double)1.0);
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPClassification.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../CommercialPropertyLCM"))));

	  
	}
	public void StructurePropertyType ()  {
	  this.BOPClassification.setStructurePropertyType((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))));

	  
	}
	
	
	
	
	


	
}