package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPMicroApplicationForExcessRate    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String NameOfPersonOrOrganization;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private String EffectiveDateAndTermTo;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String LocationOfProperty;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private String AgencyAddress;
	private int ShortRateIndicator;
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
	private String SignatureNameOfInsured;
	private Date Created;
	private double OverridePremium;
	private String EffectiveDateAndTermFrom;
	private String ClassOfRisk;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private String ConditionsOrHazardsRecognized;
	private int ProRateIndicator;
	private List<BOPMicroApplicationForExcessRateDetail> BOPMicroApplicationForExcessRateDetail;
	private String FormsRestrictions;
	private String LinesOfInsurance;
	private double ShortRateFactor;
	private String AgencyName;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private String Address2;
	private String Title;
	private String Address1;
	private double ShortRatePenalty;
	private String Date;
	private Date Effective;
	private int EarnedInFullIndicator;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPMicroApplicationForExcessRateDetail) {
			childs.addAll(BOPMicroApplicationForExcessRateDetail);
		}
		return childs;
	}


	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public String  getAddress1() {
		return this.Address1;
	}
	public String  getAgencyAddress() {
		return this.AgencyAddress;
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
	public List<BOPMicroApplicationForExcessRateDetail> getBOPMicroApplicationForExcessRateDetail() {
		return this.BOPMicroApplicationForExcessRateDetail;
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
	public String  getAgencyName() {
		return this.AgencyName;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getNameOfPersonOrOrganization() {
		return this.NameOfPersonOrOrganization;
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
	public String  getTitle() {
		return this.Title;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public String  getFormsRestrictions() {
		return this.FormsRestrictions;
	}
	public String  getAddress2() {
		return this.Address2;
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
	public String  getEffectiveDateAndTermFrom() {
		return this.EffectiveDateAndTermFrom;
	}
	public String  getClassOfRisk() {
		return this.ClassOfRisk;
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
	public String  getSignatureNameOfInsured() {
		return this.SignatureNameOfInsured;
	}
	public String  getEffectiveDateAndTermTo() {
		return this.EffectiveDateAndTermTo;
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
	public String  getLocationOfProperty() {
		return this.LocationOfProperty;
	}
	public String  getLinesOfInsurance() {
		return this.LinesOfInsurance;
	}
	public String  getConditionsOrHazardsRecognized() {
		return this.ConditionsOrHazardsRecognized;
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
	public String  getDate() {
		return this.Date;
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
	
	public void setAddress1(String Address1) {
		this.Address1 = Address1;
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
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setAgencyName(String AgencyName) {
		this.AgencyName = AgencyName;
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
	public void setLinesOfInsurance(String LinesOfInsurance) {
		this.LinesOfInsurance = LinesOfInsurance;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setSignatureNameOfInsured(String SignatureNameOfInsured) {
		this.SignatureNameOfInsured = SignatureNameOfInsured;
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
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	public void setBOPMicroApplicationForExcessRateDetail(List<BOPMicroApplicationForExcessRateDetail> BOPMicroApplicationForExcessRateDetail) {
		this.BOPMicroApplicationForExcessRateDetail = BOPMicroApplicationForExcessRateDetail;
	}
	public void setEffectiveDateAndTermTo(String EffectiveDateAndTermTo) {
		this.EffectiveDateAndTermTo = EffectiveDateAndTermTo;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setAgencyAddress(String AgencyAddress) {
		this.AgencyAddress = AgencyAddress;
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
	public void setFormsRestrictions(String FormsRestrictions) {
		this.FormsRestrictions = FormsRestrictions;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setNameOfPersonOrOrganization(String NameOfPersonOrOrganization) {
		this.NameOfPersonOrOrganization = NameOfPersonOrOrganization;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setClassOfRisk(String ClassOfRisk) {
		this.ClassOfRisk = ClassOfRisk;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public void setLocationOfProperty(String LocationOfProperty) {
		this.LocationOfProperty = LocationOfProperty;
	}
	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setEffectiveDateAndTermFrom(String EffectiveDateAndTermFrom) {
		this.EffectiveDateAndTermFrom = EffectiveDateAndTermFrom;
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
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setConditionsOrHazardsRecognized(String ConditionsOrHazardsRecognized) {
		this.ConditionsOrHazardsRecognized = ConditionsOrHazardsRecognized;
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