package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentDetail    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String PercentInsuranceToExposure;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;
	private String CreatedBy;
	private int TaxIndicator;
	private List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private double InsuranceToExposureFactor;
	private int ShortRateIndicator;
	private String Option;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private String ExposureStatCode;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private String DescriptionScheduledPropertyOptionB;
	private String DescriptionScheduledPropertyOptionA;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int dsLimit;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage) {
			childs.addAll(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage);
		}
		if(null != BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage) {
			childs.addAll(BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage);
		}
		return childs;
	}


	public int  getDsLimit() {
		return this.dsLimit;
	}
	public String  getDescriptionScheduledPropertyOptionA() {
		return this.DescriptionScheduledPropertyOptionA;
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
	public String  getPercentInsuranceToExposure() {
		return this.PercentInsuranceToExposure;
	}
	public String  getOption() {
		return this.Option;
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
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage> getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage() {
		return this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;
	}
	public List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage> getBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage() {
		return this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getExposureStatCode() {
		return this.ExposureStatCode;
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
	public double  getInsuranceToExposureFactor() {
		return this.InsuranceToExposureFactor;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public String  getDescriptionScheduledPropertyOptionB() {
		return this.DescriptionScheduledPropertyOptionB;
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
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setDescriptionScheduledPropertyOptionA(String DescriptionScheduledPropertyOptionA) {
		this.DescriptionScheduledPropertyOptionA = DescriptionScheduledPropertyOptionA;
	}
	public void setDescriptionScheduledPropertyOptionB(String DescriptionScheduledPropertyOptionB) {
		this.DescriptionScheduledPropertyOptionB = DescriptionScheduledPropertyOptionB;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage(List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage) {
		this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentOTCCoverage;
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
	public void setPercentInsuranceToExposure(String PercentInsuranceToExposure) {
		this.PercentInsuranceToExposure = PercentInsuranceToExposure;
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
	public void setExposureStatCode(String ExposureStatCode) {
		this.ExposureStatCode = ExposureStatCode;
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
	public void setOption(String Option) {
		this.Option = Option;
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
	public void setInsuranceToExposureFactor(double InsuranceToExposureFactor) {
		this.InsuranceToExposureFactor = InsuranceToExposureFactor;
	}
	public void setBOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage(List<BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage> BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage) {
		this.BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage = BOPOffPremisesInterruptionOfBusinessVehiclesAndMobileEquipmentCollisionCoverage;
	}
}