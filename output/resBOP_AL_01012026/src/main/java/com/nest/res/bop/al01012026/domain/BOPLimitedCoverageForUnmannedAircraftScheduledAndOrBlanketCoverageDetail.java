package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail    extends Policy  {
	private int FeeIndicator;
	private String Deductible;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private int BusinessIncomeConsecutiveDays;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private double BusinessInterruptionCoverageFactor;
	private String PriorId;
	private int BusinessIncomeNumberOfHours;
	private double FloodCoverageFactor;
	private int DroneValue;
	private double EvaluatedPremium;
	private String DescribedPremises;
	private String FormName;
	private double UnmannedAircraftRate;
	private int TermFactorIndicator;
	private String BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed;
	private String CreatedBy;
	private double DeductibleFactor;
	private String DescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers;
	private String InterruptionOfComputerOperationsCoverage;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private int BusinessInterruptionLimit;
	private String MethodOfControl;
	private int SubLimit;
	private double ChangePremium;
	private int ShortRateIndicator;
	private String MethodOfControlCode;
	private String RatingBasisStatCode;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double BasicPremium;
	private int NumberOfDronesBlanketCoverage;
	private double ProRateFactor;
	private double WindstormOrHailExclusionCredit;
	private double EarthquakeCoverageFactor;
	private double AnnualPremium;
	private Date Modified;
	private String ElectronicDataCoverage;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private int BlanketLimit;
	private String TypeOfOperations;
	private String BusinessInterruption;
	private Date ChangeEffectiveDt;
	private String DamageToUnmannedAircraft;
	private String VersionedId;
	private String DeductibleStatCode;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ValuationType;
	private String ParentId;
	private double ProRatedPriorPremium;
	private String DescriptionOfEachUnmannedAircraft;
	private String RiskClass;
	private List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov;
	private String BusinessInterruptionCoverage;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String IndicateActualCashValueOrReplacementCost;
	private double AdditionalPremium;
	private double NewlyAcquiredPropertyFactor;
	private int dsLimit;
	private int LiabilityLimitStatCode;
	private String BusinessInterruptionCoverageIndicatorCode;
	private String CoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov) {
			childs.addAll(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov);
		}
		return childs;
	}


	public int  getDsLimit() {
		return this.dsLimit;
	}
	public String  getDeductible() {
		return this.Deductible;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public double  getEarthquakeCoverageFactor() {
		return this.EarthquakeCoverageFactor;
	}
	public String  getTypeOfOperations() {
		return this.TypeOfOperations;
	}
	public int  getUnitNumber() {
		return this.UnitNumber;
	}
	public double  getPolicyTermPremium() {
		return this.PolicyTermPremium;
	}
	public double  getProRateFactor() {
		return this.ProRateFactor;
	}
	public double  getPremium() {
		return this.Premium;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public double  getNewlyAcquiredPropertyFactor() {
		return this.NewlyAcquiredPropertyFactor;
	}
	public double  getWindstormOrHailExclusionCredit() {
		return this.WindstormOrHailExclusionCredit;
	}
	public String  getInterruptionOfComputerOperationsCoverage() {
		return this.InterruptionOfComputerOperationsCoverage;
	}
	public double  getAdditionalPremium() {
		return this.AdditionalPremium;
	}
	public String  getDescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers() {
		return this.DescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers;
	}
	public int  getDroneValue() {
		return this.DroneValue;
	}
	public String  getMethodOfControlCode() {
		return this.MethodOfControlCode;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getId() {
		return this.Id;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public int  getBlanketLimit() {
		return this.BlanketLimit;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public int  getBusinessInterruptionLimit() {
		return this.BusinessInterruptionLimit;
	}
	public String  getValuationType() {
		return this.ValuationType;
	}
	public String  getDescribedPremises() {
		return this.DescribedPremises;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public double  getDeductibleFactor() {
		return this.DeductibleFactor;
	}
	public int  getBusinessIncomeNumberOfHours() {
		return this.BusinessIncomeNumberOfHours;
	}
	public String  getDescriptionOfEachUnmannedAircraft() {
		return this.DescriptionOfEachUnmannedAircraft;
	}
	public String  getBusinessInterruptionCoverage() {
		return this.BusinessInterruptionCoverage;
	}
	public String  getRiskClass() {
		return this.RiskClass;
	}
	public String  getDamageToUnmannedAircraft() {
		return this.DamageToUnmannedAircraft;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getMethodOfControl() {
		return this.MethodOfControl;
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
	public String  getElectronicDataCoverage() {
		return this.ElectronicDataCoverage;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public double  getBusinessInterruptionCoverageFactor() {
		return this.BusinessInterruptionCoverageFactor;
	}
	public Date  getModified() {
		return this.Modified;
	}
	public double  getProRatedPremium() {
		return this.ProRatedPremium;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public int  getSubLimit() {
		return this.SubLimit;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public String  getCoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly() {
		return this.CoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public int  getBusinessIncomeConsecutiveDays() {
		return this.BusinessIncomeConsecutiveDays;
	}
	public int  getNumberOfDronesBlanketCoverage() {
		return this.NumberOfDronesBlanketCoverage;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getBlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed() {
		return this.BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getBusinessInterruption() {
		return this.BusinessInterruption;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public String  getDeductibleStatCode() {
		return this.DeductibleStatCode;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getBusinessInterruptionCoverageIndicatorCode() {
		return this.BusinessInterruptionCoverageIndicatorCode;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov> getBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov() {
		return this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov;
	}
	public String  getIndicateActualCashValueOrReplacementCost() {
		return this.IndicateActualCashValueOrReplacementCost;
	}
	public double  getFloodCoverageFactor() {
		return this.FloodCoverageFactor;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getBasicPremium() {
		return this.BasicPremium;
	}
	public double  getUnmannedAircraftRate() {
		return this.UnmannedAircraftRate;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setBusinessIncomeNumberOfHours(int BusinessIncomeNumberOfHours) {
		this.BusinessIncomeNumberOfHours = BusinessIncomeNumberOfHours;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setLiabilityLimitStatCode(int LiabilityLimitStatCode) {
		this.LiabilityLimitStatCode = LiabilityLimitStatCode;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setUnmannedAircraftRate(double UnmannedAircraftRate) {
		this.UnmannedAircraftRate = UnmannedAircraftRate;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setSubLimit(int SubLimit) {
		this.SubLimit = SubLimit;
	}
	public void setDescriptionOfEachUnmannedAircraft(String DescriptionOfEachUnmannedAircraft) {
		this.DescriptionOfEachUnmannedAircraft = DescriptionOfEachUnmannedAircraft;
	}
	public void setCoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly(String CoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly) {
		this.CoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly = CoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly;
	}
	public void setBusinessInterruptionCoverage(String BusinessInterruptionCoverage) {
		this.BusinessInterruptionCoverage = BusinessInterruptionCoverage;
	}
	public void setBusinessInterruptionCoverageIndicatorCode(String BusinessInterruptionCoverageIndicatorCode) {
		this.BusinessInterruptionCoverageIndicatorCode = BusinessInterruptionCoverageIndicatorCode;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
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
	public void setDeductible(String Deductible) {
		this.Deductible = Deductible;
	}
	public void setIndicateActualCashValueOrReplacementCost(String IndicateActualCashValueOrReplacementCost) {
		this.IndicateActualCashValueOrReplacementCost = IndicateActualCashValueOrReplacementCost;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setBusinessIncomeConsecutiveDays(int BusinessIncomeConsecutiveDays) {
		this.BusinessIncomeConsecutiveDays = BusinessIncomeConsecutiveDays;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setDescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers(String DescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers) {
		this.DescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers = DescriptionOfUnmannedAircraftOperationsDoesNotIncludeDeliveryToOthers;
	}
	public void setBlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed(String BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed) {
		this.BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed = BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed;
	}
	public void setWindstormOrHailExclusionCredit(double WindstormOrHailExclusionCredit) {
		this.WindstormOrHailExclusionCredit = WindstormOrHailExclusionCredit;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setDeductibleStatCode(String DeductibleStatCode) {
		this.DeductibleStatCode = DeductibleStatCode;
	}
	public void setDsLimit(int dsLimit) {
		this.dsLimit = dsLimit;
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
	public void setBasicPremium(double BasicPremium) {
		this.BasicPremium = BasicPremium;
	}
	public void setTypeOfOperations(String TypeOfOperations) {
		this.TypeOfOperations = TypeOfOperations;
	}
	public void setValuationType(String ValuationType) {
		this.ValuationType = ValuationType;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setChangeEffectiveDt(Date ChangeEffectiveDt) {
		this.ChangeEffectiveDt = ChangeEffectiveDt;
	}
	public void setExpirationDt(Date ExpirationDt) {
		this.ExpirationDt = ExpirationDt;
	}
	public void setDescribedPremises(String DescribedPremises) {
		this.DescribedPremises = DescribedPremises;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setElectronicDataCoverage(String ElectronicDataCoverage) {
		this.ElectronicDataCoverage = ElectronicDataCoverage;
	}
	public void setRatingBasisStatCode(String RatingBasisStatCode) {
		this.RatingBasisStatCode = RatingBasisStatCode;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setRiskClass(String RiskClass) {
		this.RiskClass = RiskClass;
	}
	public void setNewlyAcquiredPropertyFactor(double NewlyAcquiredPropertyFactor) {
		this.NewlyAcquiredPropertyFactor = NewlyAcquiredPropertyFactor;
	}
	public void setFloodCoverageFactor(double FloodCoverageFactor) {
		this.FloodCoverageFactor = FloodCoverageFactor;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setInterruptionOfComputerOperationsCoverage(String InterruptionOfComputerOperationsCoverage) {
		this.InterruptionOfComputerOperationsCoverage = InterruptionOfComputerOperationsCoverage;
	}
	public void setMethodOfControl(String MethodOfControl) {
		this.MethodOfControl = MethodOfControl;
	}
	public void setBlanketLimit(int BlanketLimit) {
		this.BlanketLimit = BlanketLimit;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setAdditionalPremium(double AdditionalPremium) {
		this.AdditionalPremium = AdditionalPremium;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
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
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setEarthquakeCoverageFactor(double EarthquakeCoverageFactor) {
		this.EarthquakeCoverageFactor = EarthquakeCoverageFactor;
	}
	public void setNumberOfDronesBlanketCoverage(int NumberOfDronesBlanketCoverage) {
		this.NumberOfDronesBlanketCoverage = NumberOfDronesBlanketCoverage;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov(List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov) {
		this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setBusinessInterruption(String BusinessInterruption) {
		this.BusinessInterruption = BusinessInterruption;
	}
	public void setBusinessInterruptionLimit(int BusinessInterruptionLimit) {
		this.BusinessInterruptionLimit = BusinessInterruptionLimit;
	}
	public void setMethodOfControlCode(String MethodOfControlCode) {
		this.MethodOfControlCode = MethodOfControlCode;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setDamageToUnmannedAircraft(String DamageToUnmannedAircraft) {
		this.DamageToUnmannedAircraft = DamageToUnmannedAircraft;
	}
	public void setDeductibleFactor(double DeductibleFactor) {
		this.DeductibleFactor = DeductibleFactor;
	}
	public void setBusinessInterruptionCoverageFactor(double BusinessInterruptionCoverageFactor) {
		this.BusinessInterruptionCoverageFactor = BusinessInterruptionCoverageFactor;
	}
}