package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;
import com.nest.res.bop.domain.BOPLimitationsOnCoverageForRoofSurfacing;
import com.nest.res.bop.domain.BOPDebrisRmvlAddlIns;
import com.nest.res.bop.domain.BOPEarthquake;
import com.nest.res.bop.domain.BOPStructureLiabMedExpensesBldgCoverage;
import com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding;
import com.nest.res.bop.domain.BOPStructureACVCoverage;
import com.nest.res.bop.domain.BOPClassification;
import com.nest.res.bop.domain.BOPStructureTenantsFireLiabCoverage;
import com.nest.res.bop.domain.BOPOrdinanceOrLawCov;
import com.nest.res.bop.domain.BOPALWindHailExclDirectDamage;
import com.nest.res.bop.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis;
import com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;
import com.nest.res.bop.domain.BOPNamedPerilsBldg;
import com.nest.res.bop.domain.BOPWindstormOrHailLossesRoofACV;
import com.nest.res.bop.domain.BOPStructureBuildingCoverage;
import com.nest.res.bop.domain.BOPSprinklerLeakageEQExt;
import com.nest.res.bop.domain.BOPEQSubLimit;
import com.nest.res.bop.domain.BOPVacancyPermit;
import com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovLOI;
import com.nest.res.bop.domain.BOPAutomaticIncreaseCoverageBuilding;
import com.nest.res.bop.domain.BOPTenantsLiability;

public class BOPStructure  {

	
	
	
	private List<BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg> BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList;
	private com.nest.res.bop.rules.BOPVacancyPermit BOPVacancyPermitRule;
	private com.nest.res.bop.rules.BOPStructureBuildingCoverage BOPStructureBuildingCoverageRule;
	private List<BOPLimitationsOnCoverageForRoofSurfacing> BOPLimitationsOnCoverageForRoofSurfacingList;
	private List<BOPDebrisRmvlAddlIns> BOPDebrisRmvlAddlInsList;
	private com.nest.res.bop.rules.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExtRule;
	private List<BOPEarthquake> BOPEarthquakeList;
	private List<BOPStructureLiabMedExpensesBldgCoverage> BOPStructureLiabMedExpensesBldgCoverageList;
	private List<BOPOptionalPerPersonMedicalExpensesCoverageBuilding> BOPOptionalPerPersonMedicalExpensesCoverageBuildingList;
	private List<BOPStructureACVCoverage> BOPStructureACVCoverageList;
	private List<BOPClassification> BOPClassificationList;
	private List<BOPStructureTenantsFireLiabCoverage> BOPStructureTenantsFireLiabCoverageList;
	private List<BOPOrdinanceOrLawCov> BOPOrdinanceOrLawCovList;
	private List<BOPALWindHailExclDirectDamage> BOPALWindHailExclDirectDamageList;
	private List<BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis> BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList;
	private com.nest.res.bop.rules.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOIRule;
	private List<BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity> BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList;
	private List<BOPNamedPerilsBldg> BOPNamedPerilsBldgList;
	private com.nest.res.bop.rules.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuildingRule;
	private com.nest.res.bop.rules.BOPTenantsLiability BOPTenantsLiabilityRule;
	private List<BOPWindstormOrHailLossesRoofACV> BOPWindstormOrHailLossesRoofACVList;
	private com.nest.res.bop.rules.BOPStructureACVCoverage BOPStructureACVCoverageRule;
	private List<BOPStructureBuildingCoverage> BOPStructureBuildingCoverageList;
	private com.nest.res.bop.rules.BOPEQSubLimit BOPEQSubLimitRule;
	private com.nest.res.bop.rules.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule;
	private com.nest.res.bop.rules.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule;
	private com.nest.res.bop.rules.BOPEarthquake BOPEarthquakeRule;
	private List<BOPSprinklerLeakageEQExt> BOPSprinklerLeakageEQExtList;
	private com.nest.res.bop.rules.BOPClassification BOPClassificationRule;
	private com.nest.res.bop.rules.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverageRule;
	private com.nest.res.bop.rules.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlInsRule;
	private com.nest.res.bop.rules.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamageRule;
	private com.nest.res.bop.domain.BOPStructure BOPStructure;
	private com.nest.res.bop.rules.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule;
	private com.nest.res.bop.rules.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCovRule;
	private com.nest.res.bop.rules.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacingRule;
	private List<BOPEQSubLimit> BOPEQSubLimitList;
	private com.nest.res.bop.rules.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverageRule;
	private List<BOPVacancyPermit> BOPVacancyPermitList;
	private com.nest.res.bop.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule;
	private List<BOPBusnIncomeAndExtraExpenseCovLOI> BOPBusnIncomeAndExtraExpenseCovLOIList;
	private List<BOPAutomaticIncreaseCoverageBuilding> BOPAutomaticIncreaseCoverageBuildingList;
	private com.nest.res.bop.rules.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACVRule;
	private com.nest.res.bop.rules.BOPNamedPerilsBldg BOPNamedPerilsBldgRule;
	private List<BOPTenantsLiability> BOPTenantsLiabilityList;
	
	
	
	public void TotLessorsLiabPremium ()  {
	  this.BOPStructure.setTotLessorsLiabPremium((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureLiabMedExpensesBldgCoverage/Premium"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPStructureACVCoverage/Premium"))));

	  
	}
	public void buildingRateToUse_1 ()  {
	  
		if(this.BOPStructure.getRABOPWanted().equals((String)"Yes") && (this.BOPStructure.getRABOPType().equals((String)"Smoothed") || this.BOPStructure.getRABOPType().equals((String)"Unsmoothed"))){
			this.BOPStructure.setBuildingRateToUse_1(Double.valueOf(this.BOPStructure.getBuildingRateRABOP()) + Double.valueOf(this.BOPStructure.getHurricaneLossCostsBuilding()));
		}
		else{
			this.BOPStructure.setBuildingRateToUse_1(Double.valueOf(this.BOPStructure.getBuildingRate()));
		}
	  
	}
	public void TerrorismBldgNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void TerrsmBldgPremium ()  {
	  this.BOPStructure.setTerrsmBldgPremium((double)0.0);

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"Yes")){
			this.BOPStructure.setTerrsmBldgPremium(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPreProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * (double)this.BOPStructure.getBuildingLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses")){
			this.BOPStructure.setTerrsmBldgPremium(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPreProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor() * this.BOPStructure.getTerrorismBldgNuclBiolChemRadFactor()) * (double)this.BOPStructure.getBuildingLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Limitations Of Coverage For Certified Acts Of Terrorism")){
			this.BOPStructure.setTerrsmBldgPremium(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPreProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * (double)this.BOPStructure.getTerrsmSubLimit() / (double)100.0));
		}
		}
		}
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIPTerminatesBeforeExpirationDate"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIAExtended"))).equals((String)"No") && ((XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002"))) == null && ((XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002"))) == null && ((XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002"))) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"Yes")){
			this.BOPStructure.setTerrsmBldgPremium(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgFullRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPostProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * (double)this.BOPStructure.getBuildingLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses")){
			this.BOPStructure.setTerrsmBldgPremium(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgFullRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPostProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor() * this.BOPStructure.getTerrorismBldgNuclBiolChemRadFactor()) * (double)this.BOPStructure.getBuildingLimit() / (double)100.0));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Limitations Of Coverage For Certified Acts Of Terrorism")){
			this.BOPStructure.setTerrsmBldgPremium(this.BOPStructure.getTerrsmBldgPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismBldgFullRate() * this.BOPStructure.getLCM() * this.BOPStructure.getTerrorismPostProRateFactor_1()) * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getDedFactor() * this.BOPStructure.getTerrorismSprinkleredFactor()) * (double)this.BOPStructure.getTerrsmSubLimit() / (double)100.0));
		}
		}
		}
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
	public void ProcessPremium3_CommonRatingSub3 ()  {
	  
	BOPStructureTenantsFireLiabCoverage_Limit();
	
	  
	}
	public void officePct_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
		if(this.BOPStructure.getOfficeArea_1() > (int)0.0 && this.BOPStructure.getArea() != (int)0.0){
			this.BOPStructure.setOfficePct_1((Double.valueOf(this.BOPStructure.getOfficeArea_1()) / Double.valueOf(this.BOPStructure.getArea())) * (double)100.0);
		}
		else{
			this.BOPStructure.setOfficePct_1((double)0.0);
		}
		}
	  
	}
	public void TerrorismLiabilityFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabilityFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabilityFactor",String.valueOf( "Y"))));

	  
	}
	public void ConstructionTypeFactorBldg () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructure.getConstructionType().equals((String)"")){
			this.BOPStructure.setConstructionTypeFactorBldg(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ConstructionTypeFactorBldg",String.valueOf(BOPStructure.getConstructionType()))));
		}
		else{
			this.BOPStructure.setConstructionTypeFactorBldg((double)0.0);
		}
	  
	}
	public void terrorismPreProRateFactor_2 ()  {
	  this.BOPStructure.setTerrorismPreProRateFactor_2((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor"))));

	  
	}
	public void bldgCreditFactor_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPALWindHailExclDirectDamage").size() > 0.0){
			this.BOPStructure.setBldgCreditFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"BOPALWindHailExclDirectDamage/BldgCreditFactor"))));
		}
		else{
			this.BOPStructure.setBldgCreditFactor_1((double)0.0);
		}
	  
	}
	public void TenantsLiabilityApply ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPTenantsLiability").size() > 0.0){
			this.BOPStructure.setTenantsLiabilityApply((String)"Yes");
		}
		else{
			this.BOPStructure.setTenantsLiabilityApply((String)"No");
		}
	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium2();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium3();

		}
	}
	ProcessPremium2_CommonRatingSub2();
	
	  
	}
	public void FunctlBldgFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPFunctlBldgValtn").size() > 0.0){
			this.BOPStructure.setFunctlBldgFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBldgFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPStructure.setFunctlBldgFactor((double)1.0);
		}
	  
	}
	public void terrorismPreProRateFactor_1 ()  {
	  this.BOPStructure.setTerrorismPreProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPreProRateFactor"))));

	  
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
	public void GeneralLiabilityLCM ()  {
	  this.BOPStructure.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../GeneralLiabilityLCM"))));

	  
	}
	public void apartmentCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
			this.BOPStructure.setApartmentCount_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fast Food") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Limited Cooking") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fine Dining") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Casual Dining"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment Condominium Association") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment")){
			this.BOPStructure.setApartmentCount_1(Integer.valueOf(this.BOPStructure.getApartmentCount_1()) + (int)1.0);
		}
		}
		}		}

		}
	  
	}
	public void AutomaticIncreaseExcessFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > (int)16.0){
			this.BOPStructure.setAutomaticIncreaseExcessFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseExcessFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseExcessFactor((double)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void TerrorismLiabNuclBiolChemRadFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabNuclBiolChemRadFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabNuclBiolChemRadFactor",String.valueOf( "Y"))));

	  
	}
	public void WindstormOrHailExclBldgFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPWindstormOrHailExclusion").size() > 0.0 || this.BOPStructure.getWindstormMitigationDiscountApplies().equals((String)"Yes")){
			this.BOPStructure.setWindstormOrHailExclBldgFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindstormOrHailExclBldgFactor",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory")))));
		}
		else{
			this.BOPStructure.setWindstormOrHailExclBldgFactor((double)0.0);
		}
	  
	}
	public void CrimeLCM ()  {
	  this.BOPStructure.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../CrimeLCM"))));

	  
	}
	public void LiabMedExpensesTotPremium ()  {
	  
		if(!this.BOPStructure.getPctOwnerOccupied().equals((String)"10% or less")){
			this.BOPStructure.setLiabMedExpensesTotPremium(this.BOPStructure.getTotLessorsLiabPremium());
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification/BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage") ){
			this.BOPStructure.setLiabMedExpensesTotPremium(this.BOPStructure.getLiabMedExpensesTotPremium()+this.BOPStructure.getLiabMedExpensesTotPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

		}
		else{
			this.BOPStructure.setLiabMedExpensesTotPremium(this.BOPStructure.getTotLessorsLiabPremium());
		}
	  
	}
	public void PredominantType ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
		if(this.BOPStructure.getApartmentCount_1() > (int)0.0){
		if(this.BOPStructure.getOfficePct_1() > (double)15.0){
		if(this.BOPStructure.getOtherCount_1() > (int)0.0){
		if(this.BOPStructure.getRestaurantCount_1() > (int)0.0){
			this.BOPStructure.setPredominantType((String)"Restaurant");
		}
		else{
			this.BOPStructure.setPredominantType((String)"OfficeApartmentOther");
		}
		}
		else{
			this.BOPStructure.setPredominantType((String)"Office");
		}
		}
		else{
		if(this.BOPStructure.getOtherCount_1() > (int)0.0){
		if(this.BOPStructure.getRestaurantCount_1() > (int)0.0){
			this.BOPStructure.setPredominantType((String)"Restaurant");
		}
		else{
			this.BOPStructure.setPredominantType((String)"OfficeApartmentOther");
		}
		}
		else{
			this.BOPStructure.setPredominantType((String)"Apartment");
		}
		}
		}
		else{
		if(this.BOPStructure.getOfficeCount_1() > (int)0.0){
		if(this.BOPStructure.getOtherCount_1() > (int)0.0){
		if(this.BOPStructure.getRestaurantCount_1() > (int)0.0){
			this.BOPStructure.setPredominantType((String)"Restaurant");
		}
		else{
			this.BOPStructure.setPredominantType((String)"OfficeApartmentOther");
		}
		}
		else{
			this.BOPStructure.setPredominantType((String)"Office");
		}
		}
		else{
		if(this.BOPStructure.getOtherCount_1() > (int)0.0){
			this.BOPStructure.setPredominantType((String)"Other");
		}
		else{
			this.BOPStructure.setPredominantType((String)"Other");
		}
		}
		}
		}
		else{
			this.BOPStructure.setPredominantType((String)"");
		}
	  
	}
	public void AutomaticIncreaseFactor16Pct () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > (int)16.0){
			this.BOPStructure.setAutomaticIncreaseFactor16Pct(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf( 16))));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseFactor16Pct((double)0.0);
		}
	  
	}
	public void BldgLimitOfInsuranceRelativityFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getBuildingLimit() != (int)0.0 && !this.BOPStructure.getBldgLimitOfInsuranceRelativityGroup().equals((String)"0")){
			this.BOPStructure.setBldgLimitOfInsuranceRelativityFactor(MathHelper.roundToThousand(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BldgLimitOfInsRelativityFactors",String.valueOf(BOPStructure.getBuildingLimit()),String.valueOf(BOPStructure.getBldgLimitOfInsuranceRelativityGroup())))));
		}
		else{
			this.BOPStructure.setBldgLimitOfInsuranceRelativityFactor((double)1.0);
		}
	  
	}
	public void officeCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
			this.BOPStructure.setOfficeCount_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fast Food") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Limited Cooking") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fine Dining") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Casual Dining"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment Condominium Association") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Office") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Office Condominium")){
			this.BOPStructure.setOfficeCount_1(Integer.valueOf(this.BOPStructure.getOfficeCount_1()) + (int)1.0);
		}
		}
		}
		}		}

		}
	  
	}
	public void CondoCount ()  {
	  this.BOPStructure.setCondoCount((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Condominiums - Residential Condominium (Association risk only)") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Condominiums - Office Condominium (Association risk only)")){
			this.BOPStructure.setCondoCount(this.BOPStructure.getCondoCount() + (int)1.0);
		}		}

	  
	}
	public void ClassGroup ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals((String)"Yes")){
			this.BOPStructure.setClassGroup((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassGroup"))));
		}		}

	  
	}
	public void TerrorismBldgRate () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgRate",String.valueOf( "Y"))));

	  
	}
	public void RatingPropertyType ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals((String)"Yes")){
			this.BOPStructure.setRatingPropertyType((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))));
		}		}

	  
	}
	public  BOPStructure (com.nest.res.bop.domain.BOPStructure BOPStructure)  {
	  this.BOPStructure = BOPStructure;
this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList = BOPStructure.getBOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg();
this.BOPLimitationsOnCoverageForRoofSurfacingList = BOPStructure.getBOPLimitationsOnCoverageForRoofSurfacing();
this.BOPDebrisRmvlAddlInsList = BOPStructure.getBOPDebrisRmvlAddlIns();
this.BOPEarthquakeList = BOPStructure.getBOPEarthquake();
this.BOPStructureLiabMedExpensesBldgCoverageList = BOPStructure.getBOPStructureLiabMedExpensesBldgCoverage();
this.BOPOptionalPerPersonMedicalExpensesCoverageBuildingList = BOPStructure.getBOPOptionalPerPersonMedicalExpensesCoverageBuilding();
this.BOPStructureACVCoverageList = BOPStructure.getBOPStructureACVCoverage();
this.BOPClassificationList = BOPStructure.getBOPClassification();
this.BOPStructureTenantsFireLiabCoverageList = BOPStructure.getBOPStructureTenantsFireLiabCoverage();
this.BOPOrdinanceOrLawCovList = BOPStructure.getBOPOrdinanceOrLawCov();
this.BOPALWindHailExclDirectDamageList = BOPStructure.getBOPALWindHailExclDirectDamage();
this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList = BOPStructure.getBOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis();
this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList = BOPStructure.getBOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity();
this.BOPNamedPerilsBldgList = BOPStructure.getBOPNamedPerilsBldg();
this.BOPWindstormOrHailLossesRoofACVList = BOPStructure.getBOPWindstormOrHailLossesRoofACV();
this.BOPStructureBuildingCoverageList = BOPStructure.getBOPStructureBuildingCoverage();
this.BOPSprinklerLeakageEQExtList = BOPStructure.getBOPSprinklerLeakageEQExt();
this.BOPEQSubLimitList = BOPStructure.getBOPEQSubLimit();
this.BOPVacancyPermitList = BOPStructure.getBOPVacancyPermit();
this.BOPBusnIncomeAndExtraExpenseCovLOIList = BOPStructure.getBOPBusnIncomeAndExtraExpenseCovLOI();
this.BOPAutomaticIncreaseCoverageBuildingList = BOPStructure.getBOPAutomaticIncreaseCoverageBuilding();
this.BOPTenantsLiabilityList = BOPStructure.getBOPTenantsLiability();

	  
	}
	public void terrorismPostProRateFactor_2 ()  {
	  this.BOPStructure.setTerrorismPostProRateFactor_2((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	BusnPrsnlPropLimit();
	
	CombinedLimit();
	
	  
	}
	public void RateNumberFactorBldg () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPClassification").size() > 0.0){
		if(!this.BOPStructure.getRateNumber().equals((String)"")){
			this.BOPStructure.setRateNumberFactorBldg(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateNumberFactorBldg",String.valueOf(BOPStructure.getRateNumber()))));
		}
		else{
			this.BOPStructure.setRateNumberFactorBldg((double)0.0);
		}
		}
		else{
			this.BOPStructure.setRateNumberFactorBldg((double)0.0);
		}
	  
	}
	public void ContractorCount ()  {
	  this.BOPStructure.setContractorCount(this.BOPStructure.getContractorCount_1());

	  
	}
	public void Area ()  {
	  this.BOPStructure.setArea((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
			this.BOPStructure.setArea(this.BOPStructure.getArea() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))));
		}		}

	  
	}
	public void FungiExcessLimitPremium ()  {
	  
		if(this.BOPStructure.getSeparateAnnualAggregateLimit().equals((String)"Yes")){
			this.BOPStructure.setFungiExcessLimitPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPStructure.getFungusExcessCovRate_1() * this.BOPStructure.getLCM()) * (((double)this.BOPStructure.getFungiLimit() - (double)15000.0) / (double)100.0)));
		}
		else{
			this.BOPStructure.setFungiExcessLimitPremium((double)0.0);
		}
	  
	}
	public void SprinkleredFactorBldg () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getSprinklered().equals((String)"Yes")){
		if(!this.BOPStructure.getRateNumber().equals((String)"")){
			this.BOPStructure.setSprinkleredFactorBldg(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("SprinkleredFactorBldg",String.valueOf(BOPStructure.getRateNumber()))));
		}
		else{
			this.BOPStructure.setSprinkleredFactorBldg((double)0.0);
		}
		}
		else{
			this.BOPStructure.setSprinkleredFactorBldg((double)1.0);
		}
	  
	}
	public void HurricaneLossCostsBuilding () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPWanted().equals((String)"Yes") && (this.BOPStructure.getRABOPType().equals((String)"Smoothed") || this.BOPStructure.getRABOPType().equals((String)"Unsmoothed")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"")){
			this.BOPStructure.setHurricaneLossCostsBuilding(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("HurricaneLossCostsBuilding",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory")))));
		}
		else{
			this.BOPStructure.setHurricaneLossCostsBuilding((double)0.0);
		}
	  
	}
	public void fungusExcessCovRate_1 ()  {
	  this.BOPStructure.setFungusExcessCovRate_1((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"../../BOPLimitedFungiBacteriaCov") ){
			this.BOPStructure.setFungusExcessCovRate_1(this.BOPStructure.getFungusExcessCovRate_1()+(MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"BOPLimitedFungiBacteriaCovExcessCoverage/Rate"))));
		}

	  
	}
	public void BldgCodeEffectivenessGradeFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructure.getBldgCodeEffectivenessGrade().equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"")){
			this.BOPStructure.setBldgCodeEffectivenessGradeFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BldgCodeEffectivenessGradeFactor",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory ")),String.valueOf(BOPStructure.getBldgCodeEffectivenessGrade()))));
		}
		else{
			this.BOPStructure.setBldgCodeEffectivenessGradeFactor((double)0.0);
		}
	  
	}
	public void otherCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
			this.BOPStructure.setOtherCount_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fast Food") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Limited Cooking") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fine Dining") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Casual Dining")){
			this.BOPStructure.setOtherCount_1(Integer.valueOf(this.BOPStructure.getOtherCount_1()) + (int)1.0);
		}
		else{
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment Condominium Association") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Office") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Office Condominium"))){
			this.BOPStructure.setOtherCount_1(Integer.valueOf(this.BOPStructure.getOtherCount_1()) + (int)1.0);
		}
		}
		}
		}		}

		}
	  
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
	public void officeArea_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
			this.BOPStructure.setOfficeArea_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fast Food") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Limited Cooking") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fine Dining") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Casual Dining"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment Condominium Association") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Apartment"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Office") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Office Condominium")){
			this.BOPStructure.setOfficeArea_1(Integer.valueOf(this.BOPStructure.getOfficeArea_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))));
		}
		}
		}
		}		}

		}
	  
	}
	public void BOPStructureTenantsFireLiabCoverage_Limit ()  {
	  
		if(XpathNode.selectNodes(this.BOPStructure,"BOPTenantsLiability").size() > 0.0){
		for(com.nest.res.bop.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage :BOPStructureTenantsFireLiabCoverageList){
		BOPStructureTenantsFireLiabCoverage.setDsLimit((int)0.0);
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
	public void BuildingRate () throws LookupException,NumberFormatException {
	  
		if(!(this.BOPStructure.getRABOPWanted().equals((String)"Yes") && this.BOPStructure.getRABOPType().equals((String)"Smoothed"))){
		if(!(this.BOPStructure.getRABOPWanted().equals((String)"Yes") && this.BOPStructure.getRABOPType().equals((String)"Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"")){
			this.BOPStructure.setBuildingRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRate",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory")))));
		}
		else{
			this.BOPStructure.setBuildingRate((double)0.0);
		}
		}
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPStructure.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../CommercialPropertyLCM"))));

	  
	}
	public void restaurantCount_1 ()  {
	  
		if(this.BOPStructure.getPropertyType().equals((String)"Mixed")){
			this.BOPStructure.setRestaurantCount_1((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area"))) != 0){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fast Food") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Limited Cooking") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Fine Dining") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Restaurant-Casual Dining")){
			this.BOPStructure.setRestaurantCount_1(Integer.valueOf(this.BOPStructure.getRestaurantCount_1()) + (int)1.0);
		}
		}		}

		}
	  
	}
	public void DedFactor ()  {
	  this.BOPStructure.setDedFactor((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../DedFactor"))));

	  
	}
	public void FinalBuildingRate ()  {
	  this.BOPStructure.setFinalBuildingRate(MathHelper.roundToThousand(this.BOPStructure.getRateNumberFactorBldg() * this.BOPStructure.getConstructionTypeFactorBldg() * this.BOPStructure.getBldgLimitOfInsuranceRelativityFactor() * this.BOPStructure.getPublicProtectionFactorBldg() * this.BOPStructure.getBldgCodeEffectivenessGradeFactor() * this.BOPStructure.getSprinkleredFactorBldg() * this.BOPStructure.getDedFactor() * ((MathHelper.roundToThousand(this.BOPStructure.getBuildingRateToUse_1() * this.BOPStructure.getLCM()) - MathHelper.roundToThousand(this.BOPStructure.getBldgCreditFactor_1() * this.BOPStructure.getLCM())) - MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPStructure.getWindstormOrHailExclBldgFactor() * this.BOPStructure.getLCM()) - MathHelper.roundToThousand(this.BOPStructure.getBldgCreditFactor_1() * this.BOPStructure.getLCM())) * this.BOPStructure.getWindMitigationDiscount()))));

	  
	}
	public void terrorismPostProRateFactor_1 ()  {
	  this.BOPStructure.setTerrorismPostProRateFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../../BOPTerrorismCoverage/TRIAPostProRateFactor"))));

	  
	}
	public void ProcessPremium4 ()  {
	  
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium10();

		}
	}
	setPremium();
	  
	}
	public void AutomaticIncreaseFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getAutomaticIncreasePct() > (int)0.0 && this.BOPStructure.getAutomaticIncreasePct() != (int)8.0 && this.BOPStructure.getAutomaticIncreasePct() <= (int)16.0){
			this.BOPStructure.setAutomaticIncreaseFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutomaticIncreaseFactor",String.valueOf(BOPStructure.getAutomaticIncreasePct()))));
		}
		else{
		if(this.BOPStructure.getAutomaticIncreasePct() > (int)16.0){
			this.BOPStructure.setAutomaticIncreaseFactor(this.BOPStructure.getAutomaticIncreaseFactor16Pct() + ((((double)this.BOPStructure.getAutomaticIncreasePct() - (double)16.0) / (double)2.0) * this.BOPStructure.getAutomaticIncreaseExcessFactor()));
		}
		else{
			this.BOPStructure.setAutomaticIncreaseFactor((double)1.0);
		}
		}
	  
	}
	public void ProcessPremium2_CommonRatingSub2 ()  {
	  
	RatingPropertyType();
	
	ClassCode();
	
	RateNumber();
	
	ClassGroup();
	
	  
	}
	public void TerrorismBldgFullRate () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismBldgFullRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIABldgFullRate",String.valueOf( "Y"))));

	  
	}
	public void WindMitigationDiscount () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getWindstormMitigationDiscountApplies().equals((String)"Yes") && ((this.BOPStructure.getRoofMaterial().equals((String)"Metal") && this.BOPStructure.getRoofAge().equals((String)"Over 10 Years Old")) || (this.BOPStructure.getRoofMaterial().equals((String)"Non-Metal") && this.BOPStructure.getRoofAge().equals((String)"Over 5 Years Old")))){
		if(this.BOPStructure.getOccupancyClass().equals((String)"Commercial")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"") && !this.BOPStructure.getCertificateLevel().equals((String)"")){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountCommercialOlderRoof",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory ")),String.valueOf(BOPStructure.getCertificateLevel()))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)0.0);
		}
		}
		else{
		if(this.BOPStructure.getOccupancyClass().equals((String)"Residential")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"") && !this.BOPStructure.getCertificateLevel().equals((String)"")){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountResidentialOlderRoof",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory ")),String.valueOf(BOPStructure.getCertificateLevel()))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)0.0);
		}
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)1.0);
		}
		}
		}
		else{
		if(this.BOPStructure.getWindstormMitigationDiscountApplies().equals((String)"Yes") && ((this.BOPStructure.getRoofMaterial().equals((String)"Metal") && this.BOPStructure.getRoofAge().equals((String)"10 or Under Years Old") && !this.BOPStructure.getSubDecking().equals((String)"No")) || (this.BOPStructure.getRoofMaterial().equals((String)"Non-Metal") && this.BOPStructure.getRoofAge().equals((String)"5 or Under Years Old")))){
		if(this.BOPStructure.getOccupancyClass().equals((String)"Commercial")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"") && !this.BOPStructure.getCertificateLevel().equals((String)"")){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountCommercialNewerRoof",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory ")),String.valueOf(BOPStructure.getCertificateLevel()))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)0.0);
		}
		}
		else{
		if(this.BOPStructure.getOccupancyClass().equals((String)"Residential")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"") && !this.BOPStructure.getCertificateLevel().equals((String)"")){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountResidentialNewerRoof",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory ")),String.valueOf(BOPStructure.getCertificateLevel()))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)0.0);
		}
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)1.0);
		}
		}
		}
		else{
		if(this.BOPStructure.getWindstormMitigationDiscountApplies().equals((String)"Yes") && (this.BOPStructure.getRoofMaterial().equals((String)"Metal") && this.BOPStructure.getRoofAge().equals((String)"10 or Under Years Old") && this.BOPStructure.getSubDecking().equals((String)"No"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"") && !this.BOPStructure.getCertificateLevel().equals((String)"")){
			this.BOPStructure.setWindMitigationDiscount(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindMitigationDiscountCommercialNoSubdecking",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory ")),String.valueOf(BOPStructure.getCertificateLevel()))));
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)0.0);
		}
		}
		else{
		if(this.BOPStructure.getWindstormOrHailExclBldgFactor() == (double)0.0 && this.BOPStructure.getWindstormMitigationDiscountApplies().equals((String)"No")){
			this.BOPStructure.setWindMitigationDiscount((double)0.0);
		}
		else{
			this.BOPStructure.setWindMitigationDiscount((double)1.0);
		}
		}
		}
		}
	  
	}
	public void ProcessPremium3 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium3_CommonRatingSub1();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium4();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium5();

		}
	}
	if(null != BOPALWindHailExclDirectDamageList){
		for(BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage:BOPALWindHailExclDirectDamageList){
			BOPALWindHailExclDirectDamageRule = new com.nest.res.bop.rules.BOPALWindHailExclDirectDamage(BOPALWindHailExclDirectDamage);
			BOPALWindHailExclDirectDamageRule.CommonRating1();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium6();

		}
	}
	ProcessPremium3_CommonRatingSub2();
	
	ProcessPremium3_CommonRatingSub3();
	
	if(null != BOPStructureLiabMedExpensesBldgCoverageList){
		for(BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage:BOPStructureLiabMedExpensesBldgCoverageList){
			BOPStructureLiabMedExpensesBldgCoverageRule = new com.nest.res.bop.rules.BOPStructureLiabMedExpensesBldgCoverage(BOPStructureLiabMedExpensesBldgCoverage);
			BOPStructureLiabMedExpensesBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureBuildingCoverageList){
		for(BOPStructureBuildingCoverage BOPStructureBuildingCoverage:BOPStructureBuildingCoverageList){
			BOPStructureBuildingCoverageRule = new com.nest.res.bop.rules.BOPStructureBuildingCoverage(BOPStructureBuildingCoverage);
			BOPStructureBuildingCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium7();

		}
	}
	if(null != BOPDebrisRmvlAddlInsList){
		for(BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns:BOPDebrisRmvlAddlInsList){
			BOPDebrisRmvlAddlInsRule = new com.nest.res.bop.rules.BOPDebrisRmvlAddlIns(BOPDebrisRmvlAddlIns);
			BOPDebrisRmvlAddlInsRule.ProcessPremium1();

		}
	}
	if(null != BOPEarthquakeList){
		for(BOPEarthquake BOPEarthquake:BOPEarthquakeList){
			BOPEarthquakeRule = new com.nest.res.bop.rules.BOPEarthquake(BOPEarthquake);
			BOPEarthquakeRule.ProcessPremium1();

		}
	}
	if(null != BOPEQSubLimitList){
		for(BOPEQSubLimit BOPEQSubLimit:BOPEQSubLimitList){
			BOPEQSubLimitRule = new com.nest.res.bop.rules.BOPEQSubLimit(BOPEQSubLimit);
			BOPEQSubLimitRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList){
		for(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg:BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList){
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule = new com.nest.res.bop.rules.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg);
			BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgRule.ProcessPremium1();

		}
	}
	if(null != BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList){
		for(BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis:BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList){
			BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule = new com.nest.res.bop.rules.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis(BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis);
			BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitationsOnCoverageForRoofSurfacingList){
		for(BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing:BOPLimitationsOnCoverageForRoofSurfacingList){
			BOPLimitationsOnCoverageForRoofSurfacingRule = new com.nest.res.bop.rules.BOPLimitationsOnCoverageForRoofSurfacing(BOPLimitationsOnCoverageForRoofSurfacing);
			BOPLimitationsOnCoverageForRoofSurfacingRule.ProcessPremium1();

		}
	}
	if(null != BOPNamedPerilsBldgList){
		for(BOPNamedPerilsBldg BOPNamedPerilsBldg:BOPNamedPerilsBldgList){
			BOPNamedPerilsBldgRule = new com.nest.res.bop.rules.BOPNamedPerilsBldg(BOPNamedPerilsBldg);
			BOPNamedPerilsBldgRule.ProcessPremium1();

		}
	}
	if(null != BOPOptionalPerPersonMedicalExpensesCoverageBuildingList){
		for(BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding:BOPOptionalPerPersonMedicalExpensesCoverageBuildingList){
			BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule = new com.nest.res.bop.rules.BOPOptionalPerPersonMedicalExpensesCoverageBuilding(BOPOptionalPerPersonMedicalExpensesCoverageBuilding);
			BOPOptionalPerPersonMedicalExpensesCoverageBuildingRule.ProcessPremium1();

		}
	}
	if(null != BOPOrdinanceOrLawCovList){
		for(BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov:BOPOrdinanceOrLawCovList){
			BOPOrdinanceOrLawCovRule = new com.nest.res.bop.rules.BOPOrdinanceOrLawCov(BOPOrdinanceOrLawCov);
			BOPOrdinanceOrLawCovRule.ProcessPremium1();

		}
	}
	if(null != BOPSprinklerLeakageEQExtList){
		for(BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt:BOPSprinklerLeakageEQExtList){
			BOPSprinklerLeakageEQExtRule = new com.nest.res.bop.rules.BOPSprinklerLeakageEQExt(BOPSprinklerLeakageEQExt);
			BOPSprinklerLeakageEQExtRule.ProcessPremium1();

		}
	}
	if(null != BOPAutomaticIncreaseCoverageBuildingList){
		for(BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding:BOPAutomaticIncreaseCoverageBuildingList){
			BOPAutomaticIncreaseCoverageBuildingRule = new com.nest.res.bop.rules.BOPAutomaticIncreaseCoverageBuilding(BOPAutomaticIncreaseCoverageBuilding);
			BOPAutomaticIncreaseCoverageBuildingRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureACVCoverageList){
		for(BOPStructureACVCoverage BOPStructureACVCoverage:BOPStructureACVCoverageList){
			BOPStructureACVCoverageRule = new com.nest.res.bop.rules.BOPStructureACVCoverage(BOPStructureACVCoverage);
			BOPStructureACVCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureTenantsFireLiabCoverageList){
		for(BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage:BOPStructureTenantsFireLiabCoverageList){
			BOPStructureTenantsFireLiabCoverageRule = new com.nest.res.bop.rules.BOPStructureTenantsFireLiabCoverage(BOPStructureTenantsFireLiabCoverage);
			BOPStructureTenantsFireLiabCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPTenantsLiabilityList){
		for(BOPTenantsLiability BOPTenantsLiability:BOPTenantsLiabilityList){
			BOPTenantsLiabilityRule = new com.nest.res.bop.rules.BOPTenantsLiability(BOPTenantsLiability);
			BOPTenantsLiabilityRule.ProcessPremium1();

		}
	}
	if(null != BOPVacancyPermitList){
		for(BOPVacancyPermit BOPVacancyPermit:BOPVacancyPermitList){
			BOPVacancyPermitRule = new com.nest.res.bop.rules.BOPVacancyPermit(BOPVacancyPermit);
			BOPVacancyPermitRule.ProcessPremium1();

		}
	}
	if(null != BOPWindstormOrHailLossesRoofACVList){
		for(BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV:BOPWindstormOrHailLossesRoofACVList){
			BOPWindstormOrHailLossesRoofACVRule = new com.nest.res.bop.rules.BOPWindstormOrHailLossesRoofACV(BOPWindstormOrHailLossesRoofACV);
			BOPWindstormOrHailLossesRoofACVRule.ProcessPremium1();

		}
	}
	ProcessPremium3_CommonRatingSub4();
	
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium8();

		}
	}
	if(null != BOPClassificationList){
		for(BOPClassification BOPClassification:BOPClassificationList){
			BOPClassificationRule = new com.nest.res.bop.rules.BOPClassification(BOPClassification);
			BOPClassificationRule.ProcessPremium9();

		}
	}
	if(null != BOPBusnIncomeAndExtraExpenseCovLOIList){
		for(BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI:BOPBusnIncomeAndExtraExpenseCovLOIList){
			BOPBusnIncomeAndExtraExpenseCovLOIRule = new com.nest.res.bop.rules.BOPBusnIncomeAndExtraExpenseCovLOI(BOPBusnIncomeAndExtraExpenseCovLOI);
			BOPBusnIncomeAndExtraExpenseCovLOIRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList){
		for(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity:BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList){
			BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule = new com.nest.res.bop.rules.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity(BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity);
			BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityRule.ProcessPremium1();

		}
	}
	  
	}
	public void BusnPrsnlPropLimit ()  {
	  this.BOPStructure.setBusnPrsnlPropLimit((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){
			this.BOPStructure.setBusnPrsnlPropLimit(this.BOPStructure.getBusnPrsnlPropLimit()+this.BOPStructure.getBusnPrsnlPropLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TotBusnPrsnlPropLimit"))));
		}

	  
	}
	public void contractorCount_1 ()  {
	  this.BOPStructure.setContractorCount_1((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))).equals((String)"Contractor")){
			this.BOPStructure.setContractorCount_1(Integer.valueOf(this.BOPStructure.getContractorCount_1()) + (int)1.0);
		}		}

	  
	}
	public void PublicProtectionFactorBldg () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../FireProtectionClassPPC"))).equals((String)"")){
			this.BOPStructure.setPublicProtectionFactorBldg(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PublicProtectionClassPPCFactorBldg",((String)XpathNode.selectNodeValue(this.BOPStructure," ../FireProtectionClassPPC")))));
		}
		else{
			this.BOPStructure.setPublicProtectionFactorBldg((double)0.0);
		}
	  
	}
	public void LCM ()  {
	  this.BOPStructure.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructure,"../LCM"))));

	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../EachOccLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../ProdCompldOpsAggregateLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../AggregateLimit"))).equals((String)"")){
			this.BOPStructure.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",((String)XpathNode.selectNodeValue(this.BOPStructure," ../../EachOccLimit ")),((String)XpathNode.selectNodeValue(this.BOPStructure," ../../ProdCompldOpsAggregateLimit ")),((String)XpathNode.selectNodeValue(this.BOPStructure," ../../AggregateLimit")))));
		}
		else{
			this.BOPStructure.setIncrLimitFactor((double)0.0);
		}
	  
	}
	public void BldgLimitOfInsuranceRelativityGroup () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../RatingTerritory"))).equals((String)"")){
			this.BOPStructure.setBldgLimitOfInsuranceRelativityGroup(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("BldgLimitOfInsRelativityGroup",((String)XpathNode.selectNodeValue(this.BOPStructure," ../RatingTerritory")))));
		}
		else{
			this.BOPStructure.setBldgLimitOfInsuranceRelativityGroup((String)"0");
		}
	  
	}
	public void TerrsmLiabIncrLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrsmSubLimit"))).equals((String)"Not Applicable")){
			this.BOPStructure.setTerrsmLiabIncrLimitsFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TerrorismLiabIncrLimitsFactor",((String)XpathNode.selectNodeValue(this.BOPStructure," ../../TerrsmSubLimit")))));
		}
		else{
			this.BOPStructure.setTerrsmLiabIncrLimitsFactor((double)0.0);
		}
	  
	}
	public void TerrsmLiabilityPremium ()  {
	  this.BOPStructure.setTerrsmLiabilityPremium((double)0.0);

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"Yes")){
			this.BOPStructure.setTerrsmLiabilityPremium(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFactor() * this.BOPStructure.getTerrorismPreProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses")){
			this.BOPStructure.setTerrsmLiabilityPremium(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFactor() * this.BOPStructure.getTerrorismPreProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * this.BOPStructure.getTerrorismLiabNuclBiolChemRadFactor()));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Limitations Of Coverage For Certified Acts Of Terrorism")){
		if(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() > (double)0.0 && this.BOPStructure.getIncrLimitFactor() > (double)0.0){
			this.BOPStructure.setTerrsmLiabilityPremium(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFactor() * this.BOPStructure.getTerrorismPreProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * MathHelper.roundToThousand(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() / this.BOPStructure.getIncrLimitFactor())));
		}
		}
		}
		}
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIPTerminatesBeforeExpirationDate"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TRIAExtended"))).equals((String)"No") && ((XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismDispositionOfAct2002"))) == null && ((XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalExclusionOfTerrorismNuclearBiologicalChemicalDispositionOfAct2002"))) == null && ((XpathNode.selectNodeValue(this.BOPStructure,"../../BOPConditionalLimitationOfCoverageTerrorismSublimitAnnualAggregateTerrorismAct2002"))) == null){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"Yes")){
			this.BOPStructure.setTerrsmLiabilityPremium(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFullFactor() * this.BOPStructure.getTerrorismPostProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Excl Of Certfd Acts Of Terrsm Involving Nuclear, Biological, Chemical Or Radiological Terrsm; Cap On Covered Certfd Acts Losses")){
			this.BOPStructure.setTerrsmLiabilityPremium(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFullFactor() * this.BOPStructure.getTerrorismPostProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * this.BOPStructure.getTerrorismLiabNuclBiolChemRadFactor()));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverage"))).equals((String)"No") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TerrorismCoverageSpecificLimits"))).equals((String)"Yes") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../../TypeOfExclusion"))).equals((String)"Limitations Of Coverage For Certified Acts Of Terrorism")){
		if(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() > (double)0.0 && this.BOPStructure.getIncrLimitFactor() > (double)0.0){
			this.BOPStructure.setTerrsmLiabilityPremium(this.BOPStructure.getTerrsmLiabilityPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToTenThousand(this.BOPStructure.getTerrorismLiabilityFullFactor() * this.BOPStructure.getTerrorismPostProRateFactor_2()) * this.BOPStructure.getLiabMedExpensesTotPremium()) * MathHelper.roundToThousand(this.BOPStructure.getTerrsmLiabIncrLimitsFactor() / this.BOPStructure.getIncrLimitFactor())));
		}
		}
		}
		}
		}
	  
	}
	public void ClassCode ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals((String)"Yes")){
			this.BOPStructure.setClassCode((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassCode"))));
		}		}

	  
	}
	public void BuildingRateRABOP () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getRABOPWanted().equals((String)"Yes") && this.BOPStructure.getRABOPType().equals((String)"Smoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals((String)"Other")){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPStructure," ../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals((String)"Other")){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPStructure," ../ZipCodeOverride")))));
		}
		else{
			this.BOPStructure.setBuildingRateRABOP((double)0.0);
		}
		}
		}
		else{
		if(this.BOPStructure.getRABOPWanted().equals((String)"Yes") && this.BOPStructure.getRABOPType().equals((String)"Unsmoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals((String)"Other")){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPStructure," ../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructure,"../ZipCode"))).equals((String)"Other")){
			this.BOPStructure.setBuildingRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BuildingRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPStructure," ../ZipCodeOverride")))));
		}
		else{
			this.BOPStructure.setBuildingRateRABOP((double)0.0);
		}
		}
		}
		}
	  
	}
	public void CombinedLimit ()  {
	  this.BOPStructure.setCombinedLimit((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){
			this.BOPStructure.setCombinedLimit(this.BOPStructure.getCombinedLimit()+this.BOPStructure.getCombinedLimit() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"TotBusnPrsnlPropLimit"))));
		}
this.BOPStructure.setCombinedLimit(this.BOPStructure.getCombinedLimit() + this.BOPStructure.getBuildingLimit());

	  
	}
	public void RateNumber ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPStructure,"BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"PredominantOccupancy"))).equals((String)"Yes")){
			this.BOPStructure.setRateNumber((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"RateNumber"))));
		}		}

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList != null && this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList.size() > 0){
			for(com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg : BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldgList) {
				finalPremium = finalPremium + BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPremium();
			}
		}
		if(this.BOPLimitationsOnCoverageForRoofSurfacingList != null && this.BOPLimitationsOnCoverageForRoofSurfacingList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitationsOnCoverageForRoofSurfacing BOPLimitationsOnCoverageForRoofSurfacing : BOPLimitationsOnCoverageForRoofSurfacingList) {
				finalPremium = finalPremium + BOPLimitationsOnCoverageForRoofSurfacing.getPremium();
			}
		}
		if(this.BOPDebrisRmvlAddlInsList != null && this.BOPDebrisRmvlAddlInsList.size() > 0){
			for(com.nest.res.bop.domain.BOPDebrisRmvlAddlIns BOPDebrisRmvlAddlIns : BOPDebrisRmvlAddlInsList) {
				finalPremium = finalPremium + BOPDebrisRmvlAddlIns.getPremium();
			}
		}
		if(this.BOPEarthquakeList != null && this.BOPEarthquakeList.size() > 0){
			for(com.nest.res.bop.domain.BOPEarthquake BOPEarthquake : BOPEarthquakeList) {
				finalPremium = finalPremium + BOPEarthquake.getPremium();
			}
		}
		if(this.BOPStructureLiabMedExpensesBldgCoverageList != null && this.BOPStructureLiabMedExpensesBldgCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage : BOPStructureLiabMedExpensesBldgCoverageList) {
				finalPremium = finalPremium + BOPStructureLiabMedExpensesBldgCoverage.getPremium();
			}
		}
		if(this.BOPOptionalPerPersonMedicalExpensesCoverageBuildingList != null && this.BOPOptionalPerPersonMedicalExpensesCoverageBuildingList.size() > 0){
			for(com.nest.res.bop.domain.BOPOptionalPerPersonMedicalExpensesCoverageBuilding BOPOptionalPerPersonMedicalExpensesCoverageBuilding : BOPOptionalPerPersonMedicalExpensesCoverageBuildingList) {
				finalPremium = finalPremium + BOPOptionalPerPersonMedicalExpensesCoverageBuilding.getPremium();
			}
		}
		if(this.BOPStructureACVCoverageList != null && this.BOPStructureACVCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPStructureACVCoverage BOPStructureACVCoverage : BOPStructureACVCoverageList) {
				finalPremium = finalPremium + BOPStructureACVCoverage.getPremium();
			}
		}
		if(this.BOPClassificationList != null && this.BOPClassificationList.size() > 0){
			for(com.nest.res.bop.domain.BOPClassification BOPClassification : BOPClassificationList) {
				finalPremium = finalPremium + BOPClassification.getPremium();
			}
		}
		if(this.BOPStructureTenantsFireLiabCoverageList != null && this.BOPStructureTenantsFireLiabCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPStructureTenantsFireLiabCoverage BOPStructureTenantsFireLiabCoverage : BOPStructureTenantsFireLiabCoverageList) {
				finalPremium = finalPremium + BOPStructureTenantsFireLiabCoverage.getPremium();
			}
		}
		if(this.BOPOrdinanceOrLawCovList != null && this.BOPOrdinanceOrLawCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPOrdinanceOrLawCov BOPOrdinanceOrLawCov : BOPOrdinanceOrLawCovList) {
				finalPremium = finalPremium + BOPOrdinanceOrLawCov.getPremium();
			}
		}
		if(this.BOPALWindHailExclDirectDamageList != null && this.BOPALWindHailExclDirectDamageList.size() > 0){
			for(com.nest.res.bop.domain.BOPALWindHailExclDirectDamage BOPALWindHailExclDirectDamage : BOPALWindHailExclDirectDamageList) {
				finalPremium = finalPremium + BOPALWindHailExclDirectDamage.getPremium();
			}
		}
		if(this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList != null && this.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList.size() > 0){
			for(com.nest.res.bop.domain.BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis : BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasisList) {
				finalPremium = finalPremium + BOPIncreaseInRebuildingExpensesFollowingDisasterAdditionalExpenseCoverageOnAnnualAggregateBasis.getPremium();
			}
		}
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList != null && this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity : BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnityList) {
				finalPremium = finalPremium + BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getPremium();
			}
		}
		if(this.BOPNamedPerilsBldgList != null && this.BOPNamedPerilsBldgList.size() > 0){
			for(com.nest.res.bop.domain.BOPNamedPerilsBldg BOPNamedPerilsBldg : BOPNamedPerilsBldgList) {
				finalPremium = finalPremium + BOPNamedPerilsBldg.getPremium();
			}
		}
		if(this.BOPWindstormOrHailLossesRoofACVList != null && this.BOPWindstormOrHailLossesRoofACVList.size() > 0){
			for(com.nest.res.bop.domain.BOPWindstormOrHailLossesRoofACV BOPWindstormOrHailLossesRoofACV : BOPWindstormOrHailLossesRoofACVList) {
				finalPremium = finalPremium + BOPWindstormOrHailLossesRoofACV.getPremium();
			}
		}
		if(this.BOPStructureBuildingCoverageList != null && this.BOPStructureBuildingCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage : BOPStructureBuildingCoverageList) {
				finalPremium = finalPremium + BOPStructureBuildingCoverage.getPremium();
			}
		}
		if(this.BOPSprinklerLeakageEQExtList != null && this.BOPSprinklerLeakageEQExtList.size() > 0){
			for(com.nest.res.bop.domain.BOPSprinklerLeakageEQExt BOPSprinklerLeakageEQExt : BOPSprinklerLeakageEQExtList) {
				finalPremium = finalPremium + BOPSprinklerLeakageEQExt.getPremium();
			}
		}
		if(this.BOPEQSubLimitList != null && this.BOPEQSubLimitList.size() > 0){
			for(com.nest.res.bop.domain.BOPEQSubLimit BOPEQSubLimit : BOPEQSubLimitList) {
				finalPremium = finalPremium + BOPEQSubLimit.getPremium();
			}
		}
		if(this.BOPVacancyPermitList != null && this.BOPVacancyPermitList.size() > 0){
			for(com.nest.res.bop.domain.BOPVacancyPermit BOPVacancyPermit : BOPVacancyPermitList) {
				finalPremium = finalPremium + BOPVacancyPermit.getPremium();
			}
		}
		if(this.BOPBusnIncomeAndExtraExpenseCovLOIList != null && this.BOPBusnIncomeAndExtraExpenseCovLOIList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeAndExtraExpenseCovLOI BOPBusnIncomeAndExtraExpenseCovLOI : BOPBusnIncomeAndExtraExpenseCovLOIList) {
				finalPremium = finalPremium + BOPBusnIncomeAndExtraExpenseCovLOI.getPremium();
			}
		}
		if(this.BOPAutomaticIncreaseCoverageBuildingList != null && this.BOPAutomaticIncreaseCoverageBuildingList.size() > 0){
			for(com.nest.res.bop.domain.BOPAutomaticIncreaseCoverageBuilding BOPAutomaticIncreaseCoverageBuilding : BOPAutomaticIncreaseCoverageBuildingList) {
				finalPremium = finalPremium + BOPAutomaticIncreaseCoverageBuilding.getPremium();
			}
		}
		if(this.BOPTenantsLiabilityList != null && this.BOPTenantsLiabilityList.size() > 0){
			for(com.nest.res.bop.domain.BOPTenantsLiability BOPTenantsLiability : BOPTenantsLiabilityList) {
				finalPremium = finalPremium + BOPTenantsLiability.getPremium();
			}
		}
this.BOPStructure.setPremium(finalPremium) ;
	  
	}
	public void TerrorismSprinkleredFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructure.getSprinklered().equals((String)"Yes")){
			this.BOPStructure.setTerrorismSprinkleredFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TerrorismSprinkleredFactor",String.valueOf( "Y"))));
		}
		else{
			this.BOPStructure.setTerrorismSprinkleredFactor((double)1.0);
		}
	  
	}
	public void TerrorismLiabilityFullFactor () throws LookupException,NumberFormatException {
	  this.BOPStructure.setTerrorismLiabilityFullFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TRIALiabilityFullFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}