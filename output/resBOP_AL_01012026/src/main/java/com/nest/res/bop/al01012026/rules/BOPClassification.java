package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPCannabisPropertyCoverage;
import com.nest.res.bop.al01012026.domain.BOPResidentialCleaningServices;
import com.nest.res.bop.al01012026.domain.BOPHigherLimitsClassification;
import com.nest.res.bop.al01012026.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;
import com.nest.res.bop.al01012026.domain.BOPPesticideHerbicideCov;
import com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalCovs;
import com.nest.res.bop.al01012026.domain.BOPFoodContamination;
import com.nest.res.bop.al01012026.domain.BOPNamedPerilsBusnPrsnlProp;
import com.nest.res.bop.al01012026.domain.BOPClassificationOutdoorPropertyCoverage;
import com.nest.res.bop.al01012026.domain.BOPBrandsAndLabels;
import com.nest.res.bop.al01012026.domain.BOPSelfStorageFacilities;
import com.nest.res.bop.al01012026.domain.BOPClassificationPersonalPropertyOffPremisesCoverage;
import com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElement;
import com.nest.res.bop.al01012026.domain.BOPClassificationElectronicDataLiabilityLimitedCoverage;
import com.nest.res.bop.al01012026.domain.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds;
import com.nest.res.bop.al01012026.domain.BOPMotelLiabGuestsProp;
import com.nest.res.bop.al01012026.domain.BOPMedExpensesExcl;
import com.nest.res.bop.al01012026.domain.BOPClassificationElectronicDataLiabilityBroadCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;
import com.nest.res.bop.al01012026.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;
import com.nest.res.bop.al01012026.domain.BOPSpoilgCov;
import com.nest.res.bop.al01012026.domain.BOPClassificationBusnPrsnlPropCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationAutoServiceRisksSupplementalSchedule;
import com.nest.res.bop.al01012026.domain.BOPTheftLimitationsCoverage;
import com.nest.res.bop.al01012026.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
import com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsDirectDamage;
import com.nest.res.bop.al01012026.domain.BOPFunctlBusnPrsnlPropValtn;
import com.nest.res.bop.al01012026.domain.BOPClassificationValuablePapersCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationPermanentYardsStorageCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationBusnIncomeDependentPropCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationPlaygroundCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationSwimmingPoolCoverage;
import com.nest.res.bop.al01012026.domain.BOPElectronicDataLiabilityLimitedCov;
import com.nest.res.bop.al01012026.domain.BOPElectronicDataLiabilityBroadCov;
import com.nest.res.bop.al01012026.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification;
import com.nest.res.bop.al01012026.domain.BOPMotels;
import com.nest.res.bop.al01012026.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov;
import com.nest.res.bop.al01012026.domain.BOPClassificationAmusementAreaCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassificationCyberIncidentLiabilityCoverage;
import com.nest.res.bop.al01012026.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin;
import com.nest.res.bop.al01012026.domain.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds;
import com.nest.res.bop.al01012026.domain.BOPClassificationAccountsReceivableCoverage;
import com.nest.res.bop.al01012026.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;

public class BOPClassification  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPMotels BOPMotelsRule;
	private List<BOPCannabisPropertyCoverage> BOPCannabisPropertyCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElementRule;
	private com.nest.res.bop.al01012026.rules.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverageRule;
	private List<BOPResidentialCleaningServices> BOPResidentialCleaningServicesList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPClassificationCyberIncidentLiabilityCoverage BOPClassificationCyberIncidentLiabilityCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPClassificationElectronicDataLiabilityBroadCoverage BOPClassificationElectronicDataLiabilityBroadCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPClassificationPersonalPropertyOffPremisesCoverage BOPClassificationPersonalPropertyOffPremisesCoverageRule;
	private List<BOPHigherLimitsClassification> BOPHigherLimitsClassificationList;
	private List<BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd> BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList;
	private com.nest.res.bop.al01012026.rules.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsRule;
	private com.nest.res.bop.al01012026.rules.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtnRule;
	private List<BOPPesticideHerbicideCov> BOPPesticideHerbicideCovList;
	private List<BOPCondoCommlUnitOwnersOptionalCovs> BOPCondoCommlUnitOwnersOptionalCovsList;
	private List<BOPFoodContamination> BOPFoodContaminationList;
	private List<BOPNamedPerilsBusnPrsnlProp> BOPNamedPerilsBusnPrsnlPropList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverageRule;
	private List<BOPClassificationOutdoorPropertyCoverage> BOPClassificationOutdoorPropertyCoverageList;
	private com.nest.res.bop.al01012026.domain.BOPClassification BOPClassification;
	private com.nest.res.bop.al01012026.rules.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsRule;
	private List<BOPBrandsAndLabels> BOPBrandsAndLabelsList;
	private List<BOPSelfStorageFacilities> BOPSelfStorageFacilitiesList;
	private com.nest.res.bop.al01012026.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule;
	private List<BOPClassificationPersonalPropertyOffPremisesCoverage> BOPClassificationPersonalPropertyOffPremisesCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPResidentialCleaningServices BOPResidentialCleaningServicesRule;
	private List<BOPUtilitySrvcsTimeElement> BOPUtilitySrvcsTimeElementList;
	private List<BOPClassificationElectronicDataLiabilityLimitedCoverage> BOPClassificationElectronicDataLiabilityLimitedCoverageList;
	private List<BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds> BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList;
	private double LookupRateNumberFactorBldg_1 ;
	private List<BOPMotelLiabGuestsProp> BOPMotelLiabGuestsPropList;
	private com.nest.res.bop.al01012026.rules.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlPropRule;
	private List<BOPMedExpensesExcl> BOPMedExpensesExclList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule;
	private List<BOPClassificationElectronicDataLiabilityBroadCoverage> BOPClassificationElectronicDataLiabilityBroadCoverageList;
	private List<BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage> BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList;
	private List<BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP> BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList;
	private List<BOPSpoilgCov> BOPSpoilgCovList;
	private com.nest.res.bop.al01012026.rules.BOPFoodContamination BOPFoodContaminationRule;
	private List<BOPClassificationBusnPrsnlPropCoverage> BOPClassificationBusnPrsnlPropCoverageList;
	private List<BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage> BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList;
	private List<BOPClassificationAutoServiceRisksSupplementalSchedule> BOPClassificationAutoServiceRisksSupplementalScheduleList;
	private List<BOPTheftLimitationsCoverage> BOPTheftLimitationsCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPMedExpensesExcl BOPMedExpensesExclRule;
	private List<BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises> BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList;
	private com.nest.res.bop.al01012026.rules.BOPBrandsAndLabels BOPBrandsAndLabelsRule;
	private com.nest.res.bop.al01012026.rules.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule;
	private List<BOPUtilitySrvcsDirectDamage> BOPUtilitySrvcsDirectDamageList;
	private List<BOPFunctlBusnPrsnlPropValtn> BOPFunctlBusnPrsnlPropValtnList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationElectronicDataLiabilityLimitedCoverage BOPClassificationElectronicDataLiabilityLimitedCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovsRule;
	private com.nest.res.bop.al01012026.rules.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverageRule;
	private List<BOPClassificationValuablePapersCoverage> BOPClassificationValuablePapersCoverageList;
	private List<BOPClassificationPermanentYardsStorageCoverage> BOPClassificationPermanentYardsStorageCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule;
	private com.nest.res.bop.al01012026.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule;
	private com.nest.res.bop.al01012026.rules.BOPSpoilgCov BOPSpoilgCovRule;
	private com.nest.res.bop.al01012026.rules.BOPMotelLiabGuestsProp BOPMotelLiabGuestsPropRule;
	private double LookupRateNumberFactorBldg ;
	private com.nest.res.bop.al01012026.rules.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverageRule;
	private List<BOPClassificationBusnIncomeDependentPropCoverage> BOPClassificationBusnIncomeDependentPropCoverageList;
	private List<BOPClassificationPlaygroundCoverage> BOPClassificationPlaygroundCoverageList;
	private List<BOPClassificationSwimmingPoolCoverage> BOPClassificationSwimmingPoolCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule;
	private List<BOPElectronicDataLiabilityLimitedCov> BOPElectronicDataLiabilityLimitedCovList;
	private com.nest.res.bop.al01012026.rules.BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamageRule;
	private List<BOPElectronicDataLiabilityBroadCov> BOPElectronicDataLiabilityBroadCovList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverageRule;
	private List<BOPOptionalPerPersonMedicalExpensesCoverageClassification> BOPOptionalPerPersonMedicalExpensesCoverageClassificationList;
	private com.nest.res.bop.al01012026.rules.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule;
	private List<BOPMotels> BOPMotelsList;
	private List<BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov> BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverageRule;
	private List<BOPClassificationAmusementAreaCoverage> BOPClassificationAmusementAreaCoverageList;
	private List<BOPClassificationCyberIncidentLiabilityCoverage> BOPClassificationCyberIncidentLiabilityCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverageRule;
	private List<BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin> BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList;
	private com.nest.res.bop.al01012026.rules.BOPSelfStorageFacilities BOPSelfStorageFacilitiesRule;
	private List<BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds> BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList;
	private com.nest.res.bop.al01012026.rules.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverageRule;
	private List<BOPClassificationAccountsReceivableCoverage> BOPClassificationAccountsReceivableCoverageList;
	private List<BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants> BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList;
	
	
	
	public void ByPerilFire1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setByPerilFire1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPFire1Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setByPerilFire1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWindRate ()  {
	  this.BOPClassification.setByPerilWindRate(MathHelper.roundToThousand(this.BOPClassification.getByPerilWindBaseRate() * this.BOPClassification.getByPerilWind1Factor() * this.BOPClassification.getByPerilWind2Factor() * this.BOPClassification.getByPerilWind3Factor() * this.BOPClassification.getByPerilWind4Factor()));

	  
	}
	public void ByPerilWindstormOrHailExclBPPFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setByPerilWindstormOrHailExclBPPFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBusnPrsnlPropFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory")))));

	  
	}
	public void TerrorismBPPRate () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBPPRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABusnPrsnlPropRate",String.valueOf( "Y"))));

	  
	}
	public void ByPerilWaterRate ()  {
	  this.BOPClassification.setByPerilWaterRate(MathHelper.roundToThousand(this.BOPClassification.getByPerilWaterBaseRate() * this.BOPClassification.getByPerilWater1Factor() * this.BOPClassification.getByPerilWater2Factor() * this.BOPClassification.getByPerilWater3Factor() * this.BOPClassification.getByPerilWater4Factor()));

	  
	}
	public void terrsmPreBusnPrsnlPropPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setTerrsmPreBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBPPRate()) * MathHelper.getDoubleValue(this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getPublicProtectionFactorBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPClassification.setTerrsmPreBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBPPRate()) * MathHelper.getDoubleValue(this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getPublicProtectionFactorBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor"))) * MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBPPNuclBiolChemRadFactor())) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPClassification.setTerrsmPreBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBPPRate()) * MathHelper.getDoubleValue(this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getPublicProtectionFactorBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
			this.BOPClassification.setTerrsmPreBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void ProcessPremium8 ()  {
	  
	if(null != BOPMedExpensesExclList){
		for(BOPMedExpensesExcl BOPMedExpensesExcl:BOPMedExpensesExclList){
			BOPMedExpensesExclRule = new com.nest.res.bop.al01012026.rules.BOPMedExpensesExcl(BOPMedExpensesExcl);
			BOPMedExpensesExclRule.ProcessPremium2();

		}
	}
	  
	}
	public void ProcessPremium3 () throws LookupException,NumberFormatException {
	  
	ProcessPremium3_CommonRatingSub1();
	
	  
	}
	public  BOPClassification (com.nest.res.bop.al01012026.domain.BOPClassification BOPClassification)  {
	  this.BOPClassification = BOPClassification;
this.BOPCannabisPropertyCoverageList = BOPClassification.getBOPCannabisPropertyCoverage();
this.BOPResidentialCleaningServicesList = BOPClassification.getBOPResidentialCleaningServices();
this.BOPHigherLimitsClassificationList = BOPClassification.getBOPHigherLimitsClassification();
this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList = BOPClassification.getBOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd();
this.BOPPesticideHerbicideCovList = BOPClassification.getBOPPesticideHerbicideCov();
this.BOPCondoCommlUnitOwnersOptionalCovsList = BOPClassification.getBOPCondoCommlUnitOwnersOptionalCovs();
this.BOPFoodContaminationList = BOPClassification.getBOPFoodContamination();
this.BOPNamedPerilsBusnPrsnlPropList = BOPClassification.getBOPNamedPerilsBusnPrsnlProp();
this.BOPClassificationOutdoorPropertyCoverageList = BOPClassification.getBOPClassificationOutdoorPropertyCoverage();
this.BOPBrandsAndLabelsList = BOPClassification.getBOPBrandsAndLabels();
this.BOPSelfStorageFacilitiesList = BOPClassification.getBOPSelfStorageFacilities();
this.BOPClassificationPersonalPropertyOffPremisesCoverageList = BOPClassification.getBOPClassificationPersonalPropertyOffPremisesCoverage();
this.BOPUtilitySrvcsTimeElementList = BOPClassification.getBOPUtilitySrvcsTimeElement();
this.BOPClassificationElectronicDataLiabilityLimitedCoverageList = BOPClassification.getBOPClassificationElectronicDataLiabilityLimitedCoverage();
this.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList = BOPClassification.getBOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds();
this.BOPMotelLiabGuestsPropList = BOPClassification.getBOPMotelLiabGuestsProp();
this.BOPMedExpensesExclList = BOPClassification.getBOPMedExpensesExcl();
this.BOPClassificationElectronicDataLiabilityBroadCoverageList = BOPClassification.getBOPClassificationElectronicDataLiabilityBroadCoverage();
this.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList = BOPClassification.getBOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage();
this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList = BOPClassification.getBOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP();
this.BOPSpoilgCovList = BOPClassification.getBOPSpoilgCov();
this.BOPClassificationBusnPrsnlPropCoverageList = BOPClassification.getBOPClassificationBusnPrsnlPropCoverage();
this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList = BOPClassification.getBOPClassificationLiabMedExpensesBusnPrsnlPropCoverage();
this.BOPClassificationAutoServiceRisksSupplementalScheduleList = BOPClassification.getBOPClassificationAutoServiceRisksSupplementalSchedule();
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
this.BOPMotelsList = BOPClassification.getBOPMotels();
this.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList = BOPClassification.getBOPExtendedReportingPeriodElectronicDataLiabilityBroadCov();
this.BOPClassificationAmusementAreaCoverageList = BOPClassification.getBOPClassificationAmusementAreaCoverage();
this.BOPClassificationCyberIncidentLiabilityCoverageList = BOPClassification.getBOPClassificationCyberIncidentLiabilityCoverage();
this.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList = BOPClassification.getBOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin();
this.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList = BOPClassification.getBOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds();
this.BOPClassificationAccountsReceivableCoverageList = BOPClassification.getBOPClassificationAccountsReceivableCoverage();
this.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList = BOPClassification.getBOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants();

	  
	}
	public void ByPerilTheft3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilTheft3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPTheft3Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setByPerilTheft3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilTheft1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setByPerilTheft1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPTheft1Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setByPerilTheft1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium6 () throws LookupException,NumberFormatException {
	  
	ProcessPremium6_CommonRatingSub1();
	
	  
	}
	public void ByPerilFire4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilFire4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPFire4Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getClassCode())))));
		}
		else{
			this.BOPClassification.setByPerilFire4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void FinalMaxBusnPrsnlPropRateFlag ()  {
	  this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlag(this.BOPClassification.getFinalMaxBusnPrsnlPropRateFlagTemp_1());

	  
	}
	public void ByPerilWind4Factor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) == null && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilWind4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWind4Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getClassCode())))));
		}
		else{
			this.BOPClassification.setByPerilWind4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium7_CommonRatingSub2 ()  {
	  
	StructurePctOwnerOccupied();
	
	terrsmPreBusnPrsnlPropPremiumTemp_1();
	
	terrsmPostBusnPrsnlPropPremiumTemp_1();
	
	TerrsmBusnPrsnlPropPremium();
	
	AutoServiceFireDeptServiceChargePremium();
	
	AutoServiceOutdoorPropertyPremium();
	
	AutoServiceEmployeesToolsPremium();
	
	AutoServiceDefectiveProductsPremium();
	
	bppRateToUseAutoService_1();
	
	AutoServiceLossOrDamageToLessorsPropertyPremium();
	
	  
	}
	public void TerrorismCovUnderlyingPolicyStatCode () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) != 0.0){
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPCapLossesFromCertfdActsTerrsm")) != null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPLmtdTerrsmExclOtherThanCertfdActsCapLossesFromCertfdActs")) != null)){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "No")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPCapLossesFromCertfdActsTerrsm")) != null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPLmtdTerrsmExclOtherThanCertfdActsCapLossesFromCertfdActs")) != null)){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "Yes" ),String.valueOf( "No")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)) && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPCapLossesFromCertfdActsTerrsm")) != null){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "Yes")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)) && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPCapLossesFromCertfdActsTerrsm")) != null){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "Yes" ),String.valueOf( "Yes")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPExclCertfdActsTerrsmCovFireLosses")) != null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPExclCertfdActsTerrsmAndOtherActsTerrsm")) != null){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "No")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPExclCertfdActsTerrsmCovFireLosses")) != null){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "Yes")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) > MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses")) != null || (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPLimitationsOfCovForCertfdActsTerrsm")) != null)){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "No" ),String.valueOf( "Yes")))));
		}
		else{
		if(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/Premium"))) == MathHelper.getDoubleValue(0.0)) && ((XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses")) != null || (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPLimitationsOfCovForCertfdActsTerrsm")) != null)){
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("TerrorismCovUnderlyingPolicyStatCode",String.valueOf( "Yes" ),String.valueOf( "Yes")))));
		}
		else{
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
		}
		}
		}
		}
		}
		}
		}
		else{
			this.BOPClassification.setTerrorismCovUnderlyingPolicyStatCode(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void ProcessPremium10 ()  {
	  
	ProcessPremium10_CommonRatingSub1();
	
	  
	}
	public void RateNumberFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setRateNumberFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBPP",String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setRateNumberFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWater1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setByPerilWater1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWater1Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setByPerilWater1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BusnPrsnlPropRate () throws LookupException,NumberFormatException {
	  
		if(!(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")))){
		if(!(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setBusnPrsnlPropRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void ByPerilWind3Factor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) == null && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilWind3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWind3Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setByPerilWind3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilFire2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilFire2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPFire2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassification.setByPerilFire2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium11 () throws LookupException,NumberFormatException {
	  
	ProcessPremium11_CommonRatingSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void PredominantTypeFlag ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(this.BOPClassification.getPredominantTypeFlagTemp_1()));
		}
	  
	}
	public void AutoServiceLossOrDamageToLessorsPropertyPremium ()  {
	  this.BOPClassification.setAutoServiceLossOrDamageToLessorsPropertyPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPClassification.getBppRateToUseAutoService_1() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getWindstormOrHailExclBusnPrsnlPropFactor() * this.BOPClassification.getLCM())) * this.BOPClassification.getRateNumberFactorBPP() * this.BOPClassification.getConstructionTypeFactorBPP() * this.BOPClassification.getBusnPersonalPropertyLimitOfInsuranceRelativityFactor() * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BldgCodeEffectivenessGradeFactor"))) * this.BOPClassification.getSprinkleredFactorBPP() * this.BOPClassification.getAutoServiceLossOrDamageToLessorsPropertyFactor()) * MathHelper.getDoubleValue(this.BOPClassification.getAutoServiceLossOrDamageToLessorsPropertyLimit()) / MathHelper.getDoubleValue(100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../IRPMFactor")))));

	  
	}
	public void AutoServiceEmployeesToolsPremium ()  {
	  this.BOPClassification.setAutoServiceEmployeesToolsPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPClassification.getAutoServiceEmployeesToolsRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../InlandMarineLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../IRPMFactor")))));

	  
	}
	public void PredominantOccupancy ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
		if(this.BOPClassification.getPredominantTypeFlag().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(this.BOPClassification.getPredominantOccupancyMixedFlagTemp_1()));
		}
		else{
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(this.BOPClassification.getPredominantTypeNotMixedFlagTemp_1()));
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPClassification.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../CommercialPropertyLCM"))));

	  
	}
	public void ByPerilTheftRate ()  {
	  this.BOPClassification.setByPerilTheftRate(MathHelper.roundToThousand(this.BOPClassification.getByPerilTheftBaseRate() * this.BOPClassification.getByPerilTheft1Factor() * this.BOPClassification.getByPerilTheft2Factor() * this.BOPClassification.getByPerilTheft3Factor() * this.BOPClassification.getByPerilTheft4Factor()));

	  
	}
	public void ProcessPremium6_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	locationMoneyFlagTemp_1();
	
	LocationMoneyFlag();
	
	predominantTypeFlagTemp_1();
	
	PredominantTypeFlag();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	predominantOccupancyMixedFlagTemp_1();
	
	PredominantOccupancy();
	
	predominantTypeNotMixedFlagTemp_1();
	
	  
	}
	public void terrsmPostBusnPrsnlPropPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setTerrsmPostBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate()) * MathHelper.getDoubleValue(this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getPublicProtectionFactorBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPClassification.setTerrsmPostBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate()) * MathHelper.getDoubleValue(this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getPublicProtectionFactorBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor"))) * MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBPPNuclBiolChemRadFactor())) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPClassification.setTerrsmPostBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate()) * MathHelper.getDoubleValue(this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getPublicProtectionFactorBPP()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
			this.BOPClassification.setTerrsmPostBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPClassification.setTerrsmPostBusnPrsnlPropPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void finalMaxBusnPrsnlPropRateFlagTemp_1 ()  {
	  this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlagTemp_1(MathHelper.getStringValue("Yes"));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))) != 0.0){
		if(this.BOPClassification.getFinalBusnPrsnlPropRate() < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate")))){
			this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}		}

	  
	}
	public void ByPerilWater3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilWater3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWater3Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setByPerilWater3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AutoServiceDefectiveProductsDedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getAutoServiceDefectiveProductsDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setAutoServiceDefectiveProductsDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DefectiveProductsOptionalDeductibleFactor",String.valueOf(this.BOPClassification.getAutoServiceDefectiveProductsDeductible())))));
		}
		else{
			this.BOPClassification.setAutoServiceDefectiveProductsDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void LookupRateNumberFactorBldg  () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
		if(this.BOPClassification.getPredominantTypeFlag().equals(MathHelper.getStringValue("Yes"))){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("Yes"))){
		if(!(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))){
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"RateNumber"))).equals("")){
			this.LookupRateNumberFactorBldg  = MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBldg",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"RateNumber"))));
		}
		else{
			this.LookupRateNumberFactorBldg  = MathHelper.getDoubleValue(0.0);
		}
		}
		}
		}		}

		}
		}
	  
	}
	public void busnPrsnlPropCreditFactor_1 ()  {
	  
		if(!this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage")) != null){
			this.BOPClassification.setBusnPrsnlPropCreditFactor_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage/BusnPrsnlPropCreditFactor")))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropCreditFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void TerrsmBusnPrsnlPropPremium ()  {
	  this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmPreBusnPrsnlPropPremiumTemp_1() + this.BOPClassification.getTerrsmPostBusnPrsnlPropPremiumTemp_1()));

	  
	}
	public void StructurePropertyType ()  {
	  this.BOPClassification.setStructurePropertyType((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))));

	  
	}
	public void ByPerilHurricaneRate ()  {
	  this.BOPClassification.setByPerilHurricaneRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPClassification.getByPerilHurricaneBaseRate() * this.BOPClassification.getLCM()) * this.BOPClassification.getByPerilHurricane1Factor() * this.BOPClassification.getByPerilHurricane2Factor() * this.BOPClassification.getByPerilHurricane3Factor() * this.BOPClassification.getByPerilHurricane4Factor()));

	  
	}
	public void ByPerilWater2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilWater2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPTheft2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassification.setByPerilWater2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismBPPNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBPPNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABPPNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	TotBusnPrsnlPropLimit();
	
	  
	}
	public void ByPerilHurricane1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setByPerilHurricane1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPHurricane1Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setByPerilHurricane1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium4 () throws LookupException,NumberFormatException {
	  
	ProcessPremium4_CommonRatingSub1();
	
	  
	}
	public void AutoServiceOutdoorPropertyPremium ()  {
	  
		if(this.BOPClassification.getAutoServiceOutdoorPropertyLimit() > MathHelper.getIntegerValue(5000.0)){
			this.BOPClassification.setAutoServiceOutdoorPropertyPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPClassification.getFinalBusnPrsnlPropRate() * this.BOPClassification.getAutoServiceOutdoorPropertyFactor()) * (MathHelper.getDoubleValue(this.BOPClassification.getAutoServiceOutdoorPropertyLimit()) - MathHelper.getDoubleValue(5000.0)) / MathHelper.getDoubleValue(100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPClassification.setAutoServiceOutdoorPropertyPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AutoServiceLossOrDamageToLessorsPropertyFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setAutoServiceLossOrDamageToLessorsPropertyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToLessorsPropertyFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium11_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	TerrorismCovUnderlyingPolicyStatCode();
	
	  
	}
	public void ByPerilWind2Factor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) == null && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilWind2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWind2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassification.setByPerilWind2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TotBusnPrsnlPropLimit ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassification,"BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassification.setTotBusnPrsnlPropLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPClassification.getBusnPrsnlPropLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))))));
		}
		else{
			this.BOPClassification.setTotBusnPrsnlPropLimit(MathHelper.getIntegerValue(this.BOPClassification.getBusnPrsnlPropLimit()));
		}
	  
	}
	public void ByPerilHurricane3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilHurricane3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPHurricane3Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setByPerilHurricane3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWind1Factor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) == null && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setByPerilWind1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWind1Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setByPerilWind1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium5 () throws LookupException,NumberFormatException {
	  
	ProcessPremium5_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium10_CommonRatingSub1 ()  {
	  
	finalMaxBusnPrsnlPropRateFlagTemp_1();
	
	FinalMaxBusnPrsnlPropRateFlag();
	
	  
	}
	public void LCM ()  {
	  this.BOPClassification.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../LCM"))));

	  
	}
	public void predominantTypeNotMixedFlagTemp_1 ()  {
	  
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed")))){
			this.BOPClassification.setPredominantTypeNotMixedFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
			this.BOPClassification.setPredominantTypeNotMixedFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		else{
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
		if(this.BOPClassification.getRateNumberFactorBPP() < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"RateNumberFactorBPP")))){
			this.BOPClassification.setPredominantTypeNotMixedFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		}
		}		}

		}
	  
	}
	public void predominantOccupancyMixedFlagTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setPredominantOccupancyMixedFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		if(this.BOPClassification.getPredominantTypeFlag().equals(MathHelper.getStringValue("Yes"))){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("Yes"))){
		if(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
			this.BOPClassification.setPredominantOccupancyMixedFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		else{
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(this.LookupRateNumberFactorBldg  < this.LookupRateNumberFactorBldg_1 ){
			this.BOPClassification.setPredominantOccupancyMixedFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		}
		}		}

		}
		}
	  
	}
	public void bppRateToUseAutoService_1 ()  {
	  
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
			this.BOPClassification.setBppRateToUseAutoService_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropRateRABOP())));
		}
		else{
			this.BOPClassification.setBppRateToUseAutoService_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropRate())));
		}
	  
	}
	public void ByPerilWaterBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilWaterBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPBaseRate",String.valueOf( "Water")))));
		}
		else{
			this.BOPClassification.setByPerilWaterBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AutoServiceDefectiveProductsFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setAutoServiceDefectiveProductsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DefectiveProductsFactor",String.valueOf( "Y"))));

	  
	}
	public void ClassPropertyType ()  {
	  
		if(!this.BOPClassification.getStructurePropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setClassPropertyType(MathHelper.getStringValue(this.BOPClassification.getStructurePropertyType()));
		}
	  
	}
	public void FinalBusnPrsnlPropRate ()  {
	  
		if(!this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setFinalBusnPrsnlPropRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(((MathHelper.roundToThousand(this.BOPClassification.getBppRateToUse_1() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getBusnPrsnlPropCreditFactor_1() * this.BOPClassification.getLCM())) - MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPClassification.getWindstormOrHailExclBusnPrsnlPropFactor() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getBusnPrsnlPropCreditFactor_1() * this.BOPClassification.getLCM())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindMitigationDiscount"))))) * this.BOPClassification.getRateNumberFactorBPP() * this.BOPClassification.getConstructionTypeFactorBPP() * this.BOPClassification.getBusnPersonalPropertyLimitOfInsuranceRelativityFactor() * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BldgCodeEffectivenessGradeFactor"))) * this.BOPClassification.getSprinkleredFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor"))))));
		}
		else{
			this.BOPClassification.setFinalBusnPrsnlPropRate(MathHelper.getDoubleValue(MathHelper.roundToThousand((this.BOPClassification.getByPerilTotalRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BldgCodeEffectivenessGradeFactor"))))));
		}
	  
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
	
	ByPerilHurricaneBaseRate();
	
	ByPerilHurricane1Factor();
	
	ByPerilHurricane2Factor();
	
	ByPerilHurricane3Factor();
	
	ByPerilHurricane4Factor();
	
	ByPerilHurricaneRate();
	
	ByPerilWindstormOrHailExclBPPFactor();
	
	ByPerilFireBaseRate();
	
	ByPerilWindBaseRate();
	
	ByPerilTheftBaseRate();
	
	ByPerilWaterBaseRate();
	
	ByPerilFire1Factor();
	
	ByPerilFire2Factor();
	
	ByPerilFire3Factor();
	
	ByPerilFire4Factor();
	
	ByPerilWind1Factor();
	
	ByPerilWind2Factor();
	
	ByPerilWind3Factor();
	
	ByPerilWind4Factor();
	
	ByPerilTheft1Factor();
	
	ByPerilTheft2Factor();
	
	ByPerilTheft3Factor();
	
	ByPerilTheft4Factor();
	
	ByPerilWater1Factor();
	
	ByPerilWater2Factor();
	
	ByPerilWater3Factor();
	
	ByPerilWater4Factor();
	
	ByPerilFireRate();
	
	ByPerilWindRate();
	
	ByPerilTheftRate();
	
	ByPerilWaterRate();
	
	ByPerilTotalRate();
	
	bppRateToUse_1();
	
	busnPrsnlPropCreditFactor_1();
	
	FinalBusnPrsnlPropRate();
	
	TerrorismBPPRate();
	
	TerrorismBusnPrsnlPropFullRate();
	
	TerrorismBPPNuclBiolChemRadFactor();
	
	BusnPrsnlPropRateGrade();
	
	AutoServiceFireDeptServiceChargeRate();
	
	AutoServiceOutdoorPropertyFactor();
	
	AutoServiceEmployeesToolsRate();
	
	AutoServiceDefectiveProductsDedFactor();
	
	AutoServiceDefectiveProductsFactor();
	
	AutoServiceLossOrDamageToLessorsPropertyFactor();
	
	  
	}
	public void ConstructionTypeFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setConstructionTypeFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ConstructionTypeFactorBPP",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))))));
		}
		else{
			this.BOPClassification.setConstructionTypeFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CurrentMoneyRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setCurrentMoneyRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory")),String.valueOf(this.BOPClassification.getClassPropertyType())))));
		}
		else{
			this.BOPClassification.setCurrentMoneyRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium9 ()  {
	  
	  
	}
	public void ByPerilTheft4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilTheft4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPTheft4Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getClassCode())))));
		}
		else{
			this.BOPClassification.setByPerilTheft4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AutoServiceDefectiveProductsPremium ()  {
	  
		if(this.BOPClassification.getAutoServiceDefectiveProductsCoverage().equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%"))){
			this.BOPClassification.setAutoServiceDefectiveProductsPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BOPStructureLiabMedExpensesBldgCoverage/Premium"))) * this.BOPClassification.getAutoServiceDefectiveProductsFactor() * this.BOPClassification.getAutoServiceDefectiveProductsDedFactor())));
		}
		else{
		if(this.BOPClassification.getAutoServiceDefectiveProductsCoverage().equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("50% or more"))){
			this.BOPClassification.setAutoServiceDefectiveProductsPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium"))) * this.BOPClassification.getAutoServiceDefectiveProductsFactor() * this.BOPClassification.getAutoServiceDefectiveProductsDedFactor())));
		}
		else{
			this.BOPClassification.setAutoServiceDefectiveProductsPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void ByPerilHurricaneBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilHurricaneBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPBaseRate",String.valueOf( "Hurricane")))));
		}
		else{
			this.BOPClassification.setByPerilHurricaneBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void bppRateToUse_1 ()  {
	  
		if(!this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
			this.BOPClassification.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropRateRABOP()) + MathHelper.getDoubleValue(this.BOPClassification.getHurricaneLossCostsBPP()))));
		}
		else{
			this.BOPClassification.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropRate())));
		}
		}
	  
	}
	public void ProcessPremium7 () throws LookupException,NumberFormatException {
	  
	ProcessPremium7_CommonRatingSub1();
	
	if(null != BOPClassificationBusnPrsnlPropCoverageList){
		for(BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage:BOPClassificationBusnPrsnlPropCoverageList){
			BOPClassificationBusnPrsnlPropCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationBusnPrsnlPropCoverage(BOPClassificationBusnPrsnlPropCoverage);
			BOPClassificationBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBrandsAndLabelsList){
		for(BOPBrandsAndLabels BOPBrandsAndLabels:BOPBrandsAndLabelsList){
			BOPBrandsAndLabelsRule = new com.nest.res.bop.al01012026.rules.BOPBrandsAndLabels(BOPBrandsAndLabels);
			BOPBrandsAndLabelsRule.ProcessPremium1();

		}
	}
	if(null != BOPFunctlBusnPrsnlPropValtnList){
		for(BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn:BOPFunctlBusnPrsnlPropValtnList){
			BOPFunctlBusnPrsnlPropValtnRule = new com.nest.res.bop.al01012026.rules.BOPFunctlBusnPrsnlPropValtn(BOPFunctlBusnPrsnlPropValtn);
			BOPFunctlBusnPrsnlPropValtnRule.ProcessPremium2();

		}
	}
	if(null != BOPClassificationAccountsReceivableCoverageList){
		for(BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage:BOPClassificationAccountsReceivableCoverageList){
			BOPClassificationAccountsReceivableCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationAccountsReceivableCoverage(BOPClassificationAccountsReceivableCoverage);
			BOPClassificationAccountsReceivableCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationAmusementAreaCoverageList){
		for(BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage:BOPClassificationAmusementAreaCoverageList){
			BOPClassificationAmusementAreaCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationAmusementAreaCoverage(BOPClassificationAmusementAreaCoverage);
			BOPClassificationAmusementAreaCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		for(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage:BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
			BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage);
			BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule.CommonRating1();

		}
	}
	if(null != BOPClassificationBusnIncomeDependentPropCoverageList){
		for(BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage:BOPClassificationBusnIncomeDependentPropCoverageList){
			BOPClassificationBusnIncomeDependentPropCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationBusnIncomeDependentPropCoverage(BOPClassificationBusnIncomeDependentPropCoverage);
			BOPClassificationBusnIncomeDependentPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList){
		for(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage:BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList){
			BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage);
			BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationCyberIncidentLiabilityCoverageList){
		for(BOPClassificationCyberIncidentLiabilityCoverage BOPClassificationCyberIncidentLiabilityCoverage:BOPClassificationCyberIncidentLiabilityCoverageList){
			BOPClassificationCyberIncidentLiabilityCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationCyberIncidentLiabilityCoverage(BOPClassificationCyberIncidentLiabilityCoverage);
			BOPClassificationCyberIncidentLiabilityCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationElectronicDataLiabilityBroadCoverageList){
		for(BOPClassificationElectronicDataLiabilityBroadCoverage BOPClassificationElectronicDataLiabilityBroadCoverage:BOPClassificationElectronicDataLiabilityBroadCoverageList){
			BOPClassificationElectronicDataLiabilityBroadCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationElectronicDataLiabilityBroadCoverage(BOPClassificationElectronicDataLiabilityBroadCoverage);
			BOPClassificationElectronicDataLiabilityBroadCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationElectronicDataLiabilityLimitedCoverageList){
		for(BOPClassificationElectronicDataLiabilityLimitedCoverage BOPClassificationElectronicDataLiabilityLimitedCoverage:BOPClassificationElectronicDataLiabilityLimitedCoverageList){
			BOPClassificationElectronicDataLiabilityLimitedCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationElectronicDataLiabilityLimitedCoverage(BOPClassificationElectronicDataLiabilityLimitedCoverage);
			BOPClassificationElectronicDataLiabilityLimitedCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationOutdoorPropertyCoverageList){
		for(BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage:BOPClassificationOutdoorPropertyCoverageList){
			BOPClassificationOutdoorPropertyCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationOutdoorPropertyCoverage(BOPClassificationOutdoorPropertyCoverage);
			BOPClassificationOutdoorPropertyCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPermanentYardsStorageCoverageList){
		for(BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage:BOPClassificationPermanentYardsStorageCoverageList){
			BOPClassificationPermanentYardsStorageCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationPermanentYardsStorageCoverage(BOPClassificationPermanentYardsStorageCoverage);
			BOPClassificationPermanentYardsStorageCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPersonalPropertyOffPremisesCoverageList){
		for(BOPClassificationPersonalPropertyOffPremisesCoverage BOPClassificationPersonalPropertyOffPremisesCoverage:BOPClassificationPersonalPropertyOffPremisesCoverageList){
			BOPClassificationPersonalPropertyOffPremisesCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationPersonalPropertyOffPremisesCoverage(BOPClassificationPersonalPropertyOffPremisesCoverage);
			BOPClassificationPersonalPropertyOffPremisesCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPlaygroundCoverageList){
		for(BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage:BOPClassificationPlaygroundCoverageList){
			BOPClassificationPlaygroundCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationPlaygroundCoverage(BOPClassificationPlaygroundCoverage);
			BOPClassificationPlaygroundCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationSwimmingPoolCoverageList){
		for(BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage:BOPClassificationSwimmingPoolCoverageList){
			BOPClassificationSwimmingPoolCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationSwimmingPoolCoverage(BOPClassificationSwimmingPoolCoverage);
			BOPClassificationSwimmingPoolCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationValuablePapersCoverageList){
		for(BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage:BOPClassificationValuablePapersCoverageList){
			BOPClassificationValuablePapersCoverageRule = new com.nest.res.bop.al01012026.rules.BOPClassificationValuablePapersCoverage(BOPClassificationValuablePapersCoverage);
			BOPClassificationValuablePapersCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondoCommlUnitOwnersOptionalCovsList){
		for(BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs:BOPCondoCommlUnitOwnersOptionalCovsList){
			BOPCondoCommlUnitOwnersOptionalCovsRule = new com.nest.res.bop.al01012026.rules.BOPCondoCommlUnitOwnersOptionalCovs(BOPCondoCommlUnitOwnersOptionalCovs);
			BOPCondoCommlUnitOwnersOptionalCovsRule.ProcessPremium1();

		}
	}
	if(null != BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList){
		for(BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds:BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList){
			BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsRule = new com.nest.res.bop.al01012026.rules.BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds(BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds);
			BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsRule.ProcessPremium1();

		}
	}
	if(null != BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList){
		for(BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants:BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList){
			BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule = new com.nest.res.bop.al01012026.rules.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants(BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants);
			BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule.ProcessPremium1();

		}
	}
	if(null != BOPFoodContaminationList){
		for(BOPFoodContamination BOPFoodContamination:BOPFoodContaminationList){
			BOPFoodContaminationRule = new com.nest.res.bop.al01012026.rules.BOPFoodContamination(BOPFoodContamination);
			BOPFoodContaminationRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList){
		for(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP:BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList){
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule = new com.nest.res.bop.al01012026.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP);
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList){
		for(BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds:BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsList){
			BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsRule = new com.nest.res.bop.al01012026.rules.BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds(BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds);
			BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsdsRule.ProcessPremium1();

		}
	}
	if(null != BOPMedExpensesExclList){
		for(BOPMedExpensesExcl BOPMedExpensesExcl:BOPMedExpensesExclList){
			BOPMedExpensesExclRule = new com.nest.res.bop.al01012026.rules.BOPMedExpensesExcl(BOPMedExpensesExcl);
			BOPMedExpensesExclRule.ProcessPremium1();

		}
	}
	if(null != BOPMotelLiabGuestsPropList){
		for(BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp:BOPMotelLiabGuestsPropList){
			BOPMotelLiabGuestsPropRule = new com.nest.res.bop.al01012026.rules.BOPMotelLiabGuestsProp(BOPMotelLiabGuestsProp);
			BOPMotelLiabGuestsPropRule.ProcessPremium1();

		}
	}
	if(null != BOPMotelsList){
		for(BOPMotels BOPMotels:BOPMotelsList){
			BOPMotelsRule = new com.nest.res.bop.al01012026.rules.BOPMotels(BOPMotels);
			BOPMotelsRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsBusnPrsnlPropList){
		for(BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp:BOPNamedPerilsBusnPrsnlPropList){
			BOPNamedPerilsBusnPrsnlPropRule = new com.nest.res.bop.al01012026.rules.BOPNamedPerilsBusnPrsnlProp(BOPNamedPerilsBusnPrsnlProp);
			BOPNamedPerilsBusnPrsnlPropRule.ProcessPremium1();

		}
	}
	if(null != BOPOptionalPerPersonMedicalExpensesCoverageClassificationList){
		for(BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification:BOPOptionalPerPersonMedicalExpensesCoverageClassificationList){
			BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule = new com.nest.res.bop.al01012026.rules.BOPOptionalPerPersonMedicalExpensesCoverageClassification(BOPOptionalPerPersonMedicalExpensesCoverageClassification);
			BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule.ProcessPremium1();

		}
	}
	if(null != BOPResidentialCleaningServicesList){
		for(BOPResidentialCleaningServices BOPResidentialCleaningServices:BOPResidentialCleaningServicesList){
			BOPResidentialCleaningServicesRule = new com.nest.res.bop.al01012026.rules.BOPResidentialCleaningServices(BOPResidentialCleaningServices);
			BOPResidentialCleaningServicesRule.ProcessPremium1();

		}
	}
	if(null != BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList){
		for(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin:BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList){
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule = new com.nest.res.bop.al01012026.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin);
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule.ProcessPremium1();

		}
	}
	if(null != BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList){
		for(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd:BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList){
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule = new com.nest.res.bop.al01012026.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd);
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule.ProcessPremium1();

		}
	}
	if(null != BOPSelfStorageFacilitiesList){
		for(BOPSelfStorageFacilities BOPSelfStorageFacilities:BOPSelfStorageFacilitiesList){
			BOPSelfStorageFacilitiesRule = new com.nest.res.bop.al01012026.rules.BOPSelfStorageFacilities(BOPSelfStorageFacilities);
			BOPSelfStorageFacilitiesRule.ProcessPremium1();

		}
	}
	if(null != BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList){
		for(BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises:BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList){
			BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule = new com.nest.res.bop.al01012026.rules.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises(BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises);
			BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule.ProcessPremium1();

		}
	}
	if(null != BOPSpoilgCovList){
		for(BOPSpoilgCov BOPSpoilgCov:BOPSpoilgCovList){
			BOPSpoilgCovRule = new com.nest.res.bop.al01012026.rules.BOPSpoilgCov(BOPSpoilgCov);
			BOPSpoilgCovRule.ProcessPremium1();

		}
	}
	if(null != BOPUtilitySrvcsDirectDamageList){
		for(BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamage:BOPUtilitySrvcsDirectDamageList){
			BOPUtilitySrvcsDirectDamageRule = new com.nest.res.bop.al01012026.rules.BOPUtilitySrvcsDirectDamage(BOPUtilitySrvcsDirectDamage);
			BOPUtilitySrvcsDirectDamageRule.ProcessPremium1();

		}
	}
	if(null != BOPUtilitySrvcsTimeElementList){
		for(BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElement:BOPUtilitySrvcsTimeElementList){
			BOPUtilitySrvcsTimeElementRule = new com.nest.res.bop.al01012026.rules.BOPUtilitySrvcsTimeElement(BOPUtilitySrvcsTimeElement);
			BOPUtilitySrvcsTimeElementRule.ProcessPremium1();

		}
	}
	ProcessPremium7_CommonRatingSub2();
	
	  
	}
	public void BusnPrsnlPropSusceptibilityGrade () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassDescription().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setBusnPrsnlPropSusceptibilityGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("SprinklerLeakageSusceptibilityGrade",String.valueOf(this.BOPClassification.getClassDescription())))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropSusceptibilityGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void ProcessPremium4_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	RateNumberFactorBPP();
	
	  
	}
	public void AutoServiceFireDeptServiceChargePremium ()  {
	  this.BOPClassification.setAutoServiceFireDeptServiceChargePremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPClassification.getAutoServiceFireDeptServiceChargeRate() * this.BOPClassification.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../IRPMFactor")))));

	  
	}
	public void HurricaneLossCostsBPP () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setHurricaneLossCostsBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HurricaneLossCostsBPP",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))))));
		}
		else{
			this.BOPClassification.setHurricaneLossCostsBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BusnPersonalPropertyLimitOfInsuranceRelativityFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getTotBusnPrsnlPropLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setBusnPersonalPropertyLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnPropLimitOfInsRelativityFactor",String.valueOf(this.BOPClassification.getTotBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setBusnPersonalPropertyLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void AutoServiceFireDeptServiceChargeRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getAutoServiceFireDeptServiceChargeLimit().equals(MathHelper.getStringValue("7500"))){
			this.BOPClassification.setAutoServiceFireDeptServiceChargeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FireDeptServiceCharge",String.valueOf( 7500)))));
		}
		else{
		if(this.BOPClassification.getAutoServiceFireDeptServiceChargeLimit().equals(MathHelper.getStringValue("10000"))){
			this.BOPClassification.setAutoServiceFireDeptServiceChargeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FireDeptServiceCharge",String.valueOf( 10000)))));
		}
		else{
			this.BOPClassification.setAutoServiceFireDeptServiceChargeRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void WindstormOrHailExclBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) != null) || ((XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPClassification.setWindstormOrHailExclBusnPrsnlPropFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBusnPrsnlPropFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))))));
		}
		else{
			this.BOPClassification.setWindstormOrHailExclBusnPrsnlPropFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void predominantTypeFlagTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("Restaurant"))){
		if(this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Full Service")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Quick Service"))){
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("Apartment"))){
		if(this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment Condominium Association")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment"))){
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("Office"))){
		if(this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("OfficeApartmentOther"))){
		if(!this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office")) && !this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office Condominium")) && !this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment Condominium Association")) && !this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment"))){
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
			this.BOPClassification.setPredominantTypeFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		}
		}
		}
		}
	  
	}
	public void ProcessPremium5_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	locationMoneyFlagTemp_1();
	
	LocationMoneyFlag();
	
	predominantTypeFlagTemp_1();
	
	PredominantTypeFlag();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	predominantOccupancyMixedFlagTemp_1();
	
	PredominantOccupancy();
	
	predominantTypeNotMixedFlagTemp_1();
	
	  
	}
	public void ByPerilHurricane2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilHurricane2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPHurricane2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassification.setByPerilHurricane2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPClassification.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../GeneralLiabilityLCM"))));

	  
	}
	public void BusnPrsnlPropRateGrade () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassDescription().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setBusnPrsnlPropRateGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("EQBusnPrsnlPropRateGrade",String.valueOf(this.BOPClassification.getClassDescription())))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void ByPerilTheftBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilTheftBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPBaseRate",String.valueOf( "Theft")))));
		}
		else{
			this.BOPClassification.setByPerilTheftBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CrimeLCM ()  {
	  this.BOPClassification.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../CrimeLCM"))));

	  
	}
	public void ProcessPremium3_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	locationMoneyFlagTemp_1();
	
	LocationMoneyFlag();
	
	predominantTypeFlagTemp_1();
	
	PredominantTypeFlag();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	predominantOccupancyMixedFlagTemp_1();
	
	PredominantOccupancy();
	
	predominantTypeNotMixedFlagTemp_1();
	
	  
	}
	public void ByPerilTheft2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilTheft2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPTheft2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassification.setByPerilTheft2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void SprinkleredFactorBPP () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("Yes"))){
		if(!this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setSprinkleredFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SprinkleredFactorBPP",String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setSprinkleredFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPClassification.setSprinkleredFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void ByPerilFire3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilFire3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPFire3Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setByPerilFire3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilFireRate ()  {
	  this.BOPClassification.setByPerilFireRate(MathHelper.roundToThousand(this.BOPClassification.getByPerilFireBaseRate() * this.BOPClassification.getByPerilFire1Factor() * this.BOPClassification.getByPerilFire2Factor() * this.BOPClassification.getByPerilFire3Factor() * this.BOPClassification.getByPerilFire4Factor()));

	  
	}
	public void ByPerilFireBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilFireBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPBaseRate",String.valueOf( "Fire")))));
		}
		else{
			this.BOPClassification.setByPerilFireBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PublicProtectionFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setPublicProtectionFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PublicProtectionClassPPCFactorBPP",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPClassification.setPublicProtectionFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void AutoServiceOutdoorPropertyFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setAutoServiceOutdoorPropertyFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OutdoorPropertyFactor",String.valueOf( "Y"))));

	  
	}
	public void AutoServiceEmployeesToolsRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getAutoServiceEmployeesToolsLimit().equals(MathHelper.getStringValue("25000")) || this.BOPClassification.getAutoServiceEmployeesToolsLimit().equals(MathHelper.getStringValue("50000"))){
			this.BOPClassification.setAutoServiceEmployeesToolsRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EmployeesToolsAdditionalRate",String.valueOf(this.BOPClassification.getAutoServiceEmployeesToolsLimit())))));
		}
		else{
			this.BOPClassification.setAutoServiceEmployeesToolsRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilTotalRate ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) != null){
			this.BOPClassification.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getByPerilFireRate() + this.BOPClassification.getByPerilTheftRate() + this.BOPClassification.getByPerilWaterRate() + this.BOPClassification.getByPerilHurricaneRate())));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) == null && (XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage")) == null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getByPerilFireRate() + (this.BOPClassification.getByPerilWindRate() * (MathHelper.getDoubleValue(1.0) - (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindMitigationDiscount"))))) + this.BOPClassification.getByPerilTheftRate() + this.BOPClassification.getByPerilWaterRate() + this.BOPClassification.getByPerilHurricaneRate())));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))).equals(MathHelper.getStringValue("No"))){
			this.BOPClassification.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getByPerilFireRate() + MathHelper.roundToThousand(this.BOPClassification.getByPerilWindRate() * (MathHelper.getDoubleValue(1.0) - MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage/BusnPrsnlPropCreditFactor"))) * this.BOPClassification.getLCM()) / MathHelper.roundToThousand(this.BOPClassification.getByPerilWindstormOrHailExclBPPFactor() * this.BOPClassification.getLCM())))) + this.BOPClassification.getByPerilTheftRate() + this.BOPClassification.getByPerilWaterRate() + this.BOPClassification.getByPerilHurricaneRate())));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getByPerilFireRate() + MathHelper.roundToThousand((this.BOPClassification.getByPerilWindRate() * (MathHelper.getDoubleValue(1.0) - (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindMitigationDiscount"))))) * (MathHelper.getDoubleValue(1.0) - MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage/BusnPrsnlPropCreditFactor"))) * this.BOPClassification.getLCM()) / MathHelper.roundToThousand(this.BOPClassification.getByPerilWindstormOrHailExclBPPFactor() * this.BOPClassification.getLCM())))) + this.BOPClassification.getByPerilTheftRate() + this.BOPClassification.getByPerilWaterRate() + this.BOPClassification.getByPerilHurricaneRate())));
		}
		else{
			this.BOPClassification.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getByPerilFireRate() + this.BOPClassification.getByPerilWindRate() + this.BOPClassification.getByPerilTheftRate() + this.BOPClassification.getByPerilWaterRate() + this.BOPClassification.getByPerilHurricaneRate())));
		}
		}
		}
		}
	  
	}
	public void TerrorismBusnPrsnlPropFullRate () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBusnPrsnlPropFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABusnPrsnlPropFullRate",String.valueOf( "Y"))));

	  
	}
	public void locationMoneyFlagTemp_1 () throws LookupException,NumberFormatException {
	  this.BOPClassification.setLocationMoneyFlagTemp_1(MathHelper.getStringValue("Yes"));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../../BOPStructure/BOPClassification") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue(""))){
		if(this.BOPClassification.getCurrentMoneyRate() < MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../BOPStructure/BOPClassification/ClassPropertyType"))))){
			this.BOPClassification.setLocationMoneyFlagTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}		}

	  
	}
	public void ByPerilWater4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilWater4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPWater4Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getClassCode())))));
		}
		else{
			this.BOPClassification.setByPerilWater4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	RateNumberFactorBPP();
	
	  
	}
	public void LookupRateNumberFactorBldg_1  () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
		if(this.BOPClassification.getPredominantTypeFlag().equals(MathHelper.getStringValue("Yes"))){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("Yes"))){
		if(!(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))){
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RateNumber"))).equals(MathHelper.getStringValue(""))){
			this.LookupRateNumberFactorBldg_1  = MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBldg",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../BOPClassification/RateNumber"))));
		}
		else{
			this.LookupRateNumberFactorBldg_1  = MathHelper.getDoubleValue(0.0);
		}
		}
		}
		}		}

		}
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPFunctlBusnPrsnlPropValtnList){
		for(BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn:BOPFunctlBusnPrsnlPropValtnList){
			BOPFunctlBusnPrsnlPropValtnRule = new com.nest.res.bop.al01012026.rules.BOPFunctlBusnPrsnlPropValtn(BOPFunctlBusnPrsnlPropValtn);
			BOPFunctlBusnPrsnlPropValtnRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPBrandsAndLabels") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationAccountsReceivableCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationAmusementAreaCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBusnIncomeDependentPropCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBusnPrsnlPropCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationCyberIncidentLiabilityCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationElectronicDataLiabilityBroadCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationElectronicDataLiabilityLimitedCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationOutdoorPropertyCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationPermanentYardsStorageCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationPersonalPropertyOffPremisesCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationPlaygroundCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationSwimmingPoolCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationValuablePapersCoverage/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPCondoCommlUnitOwnersOptionalCovs") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPFoodContamination") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPFunctlBusnPrsnlPropValtn") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPLimitedExclDesignatedOpsCoveredByAControlledWrapUpInsuranceProgramLimitedExceptionForAddlInsds") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPMedExpensesExcl") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPMotelLiabGuestsProp") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPMotels") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPNamedPerilsBusnPrsnlProp") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPOptionalPerPersonMedicalExpensesCoverageClassification/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPResidentialCleaningServices") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPSelfStorageFacilities") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPSpoilgCov") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPUtilitySrvcsDirectDamage") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPUtilitySrvcsTimeElement") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ByPerilWindBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setByPerilWindBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPBaseRate",String.valueOf( "Wind")))));
		}
		else{
			this.BOPClassification.setByPerilWindBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void LocationMoneyFlag ()  {
	  this.BOPClassification.setLocationMoneyFlag(this.BOPClassification.getLocationMoneyFlagTemp_1());

	  
	}
	public void BusnPrsnlPropRateRABOP () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		else{
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	  
	}
	public void ByPerilHurricane4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered"))).equals(MathHelper.getStringValue("")) && !this.BOPClassification.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setByPerilHurricane4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBPPHurricane4Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../Sprinklered")),String.valueOf(this.BOPClassification.getClassCode())))));
		}
		else{
			this.BOPClassification.setByPerilHurricane4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void StructurePctOwnerOccupied ()  {
	  this.BOPClassification.setStructurePctOwnerOccupied((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PctOwnerOccupied"))));

	  
	}
	
	
	
	
	


	
}