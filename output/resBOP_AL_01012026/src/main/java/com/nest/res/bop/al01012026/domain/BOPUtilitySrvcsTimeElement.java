package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPUtilitySrvcsTimeElement    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private int ExposureStatAmount;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private List<BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage> BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;
	private String PriorId;
	private List<BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage> BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private List<BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage> BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage;
	private String CreatedBy;
	private List<BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage> BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage;
	private int TaxIndicator;
	private List<BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage> BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;
	private List<BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage> BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;
	private int PremiumIndicator;
	private List<BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage> BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;
	private Date Expiration;
	private List<BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage> BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;
	private String CoveredProperty;
	private double ChangePremium;
	private String WastewaterRemovalProperty;
	private int ShortRateIndicator;
	private List<BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage> BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private List<BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage> BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private String CommunicationSupply;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private String PowerSupply;
	private int EarnedInFullIndicator;
	private List<BOPUtilitySrvcsTimeElementWaterEQCoverage> BOPUtilitySrvcsTimeElementWaterEQCoverage;
	private String WaterSupply;
	private String BuildingNumber;
	private String PremisesNumber;
	private int dsLimit;
	private List<BOPUtilitySrvcsTimeElementWaterCoverage> BOPUtilitySrvcsTimeElementWaterCoverage;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementWaterEQCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementWaterEQCoverage);
		}
		if(null != BOPUtilitySrvcsTimeElementWaterCoverage) {
			childs.addAll(BOPUtilitySrvcsTimeElementWaterCoverage);
		}
		return childs;
	}


	public int  getDsLimit() {
		return this.dsLimit;
	}
	public int  getExposureStatAmount() {
		return this.ExposureStatAmount;
	}
	public List<BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage> getBOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage() {
		return this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;
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
	public List<BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage> getBOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage() {
		return this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getWaterSupply() {
		return this.WaterSupply;
	}
	public String  getPowerSupply() {
		return this.PowerSupply;
	}
	public List<BOPUtilitySrvcsTimeElementWaterCoverage> getBOPUtilitySrvcsTimeElementWaterCoverage() {
		return this.BOPUtilitySrvcsTimeElementWaterCoverage;
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
	public List<BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage> getBOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage() {
		return this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage;
	}
	public List<BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage> getBOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage() {
		return this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public List<BOPUtilitySrvcsTimeElementWaterEQCoverage> getBOPUtilitySrvcsTimeElementWaterEQCoverage() {
		return this.BOPUtilitySrvcsTimeElementWaterEQCoverage;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public String  getCoveredProperty() {
		return this.CoveredProperty;
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
	public List<BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage> getBOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage() {
		return this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;
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
	public String  getPremisesNumber() {
		return this.PremisesNumber;
	}
	public List<BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage> getBOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage() {
		return this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage;
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
	public List<BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage> getBOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage() {
		return this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;
	}
	public String  getWastewaterRemovalProperty() {
		return this.WastewaterRemovalProperty;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getCommunicationSupply() {
		return this.CommunicationSupply;
	}
	public List<BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage> getBOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage() {
		return this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public List<BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage> getBOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage() {
		return this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public List<BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage> getBOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage() {
		return this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;
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
	public void setBOPUtilitySrvcsTimeElementWaterCoverage(List<BOPUtilitySrvcsTimeElementWaterCoverage> BOPUtilitySrvcsTimeElementWaterCoverage) {
		this.BOPUtilitySrvcsTimeElementWaterCoverage = BOPUtilitySrvcsTimeElementWaterCoverage;
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
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setCoveredProperty(String CoveredProperty) {
		this.CoveredProperty = CoveredProperty;
	}
	public void setPowerSupply(String PowerSupply) {
		this.PowerSupply = PowerSupply;
	}
	public void setBOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage(List<BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage> BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage) {
		this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage = BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;
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
	public void setBOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage(List<BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage> BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage) {
		this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;
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
	public void setExposureStatAmount(int ExposureStatAmount) {
		this.ExposureStatAmount = ExposureStatAmount;
	}
	public void setBOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage(List<BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage> BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage) {
		this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage = BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;
	}
	public void setBOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage(List<BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage> BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage) {
		this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage = BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;
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
	public void setCommunicationSupply(String CommunicationSupply) {
		this.CommunicationSupply = CommunicationSupply;
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
	public void setBOPUtilitySrvcsTimeElementWaterEQCoverage(List<BOPUtilitySrvcsTimeElementWaterEQCoverage> BOPUtilitySrvcsTimeElementWaterEQCoverage) {
		this.BOPUtilitySrvcsTimeElementWaterEQCoverage = BOPUtilitySrvcsTimeElementWaterEQCoverage;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setBuildingNumber(String BuildingNumber) {
		this.BuildingNumber = BuildingNumber;
	}
	public void setWastewaterRemovalProperty(String WastewaterRemovalProperty) {
		this.WastewaterRemovalProperty = WastewaterRemovalProperty;
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
	public void setBOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage(List<BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage> BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage) {
		this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage = BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;
	}
	public void setBOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage(List<BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage> BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage) {
		this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage = BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setBOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage(List<BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage> BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage) {
		this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage = BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;
	}
	public void setBOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage(List<BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage> BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage) {
		this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage;
	}
	public void setWaterSupply(String WaterSupply) {
		this.WaterSupply = WaterSupply;
	}
	public void setBOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage(List<BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage> BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage) {
		this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage = BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;
	}
	public void setBOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage(List<BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage> BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage) {
		this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage = BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage;
	}
}