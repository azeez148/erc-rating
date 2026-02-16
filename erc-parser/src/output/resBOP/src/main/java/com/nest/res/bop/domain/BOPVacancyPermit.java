package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPVacancyPermit    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private Date expirationDate_1;
	private List<BOPVacancyPermitBldgCoverage> BOPVacancyPermitBldgCoverage;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private Date StartDate;
	private String PriorId;
	private double Factor;
	private Date formDate_1;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private Date periodFrom_1_Date;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date periodTo_1;
	private List<BOPVacancyPermitBusnPrsnlPropCoverage> BOPVacancyPermitBusnPrsnlPropCoverage;
	private Date Expiration;
	private double ChangePremium;
	private int ShortRateIndicator;
	private Date periodTo_1_Date;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private boolean vacancyPermitErrors_1;
	private double ProRateFactor;
	private Date effectiveDate_1_Date;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private String CauseOfLoss;
	private Date Modified;
	private Date periodFrom_1;
	private Date expirationDate_1_Date;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private int formDate_1_Days;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private Date effectiveDate_1;
	private Date policyDate_1;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date EndDate;
	private int policyDate_1_Days;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String BuildingNumber;
	private String PremisesNumber;
	private double VacancyPermitProRateFactor;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPVacancyPermitBldgCoverage) {
			childs.addAll(BOPVacancyPermitBldgCoverage);
		}
		if(null != BOPVacancyPermitBusnPrsnlPropCoverage) {
			childs.addAll(BOPVacancyPermitBusnPrsnlPropCoverage);
		}
		return childs;
	}


	public Date  getStartDate() {
		return this.StartDate;
	}
	public String  getBuildingNumber() {
		return this.BuildingNumber;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public Date  getEffectiveDate_1_Date() {
		return this.effectiveDate_1_Date;
	}
	public Date  getPeriodTo_1_Date() {
		return this.periodTo_1_Date;
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
	public List<BOPVacancyPermitBusnPrsnlPropCoverage> getBOPVacancyPermitBusnPrsnlPropCoverage() {
		return this.BOPVacancyPermitBusnPrsnlPropCoverage;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public Date  getFormDate_1() {
		return this.formDate_1;
	}
	public Date  getExpirationDate_1_Date() {
		return this.expirationDate_1_Date;
	}
	public double  getFactor() {
		return this.Factor;
	}
	public Date  getEndDate() {
		return this.EndDate;
	}
	public List<BOPVacancyPermitBldgCoverage> getBOPVacancyPermitBldgCoverage() {
		return this.BOPVacancyPermitBldgCoverage;
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
	public Date  getPeriodFrom_1() {
		return this.periodFrom_1;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public boolean  getVacancyPermitErrors_1() {
		return this.vacancyPermitErrors_1;
	}
	public Date  getPolicyDate_1() {
		return this.policyDate_1;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getCauseOfLoss() {
		return this.CauseOfLoss;
	}
	public Date  getEffectiveDate_1() {
		return this.effectiveDate_1;
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
	public Date  getPeriodTo_1() {
		return this.periodTo_1;
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
	public Date  getExpirationDate_1() {
		return this.expirationDate_1;
	}
	public int  getPolicyDate_1_Days() {
		return this.policyDate_1_Days;
	}
	public double  getVacancyPermitProRateFactor() {
		return this.VacancyPermitProRateFactor;
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
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getCoverageStatCode() {
		return this.CoverageStatCode;
	}
	public int  getFormDate_1_Days() {
		return this.formDate_1_Days;
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
	public Date  getPeriodFrom_1_Date() {
		return this.periodFrom_1_Date;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setVacancyPermitErrors_1(boolean vacancyPermitErrors_1) {
		this.vacancyPermitErrors_1 = vacancyPermitErrors_1;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setVacancyPermitProRateFactor(double VacancyPermitProRateFactor) {
		this.VacancyPermitProRateFactor = VacancyPermitProRateFactor;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setPremisesNumber(String PremisesNumber) {
		this.PremisesNumber = PremisesNumber;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setExpirationDate_1_Date(Date expirationDate_1_Date) {
		this.expirationDate_1_Date = expirationDate_1_Date;
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
	public void setExpirationDate_1(Date expirationDate_1) {
		this.expirationDate_1 = expirationDate_1;
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
	public void setPeriodTo_1(Date periodTo_1) {
		this.periodTo_1 = periodTo_1;
	}
	public void setPeriodTo_1_Date(Date periodTo_1_Date) {
		this.periodTo_1_Date = periodTo_1_Date;
	}
	public void setBOPVacancyPermitBldgCoverage(List<BOPVacancyPermitBldgCoverage> BOPVacancyPermitBldgCoverage) {
		this.BOPVacancyPermitBldgCoverage = BOPVacancyPermitBldgCoverage;
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
	public void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setPolicyDate_1(Date policyDate_1) {
		this.policyDate_1 = policyDate_1;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setFormDate_1(Date formDate_1) {
		this.formDate_1 = formDate_1;
	}
	public void setPeriodFrom_1_Date(Date periodFrom_1_Date) {
		this.periodFrom_1_Date = periodFrom_1_Date;
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
	public void setBOPVacancyPermitBusnPrsnlPropCoverage(List<BOPVacancyPermitBusnPrsnlPropCoverage> BOPVacancyPermitBusnPrsnlPropCoverage) {
		this.BOPVacancyPermitBusnPrsnlPropCoverage = BOPVacancyPermitBusnPrsnlPropCoverage;
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
	public void setPeriodFrom_1(Date periodFrom_1) {
		this.periodFrom_1 = periodFrom_1;
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
	public void setBuildingNumber(String BuildingNumber) {
		this.BuildingNumber = BuildingNumber;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setCauseOfLoss(String CauseOfLoss) {
		this.CauseOfLoss = CauseOfLoss;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setEffectiveDate_1_Date(Date effectiveDate_1_Date) {
		this.effectiveDate_1_Date = effectiveDate_1_Date;
	}
	public void setEffectiveDate_1(Date effectiveDate_1) {
		this.effectiveDate_1 = effectiveDate_1;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setPolicyDate_1_Days(int policyDate_1_Days) {
		this.policyDate_1_Days = policyDate_1_Days;
	}
	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
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
	public void setFormDate_1_Days(int formDate_1_Days) {
		this.formDate_1_Days = formDate_1_Days;
	}
}