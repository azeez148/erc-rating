package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity    extends Policy  {
	private String ASLOBStatCode;
	private int FeeIndicator;
	private double AnnualPremium;
	private String FormNumber;
	private Date Modified;
	private double PolicyTermPremium;
	private double LimitFactor;
	private int NumberOfConsecutiveDays;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date RateDt;
	private Date EffectiveDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String PriorId;
	private double modifiedLimitFactor_1;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private double EvaluatedPremium;
	private int ProRateIndicator;
	private String FormName;
	private int TermFactorIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private String CreatedBy;
	private double ProRatedPriorPremium;
	private int TaxIndicator;
	private int PremiumIndicator;
	private double PriorPremium;
	private Date Expiration;
	private double AdjLimit;
	private double ShortRatePenalty;
	private double ChangePremium;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int ShortRateIndicator;
	private String BuildingNumber;
	private String PremisesNumber;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private int NumOfMonths;
	
	
	
	
	
	
	


	public String  getFormName() {
		return this.FormName;
	}
	public String  getBuildingNumber() {
		return this.BuildingNumber;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
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
	public String  getPremisesNumber() {
		return this.PremisesNumber;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public Date  getExpiration() {
		return this.Expiration;
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
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public double  getLimitFactor() {
		return this.LimitFactor;
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
	public double  getAdjLimit() {
		return this.AdjLimit;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public int  getNumberOfConsecutiveDays() {
		return this.NumberOfConsecutiveDays;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public double  getModifiedLimitFactor_1() {
		return this.modifiedLimitFactor_1;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public Date  getCreated() {
		return this.Created;
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
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	public int  getNumOfMonths() {
		return this.NumOfMonths;
	}
	
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setAdjLimit(double AdjLimit) {
		this.AdjLimit = AdjLimit;
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
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setASLOBStatCode(String ASLOBStatCode) {
		this.ASLOBStatCode = ASLOBStatCode;
	}
	public void setPremisesNumber(String PremisesNumber) {
		this.PremisesNumber = PremisesNumber;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setNumberOfConsecutiveDays(int NumberOfConsecutiveDays) {
		this.NumberOfConsecutiveDays = NumberOfConsecutiveDays;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setLimitFactor(double LimitFactor) {
		this.LimitFactor = LimitFactor;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setId(String Id) {
		this.Id = Id;
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
	public void setBuildingNumber(String BuildingNumber) {
		this.BuildingNumber = BuildingNumber;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setNumOfMonths(int NumOfMonths) {
		this.NumOfMonths = NumOfMonths;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setModifiedLimitFactor_1(double modifiedLimitFactor_1) {
		this.modifiedLimitFactor_1 = modifiedLimitFactor_1;
	}
}