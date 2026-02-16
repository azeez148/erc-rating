package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPRestaurants    extends Policy  {
	private int FeeIndicator;
	private int AddlAdvertisingExpenseLimit;
	private String FormNumber;
	private double PolicyTermPremium;
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
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private List<BOPRestaurantsSpoilageCoverage> BOPRestaurantsSpoilageCoverage;
	private double ChangePremium;
	private int ShortRateIndicator;
	private String Classs;
	private String RestaurantHeader;
	private double TotalProRatedChangePremium;
	private int FoodContaminationLimit;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private String AdvertisingExpenseHeader;
	private double AnnualPremium;
	private Date Modified;
	private List<BOPRestaurantsAdvertisingExpenseCoverage> BOPRestaurantsAdvertisingExpenseCoverage;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String MaintenanceAgreement;
	private Date ChangeEffectiveDt;
	private String SpoilageHeader;
	private String VersionedId;
	private int ProRateIndicator;
	private List<BOPRestaurantsRestaurantsCoverage> BOPRestaurantsRestaurantsCoverage;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double Charge;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String FoodContaminationHeader;
	private List<BOPRestaurantFoodContaminationCoverage> BOPRestaurantFoodContaminationCoverage;
	private int dsLimit;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPRestaurantsSpoilageCoverage) {
			childs.addAll(BOPRestaurantsSpoilageCoverage);
		}
		if(null != BOPRestaurantsAdvertisingExpenseCoverage) {
			childs.addAll(BOPRestaurantsAdvertisingExpenseCoverage);
		}
		if(null != BOPRestaurantsRestaurantsCoverage) {
			childs.addAll(BOPRestaurantsRestaurantsCoverage);
		}
		if(null != BOPRestaurantFoodContaminationCoverage) {
			childs.addAll(BOPRestaurantFoodContaminationCoverage);
		}
		return childs;
	}


	public int  getDsLimit() {
		return this.dsLimit;
	}
	public List<BOPRestaurantFoodContaminationCoverage> getBOPRestaurantFoodContaminationCoverage() {
		return this.BOPRestaurantFoodContaminationCoverage;
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
	public int  getFoodContaminationLimit() {
		return this.FoodContaminationLimit;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public List<BOPRestaurantsSpoilageCoverage> getBOPRestaurantsSpoilageCoverage() {
		return this.BOPRestaurantsSpoilageCoverage;
	}
	public double  getCharge() {
		return this.Charge;
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
	public String  getAdvertisingExpenseHeader() {
		return this.AdvertisingExpenseHeader;
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
	public String  getRestaurantHeader() {
		return this.RestaurantHeader;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public List<BOPRestaurantsRestaurantsCoverage> getBOPRestaurantsRestaurantsCoverage() {
		return this.BOPRestaurantsRestaurantsCoverage;
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
	public String  getFoodContaminationHeader() {
		return this.FoodContaminationHeader;
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
	public String  getSpoilageHeader() {
		return this.SpoilageHeader;
	}
	public List<BOPRestaurantsAdvertisingExpenseCoverage> getBOPRestaurantsAdvertisingExpenseCoverage() {
		return this.BOPRestaurantsAdvertisingExpenseCoverage;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public int  getAddlAdvertisingExpenseLimit() {
		return this.AddlAdvertisingExpenseLimit;
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
	public void setSpoilageHeader(String SpoilageHeader) {
		this.SpoilageHeader = SpoilageHeader;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setFoodContaminationLimit(int FoodContaminationLimit) {
		this.FoodContaminationLimit = FoodContaminationLimit;
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
	public void setBOPRestaurantFoodContaminationCoverage(List<BOPRestaurantFoodContaminationCoverage> BOPRestaurantFoodContaminationCoverage) {
		this.BOPRestaurantFoodContaminationCoverage = BOPRestaurantFoodContaminationCoverage;
	}
	public void setRestaurantHeader(String RestaurantHeader) {
		this.RestaurantHeader = RestaurantHeader;
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
	public void setBOPRestaurantsSpoilageCoverage(List<BOPRestaurantsSpoilageCoverage> BOPRestaurantsSpoilageCoverage) {
		this.BOPRestaurantsSpoilageCoverage = BOPRestaurantsSpoilageCoverage;
	}
	public void setFoodContaminationHeader(String FoodContaminationHeader) {
		this.FoodContaminationHeader = FoodContaminationHeader;
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
	public void setMaintenanceAgreement(String MaintenanceAgreement) {
		this.MaintenanceAgreement = MaintenanceAgreement;
	}
	public void setAdvertisingExpenseHeader(String AdvertisingExpenseHeader) {
		this.AdvertisingExpenseHeader = AdvertisingExpenseHeader;
	}
	public void setBOPRestaurantsRestaurantsCoverage(List<BOPRestaurantsRestaurantsCoverage> BOPRestaurantsRestaurantsCoverage) {
		this.BOPRestaurantsRestaurantsCoverage = BOPRestaurantsRestaurantsCoverage;
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
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setCharge(double Charge) {
		this.Charge = Charge;
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
	public void setCoverageType(String CoverageType) {
		this.CoverageType = CoverageType;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setBOPRestaurantsAdvertisingExpenseCoverage(List<BOPRestaurantsAdvertisingExpenseCoverage> BOPRestaurantsAdvertisingExpenseCoverage) {
		this.BOPRestaurantsAdvertisingExpenseCoverage = BOPRestaurantsAdvertisingExpenseCoverage;
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
	public void setAddlAdvertisingExpenseLimit(int AddlAdvertisingExpenseLimit) {
		this.AddlAdvertisingExpenseLimit = AddlAdvertisingExpenseLimit;
	}
}