package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPFineArts    extends Policy  {
	private String ASLOBStatCode;
	private int FeeIndicator;
	private double AnnualPremium;
	private String FormNumber;
	private double ApartmentBuildingsCharge;
	private Date Modified;
	private double PolicyTermPremium;
	private double RestaurantsFineArtsCharge;
	private List<BOPFineArtsApartmentCoverage> BOPFineArtsApartmentCoverage;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date RateDt;
	private Date EffectiveDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private double ApartmentCharge;
	private String PriorId;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private double EvaluatedPremium;
	private int ProRateIndicator;
	private String FormName;
	private int TermFactorIndicator;
	private List<BOPFineArtsRestaurantCoverage> BOPFineArtsRestaurantCoverage;
	private double ShortRateFactor;
	private String CoverageStatCode;
	private String ParentId;
	private String CreatedBy;
	private double ProRatedPriorPremium;
	private double RestaurantCharge;
	private int TaxIndicator;
	private int PremiumIndicator;
	private double PriorPremium;
	private double Charge;
	private Date Expiration;
	private double ShortRatePenalty;
	private double ChangePremium;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPFineArtsApartmentCoverage) {
			childs.addAll(BOPFineArtsApartmentCoverage);
		}
		if(null != BOPFineArtsRestaurantCoverage) {
			childs.addAll(BOPFineArtsRestaurantCoverage);
		}
		return childs;
	}


	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
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
	public double  getRestaurantsFineArtsCharge() {
		return this.RestaurantsFineArtsCharge;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public Date  getExpiration() {
		return this.Expiration;
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
	public double  getCharge() {
		return this.Charge;
	}
	public double  getApartmentCharge() {
		return this.ApartmentCharge;
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
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public List<BOPFineArtsApartmentCoverage> getBOPFineArtsApartmentCoverage() {
		return this.BOPFineArtsApartmentCoverage;
	}
	public double  getRestaurantCharge() {
		return this.RestaurantCharge;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
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
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public Date  getCreated() {
		return this.Created;
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
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public double  getApartmentBuildingsCharge() {
		return this.ApartmentBuildingsCharge;
	}
	public List<BOPFineArtsRestaurantCoverage> getBOPFineArtsRestaurantCoverage() {
		return this.BOPFineArtsRestaurantCoverage;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
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
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setBOPFineArtsRestaurantCoverage(List<BOPFineArtsRestaurantCoverage> BOPFineArtsRestaurantCoverage) {
		this.BOPFineArtsRestaurantCoverage = BOPFineArtsRestaurantCoverage;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
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
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setRestaurantCharge(double RestaurantCharge) {
		this.RestaurantCharge = RestaurantCharge;
	}
	public void setASLOBStatCode(String ASLOBStatCode) {
		this.ASLOBStatCode = ASLOBStatCode;
	}
	public void setApartmentCharge(double ApartmentCharge) {
		this.ApartmentCharge = ApartmentCharge;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setApartmentBuildingsCharge(double ApartmentBuildingsCharge) {
		this.ApartmentBuildingsCharge = ApartmentBuildingsCharge;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setId(String Id) {
		this.Id = Id;
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
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
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
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setBOPFineArtsApartmentCoverage(List<BOPFineArtsApartmentCoverage> BOPFineArtsApartmentCoverage) {
		this.BOPFineArtsApartmentCoverage = BOPFineArtsApartmentCoverage;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setRestaurantsFineArtsCharge(double RestaurantsFineArtsCharge) {
		this.RestaurantsFineArtsCharge = RestaurantsFineArtsCharge;
	}
}