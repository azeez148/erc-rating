package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPEquipmentBreakdownProtectionCov    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private int EquipmtBreakdownSubLimit;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private double BaseCharge;
	private String PriorId;
	private int EquipmtBreakdownRatingLimit;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private String Hour;
	private Date Expiration;
	private double Each100000AddlCharge;
	private double AddlCharge;
	private String EquipmtBreakdownDed;
	private double ChangePremium;
	private String BusnIncomeTimeDed;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private Date PriorRateDt;
	private String Id;
	private int UnitNumber;
	private double ProRatedChangePremium;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private String Premises;
	private double OverridePremium;
	private Date Created;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private int ProRateIndicator;
	private String DedHeader;
	private double ShortRateFactor;
	private String ParentId;
	private String CoverageStatCode;
	private String Ded;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double DedFactor;
	
	
	
	
	
	
	


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
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getId() {
		return this.Id;
	}
	public double  getEach100000AddlCharge() {
		return this.Each100000AddlCharge;
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
	public int  getEquipmtBreakdownRatingLimit() {
		return this.EquipmtBreakdownRatingLimit;
	}
	public String  getBusnIncomeTimeDed() {
		return this.BusnIncomeTimeDed;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public double  getAddlCharge() {
		return this.AddlCharge;
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
	public double  getBaseCharge() {
		return this.BaseCharge;
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
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getPremises() {
		return this.Premises;
	}
	public String  getHour() {
		return this.Hour;
	}
	public int  getEquipmtBreakdownSubLimit() {
		return this.EquipmtBreakdownSubLimit;
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
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public double  getDedFactor() {
		return this.DedFactor;
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
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getDedHeader() {
		return this.DedHeader;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public String  getEquipmtBreakdownDed() {
		return this.EquipmtBreakdownDed;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setBaseCharge(double BaseCharge) {
		this.BaseCharge = BaseCharge;
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
	public void setEquipmtBreakdownSubLimit(int EquipmtBreakdownSubLimit) {
		this.EquipmtBreakdownSubLimit = EquipmtBreakdownSubLimit;
	}
	public void setPremises(String Premises) {
		this.Premises = Premises;
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
	public void setHour(String Hour) {
		this.Hour = Hour;
	}
	public void setEquipmtBreakdownDed(String EquipmtBreakdownDed) {
		this.EquipmtBreakdownDed = EquipmtBreakdownDed;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setCoverageStatCode(String CoverageStatCode) {
		this.CoverageStatCode = CoverageStatCode;
	}
	public void setDedHeader(String DedHeader) {
		this.DedHeader = DedHeader;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setAddlCharge(double AddlCharge) {
		this.AddlCharge = AddlCharge;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
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
	public void setEach100000AddlCharge(double Each100000AddlCharge) {
		this.Each100000AddlCharge = Each100000AddlCharge;
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
	public void setBusnIncomeTimeDed(String BusnIncomeTimeDed) {
		this.BusnIncomeTimeDed = BusnIncomeTimeDed;
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
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setEquipmtBreakdownRatingLimit(int EquipmtBreakdownRatingLimit) {
		this.EquipmtBreakdownRatingLimit = EquipmtBreakdownRatingLimit;
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
	public void setDed(String Ded) {
		this.Ded = Ded;
	}
}