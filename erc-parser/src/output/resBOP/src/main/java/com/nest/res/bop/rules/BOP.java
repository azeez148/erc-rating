package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPComputerFraudFundsTransferFraudCoverage;
import com.nest.res.bop.domain.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition;
import com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract;
import com.nest.res.bop.domain.BOPLimitedFungiBacteriaCov;
import com.nest.res.bop.domain.BOPLimitationsOfCovForCertfdActsTerrsm;
import com.nest.res.bop.domain.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage;
import com.nest.res.bop.domain.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments;
import com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptions;
import com.nest.res.bop.domain.BOPEmploymentRelatedPracticesLiabilityCov;
import com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempException;
import com.nest.res.bop.domain.BOPBeautySalonsProflLiab;
import com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions;
import com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBldgCoverage;
import com.nest.res.bop.domain.BOPExclusionUnmannedAircraft;
import com.nest.res.bop.domain.BOPExclProductsCompletedOpsHzd;
import com.nest.res.bop.domain.BOPTotPolltnExcl;
import com.nest.res.bop.domain.BOPCannabisLiabilityExclusion;
import com.nest.res.bop.domain.BOPAddlLiabExposuresCoverage;
import com.nest.res.bop.domain.BOPDesignatedLocsGenlAggLimit;
import com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptn;
import com.nest.res.bop.domain.BOPAbuseMolestationExcl;
import com.nest.res.bop.domain.BOPDiscretionaryPayrollExpense;
import com.nest.res.bop.domain.BOPFungiBacteriaExclusionLiability;
import com.nest.res.bop.domain.BOPPharmacists;
import com.nest.res.bop.domain.BOPHiredNonOwnedAuto;
import com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsement;
import com.nest.res.bop.domain.BOPExclDesignatedWork;
import com.nest.res.bop.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps;
import com.nest.res.bop.domain.BOPEmpBenefitsLiabCov;
import com.nest.res.bop.domain.BOPExtddReportingPeriodEmpBenefitsLiabCov;
import com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtCov;
import com.nest.res.bop.domain.BOPElectronicDataCoverage;
import com.nest.res.bop.domain.BOPBarbersBeauticiansProflLiab;
import com.nest.res.bop.domain.BOPExclPersonalAdvertisingInjury;
import com.nest.res.bop.domain.BOPForgeryAlterationCoverage;
import com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrg;
import com.nest.res.bop.domain.BOPLiquorLiab;
import com.nest.res.bop.domain.BOPEmployeeDishonestyNamedEmployees;
import com.nest.res.bop.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft;
import com.nest.res.bop.domain.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees;
import com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCov;
import com.nest.res.bop.domain.BOPPhotographyMakeupAndHairstyling;
import com.nest.res.bop.domain.BOPExclDesignatedProducts;
import com.nest.res.bop.domain.BOPTheftOfClientsProperty;
import com.nest.res.bop.domain.BOPLocation;
import com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBldgCoverage;
import com.nest.res.bop.domain.BOPCannabisPropertyExclusionWithHempException;
import com.nest.res.bop.domain.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems;
import com.nest.res.bop.domain.BOPElectronicCommerce;
import com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForDesignatedPollutants;
import com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage;
import com.nest.res.bop.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf;
import com.nest.res.bop.domain.BOPAmendmentAggLimitsOfInsPerProject;
import com.nest.res.bop.domain.BOPCannabisPropertyExclusion;
import com.nest.res.bop.domain.BOPIDFraudExpenseCov;
import com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage;
import com.nest.res.bop.domain.BOPLimitedPolltnLiabExt;
import com.nest.res.bop.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly;
import com.nest.res.bop.domain.BOPAmendmentInsuredContractDefinition;
import com.nest.res.bop.domain.BOPCapLossesFromCertfdActsTerrsm;
import com.nest.res.bop.domain.BOPIRPM;
import com.nest.res.bop.domain.BOPCoverageInjuryLeasedWorkers;
import com.nest.res.bop.domain.BOPAbuseOrMolestationExclSpecdSrvcs;
import com.nest.res.bop.domain.BOPExclExtrInsulationAndFinishingSys;
import com.nest.res.bop.domain.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn;
import com.nest.res.bop.domain.BOPApartmentBuildingsTotalTenantsAutos;
import com.nest.res.bop.domain.BOPRestaurantsTotalCustomersAutos;
import com.nest.res.bop.domain.BOPPhotography;
import com.nest.res.bop.domain.BOPEmployeeDishtyCoverage;
import com.nest.res.bop.domain.BOPTerrorismCoverage;
import com.nest.res.bop.domain.BOPInterruptionComputerOpsCoverage;
import com.nest.res.bop.domain.BOPFuneralDirectorsProflLiab;
import com.nest.res.bop.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded;
import com.nest.res.bop.domain.BOPLiquorLiabCov;
import com.nest.res.bop.domain.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers;
import com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract;
import com.nest.res.bop.domain.BOPVeterinariansProflLiab;
import com.nest.res.bop.domain.BOPAddlInsdVendors;
import com.nest.res.bop.domain.BOPDesignatedConstructionProjectsGenlAggLimit;
import com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForShortTermEvent;
import com.nest.res.bop.domain.BOPPrintersErrorsOmissions;
import com.nest.res.bop.domain.BOPExclCertfdActsTerrsmCovFireLosses;
import com.nest.res.bop.domain.BOPCommunicableDiseaseExclusion;
import com.nest.res.bop.domain.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage;
import com.nest.res.bop.domain.BOPNewlyAcquiredOrganizations;
import com.nest.res.bop.domain.BOPEmploymentRelatedPracticesExcl;
import com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd;
import com.nest.res.bop.domain.BOPDisclosurePursuantToTRIA2002;
import com.nest.res.bop.domain.BOPOpticalHearingAid;
import com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovLiability;
import com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps;
import com.nest.res.bop.domain.BOPSnowPlowProdsCompldOpsHzdCov;
import com.nest.res.bop.domain.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses;
import com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriod;
import com.nest.res.bop.domain.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab;

public class BOP  {

	
	
	
	private com.nest.res.bop.rules.BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcsRule;
	private List<BOPComputerFraudFundsTransferFraudCoverage> BOPComputerFraudFundsTransferFraudCoverageList;
	private com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCovRule;
	private List<BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition> BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList;
	private com.nest.res.bop.rules.BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverageRule;
	private List<BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract> BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList;
	private List<BOPLimitedFungiBacteriaCov> BOPLimitedFungiBacteriaCovList;
	private List<BOPLimitationsOfCovForCertfdActsTerrsm> BOPLimitationsOfCovForCertfdActsTerrsmList;
	private com.nest.res.bop.rules.BOPOpticalHearingAid BOPOpticalHearingAidRule;
	private com.nest.res.bop.rules.BOPPhotography BOPPhotographyRule;
	private com.nest.res.bop.rules.BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutosRule;
	private List<BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage> BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList;
	private com.nest.res.bop.rules.BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutosRule;
	private List<BOPLiquorLiabCovBringYourOwnAlcoholEstablishments> BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList;
	private List<BOPY2KComputerRelatedProblemsLimitedCovOptions> BOPY2KComputerRelatedProblemsLimitedCovOptionsList;
	private List<BOPEmploymentRelatedPracticesLiabilityCov> BOPEmploymentRelatedPracticesLiabilityCovList;
	private com.nest.res.bop.rules.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnRule;
	private com.nest.res.bop.rules.BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverageRule;
	private List<BOPCannabisLiabilityExclusionWithHempException> BOPCannabisLiabilityExclusionWithHempExceptionList;
	private List<BOPBeautySalonsProflLiab> BOPBeautySalonsProflLiabList;
	private List<BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions> BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList;
	private List<BOPBusnIncomeOrdinaryPayrollBldgCoverage> BOPBusnIncomeOrdinaryPayrollBldgCoverageList;
	private List<BOPExclusionUnmannedAircraft> BOPExclusionUnmannedAircraftList;
	private com.nest.res.bop.rules.BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverageRule;
	private com.nest.res.bop.rules.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedRule;
	private List<BOPExclProductsCompletedOpsHzd> BOPExclProductsCompletedOpsHzdList;
	private com.nest.res.bop.rules.BOPCannabisPropertyExclusion BOPCannabisPropertyExclusionRule;
	private com.nest.res.bop.rules.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesRule;
	private List<BOPTotPolltnExcl> BOPTotPolltnExclList;
	private List<BOPCannabisLiabilityExclusion> BOPCannabisLiabilityExclusionList;
	private List<BOPAddlLiabExposuresCoverage> BOPAddlLiabExposuresCoverageList;
	private com.nest.res.bop.rules.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsRule;
	private List<BOPDesignatedLocsGenlAggLimit> BOPDesignatedLocsGenlAggLimitList;
	private com.nest.res.bop.rules.BOPAddlInsdVendors BOPAddlInsdVendorsRule;
	private List<BOPAmendmentLiquorLiabExclExcptn> BOPAmendmentLiquorLiabExclExcptnList;
	private com.nest.res.bop.rules.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageRule;
	private List<BOPAbuseMolestationExcl> BOPAbuseMolestationExclList;
	private com.nest.res.bop.rules.BOPIDFraudExpenseCov BOPIDFraudExpenseCovRule;
	private List<BOPDiscretionaryPayrollExpense> BOPDiscretionaryPayrollExpenseList;
	private List<BOPFungiBacteriaExclusionLiability> BOPFungiBacteriaExclusionLiabilityList;
	private com.nest.res.bop.rules.BOPElectronicCommerce BOPElectronicCommerceRule;
	private List<BOPPharmacists> BOPPharmacistsList;
	private List<BOPHiredNonOwnedAuto> BOPHiredNonOwnedAutoList;
	private com.nest.res.bop.rules.BOPForgeryAlterationCoverage BOPForgeryAlterationCoverageRule;
	private List<BOPInformationSecurityProtectionEndorsement> BOPInformationSecurityProtectionEndorsementList;
	private com.nest.res.bop.rules.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyRule;
	private com.nest.res.bop.rules.BOPCoverageInjuryLeasedWorkers BOPCoverageInjuryLeasedWorkersRule;
	private List<BOPExclDesignatedWork> BOPExclDesignatedWorkList;
	private List<BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps> BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList;
	private List<BOPEmpBenefitsLiabCov> BOPEmpBenefitsLiabCovList;
	private List<BOPExtddReportingPeriodEmpBenefitsLiabCov> BOPExtddReportingPeriodEmpBenefitsLiabCovList;
	private List<BOPContrctrsInstalltnToolsAndEquipmtCov> BOPContrctrsInstalltnToolsAndEquipmtCovList;
	private com.nest.res.bop.rules.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraftRule;
	private com.nest.res.bop.rules.BOPElectronicDataCoverage BOPElectronicDataCoverageRule;
	private List<BOPElectronicDataCoverage> BOPElectronicDataCoverageList;
	private List<BOPBarbersBeauticiansProflLiab> BOPBarbersBeauticiansProflLiabList;
	private List<BOPExclPersonalAdvertisingInjury> BOPExclPersonalAdvertisingInjuryList;
	private com.nest.res.bop.rules.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdRule;
	private com.nest.res.bop.rules.BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExclRule;
	private com.nest.res.bop.rules.BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusionRule;
	private List<BOPForgeryAlterationCoverage> BOPForgeryAlterationCoverageList;
	private List<BOPAddlInsdDesignatedPersonOrg> BOPAddlInsdDesignatedPersonOrgList;
	private com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsRule;
	private com.nest.res.bop.rules.BOPTotPolltnExcl BOPTotPolltnExclRule;
	private com.nest.res.bop.rules.BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExtRule;
	private List<BOPLiquorLiab> BOPLiquorLiabList;
	private com.nest.res.bop.rules.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageRule;
	private com.nest.res.bop.rules.BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCovRule;
	private com.nest.res.bop.rules.BOPAbuseMolestationExcl BOPAbuseMolestationExclRule;
	private com.nest.res.bop.rules.BOPTerrorismCoverage BOPTerrorismCoverageRule;
	private com.nest.res.bop.rules.BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiabRule;
	private com.nest.res.bop.rules.BOPHiredNonOwnedAuto BOPHiredNonOwnedAutoRule;
	private com.nest.res.bop.rules.BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriodRule;
	private List<BOPEmployeeDishonestyNamedEmployees> BOPEmployeeDishonestyNamedEmployeesList;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraft> BOPLimitedCoverageForDesignatedUnmannedAircraftList;
	private com.nest.res.bop.rules.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiabRule;
	private List<BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees> BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList;
	private com.nest.res.bop.rules.BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverageRule;
	private com.nest.res.bop.rules.BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsmRule;
	private List<BOPY2KComputerRelatedProblemsExclSpecifiedCov> BOPY2KComputerRelatedProblemsExclSpecifiedCovList;
	private List<BOPPhotographyMakeupAndHairstyling> BOPPhotographyMakeupAndHairstylingList;
	private com.nest.res.bop.rules.BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsmRule;
	private com.nest.res.bop.rules.BOPVeterinariansProflLiab BOPVeterinariansProflLiabRule;
	private com.nest.res.bop.rules.BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimitRule;
	private com.nest.res.bop.rules.BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEventRule;
	private com.nest.res.bop.rules.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyersRule;
	private List<BOPExclDesignatedProducts> BOPExclDesignatedProductsList;
	private List<BOPTheftOfClientsProperty> BOPTheftOfClientsPropertyList;
	private com.nest.res.bop.rules.BOPPrintersErrorsOmissions BOPPrintersErrorsOmissionsRule;
	private com.nest.res.bop.rules.BOPCommunicableDiseaseExclusion BOPCommunicableDiseaseExclusionRule;
	private List<BOPLocation> BOPLocationList;
	private com.nest.res.bop.rules.BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002Rule;
	private com.nest.res.bop.rules.BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptnRule;
	private com.nest.res.bop.rules.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsRule;
	private List<BOPBusnIncomeExtddPeriodBldgCoverage> BOPBusnIncomeExtddPeriodBldgCoverageList;
	private com.nest.res.bop.rules.BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempExceptionRule;
	private com.nest.res.bop.rules.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfRule;
	private com.nest.res.bop.rules.BOPIRPM BOPIRPMRule;
	private com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractRule;
	private List<BOPCannabisPropertyExclusionWithHempException> BOPCannabisPropertyExclusionWithHempExceptionList;
	private com.nest.res.bop.rules.BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinitionRule;
	private List<BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems> BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList;
	private List<BOPElectronicCommerce> BOPElectronicCommerceList;
	private List<BOPPolltnExclLimitedExcptnForDesignatedPollutants> BOPPolltnExclLimitedExcptnForDesignatedPollutantsList;
	private com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCovRule;
	private List<BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage> BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList;
	private List<BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf> BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList;
	private List<BOPAmendmentAggLimitsOfInsPerProject> BOPAmendmentAggLimitsOfInsPerProjectList;
	private com.nest.res.bop.rules.BOPDiscretionaryPayrollExpense BOPDiscretionaryPayrollExpenseRule;
	private List<BOPCannabisPropertyExclusion> BOPCannabisPropertyExclusionList;
	private List<BOPIDFraudExpenseCov> BOPIDFraudExpenseCovList;
	private com.nest.res.bop.rules.BOPNewlyAcquiredOrganizations BOPNewlyAcquiredOrganizationsRule;
	private List<BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage> BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList;
	private List<BOPLimitedPolltnLiabExt> BOPLimitedPolltnLiabExtList;
	private com.nest.res.bop.rules.BOPExclDesignatedWork BOPExclDesignatedWorkRule;
	private com.nest.res.bop.rules.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsRule;
	private List<BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly> BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList;
	private List<BOPAmendmentInsuredContractDefinition> BOPAmendmentInsuredContractDefinitionList;
	private List<BOPCapLossesFromCertfdActsTerrsm> BOPCapLossesFromCertfdActsTerrsmList;
	private List<BOPIRPM> BOPIRPMList;
	private List<BOPCoverageInjuryLeasedWorkers> BOPCoverageInjuryLeasedWorkersList;
	private com.nest.res.bop.domain.BOP BOP;
	private List<BOPAbuseOrMolestationExclSpecdSrvcs> BOPAbuseOrMolestationExclSpecdSrvcsList;
	private List<BOPExclExtrInsulationAndFinishingSys> BOPExclExtrInsulationAndFinishingSysList;
	private List<BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn> BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList;
	private List<BOPApartmentBuildingsTotalTenantsAutos> BOPApartmentBuildingsTotalTenantsAutosList;
	private com.nest.res.bop.rules.BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsementRule;
	private com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiabilityRule;
	private com.nest.res.bop.rules.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageRule;
	private List<BOPRestaurantsTotalCustomersAutos> BOPRestaurantsTotalCustomersAutosList;
	private List<BOPPhotography> BOPPhotographyList;
	private List<BOPEmployeeDishtyCoverage> BOPEmployeeDishtyCoverageList;
	private com.nest.res.bop.rules.BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverageRule;
	private com.nest.res.bop.rules.BOPLiquorLiab BOPLiquorLiabRule;
	private List<BOPTerrorismCoverage> BOPTerrorismCoverageList;
	private List<BOPInterruptionComputerOpsCoverage> BOPInterruptionComputerOpsCoverageList;
	private com.nest.res.bop.rules.BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLossesRule;
	private List<BOPFuneralDirectorsProflLiab> BOPFuneralDirectorsProflLiabList;
	private com.nest.res.bop.rules.BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimitRule;
	private com.nest.res.bop.rules.BOPBeautySalonsProflLiab BOPBeautySalonsProflLiabRule;
	private com.nest.res.bop.rules.BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiabRule;
	private com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptionsRule;
	private List<BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded> BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList;
	private List<BOPLiquorLiabCov> BOPLiquorLiabCovList;
	private com.nest.res.bop.rules.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageRule;
	private com.nest.res.bop.rules.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsRule;
	private List<BOPLmtdExclPersonalAndAdvertisingInjuryLawyers> BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList;
	private List<BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract> BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList;
	private com.nest.res.bop.rules.BOPTheftOfClientsProperty BOPTheftOfClientsPropertyRule;
	private com.nest.res.bop.rules.BOPPharmacists BOPPharmacistsRule;
	private com.nest.res.bop.rules.BOPPhotographyMakeupAndHairstyling BOPPhotographyMakeupAndHairstylingRule;
	private com.nest.res.bop.rules.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverageRule;
	private List<BOPVeterinariansProflLiab> BOPVeterinariansProflLiabList;
	private List<BOPAddlInsdVendors> BOPAddlInsdVendorsList;
	private List<BOPDesignatedConstructionProjectsGenlAggLimit> BOPDesignatedConstructionProjectsGenlAggLimitList;
	private com.nest.res.bop.rules.BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSysRule;
	private List<BOPPolltnExclLimitedExcptnForShortTermEvent> BOPPolltnExclLimitedExcptnForShortTermEventList;
	private com.nest.res.bop.rules.BOPLocation BOPLocationRule;
	private com.nest.res.bop.rules.BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiabilityRule;
	private com.nest.res.bop.rules.BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCovRule;
	private List<BOPPrintersErrorsOmissions> BOPPrintersErrorsOmissionsList;
	private com.nest.res.bop.rules.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionRule;
	private List<BOPExclCertfdActsTerrsmCovFireLosses> BOPExclCertfdActsTerrsmCovFireLossesList;
	private List<BOPCommunicableDiseaseExclusion> BOPCommunicableDiseaseExclusionList;
	private com.nest.res.bop.rules.BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCovRule;
	private com.nest.res.bop.rules.BOPLiquorLiabCov BOPLiquorLiabCovRule;
	private List<BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage> BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList;
	private com.nest.res.bop.rules.BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempExceptionRule;
	private com.nest.res.bop.rules.BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrgRule;
	private com.nest.res.bop.rules.BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCovRule;
	private List<BOPNewlyAcquiredOrganizations> BOPNewlyAcquiredOrganizationsList;
	private List<BOPEmploymentRelatedPracticesExcl> BOPEmploymentRelatedPracticesExclList;
	private com.nest.res.bop.rules.BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjuryRule;
	private List<BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd> BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList;
	private List<BOPDisclosurePursuantToTRIA2002> BOPDisclosurePursuantToTRIA2002List;
	private List<BOPOpticalHearingAid> BOPOpticalHearingAidList;
	private com.nest.res.bop.rules.BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutantsRule;
	private com.nest.res.bop.rules.BOPAmendmentAggLimitsOfInsPerProject BOPAmendmentAggLimitsOfInsPerProjectRule;
	private com.nest.res.bop.rules.BOPExclDesignatedProducts BOPExclDesignatedProductsRule;
	private com.nest.res.bop.rules.BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCovRule;
	private List<BOPLimitedFungiBacteriaCovLiability> BOPLimitedFungiBacteriaCovLiabilityList;
	private List<BOPAddlInsdOwnersLesseesOrContrctrsCompldOps> BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList;
	private com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractRule;
	private com.nest.res.bop.rules.BOPExclusionUnmannedAircraft BOPExclusionUnmannedAircraftRule;
	private List<BOPSnowPlowProdsCompldOpsHzdCov> BOPSnowPlowProdsCompldOpsHzdCovList;
	private com.nest.res.bop.rules.BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzdRule;
	private com.nest.res.bop.rules.BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployeesRule;
	private List<BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses> BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList;
	private com.nest.res.bop.rules.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesRule;
	private List<BOPBusnIncomeChangesTimePeriod> BOPBusnIncomeChangesTimePeriodList;
	private List<BOPCondosCoOpsAssocsDirectorsAndOfficersLiab> BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList;
	
	
	
	public void BoilerMachineryLCM () throws LookupException,NumberFormatException {
	  this.BOP.setBoilerMachineryLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BoilerMachineryLCM",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	State();
	
	IRPMFactor();
	
	GeneralLiabilityLCM();
	
	CommercialPropertyLCM();
	
	CrimeLCM();
	
	InlandMarineLCM();
	
	ProfessionalLiabilityLCM();
	
	BoilerMachineryLCM();
	
	CommercialAutoLCM();
	
	LCM();
	
	BusnIncomeOrdinaryPayrollFactor();
	
	BusnIncomeExtddPeriodFactor();
	
	  
	}
	public void CrimeLCM () throws LookupException,NumberFormatException {
	  this.BOP.setCrimeLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CrimeLCM",String.valueOf( "Y"))));

	  
	}
	public void LCM () throws LookupException,NumberFormatException {
	  this.BOP.setLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BOPLCM",String.valueOf( "Y"))));

	  
	}
	public void TotBusnPrsnlPropPremium ()  {
	  this.BOP.setTotBusnPrsnlPropPremium(this.BOP.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1());

		for( Policy policy : XpathNode.selectNodes(BOP,"BOPLocation/BOPStructure/BOPClassification/BOPClassificationBusnPrsnlPropCoverage") ){
			this.BOP.setTotBusnPrsnlPropPremium(this.BOP.getTotBusnPrsnlPropPremium()+this.BOP.getTotBusnPrsnlPropPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

	  
	}
	public void BusnIncomeExtddPeriodFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOP.getBusnIncomeExtddPeriodNumDays().equals((String)"60") && !this.BOP.getBusnIncomeExtddPeriodNumDays().equals((String)"")){
			this.BOP.setBusnIncomeExtddPeriodFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtddPeriodFactor",String.valueOf(BOP.getBusnIncomeExtddPeriodNumDays()))));
		}
		else{
		if(this.BOP.getBusnIncomeExtddPeriodNumDays().equals((String)"60")){
			this.BOP.setBusnIncomeExtddPeriodFactor((double)1.0);
		}
		else{
			this.BOP.setBusnIncomeExtddPeriodFactor((double)0.0);
		}
		}
	  
	}
	public void State ()  {
	  this.BOP.setState((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOP,"../State[Id=../StateId]/Name"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException,ParseException {
	  
	if(null != BOPIRPMList){
		for(BOPIRPM BOPIRPM:BOPIRPMList){
			BOPIRPMRule = new com.nest.res.bop.rules.BOPIRPM(BOPIRPM);
			BOPIRPMRule.CommonRating1();

		}
	}
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPLocationList){
		for(BOPLocation BOPLocation:BOPLocationList){
			BOPLocationRule = new com.nest.res.bop.rules.BOPLocation(BOPLocation);
			BOPLocationRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub2();
	
	if(null != BOPTerrorismCoverageList){
		for(BOPTerrorismCoverage BOPTerrorismCoverage:BOPTerrorismCoverageList){
			BOPTerrorismCoverageRule = new com.nest.res.bop.rules.BOPTerrorismCoverage(BOPTerrorismCoverage);
			BOPTerrorismCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPAbuseMolestationExclList){
		for(BOPAbuseMolestationExcl BOPAbuseMolestationExcl:BOPAbuseMolestationExclList){
			BOPAbuseMolestationExclRule = new com.nest.res.bop.rules.BOPAbuseMolestationExcl(BOPAbuseMolestationExcl);
			BOPAbuseMolestationExclRule.ProcessPremium1();

		}
	}
	if(null != BOPAbuseOrMolestationExclSpecdSrvcsList){
		for(BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcs:BOPAbuseOrMolestationExclSpecdSrvcsList){
			BOPAbuseOrMolestationExclSpecdSrvcsRule = new com.nest.res.bop.rules.BOPAbuseOrMolestationExclSpecdSrvcs(BOPAbuseOrMolestationExclSpecdSrvcs);
			BOPAbuseOrMolestationExclSpecdSrvcsRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdDesignatedPersonOrgList){
		for(BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrg:BOPAddlInsdDesignatedPersonOrgList){
			BOPAddlInsdDesignatedPersonOrgRule = new com.nest.res.bop.rules.BOPAddlInsdDesignatedPersonOrg(BOPAddlInsdDesignatedPersonOrg);
			BOPAddlInsdDesignatedPersonOrgRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList){
		for(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd:BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList){
			BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdRule = new com.nest.res.bop.rules.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd(BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd);
			BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList){
		for(BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract:BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList){
			BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractRule = new com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract(BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract);
			BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList){
		for(BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract:BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList){
			BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractRule = new com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract(BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract);
			BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList){
		for(BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOps:BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList){
			BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsRule = new com.nest.res.bop.rules.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps(BOPAddlInsdOwnersLesseesOrContrctrsCompldOps);
			BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlInsdVendorsList){
		for(BOPAddlInsdVendors BOPAddlInsdVendors:BOPAddlInsdVendorsList){
			BOPAddlInsdVendorsRule = new com.nest.res.bop.rules.BOPAddlInsdVendors(BOPAddlInsdVendors);
			BOPAddlInsdVendorsRule.ProcessPremium1();

		}
	}
	if(null != BOPAddlLiabExposuresCoverageList){
		for(BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage:BOPAddlLiabExposuresCoverageList){
			BOPAddlLiabExposuresCoverageRule = new com.nest.res.bop.rules.BOPAddlLiabExposuresCoverage(BOPAddlLiabExposuresCoverage);
			BOPAddlLiabExposuresCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPAmendmentAggLimitsOfInsPerProjectList){
		for(BOPAmendmentAggLimitsOfInsPerProject BOPAmendmentAggLimitsOfInsPerProject:BOPAmendmentAggLimitsOfInsPerProjectList){
			BOPAmendmentAggLimitsOfInsPerProjectRule = new com.nest.res.bop.rules.BOPAmendmentAggLimitsOfInsPerProject(BOPAmendmentAggLimitsOfInsPerProject);
			BOPAmendmentAggLimitsOfInsPerProjectRule.ProcessPremium1();

		}
	}
	if(null != BOPAmendmentInsuredContractDefinitionList){
		for(BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinition:BOPAmendmentInsuredContractDefinitionList){
			BOPAmendmentInsuredContractDefinitionRule = new com.nest.res.bop.rules.BOPAmendmentInsuredContractDefinition(BOPAmendmentInsuredContractDefinition);
			BOPAmendmentInsuredContractDefinitionRule.ProcessPremium1();

		}
	}
	if(null != BOPAmendmentLiquorLiabExclExcptnList){
		for(BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptn:BOPAmendmentLiquorLiabExclExcptnList){
			BOPAmendmentLiquorLiabExclExcptnRule = new com.nest.res.bop.rules.BOPAmendmentLiquorLiabExclExcptn(BOPAmendmentLiquorLiabExclExcptn);
			BOPAmendmentLiquorLiabExclExcptnRule.ProcessPremium1();

		}
	}
	if(null != BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList){
		for(BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition:BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList){
			BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionRule = new com.nest.res.bop.rules.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition(BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition);
			BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionRule.ProcessPremium1();

		}
	}
	if(null != BOPBarbersBeauticiansProflLiabList){
		for(BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiab:BOPBarbersBeauticiansProflLiabList){
			BOPBarbersBeauticiansProflLiabRule = new com.nest.res.bop.rules.BOPBarbersBeauticiansProflLiab(BOPBarbersBeauticiansProflLiab);
			BOPBarbersBeauticiansProflLiabRule.ProcessPremium1();

		}
	}
	if(null != BOPBeautySalonsProflLiabList){
		for(BOPBeautySalonsProflLiab BOPBeautySalonsProflLiab:BOPBeautySalonsProflLiabList){
			BOPBeautySalonsProflLiabRule = new com.nest.res.bop.rules.BOPBeautySalonsProflLiab(BOPBeautySalonsProflLiab);
			BOPBeautySalonsProflLiabRule.ProcessPremium1();

		}
	}
	if(null != BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList){
		for(BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems:BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList){
			BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsRule = new com.nest.res.bop.rules.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems(BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems);
			BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsRule.ProcessPremium1();

		}
	}
	if(null != BOPCannabisLiabilityExclusionList){
		for(BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusion:BOPCannabisLiabilityExclusionList){
			BOPCannabisLiabilityExclusionRule = new com.nest.res.bop.rules.BOPCannabisLiabilityExclusion(BOPCannabisLiabilityExclusion);
			BOPCannabisLiabilityExclusionRule.ProcessPremium1();

		}
	}
	if(null != BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList){
		for(BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions:BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList){
			BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsRule = new com.nest.res.bop.rules.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions(BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions);
			BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsRule.ProcessPremium1();

		}
	}
	if(null != BOPCannabisLiabilityExclusionWithHempExceptionList){
		for(BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempException:BOPCannabisLiabilityExclusionWithHempExceptionList){
			BOPCannabisLiabilityExclusionWithHempExceptionRule = new com.nest.res.bop.rules.BOPCannabisLiabilityExclusionWithHempException(BOPCannabisLiabilityExclusionWithHempException);
			BOPCannabisLiabilityExclusionWithHempExceptionRule.ProcessPremium1();

		}
	}
	if(null != BOPCannabisPropertyExclusionList){
		for(BOPCannabisPropertyExclusion BOPCannabisPropertyExclusion:BOPCannabisPropertyExclusionList){
			BOPCannabisPropertyExclusionRule = new com.nest.res.bop.rules.BOPCannabisPropertyExclusion(BOPCannabisPropertyExclusion);
			BOPCannabisPropertyExclusionRule.ProcessPremium1();

		}
	}
	if(null != BOPCannabisPropertyExclusionWithHempExceptionList){
		for(BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempException:BOPCannabisPropertyExclusionWithHempExceptionList){
			BOPCannabisPropertyExclusionWithHempExceptionRule = new com.nest.res.bop.rules.BOPCannabisPropertyExclusionWithHempException(BOPCannabisPropertyExclusionWithHempException);
			BOPCannabisPropertyExclusionWithHempExceptionRule.ProcessPremium1();

		}
	}
	if(null != BOPCapLossesFromCertfdActsTerrsmList){
		for(BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsm:BOPCapLossesFromCertfdActsTerrsmList){
			BOPCapLossesFromCertfdActsTerrsmRule = new com.nest.res.bop.rules.BOPCapLossesFromCertfdActsTerrsm(BOPCapLossesFromCertfdActsTerrsm);
			BOPCapLossesFromCertfdActsTerrsmRule.ProcessPremium1();

		}
	}
	if(null != BOPCommunicableDiseaseExclusionList){
		for(BOPCommunicableDiseaseExclusion BOPCommunicableDiseaseExclusion:BOPCommunicableDiseaseExclusionList){
			BOPCommunicableDiseaseExclusionRule = new com.nest.res.bop.rules.BOPCommunicableDiseaseExclusion(BOPCommunicableDiseaseExclusion);
			BOPCommunicableDiseaseExclusionRule.ProcessPremium1();

		}
	}
	if(null != BOPComputerFraudFundsTransferFraudCoverageList){
		for(BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverage:BOPComputerFraudFundsTransferFraudCoverageList){
			BOPComputerFraudFundsTransferFraudCoverageRule = new com.nest.res.bop.rules.BOPComputerFraudFundsTransferFraudCoverage(BOPComputerFraudFundsTransferFraudCoverage);
			BOPComputerFraudFundsTransferFraudCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList){
		for(BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiab:BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList){
			BOPCondosCoOpsAssocsDirectorsAndOfficersLiabRule = new com.nest.res.bop.rules.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab(BOPCondosCoOpsAssocsDirectorsAndOfficersLiab);
			BOPCondosCoOpsAssocsDirectorsAndOfficersLiabRule.ProcessPremium1();

		}
	}
	if(null != BOPContrctrsInstalltnToolsAndEquipmtCovList){
		for(BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCov:BOPContrctrsInstalltnToolsAndEquipmtCovList){
			BOPContrctrsInstalltnToolsAndEquipmtCovRule = new com.nest.res.bop.rules.BOPContrctrsInstalltnToolsAndEquipmtCov(BOPContrctrsInstalltnToolsAndEquipmtCov);
			BOPContrctrsInstalltnToolsAndEquipmtCovRule.ProcessPremium1();

		}
	}
	if(null != BOPCoverageInjuryLeasedWorkersList){
		for(BOPCoverageInjuryLeasedWorkers BOPCoverageInjuryLeasedWorkers:BOPCoverageInjuryLeasedWorkersList){
			BOPCoverageInjuryLeasedWorkersRule = new com.nest.res.bop.rules.BOPCoverageInjuryLeasedWorkers(BOPCoverageInjuryLeasedWorkers);
			BOPCoverageInjuryLeasedWorkersRule.ProcessPremium1();

		}
	}
	if(null != BOPDesignatedConstructionProjectsGenlAggLimitList){
		for(BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimit:BOPDesignatedConstructionProjectsGenlAggLimitList){
			BOPDesignatedConstructionProjectsGenlAggLimitRule = new com.nest.res.bop.rules.BOPDesignatedConstructionProjectsGenlAggLimit(BOPDesignatedConstructionProjectsGenlAggLimit);
			BOPDesignatedConstructionProjectsGenlAggLimitRule.ProcessPremium1();

		}
	}
	if(null != BOPDesignatedLocsGenlAggLimitList){
		for(BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimit:BOPDesignatedLocsGenlAggLimitList){
			BOPDesignatedLocsGenlAggLimitRule = new com.nest.res.bop.rules.BOPDesignatedLocsGenlAggLimit(BOPDesignatedLocsGenlAggLimit);
			BOPDesignatedLocsGenlAggLimitRule.ProcessPremium1();

		}
	}
	if(null != BOPDisclosurePursuantToTRIA2002List){
		for(BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002:BOPDisclosurePursuantToTRIA2002List){
			BOPDisclosurePursuantToTRIA2002Rule = new com.nest.res.bop.rules.BOPDisclosurePursuantToTRIA2002(BOPDisclosurePursuantToTRIA2002);
			BOPDisclosurePursuantToTRIA2002Rule.ProcessPremium1();

		}
	}
	if(null != BOPDiscretionaryPayrollExpenseList){
		for(BOPDiscretionaryPayrollExpense BOPDiscretionaryPayrollExpense:BOPDiscretionaryPayrollExpenseList){
			BOPDiscretionaryPayrollExpenseRule = new com.nest.res.bop.rules.BOPDiscretionaryPayrollExpense(BOPDiscretionaryPayrollExpense);
			BOPDiscretionaryPayrollExpenseRule.ProcessPremium1();

		}
	}
	if(null != BOPElectronicCommerceList){
		for(BOPElectronicCommerce BOPElectronicCommerce:BOPElectronicCommerceList){
			BOPElectronicCommerceRule = new com.nest.res.bop.rules.BOPElectronicCommerce(BOPElectronicCommerce);
			BOPElectronicCommerceRule.ProcessPremium1();

		}
	}
	if(null != BOPEmpBenefitsLiabCovList){
		for(BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCov:BOPEmpBenefitsLiabCovList){
			BOPEmpBenefitsLiabCovRule = new com.nest.res.bop.rules.BOPEmpBenefitsLiabCov(BOPEmpBenefitsLiabCov);
			BOPEmpBenefitsLiabCovRule.ProcessPremium1();

		}
	}
	if(null != BOPEmployeeDishonestyNamedEmployeesList){
		for(BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployees:BOPEmployeeDishonestyNamedEmployeesList){
			BOPEmployeeDishonestyNamedEmployeesRule = new com.nest.res.bop.rules.BOPEmployeeDishonestyNamedEmployees(BOPEmployeeDishonestyNamedEmployees);
			BOPEmployeeDishonestyNamedEmployeesRule.ProcessPremium1();

		}
	}
	if(null != BOPEmployeeDishtyCoverageList){
		for(BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverage:BOPEmployeeDishtyCoverageList){
			BOPEmployeeDishtyCoverageRule = new com.nest.res.bop.rules.BOPEmployeeDishtyCoverage(BOPEmployeeDishtyCoverage);
			BOPEmployeeDishtyCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPEmploymentRelatedPracticesExclList){
		for(BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExcl:BOPEmploymentRelatedPracticesExclList){
			BOPEmploymentRelatedPracticesExclRule = new com.nest.res.bop.rules.BOPEmploymentRelatedPracticesExcl(BOPEmploymentRelatedPracticesExcl);
			BOPEmploymentRelatedPracticesExclRule.ProcessPremium1();

		}
	}
	if(null != BOPEmploymentRelatedPracticesLiabilityCovList){
		for(BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCov:BOPEmploymentRelatedPracticesLiabilityCovList){
			BOPEmploymentRelatedPracticesLiabilityCovRule = new com.nest.res.bop.rules.BOPEmploymentRelatedPracticesLiabilityCov(BOPEmploymentRelatedPracticesLiabilityCov);
			BOPEmploymentRelatedPracticesLiabilityCovRule.ProcessPremium1();

		}
	}
	if(null != BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList){
		for(BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded:BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList){
			BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedRule = new com.nest.res.bop.rules.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded(BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded);
			BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedRule.ProcessPremium1();

		}
	}
	if(null != BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList){
		for(BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly:BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList){
			BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyRule = new com.nest.res.bop.rules.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly(BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly);
			BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyRule.ProcessPremium1();

		}
	}
	if(null != BOPExclCertfdActsTerrsmCovFireLossesList){
		for(BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLosses:BOPExclCertfdActsTerrsmCovFireLossesList){
			BOPExclCertfdActsTerrsmCovFireLossesRule = new com.nest.res.bop.rules.BOPExclCertfdActsTerrsmCovFireLosses(BOPExclCertfdActsTerrsmCovFireLosses);
			BOPExclCertfdActsTerrsmCovFireLossesRule.ProcessPremium1();

		}
	}
	if(null != BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList){
		for(BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses:BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList){
			BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesRule = new com.nest.res.bop.rules.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses(BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses);
			BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesRule.ProcessPremium1();

		}
	}
	if(null != BOPExclDesignatedProductsList){
		for(BOPExclDesignatedProducts BOPExclDesignatedProducts:BOPExclDesignatedProductsList){
			BOPExclDesignatedProductsRule = new com.nest.res.bop.rules.BOPExclDesignatedProducts(BOPExclDesignatedProducts);
			BOPExclDesignatedProductsRule.ProcessPremium1();

		}
	}
	if(null != BOPExclDesignatedWorkList){
		for(BOPExclDesignatedWork BOPExclDesignatedWork:BOPExclDesignatedWorkList){
			BOPExclDesignatedWorkRule = new com.nest.res.bop.rules.BOPExclDesignatedWork(BOPExclDesignatedWork);
			BOPExclDesignatedWorkRule.ProcessPremium1();

		}
	}
	if(null != BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList){
		for(BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf:BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList){
			BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfRule = new com.nest.res.bop.rules.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf(BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf);
			BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfRule.ProcessPremium1();

		}
	}
	if(null != BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList){
		for(BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps:BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList){
			BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsRule = new com.nest.res.bop.rules.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps(BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps);
			BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsRule.ProcessPremium1();

		}
	}
	if(null != BOPExclExtrInsulationAndFinishingSysList){
		for(BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSys:BOPExclExtrInsulationAndFinishingSysList){
			BOPExclExtrInsulationAndFinishingSysRule = new com.nest.res.bop.rules.BOPExclExtrInsulationAndFinishingSys(BOPExclExtrInsulationAndFinishingSys);
			BOPExclExtrInsulationAndFinishingSysRule.ProcessPremium1();

		}
	}
	if(null != BOPExclPersonalAdvertisingInjuryList){
		for(BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjury:BOPExclPersonalAdvertisingInjuryList){
			BOPExclPersonalAdvertisingInjuryRule = new com.nest.res.bop.rules.BOPExclPersonalAdvertisingInjury(BOPExclPersonalAdvertisingInjury);
			BOPExclPersonalAdvertisingInjuryRule.ProcessPremium1();

		}
	}
	if(null != BOPExclProductsCompletedOpsHzdList){
		for(BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzd:BOPExclProductsCompletedOpsHzdList){
			BOPExclProductsCompletedOpsHzdRule = new com.nest.res.bop.rules.BOPExclProductsCompletedOpsHzd(BOPExclProductsCompletedOpsHzd);
			BOPExclProductsCompletedOpsHzdRule.ProcessPremium1();

		}
	}
	if(null != BOPExclusionUnmannedAircraftList){
		for(BOPExclusionUnmannedAircraft BOPExclusionUnmannedAircraft:BOPExclusionUnmannedAircraftList){
			BOPExclusionUnmannedAircraftRule = new com.nest.res.bop.rules.BOPExclusionUnmannedAircraft(BOPExclusionUnmannedAircraft);
			BOPExclusionUnmannedAircraftRule.ProcessPremium1();

		}
	}
	if(null != BOPExtddReportingPeriodEmpBenefitsLiabCovList){
		for(BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCov:BOPExtddReportingPeriodEmpBenefitsLiabCovList){
			BOPExtddReportingPeriodEmpBenefitsLiabCovRule = new com.nest.res.bop.rules.BOPExtddReportingPeriodEmpBenefitsLiabCov(BOPExtddReportingPeriodEmpBenefitsLiabCov);
			BOPExtddReportingPeriodEmpBenefitsLiabCovRule.ProcessPremium1();

		}
	}
	if(null != BOPForgeryAlterationCoverageList){
		for(BOPForgeryAlterationCoverage BOPForgeryAlterationCoverage:BOPForgeryAlterationCoverageList){
			BOPForgeryAlterationCoverageRule = new com.nest.res.bop.rules.BOPForgeryAlterationCoverage(BOPForgeryAlterationCoverage);
			BOPForgeryAlterationCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPFuneralDirectorsProflLiabList){
		for(BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiab:BOPFuneralDirectorsProflLiabList){
			BOPFuneralDirectorsProflLiabRule = new com.nest.res.bop.rules.BOPFuneralDirectorsProflLiab(BOPFuneralDirectorsProflLiab);
			BOPFuneralDirectorsProflLiabRule.ProcessPremium1();

		}
	}
	if(null != BOPFungiBacteriaExclusionLiabilityList){
		for(BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiability:BOPFungiBacteriaExclusionLiabilityList){
			BOPFungiBacteriaExclusionLiabilityRule = new com.nest.res.bop.rules.BOPFungiBacteriaExclusionLiability(BOPFungiBacteriaExclusionLiability);
			BOPFungiBacteriaExclusionLiabilityRule.ProcessPremium1();

		}
	}
	if(null != BOPHiredNonOwnedAutoList){
		for(BOPHiredNonOwnedAuto BOPHiredNonOwnedAuto:BOPHiredNonOwnedAutoList){
			BOPHiredNonOwnedAutoRule = new com.nest.res.bop.rules.BOPHiredNonOwnedAuto(BOPHiredNonOwnedAuto);
			BOPHiredNonOwnedAutoRule.ProcessPremium1();

		}
	}
	if(null != BOPIDFraudExpenseCovList){
		for(BOPIDFraudExpenseCov BOPIDFraudExpenseCov:BOPIDFraudExpenseCovList){
			BOPIDFraudExpenseCovRule = new com.nest.res.bop.rules.BOPIDFraudExpenseCov(BOPIDFraudExpenseCov);
			BOPIDFraudExpenseCovRule.ProcessPremium1();

		}
	}
	if(null != BOPInformationSecurityProtectionEndorsementList){
		for(BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsement:BOPInformationSecurityProtectionEndorsementList){
			BOPInformationSecurityProtectionEndorsementRule = new com.nest.res.bop.rules.BOPInformationSecurityProtectionEndorsement(BOPInformationSecurityProtectionEndorsement);
			BOPInformationSecurityProtectionEndorsementRule.ProcessPremium1();

		}
	}
	if(null != BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList){
		for(BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees:BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList){
			BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesRule = new com.nest.res.bop.rules.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees(BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees);
			BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitationsOfCovForCertfdActsTerrsmList){
		for(BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsm:BOPLimitationsOfCovForCertfdActsTerrsmList){
			BOPLimitationsOfCovForCertfdActsTerrsmRule = new com.nest.res.bop.rules.BOPLimitationsOfCovForCertfdActsTerrsm(BOPLimitationsOfCovForCertfdActsTerrsm);
			BOPLimitationsOfCovForCertfdActsTerrsmRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedCoverageForDesignatedUnmannedAircraftList){
		for(BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft:BOPLimitedCoverageForDesignatedUnmannedAircraftList){
			BOPLimitedCoverageForDesignatedUnmannedAircraftRule = new com.nest.res.bop.rules.BOPLimitedCoverageForDesignatedUnmannedAircraft(BOPLimitedCoverageForDesignatedUnmannedAircraft);
			BOPLimitedCoverageForDesignatedUnmannedAircraftRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedFungiBacteriaCovList){
		for(BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov:BOPLimitedFungiBacteriaCovList){
			BOPLimitedFungiBacteriaCovRule = new com.nest.res.bop.rules.BOPLimitedFungiBacteriaCov(BOPLimitedFungiBacteriaCov);
			BOPLimitedFungiBacteriaCovRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedFungiBacteriaCovLiabilityList){
		for(BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiability:BOPLimitedFungiBacteriaCovLiabilityList){
			BOPLimitedFungiBacteriaCovLiabilityRule = new com.nest.res.bop.rules.BOPLimitedFungiBacteriaCovLiability(BOPLimitedFungiBacteriaCovLiability);
			BOPLimitedFungiBacteriaCovLiabilityRule.ProcessPremium1();

		}
	}
	if(null != BOPLimitedPolltnLiabExtList){
		for(BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExt:BOPLimitedPolltnLiabExtList){
			BOPLimitedPolltnLiabExtRule = new com.nest.res.bop.rules.BOPLimitedPolltnLiabExt(BOPLimitedPolltnLiabExt);
			BOPLimitedPolltnLiabExtRule.ProcessPremium1();

		}
	}
	if(null != BOPLiquorLiabList){
		for(BOPLiquorLiab BOPLiquorLiab:BOPLiquorLiabList){
			BOPLiquorLiabRule = new com.nest.res.bop.rules.BOPLiquorLiab(BOPLiquorLiab);
			BOPLiquorLiabRule.ProcessPremium1();

		}
	}
	if(null != BOPLiquorLiabCovList){
		for(BOPLiquorLiabCov BOPLiquorLiabCov:BOPLiquorLiabCovList){
			BOPLiquorLiabCovRule = new com.nest.res.bop.rules.BOPLiquorLiabCov(BOPLiquorLiabCov);
			BOPLiquorLiabCovRule.ProcessPremium1();

		}
	}
	if(null != BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList){
		for(BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishments:BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList){
			BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsRule = new com.nest.res.bop.rules.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments(BOPLiquorLiabCovBringYourOwnAlcoholEstablishments);
			BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsRule.ProcessPremium1();

		}
	}
	if(null != BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList){
		for(BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyers:BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList){
			BOPLmtdExclPersonalAndAdvertisingInjuryLawyersRule = new com.nest.res.bop.rules.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers(BOPLmtdExclPersonalAndAdvertisingInjuryLawyers);
			BOPLmtdExclPersonalAndAdvertisingInjuryLawyersRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationList){
		for(BOPLocation BOPLocation:BOPLocationList){
			BOPLocationRule = new com.nest.res.bop.rules.BOPLocation(BOPLocation);
			BOPLocationRule.ProcessPremium2();

		}
	}
	if(null != BOPNewlyAcquiredOrganizationsList){
		for(BOPNewlyAcquiredOrganizations BOPNewlyAcquiredOrganizations:BOPNewlyAcquiredOrganizationsList){
			BOPNewlyAcquiredOrganizationsRule = new com.nest.res.bop.rules.BOPNewlyAcquiredOrganizations(BOPNewlyAcquiredOrganizations);
			BOPNewlyAcquiredOrganizationsRule.ProcessPremium1();

		}
	}
	if(null != BOPOpticalHearingAidList){
		for(BOPOpticalHearingAid BOPOpticalHearingAid:BOPOpticalHearingAidList){
			BOPOpticalHearingAidRule = new com.nest.res.bop.rules.BOPOpticalHearingAid(BOPOpticalHearingAid);
			BOPOpticalHearingAidRule.ProcessPremium1();

		}
	}
	if(null != BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList){
		for(BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage:BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList){
			BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageRule = new com.nest.res.bop.rules.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage(BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage);
			BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPPharmacistsList){
		for(BOPPharmacists BOPPharmacists:BOPPharmacistsList){
			BOPPharmacistsRule = new com.nest.res.bop.rules.BOPPharmacists(BOPPharmacists);
			BOPPharmacistsRule.ProcessPremium1();

		}
	}
	if(null != BOPPhotographyList){
		for(BOPPhotography BOPPhotography:BOPPhotographyList){
			BOPPhotographyRule = new com.nest.res.bop.rules.BOPPhotography(BOPPhotography);
			BOPPhotographyRule.ProcessPremium1();

		}
	}
	if(null != BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList){
		for(BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage:BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList){
			BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageRule = new com.nest.res.bop.rules.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage(BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage);
			BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPPhotographyMakeupAndHairstylingList){
		for(BOPPhotographyMakeupAndHairstyling BOPPhotographyMakeupAndHairstyling:BOPPhotographyMakeupAndHairstylingList){
			BOPPhotographyMakeupAndHairstylingRule = new com.nest.res.bop.rules.BOPPhotographyMakeupAndHairstyling(BOPPhotographyMakeupAndHairstyling);
			BOPPhotographyMakeupAndHairstylingRule.ProcessPremium1();

		}
	}
	if(null != BOPPolltnExclLimitedExcptnForDesignatedPollutantsList){
		for(BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutants:BOPPolltnExclLimitedExcptnForDesignatedPollutantsList){
			BOPPolltnExclLimitedExcptnForDesignatedPollutantsRule = new com.nest.res.bop.rules.BOPPolltnExclLimitedExcptnForDesignatedPollutants(BOPPolltnExclLimitedExcptnForDesignatedPollutants);
			BOPPolltnExclLimitedExcptnForDesignatedPollutantsRule.ProcessPremium1();

		}
	}
	if(null != BOPPolltnExclLimitedExcptnForShortTermEventList){
		for(BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEvent:BOPPolltnExclLimitedExcptnForShortTermEventList){
			BOPPolltnExclLimitedExcptnForShortTermEventRule = new com.nest.res.bop.rules.BOPPolltnExclLimitedExcptnForShortTermEvent(BOPPolltnExclLimitedExcptnForShortTermEvent);
			BOPPolltnExclLimitedExcptnForShortTermEventRule.ProcessPremium1();

		}
	}
	if(null != BOPPrintersErrorsOmissionsList){
		for(BOPPrintersErrorsOmissions BOPPrintersErrorsOmissions:BOPPrintersErrorsOmissionsList){
			BOPPrintersErrorsOmissionsRule = new com.nest.res.bop.rules.BOPPrintersErrorsOmissions(BOPPrintersErrorsOmissions);
			BOPPrintersErrorsOmissionsRule.ProcessPremium1();

		}
	}
	if(null != BOPTerrorismCoverageList){
		for(BOPTerrorismCoverage BOPTerrorismCoverage:BOPTerrorismCoverageList){
			BOPTerrorismCoverageRule = new com.nest.res.bop.rules.BOPTerrorismCoverage(BOPTerrorismCoverage);
			BOPTerrorismCoverageRule.ProcessPremium2();

		}
	}
	if(null != BOPTheftOfClientsPropertyList){
		for(BOPTheftOfClientsProperty BOPTheftOfClientsProperty:BOPTheftOfClientsPropertyList){
			BOPTheftOfClientsPropertyRule = new com.nest.res.bop.rules.BOPTheftOfClientsProperty(BOPTheftOfClientsProperty);
			BOPTheftOfClientsPropertyRule.ProcessPremium1();

		}
	}
	if(null != BOPTotPolltnExclList){
		for(BOPTotPolltnExcl BOPTotPolltnExcl:BOPTotPolltnExclList){
			BOPTotPolltnExclRule = new com.nest.res.bop.rules.BOPTotPolltnExcl(BOPTotPolltnExcl);
			BOPTotPolltnExclRule.ProcessPremium1();

		}
	}
	if(null != BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList){
		for(BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn:BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList){
			BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnRule = new com.nest.res.bop.rules.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn(BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn);
			BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnRule.ProcessPremium1();

		}
	}
	if(null != BOPVeterinariansProflLiabList){
		for(BOPVeterinariansProflLiab BOPVeterinariansProflLiab:BOPVeterinariansProflLiabList){
			BOPVeterinariansProflLiabRule = new com.nest.res.bop.rules.BOPVeterinariansProflLiab(BOPVeterinariansProflLiab);
			BOPVeterinariansProflLiabRule.ProcessPremium1();

		}
	}
	if(null != BOPY2KComputerRelatedProblemsExclSpecifiedCovList){
		for(BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCov:BOPY2KComputerRelatedProblemsExclSpecifiedCovList){
			BOPY2KComputerRelatedProblemsExclSpecifiedCovRule = new com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsExclSpecifiedCov(BOPY2KComputerRelatedProblemsExclSpecifiedCov);
			BOPY2KComputerRelatedProblemsExclSpecifiedCovRule.ProcessPremium1();

		}
	}
	if(null != BOPY2KComputerRelatedProblemsLimitedCovOptionsList){
		for(BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptions:BOPY2KComputerRelatedProblemsLimitedCovOptionsList){
			BOPY2KComputerRelatedProblemsLimitedCovOptionsRule = new com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsLimitedCovOptions(BOPY2KComputerRelatedProblemsLimitedCovOptions);
			BOPY2KComputerRelatedProblemsLimitedCovOptionsRule.ProcessPremium1();

		}
	}
	if(null != BOPApartmentBuildingsTotalTenantsAutosList){
		for(BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutos:BOPApartmentBuildingsTotalTenantsAutosList){
			BOPApartmentBuildingsTotalTenantsAutosRule = new com.nest.res.bop.rules.BOPApartmentBuildingsTotalTenantsAutos(BOPApartmentBuildingsTotalTenantsAutos);
			BOPApartmentBuildingsTotalTenantsAutosRule.ProcessPremium1();

		}
	}
	if(null != BOPLocationList){
		for(BOPLocation BOPLocation:BOPLocationList){
			BOPLocationRule = new com.nest.res.bop.rules.BOPLocation(BOPLocation);
			BOPLocationRule.ProcessPremium3();

		}
	}
	if(null != BOPElectronicDataCoverageList){
		for(BOPElectronicDataCoverage BOPElectronicDataCoverage:BOPElectronicDataCoverageList){
			BOPElectronicDataCoverageRule = new com.nest.res.bop.rules.BOPElectronicDataCoverage(BOPElectronicDataCoverage);
			BOPElectronicDataCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPInterruptionComputerOpsCoverageList){
		for(BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverage:BOPInterruptionComputerOpsCoverageList){
			BOPInterruptionComputerOpsCoverageRule = new com.nest.res.bop.rules.BOPInterruptionComputerOpsCoverage(BOPInterruptionComputerOpsCoverage);
			BOPInterruptionComputerOpsCoverageRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub3();
	
	if(null != BOPLimitedFungiBacteriaCovList){
		for(BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov:BOPLimitedFungiBacteriaCovList){
			BOPLimitedFungiBacteriaCovRule = new com.nest.res.bop.rules.BOPLimitedFungiBacteriaCov(BOPLimitedFungiBacteriaCov);
			BOPLimitedFungiBacteriaCovRule.ProcessPremium2();

		}
	}
	ProcessPremium1_CommonRatingSub4();
	
	if(null != BOPBusnIncomeChangesTimePeriodList){
		for(BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriod:BOPBusnIncomeChangesTimePeriodList){
			BOPBusnIncomeChangesTimePeriodRule = new com.nest.res.bop.rules.BOPBusnIncomeChangesTimePeriod(BOPBusnIncomeChangesTimePeriod);
			BOPBusnIncomeChangesTimePeriodRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeExtddPeriodBldgCoverageList){
		for(BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverage:BOPBusnIncomeExtddPeriodBldgCoverageList){
			BOPBusnIncomeExtddPeriodBldgCoverageRule = new com.nest.res.bop.rules.BOPBusnIncomeExtddPeriodBldgCoverage(BOPBusnIncomeExtddPeriodBldgCoverage);
			BOPBusnIncomeExtddPeriodBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList){
		for(BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage:BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList){
			BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage(BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage);
			BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeOrdinaryPayrollBldgCoverageList){
		for(BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverage:BOPBusnIncomeOrdinaryPayrollBldgCoverageList){
			BOPBusnIncomeOrdinaryPayrollBldgCoverageRule = new com.nest.res.bop.rules.BOPBusnIncomeOrdinaryPayrollBldgCoverage(BOPBusnIncomeOrdinaryPayrollBldgCoverage);
			BOPBusnIncomeOrdinaryPayrollBldgCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList){
		for(BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage:BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList){
			BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageRule = new com.nest.res.bop.rules.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage(BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage);
			BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageRule.ProcessPremium1();

		}
	}
	if(null != BOPRestaurantsTotalCustomersAutosList){
		for(BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutos:BOPRestaurantsTotalCustomersAutosList){
			BOPRestaurantsTotalCustomersAutosRule = new com.nest.res.bop.rules.BOPRestaurantsTotalCustomersAutos(BOPRestaurantsTotalCustomersAutos);
			BOPRestaurantsTotalCustomersAutosRule.ProcessPremium1();

		}
	}
	if(null != BOPSnowPlowProdsCompldOpsHzdCovList){
		for(BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCov:BOPSnowPlowProdsCompldOpsHzdCovList){
			BOPSnowPlowProdsCompldOpsHzdCovRule = new com.nest.res.bop.rules.BOPSnowPlowProdsCompldOpsHzdCov(BOPSnowPlowProdsCompldOpsHzdCov);
			BOPSnowPlowProdsCompldOpsHzdCovRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void TotalOptionalMedicalCoveragePremium ()  {
	  this.BOP.setTotalOptionalMedicalCoveragePremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOP,"BOPLocation/BOPStructure/BOPOptionalPerPersonMedicalExpensesCoverageBuilding") ){
			this.BOP.setTotalOptionalMedicalCoveragePremium(this.BOP.getTotalOptionalMedicalCoveragePremium()+this.BOP.getTotalOptionalMedicalCoveragePremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

		for( Policy policy : XpathNode.selectNodes(BOP,"BOPLocation/BOPStructure/BOPClassification/BOPOptionalPerPersonMedicalExpensesCoverageClassification") ){
			this.BOP.setTotalOptionalMedicalCoveragePremium(this.BOP.getTotalOptionalMedicalCoveragePremium()+this.BOP.getTotalOptionalMedicalCoveragePremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

	  
	}
	public void ProcessPremium1_CommonRatingSub4 () throws LookupException,NumberFormatException {
	  
	StandardDeductible();
	
	TotalOptionalMedicalCoveragePremium();
	
	  
	}
	public  BOP (com.nest.res.bop.domain.BOP BOP)  {
	  this.BOP = BOP;
this.BOPComputerFraudFundsTransferFraudCoverageList = BOP.getBOPComputerFraudFundsTransferFraudCoverage();
this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList = BOP.getBOPAmendmentOfPersonalAndAdvertisingInjuryDefinition();
this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList = BOP.getBOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract();
this.BOPLimitedFungiBacteriaCovList = BOP.getBOPLimitedFungiBacteriaCov();
this.BOPLimitationsOfCovForCertfdActsTerrsmList = BOP.getBOPLimitationsOfCovForCertfdActsTerrsm();
this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList = BOP.getBOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage();
this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList = BOP.getBOPLiquorLiabCovBringYourOwnAlcoholEstablishments();
this.BOPY2KComputerRelatedProblemsLimitedCovOptionsList = BOP.getBOPY2KComputerRelatedProblemsLimitedCovOptions();
this.BOPEmploymentRelatedPracticesLiabilityCovList = BOP.getBOPEmploymentRelatedPracticesLiabilityCov();
this.BOPCannabisLiabilityExclusionWithHempExceptionList = BOP.getBOPCannabisLiabilityExclusionWithHempException();
this.BOPBeautySalonsProflLiabList = BOP.getBOPBeautySalonsProflLiab();
this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList = BOP.getBOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions();
this.BOPBusnIncomeOrdinaryPayrollBldgCoverageList = BOP.getBOPBusnIncomeOrdinaryPayrollBldgCoverage();
this.BOPExclusionUnmannedAircraftList = BOP.getBOPExclusionUnmannedAircraft();
this.BOPExclProductsCompletedOpsHzdList = BOP.getBOPExclProductsCompletedOpsHzd();
this.BOPTotPolltnExclList = BOP.getBOPTotPolltnExcl();
this.BOPCannabisLiabilityExclusionList = BOP.getBOPCannabisLiabilityExclusion();
this.BOPAddlLiabExposuresCoverageList = BOP.getBOPAddlLiabExposuresCoverage();
this.BOPDesignatedLocsGenlAggLimitList = BOP.getBOPDesignatedLocsGenlAggLimit();
this.BOPAmendmentLiquorLiabExclExcptnList = BOP.getBOPAmendmentLiquorLiabExclExcptn();
this.BOPAbuseMolestationExclList = BOP.getBOPAbuseMolestationExcl();
this.BOPDiscretionaryPayrollExpenseList = BOP.getBOPDiscretionaryPayrollExpense();
this.BOPFungiBacteriaExclusionLiabilityList = BOP.getBOPFungiBacteriaExclusionLiability();
this.BOPPharmacistsList = BOP.getBOPPharmacists();
this.BOPHiredNonOwnedAutoList = BOP.getBOPHiredNonOwnedAuto();
this.BOPInformationSecurityProtectionEndorsementList = BOP.getBOPInformationSecurityProtectionEndorsement();
this.BOPExclDesignatedWorkList = BOP.getBOPExclDesignatedWork();
this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList = BOP.getBOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps();
this.BOPEmpBenefitsLiabCovList = BOP.getBOPEmpBenefitsLiabCov();
this.BOPExtddReportingPeriodEmpBenefitsLiabCovList = BOP.getBOPExtddReportingPeriodEmpBenefitsLiabCov();
this.BOPContrctrsInstalltnToolsAndEquipmtCovList = BOP.getBOPContrctrsInstalltnToolsAndEquipmtCov();
this.BOPElectronicDataCoverageList = BOP.getBOPElectronicDataCoverage();
this.BOPBarbersBeauticiansProflLiabList = BOP.getBOPBarbersBeauticiansProflLiab();
this.BOPExclPersonalAdvertisingInjuryList = BOP.getBOPExclPersonalAdvertisingInjury();
this.BOPForgeryAlterationCoverageList = BOP.getBOPForgeryAlterationCoverage();
this.BOPAddlInsdDesignatedPersonOrgList = BOP.getBOPAddlInsdDesignatedPersonOrg();
this.BOPLiquorLiabList = BOP.getBOPLiquorLiab();
this.BOPEmployeeDishonestyNamedEmployeesList = BOP.getBOPEmployeeDishonestyNamedEmployees();
this.BOPLimitedCoverageForDesignatedUnmannedAircraftList = BOP.getBOPLimitedCoverageForDesignatedUnmannedAircraft();
this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList = BOP.getBOPDishonestMaliciousOrFraudulantActsCommittedByEmployees();
this.BOPY2KComputerRelatedProblemsExclSpecifiedCovList = BOP.getBOPY2KComputerRelatedProblemsExclSpecifiedCov();
this.BOPPhotographyMakeupAndHairstylingList = BOP.getBOPPhotographyMakeupAndHairstyling();
this.BOPExclDesignatedProductsList = BOP.getBOPExclDesignatedProducts();
this.BOPTheftOfClientsPropertyList = BOP.getBOPTheftOfClientsProperty();
this.BOPLocationList = BOP.getBOPLocation();
this.BOPBusnIncomeExtddPeriodBldgCoverageList = BOP.getBOPBusnIncomeExtddPeriodBldgCoverage();
this.BOPCannabisPropertyExclusionWithHempExceptionList = BOP.getBOPCannabisPropertyExclusionWithHempException();
this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList = BOP.getBOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems();
this.BOPElectronicCommerceList = BOP.getBOPElectronicCommerce();
this.BOPPolltnExclLimitedExcptnForDesignatedPollutantsList = BOP.getBOPPolltnExclLimitedExcptnForDesignatedPollutants();
this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList = BOP.getBOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage();
this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList = BOP.getBOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf();
this.BOPAmendmentAggLimitsOfInsPerProjectList = BOP.getBOPAmendmentAggLimitsOfInsPerProject();
this.BOPCannabisPropertyExclusionList = BOP.getBOPCannabisPropertyExclusion();
this.BOPIDFraudExpenseCovList = BOP.getBOPIDFraudExpenseCov();
this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList = BOP.getBOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage();
this.BOPLimitedPolltnLiabExtList = BOP.getBOPLimitedPolltnLiabExt();
this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList = BOP.getBOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly();
this.BOPAmendmentInsuredContractDefinitionList = BOP.getBOPAmendmentInsuredContractDefinition();
this.BOPCapLossesFromCertfdActsTerrsmList = BOP.getBOPCapLossesFromCertfdActsTerrsm();
this.BOPIRPMList = BOP.getBOPIRPM();
this.BOPCoverageInjuryLeasedWorkersList = BOP.getBOPCoverageInjuryLeasedWorkers();
this.BOPAbuseOrMolestationExclSpecdSrvcsList = BOP.getBOPAbuseOrMolestationExclSpecdSrvcs();
this.BOPExclExtrInsulationAndFinishingSysList = BOP.getBOPExclExtrInsulationAndFinishingSys();
this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList = BOP.getBOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn();
this.BOPApartmentBuildingsTotalTenantsAutosList = BOP.getBOPApartmentBuildingsTotalTenantsAutos();
this.BOPRestaurantsTotalCustomersAutosList = BOP.getBOPRestaurantsTotalCustomersAutos();
this.BOPPhotographyList = BOP.getBOPPhotography();
this.BOPEmployeeDishtyCoverageList = BOP.getBOPEmployeeDishtyCoverage();
this.BOPTerrorismCoverageList = BOP.getBOPTerrorismCoverage();
this.BOPInterruptionComputerOpsCoverageList = BOP.getBOPInterruptionComputerOpsCoverage();
this.BOPFuneralDirectorsProflLiabList = BOP.getBOPFuneralDirectorsProflLiab();
this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList = BOP.getBOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded();
this.BOPLiquorLiabCovList = BOP.getBOPLiquorLiabCov();
this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList = BOP.getBOPLmtdExclPersonalAndAdvertisingInjuryLawyers();
this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList = BOP.getBOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract();
this.BOPVeterinariansProflLiabList = BOP.getBOPVeterinariansProflLiab();
this.BOPAddlInsdVendorsList = BOP.getBOPAddlInsdVendors();
this.BOPDesignatedConstructionProjectsGenlAggLimitList = BOP.getBOPDesignatedConstructionProjectsGenlAggLimit();
this.BOPPolltnExclLimitedExcptnForShortTermEventList = BOP.getBOPPolltnExclLimitedExcptnForShortTermEvent();
this.BOPPrintersErrorsOmissionsList = BOP.getBOPPrintersErrorsOmissions();
this.BOPExclCertfdActsTerrsmCovFireLossesList = BOP.getBOPExclCertfdActsTerrsmCovFireLosses();
this.BOPCommunicableDiseaseExclusionList = BOP.getBOPCommunicableDiseaseExclusion();
this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList = BOP.getBOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage();
this.BOPNewlyAcquiredOrganizationsList = BOP.getBOPNewlyAcquiredOrganizations();
this.BOPEmploymentRelatedPracticesExclList = BOP.getBOPEmploymentRelatedPracticesExcl();
this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList = BOP.getBOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd();
this.BOPDisclosurePursuantToTRIA2002List = BOP.getBOPDisclosurePursuantToTRIA2002();
this.BOPOpticalHearingAidList = BOP.getBOPOpticalHearingAid();
this.BOPLimitedFungiBacteriaCovLiabilityList = BOP.getBOPLimitedFungiBacteriaCovLiability();
this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList = BOP.getBOPAddlInsdOwnersLesseesOrContrctrsCompldOps();
this.BOPSnowPlowProdsCompldOpsHzdCovList = BOP.getBOPSnowPlowProdsCompldOpsHzdCov();
this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList = BOP.getBOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses();
this.BOPBusnIncomeChangesTimePeriodList = BOP.getBOPBusnIncomeChangesTimePeriod();
this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList = BOP.getBOPCondosCoOpsAssocsDirectorsAndOfficersLiab();

	  
	}
	public void PropDamageLiabDedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOP.getPropDamageLiabDed().equals((String)"No Deductible") && !this.BOP.getPropDamageLiabDed().equals((String)"") && !this.BOP.getPropDamageLiabDedType().equals((String)"Not Applicable") && !this.BOP.getPropDamageLiabDedType().equals((String)"")){
			this.BOP.setPropDamageLiabDedFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PropDamageLiabDedFactor",String.valueOf(BOP.getPropDamageLiabDed()),String.valueOf(BOP.getPropDamageLiabDedType()))));
		}
		else{
			this.BOP.setPropDamageLiabDedFactor((double)1.0);
		}
	  
	}
	public void InlandMarineLCM () throws LookupException,NumberFormatException {
	  this.BOP.setInlandMarineLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InlandMarineLCM",String.valueOf( "Y"))));

	  
	}
	public void StandardDeductible () throws LookupException,NumberFormatException {
	  this.BOP.setStandardDeductible(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("StandardDeductible",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_CommonRatingSub3 ()  {
	  
	TotBldgPremium();
	
	bOPFunctlBusnPrsnlPropValtnCoveragePremium_1();
	
	TotBusnPrsnlPropPremium();
	
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPComputerFraudFundsTransferFraudCoverageList != null && this.BOPComputerFraudFundsTransferFraudCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPComputerFraudFundsTransferFraudCoverage BOPComputerFraudFundsTransferFraudCoverage : BOPComputerFraudFundsTransferFraudCoverageList) {
				finalPremium = finalPremium + BOPComputerFraudFundsTransferFraudCoverage.getPremium();
			}
		}
		if(this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList != null && this.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList.size() > 0){
			for(com.nest.res.bop.domain.BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition : BOPAmendmentOfPersonalAndAdvertisingInjuryDefinitionList) {
				finalPremium = finalPremium + BOPAmendmentOfPersonalAndAdvertisingInjuryDefinition.getPremium();
			}
		}
		if(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList != null && this.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract : BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContractList) {
				finalPremium = finalPremium + BOPAddlInsdOwnersLesseesContractorsAddlInsdRequirementConstrctnContract.getPremium();
			}
		}
		if(this.BOPLimitedFungiBacteriaCovList != null && this.BOPLimitedFungiBacteriaCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitedFungiBacteriaCov BOPLimitedFungiBacteriaCov : BOPLimitedFungiBacteriaCovList) {
				finalPremium = finalPremium + BOPLimitedFungiBacteriaCov.getPremium();
			}
		}
		if(this.BOPLimitationsOfCovForCertfdActsTerrsmList != null && this.BOPLimitationsOfCovForCertfdActsTerrsmList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitationsOfCovForCertfdActsTerrsm BOPLimitationsOfCovForCertfdActsTerrsm : BOPLimitationsOfCovForCertfdActsTerrsmList) {
				finalPremium = finalPremium + BOPLimitationsOfCovForCertfdActsTerrsm.getPremium();
			}
		}
		if(this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList != null && this.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage : BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverageList) {
				finalPremium = finalPremium + BOPPaymentCardIndustryForDefenseExpensesAndFinesOrPenaltiesCoverage.getPremium();
			}
		}
		if(this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList != null && this.BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList.size() > 0){
			for(com.nest.res.bop.domain.BOPLiquorLiabCovBringYourOwnAlcoholEstablishments BOPLiquorLiabCovBringYourOwnAlcoholEstablishments : BOPLiquorLiabCovBringYourOwnAlcoholEstablishmentsList) {
				finalPremium = finalPremium + BOPLiquorLiabCovBringYourOwnAlcoholEstablishments.getPremium();
			}
		}
		if(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsList != null && this.BOPY2KComputerRelatedProblemsLimitedCovOptionsList.size() > 0){
			for(com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptions : BOPY2KComputerRelatedProblemsLimitedCovOptionsList) {
				finalPremium = finalPremium + BOPY2KComputerRelatedProblemsLimitedCovOptions.getPremium();
			}
		}
		if(this.BOPEmploymentRelatedPracticesLiabilityCovList != null && this.BOPEmploymentRelatedPracticesLiabilityCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPEmploymentRelatedPracticesLiabilityCov BOPEmploymentRelatedPracticesLiabilityCov : BOPEmploymentRelatedPracticesLiabilityCovList) {
				finalPremium = finalPremium + BOPEmploymentRelatedPracticesLiabilityCov.getPremium();
			}
		}
		if(this.BOPCannabisLiabilityExclusionWithHempExceptionList != null && this.BOPCannabisLiabilityExclusionWithHempExceptionList.size() > 0){
			for(com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempException BOPCannabisLiabilityExclusionWithHempException : BOPCannabisLiabilityExclusionWithHempExceptionList) {
				finalPremium = finalPremium + BOPCannabisLiabilityExclusionWithHempException.getPremium();
			}
		}
		if(this.BOPBeautySalonsProflLiabList != null && this.BOPBeautySalonsProflLiabList.size() > 0){
			for(com.nest.res.bop.domain.BOPBeautySalonsProflLiab BOPBeautySalonsProflLiab : BOPBeautySalonsProflLiabList) {
				finalPremium = finalPremium + BOPBeautySalonsProflLiab.getPremium();
			}
		}
		if(this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList != null && this.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList.size() > 0){
			for(com.nest.res.bop.domain.BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions : BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptionsList) {
				finalPremium = finalPremium + BOPCannabisLiabilityExclusionWithHempAndLessorsRiskExceptions.getPremium();
			}
		}
		if(this.BOPBusnIncomeOrdinaryPayrollBldgCoverageList != null && this.BOPBusnIncomeOrdinaryPayrollBldgCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBldgCoverage BOPBusnIncomeOrdinaryPayrollBldgCoverage : BOPBusnIncomeOrdinaryPayrollBldgCoverageList) {
				finalPremium = finalPremium + BOPBusnIncomeOrdinaryPayrollBldgCoverage.getPremium();
			}
		}
		if(this.BOPExclusionUnmannedAircraftList != null && this.BOPExclusionUnmannedAircraftList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclusionUnmannedAircraft BOPExclusionUnmannedAircraft : BOPExclusionUnmannedAircraftList) {
				finalPremium = finalPremium + BOPExclusionUnmannedAircraft.getPremium();
			}
		}
		if(this.BOPExclProductsCompletedOpsHzdList != null && this.BOPExclProductsCompletedOpsHzdList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclProductsCompletedOpsHzd BOPExclProductsCompletedOpsHzd : BOPExclProductsCompletedOpsHzdList) {
				finalPremium = finalPremium + BOPExclProductsCompletedOpsHzd.getPremium();
			}
		}
		if(this.BOPTotPolltnExclList != null && this.BOPTotPolltnExclList.size() > 0){
			for(com.nest.res.bop.domain.BOPTotPolltnExcl BOPTotPolltnExcl : BOPTotPolltnExclList) {
				finalPremium = finalPremium + BOPTotPolltnExcl.getPremium();
			}
		}
		if(this.BOPCannabisLiabilityExclusionList != null && this.BOPCannabisLiabilityExclusionList.size() > 0){
			for(com.nest.res.bop.domain.BOPCannabisLiabilityExclusion BOPCannabisLiabilityExclusion : BOPCannabisLiabilityExclusionList) {
				finalPremium = finalPremium + BOPCannabisLiabilityExclusion.getPremium();
			}
		}
		if(this.BOPAddlLiabExposuresCoverageList != null && this.BOPAddlLiabExposuresCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlLiabExposuresCoverage BOPAddlLiabExposuresCoverage : BOPAddlLiabExposuresCoverageList) {
				finalPremium = finalPremium + BOPAddlLiabExposuresCoverage.getPremium();
			}
		}
		if(this.BOPDesignatedLocsGenlAggLimitList != null && this.BOPDesignatedLocsGenlAggLimitList.size() > 0){
			for(com.nest.res.bop.domain.BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimit : BOPDesignatedLocsGenlAggLimitList) {
				finalPremium = finalPremium + BOPDesignatedLocsGenlAggLimit.getPremium();
			}
		}
		if(this.BOPAmendmentLiquorLiabExclExcptnList != null && this.BOPAmendmentLiquorLiabExclExcptnList.size() > 0){
			for(com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptn : BOPAmendmentLiquorLiabExclExcptnList) {
				finalPremium = finalPremium + BOPAmendmentLiquorLiabExclExcptn.getPremium();
			}
		}
		if(this.BOPAbuseMolestationExclList != null && this.BOPAbuseMolestationExclList.size() > 0){
			for(com.nest.res.bop.domain.BOPAbuseMolestationExcl BOPAbuseMolestationExcl : BOPAbuseMolestationExclList) {
				finalPremium = finalPremium + BOPAbuseMolestationExcl.getPremium();
			}
		}
		if(this.BOPDiscretionaryPayrollExpenseList != null && this.BOPDiscretionaryPayrollExpenseList.size() > 0){
			for(com.nest.res.bop.domain.BOPDiscretionaryPayrollExpense BOPDiscretionaryPayrollExpense : BOPDiscretionaryPayrollExpenseList) {
				finalPremium = finalPremium + BOPDiscretionaryPayrollExpense.getPremium();
			}
		}
		if(this.BOPFungiBacteriaExclusionLiabilityList != null && this.BOPFungiBacteriaExclusionLiabilityList.size() > 0){
			for(com.nest.res.bop.domain.BOPFungiBacteriaExclusionLiability BOPFungiBacteriaExclusionLiability : BOPFungiBacteriaExclusionLiabilityList) {
				finalPremium = finalPremium + BOPFungiBacteriaExclusionLiability.getPremium();
			}
		}
		if(this.BOPPharmacistsList != null && this.BOPPharmacistsList.size() > 0){
			for(com.nest.res.bop.domain.BOPPharmacists BOPPharmacists : BOPPharmacistsList) {
				finalPremium = finalPremium + BOPPharmacists.getPremium();
			}
		}
		if(this.BOPHiredNonOwnedAutoList != null && this.BOPHiredNonOwnedAutoList.size() > 0){
			for(com.nest.res.bop.domain.BOPHiredNonOwnedAuto BOPHiredNonOwnedAuto : BOPHiredNonOwnedAutoList) {
				finalPremium = finalPremium + BOPHiredNonOwnedAuto.getPremium();
			}
		}
		if(this.BOPInformationSecurityProtectionEndorsementList != null && this.BOPInformationSecurityProtectionEndorsementList.size() > 0){
			for(com.nest.res.bop.domain.BOPInformationSecurityProtectionEndorsement BOPInformationSecurityProtectionEndorsement : BOPInformationSecurityProtectionEndorsementList) {
				finalPremium = finalPremium + BOPInformationSecurityProtectionEndorsement.getPremium();
			}
		}
		if(this.BOPExclDesignatedWorkList != null && this.BOPExclDesignatedWorkList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclDesignatedWork BOPExclDesignatedWork : BOPExclDesignatedWorkList) {
				finalPremium = finalPremium + BOPExclDesignatedWork.getPremium();
			}
		}
		if(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList != null && this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps : BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOpsList) {
				finalPremium = finalPremium + BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfDesignatedSitesOrOps.getPremium();
			}
		}
		if(this.BOPEmpBenefitsLiabCovList != null && this.BOPEmpBenefitsLiabCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCov : BOPEmpBenefitsLiabCovList) {
				finalPremium = finalPremium + BOPEmpBenefitsLiabCov.getPremium();
			}
		}
		if(this.BOPExtddReportingPeriodEmpBenefitsLiabCovList != null && this.BOPExtddReportingPeriodEmpBenefitsLiabCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCov : BOPExtddReportingPeriodEmpBenefitsLiabCovList) {
				finalPremium = finalPremium + BOPExtddReportingPeriodEmpBenefitsLiabCov.getPremium();
			}
		}
		if(this.BOPContrctrsInstalltnToolsAndEquipmtCovList != null && this.BOPContrctrsInstalltnToolsAndEquipmtCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPContrctrsInstalltnToolsAndEquipmtCov BOPContrctrsInstalltnToolsAndEquipmtCov : BOPContrctrsInstalltnToolsAndEquipmtCovList) {
				finalPremium = finalPremium + BOPContrctrsInstalltnToolsAndEquipmtCov.getPremium();
			}
		}
		if(this.BOPElectronicDataCoverageList != null && this.BOPElectronicDataCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPElectronicDataCoverage BOPElectronicDataCoverage : BOPElectronicDataCoverageList) {
				finalPremium = finalPremium + BOPElectronicDataCoverage.getPremium();
			}
		}
		if(this.BOPBarbersBeauticiansProflLiabList != null && this.BOPBarbersBeauticiansProflLiabList.size() > 0){
			for(com.nest.res.bop.domain.BOPBarbersBeauticiansProflLiab BOPBarbersBeauticiansProflLiab : BOPBarbersBeauticiansProflLiabList) {
				finalPremium = finalPremium + BOPBarbersBeauticiansProflLiab.getPremium();
			}
		}
		if(this.BOPExclPersonalAdvertisingInjuryList != null && this.BOPExclPersonalAdvertisingInjuryList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjury : BOPExclPersonalAdvertisingInjuryList) {
				finalPremium = finalPremium + BOPExclPersonalAdvertisingInjury.getPremium();
			}
		}
		if(this.BOPForgeryAlterationCoverageList != null && this.BOPForgeryAlterationCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPForgeryAlterationCoverage BOPForgeryAlterationCoverage : BOPForgeryAlterationCoverageList) {
				finalPremium = finalPremium + BOPForgeryAlterationCoverage.getPremium();
			}
		}
		if(this.BOPAddlInsdDesignatedPersonOrgList != null && this.BOPAddlInsdDesignatedPersonOrgList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdDesignatedPersonOrg BOPAddlInsdDesignatedPersonOrg : BOPAddlInsdDesignatedPersonOrgList) {
				finalPremium = finalPremium + BOPAddlInsdDesignatedPersonOrg.getPremium();
			}
		}
		if(this.BOPLiquorLiabList != null && this.BOPLiquorLiabList.size() > 0){
			for(com.nest.res.bop.domain.BOPLiquorLiab BOPLiquorLiab : BOPLiquorLiabList) {
				finalPremium = finalPremium + BOPLiquorLiab.getPremium();
			}
		}
		if(this.BOPEmployeeDishonestyNamedEmployeesList != null && this.BOPEmployeeDishonestyNamedEmployeesList.size() > 0){
			for(com.nest.res.bop.domain.BOPEmployeeDishonestyNamedEmployees BOPEmployeeDishonestyNamedEmployees : BOPEmployeeDishonestyNamedEmployeesList) {
				finalPremium = finalPremium + BOPEmployeeDishonestyNamedEmployees.getPremium();
			}
		}
		if(this.BOPLimitedCoverageForDesignatedUnmannedAircraftList != null && this.BOPLimitedCoverageForDesignatedUnmannedAircraftList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft : BOPLimitedCoverageForDesignatedUnmannedAircraftList) {
				finalPremium = finalPremium + BOPLimitedCoverageForDesignatedUnmannedAircraft.getPremium();
			}
		}
		if(this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList != null && this.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList.size() > 0){
			for(com.nest.res.bop.domain.BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees : BOPDishonestMaliciousOrFraudulantActsCommittedByEmployeesList) {
				finalPremium = finalPremium + BOPDishonestMaliciousOrFraudulantActsCommittedByEmployees.getPremium();
			}
		}
		if(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovList != null && this.BOPY2KComputerRelatedProblemsExclSpecifiedCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCov : BOPY2KComputerRelatedProblemsExclSpecifiedCovList) {
				finalPremium = finalPremium + BOPY2KComputerRelatedProblemsExclSpecifiedCov.getPremium();
			}
		}
		if(this.BOPPhotographyMakeupAndHairstylingList != null && this.BOPPhotographyMakeupAndHairstylingList.size() > 0){
			for(com.nest.res.bop.domain.BOPPhotographyMakeupAndHairstyling BOPPhotographyMakeupAndHairstyling : BOPPhotographyMakeupAndHairstylingList) {
				finalPremium = finalPremium + BOPPhotographyMakeupAndHairstyling.getPremium();
			}
		}
		if(this.BOPExclDesignatedProductsList != null && this.BOPExclDesignatedProductsList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclDesignatedProducts BOPExclDesignatedProducts : BOPExclDesignatedProductsList) {
				finalPremium = finalPremium + BOPExclDesignatedProducts.getPremium();
			}
		}
		if(this.BOPTheftOfClientsPropertyList != null && this.BOPTheftOfClientsPropertyList.size() > 0){
			for(com.nest.res.bop.domain.BOPTheftOfClientsProperty BOPTheftOfClientsProperty : BOPTheftOfClientsPropertyList) {
				finalPremium = finalPremium + BOPTheftOfClientsProperty.getPremium();
			}
		}
		if(this.BOPLocationList != null && this.BOPLocationList.size() > 0){
			for(com.nest.res.bop.domain.BOPLocation BOPLocation : BOPLocationList) {
				finalPremium = finalPremium + BOPLocation.getPremium();
			}
		}
		if(this.BOPBusnIncomeExtddPeriodBldgCoverageList != null && this.BOPBusnIncomeExtddPeriodBldgCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBldgCoverage BOPBusnIncomeExtddPeriodBldgCoverage : BOPBusnIncomeExtddPeriodBldgCoverageList) {
				finalPremium = finalPremium + BOPBusnIncomeExtddPeriodBldgCoverage.getPremium();
			}
		}
		if(this.BOPCannabisPropertyExclusionWithHempExceptionList != null && this.BOPCannabisPropertyExclusionWithHempExceptionList.size() > 0){
			for(com.nest.res.bop.domain.BOPCannabisPropertyExclusionWithHempException BOPCannabisPropertyExclusionWithHempException : BOPCannabisPropertyExclusionWithHempExceptionList) {
				finalPremium = finalPremium + BOPCannabisPropertyExclusionWithHempException.getPremium();
			}
		}
		if(this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList != null && this.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems : BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblemsList) {
				finalPremium = finalPremium + BOPBusinessIncomeExtraExpenseY2KComputerRelatedProblems.getPremium();
			}
		}
		if(this.BOPElectronicCommerceList != null && this.BOPElectronicCommerceList.size() > 0){
			for(com.nest.res.bop.domain.BOPElectronicCommerce BOPElectronicCommerce : BOPElectronicCommerceList) {
				finalPremium = finalPremium + BOPElectronicCommerce.getPremium();
			}
		}
		if(this.BOPPolltnExclLimitedExcptnForDesignatedPollutantsList != null && this.BOPPolltnExclLimitedExcptnForDesignatedPollutantsList.size() > 0){
			for(com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForDesignatedPollutants BOPPolltnExclLimitedExcptnForDesignatedPollutants : BOPPolltnExclLimitedExcptnForDesignatedPollutantsList) {
				finalPremium = finalPremium + BOPPolltnExclLimitedExcptnForDesignatedPollutants.getPremium();
			}
		}
		if(this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList != null && this.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage : BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPBusnIncomeExtddPeriodBusnPrsnlPropCoverage.getPremium();
			}
		}
		if(this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList != null && this.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf : BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalfList) {
				finalPremium = finalPremium + BOPExclDmgToWorkPerfdBySubcontractorsOnYourBehalf.getPremium();
			}
		}
		if(this.BOPAmendmentAggLimitsOfInsPerProjectList != null && this.BOPAmendmentAggLimitsOfInsPerProjectList.size() > 0){
			for(com.nest.res.bop.domain.BOPAmendmentAggLimitsOfInsPerProject BOPAmendmentAggLimitsOfInsPerProject : BOPAmendmentAggLimitsOfInsPerProjectList) {
				finalPremium = finalPremium + BOPAmendmentAggLimitsOfInsPerProject.getPremium();
			}
		}
		if(this.BOPCannabisPropertyExclusionList != null && this.BOPCannabisPropertyExclusionList.size() > 0){
			for(com.nest.res.bop.domain.BOPCannabisPropertyExclusion BOPCannabisPropertyExclusion : BOPCannabisPropertyExclusionList) {
				finalPremium = finalPremium + BOPCannabisPropertyExclusion.getPremium();
			}
		}
		if(this.BOPIDFraudExpenseCovList != null && this.BOPIDFraudExpenseCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPIDFraudExpenseCov BOPIDFraudExpenseCov : BOPIDFraudExpenseCovList) {
				finalPremium = finalPremium + BOPIDFraudExpenseCov.getPremium();
			}
		}
		if(this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList != null && this.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage : BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverageList) {
				finalPremium = finalPremium + BOPBusnIncomeOrdinaryPayrollBusnPrsnlPropCoverage.getPremium();
			}
		}
		if(this.BOPLimitedPolltnLiabExtList != null && this.BOPLimitedPolltnLiabExtList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitedPolltnLiabExt BOPLimitedPolltnLiabExt : BOPLimitedPolltnLiabExtList) {
				finalPremium = finalPremium + BOPLimitedPolltnLiabExt.getPremium();
			}
		}
		if(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList != null && this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly : BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnlyList) {
				finalPremium = finalPremium + BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoPrsnlAndAdvertisingInjuryOnly.getPremium();
			}
		}
		if(this.BOPAmendmentInsuredContractDefinitionList != null && this.BOPAmendmentInsuredContractDefinitionList.size() > 0){
			for(com.nest.res.bop.domain.BOPAmendmentInsuredContractDefinition BOPAmendmentInsuredContractDefinition : BOPAmendmentInsuredContractDefinitionList) {
				finalPremium = finalPremium + BOPAmendmentInsuredContractDefinition.getPremium();
			}
		}
		if(this.BOPCapLossesFromCertfdActsTerrsmList != null && this.BOPCapLossesFromCertfdActsTerrsmList.size() > 0){
			for(com.nest.res.bop.domain.BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsm : BOPCapLossesFromCertfdActsTerrsmList) {
				finalPremium = finalPremium + BOPCapLossesFromCertfdActsTerrsm.getPremium();
			}
		}
		if(this.BOPIRPMList != null && this.BOPIRPMList.size() > 0){
			for(com.nest.res.bop.domain.BOPIRPM BOPIRPM : BOPIRPMList) {
				finalPremium = finalPremium + BOPIRPM.getPremium();
			}
		}
		if(this.BOPCoverageInjuryLeasedWorkersList != null && this.BOPCoverageInjuryLeasedWorkersList.size() > 0){
			for(com.nest.res.bop.domain.BOPCoverageInjuryLeasedWorkers BOPCoverageInjuryLeasedWorkers : BOPCoverageInjuryLeasedWorkersList) {
				finalPremium = finalPremium + BOPCoverageInjuryLeasedWorkers.getPremium();
			}
		}
		if(this.BOPAbuseOrMolestationExclSpecdSrvcsList != null && this.BOPAbuseOrMolestationExclSpecdSrvcsList.size() > 0){
			for(com.nest.res.bop.domain.BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcs : BOPAbuseOrMolestationExclSpecdSrvcsList) {
				finalPremium = finalPremium + BOPAbuseOrMolestationExclSpecdSrvcs.getPremium();
			}
		}
		if(this.BOPExclExtrInsulationAndFinishingSysList != null && this.BOPExclExtrInsulationAndFinishingSysList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSys : BOPExclExtrInsulationAndFinishingSysList) {
				finalPremium = finalPremium + BOPExclExtrInsulationAndFinishingSys.getPremium();
			}
		}
		if(this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList != null && this.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList.size() > 0){
			for(com.nest.res.bop.domain.BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn : BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptnList) {
				finalPremium = finalPremium + BOPTotPolltnExclBldgHeatingEquipmtExcptnHostileFireExcptn.getPremium();
			}
		}
		if(this.BOPApartmentBuildingsTotalTenantsAutosList != null && this.BOPApartmentBuildingsTotalTenantsAutosList.size() > 0){
			for(com.nest.res.bop.domain.BOPApartmentBuildingsTotalTenantsAutos BOPApartmentBuildingsTotalTenantsAutos : BOPApartmentBuildingsTotalTenantsAutosList) {
				finalPremium = finalPremium + BOPApartmentBuildingsTotalTenantsAutos.getPremium();
			}
		}
		if(this.BOPRestaurantsTotalCustomersAutosList != null && this.BOPRestaurantsTotalCustomersAutosList.size() > 0){
			for(com.nest.res.bop.domain.BOPRestaurantsTotalCustomersAutos BOPRestaurantsTotalCustomersAutos : BOPRestaurantsTotalCustomersAutosList) {
				finalPremium = finalPremium + BOPRestaurantsTotalCustomersAutos.getPremium();
			}
		}
		if(this.BOPPhotographyList != null && this.BOPPhotographyList.size() > 0){
			for(com.nest.res.bop.domain.BOPPhotography BOPPhotography : BOPPhotographyList) {
				finalPremium = finalPremium + BOPPhotography.getPremium();
			}
		}
		if(this.BOPEmployeeDishtyCoverageList != null && this.BOPEmployeeDishtyCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPEmployeeDishtyCoverage BOPEmployeeDishtyCoverage : BOPEmployeeDishtyCoverageList) {
				finalPremium = finalPremium + BOPEmployeeDishtyCoverage.getPremium();
			}
		}
		if(this.BOPTerrorismCoverageList != null && this.BOPTerrorismCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPTerrorismCoverage BOPTerrorismCoverage : BOPTerrorismCoverageList) {
				finalPremium = finalPremium + BOPTerrorismCoverage.getPremium();
			}
		}
		if(this.BOPInterruptionComputerOpsCoverageList != null && this.BOPInterruptionComputerOpsCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverage : BOPInterruptionComputerOpsCoverageList) {
				finalPremium = finalPremium + BOPInterruptionComputerOpsCoverage.getPremium();
			}
		}
		if(this.BOPFuneralDirectorsProflLiabList != null && this.BOPFuneralDirectorsProflLiabList.size() > 0){
			for(com.nest.res.bop.domain.BOPFuneralDirectorsProflLiab BOPFuneralDirectorsProflLiab : BOPFuneralDirectorsProflLiabList) {
				finalPremium = finalPremium + BOPFuneralDirectorsProflLiab.getPremium();
			}
		}
		if(this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList != null && this.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded : BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncludedList) {
				finalPremium = finalPremium + BOPExclAccessOrDisclosureOfConfidentialOrPrsnlInfoAndDataRelatedLiabLimitedBodilyInjuryExceptionNotIncluded.getPremium();
			}
		}
		if(this.BOPLiquorLiabCovList != null && this.BOPLiquorLiabCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPLiquorLiabCov BOPLiquorLiabCov : BOPLiquorLiabCovList) {
				finalPremium = finalPremium + BOPLiquorLiabCov.getPremium();
			}
		}
		if(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList != null && this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList.size() > 0){
			for(com.nest.res.bop.domain.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyers : BOPLmtdExclPersonalAndAdvertisingInjuryLawyersList) {
				finalPremium = finalPremium + BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.getPremium();
			}
		}
		if(this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList != null && this.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract : BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContractList) {
				finalPremium = finalPremium + BOPAddlInsdOwnersLesseesContractorsAddlInsdReqForOtherPartiesInConstrctnContract.getPremium();
			}
		}
		if(this.BOPVeterinariansProflLiabList != null && this.BOPVeterinariansProflLiabList.size() > 0){
			for(com.nest.res.bop.domain.BOPVeterinariansProflLiab BOPVeterinariansProflLiab : BOPVeterinariansProflLiabList) {
				finalPremium = finalPremium + BOPVeterinariansProflLiab.getPremium();
			}
		}
		if(this.BOPAddlInsdVendorsList != null && this.BOPAddlInsdVendorsList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdVendors BOPAddlInsdVendors : BOPAddlInsdVendorsList) {
				finalPremium = finalPremium + BOPAddlInsdVendors.getPremium();
			}
		}
		if(this.BOPDesignatedConstructionProjectsGenlAggLimitList != null && this.BOPDesignatedConstructionProjectsGenlAggLimitList.size() > 0){
			for(com.nest.res.bop.domain.BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimit : BOPDesignatedConstructionProjectsGenlAggLimitList) {
				finalPremium = finalPremium + BOPDesignatedConstructionProjectsGenlAggLimit.getPremium();
			}
		}
		if(this.BOPPolltnExclLimitedExcptnForShortTermEventList != null && this.BOPPolltnExclLimitedExcptnForShortTermEventList.size() > 0){
			for(com.nest.res.bop.domain.BOPPolltnExclLimitedExcptnForShortTermEvent BOPPolltnExclLimitedExcptnForShortTermEvent : BOPPolltnExclLimitedExcptnForShortTermEventList) {
				finalPremium = finalPremium + BOPPolltnExclLimitedExcptnForShortTermEvent.getPremium();
			}
		}
		if(this.BOPPrintersErrorsOmissionsList != null && this.BOPPrintersErrorsOmissionsList.size() > 0){
			for(com.nest.res.bop.domain.BOPPrintersErrorsOmissions BOPPrintersErrorsOmissions : BOPPrintersErrorsOmissionsList) {
				finalPremium = finalPremium + BOPPrintersErrorsOmissions.getPremium();
			}
		}
		if(this.BOPExclCertfdActsTerrsmCovFireLossesList != null && this.BOPExclCertfdActsTerrsmCovFireLossesList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLosses : BOPExclCertfdActsTerrsmCovFireLossesList) {
				finalPremium = finalPremium + BOPExclCertfdActsTerrsmCovFireLosses.getPremium();
			}
		}
		if(this.BOPCommunicableDiseaseExclusionList != null && this.BOPCommunicableDiseaseExclusionList.size() > 0){
			for(com.nest.res.bop.domain.BOPCommunicableDiseaseExclusion BOPCommunicableDiseaseExclusion : BOPCommunicableDiseaseExclusionList) {
				finalPremium = finalPremium + BOPCommunicableDiseaseExclusion.getPremium();
			}
		}
		if(this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList != null && this.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList.size() > 0){
			for(com.nest.res.bop.domain.BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage : BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverageList) {
				finalPremium = finalPremium + BOPPhotographyAmendmentOfCoverageTerritoryForPhotographicEquipmentWorldwideCoverage.getPremium();
			}
		}
		if(this.BOPNewlyAcquiredOrganizationsList != null && this.BOPNewlyAcquiredOrganizationsList.size() > 0){
			for(com.nest.res.bop.domain.BOPNewlyAcquiredOrganizations BOPNewlyAcquiredOrganizations : BOPNewlyAcquiredOrganizationsList) {
				finalPremium = finalPremium + BOPNewlyAcquiredOrganizations.getPremium();
			}
		}
		if(this.BOPEmploymentRelatedPracticesExclList != null && this.BOPEmploymentRelatedPracticesExclList.size() > 0){
			for(com.nest.res.bop.domain.BOPEmploymentRelatedPracticesExcl BOPEmploymentRelatedPracticesExcl : BOPEmploymentRelatedPracticesExclList) {
				finalPremium = finalPremium + BOPEmploymentRelatedPracticesExcl.getPremium();
			}
		}
		if(this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList != null && this.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd : BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsdList) {
				finalPremium = finalPremium + BOPAddlInsdEngineersArchitectsSurveyorsNotEngagedByNamedInsd.getPremium();
			}
		}
		if(this.BOPDisclosurePursuantToTRIA2002List != null && this.BOPDisclosurePursuantToTRIA2002List.size() > 0){
			for(com.nest.res.bop.domain.BOPDisclosurePursuantToTRIA2002 BOPDisclosurePursuantToTRIA2002 : BOPDisclosurePursuantToTRIA2002List) {
				finalPremium = finalPremium + BOPDisclosurePursuantToTRIA2002.getPremium();
			}
		}
		if(this.BOPOpticalHearingAidList != null && this.BOPOpticalHearingAidList.size() > 0){
			for(com.nest.res.bop.domain.BOPOpticalHearingAid BOPOpticalHearingAid : BOPOpticalHearingAidList) {
				finalPremium = finalPremium + BOPOpticalHearingAid.getPremium();
			}
		}
		if(this.BOPLimitedFungiBacteriaCovLiabilityList != null && this.BOPLimitedFungiBacteriaCovLiabilityList.size() > 0){
			for(com.nest.res.bop.domain.BOPLimitedFungiBacteriaCovLiability BOPLimitedFungiBacteriaCovLiability : BOPLimitedFungiBacteriaCovLiabilityList) {
				finalPremium = finalPremium + BOPLimitedFungiBacteriaCovLiability.getPremium();
			}
		}
		if(this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList != null && this.BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList.size() > 0){
			for(com.nest.res.bop.domain.BOPAddlInsdOwnersLesseesOrContrctrsCompldOps BOPAddlInsdOwnersLesseesOrContrctrsCompldOps : BOPAddlInsdOwnersLesseesOrContrctrsCompldOpsList) {
				finalPremium = finalPremium + BOPAddlInsdOwnersLesseesOrContrctrsCompldOps.getPremium();
			}
		}
		if(this.BOPSnowPlowProdsCompldOpsHzdCovList != null && this.BOPSnowPlowProdsCompldOpsHzdCovList.size() > 0){
			for(com.nest.res.bop.domain.BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCov : BOPSnowPlowProdsCompldOpsHzdCovList) {
				finalPremium = finalPremium + BOPSnowPlowProdsCompldOpsHzdCov.getPremium();
			}
		}
		if(this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList != null && this.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList.size() > 0){
			for(com.nest.res.bop.domain.BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses : BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLossesList) {
				finalPremium = finalPremium + BOPExclCertfdActsTerrsmInvolvingNuclearBiolgclChmclTerrsmCapOnCoveredCertfdActsLosses.getPremium();
			}
		}
		if(this.BOPBusnIncomeChangesTimePeriodList != null && this.BOPBusnIncomeChangesTimePeriodList.size() > 0){
			for(com.nest.res.bop.domain.BOPBusnIncomeChangesTimePeriod BOPBusnIncomeChangesTimePeriod : BOPBusnIncomeChangesTimePeriodList) {
				finalPremium = finalPremium + BOPBusnIncomeChangesTimePeriod.getPremium();
			}
		}
		if(this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList != null && this.BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList.size() > 0){
			for(com.nest.res.bop.domain.BOPCondosCoOpsAssocsDirectorsAndOfficersLiab BOPCondosCoOpsAssocsDirectorsAndOfficersLiab : BOPCondosCoOpsAssocsDirectorsAndOfficersLiabList) {
				finalPremium = finalPremium + BOPCondosCoOpsAssocsDirectorsAndOfficersLiab.getPremium();
			}
		}
this.BOP.setPremium(finalPremium) ;
	  
	}
	public void CommercialAutoLCM () throws LookupException,NumberFormatException {
	  this.BOP.setCommercialAutoLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CommercialAutoLCM",String.valueOf( "Y"))));

	  
	}
	public void ProfessionalLiabilityLCM () throws LookupException,NumberFormatException {
	  this.BOP.setProfessionalLiabilityLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ProfessionalLiabilityLCM",String.valueOf( "Y"))));

	  
	}
	public void BusnIncomeOrdinaryPayrollFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOP.getBusnIncomeOrdinaryPayrollNumDays().equals((String)"60") && !this.BOP.getBusnIncomeOrdinaryPayrollNumDays().equals((String)"")){
			this.BOP.setBusnIncomeOrdinaryPayrollFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeOrdinaryPayrollFactor",String.valueOf(BOP.getBusnIncomeOrdinaryPayrollNumDays()))));
		}
		else{
		if(this.BOP.getBusnIncomeOrdinaryPayrollNumDays().equals((String)"60")){
			this.BOP.setBusnIncomeOrdinaryPayrollFactor((double)1.0);
		}
		else{
			this.BOP.setBusnIncomeOrdinaryPayrollFactor((double)0.0);
		}
		}
	  
	}
	public void IRPMFactor ()  {
	  
		if(this.BOP.getIRPMApply().equals((String)"No")){
			this.BOP.setIRPMFactor((double)1.0);
		}
		else{
		if(XpathNode.selectNodes(this.BOP,"BOPIRPM").size() > 0.0){
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOP,"BOPIRPM/TotalModificationPct"))) > (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOP,"BOPIRPM/MaxDebit")))){
			this.BOP.setIRPMFactor((double)1.25);
		}
		else{
		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOP,"BOPIRPM/TotalModificationPct"))) < (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOP,"BOPIRPM/MaxCredit")))){
			this.BOP.setIRPMFactor((double)0.75);
		}
		else{
			this.BOP.setIRPMFactor(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOP,"BOPIRPM/TotalModificationPct"))) / (double)100.0) + (double)1.0);
		}
		}
		}
		else{
			this.BOP.setIRPMFactor((double)1.0);
		}
		}
	  
	}
	public void CommercialPropertyLCM () throws LookupException,NumberFormatException {
	  this.BOP.setCommercialPropertyLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CommercialPropertyLCM",String.valueOf( "Y"))));

	  
	}
	public void LiquorLiabGrade () throws LookupException,NumberFormatException {
	  this.BOP.setLiquorLiabGrade(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("LiquorLiabGrade",String.valueOf( "Y"))));

	  
	}
	public void TotBldgPremium ()  {
	  this.BOP.setTotBldgPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOP,"BOPLocation/BOPStructure/BOPStructureBuildingCoverage") ){
			this.BOP.setTotBldgPremium(this.BOP.getTotBldgPremium()+this.BOP.getTotBldgPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}

	  
	}
	public void bOPFunctlBusnPrsnlPropValtnCoveragePremium_1 ()  {
	  this.BOP.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOP,"BOPLocation/BOPStructure/BOPClassification/BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOP.setBOPFunctlBusnPrsnlPropValtnCoveragePremium_1(Double.valueOf(this.BOP.getBOPFunctlBusnPrsnlPropValtnCoveragePremium_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}		}

	  
	}
	public void ProcessPremium1_CommonRatingSub2 () throws LookupException,NumberFormatException {
	  
	PropDamageLiabDedFactor();
	
	LiquorLiabGrade();
	
	  
	}
	public void GeneralLiabilityLCM () throws LookupException,NumberFormatException {
	  this.BOP.setGeneralLiabilityLCM(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("GeneralLiabilityLCM",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}