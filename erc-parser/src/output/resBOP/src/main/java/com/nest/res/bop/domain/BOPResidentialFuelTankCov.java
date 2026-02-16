package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPResidentialFuelTankCov    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private int AdditionalFuelTanks;
	private String BldgCodeEffectivenessGradeStatCode;
	private Date ExpirationDt;
	private double LiabilityPremium;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private double EvaluatedPremium;
	private double AdditionalFuelTankRate;
	private String FormName;
	private int TermFactorIndicator;
	private int NumberOfBuildings;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ManualPremium;
	private int AdditionalBuildings;
	private double ChangePremium;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private int UnitNumber;
	private String StateExceptionIndicatorStatCode;
	private double ProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double AdditionalBuildingRate;
	private double ApartmentBuildingsEndorsementReductionRate;
	private double ProRateFactor;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private double OverridePremium;
	private String ExposureStatCode;
	private Date Created;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private double PropertyPremium;
	private int IncidentDeductible;
	private int ProRateIndicator;
	private String LiabilityCoverageStatCode;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private int AggregateLimit;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private double BuildingRate;
	private Date RetroactiveDt;
	private int EarnedInFullIndicator;
	private String LiabilityExposureIndicatorStatCode;
	private int IncidentLimit;
	private String PropertyCoverageStatCode;
	
	
	
	
	
	
	


	public String  getLiabilityExposureIndicatorStatCode() {
		return this.LiabilityExposureIndicatorStatCode;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
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
	public double  getBuildingRate() {
		return this.BuildingRate;
	}
	public String  getStateExceptionIndicatorStatCode() {
		return this.StateExceptionIndicatorStatCode;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getPropertyCoverageStatCode() {
		return this.PropertyCoverageStatCode;
	}
	public String  getId() {
		return this.Id;
	}
	public Date  getRateDt() {
		return this.RateDt;
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
	public int  getIncidentDeductible() {
		return this.IncidentDeductible;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getExposureStatCode() {
		return this.ExposureStatCode;
	}
	public int  getAdditionalFuelTanks() {
		return this.AdditionalFuelTanks;
	}
	public int  getNumberOfBuildings() {
		return this.NumberOfBuildings;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public Date  getEffective() {
		return this.Effective;
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
	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getManualPremium() {
		return this.ManualPremium;
	}
	public double  getAdditionalBuildingRate() {
		return this.AdditionalBuildingRate;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getBldgCodeEffectivenessGradeStatCode() {
		return this.BldgCodeEffectivenessGradeStatCode;
	}
	public int  getIncidentLimit() {
		return this.IncidentLimit;
	}
	public double  getLiabilityPremium() {
		return this.LiabilityPremium;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getAdditionalBuildings() {
		return this.AdditionalBuildings;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public double  getApartmentBuildingsEndorsementReductionRate() {
		return this.ApartmentBuildingsEndorsementReductionRate;
	}
	public Date  getRetroactiveDt() {
		return this.RetroactiveDt;
	}
	public double  getAdditionalFuelTankRate() {
		return this.AdditionalFuelTankRate;
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
	public double  getPropertyPremium() {
		return this.PropertyPremium;
	}
	public String  getLiabilityCoverageStatCode() {
		return this.LiabilityCoverageStatCode;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public int  getAggregateLimit() {
		return this.AggregateLimit;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setStateExceptionIndicatorStatCode(String StateExceptionIndicatorStatCode) {
		this.StateExceptionIndicatorStatCode = StateExceptionIndicatorStatCode;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
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
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPropertyCoverageStatCode(String PropertyCoverageStatCode) {
		this.PropertyCoverageStatCode = PropertyCoverageStatCode;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setNumberOfBuildings(int NumberOfBuildings) {
		this.NumberOfBuildings = NumberOfBuildings;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setLiabilityCoverageStatCode(String LiabilityCoverageStatCode) {
		this.LiabilityCoverageStatCode = LiabilityCoverageStatCode;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setAdditionalBuildings(int AdditionalBuildings) {
		this.AdditionalBuildings = AdditionalBuildings;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setIncidentLimit(int IncidentLimit) {
		this.IncidentLimit = IncidentLimit;
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
	public void setApartmentBuildingsEndorsementReductionRate(double ApartmentBuildingsEndorsementReductionRate) {
		this.ApartmentBuildingsEndorsementReductionRate = ApartmentBuildingsEndorsementReductionRate;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setLiabilityExposureIndicatorStatCode(String LiabilityExposureIndicatorStatCode) {
		this.LiabilityExposureIndicatorStatCode = LiabilityExposureIndicatorStatCode;
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
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setExposureStatCode(String ExposureStatCode) {
		this.ExposureStatCode = ExposureStatCode;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setIncidentDeductible(int IncidentDeductible) {
		this.IncidentDeductible = IncidentDeductible;
	}
	public void setAdditionalFuelTankRate(double AdditionalFuelTankRate) {
		this.AdditionalFuelTankRate = AdditionalFuelTankRate;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setAdditionalBuildingRate(double AdditionalBuildingRate) {
		this.AdditionalBuildingRate = AdditionalBuildingRate;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setBuildingRate(double BuildingRate) {
		this.BuildingRate = BuildingRate;
	}
	public void setLiabilityPremium(double LiabilityPremium) {
		this.LiabilityPremium = LiabilityPremium;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setPropertyPremium(double PropertyPremium) {
		this.PropertyPremium = PropertyPremium;
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
	public void setAggregateLimit(int AggregateLimit) {
		this.AggregateLimit = AggregateLimit;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setRetroactiveDt(Date RetroactiveDt) {
		this.RetroactiveDt = RetroactiveDt;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setBldgCodeEffectivenessGradeStatCode(String BldgCodeEffectivenessGradeStatCode) {
		this.BldgCodeEffectivenessGradeStatCode = BldgCodeEffectivenessGradeStatCode;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setAdditionalFuelTanks(int AdditionalFuelTanks) {
		this.AdditionalFuelTanks = AdditionalFuelTanks;
	}
}