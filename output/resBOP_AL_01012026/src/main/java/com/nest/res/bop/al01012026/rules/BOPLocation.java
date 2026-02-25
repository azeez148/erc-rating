package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPFireDeptServiceContract;
import com.nest.res.bop.al01012026.domain.BOPLossRentalValueLandlordDesignatedPayee;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdCoOwnerInsdPremises;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdLessorsLeasedEquipmt;
import com.nest.res.bop.al01012026.domain.BOPPremiumAuditNoncomplianceCharge;
import com.nest.res.bop.al01012026.domain.BOPLocationMoneySecuritiesOffPremCoverage;
import com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage;
import com.nest.res.bop.al01012026.domain.BOPApartmentBuildings;
import com.nest.res.bop.al01012026.domain.BOPBusinessLiabExcl;
import com.nest.res.bop.al01012026.domain.BOPApartmentBuildingsTenantsAutos;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdGrantorOfFranchiseEndorsement;
import com.nest.res.bop.al01012026.domain.BOPLocationMoneySecuritiesOnPremCoverage;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdLandLeased;
import com.nest.res.bop.al01012026.domain.BOPLocationOutdoorSignsCoverage;
import com.nest.res.bop.al01012026.domain.BOPStructure;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdOwnersLesseesContrctrs;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdManagersLessorsPremises;
import com.nest.res.bop.al01012026.domain.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage;
import com.nest.res.bop.al01012026.domain.BOPFineArts;
import com.nest.res.bop.al01012026.domain.BOPEquipmentBreakdownProtectionCoverage;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdBldgOwners;
import com.nest.res.bop.al01012026.domain.BOPHigherLimitsLocation;
import com.nest.res.bop.al01012026.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability;
import com.nest.res.bop.al01012026.domain.BOPLocationFireDeptServiceCoverage;
import com.nest.res.bop.al01012026.domain.BOPWaterBackUpAndSumpOverflowLocation;
import com.nest.res.bop.al01012026.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment;
import com.nest.res.bop.al01012026.domain.BOPWindHailDeductibles;
import com.nest.res.bop.al01012026.domain.BOPFloodCov;
import com.nest.res.bop.al01012026.domain.BOPRestaurants;
import com.nest.res.bop.al01012026.domain.BOPAddlInsdMortgageeAssigneeReceiver;
import com.nest.res.bop.al01012026.domain.BOPDesignatedPremisesProject;

public class BOPLocation  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocationRule;
	private List<BOPFireDeptServiceContract> BOPFireDeptServiceContractList;
	private com.nest.res.bop.al01012026.rules.BOPApartmentBuildings BOPApartmentBuildingsRule;
	private com.nest.res.bop.al01012026.rules.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverageRule;
	private List<BOPLossRentalValueLandlordDesignatedPayee> BOPLossRentalValueLandlordDesignatedPayeeList;
	private com.nest.res.bop.al01012026.rules.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverageRule;
	private List<BOPAddlInsdCoOwnerInsdPremises> BOPAddlInsdCoOwnerInsdPremisesList;
	private List<BOPAddlInsdLessorsLeasedEquipmt> BOPAddlInsdLessorsLeasedEquipmtList;
	private List<BOPPremiumAuditNoncomplianceCharge> BOPPremiumAuditNoncomplianceChargeList;
	private List<BOPLocationMoneySecuritiesOffPremCoverage> BOPLocationMoneySecuritiesOffPremCoverageList;
	private List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageList;
	private List<BOPApartmentBuildings> BOPApartmentBuildingsList;
	private com.nest.res.bop.al01012026.rules.BOPFineArts BOPFineArtsRule;
	private List<BOPBusinessLiabExcl> BOPBusinessLiabExclList;
	private List<BOPApartmentBuildingsTenantsAutos> BOPApartmentBuildingsTenantsAutosList;
	private List<BOPAddlInsdGrantorOfFranchiseEndorsement> BOPAddlInsdGrantorOfFranchiseEndorsementList;
	private com.nest.res.bop.al01012026.rules.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverageRule;
	private List<BOPLocationMoneySecuritiesOnPremCoverage> BOPLocationMoneySecuritiesOnPremCoverageList;
	private List<BOPAddlInsdLandLeased> BOPAddlInsdLandLeasedList;
	private com.nest.res.bop.al01012026.rules.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageRule;
	private List<BOPLocationOutdoorSignsCoverage> BOPLocationOutdoorSignsCoverageList;
	private List<BOPStructure> BOPStructureList;
	private List<BOPAddlInsdOwnersLesseesContrctrs> BOPAddlInsdOwnersLesseesContrctrsList;
	private com.nest.res.bop.al01012026.rules.BOPPremiumAuditNoncomplianceCharge BOPPremiumAuditNoncomplianceChargeRule;
	private List<BOPAddlInsdManagersLessorsPremises> BOPAddlInsdManagersLessorsPremisesList;
	private com.nest.res.bop.al01012026.rules.BOPFloodCov BOPFloodCovRule;
	private List<BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage> BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverageRule;
	private List<BOPFineArts> BOPFineArtsList;
	private com.nest.res.bop.al01012026.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentRule;
	private List<BOPEquipmentBreakdownProtectionCoverage> BOPEquipmentBreakdownProtectionCoverageList;
	private com.nest.res.bop.al01012026.rules.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayeeRule;
	private com.nest.res.bop.al01012026.rules.BOPRestaurants BOPRestaurantsRule;
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrsRule;
	private List<BOPAddlInsdBldgOwners> BOPAddlInsdBldgOwnersList;
	private com.nest.res.bop.al01012026.domain.BOPLocation BOPLocation;
	private com.nest.res.bop.al01012026.rules.BOPStructure BOPStructureRule;
	private com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageRule;
	private List<BOPHigherLimitsLocation> BOPHigherLimitsLocationList;
	private List<BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability> BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList;
	private List<BOPLocationFireDeptServiceCoverage> BOPLocationFireDeptServiceCoverageList;
	private List<BOPWaterBackUpAndSumpOverflowLocation> BOPWaterBackUpAndSumpOverflowLocationList;
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList;
	private List<BOPWindHailDeductibles> BOPWindHailDeductiblesList;
	private List<BOPFloodCov> BOPFloodCovList;
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsementRule;
	private List<BOPRestaurants> BOPRestaurantsList;
	private com.nest.res.bop.al01012026.rules.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverageRule;
	private List<BOPAddlInsdMortgageeAssigneeReceiver> BOPAddlInsdMortgageeAssigneeReceiverList;
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremisesRule;
	private com.nest.res.bop.al01012026.rules.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmtRule;
	private List<BOPDesignatedPremisesProject> BOPDesignatedPremisesProjectList;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.al01012026.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub2();
	
	  
	}
	public void ProcessPremium2_CommonRatingSub2 ()  {
	  
	RatingPropertyType();
	
	  
	}
	public void ProcessPremium3 ()  {
	  
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.al01012026.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium4();

		}
	}
	  
	}
	public void InlandMarineLCM ()  {
	  this.BOPLocation.setInlandMarineLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../InlandMarineLCM"))));

	  
	}
	public void FungiExcessLimitPremium ()  {
	  
		if(this.BOPLocation.getSeparateAnnualAggregateLimit().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLocation.setFungiExcessLimitPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPLocation.getFungiExcessCovRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../LCM")))) * ((MathHelper.getDoubleValue(this.BOPLocation.getFungiLimit()) - MathHelper.getDoubleValue(15000.0)) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPLocation.setFungiExcessLimitPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void OptnlDedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPLocation.getOptionalDeductible().equals(MathHelper.getStringValue("250"))){
			this.BOPLocation.setOptnlDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("Optnl250FixedDedFactor",String.valueOf( "Y")))));
		}
		else{
		if(!this.BOPLocation.getOptionalDeductible().equals(MathHelper.getStringValue("")) || this.BOPLocation.getTotAmountInsurance() == MathHelper.getIntegerValue(0.0)){
			this.BOPLocation.setOptnlDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",String.valueOf(this.BOPLocation.getOptionalDeductible()),String.valueOf(this.BOPLocation.getTotAmountInsurance())))));
		}
		else{
			this.BOPLocation.setOptnlDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void RatingPropertyType ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLocation.setRatingPropertyType(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType")))));
		}		}

	  
	}
	public void TheftOfClientsPropertyEmployeeDishtyApplyCount ()  {
	  
		if(this.BOPLocation.getEmployeeDishtyApply().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCount(MathHelper.getIntegerValue(this.BOPLocation.getTheftOfClientsPropertyEmployeeDishtyApplyCountTemp_1()));
		}
		else{
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCount(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	FungiExcessCovRate();
	
	FungiExcessLimitPremium();
	
	  
	}
	public void ProcessPremium4 () throws LookupException,NumberFormatException {
	  
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.al01012026.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium5();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public  BOPLocation (com.nest.res.bop.al01012026.domain.BOPLocation BOPLocation)  {
	  this.BOPLocation = BOPLocation;
this.BOPFireDeptServiceContractList = BOPLocation.getBOPFireDeptServiceContract();
this.BOPLossRentalValueLandlordDesignatedPayeeList = BOPLocation.getBOPLossRentalValueLandlordDesignatedPayee();
this.BOPAddlInsdCoOwnerInsdPremisesList = BOPLocation.getBOPAddlInsdCoOwnerInsdPremises();
this.BOPAddlInsdLessorsLeasedEquipmtList = BOPLocation.getBOPAddlInsdLessorsLeasedEquipmt();
this.BOPPremiumAuditNoncomplianceChargeList = BOPLocation.getBOPPremiumAuditNoncomplianceCharge();
this.BOPLocationMoneySecuritiesOffPremCoverageList = BOPLocation.getBOPLocationMoneySecuritiesOffPremCoverage();
this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageList = BOPLocation.getBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage();
this.BOPApartmentBuildingsList = BOPLocation.getBOPApartmentBuildings();
this.BOPBusinessLiabExclList = BOPLocation.getBOPBusinessLiabExcl();
this.BOPApartmentBuildingsTenantsAutosList = BOPLocation.getBOPApartmentBuildingsTenantsAutos();
this.BOPAddlInsdGrantorOfFranchiseEndorsementList = BOPLocation.getBOPAddlInsdGrantorOfFranchiseEndorsement();
this.BOPLocationMoneySecuritiesOnPremCoverageList = BOPLocation.getBOPLocationMoneySecuritiesOnPremCoverage();
this.BOPAddlInsdLandLeasedList = BOPLocation.getBOPAddlInsdLandLeased();
this.BOPLocationOutdoorSignsCoverageList = BOPLocation.getBOPLocationOutdoorSignsCoverage();
this.BOPStructureList = BOPLocation.getBOPStructure();
this.BOPAddlInsdOwnersLesseesContrctrsList = BOPLocation.getBOPAddlInsdOwnersLesseesContrctrs();
this.BOPAddlInsdManagersLessorsPremisesList = BOPLocation.getBOPAddlInsdManagersLessorsPremises();
this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageList = BOPLocation.getBOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage();
this.BOPFineArtsList = BOPLocation.getBOPFineArts();
this.BOPEquipmentBreakdownProtectionCoverageList = BOPLocation.getBOPEquipmentBreakdownProtectionCoverage();
this.BOPAddlInsdBldgOwnersList = BOPLocation.getBOPAddlInsdBldgOwners();
this.BOPHigherLimitsLocationList = BOPLocation.getBOPHigherLimitsLocation();
this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList = BOPLocation.getBOPRestaurantsLossOrDamageToCustomersAutosLegalLiability();
this.BOPLocationFireDeptServiceCoverageList = BOPLocation.getBOPLocationFireDeptServiceCoverage();
this.BOPWaterBackUpAndSumpOverflowLocationList = BOPLocation.getBOPWaterBackUpAndSumpOverflowLocation();
this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList = BOPLocation.getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment();
this.BOPWindHailDeductiblesList = BOPLocation.getBOPWindHailDeductibles();
this.BOPFloodCovList = BOPLocation.getBOPFloodCov();
this.BOPRestaurantsList = BOPLocation.getBOPRestaurants();
this.BOPAddlInsdMortgageeAssigneeReceiverList = BOPLocation.getBOPAddlInsdMortgageeAssigneeReceiver();
this.BOPDesignatedPremisesProjectList = BOPLocation.getBOPDesignatedPremisesProject();

	  
	}
	public void theftOfClientsPropertyEmployeeDishtyApplyCountTemp_1 ()  {
	  
		if(this.BOPLocation.getEmployeeDishtyApply().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCountTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure/BOPClassification") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Dental Laboratories")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Copying or Duplicating Services")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Mail Box, Packaging or Mailing Services"))){
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCountTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPLocation.getTheftOfClientsPropertyEmployeeDishtyApplyCountTemp_1() + MathHelper.getIntegerValue(1.0))));
		}		}

		}
	  
	}
	public void EmployeeDishtyNoChargeLocation ()  {
	  
		if(this.BOPLocation.getEmployeeDishtyApply().equals(MathHelper.getStringValue("Yes"))){
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Dental Laboratories")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Copying or Duplicating Services")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals(MathHelper.getStringValue("Mail Box, Packaging or Mailing Services"))){
			this.BOPLocation.setEmployeeDishtyNoChargeLocation(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}		}

		}
		else{
			this.BOPLocation.setEmployeeDishtyNoChargeLocation(MathHelper.getStringValue(MathHelper.getStringValue("No")));
		}
	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPLocation.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../CommercialPropertyLCM"))));

	  
	}
	public void ProcessPremium2 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPAddlInsdGrantorOfFranchiseEndorsementList){
		for(BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsement:BOPAddlInsdGrantorOfFranchiseEndorsementList){
			BOPAddlInsdGrantorOfFranchiseEndorsementRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdGrantorOfFranchiseEndorsement(BOPAddlInsdGrantorOfFranchiseEndorsement);
			BOPAddlInsdGrantorOfFranchiseEndorsementRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdLessorsLeasedEquipmtList){
		for(BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt:BOPAddlInsdLessorsLeasedEquipmtList){
			BOPAddlInsdLessorsLeasedEquipmtRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdLessorsLeasedEquipmt(BOPAddlInsdLessorsLeasedEquipmt);
			BOPAddlInsdLessorsLeasedEquipmtRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdManagersLessorsPremisesList){
		for(BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises:BOPAddlInsdManagersLessorsPremisesList){
			BOPAddlInsdManagersLessorsPremisesRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdManagersLessorsPremises(BOPAddlInsdManagersLessorsPremises);
			BOPAddlInsdManagersLessorsPremisesRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdOwnersLesseesContrctrsList){
		for(BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs:BOPAddlInsdOwnersLesseesContrctrsList){
			BOPAddlInsdOwnersLesseesContrctrsRule = new com.nest.res.bop.al01012026.rules.BOPAddlInsdOwnersLesseesContrctrs(BOPAddlInsdOwnersLesseesContrctrs);
			BOPAddlInsdOwnersLesseesContrctrsRule.ProcessPremium1();

		}
	}
	if(null != BOPApartmentBuildingsList){
		for(BOPApartmentBuildings BOPApartmentBuildings:BOPApartmentBuildingsList){
			BOPApartmentBuildingsRule = new com.nest.res.bop.al01012026.rules.BOPApartmentBuildings(BOPApartmentBuildings);
			BOPApartmentBuildingsRule.ProcessPremium1();

		}
	}
	if(null != BOPEquipmentBreakdownProtectionCoverageList){
		for(BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage:BOPEquipmentBreakdownProtectionCoverageList){
			BOPEquipmentBreakdownProtectionCoverageRule = new com.nest.res.bop.al01012026.rules.BOPEquipmentBreakdownProtectionCoverage(BOPEquipmentBreakdownProtectionCoverage);
			BOPEquipmentBreakdownProtectionCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPFineArtsList){
		for(BOPFineArts BOPFineArts:BOPFineArtsList){
			BOPFineArtsRule = new com.nest.res.bop.al01012026.rules.BOPFineArts(BOPFineArts);
			BOPFineArtsRule.ProcessPremium1();

		}
	}
	if(null != BOPFloodCovList){
		for(BOPFloodCov BOPFloodCov:BOPFloodCovList){
			BOPFloodCovRule = new com.nest.res.bop.al01012026.rules.BOPFloodCov(BOPFloodCov);
			BOPFloodCovRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageList){
		for(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage:BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageList){
			BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageRule = new com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage);
			BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageList){
		for(BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage:BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageList){
			BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageRule = new com.nest.res.bop.al01012026.rules.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage(BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage);
			BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationFireDeptServiceCoverageList){
		for(BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage:BOPLocationFireDeptServiceCoverageList){
			BOPLocationFireDeptServiceCoverageRule = new com.nest.res.bop.al01012026.rules.BOPLocationFireDeptServiceCoverage(BOPLocationFireDeptServiceCoverage);
			BOPLocationFireDeptServiceCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationOutdoorSignsCoverageList){
		for(BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage:BOPLocationOutdoorSignsCoverageList){
			BOPLocationOutdoorSignsCoverageRule = new com.nest.res.bop.al01012026.rules.BOPLocationOutdoorSignsCoverage(BOPLocationOutdoorSignsCoverage);
			BOPLocationOutdoorSignsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLossRentalValueLandlordDesignatedPayeeList){
		for(BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee:BOPLossRentalValueLandlordDesignatedPayeeList){
			BOPLossRentalValueLandlordDesignatedPayeeRule = new com.nest.res.bop.al01012026.rules.BOPLossRentalValueLandlordDesignatedPayee(BOPLossRentalValueLandlordDesignatedPayee);
			BOPLossRentalValueLandlordDesignatedPayeeRule.ProcessPremium1();

		}
	}
	if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList){
		for(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment:BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList){
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentRule = new com.nest.res.bop.al01012026.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment);
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentRule.ProcessPremium1();

		}
	}
	if(null != BOPPremiumAuditNoncomplianceChargeList){
		for(BOPPremiumAuditNoncomplianceCharge BOPPremiumAuditNoncomplianceCharge:BOPPremiumAuditNoncomplianceChargeList){
			BOPPremiumAuditNoncomplianceChargeRule = new com.nest.res.bop.al01012026.rules.BOPPremiumAuditNoncomplianceCharge(BOPPremiumAuditNoncomplianceCharge);
			BOPPremiumAuditNoncomplianceChargeRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.al01012026.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium2();

		}
	}
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.al01012026.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium3();

		}
	}
	ProcessPremium2_CommonRatingSub2();
	
	if(null != BOPLocationMoneySecuritiesOffPremCoverageList){
		for(BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage:BOPLocationMoneySecuritiesOffPremCoverageList){
			BOPLocationMoneySecuritiesOffPremCoverageRule = new com.nest.res.bop.al01012026.rules.BOPLocationMoneySecuritiesOffPremCoverage(BOPLocationMoneySecuritiesOffPremCoverage);
			BOPLocationMoneySecuritiesOffPremCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationMoneySecuritiesOnPremCoverageList){
		for(BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage:BOPLocationMoneySecuritiesOnPremCoverageList){
			BOPLocationMoneySecuritiesOnPremCoverageRule = new com.nest.res.bop.al01012026.rules.BOPLocationMoneySecuritiesOnPremCoverage(BOPLocationMoneySecuritiesOnPremCoverage);
			BOPLocationMoneySecuritiesOnPremCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPWaterBackUpAndSumpOverflowLocationList){
		for(BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation:BOPWaterBackUpAndSumpOverflowLocationList){
			BOPWaterBackUpAndSumpOverflowLocationRule = new com.nest.res.bop.al01012026.rules.BOPWaterBackUpAndSumpOverflowLocation(BOPWaterBackUpAndSumpOverflowLocation);
			BOPWaterBackUpAndSumpOverflowLocationRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsList){
		for(BOPRestaurants BOPRestaurants:BOPRestaurantsList){
			BOPRestaurantsRule = new com.nest.res.bop.al01012026.rules.BOPRestaurants(BOPRestaurants);
			BOPRestaurantsRule.ProcessPremium1();

		}
	}
	  
	}
	public void BoilerMachineryLCM ()  {
	  this.BOPLocation.setBoilerMachineryLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../BoilerMachineryLCM"))));

	  
	}
	public void State ()  {
	  this.BOPLocation.setState((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocation,"../State"))));

	  
	}
	public void DedFactor ()  {
	  
		if(this.BOPLocation.getWindHailFactor() != MathHelper.getDoubleValue(1.0)){
			this.BOPLocation.setDedFactor(MathHelper.getDoubleValue(this.BOPLocation.getWindHailFactor()));
		}
		else{
			this.BOPLocation.setDedFactor(MathHelper.getDoubleValue(this.BOPLocation.getOptnlDedFactor()));
		}
	  
	}
	public void TotAmountInsurance ()  {
	  this.BOPLocation.setTotAmountInsurance(this.BOPLocation.getTotAmountInsuranceTemp_1());

	  
	}
	public void WindHailFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLocation.getWindHailDeductible().equals(MathHelper.getStringValue("Not Applicable"))){
		if(!this.BOPLocation.getOptionalDeductible().equals(MathHelper.getStringValue("")) && this.BOPLocation.getTotAmountInsurance() != MathHelper.getIntegerValue(0.0) && !this.BOPLocation.getWindHailDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPLocation.setWindHailFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailDedFactorWithLOI",String.valueOf(this.BOPLocation.getOptionalDeductible()),String.valueOf(this.BOPLocation.getTotAmountInsurance()),String.valueOf(this.BOPLocation.getWindHailDeductible())))));
		}
		else{
			this.BOPLocation.setWindHailFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
			this.BOPLocation.setWindHailFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub2 () throws LookupException,NumberFormatException {
	  
	totAmountInsuranceTemp_1();
	
	TotAmountInsurance();
	
	WindHailFactor();
	
	OptnlDedFactor();
	
	DedFactor();
	
	EmployeeDishtyNoChargeLocation();
	
	theftOfClientsPropertyEmployeeDishtyApplyCountTemp_1();
	
	TheftOfClientsPropertyEmployeeDishtyApplyCount();
	
	  
	}
	public void LCM ()  {
	  this.BOPLocation.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../LCM"))));

	  
	}
	public void CrimeLCM ()  {
	  this.BOPLocation.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../CrimeLCM"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPAddlInsdGrantorOfFranchiseEndorsement") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPAddlInsdLessorsLeasedEquipmt") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPAddlInsdManagersLessorsPremises") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPAddlInsdOwnersLesseesContrctrs") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPApartmentBuildings") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"BOPEquipmentBreakdownProtectionCoverage/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPFineArts") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPFloodCov") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}
this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"BOPLocationFireDeptServiceCoverage/Premium")))));
this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"BOPLocationMoneySecuritiesOffPremCoverage/Premium")))));
this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"BOPLocationMoneySecuritiesOnPremCoverage/Premium")))));
this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"BOPLocationOutdoorSignsCoverage/Premium")))));

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPLossRentalValueLandlordDesignatedPayee") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPPremiumAuditNoncomplianceCharge") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPRestaurants") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPWaterBackUpAndSumpOverflowLocation") ){
			this.BOPLocation.setPremium(MathHelper.getDoubleValue(this.BOPLocation.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void FungiExcessCovRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPLocation.getSeparateAnnualAggregateLimit().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLocation.setFungiExcessCovRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiExcessLimitRate",String.valueOf( "Y")))));
		}
	  
	}
	public void totAmountInsuranceTemp_1 ()  {
	  this.BOPLocation.setTotAmountInsuranceTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure") ){
			this.BOPLocation.setTotAmountInsuranceTemp_1(MathHelper.getIntegerValue(this.BOPLocation.getTotAmountInsuranceTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"CombinedLimit")))));
		}

	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPLocation.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../GeneralLiabilityLCM"))));

	  
	}
	public void EmployeeDishtyLimit ()  {
	  this.BOPLocation.setEmployeeDishtyLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLocation,"../BOPEmployeeDishtyCoverage/dsLimit"))));

	  
	}
	public void ProcessPremium2_CommonRatingSub1 ()  {
	  
	State();
	
	ComputerFraudLimit();
	
	EmployeeDishtyLimit();
	
	GeneralLiabilityLCM();
	
	CommercialPropertyLCM();
	
	CrimeLCM();
	
	InlandMarineLCM();
	
	BoilerMachineryLCM();
	
	LCM();
	
	  
	}
	public void ComputerFraudLimit ()  {
	  this.BOPLocation.setComputerFraudLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLocation,"../BOPComputerFraudFundsTransferFraudCoverage/dsLimit"))));

	  
	}
	
	
	
	
	


	
}