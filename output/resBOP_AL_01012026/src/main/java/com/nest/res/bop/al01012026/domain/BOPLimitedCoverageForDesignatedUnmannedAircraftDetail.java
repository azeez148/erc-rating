package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPLimitedCoverageForDesignatedUnmannedAircraftDetail    extends Policy  {
	private String OwnedAndOperatedByTheInsured;
	private String TowingSignsDistributionOfMaterials;
	private String PrivateLand;
	private Date ExpirationDt;
	private double Premium;
	private String PriorId;
	private String Unknown;
	private double EvaluatedPremium;
	private String NonOwnedUnmannedAircraftOperatedByOtherParties;
	private String PrimaryPlaceOfOperation;
	private int TermFactorIndicator;
	private String OwnershipAndOperationCategoryWithHighestFactor;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage> BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage;
	private String MaximumTakeOffWeight;
	private String CreatedBy;
	private String ManufacturingSalesRepairRental;
	private String TypeOfUseCategoryWithHighestFactor;
	private Date Expiration;
	private double ManualPremium;
	private String Suburban;
	private String MethodOfControl;
	private String OwnedOperatedOnInsuredsBehalfByHiredOperator;
	private String NotApplicable;
	private double ChangePremium;
	private String OwnershipAndOperationStatCode;
	private String RentedOrLeasedToOthers;
	private String MethodOfControlCode;
	private String RatingBasisStatCode;
	private String Id;
	private Date PriorRateDt;
	private int UnitNumber;
	private double ProRateFactor;
	private String EducationAndResearch;
	private String OperationsAreContractedOutToASubcontractor;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String OwnershipAndOperationUnknown;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private String OwnershipAndOperation;
	private String RentedOrLeasedToAndOperatedByTheInsured;
	private String ParentId;
	private String Rural;
	private String Usage;
	private String InsuredIsAHiredOperatorPilot;
	private double ShortRatePenalty;
	private Date Effective;
	private String Indoors;
	private String OverBodiesOfWater;
	private String EntertainmentDemosSpecEventSport;
	private int LiabilityLimitStatCode;
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String NonOwnedOperatedByOtherParties;
	private Date AddEffectiveDt;
	private Date EffectiveDt;
	private int DroneValue;
	private String CropSprayingDispersingOfChemicals;
	private String FormName;
	private int TaxIndicator;
	private int PremiumIndicator;
	private String WeatherEnvironmentalMonitoring;
	private String PrimaryPlaceOfOperationCategoryWithHighestFactor;
	private String EndorsementIdentifierCode;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String DescriptionOfUnmannedAircraft;
	private String DescriptionOfUnmannedAircraftPAI;
	private double ProRatedChangePremium;
	private String HighConcentrationOfPeopleNonEmployees;
	private double AnnualPremium;
	private Date Modified;
	private String DescriptionOfOperationsOrProjectsPAI;
	private Date RateDt;
	private String PersonalAndAdvertisingInjury;
	private String Urban;
	private String OperatorPilotTraining;
	private String OwnershipAndOperationNotApplicable;
	private String DescriptionOfUnmannedAircraftBIPD;
	private String TypeOfUseStatCode;
	private String InternetAccessOtherCommunicationServices;
	private int ProRateIndicator;
	private String WeightOfDroneStatCode;
	private double ShortRateFactor;
	private String ValuationType;
	private double ProRatedPriorPremium;
	private String DescriptionOfOperationsOrProjectsBIPD;
	private String BodilyInjuryAndPropertyDamage;
	private double PriorPremium;
	private String PrimaryPlaceOfOperationStatCode;
	private String AerialDataCollection;
	private int EarnedInFullIndicator;
	private String DeliveryOfGoodsMerchandiseCargo;
	private String EmergencyServices;
	private String OtherUsage;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage> BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage) {
			childs.addAll(BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage);
		}
		if(null != BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage) {
			childs.addAll(BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage);
		}
		return childs;
	}


	public String  getPrimaryPlaceOfOperationStatCode() {
		return this.PrimaryPlaceOfOperationStatCode;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public String  getNotApplicable() {
		return this.NotApplicable;
	}
	public String  getOverBodiesOfWater() {
		return this.OverBodiesOfWater;
	}
	public int  getUnitNumber() {
		return this.UnitNumber;
	}
	public double  getProRateFactor() {
		return this.ProRateFactor;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public String  getManufacturingSalesRepairRental() {
		return this.ManufacturingSalesRepairRental;
	}
	public String  getTypeOfUseCategoryWithHighestFactor() {
		return this.TypeOfUseCategoryWithHighestFactor;
	}
	public String  getUsage() {
		return this.Usage;
	}
	public int  getDroneValue() {
		return this.DroneValue;
	}
	public String  getNonOwnedUnmannedAircraftOperatedByOtherParties() {
		return this.NonOwnedUnmannedAircraftOperatedByOtherParties;
	}
	public String  getMethodOfControlCode() {
		return this.MethodOfControlCode;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public String  getDeliveryOfGoodsMerchandiseCargo() {
		return this.DeliveryOfGoodsMerchandiseCargo;
	}
	public String  getId() {
		return this.Id;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public String  getDescriptionOfUnmannedAircraft() {
		return this.DescriptionOfUnmannedAircraft;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getValuationType() {
		return this.ValuationType;
	}
	public String  getOwnershipAndOperation() {
		return this.OwnershipAndOperation;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getMethodOfControl() {
		return this.MethodOfControl;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public double  getProRatedPremium() {
		return this.ProRatedPremium;
	}
	public Date  getModified() {
		return this.Modified;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public String  getEducationAndResearch() {
		return this.EducationAndResearch;
	}
	public String  getMaximumTakeOffWeight() {
		return this.MaximumTakeOffWeight;
	}
	public String  getOwnershipAndOperationNotApplicable() {
		return this.OwnershipAndOperationNotApplicable;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public String  getEmergencyServices() {
		return this.EmergencyServices;
	}
	public String  getEntertainmentDemosSpecEventSport() {
		return this.EntertainmentDemosSpecEventSport;
	}
	public String  getPrimaryPlaceOfOperation() {
		return this.PrimaryPlaceOfOperation;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public String  getUrban() {
		return this.Urban;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getTypeOfUseStatCode() {
		return this.TypeOfUseStatCode;
	}
	public String  getWeatherEnvironmentalMonitoring() {
		return this.WeatherEnvironmentalMonitoring;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public String  getIndoors() {
		return this.Indoors;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public String  getOwnershipAndOperationUnknown() {
		return this.OwnershipAndOperationUnknown;
	}
	public String  getRentedOrLeasedToAndOperatedByTheInsured() {
		return this.RentedOrLeasedToAndOperatedByTheInsured;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	public String  getRural() {
		return this.Rural;
	}
	public String  getTowingSignsDistributionOfMaterials() {
		return this.TowingSignsDistributionOfMaterials;
	}
	public String  getDescriptionOfOperationsOrProjectsBIPD() {
		return this.DescriptionOfOperationsOrProjectsBIPD;
	}
	public String  getOwnedAndOperatedByTheInsured() {
		return this.OwnedAndOperatedByTheInsured;
	}
	public String  getRentedOrLeasedToOthers() {
		return this.RentedOrLeasedToOthers;
	}
	public String  getInternetAccessOtherCommunicationServices() {
		return this.InternetAccessOtherCommunicationServices;
	}
	public double  getPolicyTermPremium() {
		return this.PolicyTermPremium;
	}
	public double  getPremium() {
		return this.Premium;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getDescriptionOfUnmannedAircraftBIPD() {
		return this.DescriptionOfUnmannedAircraftBIPD;
	}
	public String  getCropSprayingDispersingOfChemicals() {
		return this.CropSprayingDispersingOfChemicals;
	}
	public String  getUnknown() {
		return this.Unknown;
	}
	public String  getPrivateLand() {
		return this.PrivateLand;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getDescriptionOfUnmannedAircraftPAI() {
		return this.DescriptionOfUnmannedAircraftPAI;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public String  getOperatorPilotTraining() {
		return this.OperatorPilotTraining;
	}
	public String  getHighConcentrationOfPeopleNonEmployees() {
		return this.HighConcentrationOfPeopleNonEmployees;
	}
	public List<BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage> getBOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage() {
		return this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage;
	}
	public String  getPersonalAndAdvertisingInjury() {
		return this.PersonalAndAdvertisingInjury;
	}
	public String  getSuburban() {
		return this.Suburban;
	}
	public int  getLiabilityLimitStatCode() {
		return this.LiabilityLimitStatCode;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public String  getRatingBasisStatCode() {
		return this.RatingBasisStatCode;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public String  getNonOwnedOperatedByOtherParties() {
		return this.NonOwnedOperatedByOtherParties;
	}
	public String  getWeightOfDroneStatCode() {
		return this.WeightOfDroneStatCode;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public double  getManualPremium() {
		return this.ManualPremium;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getBodilyInjuryAndPropertyDamage() {
		return this.BodilyInjuryAndPropertyDamage;
	}
	public String  getOperationsAreContractedOutToASubcontractor() {
		return this.OperationsAreContractedOutToASubcontractor;
	}
	public String  getOwnedOperatedOnInsuredsBehalfByHiredOperator() {
		return this.OwnedOperatedOnInsuredsBehalfByHiredOperator;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getOwnershipAndOperationStatCode() {
		return this.OwnershipAndOperationStatCode;
	}
	public List<BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage> getBOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage() {
		return this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public String  getOwnershipAndOperationCategoryWithHighestFactor() {
		return this.OwnershipAndOperationCategoryWithHighestFactor;
	}
	public String  getOtherUsage() {
		return this.OtherUsage;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public String  getAerialDataCollection() {
		return this.AerialDataCollection;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public String  getEndorsementIdentifierCode() {
		return this.EndorsementIdentifierCode;
	}
	public String  getPrimaryPlaceOfOperationCategoryWithHighestFactor() {
		return this.PrimaryPlaceOfOperationCategoryWithHighestFactor;
	}
	public String  getInsuredIsAHiredOperatorPilot() {
		return this.InsuredIsAHiredOperatorPilot;
	}
	public String  getDescriptionOfOperationsOrProjectsPAI() {
		return this.DescriptionOfOperationsOrProjectsPAI;
	}
	
	public void setOwnershipAndOperationUnknown(String OwnershipAndOperationUnknown) {
		this.OwnershipAndOperationUnknown = OwnershipAndOperationUnknown;
	}
	public void setOwnershipAndOperationCategoryWithHighestFactor(String OwnershipAndOperationCategoryWithHighestFactor) {
		this.OwnershipAndOperationCategoryWithHighestFactor = OwnershipAndOperationCategoryWithHighestFactor;
	}
	public void setOperationsAreContractedOutToASubcontractor(String OperationsAreContractedOutToASubcontractor) {
		this.OperationsAreContractedOutToASubcontractor = OperationsAreContractedOutToASubcontractor;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setLiabilityLimitStatCode(int LiabilityLimitStatCode) {
		this.LiabilityLimitStatCode = LiabilityLimitStatCode;
	}
	public void setNotApplicable(String NotApplicable) {
		this.NotApplicable = NotApplicable;
	}
	public void setTypeOfUseCategoryWithHighestFactor(String TypeOfUseCategoryWithHighestFactor) {
		this.TypeOfUseCategoryWithHighestFactor = TypeOfUseCategoryWithHighestFactor;
	}
	public void setHighConcentrationOfPeopleNonEmployees(String HighConcentrationOfPeopleNonEmployees) {
		this.HighConcentrationOfPeopleNonEmployees = HighConcentrationOfPeopleNonEmployees;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setDescriptionOfOperationsOrProjectsPAI(String DescriptionOfOperationsOrProjectsPAI) {
		this.DescriptionOfOperationsOrProjectsPAI = DescriptionOfOperationsOrProjectsPAI;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setNonOwnedUnmannedAircraftOperatedByOtherParties(String NonOwnedUnmannedAircraftOperatedByOtherParties) {
		this.NonOwnedUnmannedAircraftOperatedByOtherParties = NonOwnedUnmannedAircraftOperatedByOtherParties;
	}
	public void setPrimaryPlaceOfOperation(String PrimaryPlaceOfOperation) {
		this.PrimaryPlaceOfOperation = PrimaryPlaceOfOperation;
	}
	public void setBOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage(List<BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage> BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage) {
		this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage = BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage;
	}
	public void setOwnershipAndOperationStatCode(String OwnershipAndOperationStatCode) {
		this.OwnershipAndOperationStatCode = OwnershipAndOperationStatCode;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setInsuredIsAHiredOperatorPilot(String InsuredIsAHiredOperatorPilot) {
		this.InsuredIsAHiredOperatorPilot = InsuredIsAHiredOperatorPilot;
	}
	public void setDeliveryOfGoodsMerchandiseCargo(String DeliveryOfGoodsMerchandiseCargo) {
		this.DeliveryOfGoodsMerchandiseCargo = DeliveryOfGoodsMerchandiseCargo;
	}
	public void setManufacturingSalesRepairRental(String ManufacturingSalesRepairRental) {
		this.ManufacturingSalesRepairRental = ManufacturingSalesRepairRental;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setManualPremium(double ManualPremium) {
		this.ManualPremium = ManualPremium;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setDescriptionOfUnmannedAircraftBIPD(String DescriptionOfUnmannedAircraftBIPD) {
		this.DescriptionOfUnmannedAircraftBIPD = DescriptionOfUnmannedAircraftBIPD;
	}
	public void setOverBodiesOfWater(String OverBodiesOfWater) {
		this.OverBodiesOfWater = OverBodiesOfWater;
	}
	public void setWeatherEnvironmentalMonitoring(String WeatherEnvironmentalMonitoring) {
		this.WeatherEnvironmentalMonitoring = WeatherEnvironmentalMonitoring;
	}
	public void setRural(String Rural) {
		this.Rural = Rural;
	}
	public void setValuationType(String ValuationType) {
		this.ValuationType = ValuationType;
	}
	public void setDescriptionOfUnmannedAircraft(String DescriptionOfUnmannedAircraft) {
		this.DescriptionOfUnmannedAircraft = DescriptionOfUnmannedAircraft;
	}
	public void setChangeEffectiveDt(Date ChangeEffectiveDt) {
		this.ChangeEffectiveDt = ChangeEffectiveDt;
	}
	public void setExpirationDt(Date ExpirationDt) {
		this.ExpirationDt = ExpirationDt;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setDescriptionOfUnmannedAircraftPAI(String DescriptionOfUnmannedAircraftPAI) {
		this.DescriptionOfUnmannedAircraftPAI = DescriptionOfUnmannedAircraftPAI;
	}
	public void setBOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage(List<BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage> BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage) {
		this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage = BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage;
	}
	public void setOtherUsage(String OtherUsage) {
		this.OtherUsage = OtherUsage;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setSuburban(String Suburban) {
		this.Suburban = Suburban;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setRentedOrLeasedToOthers(String RentedOrLeasedToOthers) {
		this.RentedOrLeasedToOthers = RentedOrLeasedToOthers;
	}
	public void setPremium(double Premium) {
		this.Premium = Premium;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setMaximumTakeOffWeight(String MaximumTakeOffWeight) {
		this.MaximumTakeOffWeight = MaximumTakeOffWeight;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setUrban(String Urban) {
		this.Urban = Urban;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setMethodOfControlCode(String MethodOfControlCode) {
		this.MethodOfControlCode = MethodOfControlCode;
	}
	public void setEndorsementIdentifierCode(String EndorsementIdentifierCode) {
		this.EndorsementIdentifierCode = EndorsementIdentifierCode;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setOwnershipAndOperationNotApplicable(String OwnershipAndOperationNotApplicable) {
		this.OwnershipAndOperationNotApplicable = OwnershipAndOperationNotApplicable;
	}
	public void setOwnershipAndOperation(String OwnershipAndOperation) {
		this.OwnershipAndOperation = OwnershipAndOperation;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setAerialDataCollection(String AerialDataCollection) {
		this.AerialDataCollection = AerialDataCollection;
	}
	public void setPrivateLand(String PrivateLand) {
		this.PrivateLand = PrivateLand;
	}
	public void setWeightOfDroneStatCode(String WeightOfDroneStatCode) {
		this.WeightOfDroneStatCode = WeightOfDroneStatCode;
	}
	public void setNonOwnedOperatedByOtherParties(String NonOwnedOperatedByOtherParties) {
		this.NonOwnedOperatedByOtherParties = NonOwnedOperatedByOtherParties;
	}
	public void setOwnedOperatedOnInsuredsBehalfByHiredOperator(String OwnedOperatedOnInsuredsBehalfByHiredOperator) {
		this.OwnedOperatedOnInsuredsBehalfByHiredOperator = OwnedOperatedOnInsuredsBehalfByHiredOperator;
	}
	public void setEntertainmentDemosSpecEventSport(String EntertainmentDemosSpecEventSport) {
		this.EntertainmentDemosSpecEventSport = EntertainmentDemosSpecEventSport;
	}
	public void setEducationAndResearch(String EducationAndResearch) {
		this.EducationAndResearch = EducationAndResearch;
	}
	public void setTypeOfUseStatCode(String TypeOfUseStatCode) {
		this.TypeOfUseStatCode = TypeOfUseStatCode;
	}
	public void setUsage(String Usage) {
		this.Usage = Usage;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPrimaryPlaceOfOperationStatCode(String PrimaryPlaceOfOperationStatCode) {
		this.PrimaryPlaceOfOperationStatCode = PrimaryPlaceOfOperationStatCode;
	}
	public void setDroneValue(int DroneValue) {
		this.DroneValue = DroneValue;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setPersonalAndAdvertisingInjury(String PersonalAndAdvertisingInjury) {
		this.PersonalAndAdvertisingInjury = PersonalAndAdvertisingInjury;
	}
	public void setTowingSignsDistributionOfMaterials(String TowingSignsDistributionOfMaterials) {
		this.TowingSignsDistributionOfMaterials = TowingSignsDistributionOfMaterials;
	}
	public void setOperatorPilotTraining(String OperatorPilotTraining) {
		this.OperatorPilotTraining = OperatorPilotTraining;
	}
	public void setRentedOrLeasedToAndOperatedByTheInsured(String RentedOrLeasedToAndOperatedByTheInsured) {
		this.RentedOrLeasedToAndOperatedByTheInsured = RentedOrLeasedToAndOperatedByTheInsured;
	}
	public void setCropSprayingDispersingOfChemicals(String CropSprayingDispersingOfChemicals) {
		this.CropSprayingDispersingOfChemicals = CropSprayingDispersingOfChemicals;
	}
	public void setOwnedAndOperatedByTheInsured(String OwnedAndOperatedByTheInsured) {
		this.OwnedAndOperatedByTheInsured = OwnedAndOperatedByTheInsured;
	}
	public void setDescriptionOfOperationsOrProjectsBIPD(String DescriptionOfOperationsOrProjectsBIPD) {
		this.DescriptionOfOperationsOrProjectsBIPD = DescriptionOfOperationsOrProjectsBIPD;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setPrimaryPlaceOfOperationCategoryWithHighestFactor(String PrimaryPlaceOfOperationCategoryWithHighestFactor) {
		this.PrimaryPlaceOfOperationCategoryWithHighestFactor = PrimaryPlaceOfOperationCategoryWithHighestFactor;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setRatingBasisStatCode(String RatingBasisStatCode) {
		this.RatingBasisStatCode = RatingBasisStatCode;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setEmergencyServices(String EmergencyServices) {
		this.EmergencyServices = EmergencyServices;
	}
	public void setIndoors(String Indoors) {
		this.Indoors = Indoors;
	}
	public void setMethodOfControl(String MethodOfControl) {
		this.MethodOfControl = MethodOfControl;
	}
	public void setBodilyInjuryAndPropertyDamage(String BodilyInjuryAndPropertyDamage) {
		this.BodilyInjuryAndPropertyDamage = BodilyInjuryAndPropertyDamage;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setInternetAccessOtherCommunicationServices(String InternetAccessOtherCommunicationServices) {
		this.InternetAccessOtherCommunicationServices = InternetAccessOtherCommunicationServices;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setUnknown(String Unknown) {
		this.Unknown = Unknown;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
}