package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPContrctrsInstalltnToolsAndEquipmtCov    extends Policy  {
	private double EmployeeToolsDedFactor;
	private int FeeIndicator;
	private String Deductible;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double OptionalBlanketDedFactor;
	private double Premium;
	private Date EffectiveDt;
	private String Coverage3Header;
	private int NonOwnedToolsDedFactorLimit;
	private String PriorId;
	private String PropertyAtATemporaryStorageLocationLimit;
	private double ScheduledPropDedFactor;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private double ContrctrsDedFactor;
	private double WindHailScheduledPropDedFactor;
	private List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;
	private int EmployeeToolsDedFactorLimit;
	private String Coverage4Header;
	private String CreatedBy;
	private double DeductibleFactor;
	private String DeductibleSelect;
	private List<BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
	private int TaxIndicator;
	private String ContrctrsInstalltnHeader;
	private int PremiumIndicator;
	private double Rate;
	private Date Expiration;
	private String PropertyInTransitLimit;
	private double ChangePremium;
	private List<BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
	private List<BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
	private double MandatoryPremium;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private int AdjustedBlanketLimit;
	private double OptionalEmployeeToolsDedFactor;
	private double ProRateFactor;
	private double BlanketDedFactor;
	private double AnnualPremium;
	private int TotalLimit;
	private Date Modified;
	private int BldgAndBPPLimit;
	private Date RateDt;
	private double OptionalScheduledPropDedFactor;
	private double ProRatedPremium;
	private List<BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage> BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
	private Date Created;
	private double OverridePremium;
	private int limit_1;
	private Date ChangeEffectiveDt;
	private int ScheduledPropDedFactorLimit;
	private String VersionedId;
	private double WindHailEmployeeToolsDedFactor;
	private double OptionalNonOwnedToolsDedFactor;
	private int BlanketSubLimit;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private int BldgAndBPPLimitTemp;
	private String CoverageStatCode;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private int ScheduledLimit;
	private int BlanketDedFactorLimit;
	private double ShortRatePenalty;
	private double WindHailBlanketDedFactor;
	private String WindHailDeductible;
	private double NonOwnedToolsDedFactor;
	private int SubLimitNotInExcess;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String ContrctsToolsAndEquipmntTypeHeader;
	private List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail;
	private double TotalPremium;
	private int dsLimit;
	private double WindHailNonOwnedToolsDedFactor;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage) {
			childs.addAll(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage);
		}
		if(null != BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage) {
			childs.addAll(BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage);
		}
		if(null != BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage) {
			childs.addAll(BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage);
		}
		if(null != BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage) {
			childs.addAll(BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage);
		}
		if(null != BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage) {
			childs.addAll(BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage);
		}
		if(null != BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail) {
			childs.addAll(BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail);
		}
		return childs;
	}


	public int  getDsLimit() {
		return this.dsLimit;
	}
	public int  getBlanketSubLimit() {
		return this.BlanketSubLimit;
	}
	public String  getDeductible() {
		return this.Deductible;
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
	public String  getCoverage3Header() {
		return this.Coverage3Header;
	}
	public double  getProRateFactor() {
		return this.ProRateFactor;
	}
	public double  getPremium() {
		return this.Premium;
	}
	public List<BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage> getBOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage() {
		return this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
	}
	public int  getScheduledLimit() {
		return this.ScheduledLimit;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public List<BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage> getBOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage() {
		return this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public double  getContrctrsDedFactor() {
		return this.ContrctrsDedFactor;
	}
	public String  getContrctsToolsAndEquipmntTypeHeader() {
		return this.ContrctsToolsAndEquipmntTypeHeader;
	}
	public double  getWindHailBlanketDedFactor() {
		return this.WindHailBlanketDedFactor;
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
	public double  getOptionalEmployeeToolsDedFactor() {
		return this.OptionalEmployeeToolsDedFactor;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getBlanketDedFactor() {
		return this.BlanketDedFactor;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public double  getOptionalScheduledPropDedFactor() {
		return this.OptionalScheduledPropDedFactor;
	}
	public double  getWindHailEmployeeToolsDedFactor() {
		return this.WindHailEmployeeToolsDedFactor;
	}
	public String  getPropertyAtATemporaryStorageLocationLimit() {
		return this.PropertyAtATemporaryStorageLocationLimit;
	}
	public double  getWindHailScheduledPropDedFactor() {
		return this.WindHailScheduledPropDedFactor;
	}
	public int  getAdjustedBlanketLimit() {
		return this.AdjustedBlanketLimit;
	}
	public double  getNonOwnedToolsDedFactor() {
		return this.NonOwnedToolsDedFactor;
	}
	public int  getLimit_1() {
		return this.limit_1;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getWindHailDeductible() {
		return this.WindHailDeductible;
	}
	public List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail> getBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail() {
		return this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail;
	}
	public double  getDeductibleFactor() {
		return this.DeductibleFactor;
	}
	public int  getEmployeeToolsDedFactorLimit() {
		return this.EmployeeToolsDedFactorLimit;
	}
	public String  getCoverage4Header() {
		return this.Coverage4Header;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public int  getScheduledPropDedFactorLimit() {
		return this.ScheduledPropDedFactorLimit;
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
	public List<BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage> getBOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage() {
		return this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public int  getBldgAndBPPLimit() {
		return this.BldgAndBPPLimit;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public int  getBldgAndBPPLimitTemp() {
		return this.BldgAndBPPLimitTemp;
	}
	public int  getTotalLimit() {
		return this.TotalLimit;
	}
	public String  getPropertyInTransitLimit() {
		return this.PropertyInTransitLimit;
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
	public double  getOptionalBlanketDedFactor() {
		return this.OptionalBlanketDedFactor;
	}
	public List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage> getBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage() {
		return this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;
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
	public String  getContrctrsInstalltnHeader() {
		return this.ContrctrsInstalltnHeader;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public int  getNonOwnedToolsDedFactorLimit() {
		return this.NonOwnedToolsDedFactorLimit;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public double  getOptionalNonOwnedToolsDedFactor() {
		return this.OptionalNonOwnedToolsDedFactor;
	}
	public int  getSubLimitNotInExcess() {
		return this.SubLimitNotInExcess;
	}
	public List<BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage> getBOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage() {
		return this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
	}
	public double  getTotalPremium() {
		return this.TotalPremium;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public double  getRate() {
		return this.Rate;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public double  getWindHailNonOwnedToolsDedFactor() {
		return this.WindHailNonOwnedToolsDedFactor;
	}
	public double  getMandatoryPremium() {
		return this.MandatoryPremium;
	}
	public String  getDeductibleSelect() {
		return this.DeductibleSelect;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public int  getBlanketDedFactorLimit() {
		return this.BlanketDedFactorLimit;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public double  getScheduledPropDedFactor() {
		return this.ScheduledPropDedFactor;
	}
	public double  getEmployeeToolsDedFactor() {
		return this.EmployeeToolsDedFactor;
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
	public void setCoverage4Header(String Coverage4Header) {
		this.Coverage4Header = Coverage4Header;
	}
	public void setBOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage(List<BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage) {
		this.BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtEmployeeToolsCoverage;
	}
	public void setNonOwnedToolsDedFactor(double NonOwnedToolsDedFactor) {
		this.NonOwnedToolsDedFactor = NonOwnedToolsDedFactor;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setWindHailBlanketDedFactor(double WindHailBlanketDedFactor) {
		this.WindHailBlanketDedFactor = WindHailBlanketDedFactor;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setOptionalNonOwnedToolsDedFactor(double OptionalNonOwnedToolsDedFactor) {
		this.OptionalNonOwnedToolsDedFactor = OptionalNonOwnedToolsDedFactor;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage(List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage) {
		this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage = BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCoverage;
	}
	public void setOptionalEmployeeToolsDedFactor(double OptionalEmployeeToolsDedFactor) {
		this.OptionalEmployeeToolsDedFactor = OptionalEmployeeToolsDedFactor;
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
	public void setDeductible(String Deductible) {
		this.Deductible = Deductible;
	}
	public void setWindHailEmployeeToolsDedFactor(double WindHailEmployeeToolsDedFactor) {
		this.WindHailEmployeeToolsDedFactor = WindHailEmployeeToolsDedFactor;
	}
	public void setEmployeeToolsDedFactor(double EmployeeToolsDedFactor) {
		this.EmployeeToolsDedFactor = EmployeeToolsDedFactor;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setBlanketDedFactorLimit(int BlanketDedFactorLimit) {
		this.BlanketDedFactorLimit = BlanketDedFactorLimit;
	}
	public void setScheduledPropDedFactorLimit(int ScheduledPropDedFactorLimit) {
		this.ScheduledPropDedFactorLimit = ScheduledPropDedFactorLimit;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setCoverageStatCode(String CoverageStatCode) {
		this.CoverageStatCode = CoverageStatCode;
	}
	public void setDsLimit(int dsLimit) {
		this.dsLimit = dsLimit;
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
	public void setBlanketSubLimit(int BlanketSubLimit) {
		this.BlanketSubLimit = BlanketSubLimit;
	}
	public void setWindHailNonOwnedToolsDedFactor(double WindHailNonOwnedToolsDedFactor) {
		this.WindHailNonOwnedToolsDedFactor = WindHailNonOwnedToolsDedFactor;
	}
	public void setAdjustedBlanketLimit(int AdjustedBlanketLimit) {
		this.AdjustedBlanketLimit = AdjustedBlanketLimit;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setBOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage(List<BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage) {
		this.BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtBlanketToolsCoverage;
	}
	public void setChangeEffectiveDt(Date ChangeEffectiveDt) {
		this.ChangeEffectiveDt = ChangeEffectiveDt;
	}
	public void setExpirationDt(Date ExpirationDt) {
		this.ExpirationDt = ExpirationDt;
	}
	public void setContrctrsInstalltnHeader(String ContrctrsInstalltnHeader) {
		this.ContrctrsInstalltnHeader = ContrctrsInstalltnHeader;
	}
	public void setTotalPremium(double TotalPremium) {
		this.TotalPremium = TotalPremium;
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
	public void setPropertyInTransitLimit(String PropertyInTransitLimit) {
		this.PropertyInTransitLimit = PropertyInTransitLimit;
	}
	public void setEmployeeToolsDedFactorLimit(int EmployeeToolsDedFactorLimit) {
		this.EmployeeToolsDedFactorLimit = EmployeeToolsDedFactorLimit;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setDeductibleSelect(String DeductibleSelect) {
		this.DeductibleSelect = DeductibleSelect;
	}
	public void setTotalLimit(int TotalLimit) {
		this.TotalLimit = TotalLimit;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setBOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage(List<BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage> BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage) {
		this.BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage = BOPContrctrsInstalltnToolsAndEquipmtNonOwnedToolsCoverage;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setOptionalScheduledPropDedFactor(double OptionalScheduledPropDedFactor) {
		this.OptionalScheduledPropDedFactor = OptionalScheduledPropDedFactor;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setSubLimitNotInExcess(int SubLimitNotInExcess) {
		this.SubLimitNotInExcess = SubLimitNotInExcess;
	}
	public void setMandatoryPremium(double MandatoryPremium) {
		this.MandatoryPremium = MandatoryPremium;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setBOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail(List<BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail> BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail) {
		this.BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail = BOPContrctrsInstalltnToolsAndEquipmtScheduledPropCovDetail;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setPremium(double Premium) {
		this.Premium = Premium;
	}
	public void setBldgAndBPPLimitTemp(int BldgAndBPPLimitTemp) {
		this.BldgAndBPPLimitTemp = BldgAndBPPLimitTemp;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setScheduledLimit(int ScheduledLimit) {
		this.ScheduledLimit = ScheduledLimit;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setNonOwnedToolsDedFactorLimit(int NonOwnedToolsDedFactorLimit) {
		this.NonOwnedToolsDedFactorLimit = NonOwnedToolsDedFactorLimit;
	}
	public void setBlanketDedFactor(double BlanketDedFactor) {
		this.BlanketDedFactor = BlanketDedFactor;
	}
	public void setLimit_1(int limit_1) {
		this.limit_1 = limit_1;
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
	public void setContrctsToolsAndEquipmntTypeHeader(String ContrctsToolsAndEquipmntTypeHeader) {
		this.ContrctsToolsAndEquipmntTypeHeader = ContrctsToolsAndEquipmntTypeHeader;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setPropertyAtATemporaryStorageLocationLimit(String PropertyAtATemporaryStorageLocationLimit) {
		this.PropertyAtATemporaryStorageLocationLimit = PropertyAtATemporaryStorageLocationLimit;
	}
	public void setOptionalBlanketDedFactor(double OptionalBlanketDedFactor) {
		this.OptionalBlanketDedFactor = OptionalBlanketDedFactor;
	}
	public void setWindHailScheduledPropDedFactor(double WindHailScheduledPropDedFactor) {
		this.WindHailScheduledPropDedFactor = WindHailScheduledPropDedFactor;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setWindHailDeductible(String WindHailDeductible) {
		this.WindHailDeductible = WindHailDeductible;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setBOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage(List<BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage> BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage) {
		this.BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage = BOPContrctrsInstalltnToolsAndEquipmtInstalltnCoverage;
	}
	public void setBldgAndBPPLimit(int BldgAndBPPLimit) {
		this.BldgAndBPPLimit = BldgAndBPPLimit;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setContrctrsDedFactor(double ContrctrsDedFactor) {
		this.ContrctrsDedFactor = ContrctrsDedFactor;
	}
	public void setDeductibleFactor(double DeductibleFactor) {
		this.DeductibleFactor = DeductibleFactor;
	}
	public void setCoverage3Header(String Coverage3Header) {
		this.Coverage3Header = Coverage3Header;
	}
	public void setScheduledPropDedFactor(double ScheduledPropDedFactor) {
		this.ScheduledPropDedFactor = ScheduledPropDedFactor;
	}
}