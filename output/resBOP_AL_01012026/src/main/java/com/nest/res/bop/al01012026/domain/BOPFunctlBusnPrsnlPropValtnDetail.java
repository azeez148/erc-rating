package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPFunctlBusnPrsnlPropValtnDetail    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String BldgCodeEffectivenessGradeStatCode;
	private int ExposureStatAmount;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private String ConstructionStatCode;
	private Date EffectiveDt;
	private String Desc;
	private String PriorId;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String PropertyDedStatAmount;
	private String CreatedBy;
	private String SprinkleredRatingIdentificationStatCode;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private int ShortRateIndicator;
	private String WindHailDedStatCode;
	private String WithFunctionalRatingBasisStatCode;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private List<BOPFunctlBusnPrsnlPropValtnCoverage> BOPFunctlBusnPrsnlPropValtnCoverage;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private String MoldDamageStatCode;
	private String FireProtectionStatCode;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private int EachOccStatLimit;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private double StatPremium;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private List<BOPNamedPerilsFunctlBusnPrsnlPropCoverage> BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String BuildingNumber;
	private String PremisesNumber;
	private int dsLimit;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPFunctlBusnPrsnlPropValtnCoverage) {
			childs.addAll(BOPFunctlBusnPrsnlPropValtnCoverage);
		}
		if(null != BOPNamedPerilsFunctlBusnPrsnlPropCoverage) {
			childs.addAll(BOPNamedPerilsFunctlBusnPrsnlPropCoverage);
		}
		return childs;
	}


	public int  getDsLimit() {
		return this.dsLimit;
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
	public String  getSprinkleredRatingIdentificationStatCode() {
		return this.SprinkleredRatingIdentificationStatCode;
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
	public String  getDesc() {
		return this.Desc;
	}
	public List<BOPNamedPerilsFunctlBusnPrsnlPropCoverage> getBOPNamedPerilsFunctlBusnPrsnlPropCoverage() {
		return this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
	}
	public double  getStatPremium() {
		return this.StatPremium;
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
	public List<BOPFunctlBusnPrsnlPropValtnCoverage> getBOPFunctlBusnPrsnlPropValtnCoverage() {
		return this.BOPFunctlBusnPrsnlPropValtnCoverage;
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
	public String  getFireProtectionStatCode() {
		return this.FireProtectionStatCode;
	}
	public String  getConstructionStatCode() {
		return this.ConstructionStatCode;
	}
	public String  getWindHailDedStatCode() {
		return this.WindHailDedStatCode;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getPropertyDedStatAmount() {
		return this.PropertyDedStatAmount;
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
	public int  getEachOccStatLimit() {
		return this.EachOccStatLimit;
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
	public String  getBldgCodeEffectivenessGradeStatCode() {
		return this.BldgCodeEffectivenessGradeStatCode;
	}
	public String  getMoldDamageStatCode() {
		return this.MoldDamageStatCode;
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
	public String  getWithFunctionalRatingBasisStatCode() {
		return this.WithFunctionalRatingBasisStatCode;
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
	
	public void setSprinkleredRatingIdentificationStatCode(String SprinkleredRatingIdentificationStatCode) {
		this.SprinkleredRatingIdentificationStatCode = SprinkleredRatingIdentificationStatCode;
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
	public void setPremisesNumber(String PremisesNumber) {
		this.PremisesNumber = PremisesNumber;
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
	public void setWindHailDedStatCode(String WindHailDedStatCode) {
		this.WindHailDedStatCode = WindHailDedStatCode;
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
	public void setConstructionStatCode(String ConstructionStatCode) {
		this.ConstructionStatCode = ConstructionStatCode;
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
	public void setMoldDamageStatCode(String MoldDamageStatCode) {
		this.MoldDamageStatCode = MoldDamageStatCode;
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
	public void setExposureStatAmount(int ExposureStatAmount) {
		this.ExposureStatAmount = ExposureStatAmount;
	}
	public void setPropertyDedStatAmount(String PropertyDedStatAmount) {
		this.PropertyDedStatAmount = PropertyDedStatAmount;
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
	public void setFireProtectionStatCode(String FireProtectionStatCode) {
		this.FireProtectionStatCode = FireProtectionStatCode;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setBOPNamedPerilsFunctlBusnPrsnlPropCoverage(List<BOPNamedPerilsFunctlBusnPrsnlPropCoverage> BOPNamedPerilsFunctlBusnPrsnlPropCoverage) {
		this.BOPNamedPerilsFunctlBusnPrsnlPropCoverage = BOPNamedPerilsFunctlBusnPrsnlPropCoverage;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setEachOccStatLimit(int EachOccStatLimit) {
		this.EachOccStatLimit = EachOccStatLimit;
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
	public void setBOPFunctlBusnPrsnlPropValtnCoverage(List<BOPFunctlBusnPrsnlPropValtnCoverage> BOPFunctlBusnPrsnlPropValtnCoverage) {
		this.BOPFunctlBusnPrsnlPropValtnCoverage = BOPFunctlBusnPrsnlPropValtnCoverage;
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
	public void setWithFunctionalRatingBasisStatCode(String WithFunctionalRatingBasisStatCode) {
		this.WithFunctionalRatingBasisStatCode = WithFunctionalRatingBasisStatCode;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setDesc(String Desc) {
		this.Desc = Desc;
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
	public void setStatPremium(double StatPremium) {
		this.StatPremium = StatPremium;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setBldgCodeEffectivenessGradeStatCode(String BldgCodeEffectivenessGradeStatCode) {
		this.BldgCodeEffectivenessGradeStatCode = BldgCodeEffectivenessGradeStatCode;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}