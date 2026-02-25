package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPOrdinanceOrLawCov    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private List<BOPOrdinanceOrLawCov2And3Coverage> BOPOrdinanceOrLawCov2And3Coverage;
	private int ExposureStatAmount;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private double Cov1Factor;
	private double NumHoursRestorationFactor;
	private int NumHoursRestorationPeriod;
	private String PriorId;
	private String PostLossBusinessIncomeExtraExpense;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private List<BOPOrdinanceOrLawCov2Coverage> BOPOrdinanceOrLawCov2Coverage;
	private Date Expiration;
	private String BusnIncomeExtraExpenseCov;
	private double PostLossDirectPhysicalDamageFactor;
	private double ChangePremium;
	private String FloodCoverageAttached;
	private List<BOPOrdinanceOrLawCov2And3EQCoverage> BOPOrdinanceOrLawCov2And3EQCoverage;
	private List<BOPOrdinanceOrLawCov3EQCoverage> BOPOrdinanceOrLawCov3EQCoverage;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private List<BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private List<BOPOrdinanceOrLawCov2EQCoverage> BOPOrdinanceOrLawCov2EQCoverage;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private String FloodOnlyLimitation;
	private String PostLossDirectPhysicalDamage;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private List<BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
	private double ProRatedPriorPremium;
	private List<BOPOrdinanceOrLawCov3Coverage> BOPOrdinanceOrLawCov3Coverage;
	private double PriorPremium;
	private String Coverage;
	private double ShortRatePenalty;
	private List<BOPOrdinanceOrLawCov1Coverage> BOPOrdinanceOrLawCov1Coverage;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double PostLossBusinessIncomeExtraExpenseFactor;
	private String BuildingNumber;
	private String PremisesNumber;
	private String RestorationHoursRange;
	private List<BOPOrdinanceOrLawCov1EQCoverage> BOPOrdinanceOrLawCov1EQCoverage;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPOrdinanceOrLawCov2And3Coverage) {
			childs.addAll(BOPOrdinanceOrLawCov2And3Coverage);
		}
		if(null != BOPOrdinanceOrLawCov2Coverage) {
			childs.addAll(BOPOrdinanceOrLawCov2Coverage);
		}
		if(null != BOPOrdinanceOrLawCov2And3EQCoverage) {
			childs.addAll(BOPOrdinanceOrLawCov2And3EQCoverage);
		}
		if(null != BOPOrdinanceOrLawCov3EQCoverage) {
			childs.addAll(BOPOrdinanceOrLawCov3EQCoverage);
		}
		if(null != BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage) {
			childs.addAll(BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage);
		}
		if(null != BOPOrdinanceOrLawCov2EQCoverage) {
			childs.addAll(BOPOrdinanceOrLawCov2EQCoverage);
		}
		if(null != BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage) {
			childs.addAll(BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage);
		}
		if(null != BOPOrdinanceOrLawCov3Coverage) {
			childs.addAll(BOPOrdinanceOrLawCov3Coverage);
		}
		if(null != BOPOrdinanceOrLawCov1Coverage) {
			childs.addAll(BOPOrdinanceOrLawCov1Coverage);
		}
		if(null != BOPOrdinanceOrLawCov1EQCoverage) {
			childs.addAll(BOPOrdinanceOrLawCov1EQCoverage);
		}
		return childs;
	}


	public int  getExposureStatAmount() {
		return this.ExposureStatAmount;
	}
	public String  getBuildingNumber() {
		return this.BuildingNumber;
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
	public String  getFloodCoverageAttached() {
		return this.FloodCoverageAttached;
	}
	public List<BOPOrdinanceOrLawCov1Coverage> getBOPOrdinanceOrLawCov1Coverage() {
		return this.BOPOrdinanceOrLawCov1Coverage;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public List<BOPOrdinanceOrLawCov2EQCoverage> getBOPOrdinanceOrLawCov2EQCoverage() {
		return this.BOPOrdinanceOrLawCov2EQCoverage;
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
	public List<BOPOrdinanceOrLawCov3Coverage> getBOPOrdinanceOrLawCov3Coverage() {
		return this.BOPOrdinanceOrLawCov3Coverage;
	}
	public List<BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage> getBOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage() {
		return this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
	}
	public String  getBusnIncomeExtraExpenseCov() {
		return this.BusnIncomeExtraExpenseCov;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public double  getPostLossBusinessIncomeExtraExpenseFactor() {
		return this.PostLossBusinessIncomeExtraExpenseFactor;
	}
	public double  getNumHoursRestorationFactor() {
		return this.NumHoursRestorationFactor;
	}
	public String  getRestorationHoursRange() {
		return this.RestorationHoursRange;
	}
	public List<BOPOrdinanceOrLawCov1EQCoverage> getBOPOrdinanceOrLawCov1EQCoverage() {
		return this.BOPOrdinanceOrLawCov1EQCoverage;
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
	public List<BOPOrdinanceOrLawCov2And3Coverage> getBOPOrdinanceOrLawCov2And3Coverage() {
		return this.BOPOrdinanceOrLawCov2And3Coverage;
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
	public String  getPostLossDirectPhysicalDamage() {
		return this.PostLossDirectPhysicalDamage;
	}
	public String  getPremisesNumber() {
		return this.PremisesNumber;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public List<BOPOrdinanceOrLawCov2And3EQCoverage> getBOPOrdinanceOrLawCov2And3EQCoverage() {
		return this.BOPOrdinanceOrLawCov2And3EQCoverage;
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
	public String  getPostLossBusinessIncomeExtraExpense() {
		return this.PostLossBusinessIncomeExtraExpense;
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
	public int  getNumHoursRestorationPeriod() {
		return this.NumHoursRestorationPeriod;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public List<BOPOrdinanceOrLawCov3EQCoverage> getBOPOrdinanceOrLawCov3EQCoverage() {
		return this.BOPOrdinanceOrLawCov3EQCoverage;
	}
	public String  getFloodOnlyLimitation() {
		return this.FloodOnlyLimitation;
	}
	public double  getCov1Factor() {
		return this.Cov1Factor;
	}
	public List<BOPOrdinanceOrLawCov2Coverage> getBOPOrdinanceOrLawCov2Coverage() {
		return this.BOPOrdinanceOrLawCov2Coverage;
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
	public double  getPostLossDirectPhysicalDamageFactor() {
		return this.PostLossDirectPhysicalDamageFactor;
	}
	public String  getCoverage() {
		return this.Coverage;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public List<BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage> getBOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage() {
		return this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setNumHoursRestorationFactor(double NumHoursRestorationFactor) {
		this.NumHoursRestorationFactor = NumHoursRestorationFactor;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setPostLossDirectPhysicalDamage(String PostLossDirectPhysicalDamage) {
		this.PostLossDirectPhysicalDamage = PostLossDirectPhysicalDamage;
	}
	public void setBOPOrdinanceOrLawCov2And3Coverage(List<BOPOrdinanceOrLawCov2And3Coverage> BOPOrdinanceOrLawCov2And3Coverage) {
		this.BOPOrdinanceOrLawCov2And3Coverage = BOPOrdinanceOrLawCov2And3Coverage;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setRestorationHoursRange(String RestorationHoursRange) {
		this.RestorationHoursRange = RestorationHoursRange;
	}
	public void setFloodOnlyLimitation(String FloodOnlyLimitation) {
		this.FloodOnlyLimitation = FloodOnlyLimitation;
	}
	public void setPremisesNumber(String PremisesNumber) {
		this.PremisesNumber = PremisesNumber;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setNumHoursRestorationPeriod(int NumHoursRestorationPeriod) {
		this.NumHoursRestorationPeriod = NumHoursRestorationPeriod;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setPostLossBusinessIncomeExtraExpenseFactor(double PostLossBusinessIncomeExtraExpenseFactor) {
		this.PostLossBusinessIncomeExtraExpenseFactor = PostLossBusinessIncomeExtraExpenseFactor;
	}
	public void setBOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage(List<BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage) {
		this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage = BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;
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
	public void setBOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage(List<BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage> BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage) {
		this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage = BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
	}
	public void setCoverage(String Coverage) {
		this.Coverage = Coverage;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setCoverageStatCode(String CoverageStatCode) {
		this.CoverageStatCode = CoverageStatCode;
	}
	public void setBOPOrdinanceOrLawCov2Coverage(List<BOPOrdinanceOrLawCov2Coverage> BOPOrdinanceOrLawCov2Coverage) {
		this.BOPOrdinanceOrLawCov2Coverage = BOPOrdinanceOrLawCov2Coverage;
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
	public void setBOPOrdinanceOrLawCov3Coverage(List<BOPOrdinanceOrLawCov3Coverage> BOPOrdinanceOrLawCov3Coverage) {
		this.BOPOrdinanceOrLawCov3Coverage = BOPOrdinanceOrLawCov3Coverage;
	}
	public void setBOPOrdinanceOrLawCov1Coverage(List<BOPOrdinanceOrLawCov1Coverage> BOPOrdinanceOrLawCov1Coverage) {
		this.BOPOrdinanceOrLawCov1Coverage = BOPOrdinanceOrLawCov1Coverage;
	}
	public void setBusnIncomeExtraExpenseCov(String BusnIncomeExtraExpenseCov) {
		this.BusnIncomeExtraExpenseCov = BusnIncomeExtraExpenseCov;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setCov1Factor(double Cov1Factor) {
		this.Cov1Factor = Cov1Factor;
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
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setASLOBStatCode(String ASLOBStatCode) {
		this.ASLOBStatCode = ASLOBStatCode;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setBOPOrdinanceOrLawCov3EQCoverage(List<BOPOrdinanceOrLawCov3EQCoverage> BOPOrdinanceOrLawCov3EQCoverage) {
		this.BOPOrdinanceOrLawCov3EQCoverage = BOPOrdinanceOrLawCov3EQCoverage;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setBOPOrdinanceOrLawCov2And3EQCoverage(List<BOPOrdinanceOrLawCov2And3EQCoverage> BOPOrdinanceOrLawCov2And3EQCoverage) {
		this.BOPOrdinanceOrLawCov2And3EQCoverage = BOPOrdinanceOrLawCov2And3EQCoverage;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setBOPOrdinanceOrLawCov2EQCoverage(List<BOPOrdinanceOrLawCov2EQCoverage> BOPOrdinanceOrLawCov2EQCoverage) {
		this.BOPOrdinanceOrLawCov2EQCoverage = BOPOrdinanceOrLawCov2EQCoverage;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setBOPOrdinanceOrLawCov1EQCoverage(List<BOPOrdinanceOrLawCov1EQCoverage> BOPOrdinanceOrLawCov1EQCoverage) {
		this.BOPOrdinanceOrLawCov1EQCoverage = BOPOrdinanceOrLawCov1EQCoverage;
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
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setPostLossDirectPhysicalDamageFactor(double PostLossDirectPhysicalDamageFactor) {
		this.PostLossDirectPhysicalDamageFactor = PostLossDirectPhysicalDamageFactor;
	}
	public void setPostLossBusinessIncomeExtraExpense(String PostLossBusinessIncomeExtraExpense) {
		this.PostLossBusinessIncomeExtraExpense = PostLossBusinessIncomeExtraExpense;
	}
	public void setFloodCoverageAttached(String FloodCoverageAttached) {
		this.FloodCoverageAttached = FloodCoverageAttached;
	}
}