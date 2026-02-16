package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPLimitationOfCoverageForTerrorismSubLimitAnnualAggregateBasisDetail    extends Policy  {
	private int FeeIndicator;
	private double AnnualPremium;
	private String FormNumber;
	private String Description;
	private Date Modified;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date RateDt;
	private Date EffectiveDt;
	private String TerrorismAggregateLimit;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String PriorId;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private double EvaluatedPremium;
	private int ProRateIndicator;
	private String FormName;
	private String StateFullName;
	private int TermFactorIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private String CreatedBy;
	private double ProRatedPriorPremium;
	private int TaxIndicator;
	private int PremiumIndicator;
	private double PriorPremium;
	private Date Expiration;
	private double ShortRatePenalty;
	private double ChangePremium;
	private Date Effective;
	private String ExceptionHeader;
	private int EarnedInFullIndicator;
	private String StateExceptionSFP;
	private int ShortRateIndicator;
	private String TerrorismSubLimit;
	private double TotalProRatedChangePremium;
	private String ApplicabilityHeader;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private String SchedulePart3Header;
	private double ProRateFactor;
	
	
	
	
	
	
	


	public String  getFormName() {
		return this.FormName;
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
	public String  getSchedulePart3Header() {
		return this.SchedulePart3Header;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public Date  getExpiration() {
		return this.Expiration;
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
	public String  getId() {
		return this.Id;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public String  getDescription() {
		return this.Description;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getApplicabilityHeader() {
		return this.ApplicabilityHeader;
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
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public String  getStateExceptionSFP() {
		return this.StateExceptionSFP;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getTerrorismAggregateLimit() {
		return this.TerrorismAggregateLimit;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getExceptionHeader() {
		return this.ExceptionHeader;
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
	public String  getStateFullName() {
		return this.StateFullName;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public String  getTerrorismSubLimit() {
		return this.TerrorismSubLimit;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
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
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setSchedulePart3Header(String SchedulePart3Header) {
		this.SchedulePart3Header = SchedulePart3Header;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setStateExceptionSFP(String StateExceptionSFP) {
		this.StateExceptionSFP = StateExceptionSFP;
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
	public void setTerrorismAggregateLimit(String TerrorismAggregateLimit) {
		this.TerrorismAggregateLimit = TerrorismAggregateLimit;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
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
	public void setTerrorismSubLimit(String TerrorismSubLimit) {
		this.TerrorismSubLimit = TerrorismSubLimit;
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
	public void setStateFullName(String StateFullName) {
		this.StateFullName = StateFullName;
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
	public void setApplicabilityHeader(String ApplicabilityHeader) {
		this.ApplicabilityHeader = ApplicabilityHeader;
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
	public void setExceptionHeader(String ExceptionHeader) {
		this.ExceptionHeader = ExceptionHeader;
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
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}