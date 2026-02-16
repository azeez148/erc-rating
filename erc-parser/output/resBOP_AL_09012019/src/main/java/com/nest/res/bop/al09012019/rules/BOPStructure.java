package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPLimitationsOnCoverageForRoofSurfacing;
import com.nest.res.bop.al09012019.domain.BOPEarthquake;
import com.nest.res.bop.al09012019.domain.BOPStructureLiabMedExpensesBldgCoverage;
import com.nest.res.bop.al09012019.domain.BOPClassification;
import com.nest.res.bop.al09012019.domain.BOPWindstormOrHailExclusion;
import com.nest.res.bop.al09012019.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;
import com.nest.res.bop.al09012019.domain.BOPWindstormOrHailLossesRoofACV;
import com.nest.res.bop.al09012019.domain.BOPBusnIncomeAndExtraExpenseCovLOI;
import com.nest.res.bop.al09012019.domain.BOPTenantsLiability;
import com.nest.res.bop.al09012019.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;
import com.nest.res.bop.al09012019.domain.BOPVacancyChanges;
import com.nest.res.bop.al09012019.domain.BOPDebrisRmvlAddlIns;
import com.nest.res.bop.al09012019.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding;
import com.nest.res.bop.al09012019.domain.BOPStructureACVCoverage;
import com.nest.res.bop.al09012019.domain.BOPStructureTenantsFireLiabCoverage;
import com.nest.res.bop.al09012019.domain.BOPLossPayable;
import com.nest.res.bop.al09012019.domain.BOPProtectiveSafeguards;
import com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov;
import com.nest.res.bop.al09012019.domain.BOPALWindHailExclDirectDamage;
import com.nest.res.bop.al09012019.domain.BOPCondoAssociationCov;
import com.nest.res.bop.al09012019.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;
import com.nest.res.bop.al09012019.domain.BOPNamedPerilsBldg;
import com.nest.res.bop.al09012019.domain.BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalProperties;
import com.nest.res.bop.al09012019.domain.BOPFunctlBldgValtn;
import com.nest.res.bop.al09012019.domain.BOPALCondoAddlProvisions;
import com.nest.res.bop.al09012019.domain.BOPStructureBuildingCoverage;
import com.nest.res.bop.al09012019.domain.BOPSprinklerLeakageEQExt;
import com.nest.res.bop.al09012019.domain.BOPEQSubLimit;
import com.nest.res.bop.al09012019.domain.BOPVacancyPermit;
import com.nest.res.bop.al09012019.domain.BOPAutomaticIncreaseCoverageBuilding;

public class BOPStructure  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPVacancyPermit BOPVacancyPermitRule;
	private List<BOPLimitationsOnCoverageForRoofSurfacing> BOPLimitationsOnCoverageForRoofSurfacingList;
	private List<BOPEarthquake> BOPEarthquakeList;
	private List<BOPStructureLiabMedExpensesBldgCoverage> BOPStructureLiabMedExpensesBldgCoverageList;
	private List<BOPClassification> BOPClassificationList;
	private List<BOPWindstormOrHailExclusion> BOPWindstormOrHailExclusionList;
	private List<BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis> BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList;
	private com.nest.res.bop.al09012019.rules.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOIRule;
	private com.nest.res.bop.al09012019.rules.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuildingRule;
	private List<BOPWindstormOrHailLossesRoofACV> BOPWindstormOrHailLossesRoofACVList;
	private com.nest.res.bop.al09012019.rules.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule;
	private com.nest.res.bop.al09012019.rules.BOPClassification BOPClassificationRule;
	private com.nest.res.bop.al09012019.rules.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamageRule;
	private com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCovRule;
	private com.nest.res.bop.al09012019.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule;
	private List<BOPBusnIncomeAndExtraExpenseCovLOI> BOPBusnIncomeAndExtraExpenseCovLOIList;
	private com.nest.res.bop.al09012019.rules.BOPNamedPerilsBldg BOPNamedPerilsBldgRule;
	private List<BOPTenantsLiability> BOPTenantsLiabilityList;
	private List<BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg> BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList;
	private com.nest.res.bop.al09012019.rules.BOPStructureBuildingCoverage BOPStructureBuildingCoverageRule;
	private List<BOPVacancyChanges> BOPVacancyChangesList;
	private List<BOPDebrisRmvlAddlIns> BOPDebrisRmvlAddlInsList;
	private com.nest.res.bop.al09012019.rules.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExtRule;
	private List<BOPOptionalPerPersonMedicalExpensesCoverageBuilding> BOPOptionalPerPersonMedicalExpensesCoverageBuildingList;
	private List<BOPStructureACVCoverage> BOPStructureACVCoverageList;
	private List<BOPStructureTenantsFireLiabCoverage> BOPStructureTenantsFireLiabCoverageList;
	private List<BOPLossPayable> BOPLossPayableList;
	private List<BOPProtectiveSafeguards> BOPProtectiveSafeguardsList;
	private List<BOPOrdinanceOrLawCov> BOPOrdinanceOrLawCovList;
	private List<BOPALWindHailExclDirectDamage> BOPALWindHailExclDirectDamageList;
	private List<BOPCondoAssociationCov> BOPCondoAssociationCovList;
	private List<BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity> BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList;
	private List<BOPNamedPerilsBldg> BOPNamedPerilsBldgList;
	private List<BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalProperties> BOPExclusionOfLossDueToByProductsOfProductionOrProcessingOperationsRentalPropertiesList;
	private List<BOPFunctlBldgValtn> BOPFunctlBldgValtnList;
	private com.nest.res.bop.al09012019.rules.BOPTenantsLiability BOPTenantsLiabilityRule;
	private List<BOPALCondoAddlProvisions> BOPALCondoAddlProvisionsList;
	private com.nest.res.bop.al09012019.rules.BOPStructureACVCoverage BOPStructureACVCoverageRule;
	private List<BOPStructureBuildingCoverage> BOPStructureBuildingCoverageList;
	private com.nest.res.bop.al09012019.rules.BOPEQSubLimit BOPEQSubLimitRule;
	private com.nest.res.bop.al09012019.rules.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule;
	private com.nest.res.bop.al09012019.rules.BOPEarthquake BOPEarthquakeRule;
	private List<BOPSprinklerLeakageEQExt> BOPSprinklerLeakageEQExtList;
	private com.nest.res.bop.al09012019.rules.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverageRule;
	private com.nest.res.bop.al09012019.rules.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlInsRule;
	private com.nest.res.bop.al09012019.domain.BOPStructure BOPStructure;
	private com.nest.res.bop.al09012019.rules.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule;
	private com.nest.res.bop.al09012019.rules.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacingRule;
	private List<BOPEQSubLimit> BOPEQSubLimitList;
	private com.nest.res.bop.al09012019.rules.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverageRule;
	private List<BOPVacancyPermit> BOPVacancyPermitList;
	private List<BOPAutomaticIncreaseCoverageBuilding> BOPAutomaticIncreaseCoverageBuildingList;
	private com.nest.res.bop.al09012019.rules.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACVRule;
	
	
	
	public void TerrorismLiabilityFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabilityFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabilityFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium2_CommonRatingSub1 ()  {
	  
	Area();
	
	restaurantCount_1();
	
	otherCount_1();
	
	apartmentCount_1();
	
	officeCount_1();
	
	officeArea_1();
	
	officePct_1();
	
	PredominantType();
	
	  
	}
	public void otherCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setOtherCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fast Food")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fine Dining")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Casual Dining"))){
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
	public void BusnPrsnlPropLimit ()  {
	  this.BOPStructure.setBusnPrsnlPropLimit(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){
			this.BOPStructure.setBusnPrsnlPropLimit(MathHelper.getIntegerValue(this.BOPStructure.getBusnPrsnlPropLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TotBusnPrsnlPropLimit")))));
		}

	  
	}
	public void ProcessPremium2_CommonRatingSub2 ()  {
	  
	RatingPropertyType();
	
	ClassCode();
	
	RateNumber();
	
	ClassGroup();
	
	  
	}
	public void BldgLimitOfInsuranceRelativityFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getBuildingLimit() != MathHelper.getIntegerValue(0.0) && !this.BOPStructure.getBldgLimitOfInsuranceRelativityGroup().equals(MathHelper.getStringValue("0"))){
			this.BOPStructure.setBldgLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BldgLimitOfInsRelativityFactors",String.valueOf(this.BOPStructure.getBuildingLimit()),String.valueOf(this.BOPStructure.getBldgLimitOfInsuranceRelativityGroup()))))));
		}
		else{
			this.BOPStructure.setBldgLimitOfInsuranceRelativityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void TerrorismBldgRate () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgRate",String.valueOf( "Y"))));

	  
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
	public void buildingRateToUse_1 ()  {
	  
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
			this.BOPStructure.setBuildingRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getBuildingRateRABOP()) + MathHelper.getDoubleValue(this.BOPStructure.getHurricaneLossCostsBuilding()))));
		}
		else{
			this.BOPStructure.setBuildingRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getBuildingRate())));
		}
	  
	}
	public void apartmentCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setApartmentCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fast Food")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fine Dining")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Casual Dining")))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment"))){
			this.BOPStructure.setApartmentCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getApartmentCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}
		}		}

		}
	  
	}
	public void Area ()  {
	  this.BOPStructure.setArea(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
			this.BOPStructure.setArea(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getArea() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))));
		}		}

	  
	}
	public void BuildingRateRABOP () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed"))){
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
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))){
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
	public void terrorismPreProRateFactor_1 ()  {
	  this.BOPStructure.setTerrorismPreProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	BusnPrsnlPropLimit();
	
	CombinedLimit();
	
	  
	}
	public void fungusExcessCovRate_1 ()  {
	  this.BOPStructure.setFungusExcessCovRate_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"../../BOPLimitedFungiBacteriaCov") ){
			this.BOPStructure.setFungusExcessCovRate_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPLimitedFungiBacteriaCovExcessCoverage/Rate"))));
		}

	  
	}
	public void ProcessPremium3_CommonRatingSub1 ()  {
	  
	Area();
	
	restaurantCount_1();
	
	otherCount_1();
	
	apartmentCount_1();
	
	officeCount_1();
	
	officeArea_1();
	
	officePct_1();
	
	PredominantType();
	
	  
	}
	public void CrimeLCM ()  {
	  this.BOPStructure.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../CrimeLCM"))));

	  
	}
	public void TenantsLiabilityApply ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPTenantsLiability").size() > 0.0){
			this.BOPStructure.setTenantsLiabilityApply(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}
		else{
			this.BOPStructure.setTenantsLiabilityApply(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
	  
	}
	public void TotLessorsLiabPremium ()  {
	  this.BOPStructure.setTotLessorsLiabPremium(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureLiabMedExpensesBldgCoverage/Premium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureACVCoverage/Premium")))));

	  
	}
	public void terrorismPreProRateFactor_2 ()  {
	  this.BOPStructure.setTerrorismPreProRateFactor_2((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor"))));

	  
	}
	public void WindstormOrHailExclBldgFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() > 0.0 || this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setWindstormOrHailExclBldgFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBldgFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setWindstormOrHailExclBldgFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void DedFactor ()  {
	  this.BOPStructure.setDedFactor((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../DedFactor"))));

	  
	}
	public void officeCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setOfficeCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fast Food")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fine Dining")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Casual Dining")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment")))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructure.setOfficeCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getOfficeCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}
		}
		}		}

		}
	  
	}
	public void BOPStructureTenantsFireLiabCoverage_Limit ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPTenantsLiability").size() > 0.0){
		for(com.nest.res.bop.al09012019.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage :BOPStructureTenantsFireLiabCoverageList){
		BOPStructureTenantsFireLiabCoverage.setDsLimit(MathHelper.getIntegerValue(0.0));
		}
		}
	  
	}
	public void ProcessPremium3_CommonRatingSub3 ()  {
	  
	BOPStructureTenantsFireLiabCoverage_Limit();
	
	  
	}
	public void ProcessPremium4 ()  {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium10();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void TerrorismBldgNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
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
	public void TerrsmLiabIncrLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))).equals(MathHelper.getStringValue("Not Applicable"))){
			this.BOPStructure.setTerrsmLiabIncrLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TerrorismLiabIncrLimitsFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))))));
		}
		else{
			this.BOPStructure.setTerrsmLiabIncrLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PublicProtectionFactorBldg () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setPublicProtectionFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PublicProtectionClassPPCFactorBldg",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))))));
		}
		else{
			this.BOPStructure.setPublicProtectionFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
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
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium2();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium3();

		}
	}
	ProcessPremium2_CommonRatingSub2();
	
	  
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
		if(this.BOPStructure.getWindstormOrHailExclBldgFactor() == MathHelper.getDoubleValue(0.0) && this.BOPStructure.getWindstormMitigationDiscountApplies().equals(MathHelper.getStringValue("No"))){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
		}
		}
	  
	}
	public void LCM ()  {
	  this.BOPStructure.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../LCM"))));

	  
	}
	public void TerrsmBldgPremium ()  {
	  this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(0.0));

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPreProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPreProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor() * this.BOPStructure.getTerrorismBldgNuclBiolChemRadFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPreProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		}
		}
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgFullRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPostProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgFullRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPostProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor() * this.BOPStructure.getTerrorismBldgNuclBiolChemRadFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getBuildingLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
			this.BOPStructure.setTerrsmBldgPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgFullRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPostProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * MathHelper.getDoubleValue(this.BOPStructure.getTerrsmSubLimit()) / MathHelper.getDoubleValue(100.0)))));
		}
		}
		}
		}
	  
	}
	public void ClassCode ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setClassCode(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode")))));
		}		}

	  
	}
	public void ConstructionTypeFactorBldg () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructure.getConstructionType().equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setConstructionTypeFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ConstructionTypeFactorBldg",String.valueOf(this.BOPStructure.getConstructionType())))));
		}
		else{
			this.BOPStructure.setConstructionTypeFactorBldg(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void terrorismPostProRateFactor_2 ()  {
	  this.BOPStructure.setTerrorismPostProRateFactor_2((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor"))));

	  
	}
	public void LiabMedExpensesTotPremium ()  {
	  
		if(!this.BOPStructure.getPctOwnerOccupied().equals(MathHelper.getStringValue("10% or less"))){
			this.BOPStructure.setLiabMedExpensesTotPremium(MathHelper.getDoubleValue(this.BOPStructure.getTotLessorsLiabPremium()));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification/BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage") ){
			this.BOPStructure.setLiabMedExpensesTotPremium(MathHelper.getDoubleValue(this.BOPStructure.getLiabMedExpensesTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		}
		else{
			this.BOPStructure.setLiabMedExpensesTotPremium(MathHelper.getDoubleValue(this.BOPStructure.getTotLessorsLiabPremium()));
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPStructure.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../CommercialPropertyLCM"))));

	  
	}
	public void AutomaticIncreaseFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > MathHelper.getIntegerValue(0.0) && this.BOPStructure.getAutomaticIncreasePct() != MathHelper.getIntegerValue(8.0) && this.BOPStructure.getAutomaticIncreasePct() <= MathHelper.getIntegerValue(16.0)){
			this.BOPStructure.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf(this.BOPStructure.getAutomaticIncreasePct())))));
		}
		else{
		if(this.BOPStructure.getAutomaticIncreasePct() > MathHelper.getIntegerValue(16.0)){
			this.BOPStructure.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getAutomaticIncreaseFactor16Pct() + (((MathHelper.getDoubleValue(this.BOPStructure.getAutomaticIncreasePct()) - MathHelper.getDoubleValue(16.0)) / MathHelper.getDoubleValue(2.0)) * this.BOPStructure.getAutomaticIncreaseExcessFactor()))));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	public void RatingPropertyType ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setRatingPropertyType(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType")))));
		}		}

	  
	}
	public void terrorismPostProRateFactor_1 ()  {
	  this.BOPStructure.setTerrorismPostProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor"))));

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../EachOccLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../ProdCompldOpsAggregateLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../AggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../EachOccLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../ProdCompldOpsAggregateLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../../AggregateLimit"))))));
		}
		else{
			this.BOPStructure.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void FunctlBldgFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPFunctlBldgValtn").size() > 0.0){
			this.BOPStructure.setFunctlBldgFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBldgFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPStructure.setFunctlBldgFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void restaurantCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setRestaurantCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fast Food")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fine Dining")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Casual Dining"))){
			this.BOPStructure.setRestaurantCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getRestaurantCount_1() + MathHelper.getIntegerValue(1.0))));
		}
		}		}

		}
	  
	}
	public void bldgCreditFactor_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPALWindHailExclDirectDamage").size() > 0.0){
			this.BOPStructure.setBldgCreditFactor_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPALWindHailExclDirectDamage/BldgCreditFactor")))));
		}
		else{
			this.BOPStructure.setBldgCreditFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void FungiExcessLimitPremium ()  {
	  
		if(this.BOPStructure.getSeparateAnnualAggregateLimit().equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setFungiExcessLimitPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPStructure.getFungusExcessCovRate_1() * this.BOPStructure.getLCM()) * ((MathHelper.getDoubleValue(this.BOPStructure.getFungiLimit()) - MathHelper.getDoubleValue(15000.0)) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPStructure.setFungiExcessLimitPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismBldgFullRate () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgFullRate",String.valueOf( "Y"))));

	  
	}
	public void BldgLimitOfInsuranceRelativityGroup () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setBldgLimitOfInsuranceRelativityGroup(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("BldgLimitOfInsRelativityGroup",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setBldgLimitOfInsuranceRelativityGroup(MathHelper.getStringValue(MathHelper.getStringValue("0")));
		}
	  
	}
	public void ClassGroup ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setClassGroup(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassGroup")))));
		}		}

	  
	}
	public void officeArea_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals(MathHelper.getStringValue("Mixed"))){
			this.BOPStructure.setOfficeArea_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fast Food")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Limited Cooking")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Fine Dining")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Restaurant-Casual Dining")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment Condominium Association")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Apartment")))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructure.setOfficeArea_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getOfficeArea_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))))));
		}
		}
		}
		}		}

		}
	  
	}
	public void RateNumber ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setRateNumber(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RateNumber")))));
		}		}

	  
	}
	public void TerrorismLiabNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void HurricaneLossCostsBuilding () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && (this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed")) || this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed"))) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setHurricaneLossCostsBuilding(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HurricaneLossCostsBuilding",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setHurricaneLossCostsBuilding(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CombinedLimit ()  {
	  this.BOPStructure.setCombinedLimit(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){
			this.BOPStructure.setCombinedLimit(MathHelper.getIntegerValue(this.BOPStructure.getCombinedLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TotBusnPrsnlPropLimit")))));
		}
this.BOPStructure.setCombinedLimit(MathHelper.getIntegerValue(this.BOPStructure.getCombinedLimit() + this.BOPStructure.getBuildingLimit()));

	  
	}
	public  BOPStructure (com.nest.res.bop.al09012019.domain.BOPStructure BOPStructure)  {
	  this.BOPStructure = BOPStructure;
this.BOPLimitationsOnCoverageForRoofSurfacingList = BOPStructure.getBOPLimitationsOnCoverageForRoofSurfacing();
this.BOPEarthquakeList = BOPStructure.getBOPEarthquake();
this.BOPStructureLiabMedExpensesBldgCoverageList = BOPStructure.getBOPStructureLiabMedExpensesBldgCoverage();
this.BOPClassificationList = BOPStructure.getBOPClassification();
this.BOPWindstormOrHailExclusionList = BOPStructure.getBOPWindstormOrHailExclusion();
this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList = BOPStructure.getBOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis();
this.BOPWindstormOrHailLossesRoofACVList = BOPStructure.getBOPWindstormOrHailLossesRoofACV();
this.BOPBusnIncomeAndExtraExpenseCovLOIList = BOPStructure.getBOPBusnIncomeAndExtraExpenseCovLOI();
this.BOPTenantsLiabilityList = BOPStructure.getBOPTenantsLiability();
this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList = BOPStructure.getBOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg();
this.BOPVacancyChangesList = BOPStructure.getBOPVacancyChanges();
this.BOPDebrisRmvlAddlInsList = BOPStructure.getBOPDebrisRmvlAddlIns();
this.BOPOptionalPerPersonMedicalExpensesCoverageBuildingList = BOPStructure.getBOPOptionalPerPersonMedicalExpensesCoverageBuilding();
this.BOPStructureACVCoverageList = BOPStructure.getBOPStructureACVCoverage();
this.BOPStructureTenantsFireLiabCoverageList = BOPStructure.getBOPStructureTenantsFireLiabCoverage();
this.BOPLossPayableList = BOPStructure.getBOPLossPayable();
this.BOPProtectiveSafeguardsList = BOPStructure.getBOPProtectiveSafeguards();
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
this.BOPEQSubLimitList = BOPStructure.getBOPEQSubLimit();
this.BOPVacancyPermitList = BOPStructure.getBOPVacancyPermit();
this.BOPAutomaticIncreaseCoverageBuildingList = BOPStructure.getBOPAutomaticIncreaseCoverageBuilding();

	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPStructure.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../GeneralLiabilityLCM"))));

	  
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
	public void BldgCodeEffectivenessGradeFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructure.getBldgCodeEffectivenessGrade().equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setBldgCodeEffectivenessGradeFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BldgCodeEffectivenessGradeFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory")),String.valueOf(this.BOPStructure.getBldgCodeEffectivenessGrade())))));
		}
		else{
			this.BOPStructure.setBldgCodeEffectivenessGradeFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void TerrorismLiabilityFullFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabilityFullFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabilityFullFactor",String.valueOf( "Y"))));

	  
	}
	public void TerrsmLiabilityPremium ()  {
	  this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(0.0));

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFactor() * this.BOPStructure.getTerrorismPreProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFactor() * this.BOPStructure.getTerrorismPreProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * this.BOPStructure.getTerrorismLiabNuclBiolChemRadFactor()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
		if(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() > MathHelper.getDoubleValue(0.0) && this.BOPStructure.getIncrLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFactor() * this.BOPStructure.getTerrorismPreProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * MathHelper.roundToThousand(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() / this.BOPStructure.getIncrLimitFactor())))));
		}
		}
		}
		}
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIPTerminatesBeforeExpirationDate"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIAExtended"))).equals(MathHelper.getStringValue("No")) && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002")) == null && (XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002")) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFullFactor() * this.BOPStructure.getTerrorismPostProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses"))){
			this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFullFactor() * this.BOPStructure.getTerrorismPostProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * this.BOPStructure.getTerrorismLiabNuclBiolChemRadFactor()))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals(MathHelper.getStringValue("No")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals(MathHelper.getStringValue("Limitations Of Coverage For Certified Acts Of Terrorism"))){
		if(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() > MathHelper.getDoubleValue(0.0) && this.BOPStructure.getIncrLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPStructure.setTerrsmLiabilityPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFullFactor() * this.BOPStructure.getTerrorismPostProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * MathHelper.roundToThousand(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() / this.BOPStructure.getIncrLimitFactor())))));
		}
		}
		}
		}
		}
	  
	}
	public void CondoCount ()  {
	  this.BOPStructure.setCondoCount(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Residential Condominium (Association risk only)")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Condominiums - Office Condominium (Association risk only)"))){
			this.BOPStructure.setCondoCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getCondoCount() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void BuildingRate () throws LookupException,NumberFormatException {
	  
		if(!(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Smoothed")))){
		if(!(this.BOPStructure.getRABOPWanted().equals(MathHelper.getStringValue("Yes")) && this.BOPStructure.getRABOPType().equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructure.setBuildingRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRate",String.valueOf(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))))));
		}
		else{
			this.BOPStructure.setBuildingRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void ProcessPremium3_CommonRatingSub4 ()  {
	  
	TotLessorsLiabPremium();
	
	LiabMedExpensesTotPremium();
	
	terrorismPreProRateFactor_1();
	
	terrorismPostProRateFactor_1();
	
	TerrsmBldgPremium();
	
	terrorismPreProRateFactor_2();
	
	terrorismPostProRateFactor_2();
	
	TerrsmLiabilityPremium();
	
	  
	}
	public void FinalBuildingRate ()  {
	  this.BOPStructure.setFinalBuildingRate(MathHelper.roundToThousand(this.BOPStructure.getRateNumberFactorBldg() * this.BOPStructure.getConstructionTypeFactorBldg() * this.BOPStructure.getBldgLimitOfInsuranceRelativityFactor() * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getBldgCodeEffectivenessGradeFactor() * this.BOPStructure.getSprinkleredFactorBldg() * this.BOPStructure.getDedFactor() * ((MathHelper.roundToThousand(this.BOPStructure.getBuildingRateToUse_1() * this.BOPStructure.getLCM()) - MathHelper.roundToThousand(this.BOPStructure.getBldgCreditFactor_1() * this.BOPStructure.getLCM())) - MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPStructure.getWindstormOrHailExclBldgFactor() * this.BOPStructure.getLCM()) - MathHelper.roundToThousand(this.BOPStructure.getBldgCreditFactor_1() * this.BOPStructure.getLCM())) * this.BOPStructure.getWindMitigationDiscount()))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void AutomaticIncreaseFactor16Pct () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > MathHelper.getIntegerValue(16.0)){
			this.BOPStructure.setAutomaticIncreaseFactor16Pct(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf( 16)))));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseFactor16Pct(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void contractorCount_1 ()  {
	  this.BOPStructure.setContractorCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals(MathHelper.getStringValue("Contractor"))){
			this.BOPStructure.setContractorCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPStructure.getContractorCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void AutomaticIncreaseExcessFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > MathHelper.getIntegerValue(16.0)){
			this.BOPStructure.setAutomaticIncreaseExcessFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseExcessFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseExcessFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium3 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium3_CommonRatingSub1();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium4();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium5();

		}
	}
	if(null != BOPALWindHailExclDirectDamageList){
		for(BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage:BOPALWindHailExclDirectDamageList){
			BOPALWindHailExclDirectDamageRule = new com.nest.res.bop.al09012019.rules.BOPALWindHailExclDirectDamage(BOPALWindHailExclDirectDamage);
			BOPALWindHailExclDirectDamageRule.CommonRating1();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium6();

		}
	}
	ProcessPremium3_CommonRatingSub2();
	
	ProcessPremium3_CommonRatingSub3();
	
	if(null != BOPStructureLiabMedExpensesBldgCoverageList){
		for(BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage:BOPStructureLiabMedExpensesBldgCoverageList){
			BOPStructureLiabMedExpensesBldgCoverageRule = new com.nest.res.bop.al09012019.rules.BOPStructureLiabMedExpensesBldgCoverage(BOPStructureLiabMedExpensesBldgCoverage);
			BOPStructureLiabMedExpensesBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureBuildingCoverageList){
		for(BOPStructureBuildingCoverage BOPStructureBuildingCoverage:BOPStructureBuildingCoverageList){
			BOPStructureBuildingCoverageRule = new com.nest.res.bop.al09012019.rules.BOPStructureBuildingCoverage(BOPStructureBuildingCoverage);
			BOPStructureBuildingCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium7();

		}
	}
	if(null != BOPDebrisRmvlAddlInsList){
		for(BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns:BOPDebrisRmvlAddlInsList){
			BOPDebrisRmvlAddlInsRule = new com.nest.res.bop.al09012019.rules.BOPDebrisRmvlAddlIns(BOPDebrisRmvlAddlIns);
			BOPDebrisRmvlAddlInsRule.ProcessPremium1();

		}
	}
	if(null != BOPEarthquakeList){
		for(BOPEarthquake BOPEarthquake:BOPEarthquakeList){
			BOPEarthquakeRule = new com.nest.res.bop.al09012019.rules.BOPEarthquake(BOPEarthquake);
			BOPEarthquakeRule.ProcessPremium1();

		}
	}
	if(null != BOPEQSubLimitList){
		for(BOPEQSubLimit BOPEQSubLimit:BOPEQSubLimitList){
			BOPEQSubLimitRule = new com.nest.res.bop.al09012019.rules.BOPEQSubLimit(BOPEQSubLimit);
			BOPEQSubLimitRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList){
		for(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg:BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList){
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule = new com.nest.res.bop.al09012019.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg);
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList){
		for(BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis:BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList){
			BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule = new com.nest.res.bop.al09012019.rules.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis(BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis);
			BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitationsOnCoverageForRoofSurfacingList){
		for(BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing:BOPLimitationsOnCoverageForRoofSurfacingList){
			BOPLimitationsOnCoverageForRoofSurfacingRule = new com.nest.res.bop.al09012019.rules.BOPLimitationsOnCoverageForRoofSurfacing(BOPLimitationsOnCoverageForRoofSurfacing);
			BOPLimitationsOnCoverageForRoofSurfacingRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsBldgList){
		for(BOPNamedPerilsBldg BOPNamedPerilsBldg:BOPNamedPerilsBldgList){
			BOPNamedPerilsBldgRule = new com.nest.res.bop.al09012019.rules.BOPNamedPerilsBldg(BOPNamedPerilsBldg);
			BOPNamedPerilsBldgRule.ProcessPremium1();

		}
	}
	if(null != BOPOptionalPerPersonMedicalExpensesCoverageBuildingList){
		for(BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding:BOPOptionalPerPersonMedicalExpensesCoverageBuildingList){
			BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule = new com.nest.res.bop.al09012019.rules.BOPOptionalPerPersonMedicalExpensesCoverageBuilding(BOPOptionalPerPersonMedicalExpensesCoverageBuilding);
			BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCovList){
		for(BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov:BOPOrdinanceOrLawCovList){
			BOPOrdinanceOrLawCovRule = new com.nest.res.bop.al09012019.rules.BOPOrdinanceOrLawCov(BOPOrdinanceOrLawCov);
			BOPOrdinanceOrLawCovRule.ProcessPremium1();

		}
	}
	if(null != BOPSprinklerLeakageEQExtList){
		for(BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt:BOPSprinklerLeakageEQExtList){
			BOPSprinklerLeakageEQExtRule = new com.nest.res.bop.al09012019.rules.BOPSprinklerLeakageEQExt(BOPSprinklerLeakageEQExt);
			BOPSprinklerLeakageEQExtRule.ProcessPremium1();

		}
	}
	if(null != BOPAutomaticIncreaseCoverageBuildingList){
		for(BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding:BOPAutomaticIncreaseCoverageBuildingList){
			BOPAutomaticIncreaseCoverageBuildingRule = new com.nest.res.bop.al09012019.rules.BOPAutomaticIncreaseCoverageBuilding(BOPAutomaticIncreaseCoverageBuilding);
			BOPAutomaticIncreaseCoverageBuildingRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureACVCoverageList){
		for(BOPStructureACVCoverage BOPStructureACVCoverage:BOPStructureACVCoverageList){
			BOPStructureACVCoverageRule = new com.nest.res.bop.al09012019.rules.BOPStructureACVCoverage(BOPStructureACVCoverage);
			BOPStructureACVCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureTenantsFireLiabCoverageList){
		for(BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage:BOPStructureTenantsFireLiabCoverageList){
			BOPStructureTenantsFireLiabCoverageRule = new com.nest.res.bop.al09012019.rules.BOPStructureTenantsFireLiabCoverage(BOPStructureTenantsFireLiabCoverage);
			BOPStructureTenantsFireLiabCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPTenantsLiabilityList){
		for(BOPTenantsLiability BOPTenantsLiability:BOPTenantsLiabilityList){
			BOPTenantsLiabilityRule = new com.nest.res.bop.al09012019.rules.BOPTenantsLiability(BOPTenantsLiability);
			BOPTenantsLiabilityRule.ProcessPremium1();

		}
	}
	if(null != BOPVacancyPermitList){
		for(BOPVacancyPermit BOPVacancyPermit:BOPVacancyPermitList){
			BOPVacancyPermitRule = new com.nest.res.bop.al09012019.rules.BOPVacancyPermit(BOPVacancyPermit);
			BOPVacancyPermitRule.ProcessPremium1();

		}
	}
	if(null != BOPWindstormOrHailLossesRoofACVList){
		for(BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV:BOPWindstormOrHailLossesRoofACVList){
			BOPWindstormOrHailLossesRoofACVRule = new com.nest.res.bop.al09012019.rules.BOPWindstormOrHailLossesRoofACV(BOPWindstormOrHailLossesRoofACV);
			BOPWindstormOrHailLossesRoofACVRule.ProcessPremium1();

		}
	}
	ProcessPremium3_CommonRatingSub4();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium8();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.al09012019.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium9();

		}
	}
	if(null != BOPBusnIncomeAndExtraExpenseCovLOIList){
		for(BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI:BOPBusnIncomeAndExtraExpenseCovLOIList){
			BOPBusnIncomeAndExtraExpenseCovLOIRule = new com.nest.res.bop.al09012019.rules.BOPBusnIncomeAndExtraExpenseCovLOI(BOPBusnIncomeAndExtraExpenseCovLOI);
			BOPBusnIncomeAndExtraExpenseCovLOIRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList){
		for(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity:BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList){
			BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule = new com.nest.res.bop.al09012019.rules.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity);
			BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule.ProcessPremium1();

		}
	}
	  
	}
	public void ContractorCount ()  {
	  this.BOPStructure.setContractorCount(this.BOPStructure.getContractorCount_1());

	  
	}
	public void ProcessPremium3_CommonRatingSub2 () throws LookupException,NumberFormatException {
	  
	RatingPropertyType();
	
	ClassCode();
	
	RateNumber();
	
	ClassGroup();
	
	HurricaneLossCostsBuilding();
	
	GeneralLiabilityLCM();
	
	CommercialPropertyLCM();
	
	CrimeLCM();
	
	LCM();
	
	contractorCount_1();
	
	ContractorCount();
	
	CondoCount();
	
	TenantsLiabilityApply();
	
	AutomaticIncreaseExcessFactor();
	
	AutomaticIncreaseFactor16Pct();
	
	AutomaticIncreaseFactor();
	
	DedFactor();
	
	ConstructionTypeFactorBldg();
	
	PublicProtectionFactorBldg();
	
	BuildingRateRABOP();
	
	BuildingRate();
	
	BldgCodeEffectivenessGradeFactor();
	
	FunctlBldgFactor();
	
	SprinkleredFactorBldg();
	
	TerrorismSprinkleredFactor();
	
	RateNumberFactorBldg();
	
	WindstormOrHailExclBldgFactor();
	
	BldgLimitOfInsuranceRelativityGroup();
	
	BldgLimitOfInsuranceRelativityFactor();
	
	buildingRateToUse_1();
	
	bldgCreditFactor_1();
	
	WindMitigationDiscount();
	
	FinalBuildingRate();
	
	fungusExcessCovRate_1();
	
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
	
	
	
	
	


	
}