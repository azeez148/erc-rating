package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPResidentialCleaningServices;
import com.nest.res.bop.al09012019.domain.BOPHigherLimitsClassification;
import com.nest.res.bop.al09012019.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd;
import com.nest.res.bop.al09012019.domain.BOPPesticideHerbicideCov;
import com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalCovs;
import com.nest.res.bop.al09012019.domain.BOPFoodContamination;
import com.nest.res.bop.al09012019.domain.BOPNamedPerilsBusnPrsnlProp;
import com.nest.res.bop.al09012019.domain.BOPClassificationOutdoorPropertyCoverage;
import com.nest.res.bop.al09012019.domain.BOPBrandsAndLabels;
import com.nest.res.bop.al09012019.domain.BOPSelfStorageFacilities;
import com.nest.res.bop.al09012019.domain.BOPUtilitySrvcsTimeElement;
import com.nest.res.bop.al09012019.domain.BOPMotelLiabGuestsProp;
import com.nest.res.bop.al09012019.domain.BOPMedExpensesExcl;
import com.nest.res.bop.al09012019.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage;
import com.nest.res.bop.al09012019.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;
import com.nest.res.bop.al09012019.domain.BOPSpoilgCov;
import com.nest.res.bop.al09012019.domain.BOPClassificationBusnPrsnlPropCoverage;
import com.nest.res.bop.al09012019.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;
import com.nest.res.bop.al09012019.domain.BOPTheftLimitationsCoverage;
import com.nest.res.bop.al09012019.domain.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
import com.nest.res.bop.al09012019.domain.BOPUtilitySrvcsDirectDamage;
import com.nest.res.bop.al09012019.domain.BOPFunctlBusnPrsnlPropValtn;
import com.nest.res.bop.al09012019.domain.BOPClassificationValuablePapersCoverage;
import com.nest.res.bop.al09012019.domain.BOPClassificationPermanentYardsStorageCoverage;
import com.nest.res.bop.al09012019.domain.BOPClassificationBusnIncomeDependentPropCoverage;
import com.nest.res.bop.al09012019.domain.BOPClassificationPlaygroundCoverage;
import com.nest.res.bop.al09012019.domain.BOPClassificationSwimmingPoolCoverage;
import com.nest.res.bop.al09012019.domain.BOPElectronicDataLiabilityLimitedCov;
import com.nest.res.bop.al09012019.domain.BOPElectronicDataLiabilityBroadCov;
import com.nest.res.bop.al09012019.domain.BOPOptionalPerPersonMedicalExpensesCoverageClassification;
import com.nest.res.bop.al09012019.domain.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov;
import com.nest.res.bop.al09012019.domain.BOPMotels;
import com.nest.res.bop.al09012019.domain.BOPClassificationAmusementAreaCoverage;
import com.nest.res.bop.al09012019.domain.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin;
import com.nest.res.bop.al09012019.domain.BOPClassificationAccountsReceivableCoverage;
import com.nest.res.bop.al09012019.domain.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants;

public class BOPClassification  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPMotels BOPMotelsRule;
	private com.nest.res.bop.al09012019.rules.BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElementRule;
	private com.nest.res.bop.al09012019.rules.BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverageRule;
	private List<BOPResidentialCleaningServices> BOPResidentialCleaningServicesList;
	private com.nest.res.bop.al09012019.rules.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCovRule;
	private List<BOPHigherLimitsClassification> BOPHigherLimitsClassificationList;
	private List<BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd> BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList;
	private com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtnRule;
	private List<BOPPesticideHerbicideCov> BOPPesticideHerbicideCovList;
	private List<BOPCondoCommlUnitOwnersOptionalCovs> BOPCondoCommlUnitOwnersOptionalCovsList;
	private List<BOPFoodContamination> BOPFoodContaminationList;
	private List<BOPNamedPerilsBusnPrsnlProp> BOPNamedPerilsBusnPrsnlPropList;
	private com.nest.res.bop.al09012019.rules.BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverageRule;
	private List<BOPClassificationOutdoorPropertyCoverage> BOPClassificationOutdoorPropertyCoverageList;
	private com.nest.res.bop.al09012019.domain.BOPClassification BOPClassification;
	private List<BOPBrandsAndLabels> BOPBrandsAndLabelsList;
	private List<BOPSelfStorageFacilities> BOPSelfStorageFacilitiesList;
	private com.nest.res.bop.al09012019.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule;
	private com.nest.res.bop.al09012019.rules.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPResidentialCleaningServices BOPResidentialCleaningServicesRule;
	private List<BOPUtilitySrvcsTimeElement> BOPUtilitySrvcsTimeElementList;
	private double LookupRateNumberFactorBldg_1 ;
	private List<BOPMotelLiabGuestsProp> BOPMotelLiabGuestsPropList;
	private com.nest.res.bop.al09012019.rules.BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlPropRule;
	private List<BOPMedExpensesExcl> BOPMedExpensesExclList;
	private com.nest.res.bop.al09012019.rules.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule;
	private List<BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage> BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList;
	private List<BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP> BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList;
	private List<BOPSpoilgCov> BOPSpoilgCovList;
	private com.nest.res.bop.al09012019.rules.BOPFoodContamination BOPFoodContaminationRule;
	private List<BOPClassificationBusnPrsnlPropCoverage> BOPClassificationBusnPrsnlPropCoverageList;
	private List<BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage> BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList;
	private List<BOPTheftLimitationsCoverage> BOPTheftLimitationsCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPMedExpensesExcl BOPMedExpensesExclRule;
	private List<BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises> BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList;
	private com.nest.res.bop.al09012019.rules.BOPBrandsAndLabels BOPBrandsAndLabelsRule;
	private com.nest.res.bop.al09012019.rules.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovRule;
	private com.nest.res.bop.al09012019.rules.BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule;
	private com.nest.res.bop.al09012019.rules.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCovRule;
	private List<BOPUtilitySrvcsDirectDamage> BOPUtilitySrvcsDirectDamageList;
	private List<BOPFunctlBusnPrsnlPropValtn> BOPFunctlBusnPrsnlPropValtnList;
	private com.nest.res.bop.al09012019.rules.BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovsRule;
	private com.nest.res.bop.al09012019.rules.BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverageRule;
	private List<BOPClassificationValuablePapersCoverage> BOPClassificationValuablePapersCoverageList;
	private List<BOPClassificationPermanentYardsStorageCoverage> BOPClassificationPermanentYardsStorageCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule;
	private com.nest.res.bop.al09012019.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule;
	private com.nest.res.bop.al09012019.rules.BOPSpoilgCov BOPSpoilgCovRule;
	private com.nest.res.bop.al09012019.rules.BOPMotelLiabGuestsProp BOPMotelLiabGuestsPropRule;
	private double LookupRateNumberFactorBldg ;
	private com.nest.res.bop.al09012019.rules.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverageRule;
	private List<BOPClassificationBusnIncomeDependentPropCoverage> BOPClassificationBusnIncomeDependentPropCoverageList;
	private List<BOPClassificationPlaygroundCoverage> BOPClassificationPlaygroundCoverageList;
	private List<BOPClassificationSwimmingPoolCoverage> BOPClassificationSwimmingPoolCoverageList;
	private List<BOPElectronicDataLiabilityLimitedCov> BOPElectronicDataLiabilityLimitedCovList;
	private com.nest.res.bop.al09012019.rules.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule;
	private com.nest.res.bop.al09012019.rules.BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamageRule;
	private List<BOPElectronicDataLiabilityBroadCov> BOPElectronicDataLiabilityBroadCovList;
	private com.nest.res.bop.al09012019.rules.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverageRule;
	private List<BOPOptionalPerPersonMedicalExpensesCoverageClassification> BOPOptionalPerPersonMedicalExpensesCoverageClassificationList;
	private com.nest.res.bop.al09012019.rules.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule;
	private List<BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov> BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList;
	private List<BOPMotels> BOPMotelsList;
	private com.nest.res.bop.al09012019.rules.BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverageRule;
	private List<BOPClassificationAmusementAreaCoverage> BOPClassificationAmusementAreaCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverageRule;
	private List<BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin> BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList;
	private com.nest.res.bop.al09012019.rules.BOPSelfStorageFacilities BOPSelfStorageFacilitiesRule;
	private com.nest.res.bop.al09012019.rules.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverageRule;
	private List<BOPClassificationAccountsReceivableCoverage> BOPClassificationAccountsReceivableCoverageList;
	private List<BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants> BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList;
	
	
	
	public void StructurePropertyType ()  {
	  this.BOPClassification.setStructurePropertyType((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))));

	  
	}
	public void RateNumberFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setRateNumberFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBPP",String.valueOf(this.BOPClassification.getRateNumber())))));
		}
		else{
			this.BOPClassification.setRateNumberFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPBrandsAndLabels") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationAccountsReceivableCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationAmusementAreaCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBusnIncomeDependentPropCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBusnPrsnlPropCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationOutdoorPropertyCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationPermanentYardsStorageCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationPlaygroundCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationSwimmingPoolCoverage/Premium")))));
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationValuablePapersCoverage/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPCondoCommlUnitOwnersOptionalCovs") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPElectronicDataLiabilityBroadCov") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPElectronicDataLiabilityLimitedCov") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov") ){
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
this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPTheftLimitationsCoverage/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPUtilitySrvcsDirectDamage") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"BOPUtilitySrvcsTimeElement") ){
			this.BOPClassification.setPremium(MathHelper.getDoubleValue(this.BOPClassification.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ClassPropertyType ()  {
	  
		if(!this.BOPClassification.getStructurePropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setClassPropertyType(MathHelper.getStringValue(this.BOPClassification.getStructurePropertyType()));
		}
	  
	}
	public void BusnPrsnlPropRate () throws LookupException,NumberFormatException {
	  
		if(!(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")))){
		if(!(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setBusnPrsnlPropRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnlPropRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void BusnPrsnlPropRateGrade () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassDescription().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setBusnPrsnlPropRateGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("EQBusnPrsnlPropRateGrade",String.valueOf(this.BOPClassification.getClassDescription())))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropRateGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void BOPTheftLimitationsCoverage_Limit ()  {
	  
		if(this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPTheftLimitationsCoverage/dsLimit"))) < MathHelper.getIntegerValue(2500.0)){
		for(com.nest.res.bop.al09012019.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage :BOPTheftLimitationsCoverageList){
		BOPTheftLimitationsCoverage.setDsLimit(MathHelper.getIntegerValue(2500.0));
		}
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage :BOPTheftLimitationsCoverageList){
		BOPTheftLimitationsCoverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
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
	public void TerrorismBusnPrsnlPropFullRate () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBusnPrsnlPropFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABusnPrsnlPropFullRate",String.valueOf( "Y"))));

	  
	}
	public void LocationMoneyFlag () throws LookupException,NumberFormatException {
	  this.BOPClassification.setLocationMoneyFlag(MathHelper.getStringValue("Yes"));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../../BOPStructure/BOPClassification") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("")) && ((XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))).equals(MathHelper.getStringValue("Yes"))){
		if(this.BOPClassification.getCurrentMoneyRate() < MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../BOPStructure/BOPClassification/ClassPropertyType"))))){
			this.BOPClassification.setLocationMoneyFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPFunctlBusnPrsnlPropValtnList){
		for(BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn:BOPFunctlBusnPrsnlPropValtnList){
			BOPFunctlBusnPrsnlPropValtnRule = new com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtn(BOPFunctlBusnPrsnlPropValtn);
			BOPFunctlBusnPrsnlPropValtnRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void PredominantOccupancy ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		if(this.BOPClassification.getPredominantTypeFlag().equals(MathHelper.getStringValue("Yes"))){
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0 && ((XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantTypeFlag"))).equals(MathHelper.getStringValue("Yes"))){
		if(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		else{
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) && !this.BOPClassification.getClassCode().equals((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))))){
		if(this.LookupRateNumberFactorBldg  < this.LookupRateNumberFactorBldg_1 ){
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		}
		}		}

		}
		else{
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(this.BOPClassification.getArea() < (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		else{
		if(this.BOPClassification.getArea() == (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))){
		if(this.BOPClassification.getRateNumberFactorBPP() < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"RateNumberFactorBPP")))){
			this.BOPClassification.setPredominantOccupancy(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		}
		}		}

		}
	  
	}
	public void ProcessPremium10 ()  {
	  
	ProcessPremium10_CommonRatingSub1();
	
	setTotalPremiumForCoverage();
	  
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
	public void TotBusnPrsnlPropLimit ()  {
	  
		if(XpathNode.selectNodes(this.BOPClassification,"BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPClassification.setTotBusnPrsnlPropLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPClassification.getBusnPrsnlPropLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))))));
		}
		else{
			this.BOPClassification.setTotBusnPrsnlPropLimit(MathHelper.getIntegerValue(this.BOPClassification.getBusnPrsnlPropLimit()));
		}
	  
	}
	public void FinalMaxBusnPrsnlPropRateFlag ()  {
	  this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlag(MathHelper.getStringValue("Yes"));

		for( Policy policy : XpathNode.selectNodes(BOPClassification,"../../../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))) != 0.0){
		if(this.BOPClassification.getFinalBusnPrsnlPropRate() < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate")))){
			this.BOPClassification.setFinalMaxBusnPrsnlPropRateFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}		}

	  
	}
	public void FinalBusnPrsnlPropRate ()  {
	  this.BOPClassification.setFinalBusnPrsnlPropRate(MathHelper.roundToThousand(((MathHelper.roundToThousand(this.BOPClassification.getBppRateToUse_1() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getBusnPrsnlPropCreditFactor_1() * this.BOPClassification.getLCM())) - MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPClassification.getWindstormOrHailExclBusnPrsnlPropFactor() * this.BOPClassification.getLCM()) - MathHelper.roundToThousand(this.BOPClassification.getBusnPrsnlPropCreditFactor_1() * this.BOPClassification.getLCM())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindMitigationDiscount"))))) * this.BOPClassification.getRateNumberFactorBPP() * this.BOPClassification.getConstructionTypeFactorBPP() * this.BOPClassification.getBusnPersonalPropertyLimitOfInsuranceRelativityFactor() * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BldgCodeEffectivenessGradeFactor"))) * this.BOPClassification.getSprinkleredFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))));

	  
	}
	public void ProcessPremium4 () throws LookupException,NumberFormatException {
	  
	ProcessPremium4_CommonRatingSub1();
	
	  
	}
	public void TerrorismBPPNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBPPNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABPPNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)) || (this.BOPClassification.getBusnPrsnlPropLimit() <= MathHelper.getIntegerValue(0.0) && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals(MathHelper.getStringValue("Yes")))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage/dsLimit"))) < MathHelper.getIntegerValue(10000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage :BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage :BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
	  
	}
	public void ConstructionTypeFactorBPP () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setConstructionTypeFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ConstructionTypeFactorBPP",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../ConstructionType"))))));
		}
		else{
			this.BOPClassification.setConstructionTypeFactorBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium7_CommonRatingSub6 ()  {
	  
	BOPClassificationBusnIncomeDependentPropCoverage_Limit();
	
	  
	}
	public void StructurePctOwnerOccupied ()  {
	  this.BOPClassification.setStructurePctOwnerOccupied((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PctOwnerOccupied"))));

	  
	}
	public void BusnPrsnlPropSusceptibilityGrade () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassDescription().equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setBusnPrsnlPropSusceptibilityGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("SprinklerLeakageSusceptibilityGrade",String.valueOf(this.BOPClassification.getClassDescription())))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropSusceptibilityGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void ProcessPremium3 () throws LookupException,NumberFormatException {
	  
	ProcessPremium3_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium10_CommonRatingSub1 ()  {
	  
	FinalMaxBusnPrsnlPropRateFlag();
	
	  
	}
	public void terrorismPostProRateFactor_1 ()  {
	  this.BOPClassification.setTerrorismPostProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPostProRateFactor"))));

	  
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
			BOPClassificationBusnPrsnlPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationBusnPrsnlPropCoverage(BOPClassificationBusnPrsnlPropCoverage);
			BOPClassificationBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBrandsAndLabelsList){
		for(BOPBrandsAndLabels BOPBrandsAndLabels:BOPBrandsAndLabelsList){
			BOPBrandsAndLabelsRule = new com.nest.res.bop.al09012019.rules.BOPBrandsAndLabels(BOPBrandsAndLabels);
			BOPBrandsAndLabelsRule.ProcessPremium1();

		}
	}
	if(null != BOPFunctlBusnPrsnlPropValtnList){
		for(BOPFunctlBusnPrsnlPropValtn BOPFunctlBusnPrsnlPropValtn:BOPFunctlBusnPrsnlPropValtnList){
			BOPFunctlBusnPrsnlPropValtnRule = new com.nest.res.bop.al09012019.rules.BOPFunctlBusnPrsnlPropValtn(BOPFunctlBusnPrsnlPropValtn);
			BOPFunctlBusnPrsnlPropValtnRule.ProcessPremium2();

		}
	}
	if(null != BOPClassificationAccountsReceivableCoverageList){
		for(BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage:BOPClassificationAccountsReceivableCoverageList){
			BOPClassificationAccountsReceivableCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationAccountsReceivableCoverage(BOPClassificationAccountsReceivableCoverage);
			BOPClassificationAccountsReceivableCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationAmusementAreaCoverageList){
		for(BOPClassificationAmusementAreaCoverage BOPClassificationAmusementAreaCoverage:BOPClassificationAmusementAreaCoverageList){
			BOPClassificationAmusementAreaCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationAmusementAreaCoverage(BOPClassificationAmusementAreaCoverage);
			BOPClassificationAmusementAreaCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
		for(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage:BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageList){
			BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage(BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage);
			BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverageRule.CommonRating1();

		}
	}
	if(null != BOPClassificationBusnIncomeDependentPropCoverageList){
		for(BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage:BOPClassificationBusnIncomeDependentPropCoverageList){
			BOPClassificationBusnIncomeDependentPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationBusnIncomeDependentPropCoverage(BOPClassificationBusnIncomeDependentPropCoverage);
			BOPClassificationBusnIncomeDependentPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList){
		for(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage:BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageList){
			BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage);
			BOPClassificationLiabMedExpensesBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationOutdoorPropertyCoverageList){
		for(BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage:BOPClassificationOutdoorPropertyCoverageList){
			BOPClassificationOutdoorPropertyCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationOutdoorPropertyCoverage(BOPClassificationOutdoorPropertyCoverage);
			BOPClassificationOutdoorPropertyCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPermanentYardsStorageCoverageList){
		for(BOPClassificationPermanentYardsStorageCoverage BOPClassificationPermanentYardsStorageCoverage:BOPClassificationPermanentYardsStorageCoverageList){
			BOPClassificationPermanentYardsStorageCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationPermanentYardsStorageCoverage(BOPClassificationPermanentYardsStorageCoverage);
			BOPClassificationPermanentYardsStorageCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationPlaygroundCoverageList){
		for(BOPClassificationPlaygroundCoverage BOPClassificationPlaygroundCoverage:BOPClassificationPlaygroundCoverageList){
			BOPClassificationPlaygroundCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationPlaygroundCoverage(BOPClassificationPlaygroundCoverage);
			BOPClassificationPlaygroundCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationSwimmingPoolCoverageList){
		for(BOPClassificationSwimmingPoolCoverage BOPClassificationSwimmingPoolCoverage:BOPClassificationSwimmingPoolCoverageList){
			BOPClassificationSwimmingPoolCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationSwimmingPoolCoverage(BOPClassificationSwimmingPoolCoverage);
			BOPClassificationSwimmingPoolCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationValuablePapersCoverageList){
		for(BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage:BOPClassificationValuablePapersCoverageList){
			BOPClassificationValuablePapersCoverageRule = new com.nest.res.bop.al09012019.rules.BOPClassificationValuablePapersCoverage(BOPClassificationValuablePapersCoverage);
			BOPClassificationValuablePapersCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondoCommlUnitOwnersOptionalCovsList){
		for(BOPCondoCommlUnitOwnersOptionalCovs BOPCondoCommlUnitOwnersOptionalCovs:BOPCondoCommlUnitOwnersOptionalCovsList){
			BOPCondoCommlUnitOwnersOptionalCovsRule = new com.nest.res.bop.al09012019.rules.BOPCondoCommlUnitOwnersOptionalCovs(BOPCondoCommlUnitOwnersOptionalCovs);
			BOPCondoCommlUnitOwnersOptionalCovsRule.ProcessPremium1();

		}
	}
	if(null != BOPElectronicDataLiabilityBroadCovList){
		for(BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov:BOPElectronicDataLiabilityBroadCovList){
			BOPElectronicDataLiabilityBroadCovRule = new com.nest.res.bop.al09012019.rules.BOPElectronicDataLiabilityBroadCov(BOPElectronicDataLiabilityBroadCov);
			BOPElectronicDataLiabilityBroadCovRule.ProcessPremium1();

		}
	}
	if(null != BOPElectronicDataLiabilityLimitedCovList){
		for(BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov:BOPElectronicDataLiabilityLimitedCovList){
			BOPElectronicDataLiabilityLimitedCovRule = new com.nest.res.bop.al09012019.rules.BOPElectronicDataLiabilityLimitedCov(BOPElectronicDataLiabilityLimitedCov);
			BOPElectronicDataLiabilityLimitedCovRule.ProcessPremium1();

		}
	}
	if(null != BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList){
		for(BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants:BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsList){
			BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule = new com.nest.res.bop.al09012019.rules.BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants(BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchants);
			BOPExclErroneousDeliveryOrMixAndRsltgFailrOfSeedToGerminSeedMerchantsRule.ProcessPremium1();

		}
	}
	if(null != BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList){
		for(BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov:BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovList){
			BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovRule = new com.nest.res.bop.al09012019.rules.BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov(BOPExtendedReportingPeriodElectronicDataLiabilityBroadCov);
			BOPExtendedReportingPeriodElectronicDataLiabilityBroadCovRule.ProcessPremium1();

		}
	}
	if(null != BOPFoodContaminationList){
		for(BOPFoodContamination BOPFoodContamination:BOPFoodContaminationList){
			BOPFoodContaminationRule = new com.nest.res.bop.al09012019.rules.BOPFoodContamination(BOPFoodContamination);
			BOPFoodContaminationRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList){
		for(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP:BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPList){
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule = new com.nest.res.bop.al09012019.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP);
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPPRule.ProcessPremium1();

		}
	}
	if(null != BOPMedExpensesExclList){
		for(BOPMedExpensesExcl BOPMedExpensesExcl:BOPMedExpensesExclList){
			BOPMedExpensesExclRule = new com.nest.res.bop.al09012019.rules.BOPMedExpensesExcl(BOPMedExpensesExcl);
			BOPMedExpensesExclRule.ProcessPremium1();

		}
	}
	if(null != BOPMotelLiabGuestsPropList){
		for(BOPMotelLiabGuestsProp BOPMotelLiabGuestsProp:BOPMotelLiabGuestsPropList){
			BOPMotelLiabGuestsPropRule = new com.nest.res.bop.al09012019.rules.BOPMotelLiabGuestsProp(BOPMotelLiabGuestsProp);
			BOPMotelLiabGuestsPropRule.ProcessPremium1();

		}
	}
	if(null != BOPMotelsList){
		for(BOPMotels BOPMotels:BOPMotelsList){
			BOPMotelsRule = new com.nest.res.bop.al09012019.rules.BOPMotels(BOPMotels);
			BOPMotelsRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsBusnPrsnlPropList){
		for(BOPNamedPerilsBusnPrsnlProp BOPNamedPerilsBusnPrsnlProp:BOPNamedPerilsBusnPrsnlPropList){
			BOPNamedPerilsBusnPrsnlPropRule = new com.nest.res.bop.al09012019.rules.BOPNamedPerilsBusnPrsnlProp(BOPNamedPerilsBusnPrsnlProp);
			BOPNamedPerilsBusnPrsnlPropRule.ProcessPremium1();

		}
	}
	if(null != BOPOptionalPerPersonMedicalExpensesCoverageClassificationList){
		for(BOPOptionalPerPersonMedicalExpensesCoverageClassification BOPOptionalPerPersonMedicalExpensesCoverageClassification:BOPOptionalPerPersonMedicalExpensesCoverageClassificationList){
			BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule = new com.nest.res.bop.al09012019.rules.BOPOptionalPerPersonMedicalExpensesCoverageClassification(BOPOptionalPerPersonMedicalExpensesCoverageClassification);
			BOPOptionalPerPersonMedicalExpensesCoverageClassificationRule.ProcessPremium1();

		}
	}
	if(null != BOPResidentialCleaningServicesList){
		for(BOPResidentialCleaningServices BOPResidentialCleaningServices:BOPResidentialCleaningServicesList){
			BOPResidentialCleaningServicesRule = new com.nest.res.bop.al09012019.rules.BOPResidentialCleaningServices(BOPResidentialCleaningServices);
			BOPResidentialCleaningServicesRule.ProcessPremium1();

		}
	}
	if(null != BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList){
		for(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin:BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminList){
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule = new com.nest.res.bop.al09012019.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGermin);
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminRule.ProcessPremium1();

		}
	}
	if(null != BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList){
		for(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd:BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddList){
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule = new com.nest.res.bop.al09012019.rules.BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd(BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotIncldd);
			BOPSeedMerchantsCovErroneousDeliveryOrMixtureRsltgFailureOfSeedToGerminNotInclddRule.ProcessPremium1();

		}
	}
	if(null != BOPSelfStorageFacilitiesList){
		for(BOPSelfStorageFacilities BOPSelfStorageFacilities:BOPSelfStorageFacilitiesList){
			BOPSelfStorageFacilitiesRule = new com.nest.res.bop.al09012019.rules.BOPSelfStorageFacilities(BOPSelfStorageFacilities);
			BOPSelfStorageFacilitiesRule.ProcessPremium1();

		}
	}
	if(null != BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList){
		for(BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises:BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesList){
			BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule = new com.nest.res.bop.al09012019.rules.BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises(BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises);
			BOPSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesRule.ProcessPremium1();

		}
	}
	if(null != BOPSpoilgCovList){
		for(BOPSpoilgCov BOPSpoilgCov:BOPSpoilgCovList){
			BOPSpoilgCovRule = new com.nest.res.bop.al09012019.rules.BOPSpoilgCov(BOPSpoilgCov);
			BOPSpoilgCovRule.ProcessPremium1();

		}
	}
	if(null != BOPTheftLimitationsCoverageList){
		for(BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage:BOPTheftLimitationsCoverageList){
			BOPTheftLimitationsCoverageRule = new com.nest.res.bop.al09012019.rules.BOPTheftLimitationsCoverage(BOPTheftLimitationsCoverage);
			BOPTheftLimitationsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPUtilitySrvcsDirectDamageList){
		for(BOPUtilitySrvcsDirectDamage BOPUtilitySrvcsDirectDamage:BOPUtilitySrvcsDirectDamageList){
			BOPUtilitySrvcsDirectDamageRule = new com.nest.res.bop.al09012019.rules.BOPUtilitySrvcsDirectDamage(BOPUtilitySrvcsDirectDamage);
			BOPUtilitySrvcsDirectDamageRule.ProcessPremium1();

		}
	}
	if(null != BOPUtilitySrvcsTimeElementList){
		for(BOPUtilitySrvcsTimeElement BOPUtilitySrvcsTimeElement:BOPUtilitySrvcsTimeElementList){
			BOPUtilitySrvcsTimeElementRule = new com.nest.res.bop.al09012019.rules.BOPUtilitySrvcsTimeElement(BOPUtilitySrvcsTimeElement);
			BOPUtilitySrvcsTimeElementRule.ProcessPremium1();

		}
	}
	ProcessPremium7_CommonRatingSub7();
	
	  
	}
	public void ProcessPremium7_CommonRatingSub4 ()  {
	  
	BOPClassificationBPPTemporarilyInPortableStorageUnitsCoverage_Limit();
	
	  
	}
	public void CurrentMoneyRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setCurrentMoneyRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MoneySecuritiesOnPremisesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory")),String.valueOf(this.BOPClassification.getClassPropertyType())))));
		}
		else{
			this.BOPClassification.setCurrentMoneyRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPClassification.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../CommercialPropertyLCM"))));

	  
	}
	public void ProcessPremium5 () throws LookupException,NumberFormatException {
	  
	ProcessPremium5_CommonRatingSub1();
	
	  
	}
	public void CrimeLCM ()  {
	  this.BOPClassification.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../CrimeLCM"))));

	  
	}
	public void ProcessPremium9 ()  {
	  
	  
	}
	public void LCM ()  {
	  this.BOPClassification.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../LCM"))));

	  
	}
	public void terrorismPreProRateFactor_1 ()  {
	  this.BOPClassification.setTerrorismPreProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPTerrorismCoverage/TRIAPreProRateFactor"))));

	  
	}
	public void ProcessPremium7_CommonRatingSub7 ()  {
	  
	StructurePctOwnerOccupied();
	
	terrorismPreProRateFactor_1();
	
	terrorismPostProRateFactor_1();
	
	TerrsmBusnPrsnlPropPremium();
	
	  
	}
	public void TerrorismBPPRate () throws LookupException,NumberFormatException {
	  this.BOPClassification.setTerrorismBPPRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABusnPrsnlPropRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	  
	}
	public void busnPrsnlPropCreditFactor_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage")) != null){
			this.BOPClassification.setBusnPrsnlPropCreditFactor_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../BOPALWindHailExclDirectDamage/BusnPrsnlPropCreditFactor")))));
		}
		else{
			this.BOPClassification.setBusnPrsnlPropCreditFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPClassification (com.nest.res.bop.al09012019.domain.BOPClassification BOPClassification)  {
	  this.BOPClassification = BOPClassification;
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
	public void ProcessPremium3_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	LocationMoneyFlag();
	
	PredominantTypeFlag();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	PredominantOccupancy();
	
	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPClassification.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../GeneralLiabilityLCM"))));

	  
	}
	public void BusnPersonalPropertyLimitOfInsuranceRelativityFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getTotBusnPrsnlPropLimit() != MathHelper.getIntegerValue(0.0)){
			this.BOPClassification.setBusnPersonalPropertyLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnPrsnPropLimitOfInsRelativityFactor",String.valueOf(this.BOPClassification.getTotBusnPrsnlPropLimit()))))));
		}
		else{
			this.BOPClassification.setBusnPersonalPropertyLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
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
	public void WindstormOrHailExclBusnPrsnlPropFactor () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPClassification,"../BOPWindstormOrHailExclusion")) != null) || ((XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../WindstormMitigationDiscountApplies"))).equals(MathHelper.getStringValue("Yes")))){
			this.BOPClassification.setWindstormOrHailExclBusnPrsnlPropFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBusnPrsnlPropFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))))));
		}
		else{
			this.BOPClassification.setWindstormOrHailExclBusnPrsnlPropFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void bppRateToUse_1 ()  {
	  
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
			this.BOPClassification.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropRateRABOP()) + MathHelper.getDoubleValue(this.BOPClassification.getHurricaneLossCostsBPP()))));
		}
		else{
			this.BOPClassification.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropRate())));
		}
	  
	}
	public void TerrsmBusnPrsnlPropPremium ()  {
	  this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(0.0));

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBPPRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPreProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBPPRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPreProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor"))) * this.BOPClassification.getTerrorismBPPNuclBiolChemRadFactor()) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBPPRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPreProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		}
		}
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPClassification,"../../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPostProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPostProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor"))) * this.BOPClassification.getTerrorismBPPNuclBiolChemRadFactor()) * MathHelper.getDoubleValue(this.BOPClassification.getBusnPrsnlPropLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPClassification.setTerrsmBusnPrsnlPropPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassification.getTerrsmBusnPrsnlPropPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand((MathHelper.roundToTenThousand(this.BOPClassification.getTerrorismBusnPrsnlPropFullRate() * this.BOPClassification.getLCM() * this.BOPClassification.getTerrorismPostProRateFactor_1()) * this.BOPClassification.getPublicProtectionFactorBPP() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../../DedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassification,"../TerrorismSprinkleredFactor")))) * MathHelper.getDoubleValue(this.BOPClassification.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		}
		}
		}
	  
	}
	public void ProcessPremium4_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	RateNumberFactorBPP();
	
	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	TotBusnPrsnlPropLimit();
	
	  
	}
	public void BOPClassificationBusnIncomeDependentPropCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)) || (this.BOPClassification.getBusnPrsnlPropLimit() <= MathHelper.getIntegerValue(0.0) && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals(MathHelper.getStringValue("Yes")))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationBusnIncomeDependentPropCoverage/dsLimit"))) < MathHelper.getIntegerValue(5000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage :BOPClassificationBusnIncomeDependentPropCoverageList){
		BOPClassificationBusnIncomeDependentPropCoverage.setDsLimit(MathHelper.getIntegerValue(5000.0));
		}
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPClassificationBusnIncomeDependentPropCoverage BOPClassificationBusnIncomeDependentPropCoverage :BOPClassificationBusnIncomeDependentPropCoverageList){
		BOPClassificationBusnIncomeDependentPropCoverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
	  
	}
	public void ProcessPremium7_CommonRatingSub3 ()  {
	  
	BOPClassificationValuablePapersCoverage_Limit();
	
	  
	}
	public void HurricaneLossCostsBPP () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassification.setHurricaneLossCostsBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HurricaneLossCostsBPP",String.valueOf(XpathNode.selectNodeValue(this.BOPClassification,"../../RatingTerritory"))))));
		}
		else{
			this.BOPClassification.setHurricaneLossCostsBPP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium6 () throws LookupException,NumberFormatException {
	  
	ProcessPremium6_CommonRatingSub1();
	
	  
	}
	public void ProcessPremium2_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	RateNumberFactorBPP();
	
	  
	}
	public void ProcessPremium7_CommonRatingSub2 ()  {
	  
	BOPClassificationAccountsReceivableCoverage_Limit();
	
	  
	}
	public void BusnPrsnlPropRateRABOP () throws LookupException,NumberFormatException {
	  
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Smoothed"))){
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
		if(this.BOPClassification.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPClassification.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))){
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
	public void ProcessPremium8 ()  {
	  
	if(null != BOPMedExpensesExclList){
		for(BOPMedExpensesExcl BOPMedExpensesExcl:BOPMedExpensesExclList){
			BOPMedExpensesExclRule = new com.nest.res.bop.al09012019.rules.BOPMedExpensesExcl(BOPMedExpensesExcl);
			BOPMedExpensesExclRule.ProcessPremium2();

		}
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
	public void ProcessPremium7_CommonRatingSub5 ()  {
	  
	BOPTheftLimitationsCoverage_Limit();
	
	  
	}
	public void ProcessPremium5_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	LocationMoneyFlag();
	
	PredominantTypeFlag();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	PredominantOccupancy();
	
	  
	}
	public void BOPClassificationValuablePapersCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)) || (this.BOPClassification.getBusnPrsnlPropLimit() <= MathHelper.getIntegerValue(0.0) && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals(MathHelper.getStringValue("Yes")))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationValuablePapersCoverage/dsLimit"))) < MathHelper.getIntegerValue(10000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage :BOPClassificationValuablePapersCoverageList){
		BOPClassificationValuablePapersCoverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPClassificationValuablePapersCoverage BOPClassificationValuablePapersCoverage :BOPClassificationValuablePapersCoverageList){
		BOPClassificationValuablePapersCoverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
	  
	}
	public void BOPClassificationAccountsReceivableCoverage_Limit ()  {
	  
		if((this.BOPClassification.getBusnPrsnlPropLimit() > MathHelper.getIntegerValue(0.0)) || (this.BOPClassification.getBusnPrsnlPropLimit() <= MathHelper.getIntegerValue(0.0) && this.BOPClassification.getFunctlBusnPrsnlPropValtnApply().equals(MathHelper.getStringValue("Yes")))){
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassification,"BOPClassificationAccountsReceivableCoverage/dsLimit"))) < MathHelper.getIntegerValue(10000.0)){
		for(com.nest.res.bop.al09012019.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage :BOPClassificationAccountsReceivableCoverageList){
		BOPClassificationAccountsReceivableCoverage.setDsLimit(MathHelper.getIntegerValue(10000.0));
		}
		}
		}
		else{
		for(com.nest.res.bop.al09012019.domain.BOPClassificationAccountsReceivableCoverage BOPClassificationAccountsReceivableCoverage :BOPClassificationAccountsReceivableCoverageList){
		BOPClassificationAccountsReceivableCoverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
	  
	}
	public void ProcessPremium6_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	StructurePropertyType();
	
	ClassPropertyType();
	
	CurrentMoneyRate();
	
	LocationMoneyFlag();
	
	PredominantTypeFlag();
	
	LookupRateNumberFactorBldg ();
	
	LookupRateNumberFactorBldg_1 ();
	
	PredominantOccupancy();
	
	  
	}
	public void PredominantTypeFlag ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PropertyType"))).equals(MathHelper.getStringValue("Mixed"))){
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("Restaurant"))){
		if(this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Fast Food")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Fine Dining")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Restaurant-Casual Dining"))){
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("Apartment"))){
		if(this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment Condominium Association")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment"))){
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("Office"))){
		if(this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office")) || this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassification,"../PredominantType"))).equals(MathHelper.getStringValue("OfficeApartmentOther"))){
		if(!this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office")) && !this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Office Condominium")) && !this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment Condominium Association")) && !this.BOPClassification.getClassPropertyType().equals(MathHelper.getStringValue("Apartment"))){
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
		}
		else{
			this.BOPClassification.setPredominantTypeFlag(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		}
		}
		}
		}
	  
	}
	
	
	
	
	


	
}