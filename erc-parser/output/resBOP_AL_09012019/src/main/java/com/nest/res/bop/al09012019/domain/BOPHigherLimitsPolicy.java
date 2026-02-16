package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPHigherLimitsPolicy    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String InterruptionComputerOpsCoverage;
	private String PriorId;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private double ElectronicDataCoverageGeneratedPremium;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private int InterruptionComputerOpsCoverageLimit;
	private Date Expiration;
	private List<BOPHigherLimitsPolicyDetail> BOPHigherLimitsPolicyDetail;
	private double ChangePremium;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private double AnnualPremium;
	private Date Modified;
	private String ElectronicDataCoverage;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private int ForgeryAlterationCoverageLimit;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private double ForgeryAlterationCoverageGeneratedPremium;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double InterruptionComputerOpsCoverageGeneratedPremium;
	private int ElectronicDataCoverageLimit;
	private String ForgeryAlterationCoverage;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPHigherLimitsPolicyDetail) {
			childs.addAll(BOPHigherLimitsPolicyDetail);
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
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public int  getElectronicDataCoverageLimit() {
		return this.ElectronicDataCoverageLimit;
	}
	public String  getForgeryAlterationCoverage() {
		return this.ForgeryAlterationCoverage;
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
	public int  getInterruptionComputerOpsCoverageLimit() {
		return this.InterruptionComputerOpsCoverageLimit;
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
	public double  getForgeryAlterationCoverageGeneratedPremium() {
		return this.ForgeryAlterationCoverageGeneratedPremium;
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
	public String  getElectronicDataCoverage() {
		return this.ElectronicDataCoverage;
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
	public List<BOPHigherLimitsPolicyDetail> getBOPHigherLimitsPolicyDetail() {
		return this.BOPHigherLimitsPolicyDetail;
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
	public double  getInterruptionComputerOpsCoverageGeneratedPremium() {
		return this.InterruptionComputerOpsCoverageGeneratedPremium;
	}
	public int  getForgeryAlterationCoverageLimit() {
		return this.ForgeryAlterationCoverageLimit;
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
	public String  getParentId() {
		return this.ParentId;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public String  getInterruptionComputerOpsCoverage() {
		return this.InterruptionComputerOpsCoverage;
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
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public double  getElectronicDataCoverageGeneratedPremium() {
		return this.ElectronicDataCoverageGeneratedPremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setElectronicDataCoverageGeneratedPremium(double ElectronicDataCoverageGeneratedPremium) {
		this.ElectronicDataCoverageGeneratedPremium = ElectronicDataCoverageGeneratedPremium;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setInterruptionComputerOpsCoverageLimit(int InterruptionComputerOpsCoverageLimit) {
		this.InterruptionComputerOpsCoverageLimit = InterruptionComputerOpsCoverageLimit;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setForgeryAlterationCoverageGeneratedPremium(double ForgeryAlterationCoverageGeneratedPremium) {
		this.ForgeryAlterationCoverageGeneratedPremium = ForgeryAlterationCoverageGeneratedPremium;
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
	public void setInterruptionComputerOpsCoverageGeneratedPremium(double InterruptionComputerOpsCoverageGeneratedPremium) {
		this.InterruptionComputerOpsCoverageGeneratedPremium = InterruptionComputerOpsCoverageGeneratedPremium;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setElectronicDataCoverageLimit(int ElectronicDataCoverageLimit) {
		this.ElectronicDataCoverageLimit = ElectronicDataCoverageLimit;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setBOPHigherLimitsPolicyDetail(List<BOPHigherLimitsPolicyDetail> BOPHigherLimitsPolicyDetail) {
		this.BOPHigherLimitsPolicyDetail = BOPHigherLimitsPolicyDetail;
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
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setInterruptionComputerOpsCoverage(String InterruptionComputerOpsCoverage) {
		this.InterruptionComputerOpsCoverage = InterruptionComputerOpsCoverage;
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
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setElectronicDataCoverage(String ElectronicDataCoverage) {
		this.ElectronicDataCoverage = ElectronicDataCoverage;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
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
	public void setForgeryAlterationCoverage(String ForgeryAlterationCoverage) {
		this.ForgeryAlterationCoverage = ForgeryAlterationCoverage;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setForgeryAlterationCoverageLimit(int ForgeryAlterationCoverageLimit) {
		this.ForgeryAlterationCoverageLimit = ForgeryAlterationCoverageLimit;
	}
}