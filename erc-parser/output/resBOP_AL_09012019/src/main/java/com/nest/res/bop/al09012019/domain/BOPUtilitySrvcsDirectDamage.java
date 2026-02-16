package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPUtilitySrvcsDirectDamage    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage;
	private String PriorId;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private String CoveredProperty;
	private int BuildingLimit;
	private double ChangePremium;
	private List<BOPUtilitySrvcsDirectDamageBldgWaterCoverage> BOPUtilitySrvcsDirectDamageBldgWaterCoverage;
	private int ShortRateIndicator;
	private int BuildingExposureStatAmount;
	private double TotalProRatedChangePremium;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private List<BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage;
	private Date RateDt;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;
	private double ProRatedPremium;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage;
	private Date Created;
	private double OverridePremium;
	private List<BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private List<BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private String CommunicationSupply;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage;
	private double ProRatedPriorPremium;
	private List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage;
	private double PriorPremium;
	private int BusnPrsnlPropExposureStatAmount;
	private int BusnPrsnlPropLimit;
	private double ShortRatePenalty;
	private List<BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage> BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage;
	private List<BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;
	private List<BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage;
	private Date Effective;
	private String PowerSupply;
	private int EarnedInFullIndicator;
	private String WaterSupply;
	private List<BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage;
	private String BuildingNumber;
	private String PremisesNumber;
	private List<BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage;
	private List<BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage;
	private int dsLimit;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgWaterCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgWaterCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage);
		}
		if(null != BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage) {
			childs.addAll(BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage);
		}
		return childs;
	}


	public List<BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage;
	}
	public int  getDsLimit() {
		return this.dsLimit;
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
	public List<BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage> getBOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage> getBOPUtilitySrvcsDirectDamageBldgWaterEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage;
	}
	public String  getWaterSupply() {
		return this.WaterSupply;
	}
	public String  getPowerSupply() {
		return this.PowerSupply;
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
	public List<BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage> getBOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage;
	}
	public int  getBusnPrsnlPropExposureStatAmount() {
		return this.BusnPrsnlPropExposureStatAmount;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgWaterCoverage> getBOPUtilitySrvcsDirectDamageBldgWaterCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage;
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
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage> getBOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage;
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
	public int  getBuildingExposureStatAmount() {
		return this.BuildingExposureStatAmount;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage;
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
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage;
	}
	public int  getBuildingLimit() {
		return this.BuildingLimit;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public List<BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage> getBOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage;
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
	public String  getCommunicationSupply() {
		return this.CommunicationSupply;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;
	}
	public List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage> getBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage() {
		return this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public int  getBusnPrsnlPropLimit() {
		return this.BusnPrsnlPropLimit;
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
	
	public void setBOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadCoverage;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgWaterCoverage(List<BOPUtilitySrvcsDirectDamageBldgWaterCoverage> BOPUtilitySrvcsDirectDamageBldgWaterCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage = BOPUtilitySrvcsDirectDamageBldgWaterCoverage;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadCoverage;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setBuildingLimit(int BuildingLimit) {
		this.BuildingLimit = BuildingLimit;
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
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadCoverage;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadCoverage;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadCoverage;
	}
	public void setBusnPrsnlPropLimit(int BusnPrsnlPropLimit) {
		this.BusnPrsnlPropLimit = BusnPrsnlPropLimit;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage;
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
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage = BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadCoverage;
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
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadEQCoverage;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationIncldgOverheadEQCoverage;
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
	public void setBOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage(List<BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage> BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBldgPowerExcludingOverheadCoverage;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;
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
	public void setBOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadEQCoverage;
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
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropCommunicationExcludingOverheadEQCoverage;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setBOPUtilitySrvcsDirectDamageBldgWaterEQCoverage(List<BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage> BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage = BOPUtilitySrvcsDirectDamageBldgWaterEQCoverage;
	}
	public void setBOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage(List<BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage> BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage) {
		this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerIncldgOverheadEQCoverage;
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
	public void setBuildingExposureStatAmount(int BuildingExposureStatAmount) {
		this.BuildingExposureStatAmount = BuildingExposureStatAmount;
	}
	public void setWaterSupply(String WaterSupply) {
		this.WaterSupply = WaterSupply;
	}
	public void setBusnPrsnlPropExposureStatAmount(int BusnPrsnlPropExposureStatAmount) {
		this.BusnPrsnlPropExposureStatAmount = BusnPrsnlPropExposureStatAmount;
	}
}