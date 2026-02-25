package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPSpoilgCov    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private double PowerOutageFactor;
	private int ExposureStatAmount;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private double EvaluatedPremium;
	private String CoverageType;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private double PowerOutageBreakdownFactor;
	private int TaxIndicator;
	private int PremiumIndicator;
	private double Rate;
	private Date Expiration;
	private double ManualPremium;
	private double ChangePremium;
	private int ShortRateIndicator;
	private String Classs;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private String PerishableStockDesc;
	private double AnnualPremium;
	private Date Modified;
	private String ClassIndicator;
	private String CyberCoverageExclusionIndicatorStatCode;
	private Date RateDt;
	private double ProRatedPremium;
	private int UnderwriterNotificationDiaryFlag;
	private Date Created;
	private double OverridePremium;
	private String MaintenanceAgreement;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int AgentNotificationDiaryFlag;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private int Ded;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private double CyberFactor;
	private int EarnedInFullIndicator;
	private String BuildingNumber;
	private String PremisesNumber;
	private int dsLimit;
	
	
	
	
	
	
	


	public int  getDed() {
		return this.Ded;
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
	public int  getUnderwriterNotificationDiaryFlag() {
		return this.UnderwriterNotificationDiaryFlag;
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
	public int  getAgentNotificationDiaryFlag() {
		return this.AgentNotificationDiaryFlag;
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
	public String  getClasss() {
		return this.Classs;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getCyberCoverageExclusionIndicatorStatCode() {
		return this.CyberCoverageExclusionIndicatorStatCode;
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
	public double  getManualPremium() {
		return this.ManualPremium;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getMaintenanceAgreement() {
		return this.MaintenanceAgreement;
	}
	public String  getCoverageType() {
		return this.CoverageType;
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
	public double  getPowerOutageBreakdownFactor() {
		return this.PowerOutageBreakdownFactor;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public String  getPerishableStockDesc() {
		return this.PerishableStockDesc;
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
	public double  getCyberFactor() {
		return this.CyberFactor;
	}
	public double  getPowerOutageFactor() {
		return this.PowerOutageFactor;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getClassIndicator() {
		return this.ClassIndicator;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setAgentNotificationDiaryFlag(int AgentNotificationDiaryFlag) {
		this.AgentNotificationDiaryFlag = AgentNotificationDiaryFlag;
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
	public void setPowerOutageFactor(double PowerOutageFactor) {
		this.PowerOutageFactor = PowerOutageFactor;
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
	public void setCyberCoverageExclusionIndicatorStatCode(String CyberCoverageExclusionIndicatorStatCode) {
		this.CyberCoverageExclusionIndicatorStatCode = CyberCoverageExclusionIndicatorStatCode;
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
	public void setClasss(String Classs) {
		this.Classs = Classs;
	}
	public void setClassIndicator(String ClassIndicator) {
		this.ClassIndicator = ClassIndicator;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setManualPremium(double ManualPremium) {
		this.ManualPremium = ManualPremium;
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
	public void setDed(int Ded) {
		this.Ded = Ded;
	}
	public void setUnderwriterNotificationDiaryFlag(int UnderwriterNotificationDiaryFlag) {
		this.UnderwriterNotificationDiaryFlag = UnderwriterNotificationDiaryFlag;
	}
	public void setMaintenanceAgreement(String MaintenanceAgreement) {
		this.MaintenanceAgreement = MaintenanceAgreement;
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
	public void setRate(double Rate) {
		this.Rate = Rate;
	}
	public void setExposureStatAmount(int ExposureStatAmount) {
		this.ExposureStatAmount = ExposureStatAmount;
	}
	public void setCyberFactor(double CyberFactor) {
		this.CyberFactor = CyberFactor;
	}
	public void setPowerOutageBreakdownFactor(double PowerOutageBreakdownFactor) {
		this.PowerOutageBreakdownFactor = PowerOutageBreakdownFactor;
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
	public void setPerishableStockDesc(String PerishableStockDesc) {
		this.PerishableStockDesc = PerishableStockDesc;
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
	public void setCoverageType(String CoverageType) {
		this.CoverageType = CoverageType;
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
}