package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPTheftOfClientsProperty    extends Policy  {
	private int FeeIndicator;
	private double AdditionalCharge;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private List<BOPTheftOfClientsPropertyDetail> BOPTheftOfClientsPropertyDetail;
	private double AddlLocationRate;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private int ShortRateIndicator;
	private double AddlEmployeeRate;
	private int DetailCoverageLimit;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double BasePremium;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double BaseRate;
	private double FinalAddlEmployeePremium;
	private double ProRatedPremium;
	private double CoverageLimit;
	private Date Created;
	private double OverridePremium;
	private double AddlEmployeePremium;
	private int employeeDishtyApply_1;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private int CoverageOnPolicyIndicator;
	private double TheftOfClientsPropFactor;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int AdditionalEmployeesCount;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPTheftOfClientsPropertyDetail) {
			childs.addAll(BOPTheftOfClientsPropertyDetail);
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
	public double  getProRateFactor() {
		return this.ProRateFactor;
	}
	public double  getPremium() {
		return this.Premium;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public int  getDetailCoverageLimit() {
		return this.DetailCoverageLimit;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public List<BOPTheftOfClientsPropertyDetail> getBOPTheftOfClientsPropertyDetail() {
		return this.BOPTheftOfClientsPropertyDetail;
	}
	public int  getAdditionalEmployeesCount() {
		return this.AdditionalEmployeesCount;
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
	public double  getAdditionalCharge() {
		return this.AdditionalCharge;
	}
	public double  getAddlLocationRate() {
		return this.AddlLocationRate;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getCoverageOnPolicyIndicator() {
		return this.CoverageOnPolicyIndicator;
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
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public double  getBaseRate() {
		return this.BaseRate;
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
	public double  getAddlEmployeeRate() {
		return this.AddlEmployeeRate;
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
	public double  getBasePremium() {
		return this.BasePremium;
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
	public int  getEmployeeDishtyApply_1() {
		return this.employeeDishtyApply_1;
	}
	public double  getCoverageLimit() {
		return this.CoverageLimit;
	}
	public double  getTheftOfClientsPropFactor() {
		return this.TheftOfClientsPropFactor;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getFinalAddlEmployeePremium() {
		return this.FinalAddlEmployeePremium;
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
	public void setTheftOfClientsPropFactor(double TheftOfClientsPropFactor) {
		this.TheftOfClientsPropFactor = TheftOfClientsPropFactor;
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
	public void setDetailCoverageLimit(int DetailCoverageLimit) {
		this.DetailCoverageLimit = DetailCoverageLimit;
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
	public void setAddlEmployeeRate(double AddlEmployeeRate) {
		this.AddlEmployeeRate = AddlEmployeeRate;
	}
	public void setEmployeeDishtyApply_1(int employeeDishtyApply_1) {
		this.employeeDishtyApply_1 = employeeDishtyApply_1;
	}
	public void setBasePremium(double BasePremium) {
		this.BasePremium = BasePremium;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setBOPTheftOfClientsPropertyDetail(List<BOPTheftOfClientsPropertyDetail> BOPTheftOfClientsPropertyDetail) {
		this.BOPTheftOfClientsPropertyDetail = BOPTheftOfClientsPropertyDetail;
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
	public void setBaseRate(double BaseRate) {
		this.BaseRate = BaseRate;
	}
	public void setCoverageLimit(double CoverageLimit) {
		this.CoverageLimit = CoverageLimit;
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
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setASLOBStatCode(String ASLOBStatCode) {
		this.ASLOBStatCode = ASLOBStatCode;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setAdditionalCharge(double AdditionalCharge) {
		this.AdditionalCharge = AdditionalCharge;
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
	public void setAddlLocationRate(double AddlLocationRate) {
		this.AddlLocationRate = AddlLocationRate;
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
	public void setAdditionalEmployeesCount(int AdditionalEmployeesCount) {
		this.AdditionalEmployeesCount = AdditionalEmployeesCount;
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
	public void setCoverageOnPolicyIndicator(int CoverageOnPolicyIndicator) {
		this.CoverageOnPolicyIndicator = CoverageOnPolicyIndicator;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setFinalAddlEmployeePremium(double FinalAddlEmployeePremium) {
		this.FinalAddlEmployeePremium = FinalAddlEmployeePremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}