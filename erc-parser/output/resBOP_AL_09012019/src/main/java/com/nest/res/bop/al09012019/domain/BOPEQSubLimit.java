package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPEQSubLimit    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private int LimitBPP;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private double Factor;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String IncrdAnnlAggLmtOptn;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double BldgPremium;
	private double FunctlBldgValtnFactor;
	private double ChangePremium;
	private double FunctBPPPremium;
	private double FunctlBldgPremium;
	private int ShortRateIndicator;
	private int LimitBuilding;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private String Building;
	private double AnnualPremium;
	private Date Modified;
	private double EQSubLimitRate;
	private Date RateDt;
	private double PctDeductible;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String BusinessPersonalProperty;
	private double EQSubLimitBPPRate;
	private Date ChangeEffectiveDt;
	private double FunctBPPValtnFactor;
	private String VersionedId;
	private double BPPPremium;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private String CheckApplicableCoveredPropertyForBlanketLimit;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int BlanketEarthquakeVolcanicEruptionLimit;
	private double EQRate;
	private String PremisesNumber;
	private double EQSubDedFactor;
	
	
	
	
	
	
	


	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public String  getBusinessPersonalProperty() {
		return this.BusinessPersonalProperty;
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
	public double  getEQSubLimitRate() {
		return this.EQSubLimitRate;
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
	public double  getFunctlBldgPremium() {
		return this.FunctlBldgPremium;
	}
	public double  getFactor() {
		return this.Factor;
	}
	public double  getPctDeductible() {
		return this.PctDeductible;
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
	public int  getLimitBuilding() {
		return this.LimitBuilding;
	}
	public double  getEQRate() {
		return this.EQRate;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getCheckApplicableCoveredPropertyForBlanketLimit() {
		return this.CheckApplicableCoveredPropertyForBlanketLimit;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public double  getFunctlBldgValtnFactor() {
		return this.FunctlBldgValtnFactor;
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
	public int  getBlanketEarthquakeVolcanicEruptionLimit() {
		return this.BlanketEarthquakeVolcanicEruptionLimit;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public double  getBldgPremium() {
		return this.BldgPremium;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getEQSubDedFactor() {
		return this.EQSubDedFactor;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getIncrdAnnlAggLmtOptn() {
		return this.IncrdAnnlAggLmtOptn;
	}
	public String  getPremisesNumber() {
		return this.PremisesNumber;
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
	public double  getFunctBPPValtnFactor() {
		return this.FunctBPPValtnFactor;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public double  getFunctBPPPremium() {
		return this.FunctBPPPremium;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public double  getBPPPremium() {
		return this.BPPPremium;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getEQSubLimitBPPRate() {
		return this.EQSubLimitBPPRate;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public int  getLimitBPP() {
		return this.LimitBPP;
	}
	public String  getBuilding() {
		return this.Building;
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
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setLimitBPP(int LimitBPP) {
		this.LimitBPP = LimitBPP;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setCheckApplicableCoveredPropertyForBlanketLimit(String CheckApplicableCoveredPropertyForBlanketLimit) {
		this.CheckApplicableCoveredPropertyForBlanketLimit = CheckApplicableCoveredPropertyForBlanketLimit;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setLimitBuilding(int LimitBuilding) {
		this.LimitBuilding = LimitBuilding;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setFunctlBldgValtnFactor(double FunctlBldgValtnFactor) {
		this.FunctlBldgValtnFactor = FunctlBldgValtnFactor;
	}
	public void setPremisesNumber(String PremisesNumber) {
		this.PremisesNumber = PremisesNumber;
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
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setBPPPremium(double BPPPremium) {
		this.BPPPremium = BPPPremium;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setEQSubLimitBPPRate(double EQSubLimitBPPRate) {
		this.EQSubLimitBPPRate = EQSubLimitBPPRate;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setPctDeductible(double PctDeductible) {
		this.PctDeductible = PctDeductible;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setBldgPremium(double BldgPremium) {
		this.BldgPremium = BldgPremium;
	}
	public void setBuilding(String Building) {
		this.Building = Building;
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
	public void setIncrdAnnlAggLmtOptn(String IncrdAnnlAggLmtOptn) {
		this.IncrdAnnlAggLmtOptn = IncrdAnnlAggLmtOptn;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
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
	public void setEQSubLimitRate(double EQSubLimitRate) {
		this.EQSubLimitRate = EQSubLimitRate;
	}
	public void setFunctBPPPremium(double FunctBPPPremium) {
		this.FunctBPPPremium = FunctBPPPremium;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setFactor(double Factor) {
		this.Factor = Factor;
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
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setFunctBPPValtnFactor(double FunctBPPValtnFactor) {
		this.FunctBPPValtnFactor = FunctBPPValtnFactor;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setFunctlBldgPremium(double FunctlBldgPremium) {
		this.FunctlBldgPremium = FunctlBldgPremium;
	}
	public void setEQSubDedFactor(double EQSubDedFactor) {
		this.EQSubDedFactor = EQSubDedFactor;
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
	public void setEQRate(double EQRate) {
		this.EQRate = EQRate;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setBusinessPersonalProperty(String BusinessPersonalProperty) {
		this.BusinessPersonalProperty = BusinessPersonalProperty;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setBlanketEarthquakeVolcanicEruptionLimit(int BlanketEarthquakeVolcanicEruptionLimit) {
		this.BlanketEarthquakeVolcanicEruptionLimit = BlanketEarthquakeVolcanicEruptionLimit;
	}
}