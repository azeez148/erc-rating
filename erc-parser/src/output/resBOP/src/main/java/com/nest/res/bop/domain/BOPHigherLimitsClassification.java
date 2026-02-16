package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPHigherLimitsClassification    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private int ClassificationAccountsReceivableCoverageLimit;
	private String TheftLimitationsCoverage;
	private String PriorId;
	private double ClassificationBusnIncomeDependentPropCoverageGeneratedPremium;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private String ClassificationValuablePapersCoverage;
	private int PremiumIndicator;
	private Date Expiration;
	private String OutdoorPropertyCoverage;
	private int OutdoorPropertyCoverageLimit;
	private int ClassificationValuablePapersCoverageLimit;
	private String SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
	private double ChangePremium;
	private String ClassificationBusnIncomeDependentPropCoverage;
	private int ShortRateIndicator;
	private double ClassificationValuablePapersCoverageGeneratedPremium;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private double AnnualPremium;
	private Date Modified;
	private double TheftLimitationsCoverageGeneratedPremium;
	private Date RateDt;
	private double OutdoorPropertyCoverageGeneratedPremium;
	private double ProRatedPremium;
	private List<BOPHigherLimitsClassificationDetail> BOPHigherLimitsClassificationDetail;
	private Date Created;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private int TheftLimitationsCoverageLimit;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private String ClassificationAccountsReceivableCoverage;
	private double PriorPremium;
	private double ShortRatePenalty;
	private double SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium;
	private int SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int ClassificationBusnIncomeDependentPropCoverageLimit;
	private double ClassificationAccountsReceivableCoverageGeneratedPremium;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPHigherLimitsClassificationDetail) {
			childs.addAll(BOPHigherLimitsClassificationDetail);
		}
		return childs;
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
	public double  getClassificationValuablePapersCoverageGeneratedPremium() {
		return this.ClassificationValuablePapersCoverageGeneratedPremium;
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
	public int  getClassificationAccountsReceivableCoverageLimit() {
		return this.ClassificationAccountsReceivableCoverageLimit;
	}
	public String  getClassificationAccountsReceivableCoverage() {
		return this.ClassificationAccountsReceivableCoverage;
	}
	public String  getSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises() {
		return this.SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
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
	public String  getTheftLimitationsCoverage() {
		return this.TheftLimitationsCoverage;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getClassificationValuablePapersCoverage() {
		return this.ClassificationValuablePapersCoverage;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public double  getClassificationBusnIncomeDependentPropCoverageGeneratedPremium() {
		return this.ClassificationBusnIncomeDependentPropCoverageGeneratedPremium;
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
	public String  getFormName() {
		return this.FormName;
	}
	public int  getOutdoorPropertyCoverageLimit() {
		return this.OutdoorPropertyCoverageLimit;
	}
	public int  getTheftLimitationsCoverageLimit() {
		return this.TheftLimitationsCoverageLimit;
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
	public List<BOPHigherLimitsClassificationDetail> getBOPHigherLimitsClassificationDetail() {
		return this.BOPHigherLimitsClassificationDetail;
	}
	public double  getTheftLimitationsCoverageGeneratedPremium() {
		return this.TheftLimitationsCoverageGeneratedPremium;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getClassificationValuablePapersCoverageLimit() {
		return this.ClassificationValuablePapersCoverageLimit;
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
	public double  getOutdoorPropertyCoverageGeneratedPremium() {
		return this.OutdoorPropertyCoverageGeneratedPremium;
	}
	public int  getClassificationBusnIncomeDependentPropCoverageLimit() {
		return this.ClassificationBusnIncomeDependentPropCoverageLimit;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public double  getClassificationAccountsReceivableCoverageGeneratedPremium() {
		return this.ClassificationAccountsReceivableCoverageGeneratedPremium;
	}
	public String  getClassificationBusnIncomeDependentPropCoverage() {
		return this.ClassificationBusnIncomeDependentPropCoverage;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public double  getSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium() {
		return this.SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium;
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
	public int  getSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit() {
		return this.SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit;
	}
	public String  getOutdoorPropertyCoverage() {
		return this.OutdoorPropertyCoverage;
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
	
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setOutdoorPropertyCoverage(String OutdoorPropertyCoverage) {
		this.OutdoorPropertyCoverage = OutdoorPropertyCoverage;
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
	public void setClassificationBusnIncomeDependentPropCoverage(String ClassificationBusnIncomeDependentPropCoverage) {
		this.ClassificationBusnIncomeDependentPropCoverage = ClassificationBusnIncomeDependentPropCoverage;
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
	public void setClassificationBusnIncomeDependentPropCoverageGeneratedPremium(double ClassificationBusnIncomeDependentPropCoverageGeneratedPremium) {
		this.ClassificationBusnIncomeDependentPropCoverageGeneratedPremium = ClassificationBusnIncomeDependentPropCoverageGeneratedPremium;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setBOPHigherLimitsClassificationDetail(List<BOPHigherLimitsClassificationDetail> BOPHigherLimitsClassificationDetail) {
		this.BOPHigherLimitsClassificationDetail = BOPHigherLimitsClassificationDetail;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
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
	public void setOutdoorPropertyCoverageLimit(int OutdoorPropertyCoverageLimit) {
		this.OutdoorPropertyCoverageLimit = OutdoorPropertyCoverageLimit;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setTheftLimitationsCoverageGeneratedPremium(double TheftLimitationsCoverageGeneratedPremium) {
		this.TheftLimitationsCoverageGeneratedPremium = TheftLimitationsCoverageGeneratedPremium;
	}
	public void setTheftLimitationsCoverage(String TheftLimitationsCoverage) {
		this.TheftLimitationsCoverage = TheftLimitationsCoverage;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setClassificationAccountsReceivableCoverageGeneratedPremium(double ClassificationAccountsReceivableCoverageGeneratedPremium) {
		this.ClassificationAccountsReceivableCoverageGeneratedPremium = ClassificationAccountsReceivableCoverageGeneratedPremium;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setClassificationBusnIncomeDependentPropCoverageLimit(int ClassificationBusnIncomeDependentPropCoverageLimit) {
		this.ClassificationBusnIncomeDependentPropCoverageLimit = ClassificationBusnIncomeDependentPropCoverageLimit;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium(double SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium) {
		this.SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium = SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesGeneratedPremium;
	}
	public void setSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit(int SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit) {
		this.SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit = SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremisesLimit;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setClassificationAccountsReceivableCoverage(String ClassificationAccountsReceivableCoverage) {
		this.ClassificationAccountsReceivableCoverage = ClassificationAccountsReceivableCoverage;
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
	public void setSpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises(String SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises) {
		this.SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises = SpecifiedBusinessPersonalPropertyTemporarilyAwayFromPremises;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setClassificationValuablePapersCoverageLimit(int ClassificationValuablePapersCoverageLimit) {
		this.ClassificationValuablePapersCoverageLimit = ClassificationValuablePapersCoverageLimit;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setClassificationValuablePapersCoverage(String ClassificationValuablePapersCoverage) {
		this.ClassificationValuablePapersCoverage = ClassificationValuablePapersCoverage;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setOutdoorPropertyCoverageGeneratedPremium(double OutdoorPropertyCoverageGeneratedPremium) {
		this.OutdoorPropertyCoverageGeneratedPremium = OutdoorPropertyCoverageGeneratedPremium;
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
	public void setClassificationValuablePapersCoverageGeneratedPremium(double ClassificationValuablePapersCoverageGeneratedPremium) {
		this.ClassificationValuablePapersCoverageGeneratedPremium = ClassificationValuablePapersCoverageGeneratedPremium;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setClassificationAccountsReceivableCoverageLimit(int ClassificationAccountsReceivableCoverageLimit) {
		this.ClassificationAccountsReceivableCoverageLimit = ClassificationAccountsReceivableCoverageLimit;
	}
	public void setTheftLimitationsCoverageLimit(int TheftLimitationsCoverageLimit) {
		this.TheftLimitationsCoverageLimit = TheftLimitationsCoverageLimit;
	}
}