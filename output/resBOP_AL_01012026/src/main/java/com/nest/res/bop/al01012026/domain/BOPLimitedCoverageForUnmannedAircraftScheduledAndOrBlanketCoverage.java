package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private int ExposureStatAmount;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String BlanketCoverageApplies;
	private String PriorId;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private double AnnualPremium;
	private int TotalLimit;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private int NumberOfDrones;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private double ProRatedPriorPremium;
	private List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String blanketCoverageAppliesTemp_1;
	private String LiabilityExposureIndicatorStatCode;
	private int numberOfDronesTemp_1;
	private int totalLimitTemp_1;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail) {
			childs.addAll(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail);
		}
		return childs;
	}


	public int  getExposureStatAmount() {
		return this.ExposureStatAmount;
	}
	public String  getLiabilityExposureIndicatorStatCode() {
		return this.LiabilityExposureIndicatorStatCode;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public int  getNumberOfDrones() {
		return this.NumberOfDrones;
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
	public int  getNumberOfDronesTemp_1() {
		return this.numberOfDronesTemp_1;
	}
	public List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail> getBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail() {
		return this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail;
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
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getBlanketCoverageAppliesTemp_1() {
		return this.blanketCoverageAppliesTemp_1;
	}
	public int  getTotalLimit() {
		return this.TotalLimit;
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
	public String  getBlanketCoverageApplies() {
		return this.BlanketCoverageApplies;
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
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public int  getTotalLimitTemp_1() {
		return this.totalLimitTemp_1;
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
	public void setNumberOfDronesTemp_1(int numberOfDronesTemp_1) {
		this.numberOfDronesTemp_1 = numberOfDronesTemp_1;
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
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
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
	public void setLiabilityExposureIndicatorStatCode(String LiabilityExposureIndicatorStatCode) {
		this.LiabilityExposureIndicatorStatCode = LiabilityExposureIndicatorStatCode;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setBlanketCoverageAppliesTemp_1(String blanketCoverageAppliesTemp_1) {
		this.blanketCoverageAppliesTemp_1 = blanketCoverageAppliesTemp_1;
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
	public void setExposureStatAmount(int ExposureStatAmount) {
		this.ExposureStatAmount = ExposureStatAmount;
	}
	public void setNumberOfDrones(int NumberOfDrones) {
		this.NumberOfDrones = NumberOfDrones;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setTotalLimit(int TotalLimit) {
		this.TotalLimit = TotalLimit;
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
	public void setBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail(List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail) {
		this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail;
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
	public void setBlanketCoverageApplies(String BlanketCoverageApplies) {
		this.BlanketCoverageApplies = BlanketCoverageApplies;
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
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setTotalLimitTemp_1(int totalLimitTemp_1) {
		this.totalLimitTemp_1 = totalLimitTemp_1;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}