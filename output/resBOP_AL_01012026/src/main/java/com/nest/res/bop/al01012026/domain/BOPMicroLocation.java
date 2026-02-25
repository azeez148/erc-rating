package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPMicroLocation    extends Policy  {
	private int FeeIndicator;
	private double MicroLCM;
	private String StreetName;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private List<BOPMicroClassification> BOPMicroClassification;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private String StreetNumber;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private String Constructed;
	private String CityName;
	private double ChangePremium;
	private String CountyNameOverride;
	private String CityNameOverride;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private String CountyDivision;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private String ZipCodeOverride;
	private Date Created;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String OptionalDeductible;
	private String VersionedId;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private String ZipCode;
	private double PriorPremium;
	private String RatingTerritory;
	private double ShortRatePenalty;
	private String CountyName;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double OptionalDeductibleFactor;
	private String AddressID;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPMicroClassification) {
			childs.addAll(BOPMicroClassification);
		}
		return childs;
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
	public String  getOptionalDeductible() {
		return this.OptionalDeductible;
	}
	public String  getCityName() {
		return this.CityName;
	}
	public double  getMicroLCM() {
		return this.MicroLCM;
	}
	public List<BOPMicroClassification> getBOPMicroClassification() {
		return this.BOPMicroClassification;
	}
	public double  getOptionalDeductibleFactor() {
		return this.OptionalDeductibleFactor;
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
	public String  getCityNameOverride() {
		return this.CityNameOverride;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getRatingTerritory() {
		return this.RatingTerritory;
	}
	public String  getCountyDivision() {
		return this.CountyDivision;
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
	public String  getZipCodeOverride() {
		return this.ZipCodeOverride;
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
	public String  getCountyName() {
		return this.CountyName;
	}
	public String  getAddressID() {
		return this.AddressID;
	}
	public String  getStreetNumber() {
		return this.StreetNumber;
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
	public String  getConstructed() {
		return this.Constructed;
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
	public String  getCountyNameOverride() {
		return this.CountyNameOverride;
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
	public String  getZipCode() {
		return this.ZipCode;
	}
	public String  getStreetName() {
		return this.StreetName;
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
	
	public void setCityNameOverride(String CityNameOverride) {
		this.CityNameOverride = CityNameOverride;
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
	public void setOptionalDeductibleFactor(double OptionalDeductibleFactor) {
		this.OptionalDeductibleFactor = OptionalDeductibleFactor;
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
	public void setMicroLCM(double MicroLCM) {
		this.MicroLCM = MicroLCM;
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
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setOptionalDeductible(String OptionalDeductible) {
		this.OptionalDeductible = OptionalDeductible;
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
	public void setZipCodeOverride(String ZipCodeOverride) {
		this.ZipCodeOverride = ZipCodeOverride;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setStreetName(String StreetName) {
		this.StreetName = StreetName;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setConstructed(String Constructed) {
		this.Constructed = Constructed;
	}
	public void setCountyName(String CountyName) {
		this.CountyName = CountyName;
	}
	public void setBOPMicroClassification(List<BOPMicroClassification> BOPMicroClassification) {
		this.BOPMicroClassification = BOPMicroClassification;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setZipCode(String ZipCode) {
		this.ZipCode = ZipCode;
	}
	public void setStreetNumber(String StreetNumber) {
		this.StreetNumber = StreetNumber;
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
	public void setCountyNameOverride(String CountyNameOverride) {
		this.CountyNameOverride = CountyNameOverride;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setCityName(String CityName) {
		this.CityName = CityName;
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
	public void setCountyDivision(String CountyDivision) {
		this.CountyDivision = CountyDivision;
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
	public void setRatingTerritory(String RatingTerritory) {
		this.RatingTerritory = RatingTerritory;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setAddressID(String AddressID) {
		this.AddressID = AddressID;
	}
}