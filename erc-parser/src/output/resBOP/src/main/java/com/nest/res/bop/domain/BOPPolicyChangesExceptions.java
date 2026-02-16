package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPPolicyChangesExceptions    extends Policy  {
	private String TheFollowingItems;
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String UnderlyingInsurance;
	private String CoveredPropertyLocationDescription;
	private Date ExpirationDt;
	private double TotalPremiumAdditonalPremium;
	private String ToBeAdjustedAtAudit;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String EffectiveOrExpirationDate;
	private String PremiumDetermination;
	private String ChangeEndorsementNumber;
	private String Deductibles;
	private String ClassificationClassCodes;
	private String PriorId;
	private String TotalPremiumAdjustments;
	private String PremiumDueAtPolicyChangeEffectiveDate;
	private String InsuredsLegalStatusOrBusinessOfInsured;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CoverageFormsandEndorsements;
	private String CreatedBy;
	private String AuthorizedRepresentativeSignature;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private String IsAreChanged;
	private int ShortRateIndicator;
	private String PaymentPlan;
	private double TotalProRatedChangePremium;
	private int UnitNumber;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private String CompanyCheckBox;
	private double ProRateFactor;
	private double AnnualPremium;
	private double Rates;
	private Date Modified;
	private String LimitsExposure;
	private Date RateDt;
	private double ProRatedPremium;
	private double OverridePremium;
	private Date Created;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private String AdditionalInterestedParties;
	private int ProRateIndicator;
	private String ChangeInPremiumHeader;
	private double ShortRateFactor;
	private double ReturnPremium;
	private String ParentId;
	private String NoChanges;
	private double ProRatedPriorPremium;
	private String PolicyNumber;
	private String PolicyChangesEndorsementDescription;
	private double PriorPremium;
	private String InsuredsMailingAddress;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double AdditionalPremium;
	private String NamedInsured;
	private double TotalPremiumReturnPremium;
	private String InsuredsName;
	
	
	
	
	
	
	


	public String  getUnderlyingInsurance() {
		return this.UnderlyingInsurance;
	}
	public String  getIsAreChanged() {
		return this.IsAreChanged;
	}
	public String  getToBeAdjustedAtAudit() {
		return this.ToBeAdjustedAtAudit;
	}
	public String  getPolicyNumber() {
		return this.PolicyNumber;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public String  getPremiumDueAtPolicyChangeEffectiveDate() {
		return this.PremiumDueAtPolicyChangeEffectiveDate;
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
	public String  getInsuredsName() {
		return this.InsuredsName;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getInsuredsMailingAddress() {
		return this.InsuredsMailingAddress;
	}
	public double  getAdditionalPremium() {
		return this.AdditionalPremium;
	}
	public String  getDeductibles() {
		return this.Deductibles;
	}
	public String  getAuthorizedRepresentativeSignature() {
		return this.AuthorizedRepresentativeSignature;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getChangeEndorsementNumber() {
		return this.ChangeEndorsementNumber;
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
	public String  getPaymentPlan() {
		return this.PaymentPlan;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getAdditionalInterestedParties() {
		return this.AdditionalInterestedParties;
	}
	public String  getLimitsExposure() {
		return this.LimitsExposure;
	}
	public double  getRates() {
		return this.Rates;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getPremiumDetermination() {
		return this.PremiumDetermination;
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
	public double  getReturnPremium() {
		return this.ReturnPremium;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getNamedInsured() {
		return this.NamedInsured;
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
	public String  getClassificationClassCodes() {
		return this.ClassificationClassCodes;
	}
	public String  getInsuredsLegalStatusOrBusinessOfInsured() {
		return this.InsuredsLegalStatusOrBusinessOfInsured;
	}
	public String  getNoChanges() {
		return this.NoChanges;
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
	public String  getCoveredPropertyLocationDescription() {
		return this.CoveredPropertyLocationDescription;
	}
	public String  getCoverageFormsandEndorsements() {
		return this.CoverageFormsandEndorsements;
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
	public String  getTheFollowingItems() {
		return this.TheFollowingItems;
	}
	public String  getEffectiveOrExpirationDate() {
		return this.EffectiveOrExpirationDate;
	}
	public double  getTotalPremiumReturnPremium() {
		return this.TotalPremiumReturnPremium;
	}
	public String  getTotalPremiumAdjustments() {
		return this.TotalPremiumAdjustments;
	}
	public double  getTotalPremiumAdditonalPremium() {
		return this.TotalPremiumAdditonalPremium;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getChangeInPremiumHeader() {
		return this.ChangeInPremiumHeader;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public String  getPolicyChangesEndorsementDescription() {
		return this.PolicyChangesEndorsementDescription;
	}
	public String  getCompanyCheckBox() {
		return this.CompanyCheckBox;
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
	public void setPolicyChangesEndorsementDescription(String PolicyChangesEndorsementDescription) {
		this.PolicyChangesEndorsementDescription = PolicyChangesEndorsementDescription;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setDeductibles(String Deductibles) {
		this.Deductibles = Deductibles;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setCoveredPropertyLocationDescription(String CoveredPropertyLocationDescription) {
		this.CoveredPropertyLocationDescription = CoveredPropertyLocationDescription;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setNamedInsured(String NamedInsured) {
		this.NamedInsured = NamedInsured;
	}
	public void setReturnPremium(double ReturnPremium) {
		this.ReturnPremium = ReturnPremium;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setClassificationClassCodes(String ClassificationClassCodes) {
		this.ClassificationClassCodes = ClassificationClassCodes;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setPaymentPlan(String PaymentPlan) {
		this.PaymentPlan = PaymentPlan;
	}
	public void setChangeInPremiumHeader(String ChangeInPremiumHeader) {
		this.ChangeInPremiumHeader = ChangeInPremiumHeader;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setTotalPremiumAdditonalPremium(double TotalPremiumAdditonalPremium) {
		this.TotalPremiumAdditonalPremium = TotalPremiumAdditonalPremium;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setAuthorizedRepresentativeSignature(String AuthorizedRepresentativeSignature) {
		this.AuthorizedRepresentativeSignature = AuthorizedRepresentativeSignature;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setTotalPremiumReturnPremium(double TotalPremiumReturnPremium) {
		this.TotalPremiumReturnPremium = TotalPremiumReturnPremium;
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
	public void setRates(double Rates) {
		this.Rates = Rates;
	}
	public void setUnderlyingInsurance(String UnderlyingInsurance) {
		this.UnderlyingInsurance = UnderlyingInsurance;
	}
	public void setTotalPremiumAdjustments(String TotalPremiumAdjustments) {
		this.TotalPremiumAdjustments = TotalPremiumAdjustments;
	}
	public void setChangeEndorsementNumber(String ChangeEndorsementNumber) {
		this.ChangeEndorsementNumber = ChangeEndorsementNumber;
	}
	public void setNoChanges(String NoChanges) {
		this.NoChanges = NoChanges;
	}
	public void setIsAreChanged(String IsAreChanged) {
		this.IsAreChanged = IsAreChanged;
	}
	public void setEffectiveOrExpirationDate(String EffectiveOrExpirationDate) {
		this.EffectiveOrExpirationDate = EffectiveOrExpirationDate;
	}
	public void setPremiumDueAtPolicyChangeEffectiveDate(String PremiumDueAtPolicyChangeEffectiveDate) {
		this.PremiumDueAtPolicyChangeEffectiveDate = PremiumDueAtPolicyChangeEffectiveDate;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setToBeAdjustedAtAudit(String ToBeAdjustedAtAudit) {
		this.ToBeAdjustedAtAudit = ToBeAdjustedAtAudit;
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
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setTheFollowingItems(String TheFollowingItems) {
		this.TheFollowingItems = TheFollowingItems;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setAdditionalInterestedParties(String AdditionalInterestedParties) {
		this.AdditionalInterestedParties = AdditionalInterestedParties;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setPolicyNumber(String PolicyNumber) {
		this.PolicyNumber = PolicyNumber;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setAdditionalPremium(double AdditionalPremium) {
		this.AdditionalPremium = AdditionalPremium;
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
	public void setInsuredsName(String InsuredsName) {
		this.InsuredsName = InsuredsName;
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
	public void setInsuredsLegalStatusOrBusinessOfInsured(String InsuredsLegalStatusOrBusinessOfInsured) {
		this.InsuredsLegalStatusOrBusinessOfInsured = InsuredsLegalStatusOrBusinessOfInsured;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setInsuredsMailingAddress(String InsuredsMailingAddress) {
		this.InsuredsMailingAddress = InsuredsMailingAddress;
	}
	public void setPremiumDetermination(String PremiumDetermination) {
		this.PremiumDetermination = PremiumDetermination;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setCompanyCheckBox(String CompanyCheckBox) {
		this.CompanyCheckBox = CompanyCheckBox;
	}
	public void setCoverageFormsandEndorsements(String CoverageFormsandEndorsements) {
		this.CoverageFormsandEndorsements = CoverageFormsandEndorsements;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setLimitsExposure(String LimitsExposure) {
		this.LimitsExposure = LimitsExposure;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}