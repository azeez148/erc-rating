package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPEmploymentRelatedPracticesLiabilityCov    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private int AggStatLimit;
	private int NumEmployeesStatCode;
	private Date RetroDate;
	private double EvaluatedPremium;
	private String CoverageType;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private double IncrLimitFactor;
	private int PremiumIndicator;
	private double Rate;
	private Date Expiration;
	private int dsNumEmployees;
	private double ManualPremium;
	private int AggLimit;
	private int SuppllLimit;
	private double calcPremium_1;
	private double ChangePremium;
	private String MaliciousProsecution;
	private int ShortRateIndicator;
	private double AddlEmployeeRate;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ExtddRptgPeriodFactor;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private Date PriorOrPendingLitigationDate;
	private Date RateDt;
	private double ValidationCheckPremium;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private double AddlEmployeePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int NumAddlEmployees;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private String Ded;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private double ExtendedReportingPeriodPremium;
	private Date Effective;
	private String ExtddRptgPeriod;
	private int EarnedInFullIndicator;
	private String LiabilityExposureIndicatorStatCode;
	private double DedFactor;
	
	
	
	
	
	
	


	public Date  getPriorOrPendingLitigationDate() {
		return this.PriorOrPendingLitigationDate;
	}
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
	public double  getExtddRptgPeriodFactor() {
		return this.ExtddRptgPeriodFactor;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public int  getSuppllLimit() {
		return this.SuppllLimit;
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
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getIncrLimitFactor() {
		return this.IncrLimitFactor;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public double  getExtendedReportingPeriodPremium() {
		return this.ExtendedReportingPeriodPremium;
	}
	public Date  getRetroDate() {
		return this.RetroDate;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getAggStatLimit() {
		return this.AggStatLimit;
	}
	public double  getValidationCheckPremium() {
		return this.ValidationCheckPremium;
	}
	public int  getNumAddlEmployees() {
		return this.NumAddlEmployees;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
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
	public double  getAddlEmployeePremium() {
		return this.AddlEmployeePremium;
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
	public String  getMaliciousProsecution() {
		return this.MaliciousProsecution;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public double  getCalcPremium_1() {
		return this.calcPremium_1;
	}
	public String  getCoverageType() {
		return this.CoverageType;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public String  getASLOBStatCode() {
		return this.ASLOBStatCode;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getCoverageStatCode() {
		return this.CoverageStatCode;
	}
	public double  getAddlEmployeeRate() {
		return this.AddlEmployeeRate;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public double  getDedFactor() {
		return this.DedFactor;
	}
	public int  getAggLimit() {
		return this.AggLimit;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public String  getDed() {
		return this.Ded;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getExtddRptgPeriod() {
		return this.ExtddRptgPeriod;
	}
	public double  getRate() {
		return this.Rate;
	}
	public int  getDsNumEmployees() {
		return this.dsNumEmployees;
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
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public int  getNumEmployeesStatCode() {
		return this.NumEmployeesStatCode;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setAggStatLimit(int AggStatLimit) {
		this.AggStatLimit = AggStatLimit;
	}
	public void setSuppllLimit(int SuppllLimit) {
		this.SuppllLimit = SuppllLimit;
	}
	public void setMaliciousProsecution(String MaliciousProsecution) {
		this.MaliciousProsecution = MaliciousProsecution;
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
	public void setAddlEmployeePremium(double AddlEmployeePremium) {
		this.AddlEmployeePremium = AddlEmployeePremium;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setExtddRptgPeriod(String ExtddRptgPeriod) {
		this.ExtddRptgPeriod = ExtddRptgPeriod;
	}
	public void setDsNumEmployees(int dsNumEmployees) {
		this.dsNumEmployees = dsNumEmployees;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setAddlEmployeeRate(double AddlEmployeeRate) {
		this.AddlEmployeeRate = AddlEmployeeRate;
	}
	public void setNumEmployeesStatCode(int NumEmployeesStatCode) {
		this.NumEmployeesStatCode = NumEmployeesStatCode;
	}
	public void setNumAddlEmployees(int NumAddlEmployees) {
		this.NumAddlEmployees = NumAddlEmployees;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setManualPremium(double ManualPremium) {
		this.ManualPremium = ManualPremium;
	}
	public void setCoverageStatCode(String CoverageStatCode) {
		this.CoverageStatCode = CoverageStatCode;
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
	public void setValidationCheckPremium(double ValidationCheckPremium) {
		this.ValidationCheckPremium = ValidationCheckPremium;
	}
	public void setAggLimit(int AggLimit) {
		this.AggLimit = AggLimit;
	}
	public void setExtddRptgPeriodFactor(double ExtddRptgPeriodFactor) {
		this.ExtddRptgPeriodFactor = ExtddRptgPeriodFactor;
	}
	public void setRetroDate(Date RetroDate) {
		this.RetroDate = RetroDate;
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
	public void setRate(double Rate) {
		this.Rate = Rate;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setPriorOrPendingLitigationDate(Date PriorOrPendingLitigationDate) {
		this.PriorOrPendingLitigationDate = PriorOrPendingLitigationDate;
	}
	public void setASLOBStatCode(String ASLOBStatCode) {
		this.ASLOBStatCode = ASLOBStatCode;
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
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
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
	public void setDedFactor(double DedFactor) {
		this.DedFactor = DedFactor;
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
	public void setCoverageType(String CoverageType) {
		this.CoverageType = CoverageType;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setCalcPremium_1(double calcPremium_1) {
		this.calcPremium_1 = calcPremium_1;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setIncrLimitFactor(double IncrLimitFactor) {
		this.IncrLimitFactor = IncrLimitFactor;
	}
	public void setDed(String Ded) {
		this.Ded = Ded;
	}
	public void setExtendedReportingPeriodPremium(double ExtendedReportingPeriodPremium) {
		this.ExtendedReportingPeriodPremium = ExtendedReportingPeriodPremium;
	}
}