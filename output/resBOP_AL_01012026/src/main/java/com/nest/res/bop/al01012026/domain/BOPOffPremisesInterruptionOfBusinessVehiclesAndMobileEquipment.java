package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipment    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private double AdditionalPremiumCreditEndorsements;
	private double ExtendedBusinessIncomeFactor;
	private double OTCLossCosts;
	private String PriorId;
	private double FloodCoverageFactor;
	private double AdditionalPremiumBICoverageNoWaitingPeriod;
	private double EvaluatedPremium;
	private double WindHailExclusionFactor;
	private String BusinessIncomeNoWaitingPeriodOption;
	private String CollisionCoveredCauseOfLoss;
	private String DescribedPremises;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private String DescriptionBusinessActivities;
	private int PremiumIndicator;
	private Date Expiration;
	private double CollisionLossCosts;
	private double ChangePremium;
	private int ShortRateIndicator;
	private String CollisionCoverageStatCode;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double BasePremium;
	private double ProRateFactor;
	private double EarthquakeCoverageFactor;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String OTCCoverageStatCode;
	private String VersionedId;
	private double AdditionalPremiumCreditBICoverage;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String ExtendedBusinessIncome;
	private double BusinessIncomeNoWaitingPeriodOptionFactor;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail) {
			childs.addAll(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail);
		}
		return childs;
	}


	public double  getCollisionLossCosts() {
		return this.CollisionLossCosts;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public double  getEarthquakeCoverageFactor() {
		return this.EarthquakeCoverageFactor;
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
	public List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail> getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail() {
		return this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail;
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
	public double  getAdditionalPremiumCreditEndorsements() {
		return this.AdditionalPremiumCreditEndorsements;
	}
	public double  getWindHailExclusionFactor() {
		return this.WindHailExclusionFactor;
	}
	public String  getDescribedPremises() {
		return this.DescribedPremises;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getCollisionCoveredCauseOfLoss() {
		return this.CollisionCoveredCauseOfLoss;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public double  getExtendedBusinessIncomeFactor() {
		return this.ExtendedBusinessIncomeFactor;
	}
	public double  getAdditionalPremiumBICoverageNoWaitingPeriod() {
		return this.AdditionalPremiumBICoverageNoWaitingPeriod;
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
	public double  getOTCLossCosts() {
		return this.OTCLossCosts;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getBusinessIncomeNoWaitingPeriodOptionFactor() {
		return this.BusinessIncomeNoWaitingPeriodOptionFactor;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getOTCCoverageStatCode() {
		return this.OTCCoverageStatCode;
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
	public String  getDescriptionBusinessActivities() {
		return this.DescriptionBusinessActivities;
	}
	public double  getAdditionalPremiumCreditBICoverage() {
		return this.AdditionalPremiumCreditBICoverage;
	}
	public String  getExtendedBusinessIncome() {
		return this.ExtendedBusinessIncome;
	}
	public double  getBasePremium() {
		return this.BasePremium;
	}
	public String  getBusinessIncomeNoWaitingPeriodOption() {
		return this.BusinessIncomeNoWaitingPeriodOption;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getCollisionCoverageStatCode() {
		return this.CollisionCoverageStatCode;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public double  getFloodCoverageFactor() {
		return this.FloodCoverageFactor;
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
	public void setAdditionalPremiumCreditEndorsements(double AdditionalPremiumCreditEndorsements) {
		this.AdditionalPremiumCreditEndorsements = AdditionalPremiumCreditEndorsements;
	}
	public void setCollisionCoverageStatCode(String CollisionCoverageStatCode) {
		this.CollisionCoverageStatCode = CollisionCoverageStatCode;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setAdditionalPremiumCreditBICoverage(double AdditionalPremiumCreditBICoverage) {
		this.AdditionalPremiumCreditBICoverage = AdditionalPremiumCreditBICoverage;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setOTCCoverageStatCode(String OTCCoverageStatCode) {
		this.OTCCoverageStatCode = OTCCoverageStatCode;
	}
	public void setOTCLossCosts(double OTCLossCosts) {
		this.OTCLossCosts = OTCLossCosts;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setBusinessIncomeNoWaitingPeriodOption(String BusinessIncomeNoWaitingPeriodOption) {
		this.BusinessIncomeNoWaitingPeriodOption = BusinessIncomeNoWaitingPeriodOption;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setExtendedBusinessIncomeFactor(double ExtendedBusinessIncomeFactor) {
		this.ExtendedBusinessIncomeFactor = ExtendedBusinessIncomeFactor;
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
	public void setBasePremium(double BasePremium) {
		this.BasePremium = BasePremium;
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
	public void setCollisionLossCosts(double CollisionLossCosts) {
		this.CollisionLossCosts = CollisionLossCosts;
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
	public void setDescribedPremises(String DescribedPremises) {
		this.DescribedPremises = DescribedPremises;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setCollisionCoveredCauseOfLoss(String CollisionCoveredCauseOfLoss) {
		this.CollisionCoveredCauseOfLoss = CollisionCoveredCauseOfLoss;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setFloodCoverageFactor(double FloodCoverageFactor) {
		this.FloodCoverageFactor = FloodCoverageFactor;
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
	public void setAdditionalPremiumBICoverageNoWaitingPeriod(double AdditionalPremiumBICoverageNoWaitingPeriod) {
		this.AdditionalPremiumBICoverageNoWaitingPeriod = AdditionalPremiumBICoverageNoWaitingPeriod;
	}
	public void setDescriptionBusinessActivities(String DescriptionBusinessActivities) {
		this.DescriptionBusinessActivities = DescriptionBusinessActivities;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setBusinessIncomeNoWaitingPeriodOptionFactor(double BusinessIncomeNoWaitingPeriodOptionFactor) {
		this.BusinessIncomeNoWaitingPeriodOptionFactor = BusinessIncomeNoWaitingPeriodOptionFactor;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail(List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail) {
		this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail;
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
	public void setWindHailExclusionFactor(double WindHailExclusionFactor) {
		this.WindHailExclusionFactor = WindHailExclusionFactor;
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
	public void setEarthquakeCoverageFactor(double EarthquakeCoverageFactor) {
		this.EarthquakeCoverageFactor = EarthquakeCoverageFactor;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setExtendedBusinessIncome(String ExtendedBusinessIncome) {
		this.ExtendedBusinessIncome = ExtendedBusinessIncome;
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
}