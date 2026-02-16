package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPEquipmentBreakdownCovEndt    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String Address;
	private int ExposureStatAmount;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String ClassDescription;
	private String TelephoneNumber;
	private String StructureClassCode;
	private String LocName;
	private String PriorId;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String EquipmentTypeStatCode;
	private String CreatedBy;
	private int TaxIndicator;
	private String NameID;
	private int PremiumIndicator;
	private double Rate;
	private Date Expiration;
	private double ChangePremium;
	private String ClassCode;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private int UnitNumber;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private double ProRateFactor;
	private int LimitStatAmount;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private String SublineStatCode;
	private Date RateDt;
	private double ProRatedPremium;
	private double OverridePremium;
	private Date Created;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private String DeductibleStatCode;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private String CoverageStatCode;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private String TerritoryStatCode;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String RatingIDStatCode;
	private int dsLimit;
	private String AddressID;
	private String ContactName;
	
	
	
	
	
	
	


	public int  getDsLimit() {
		return this.dsLimit;
	}
	public int  getExposureStatAmount() {
		return this.ExposureStatAmount;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public int  getUnitNumber() {
		return this.UnitNumber;
	}
	public String  getTerritoryStatCode() {
		return this.TerritoryStatCode;
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
	public String  getTelephoneNumber() {
		return this.TelephoneNumber;
	}
	public String  getClassDescription() {
		return this.ClassDescription;
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
	public String  getLocName() {
		return this.LocName;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public String  getSublineStatCode() {
		return this.SublineStatCode;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public String  getEquipmentTypeStatCode() {
		return this.EquipmentTypeStatCode;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getContactName() {
		return this.ContactName;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getRatingIDStatCode() {
		return this.RatingIDStatCode;
	}
	public int  getLimitStatAmount() {
		return this.LimitStatAmount;
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
	public String  getNameID() {
		return this.NameID;
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
	public String  getAddressID() {
		return this.AddressID;
	}
	public String  getStructureClassCode() {
		return this.StructureClassCode;
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
	public String  getAddress() {
		return this.Address;
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
	public String  getDeductibleStatCode() {
		return this.DeductibleStatCode;
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
	public String  getClassCode() {
		return this.ClassCode;
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
	public void setLocName(String LocName) {
		this.LocName = LocName;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setNameID(String NameID) {
		this.NameID = NameID;
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
	public void setDeductibleStatCode(String DeductibleStatCode) {
		this.DeductibleStatCode = DeductibleStatCode;
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
	public void setTerritoryStatCode(String TerritoryStatCode) {
		this.TerritoryStatCode = TerritoryStatCode;
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
	public void setRatingIDStatCode(String RatingIDStatCode) {
		this.RatingIDStatCode = RatingIDStatCode;
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
	public void setEquipmentTypeStatCode(String EquipmentTypeStatCode) {
		this.EquipmentTypeStatCode = EquipmentTypeStatCode;
	}
	public void setSublineStatCode(String SublineStatCode) {
		this.SublineStatCode = SublineStatCode;
	}
	public void setClassCode(String ClassCode) {
		this.ClassCode = ClassCode;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setStructureClassCode(String StructureClassCode) {
		this.StructureClassCode = StructureClassCode;
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
	public void setTelephoneNumber(String TelephoneNumber) {
		this.TelephoneNumber = TelephoneNumber;
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
	public void setClassDescription(String ClassDescription) {
		this.ClassDescription = ClassDescription;
	}
	public void setLimitStatAmount(int LimitStatAmount) {
		this.LimitStatAmount = LimitStatAmount;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setContactName(String ContactName) {
		this.ContactName = ContactName;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setAddressID(String AddressID) {
		this.AddressID = AddressID;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
}