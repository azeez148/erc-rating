package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremises;
import com.nest.res.bop.domain.BOPFineArts;
import com.nest.res.bop.domain.BOPEquipmentBreakdownProtectionCoverage;
import com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayee;
import com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmt;
import com.nest.res.bop.domain.BOPLocationMoneySecuritiesOffPremCoverage;
import com.nest.res.bop.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability;
import com.nest.res.bop.domain.BOPLocationFireDeptServiceCoverage;
import com.nest.res.bop.domain.BOPWaterBackUpAndSumpOverflowLocation;
import com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment;
import com.nest.res.bop.domain.BOPFloodCov;
import com.nest.res.bop.domain.BOPApartmentBuildings;
import com.nest.res.bop.domain.BOPRestaurants;
import com.nest.res.bop.domain.BOPApartmentBuildingsTenantsAutos;
import com.nest.res.bop.domain.BOPAddlInsdGrantorOfFranchiseEndorsement;
import com.nest.res.bop.domain.BOPLocationMoneySecuritiesOnPremCoverage;
import com.nest.res.bop.domain.BOPLocationOutdoorSignsCoverage;
import com.nest.res.bop.domain.BOPStructure;
import com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrs;

public class BOPLocation  {

	
	
	
	private List<BOPAddlInsdManagersLessorsPremises> BOPAddlInsdManagersLessorsPremisesList;
	private com.nest.res.bop.rules.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocationRule;
	private com.nest.res.bop.rules.BOPFloodCov BOPFloodCovRule;
	private com.nest.res.bop.rules.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverageRule;
	private com.nest.res.bop.rules.BOPApartmentBuildings BOPApartmentBuildingsRule;
	private List<BOPFineArts> BOPFineArtsList;
	private com.nest.res.bop.rules.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverageRule;
	private com.nest.res.bop.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentRule;
	private com.nest.res.bop.rules.BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutosRule;
	private List<BOPEquipmentBreakdownProtectionCoverage> BOPEquipmentBreakdownProtectionCoverageList;
	private com.nest.res.bop.rules.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayeeRule;
	private List<BOPLossRentalValueLandlordDesignatedPayee> BOPLossRentalValueLandlordDesignatedPayeeList;
	private com.nest.res.bop.rules.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverageRule;
	private com.nest.res.bop.rules.BOPRestaurants BOPRestaurantsRule;
	private com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrsRule;
	private List<BOPAddlInsdLessorsLeasedEquipmt> BOPAddlInsdLessorsLeasedEquipmtList;
	private com.nest.res.bop.domain.BOPLocation BOPLocation;
	private com.nest.res.bop.rules.BOPStructure BOPStructureRule;
	private List<BOPLocationMoneySecuritiesOffPremCoverage> BOPLocationMoneySecuritiesOffPremCoverageList;
	private List<BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability> BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList;
	private List<BOPLocationFireDeptServiceCoverage> BOPLocationFireDeptServiceCoverageList;
	private List<BOPWaterBackUpAndSumpOverflowLocation> BOPWaterBackUpAndSumpOverflowLocationList;
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList;
	private List<BOPFloodCov> BOPFloodCovList;
	private com.nest.res.bop.rules.BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsementRule;
	private List<BOPApartmentBuildings> BOPApartmentBuildingsList;
	private com.nest.res.bop.rules.BOPFineArts BOPFineArtsRule;
	private List<BOPRestaurants> BOPRestaurantsList;
	private List<BOPApartmentBuildingsTenantsAutos> BOPApartmentBuildingsTenantsAutosList;
	private com.nest.res.bop.rules.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverageRule;
	private List<BOPAddlInsdGrantorOfFranchiseEndorsement> BOPAddlInsdGrantorOfFranchiseEndorsementList;
	private com.nest.res.bop.rules.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverageRule;
	private List<BOPLocationMoneySecuritiesOnPremCoverage> BOPLocationMoneySecuritiesOnPremCoverageList;
	private List<BOPLocationOutdoorSignsCoverage> BOPLocationOutdoorSignsCoverageList;
	private List<BOPStructure> BOPStructureList;
	private com.nest.res.bop.rules.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremisesRule;
	private com.nest.res.bop.rules.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmtRule;
	private List<BOPAddlInsdOwnersLesseesContrctrs> BOPAddlInsdOwnersLesseesContrctrsList;
	private com.nest.res.bop.rules.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityRule;
	
	
	
	public void ProcessPremium2 () throws LookupException,NumberFormatException,ParseException {
	  
	ProcessPremium2_CommonRatingSub1();
	
	if(null != BOPAddlInsdGrantorOfFranchiseEndorsementList){
		for(BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsement:BOPAddlInsdGrantorOfFranchiseEndorsementList){
			BOPAddlInsdGrantorOfFranchiseEndorsementRule = new com.nest.res.bop.rules.BOPAddlInsdGrantorOfFranchiseEndorsement(BOPAddlInsdGrantorOfFranchiseEndorsement);
			BOPAddlInsdGrantorOfFranchiseEndorsementRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdLessorsLeasedEquipmtList){
		for(BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt:BOPAddlInsdLessorsLeasedEquipmtList){
			BOPAddlInsdLessorsLeasedEquipmtRule = new com.nest.res.bop.rules.BOPAddlInsdLessorsLeasedEquipmt(BOPAddlInsdLessorsLeasedEquipmt);
			BOPAddlInsdLessorsLeasedEquipmtRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdManagersLessorsPremisesList){
		for(BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises:BOPAddlInsdManagersLessorsPremisesList){
			BOPAddlInsdManagersLessorsPremisesRule = new com.nest.res.bop.rules.BOPAddlInsdManagersLessorsPremises(BOPAddlInsdManagersLessorsPremises);
			BOPAddlInsdManagersLessorsPremisesRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdOwnersLesseesContrctrsList){
		for(BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs:BOPAddlInsdOwnersLesseesContrctrsList){
			BOPAddlInsdOwnersLesseesContrctrsRule = new com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContrctrs(BOPAddlInsdOwnersLesseesContrctrs);
			BOPAddlInsdOwnersLesseesContrctrsRule.ProcessPremium1();

		}
	}
	if(null != BOPApartmentBuildingsList){
		for(BOPApartmentBuildings BOPApartmentBuildings:BOPApartmentBuildingsList){
			BOPApartmentBuildingsRule = new com.nest.res.bop.rules.BOPApartmentBuildings(BOPApartmentBuildings);
			BOPApartmentBuildingsRule.ProcessPremium1();

		}
	}
	if(null != BOPApartmentBuildingsTenantsAutosList){
		for(BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutos:BOPApartmentBuildingsTenantsAutosList){
			BOPApartmentBuildingsTenantsAutosRule = new com.nest.res.bop.rules.BOPApartmentBuildingsTenantsAutos(BOPApartmentBuildingsTenantsAutos);
			BOPApartmentBuildingsTenantsAutosRule.CommonRating1();

		}
	}
	if(null != BOPEquipmentBreakdownProtectionCoverageList){
		for(BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage:BOPEquipmentBreakdownProtectionCoverageList){
			BOPEquipmentBreakdownProtectionCoverageRule = new com.nest.res.bop.rules.BOPEquipmentBreakdownProtectionCoverage(BOPEquipmentBreakdownProtectionCoverage);
			BOPEquipmentBreakdownProtectionCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPFineArtsList){
		for(BOPFineArts BOPFineArts:BOPFineArtsList){
			BOPFineArtsRule = new com.nest.res.bop.rules.BOPFineArts(BOPFineArts);
			BOPFineArtsRule.ProcessPremium1();

		}
	}
	if(null != BOPFloodCovList){
		for(BOPFloodCov BOPFloodCov:BOPFloodCovList){
			BOPFloodCovRule = new com.nest.res.bop.rules.BOPFloodCov(BOPFloodCov);
			BOPFloodCovRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationFireDeptServiceCoverageList){
		for(BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage:BOPLocationFireDeptServiceCoverageList){
			BOPLocationFireDeptServiceCoverageRule = new com.nest.res.bop.rules.BOPLocationFireDeptServiceCoverage(BOPLocationFireDeptServiceCoverage);
			BOPLocationFireDeptServiceCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationOutdoorSignsCoverageList){
		for(BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage:BOPLocationOutdoorSignsCoverageList){
			BOPLocationOutdoorSignsCoverageRule = new com.nest.res.bop.rules.BOPLocationOutdoorSignsCoverage(BOPLocationOutdoorSignsCoverage);
			BOPLocationOutdoorSignsCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLossRentalValueLandlordDesignatedPayeeList){
		for(BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee:BOPLossRentalValueLandlordDesignatedPayeeList){
			BOPLossRentalValueLandlordDesignatedPayeeRule = new com.nest.res.bop.rules.BOPLossRentalValueLandlordDesignatedPayee(BOPLossRentalValueLandlordDesignatedPayee);
			BOPLossRentalValueLandlordDesignatedPayeeRule.ProcessPremium1();

		}
	}
	if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList){
		for(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment:BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList){
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentRule = new com.nest.res.bop.rules.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment);
			BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentRule.ProcessPremium1();

		}
	}
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium2();

		}
	}
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium3();

		}
	}
	ProcessPremium2_CommonRatingSub2();
	
	if(null != BOPLocationMoneySecuritiesOffPremCoverageList){
		for(BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage:BOPLocationMoneySecuritiesOffPremCoverageList){
			BOPLocationMoneySecuritiesOffPremCoverageRule = new com.nest.res.bop.rules.BOPLocationMoneySecuritiesOffPremCoverage(BOPLocationMoneySecuritiesOffPremCoverage);
			BOPLocationMoneySecuritiesOffPremCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationMoneySecuritiesOnPremCoverageList){
		for(BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage:BOPLocationMoneySecuritiesOnPremCoverageList){
			BOPLocationMoneySecuritiesOnPremCoverageRule = new com.nest.res.bop.rules.BOPLocationMoneySecuritiesOnPremCoverage(BOPLocationMoneySecuritiesOnPremCoverage);
			BOPLocationMoneySecuritiesOnPremCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPWaterBackUpAndSumpOverflowLocationList){
		for(BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation:BOPWaterBackUpAndSumpOverflowLocationList){
			BOPWaterBackUpAndSumpOverflowLocationRule = new com.nest.res.bop.rules.BOPWaterBackUpAndSumpOverflowLocation(BOPWaterBackUpAndSumpOverflowLocation);
			BOPWaterBackUpAndSumpOverflowLocationRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsList){
		for(BOPRestaurants BOPRestaurants:BOPRestaurantsList){
			BOPRestaurantsRule = new com.nest.res.bop.rules.BOPRestaurants(BOPRestaurants);
			BOPRestaurantsRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList){
		for(BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability:BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList){
			BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityRule = new com.nest.res.bop.rules.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability(BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability);
			BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityRule.CommonRating1();

		}
	}
	  
	}
	public  BOPLocation (com.nest.res.bop.domain.BOPLocation BOPLocation)  {
	  this.BOPLocation = BOPLocation;
this.BOPAddlInsdManagersLessorsPremisesList = BOPLocation.getBOPAddlInsdManagersLessorsPremises();
this.BOPFineArtsList = BOPLocation.getBOPFineArts();
this.BOPEquipmentBreakdownProtectionCoverageList = BOPLocation.getBOPEquipmentBreakdownProtectionCoverage();
this.BOPLossRentalValueLandlordDesignatedPayeeList = BOPLocation.getBOPLossRentalValueLandlordDesignatedPayee();
this.BOPAddlInsdLessorsLeasedEquipmtList = BOPLocation.getBOPAddlInsdLessorsLeasedEquipmt();
this.BOPLocationMoneySecuritiesOffPremCoverageList = BOPLocation.getBOPLocationMoneySecuritiesOffPremCoverage();
this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList = BOPLocation.getBOPRestaurantsLossOrDamageToCustomersAutosLegalLiability();
this.BOPLocationFireDeptServiceCoverageList = BOPLocation.getBOPLocationFireDeptServiceCoverage();
this.BOPWaterBackUpAndSumpOverflowLocationList = BOPLocation.getBOPWaterBackUpAndSumpOverflowLocation();
this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList = BOPLocation.getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment();
this.BOPFloodCovList = BOPLocation.getBOPFloodCov();
this.BOPApartmentBuildingsList = BOPLocation.getBOPApartmentBuildings();
this.BOPRestaurantsList = BOPLocation.getBOPRestaurants();
this.BOPApartmentBuildingsTenantsAutosList = BOPLocation.getBOPApartmentBuildingsTenantsAutos();
this.BOPAddlInsdGrantorOfFranchiseEndorsementList = BOPLocation.getBOPAddlInsdGrantorOfFranchiseEndorsement();
this.BOPLocationMoneySecuritiesOnPremCoverageList = BOPLocation.getBOPLocationMoneySecuritiesOnPremCoverage();
this.BOPLocationOutdoorSignsCoverageList = BOPLocation.getBOPLocationOutdoorSignsCoverage();
this.BOPStructureList = BOPLocation.getBOPStructure();
this.BOPAddlInsdOwnersLesseesContrctrsList = BOPLocation.getBOPAddlInsdOwnersLesseesContrctrs();

	  
	}
	public void InlandMarineLCM ()  {
	  this.BOPLocation.setInlandMarineLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../InlandMarineLCM"))));

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAddlInsdManagersLessorsPremisesList != null && this.BOPAddlInsdManagersLessorsPremisesList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdManagersLessorsPremises BOPAddlInsdManagersLessorsPremises : BOPAddlInsdManagersLessorsPremisesList) {
				finalPremium = finalPremium + BOPAddlInsdManagersLessorsPremises.getPremium();
			}
		}
		if(this.BOPFineArtsList != null && this.BOPFineArtsList.size() > 0){
			for(com.nest.res.bop.domain.BOPFineArts BOPFineArts : BOPFineArtsList) {
				finalPremium = finalPremium + BOPFineArts.getPremium();
			}
		}
		if(this.BOPEquipmentBreakdownProtectionCoverageList != null && this.BOPEquipmentBreakdownProtectionCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPEquipmentBreakdownProtectionCoverage BOPEquipmentBreakdownProtectionCoverage : BOPEquipmentBreakdownProtectionCoverageList) {
				finalPremium = finalPremium + BOPEquipmentBreakdownProtectionCoverage.getPremium();
			}
		}
		if(this.BOPLossRentalValueLandlordDesignatedPayeeList != null && this.BOPLossRentalValueLandlordDesignatedPayeeList.size() > 0){
			for(com.nest.res.bop.domain.BOPLossRentalValueLandlordDesignatedPayee BOPLossRentalValueLandlordDesignatedPayee : BOPLossRentalValueLandlordDesignatedPayeeList) {
				finalPremium = finalPremium + BOPLossRentalValueLandlordDesignatedPayee.getPremium();
			}
		}
		if(this.BOPAddlInsdLessorsLeasedEquipmtList != null && this.BOPAddlInsdLessorsLeasedEquipmtList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdLessorsLeasedEquipmt BOPAddlInsdLessorsLeasedEquipmt : BOPAddlInsdLessorsLeasedEquipmtList) {
				finalPremium = finalPremium + BOPAddlInsdLessorsLeasedEquipmt.getPremium();
			}
		}
		if(this.BOPLocationMoneySecuritiesOffPremCoverageList != null && this.BOPLocationMoneySecuritiesOffPremCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPLocationMoneySecuritiesOffPremCoverage BOPLocationMoneySecuritiesOffPremCoverage : BOPLocationMoneySecuritiesOffPremCoverageList) {
				finalPremium = finalPremium + BOPLocationMoneySecuritiesOffPremCoverage.getPremium();
			}
		}
		if(this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList != null && this.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability : BOPRestaurantsLossOrDamageToCustomersAutosLegalLiabilityList) {
				finalPremium = finalPremium + BOPRestaurantsLossOrDamageToCustomersAutosLegalLiability.getPremium();
			}
		}
		if(this.BOPLocationFireDeptServiceCoverageList != null && this.BOPLocationFireDeptServiceCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPLocationFireDeptServiceCoverage BOPLocationFireDeptServiceCoverage : BOPLocationFireDeptServiceCoverageList) {
				finalPremium = finalPremium + BOPLocationFireDeptServiceCoverage.getPremium();
			}
		}
		if(this.BOPWaterBackUpAndSumpOverflowLocationList != null && this.BOPWaterBackUpAndSumpOverflowLocationList.size() > 0){
			for(com.nest.res.bop.domain.BOPWaterBackUpAndSumpOverflowLocation BOPWaterBackUpAndSumpOverflowLocation : BOPWaterBackUpAndSumpOverflowLocationList) {
				finalPremium = finalPremium + BOPWaterBackUpAndSumpOverflowLocation.getPremium();
			}
		}
		if(this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList != null && this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList.size() > 0){
			for(com.nest.res.bop.domain.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment : BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentList) {
				finalPremium = finalPremium + BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment.getPremium();
			}
		}
		if(this.BOPFloodCovList != null && this.BOPFloodCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPFloodCov BOPFloodCov : BOPFloodCovList) {
				finalPremium = finalPremium + BOPFloodCov.getPremium();
			}
		}
		if(this.BOPApartmentBuildingsList != null && this.BOPApartmentBuildingsList.size() > 0){
			for(com.nest.res.bop.domain.BOPApartmentBuildings BOPApartmentBuildings : BOPApartmentBuildingsList) {
				finalPremium = finalPremium + BOPApartmentBuildings.getPremium();
			}
		}
		if(this.BOPRestaurantsList != null && this.BOPRestaurantsList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurants BOPRestaurants : BOPRestaurantsList) {
				finalPremium = finalPremium + BOPRestaurants.getPremium();
			}
		}
		if(this.BOPApartmentBuildingsTenantsAutosList != null && this.BOPApartmentBuildingsTenantsAutosList.size() > 0){
			for(com.nest.res.bop.domain.BOPApartmentBuildingsTenantsAutos BOPApartmentBuildingsTenantsAutos : BOPApartmentBuildingsTenantsAutosList) {
				finalPremium = finalPremium + BOPApartmentBuildingsTenantsAutos.getPremium();
			}
		}
		if(this.BOPAddlInsdGrantorOfFranchiseEndorsementList != null && this.BOPAddlInsdGrantorOfFranchiseEndorsementList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdGrantorOfFranchiseEndorsement BOPAddlInsdGrantorOfFranchiseEndorsement : BOPAddlInsdGrantorOfFranchiseEndorsementList) {
				finalPremium = finalPremium + BOPAddlInsdGrantorOfFranchiseEndorsement.getPremium();
			}
		}
		if(this.BOPLocationMoneySecuritiesOnPremCoverageList != null && this.BOPLocationMoneySecuritiesOnPremCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPLocationMoneySecuritiesOnPremCoverage BOPLocationMoneySecuritiesOnPremCoverage : BOPLocationMoneySecuritiesOnPremCoverageList) {
				finalPremium = finalPremium + BOPLocationMoneySecuritiesOnPremCoverage.getPremium();
			}
		}
		if(this.BOPLocationOutdoorSignsCoverageList != null && this.BOPLocationOutdoorSignsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPLocationOutdoorSignsCoverage BOPLocationOutdoorSignsCoverage : BOPLocationOutdoorSignsCoverageList) {
				finalPremium = finalPremium + BOPLocationOutdoorSignsCoverage.getPremium();
			}
		}
		if(this.BOPStructureList != null && this.BOPStructureList.size() > 0){
			for(com.nest.res.bop.domain.BOPStructure BOPStructure : BOPStructureList) {
				finalPremium = finalPremium + BOPStructure.getPremium();
			}
		}
		if(this.BOPAddlInsdOwnersLesseesContrctrsList != null && this.BOPAddlInsdOwnersLesseesContrctrsList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContrctrs BOPAddlInsdOwnersLesseesContrctrs : BOPAddlInsdOwnersLesseesContrctrsList) {
				finalPremium = finalPremium + BOPAddlInsdOwnersLesseesContrctrs.getPremium();
			}
		}
this.BOPLocation.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium3 ()  {
	  
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium4();

		}
	}
	setPremium();
	  
	}
	public void DedFactor ()  {
	  
		if(this.BOPLocation.getWindHailFactor() != (double)1.0){
			this.BOPLocation.setDedFactor(this.BOPLocation.getWindHailFactor());
		}
		else{
			this.BOPLocation.setDedFactor(this.BOPLocation.getOptnlDedFactor());
		}
	  
	}
	public void EmployeeDishtyLimit ()  {
	  this.BOPLocation.setEmployeeDishtyLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLocation,"../BOPEmployeeDishtyCoverage/dsLimit"))));

	  
	}
	public void CommercialPropertyLCM ()  {
	  this.BOPLocation.setCommercialPropertyLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../CommercialPropertyLCM"))));

	  
	}
	public void BoilerMachineryLCM ()  {
	  this.BOPLocation.setBoilerMachineryLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../BoilerMachineryLCM"))));

	  
	}
	public void OptnlDedFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPLocation.getOptionalDeductible().equals((String)"250")){
			this.BOPLocation.setOptnlDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("Optnl250FixedDedFactor",String.valueOf( "Y"))));
		}
		else{
		if(!this.BOPLocation.getOptionalDeductible().equals((String)"") || this.BOPLocation.getTotAmountInsurance() == (int)0.0){
			this.BOPLocation.setOptnlDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",String.valueOf(BOPLocation.getOptionalDeductible()),String.valueOf(BOPLocation.getTotAmountInsurance()))));
		}
		else{
			this.BOPLocation.setOptnlDedFactor((double)0.0);
		}
		}
	  
	}
	public void RatingPropertyType ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"LocationMoneyFlag"))).equals((String)"Yes")){
			this.BOPLocation.setRatingPropertyType((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassPropertyType"))));
		}		}

	  
	}
	public void FungiExcessLimitPremium ()  {
	  
		if(this.BOPLocation.getSeparateAnnualAggregateLimit().equals((String)"Yes")){
			this.BOPLocation.setFungiExcessLimitPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPLocation.getFungiExcessCovRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../LCM")))) * (((double)this.BOPLocation.getFungiLimit() - (double)15000.0) / (double)100.0)));
		}
		else{
			this.BOPLocation.setFungiExcessLimitPremium((double)0.0);
		}
	  
	}
	public void ComputerFraudLimit ()  {
	  this.BOPLocation.setComputerFraudLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLocation,"../BOPComputerFraudFundsTransferFraudCoverage/dsLimit"))));

	  
	}
	public void LCM ()  {
	  this.BOPLocation.setLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../LCM"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub2 () throws LookupException,NumberFormatException {
	  
	TotAmountInsurance();
	
	WindHailFactor();
	
	OptnlDedFactor();
	
	DedFactor();
	
	EmployeeDishtyNoChargeLocation();
	
	TheftOfClientsPropertyEmployeeDishtyApplyCount();
	
	  
	}
	public void TotAmountInsurance ()  {
	  this.BOPLocation.setTotAmountInsurance((int)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure") ){
			this.BOPLocation.setTotAmountInsurance(this.BOPLocation.getTotAmountInsurance()+this.BOPLocation.getTotAmountInsurance() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"CombinedLimit"))));
		}

	  
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
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	FungiExcessCovRate();
	
	FungiExcessLimitPremium();
	
	TotAmountInsurance();
	
	  
	}
	public void WindHailFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLocation.getWindHailDeductible().equals((String)"Not Applicable")){
		if(!this.BOPLocation.getOptionalDeductible().equals((String)"") && this.BOPLocation.getTotAmountInsurance() != (int)0.0 && !this.BOPLocation.getWindHailDeductible().equals((String)"")){
			this.BOPLocation.setWindHailFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("WindHailDedFactorWithLOI",String.valueOf(BOPLocation.getOptionalDeductible()),String.valueOf(BOPLocation.getTotAmountInsurance()),String.valueOf(BOPLocation.getWindHailDeductible()))));
		}
		else{
			this.BOPLocation.setWindHailFactor((double)0.0);
		}
		}
		else{
			this.BOPLocation.setWindHailFactor((double)1.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPStructureList){
		for(BOPStructure BOPStructure:BOPStructureList){
			BOPStructureRule = new com.nest.res.bop.rules.BOPStructure(BOPStructure);
			BOPStructureRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub2();
	
	  
	}
	public void ProcessPremium2_CommonRatingSub2 ()  {
	  
	RatingPropertyType();
	
	  
	}
	public void TheftOfClientsPropertyEmployeeDishtyApplyCount ()  {
	  
		if(this.BOPLocation.getEmployeeDishtyApply().equals((String)"Yes")){
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCount((int)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure/BOPClassification") ){

		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Dental Laboratories") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Copying and Duplicating Stores") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Mailing or Addressing Companies - Direct Mailing Companies") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Mailing or Addressing Companies - Mailing List Compiling Services/Mailing List Publishers")){
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCount(this.BOPLocation.getTheftOfClientsPropertyEmployeeDishtyApplyCount() + (int)1.0);
		}		}

		}
		else{
			this.BOPLocation.setTheftOfClientsPropertyEmployeeDishtyApplyCount((int)0.0);
		}
	  
	}
	public void CrimeLCM ()  {
	  this.BOPLocation.setCrimeLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../CrimeLCM"))));

	  
	}
	public void EmployeeDishtyNoChargeLocation ()  {
	  
		if(this.BOPLocation.getEmployeeDishtyApply().equals((String)"Yes")){
		for( Policy policy : XpathNode.selectNodes(BOPLocation,"BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Dental Laboratories") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Copying and Duplicating Stores") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Mailing or Addressing Companies - Direct Mailing Companies") || (MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"ClassDescription"))).equals((String)"Mailing or Addressing Companies - Mailing List Compiling Services/Mailing List Publishers")){
			this.BOPLocation.setEmployeeDishtyNoChargeLocation((String)"Yes");
		}		}

		}
		else{
			this.BOPLocation.setEmployeeDishtyNoChargeLocation((String)"No");
		}
	  
	}
	public void GeneralLiabilityLCM ()  {
	  this.BOPLocation.setGeneralLiabilityLCM((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLocation,"../GeneralLiabilityLCM"))));

	  
	}
	public void FungiExcessCovRate () throws LookupException,NumberFormatException {
	  
		if(this.BOPLocation.getSeparateAnnualAggregateLimit().equals((String)"Yes")){
			this.BOPLocation.setFungiExcessCovRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FungiExcessLimitRate",String.valueOf( "Y"))));
		}
	  
	}
	public void State ()  {
	  this.BOPLocation.setState((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLocation,"../State"))));

	  
	}
	
	
	
	
	


	
}