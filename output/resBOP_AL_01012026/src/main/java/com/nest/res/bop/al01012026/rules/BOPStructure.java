package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitationsOnCoverageForRoofSurfacing;
import com.nest.res.bop.al01012026.domain.BOPEarthquake;
import com.nest.res.bop.al01012026.domain.BOPStructureLiabMedExpensesBldgCoverage;
import com.nest.res.bop.al01012026.domain.BOPClassification;
import com.nest.res.bop.al01012026.domain.BOPWindstormOrHailExclusion;
import com.nest.res.bop.al01012026.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;
import com.nest.res.bop.al01012026.domain.BOPWindstormOrHailLossesRoofACV;
import com.nest.res.bop.al01012026.domain.BOPStructureCyberIncidentLiabilityCoverage;
import com.nest.res.bop.al01012026.domain.BOPBusnIncomeAndExtraExpenseCovLOI;
import com.nest.res.bop.al01012026.domain.BOPTenantsLiability;
import com.nest.res.bop.al01012026.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;
import com.nest.res.bop.al01012026.domain.BOPVacancyChanges;
import com.nest.res.bop.al01012026.domain.BOPDebrisRmvlAddlIns;
import com.nest.res.bop.al01012026.domain.BOPStructureElectronicDataLiabilityBroadCoverage;
import com.nest.res.bop.al01012026.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding;
import com.nest.res.bop.al01012026.domain.BOPStructureACVCoverage;
import com.nest.res.bop.al01012026.domain.BOPStructureTenantsFireLiabCoverage;
import com.nest.res.bop.al01012026.domain.BOPLossPayable;
import com.nest.res.bop.al01012026.domain.BOPProtectiveSafeguards;
import com.nest.res.bop.al01012026.domain.BOPStructureElectronicDataLiabilityLimitedCoverage;
import com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov;
import com.nest.res.bop.al01012026.domain.BOPALWindHailExclDirectDamage;
import com.nest.res.bop.al01012026.domain.BOPCondoAssociationCov;
import com.nest.res.bop.al01012026.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;
import com.nest.res.bop.al01012026.domain.BOPNamedPerilsBldg;
import com.nest.res.bop.al01012026.domain.BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalProperties;
import com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtn;
import com.nest.res.bop.al01012026.domain.BOPALCondoAddlProvisions;
import com.nest.res.bop.al01012026.domain.BOPStructureBuildingCoverage;
import com.nest.res.bop.al01012026.domain.BOPSprinklerLeakageEQExt;
import com.nest.res.bop.al01012026.domain.BOPBurglaryAndRobberyProtectiveSafeguards;
import com.nest.res.bop.al01012026.domain.BOPOptionalOutdoorPropertyCoverage;
import com.nest.res.bop.al01012026.domain.BOPEQSubLimit;
import com.nest.res.bop.al01012026.domain.BOPVacancyPermit;
import com.nest.res.bop.al01012026.domain.BOPAutomaticIncreaseCoverageBuilding;

public class BOPStructure  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPVacancyPermit BOPVacancyPermitRule;
	private List<BOPLimitationsOnCoverageForRoofSurfacing> BOPLimitationsOnCoverageForRoofSurfacingList;
	private List<BOPEarthquake> BOPEarthquakeList;
	private List<BOPStructureLiabMedExpensesBldgCoverage> BOPStructureLiabMedExpensesBldgCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPStructureCyberIncidentLiabilityCoverage BOPStructureCyberIncidentLiabilityCoverageRule;
	private List<BOPClassification> BOPClassificationList;
	private List<BOPWindstormOrHailExclusion> BOPWindstormOrHailExclusionList;
	private List<BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis> BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList;
	private com.nest.res.bop.al01012026.rules.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOIRule;
	private com.nest.res.bop.al01012026.rules.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuildingRule;
	private List<BOPWindstormOrHailLossesRoofACV> BOPWindstormOrHailLossesRoofACVList;
	private com.nest.res.bop.al01012026.rules.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule;
	private List<BOPStructureCyberIncidentLiabilityCoverage> BOPStructureCyberIncidentLiabilityCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPClassification BOPClassificationRule;
	private com.nest.res.bop.al01012026.rules.BOPStructureElectronicDataLiabilityBroadCoverage BOPStructureElectronicDataLiabilityBroadCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamageRule;
	private com.nest.res.bop.al01012026.rules.BOPFunctlBldgValtn BOPFunctlBldgValtnRule;
	private com.nest.res.bop.al01012026.rules.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCovRule;
	private com.nest.res.bop.al01012026.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule;
	private List<BOPBusnIncomeAndExtraExpenseCovLOI> BOPBusnIncomeAndExtraExpenseCovLOIList;
	private com.nest.res.bop.al01012026.rules.BOPNamedPerilsBldg BOPNamedPerilsBldgRule;
	private List<BOPTenantsLiability> BOPTenantsLiabilityList;
	private List<BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg> BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList;
	private com.nest.res.bop.al01012026.rules.BOPStructureBuildingCoverage BOPStructureBuildingCoverageRule;
	private List<BOPVacancyChanges> BOPVacancyChangesList;
	private List<BOPDebrisRmvlAddlIns> BOPDebrisRmvlAddlInsList;
	private com.nest.res.bop.al01012026.rules.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExtRule;
	private List<BOPStructureElectronicDataLiabilityBroadCoverage> BOPStructureElectronicDataLiabilityBroadCoverageList;
	private List<BOPOptionalPerPersonMedicalExpensesCoverageBuilding> BOPOptionalPerPersonMedicalExpensesCoverageBuildingList;
	private List<BOPStructureACVCoverage> BOPStructureACVCoverageList;
	private List<BOPStructureTenantsFireLiabCoverage> BOPStructureTenantsFireLiabCoverageList;
	private List<BOPLossPayable> BOPLossPayableList;
	private List<BOPProtectiveSafeguards> BOPProtectiveSafeguardsList;
	private List<BOPStructureElectronicDataLiabilityLimitedCoverage> BOPStructureElectronicDataLiabilityLimitedCoverageList;
	private List<BOPOrdinanceOrLawCov> BOPOrdinanceOrLawCovList;
	private List<BOPALWindHailExclDirectDamage> BOPALWindHailExclDirectDamageList;
	private List<BOPCondoAssociationCov> BOPCondoAssociationCovList;
	private List<BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity> BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList;
	private List<BOPNamedPerilsBldg> BOPNamedPerilsBldgList;
	private List<BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalProperties> BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalPropertiesList;
	private List<BOPFunctlBldgValtn> BOPFunctlBldgValtnList;
	private com.nest.res.bop.al01012026.rules.BOPTenantsLiability BOPTenantsLiabilityRule;
	private List<BOPALCondoAddlProvisions> BOPALCondoAddlProvisionsList;
	private com.nest.res.bop.al01012026.rules.BOPStructureACVCoverage BOPStructureACVCoverageRule;
	private List<BOPStructureBuildingCoverage> BOPStructureBuildingCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPEQSubLimit BOPEQSubLimitRule;
	private com.nest.res.bop.al01012026.rules.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule;
	private com.nest.res.bop.al01012026.rules.BOPEarthquake BOPEarthquakeRule;
	private List<BOPSprinklerLeakageEQExt> BOPSprinklerLeakageEQExtList;
	private List<BOPBurglaryAndRobberyProtectiveSafeguards> BOPBurglaryAndRobberyProtectiveSafeguardsList;
	private com.nest.res.bop.al01012026.rules.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverageRule;
	private com.nest.res.bop.al01012026.rules.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlInsRule;
	private com.nest.res.bop.al01012026.domain.BOPStructure BOPStructure;
	private com.nest.res.bop.al01012026.rules.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule;
	private com.nest.res.bop.al01012026.rules.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacingRule;
	private List<BOPOptionalOutdoorPropertyCoverage> BOPOptionalOutdoorPropertyCoverageList;
	private List<BOPEQSubLimit> BOPEQSubLimitList;
	private com.nest.res.bop.al01012026.rules.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverageRule;
	private List<BOPVacancyPermit> BOPVacancyPermitList;
	private com.nest.res.bop.al01012026.rules.BOPStructureElectronicDataLiabilityLimitedCoverage BOPStructureElectronicDataLiabilityLimitedCoverageRule;
	private List<BOPAutomaticIncreaseCoverageBuilding> BOPAutomaticIncreaseCoverageBuildingList;
	private com.nest.res.bop.al01012026.rules.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACVRule;
	
	
	
	public void PublicProtectionFactorBldg () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setPublicProtectionFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PublicProtectionClassPPCFactorBldg",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setPublicProtectionFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void restaurantCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setRestaurantCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Full Service")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Quick Service"))){
			this.BOPStructure.setRestaurantCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getRestaurantCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}		}

		}
	  
	}
	public void ByPerilFire2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilFire2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgFire2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setByPerilFire2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BldgCodeEffectivenessGradeFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructure.getBldgCodeEffectivenessGrade().equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setBldgCodeEffectivenessGradeFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BldgCodeEffectivenessGradeFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getBldgCodeEffectivenessGrade())))));
		}
		else{
			this.BOPStructure.setBldgCodeEffectivenessGradeFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CrimeLCM ()  {
	  this.BOPStructure.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../CrimeLCM"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	busnPrsnlPropLimitTemp_1();
	
	BusnPrsnlPropLimit();
	
	CombinedLimit();
	
	  
	}
	public void apartmentCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setApartmentCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Full Service")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Quick Service")))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment"))){
			this.BOPStructure.setApartmentCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getApartmentCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}
		}		}

		}
	  
	}
	public void TerrorismBldgNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void DedFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructure,"BOPWindstormOrHailExclusion")) != null){
			this.BOPStructure.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../OptnlDedFactor")))));
		}
		else{
			this.BOPStructure.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../DedFactor")))));
		}
	  
	}
	public void TerrsmLiabilityPremium ()  {
	  this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmPreLiabilityPremiumTemp_1() + this.BOPStructure.getTerrsmPostLiabilityPremiumTemp_1()));

	  
	}
	public void officeArea_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setOfficeArea_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Full Service")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Quick Service")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment")))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructure.setOfficeArea_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getOfficeArea_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))));
		}
		}
		}
		}		}

		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPAutomaticIncreaseCoverageBuilding/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPBusnIncomeAndExtraExpenseCovLOI") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPDebrisRmvlAddlIns") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPEQSubLimit") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPEarthquake") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPFunctlBldgValtn") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPLimitationsOnCoverageForRoofSurfacing") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPNamedPerilsBldg") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPOptionalPerPersonMedicalExpensesCoverageBuilding/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPOrdinanceOrLawCov") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPSprinklerLeakageEQExt") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureACVCoverage/Premium")))));
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureBuildingCoverage/Premium")))));
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureCyberIncidentLiabilityCoverage/Premium")))));
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureElectronicDataLiabilityBroadCoverage/Premium")))));
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureElectronicDataLiabilityLimitedCoverage/Premium")))));
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureLiabMedExpensesBldgCoverage/Premium")))));
this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureTenantsFireLiabCoverage/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPTenantsLiability") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPVacancyPermit") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPWindstormOrHailLossesRoofACV") ){
			this.BOPStructure.setPremium(MathHelper.getDoubleValue(this.BOPStructure.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void contractorCount_1 ()  {
	  this.BOPStructure.setContractorCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Contractor"))){
			this.BOPStructure.setContractorCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getContractorCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void ByPerilWater4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilWater4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWater4Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getClassCode())))));
		}
		else{
			this.BOPStructure.setByPerilWater4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilFire4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilFire4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgFire4Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getClassCode())))));
		}
		else{
			this.BOPStructure.setByPerilFire4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium2_CommonRatingSub2 ()  {
	  
	RatingPropertyType();
	
	ClassCode();
	
	RateNumber();
	
	ClassGroup();
	
	  
	}
	public void ProcessPremium3 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium3_CommonRatingSub1();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium4();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium5();

		}
	}
	if(null != BOPALWindHailExclDirectDamageList){
		for(BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage:BOPALWindHailExclDirectDamageList){
			BOPALWindHailExclDirectDamageRule = new com.nest.res.bop.al01012026.rules.BOPALWindHailExclDirectDamage(BOPALWindHailExclDirectDamage);
			BOPALWindHailExclDirectDamageRule.CommonRating1();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium6();

		}
	}
	ProcessPremium3_CommonRatingSub2();
	
	if(null != BOPStructureLiabMedExpensesBldgCoverageList){
		for(BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage:BOPStructureLiabMedExpensesBldgCoverageList){
			BOPStructureLiabMedExpensesBldgCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureLiabMedExpensesBldgCoverage(BOPStructureLiabMedExpensesBldgCoverage);
			BOPStructureLiabMedExpensesBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureBuildingCoverageList){
		for(BOPStructureBuildingCoverage BOPStructureBuildingCoverage:BOPStructureBuildingCoverageList){
			BOPStructureBuildingCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureBuildingCoverage(BOPStructureBuildingCoverage);
			BOPStructureBuildingCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureCyberIncidentLiabilityCoverageList){
		for(BOPStructureCyberIncidentLiabilityCoverage BOPStructureCyberIncidentLiabilityCoverage:BOPStructureCyberIncidentLiabilityCoverageList){
			BOPStructureCyberIncidentLiabilityCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureCyberIncidentLiabilityCoverage(BOPStructureCyberIncidentLiabilityCoverage);
			BOPStructureCyberIncidentLiabilityCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureElectronicDataLiabilityBroadCoverageList){
		for(BOPStructureElectronicDataLiabilityBroadCoverage BOPStructureElectronicDataLiabilityBroadCoverage:BOPStructureElectronicDataLiabilityBroadCoverageList){
			BOPStructureElectronicDataLiabilityBroadCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureElectronicDataLiabilityBroadCoverage(BOPStructureElectronicDataLiabilityBroadCoverage);
			BOPStructureElectronicDataLiabilityBroadCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureElectronicDataLiabilityLimitedCoverageList){
		for(BOPStructureElectronicDataLiabilityLimitedCoverage BOPStructureElectronicDataLiabilityLimitedCoverage:BOPStructureElectronicDataLiabilityLimitedCoverageList){
			BOPStructureElectronicDataLiabilityLimitedCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureElectronicDataLiabilityLimitedCoverage(BOPStructureElectronicDataLiabilityLimitedCoverage);
			BOPStructureElectronicDataLiabilityLimitedCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium7();

		}
	}
	ProcessPremium3_CommonRatingSub3();
	
	if(null != BOPDebrisRmvlAddlInsList){
		for(BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns:BOPDebrisRmvlAddlInsList){
			BOPDebrisRmvlAddlInsRule = new com.nest.res.bop.al01012026.rules.BOPDebrisRmvlAddlIns(BOPDebrisRmvlAddlIns);
			BOPDebrisRmvlAddlInsRule.ProcessPremium1();

		}
	}
	if(null != BOPEarthquakeList){
		for(BOPEarthquake BOPEarthquake:BOPEarthquakeList){
			BOPEarthquakeRule = new com.nest.res.bop.al01012026.rules.BOPEarthquake(BOPEarthquake);
			BOPEarthquakeRule.ProcessPremium1();

		}
	}
	if(null != BOPEQSubLimitList){
		for(BOPEQSubLimit BOPEQSubLimit:BOPEQSubLimitList){
			BOPEQSubLimitRule = new com.nest.res.bop.al01012026.rules.BOPEQSubLimit(BOPEQSubLimit);
			BOPEQSubLimitRule.ProcessPremium1();

		}
	}
	if(null != BOPFunctlBldgValtnList){
		for(BOPFunctlBldgValtn BOPFunctlBldgValtn:BOPFunctlBldgValtnList){
			BOPFunctlBldgValtnRule = new com.nest.res.bop.al01012026.rules.BOPFunctlBldgValtn(BOPFunctlBldgValtn);
			BOPFunctlBldgValtnRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList){
		for(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg:BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList){
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule = new com.nest.res.bop.al01012026.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg);
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList){
		for(BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis:BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList){
			BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule = new com.nest.res.bop.al01012026.rules.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis(BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis);
			BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitationsOnCoverageForRoofSurfacingList){
		for(BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing:BOPLimitationsOnCoverageForRoofSurfacingList){
			BOPLimitationsOnCoverageForRoofSurfacingRule = new com.nest.res.bop.al01012026.rules.BOPLimitationsOnCoverageForRoofSurfacing(BOPLimitationsOnCoverageForRoofSurfacing);
			BOPLimitationsOnCoverageForRoofSurfacingRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsBldgList){
		for(BOPNamedPerilsBldg BOPNamedPerilsBldg:BOPNamedPerilsBldgList){
			BOPNamedPerilsBldgRule = new com.nest.res.bop.al01012026.rules.BOPNamedPerilsBldg(BOPNamedPerilsBldg);
			BOPNamedPerilsBldgRule.ProcessPremium1();

		}
	}
	if(null != BOPOptionalPerPersonMedicalExpensesCoverageBuildingList){
		for(BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding:BOPOptionalPerPersonMedicalExpensesCoverageBuildingList){
			BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule = new com.nest.res.bop.al01012026.rules.BOPOptionalPerPersonMedicalExpensesCoverageBuilding(BOPOptionalPerPersonMedicalExpensesCoverageBuilding);
			BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCovList){
		for(BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov:BOPOrdinanceOrLawCovList){
			BOPOrdinanceOrLawCovRule = new com.nest.res.bop.al01012026.rules.BOPOrdinanceOrLawCov(BOPOrdinanceOrLawCov);
			BOPOrdinanceOrLawCovRule.ProcessPremium1();

		}
	}
	if(null != BOPSprinklerLeakageEQExtList){
		for(BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt:BOPSprinklerLeakageEQExtList){
			BOPSprinklerLeakageEQExtRule = new com.nest.res.bop.al01012026.rules.BOPSprinklerLeakageEQExt(BOPSprinklerLeakageEQExt);
			BOPSprinklerLeakageEQExtRule.ProcessPremium1();

		}
	}
	if(null != BOPAutomaticIncreaseCoverageBuildingList){
		for(BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding:BOPAutomaticIncreaseCoverageBuildingList){
			BOPAutomaticIncreaseCoverageBuildingRule = new com.nest.res.bop.al01012026.rules.BOPAutomaticIncreaseCoverageBuilding(BOPAutomaticIncreaseCoverageBuilding);
			BOPAutomaticIncreaseCoverageBuildingRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureACVCoverageList){
		for(BOPStructureACVCoverage BOPStructureACVCoverage:BOPStructureACVCoverageList){
			BOPStructureACVCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureACVCoverage(BOPStructureACVCoverage);
			BOPStructureACVCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureTenantsFireLiabCoverageList){
		for(BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage:BOPStructureTenantsFireLiabCoverageList){
			BOPStructureTenantsFireLiabCoverageRule = new com.nest.res.bop.al01012026.rules.BOPStructureTenantsFireLiabCoverage(BOPStructureTenantsFireLiabCoverage);
			BOPStructureTenantsFireLiabCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPTenantsLiabilityList){
		for(BOPTenantsLiability BOPTenantsLiability:BOPTenantsLiabilityList){
			BOPTenantsLiabilityRule = new com.nest.res.bop.al01012026.rules.BOPTenantsLiability(BOPTenantsLiability);
			BOPTenantsLiabilityRule.ProcessPremium1();

		}
	}
	if(null != BOPVacancyPermitList){
		for(BOPVacancyPermit BOPVacancyPermit:BOPVacancyPermitList){
			BOPVacancyPermitRule = new com.nest.res.bop.al01012026.rules.BOPVacancyPermit(BOPVacancyPermit);
			BOPVacancyPermitRule.ProcessPremium1();

		}
	}
	if(null != BOPWindstormOrHailLossesRoofACVList){
		for(BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV:BOPWindstormOrHailLossesRoofACVList){
			BOPWindstormOrHailLossesRoofACVRule = new com.nest.res.bop.al01012026.rules.BOPWindstormOrHailLossesRoofACV(BOPWindstormOrHailLossesRoofACV);
			BOPWindstormOrHailLossesRoofACVRule.ProcessPremium1();

		}
	}
	ProcessPremium3_CommonRatingSub4();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium8();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium9();

		}
	}
	if(null != BOPBusnIncomeAndExtraExpenseCovLOIList){
		for(BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI:BOPBusnIncomeAndExtraExpenseCovLOIList){
			BOPBusnIncomeAndExtraExpenseCovLOIRule = new com.nest.res.bop.al01012026.rules.BOPBusnIncomeAndExtraExpenseCovLOI(BOPBusnIncomeAndExtraExpenseCovLOI);
			BOPBusnIncomeAndExtraExpenseCovLOIRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList){
		for(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity:BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList){
			BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule = new com.nest.res.bop.al01012026.rules.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity);
			BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule.ProcessPremium1();

		}
	}
	  
	}
	public void ByPerilWindBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilWindBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgBaseRate",String.valueOf( "Wind")))));
		}
		else{
			this.BOPStructure.setByPerilWindBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilTheft3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilTheft3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgTheft3Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setByPerilTheft3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWater1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && this.BOPStructure.getBuildingLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setByPerilWater1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWater1Factor",String.valueOf(this.BOPStructure.getConstructionType()),String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getBuildingLimit()))))));
		}
		else{
			this.BOPStructure.setByPerilWater1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ContractorCount ()  {
	  this.BOPStructure.setContractorCount(this.BOPStructure.getContractorCount_1());

	  
	}
	public void RateNumber ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setRateNumber(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RateNumber")))));
		}		}

	  
	}
	public void ClassGroup ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setClassGroup(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassGroup")))));
		}		}

	  
	}
	public void ByPerilFireBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilFireBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgBaseRate",String.valueOf( "Fire")))));
		}
		else{
			this.BOPStructure.setByPerilFireBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Area ()  {
	  this.BOPStructure.setArea(this.BOPStructure.getAreaTemp_1());

	  
	}
	public void officePct_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
		if(this.BOPStructure.getOfficeArea_1() > MathHelper.getIntegerValue(0.0) && this.BOPStructure.getArea() != MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setOfficePct_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue((MathHelper.getDoubleValue(this.BOPStructure.getOfficeArea_1()) / MathHelper.getDoubleValue(this.BOPStructure.getArea())) * MathHelper.getDoubleValue(100.0))));
		}
		else{
			this.BOPStructure.setOfficePct_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void totalBusnPrsnlPropCovPremiumTemp_1 ()  {
	  this.BOPStructure.setTotalBusnPrsnlPropCovPremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification/BOPClassificationBusnPrsnlPropCoverage") ){
			this.BOPStructure.setTotalBusnPrsnlPropCovPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTotalBusnPrsnlPropCovPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium4 ()  {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium10();

		}
	}
	  
	}
	public void TerrorismLiabilityFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabilityFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabilityFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void ByPerilWaterBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilWaterBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgBaseRate",String.valueOf( "Water")))));
		}
		else{
			this.BOPStructure.setByPerilWaterBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void SprinkleredFactorBldg () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("Yes"))){
		if(!this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setSprinkleredFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SprinkleredFactorBldg",String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setSprinkleredFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPStructure.setSprinkleredFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void ByPerilFireRate ()  {
	  this.BOPStructure.setByPerilFireRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPStructure.getByPerilFireBaseRate() * this.BOPStructure.getLCM()) * this.BOPStructure.getByPerilFire1Factor() * this.BOPStructure.getByPerilFire2Factor() * this.BOPStructure.getByPerilFire3Factor() * this.BOPStructure.getByPerilFire4Factor()));

	  
	}
	public void ByPerilWind2Factor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() == 0.0 && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilWind2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWind2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setByPerilWind2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilFire3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilFire3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgFire3Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setByPerilFire3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPStructure (com.nest.res.bop.al01012026.domain.BOPStructure BOPStructure)  {
	  this.BOPStructure = BOPStructure;
this.BOPLimitationsOnCoverageForRoofSurfacingList = BOPStructure.getBOPLimitationsOnCoverageForRoofSurfacing();
this.BOPEarthquakeList = BOPStructure.getBOPEarthquake();
this.BOPStructureLiabMedExpensesBldgCoverageList = BOPStructure.getBOPStructureLiabMedExpensesBldgCoverage();
this.BOPClassificationList = BOPStructure.getBOPClassification();
this.BOPWindstormOrHailExclusionList = BOPStructure.getBOPWindstormOrHailExclusion();
this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList = BOPStructure.getBOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis();
this.BOPWindstormOrHailLossesRoofACVList = BOPStructure.getBOPWindstormOrHailLossesRoofACV();
this.BOPStructureCyberIncidentLiabilityCoverageList = BOPStructure.getBOPStructureCyberIncidentLiabilityCoverage();
this.BOPBusnIncomeAndExtraExpenseCovLOIList = BOPStructure.getBOPBusnIncomeAndExtraExpenseCovLOI();
this.BOPTenantsLiabilityList = BOPStructure.getBOPTenantsLiability();
this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList = BOPStructure.getBOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg();
this.BOPVacancyChangesList = BOPStructure.getBOPVacancyChanges();
this.BOPDebrisRmvlAddlInsList = BOPStructure.getBOPDebrisRmvlAddlIns();
this.BOPStructureElectronicDataLiabilityBroadCoverageList = BOPStructure.getBOPStructureElectronicDataLiabilityBroadCoverage();
this.BOPOptionalPerPersonMedicalExpensesCoverageBuildingList = BOPStructure.getBOPOptionalPerPersonMedicalExpensesCoverageBuilding();
this.BOPStructureACVCoverageList = BOPStructure.getBOPStructureACVCoverage();
this.BOPStructureTenantsFireLiabCoverageList = BOPStructure.getBOPStructureTenantsFireLiabCoverage();
this.BOPLossPayableList = BOPStructure.getBOPLossPayable();
this.BOPProtectiveSafeguardsList = BOPStructure.getBOPProtectiveSafeguards();
this.BOPStructureElectronicDataLiabilityLimitedCoverageList = BOPStructure.getBOPStructureElectronicDataLiabilityLimitedCoverage();
this.BOPOrdinanceOrLawCovList = BOPStructure.getBOPOrdinanceOrLawCov();
this.BOPALWindHailExclDirectDamageList = BOPStructure.getBOPALWindHailExclDirectDamage();
this.BOPCondoAssociationCovList = BOPStructure.getBOPCondoAssociationCov();
this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList = BOPStructure.getBOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity();
this.BOPNamedPerilsBldgList = BOPStructure.getBOPNamedPerilsBldg();
this.BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalPropertiesList = BOPStructure.getBOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalProperties();
this.BOPFunctlBldgValtnList = BOPStructure.getBOPFunctlBldgValtn();
this.BOPALCondoAddlProvisionsList = BOPStructure.getBOPALCondoAddlProvisions();
this.BOPStructureBuildingCoverageList = BOPStructure.getBOPStructureBuildingCoverage();
this.BOPSprinklerLeakageEQExtList = BOPStructure.getBOPSprinklerLeakageEQExt();
this.BOPBurglaryAndRobberyProtectiveSafeguardsList = BOPStructure.getBOPBurglaryAndRobberyProtectiveSafeguards();
this.BOPOptionalOutdoorPropertyCoverageList = BOPStructure.getBOPOptionalOutdoorPropertyCoverage();
this.BOPEQSubLimitList = BOPStructure.getBOPEQSubLimit();
this.BOPVacancyPermitList = BOPStructure.getBOPVacancyPermit();
this.BOPAutomaticIncreaseCoverageBuildingList = BOPStructure.getBOPAutomaticIncreaseCoverageBuilding();

	  
	}
	public void ByPerilHurricane3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilHurricane3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgHurricane3Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setByPerilHurricane3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWindstormOrHailExclBldgFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setByPerilWindstormOrHailExclBldgFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBldgFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")))));

	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium2();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium3();

		}
	}
	ProcessPremium2_CommonRatingSub2();
	
	  
	}
	public void liabMedExpensesTotPremiumTemp_1 ()  {
	  
		if(!this.BOPStructure.getPctOwnerOccupied().equals(MathHelper.getStringValue("Less than 50%"))){
			this.BOPStructure.setLiabMedExpensesTotPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification/BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage") ){
			this.BOPStructure.setLiabMedExpensesTotPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		}
	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../EachOccLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../ProdCompldOpsAggregateLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../AggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../EachOccLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../ProdCompldOpsAggregateLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../AggregateLimit"))))));
		}
		else{
			this.BOPStructure.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium2_CommonRatingSub1 ()  {
	  
	areaTemp_1();
	
	Area();
	
	restaurantCount_1();
	
	otherCount_1();
	
	apartmentCount_1();
	
	officeCount_1();
	
	officeArea_1();
	
	officePct_1();
	
	PredominantType();
	
	  
	}
	public void buildingRateToUse_1 ()  {
	  
		if(!this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
			this.BOPStructure.setBuildingRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getBuildingRateRABOP()) + MathHelper.getDoubleValue(this.BOPStructure.getHurricaneLossCostsBuilding()))));
		}
		else{
			this.BOPStructure.setBuildingRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getBuildingRate())));
		}
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPStructure.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../CommercialPropertyLCM"))));

	  
	}
	public void TenantsLiabilityApply ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPTenantsLiability").size() > 0.0){
			this.BOPStructure.setTenantsLiabilityApply(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPStructure.setTenantsLiabilityApply(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
	  
	}
	public void TerrorismBldgFullRate () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgFullRate",String.valueOf( "Y"))));

	  
	}
	public void ByPerilFire1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && this.BOPStructure.getBuildingLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setByPerilFire1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgFire1Factor",String.valueOf(this.BOPStructure.getConstructionType()),String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getBuildingLimit()))))));
		}
		else{
			this.BOPStructure.setByPerilFire1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void terrsmPostLiabilityPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabilityFullFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabilityFullFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium())) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabNuclBiolChemRadFactor()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
		if(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() > MathHelper.getDoubleValue(0.0) && this.BOPStructure.getIncrLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPStructure.setTerrsmPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabilityFullFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium())) * MathHelper.roundToThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabIncrLimitsFactor()) / MathHelper.getDoubleValue(this.BOPStructure.getIncrLimitFactor())))));
		}
		else{
			this.BOPStructure.setTerrsmPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPStructure.setTerrsmPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPStructure.setTerrsmPostLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilHurricaneBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilHurricaneBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgBaseRate",String.valueOf( "Hurricane")))));
		}
		else{
			this.BOPStructure.setByPerilHurricaneBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismSprinkleredFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrorismSprinkleredFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TerrorismSprinkleredFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPStructure.setTerrorismSprinkleredFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void condoCountTemp_1 ()  {
	  this.BOPStructure.setCondoCountTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 1 - 4 Units - No Mixed Use")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 1 - 4 Units - With Mixed Use - No Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 1 - 4 Units - With Mixed Use - With Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 5 - 9 Units - No Mixed Use")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 5 - 9 Units - With Mixed Use - No Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 5 - 9 Units - With Mixed Use - With Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 10 - 30 Units - No Mixed Use")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 10 - 30 Units - With Mixed Use - No Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - 10 - 30 Units - With Mixed Use - With Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - Over 30 Units - No Mixed Use")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - Over 30 Units - With Mixed Use - No Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Assn risk only) - Over 30 Units - With Mixed Use - With Rest")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Office Condominium (Assn risk only)"))){
			this.BOPStructure.setCondoCountTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getCondoCountTemp_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void WindstormOrHailExclBldgFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() > 0.0 || this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setWindstormOrHailExclBldgFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBldgFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setWindstormOrHailExclBldgFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium3_CommonRatingSub3 ()  {
	  
	totalBusnPrsnlPropCovPremiumTemp_1();
	
	TotalBusnPrsnlPropCovPremium();
	
	  
	}
	public void ByPerilTheft1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && this.BOPStructure.getBuildingLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setByPerilTheft1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgTheft1Factor",String.valueOf(this.BOPStructure.getConstructionType()),String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getBuildingLimit()))))));
		}
		else{
			this.BOPStructure.setByPerilTheft1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWind1Factor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() == 0.0 && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && this.BOPStructure.getBuildingLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setByPerilWind1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWind1Factor",String.valueOf(this.BOPStructure.getConstructionType()),String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getBuildingLimit()))))));
		}
		else{
			this.BOPStructure.setByPerilWind1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilHurricaneRate ()  {
	  this.BOPStructure.setByPerilHurricaneRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPStructure.getByPerilHurricaneBaseRate() * this.BOPStructure.getLCM()) * this.BOPStructure.getByPerilHurricane1Factor() * this.BOPStructure.getByPerilHurricane2Factor() * this.BOPStructure.getByPerilHurricane3Factor() * this.BOPStructure.getByPerilHurricane4Factor()));

	  
	}
	public void ByPerilTotalRate ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() > 0.0){
			this.BOPStructure.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getByPerilFireRate() + this.BOPStructure.getByPerilTheftRate() + this.BOPStructure.getByPerilWaterRate() + this.BOPStructure.getByPerilHurricaneRate())));
		}
		else{
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() == 0.0 && XpathNode.selectNodes(this.BOPStructure,"BOPALWindHailExclDirectDamage").size() == 0.0 && this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getByPerilFireRate() + (this.BOPStructure.getByPerilWindRate() * (MathHelper.getDoubleValue(1.0) - this.BOPStructure.getWindMitigationDiscount())) + this.BOPStructure.getByPerilTheftRate() + this.BOPStructure.getByPerilWaterRate() + this.BOPStructure.getByPerilHurricaneRate())));
		}
		else{
		if(XpathNode.selectNodes(this.BOPStructure,"BOPALWindHailExclDirectDamage").size() > 0.0 && this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("No"))){
			this.BOPStructure.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getByPerilFireRate() + MathHelper.roundToThousand(this.BOPStructure.getByPerilWindRate() * (MathHelper.getDoubleValue(1.0) - MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPALWindHailExclDirectDamage/BldgCreditFactor"))) * this.BOPStructure.getLCM()) / MathHelper.roundToThousand(this.BOPStructure.getByPerilWindstormOrHailExclBldgFactor() * this.BOPStructure.getLCM())))) + this.BOPStructure.getByPerilTheftRate() + this.BOPStructure.getByPerilWaterRate() + this.BOPStructure.getByPerilHurricaneRate())));
		}
		else{
		if(XpathNode.selectNodes(this.BOPStructure,"BOPALWindHailExclDirectDamage").size() > 0.0 && this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getByPerilFireRate() + MathHelper.roundToThousand((this.BOPStructure.getByPerilWindRate() * (MathHelper.getDoubleValue(1.0) - this.BOPStructure.getWindMitigationDiscount())) * (MathHelper.getDoubleValue(1.0) - MathHelper.roundToThousand(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPALWindHailExclDirectDamage/BldgCreditFactor"))) * this.BOPStructure.getLCM()) / MathHelper.roundToThousand(this.BOPStructure.getByPerilWindstormOrHailExclBldgFactor() * this.BOPStructure.getLCM())))) + this.BOPStructure.getByPerilTheftRate() + this.BOPStructure.getByPerilWaterRate() + this.BOPStructure.getByPerilHurricaneRate())));
		}
		else{
			this.BOPStructure.setByPerilTotalRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getByPerilFireRate() + this.BOPStructure.getByPerilWindRate() + this.BOPStructure.getByPerilTheftRate() + this.BOPStructure.getByPerilWaterRate() + this.BOPStructure.getByPerilHurricaneRate())));
		}
		}
		}
		}
	  
	}
	public void ByPerilTheftRate ()  {
	  this.BOPStructure.setByPerilTheftRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPStructure.getByPerilTheftBaseRate() * this.BOPStructure.getLCM()) * this.BOPStructure.getByPerilTheft1Factor() * this.BOPStructure.getByPerilTheft2Factor() * this.BOPStructure.getByPerilTheft3Factor() * this.BOPStructure.getByPerilTheft4Factor()));

	  
	}
	public void HurricaneLossCostsBuilding () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setHurricaneLossCostsBuilding(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HurricaneLossCostsBuilding",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setHurricaneLossCostsBuilding(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilHurricane1Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && this.BOPStructure.getBuildingLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setByPerilHurricane1Factor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgHurricane1Factor",String.valueOf(this.BOPStructure.getConstructionType()),String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getBuildingLimit()))))));
		}
		else{
			this.BOPStructure.setByPerilHurricane1Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWind4Factor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() == 0.0 && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilWind4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWind4Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getClassCode())))));
		}
		else{
			this.BOPStructure.setByPerilWind4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ConstructionTypeFactorBldg () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setConstructionTypeFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ConstructionTypeFactorBldg",String.valueOf(this.BOPStructure.getConstructionType())))));
		}
		else{
			this.BOPStructure.setConstructionTypeFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium3_CommonRatingSub4 ()  {
	  
	TotLessorsLiabPremium();
	
	liabMedExpensesTotPremiumTemp_1();
	
	LiabMedExpensesTotPremium();
	
	terrsmPreBldgPremiumTemp_1();
	
	terrsmPostBldgPremiumTemp_1();
	
	TerrsmBldgPremium();
	
	terrsmPreLiabilityPremiumTemp_1();
	
	terrsmPostLiabilityPremiumTemp_1();
	
	TerrsmLiabilityPremium();
	
	  
	}
	public void ByPerilWind3Factor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() == 0.0 && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilWind3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWind3Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setByPerilWind3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPStructure.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../GeneralLiabilityLCM"))));

	  
	}
	public void RateNumberFactorBldg () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPClassification").size() > 0.0){
		if(!this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setRateNumberFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBldg",String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setRateNumberFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPStructure.setRateNumberFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismLiabilityFullFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabilityFullFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabilityFullFactor",String.valueOf( "Y"))));

	  
	}
	public void ClassCode ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setClassCode(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode")))));
		}		}

	  
	}
	public void FungiExcessCovRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getSeparateAnnualAggregateLimit().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setFungiExcessCovRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiExcessLimitRate",String.valueOf( "Y")))));
		}
	  
	}
	public void ProcessPremium3_CommonRatingSub2 () throws LookupException,NumberFormatException {
	  
	RatingPropertyType();
	
	ClassCode();
	
	RateNumber();
	
	ClassGroup();
	
	HurricaneLossCostsBuilding();
	
	WindMitigationDiscount();
	
	GeneralLiabilityLCM();
	
	CommercialPropertyLCM();
	
	CrimeLCM();
	
	LCM();
	
	contractorCount_1();
	
	ContractorCount();
	
	condoCountTemp_1();
	
	CondoCount();
	
	TenantsLiabilityApply();
	
	AutomaticIncreaseFactor();
	
	DedFactor();
	
	ConstructionTypeFactorBldg();
	
	PublicProtectionFactorBldg();
	
	BuildingRateRABOP();
	
	BuildingRate();
	
	BldgCodeEffectivenessGradeFactor();
	
	SprinkleredFactorBldg();
	
	TerrorismSprinkleredFactor();
	
	RateNumberFactorBldg();
	
	WindstormOrHailExclBldgFactor();
	
	BldgLimitOfInsuranceRelativityGroup();
	
	BldgLimitOfInsuranceRelativityFactor();
	
	ByPerilHurricaneBaseRate();
	
	ByPerilHurricane1Factor();
	
	ByPerilHurricane2Factor();
	
	ByPerilHurricane3Factor();
	
	ByPerilHurricane4Factor();
	
	ByPerilHurricaneRate();
	
	ByPerilWindstormOrHailExclBldgFactor();
	
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
	
	buildingRateToUse_1();
	
	bldgCreditFactor_1();
	
	FinalBuildingRate();
	
	FungiExcessCovRate();
	
	FungiExcessLimitPremium();
	
	TerrorismBldgRate();
	
	TerrorismBldgFullRate();
	
	TerrorismBldgNuclBiolChemRadFactor();
	
	TerrorismLiabilityFactor();
	
	TerrorismLiabilityFullFactor();
	
	TerrorismLiabNuclBiolChemRadFactor();
	
	TerrsmLiabIncrLimitsFactor();
	
	IncrLimitFactor();
	
	  
	}
	public void TerrsmBldgPremium ()  {
	  this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmPreBldgPremiumTemp_1() + this.BOPStructure.getTerrsmPostBldgPremiumTemp_1()));

	  
	}
	public void TerrsmLiabIncrLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))).equals(MathHelper.getStringValue("Not Applicable"))){
			this.BOPStructure.setTerrsmLiabIncrLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TerrorismLiabIncrLimitsFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))))));
		}
		else{
			this.BOPStructure.setTerrsmLiabIncrLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilTheft2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilTheft2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgTheft2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setByPerilTheft2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilWaterRate ()  {
	  this.BOPStructure.setByPerilWaterRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPStructure.getByPerilWaterBaseRate() * this.BOPStructure.getLCM()) * this.BOPStructure.getByPerilWater1Factor() * this.BOPStructure.getByPerilWater2Factor() * this.BOPStructure.getByPerilWater3Factor() * this.BOPStructure.getByPerilWater4Factor()));

	  
	}
	public void areaTemp_1 ()  {
	  this.BOPStructure.setAreaTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
			this.BOPStructure.setAreaTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getAreaTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))));
		}		}

	  
	}
	public void ByPerilWindRate ()  {
	  this.BOPStructure.setByPerilWindRate(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPStructure.getByPerilWindBaseRate() * this.BOPStructure.getLCM()) * this.BOPStructure.getByPerilWind1Factor() * this.BOPStructure.getByPerilWind2Factor() * this.BOPStructure.getByPerilWind3Factor() * this.BOPStructure.getByPerilWind4Factor()));

	  
	}
	public void BuildingRateRABOP () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCodeOverride"))))));
		}
		else{
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		else{
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCodeOverride"))))));
		}
		else{
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
	  
	}
	public void ByPerilWater2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilWater2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgTheft2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setByPerilWater2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void FinalBuildingRate ()  {
	  
		if(!this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setFinalBuildingRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPStructure.getRateNumberFactorBldg() * this.BOPStructure.getConstructionTypeFactorBldg() * this.BOPStructure.getBldgLimitOfInsuranceRelativityFactor() * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getBldgCodeEffectivenessGradeFactor() * this.BOPStructure.getSprinkleredFactorBldg() * this.BOPStructure.getDedFactor() * ((MathHelper.roundToThousand(this.BOPStructure.getBuildingRateToUse_1() * this.BOPStructure.getLCM()) - MathHelper.roundToThousand(this.BOPStructure.getBldgCreditFactor_1() * this.BOPStructure.getLCM())) - MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPStructure.getWindstormOrHailExclBldgFactor() * this.BOPStructure.getLCM()) - MathHelper.roundToThousand(this.BOPStructure.getBldgCreditFactor_1() * this.BOPStructure.getLCM())) * this.BOPStructure.getWindMitigationDiscount())))));
		}
		else{
			this.BOPStructure.setFinalBuildingRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPStructure.getByPerilTotalRate() * this.BOPStructure.getDedFactor() * this.BOPStructure.getBldgCodeEffectivenessGradeFactor())));
		}
	  
	}
	public void ByPerilTheftBaseRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setByPerilTheftBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgBaseRate",String.valueOf( "Theft")))));
		}
		else{
			this.BOPStructure.setByPerilTheftBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilHurricane2Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilHurricane2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgHurricane2Factor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setByPerilHurricane2Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ByPerilHurricane4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilHurricane4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgHurricane4Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getClassCode())))));
		}
		else{
			this.BOPStructure.setByPerilHurricane4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BldgLimitOfInsuranceRelativityGroup () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setBldgLimitOfInsuranceRelativityGroup(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("BldgLimitOfInsRelativityGroup",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setBldgLimitOfInsuranceRelativityGroup(MathHelper.getStringValue(MathHelper.getStringValue("0")));
		}
	  
	}
	public void WindMitigationDiscount () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes")) && ((this.BOPStructure.getRoofMaterial().equals(MathHelper.getStringValue("Metal")) && this.BOPStructure.getRoofAge().equals(MathHelper.getStringValue("Over 10 Years Old"))) || (this.BOPStructure.getRoofMaterial().equals(MathHelper.getStringValue("Non-Metal")) && this.BOPStructure.getRoofAge().equals(MathHelper.getStringValue("Over 5 Years Old"))))){
		if(this.BOPStructure.getOccupancyClass().equals(MathHelper.getStringValue("Commercial"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !this.BOPStructure.getCertificateLevel().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountCommercialOlderRoof",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getCertificateLevel())))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPStructure.getOccupancyClass().equals(MathHelper.getStringValue("Residential"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !this.BOPStructure.getCertificateLevel().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountResidentialOlderRoof",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getCertificateLevel())))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
		}
		else{
		if(this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes")) && ((this.BOPStructure.getRoofMaterial().equals(MathHelper.getStringValue("Metal")) && this.BOPStructure.getRoofAge().equals(MathHelper.getStringValue("10 or Under Years Old")) && !this.BOPStructure.getSubDecking().equals(MathHelper.getStringValue("No"))) || (this.BOPStructure.getRoofMaterial().equals(MathHelper.getStringValue("Non-Metal")) && this.BOPStructure.getRoofAge().equals(MathHelper.getStringValue("5 or Under Years Old"))))){
		if(this.BOPStructure.getOccupancyClass().equals(MathHelper.getStringValue("Commercial"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !this.BOPStructure.getCertificateLevel().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountCommercialNewerRoof",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getCertificateLevel())))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(this.BOPStructure.getOccupancyClass().equals(MathHelper.getStringValue("Residential"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !this.BOPStructure.getCertificateLevel().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountResidentialNewerRoof",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getCertificateLevel())))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
		}
		else{
		if(this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes")) && (this.BOPStructure.getRoofMaterial().equals(MathHelper.getStringValue("Metal")) && this.BOPStructure.getRoofAge().equals(MathHelper.getStringValue("10 or Under Years Old")) && this.BOPStructure.getSubDecking().equals(MathHelper.getStringValue("No")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue("")) && !this.BOPStructure.getCertificateLevel().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountCommercialNoSubdecking",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getCertificateLevel())))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() == 0.0 && this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("No"))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
		}
		}
	  
	}
	public void ByPerilTheft4Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getClassCode().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilTheft4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgTheft4Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getClassCode())))));
		}
		else{
			this.BOPStructure.setByPerilTheft4Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void bldgCreditFactor_1 ()  {
	  
		if(!this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes"))){
		if(XpathNode.selectNodes(this.BOPStructure,"BOPALWindHailExclDirectDamage").size() > 0.0){
			this.BOPStructure.setBldgCreditFactor_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPALWindHailExclDirectDamage/BldgCreditFactor")))));
		}
		else{
			this.BOPStructure.setBldgCreditFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void CombinedLimit ()  {
	  this.BOPStructure.setCombinedLimit(MathHelper.getIntegerValue(this.BOPStructure.getBusnPrsnlPropLimit() + this.BOPStructure.getBuildingLimit()));

	  
	}
	public void RatingPropertyType ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setRatingPropertyType(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType")))));
		}		}

	  
	}
	public void terrsmPreLiabilityPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabilityFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabilityFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium())) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabNuclBiolChemRadFactor()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
		if(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() > MathHelper.getDoubleValue(0.0) && this.BOPStructure.getIncrLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPStructure.setTerrsmPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismLiabilityFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium())) * MathHelper.roundToThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabIncrLimitsFactor()) / MathHelper.getDoubleValue(this.BOPStructure.getIncrLimitFactor())))));
		}
		else{
			this.BOPStructure.setTerrsmPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPStructure.setTerrsmPreLiabilityPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void BuildingRate () throws LookupException,NumberFormatException {
	  
		if(!(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed")))){
		if(!(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("No")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setBuildingRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRate",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setBuildingRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void busnPrsnlPropLimitTemp_1 ()  {
	  this.BOPStructure.setBusnPrsnlPropLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){
			this.BOPStructure.setBusnPrsnlPropLimitTemp_1(MathHelper.getIntegerValue(this.BOPStructure.getBusnPrsnlPropLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TotBusnPrsnlPropLimit")))));
		}

	  
	}
	public void officeCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setOfficeCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Full Service")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Quick Service")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment")))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructure.setOfficeCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getOfficeCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}
		}
		}		}

		}
	  
	}
	public void TotLessorsLiabPremium ()  {
	  this.BOPStructure.setTotLessorsLiabPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureLiabMedExpensesBldgCoverage/Premium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureACVCoverage/Premium")))));

	  
	}
	public void LCM ()  {
	  this.BOPStructure.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../LCM"))));

	  
	}
	public void ByPerilWater3Factor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPByPerilRating().equals(MathHelper.getStringValue("Yes")) && !this.BOPStructure.getSprinklered().equals(MathHelper.getStringValue("")) && !this.BOPStructure.getRateNumber().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setByPerilWater3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ByPerilBldgWater3Factor",String.valueOf(this.BOPStructure.getSprinklered()),String.valueOf(this.BOPStructure.getRateNumber())))));
		}
		else{
			this.BOPStructure.setByPerilWater3Factor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void otherCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setOtherCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Full Service")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Quick Service"))){
			this.BOPStructure.setOtherCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getOtherCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		else{
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office Condominium")))){
			this.BOPStructure.setOtherCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getOtherCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}
		}
		}		}

		}
	  
	}
	public void PredominantType ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
		if(this.BOPStructure.getApartmentCount_1() > MathHelper.getIntegerValue(0.0)){
		if(this.BOPStructure.getOfficePct_1() > MathHelper.getDoubleValue(15.0)){
		if(this.BOPStructure.getOtherCount_1() > MathHelper.getIntegerValue(0.0)){
		if(this.BOPStructure.getRestaurantCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Restaurant")));
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("OfficeApartmentOther")));
		}
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Office")));
		}
		}
		else{
		if(this.BOPStructure.getOtherCount_1() > MathHelper.getIntegerValue(0.0)){
		if(this.BOPStructure.getRestaurantCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Restaurant")));
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("OfficeApartmentOther")));
		}
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Apartment")));
		}
		}
		}
		else{
		if(this.BOPStructure.getOfficeCount_1() > MathHelper.getIntegerValue(0.0)){
		if(this.BOPStructure.getOtherCount_1() > MathHelper.getIntegerValue(0.0)){
		if(this.BOPStructure.getRestaurantCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Restaurant")));
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("OfficeApartmentOther")));
		}
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Office")));
		}
		}
		else{
		if(this.BOPStructure.getOtherCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Other")));
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("Other")));
		}
		}
		}
		}
		else{
			this.BOPStructure.setPredominantType(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void BldgLimitOfInsuranceRelativityFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getBuildingLimit() != MathHelper.getIntegerValue(0.0) && !this.BOPStructure.getBldgLimitOfInsuranceRelativityGroup().equals(MathHelper.getStringValue("0"))){
			this.BOPStructure.setBldgLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BldgLimitOfInsRelativityFactors",String.valueOf(this.BOPStructure.getBuildingLimit()),String.valueOf(this.BOPStructure.getBldgLimitOfInsuranceRelativityGroup()))))));
		}
		else{
			this.BOPStructure.setBldgLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void TerrorismLiabNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void LiabMedExpensesTotPremium ()  {
	  
		if(!this.BOPStructure.getPctOwnerOccupied().equals(MathHelper.getStringValue("Less than 50%"))){
			this.BOPStructure.setLiabMedExpensesTotPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTotLessorsLiabPremium() + this.BOPStructure.getLiabMedExpensesTotPremiumTemp_1())));
		}
		else{
			this.BOPStructure.setLiabMedExpensesTotPremium(MathHelper.getDoubleValue(this.BOPStructure.getTotLessorsLiabPremium()));
		}
	  
	}
	public void terrsmPreBldgPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmPreBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgRate()) * MathHelper.getDoubleValue(this.BOPStructure.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getPublicProtectionFactorBldg()) * MathHelper.getDoubleValue(this.BOPStructure.getDedFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismSprinkleredFactor())) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmPreBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgRate()) * MathHelper.getDoubleValue(this.BOPStructure.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getPublicProtectionFactorBldg()) * MathHelper.getDoubleValue(this.BOPStructure.getDedFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismSprinkleredFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgNuclBiolChemRadFactor())) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPStructure.setTerrsmPreBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgRate()) * MathHelper.getDoubleValue(this.BOPStructure.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getPublicProtectionFactorBldg()) * MathHelper.getDoubleValue(this.BOPStructure.getDedFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismSprinkleredFactor())) * MathHelper.getDoubleValue(this.BOPStructure.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
			this.BOPStructure.setTerrsmPreBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void AutomaticIncreaseFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > MathHelper.getIntegerValue(0.0)){
			this.BOPStructure.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf(this.BOPStructure.getAutomaticIncreasePct())))));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismBldgRate () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgRate",String.valueOf( "Y"))));

	  
	}
	public void terrsmPostBldgPremiumTemp_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmPostBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgFullRate()) * MathHelper.getDoubleValue(this.BOPStructure.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getPublicProtectionFactorBldg()) * MathHelper.getDoubleValue(this.BOPStructure.getDedFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismSprinkleredFactor())) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmPostBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgFullRate()) * MathHelper.getDoubleValue(this.BOPStructure.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getPublicProtectionFactorBldg()) * MathHelper.getDoubleValue(this.BOPStructure.getDedFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismSprinkleredFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgNuclBiolChemRadFactor())) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPStructure.setTerrsmPostBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(MathHelper.getDoubleValue(this.BOPStructure.getTerrorismBldgFullRate()) * MathHelper.getDoubleValue(this.BOPStructure.getLCM()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor")))) * MathHelper.getDoubleValue(this.BOPStructure.getPublicProtectionFactorBldg()) * MathHelper.getDoubleValue(this.BOPStructure.getDedFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrorismSprinkleredFactor())) * MathHelper.getDoubleValue(this.BOPStructure.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
			this.BOPStructure.setTerrsmPostBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPStructure.setTerrsmPostBldgPremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TotalBusnPrsnlPropCovPremium ()  {
	  this.BOPStructure.setTotalBusnPrsnlPropCovPremium(this.BOPStructure.getTotalBusnPrsnlPropCovPremiumTemp_1());

	  
	}
	public void BusnPrsnlPropLimit ()  {
	  this.BOPStructure.setBusnPrsnlPropLimit(this.BOPStructure.getBusnPrsnlPropLimitTemp_1());

	  
	}
	public void ProcessPremium3_CommonRatingSub1 ()  {
	  
	areaTemp_1();
	
	Area();
	
	restaurantCount_1();
	
	otherCount_1();
	
	apartmentCount_1();
	
	officeCount_1();
	
	officeArea_1();
	
	officePct_1();
	
	PredominantType();
	
	  
	}
	public void CondoCount ()  {
	  this.BOPStructure.setCondoCount(this.BOPStructure.getCondoCountTemp_1());

	  
	}
	public void ProcessPremium5 () throws LookupException,NumberFormatException {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al01012026.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium11();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void FungiExcessLimitPremium ()  {
	  
		if(this.BOPStructure.getSeparateAnnualAggregateLimit().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setFungiExcessLimitPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPStructure.getFungiExcessCovRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../LCM")))) * ((MathHelper.getDoubleValue(this.BOPStructure.getFungiLimit()) - MathHelper.getDoubleValue(15000.0)) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPStructure.setFungiExcessLimitPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}