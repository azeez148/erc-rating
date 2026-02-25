package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPMicroPolicyChanges    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private String CompanyID;
	private String UnderlyingInsurance;
	private String CoveredPropertyLocationDescription;
	private Date ExpirationDt;
	private double TotalPremiumAdditonalPremium;
	private Date AddEffectiveDt;
	private String ToBeAdjustedAtAudit;
	private double Premium;
	private Date EffectiveDt;
	private String PremiumDetermination;
	private String ChangeEndorsementNumber;
	private String ClassificationClassCodes;
	private String Deductibles;
	private String PolicyNumberID;
	private String CompanyName;
	private String AuthorizedRepresentative;
	private String PriorId;
	private String TotalPremiumAdjustments;
	private String SeeAdditionalPageHeader;
	private String PremiumDueAtPolicyChangeEffectiveDate;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private String AuthorizedRepresentativeSignature;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private String InsuredsLegalStatusBusinessOfInsured;
	private String PolicyChangesEffective;
	private double ChangePremium;
	private String EffectiveDateOfChange;
	private int ShortRateIndicator;
	private String EffectiveExpirationDate;
	private String PaymentPlan;
	private String AuthorizedRepresentativeName;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private double AnnualPremium;
	private String Rates;
	private Date Modified;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String AuthorizedRepresentativeDate;
	private double PremiumDueAtPolicyChangeReturn;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private String AuthorizedRepresentativeHeader;
	private String AdditionalInterestedParties;
	private String AuthorizedRepresentativeTitle;
	private int ProRateIndicator;
	private String ChangeInPremiumHeader;
	private double ShortRateFactor;
	private String Changes;
	private String ParentId;
	private String NoChanges;
	private double ProRatedPriorPremium;
	private String PolicyNumber;
	private String PolicyChangesEndorsementDescription;
	private List<BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail> BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail;
	private double PriorPremium;
	private String InsuredsMailingAddress;
	private double ShortRatePenalty;
	private String CoverageFormsAndEndorsements;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double PremiumDueAtPolicyChangeAdditional;
	private String LimitsExposures;
	private String NamedInsured;
	private double TotalPremiumReturnPremium;
	private String InsuredsName;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail) {
			childs.addAll(BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail);
		}
		return childs;
	}


	public String  getUnderlyingInsurance() {
		return this.UnderlyingInsurance;
	}
	public String  getCompanyID() {
		return this.CompanyID;
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
	public String  getSeeAdditionalPageHeader() {
		return this.SeeAdditionalPageHeader;
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
	public String  getDeductibles() {
		return this.Deductibles;
	}
	public String  getAuthorizedRepresentativeSignature() {
		return this.AuthorizedRepresentativeSignature;
	}
	public String  getEffectiveExpirationDate() {
		return this.EffectiveExpirationDate;
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
	public double  getPremiumDueAtPolicyChangeReturn() {
		return this.PremiumDueAtPolicyChangeReturn;
	}
	public String  getAdditionalInterestedParties() {
		return this.AdditionalInterestedParties;
	}
	public String  getLimitsExposures() {
		return this.LimitsExposures;
	}
	public String  getAuthorizedRepresentativeTitle() {
		return this.AuthorizedRepresentativeTitle;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getPremiumDetermination() {
		return this.PremiumDetermination;
	}
	public String  getChanges() {
		return this.Changes;
	}
	public String  getAuthorizedRepresentative() {
		return this.AuthorizedRepresentative;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public String  getRates() {
		return this.Rates;
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
	public String  getNamedInsured() {
		return this.NamedInsured;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public String  getPolicyChangesEffective() {
		return this.PolicyChangesEffective;
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
	public String  getAuthorizedRepresentativeHeader() {
		return this.AuthorizedRepresentativeHeader;
	}
	public String  getNoChanges() {
		return this.NoChanges;
	}
	public String  getAuthorizedRepresentativeName() {
		return this.AuthorizedRepresentativeName;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public String  getEffectiveDateOfChange() {
		return this.EffectiveDateOfChange;
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
	public double  getPremiumDueAtPolicyChangeAdditional() {
		return this.PremiumDueAtPolicyChangeAdditional;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public String  getAuthorizedRepresentativeDate() {
		return this.AuthorizedRepresentativeDate;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public List<BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail> getBOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail() {
		return this.BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail;
	}
	public String  getCompanyName() {
		return this.CompanyName;
	}
	public double  getTotalPremiumReturnPremium() {
		return this.TotalPremiumReturnPremium;
	}
	public String  getTotalPremiumAdjustments() {
		return this.TotalPremiumAdjustments;
	}
	public String  getInsuredsLegalStatusBusinessOfInsured() {
		return this.InsuredsLegalStatusBusinessOfInsured;
	}
	public double  getTotalPremiumAdditonalPremium() {
		return this.TotalPremiumAdditonalPremium;
	}
	public String  getPolicyNumberID() {
		return this.PolicyNumberID;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getChangeInPremiumHeader() {
		return this.ChangeInPremiumHeader;
	}
	public String  getCoverageFormsAndEndorsements() {
		return this.CoverageFormsAndEndorsements;
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
	public Date  getCreated() {
		return this.Created;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setCoverageFormsAndEndorsements(String CoverageFormsAndEndorsements) {
		this.CoverageFormsAndEndorsements = CoverageFormsAndEndorsements;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setChanges(String Changes) {
		this.Changes = Changes;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setEffectiveExpirationDate(String EffectiveExpirationDate) {
		this.EffectiveExpirationDate = EffectiveExpirationDate;
	}
	public void setPolicyChangesEndorsementDescription(String PolicyChangesEndorsementDescription) {
		this.PolicyChangesEndorsementDescription = PolicyChangesEndorsementDescription;
	}
	public void setAuthorizedRepresentative(String AuthorizedRepresentative) {
		this.AuthorizedRepresentative = AuthorizedRepresentative;
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
	public void setAuthorizedRepresentativeTitle(String AuthorizedRepresentativeTitle) {
		this.AuthorizedRepresentativeTitle = AuthorizedRepresentativeTitle;
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
	public void setCompanyID(String CompanyID) {
		this.CompanyID = CompanyID;
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
	public void setBOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail(List<BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail> BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail) {
		this.BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail = BOPMicroPolicyChangesAmountAndPremiumAdjustmentDetail;
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
	public void setAuthorizedRepresentativeDate(String AuthorizedRepresentativeDate) {
		this.AuthorizedRepresentativeDate = AuthorizedRepresentativeDate;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
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
	public void setRates(String Rates) {
		this.Rates = Rates;
	}
	public void setNoChanges(String NoChanges) {
		this.NoChanges = NoChanges;
	}
	public void setPremiumDueAtPolicyChangeEffectiveDate(String PremiumDueAtPolicyChangeEffectiveDate) {
		this.PremiumDueAtPolicyChangeEffectiveDate = PremiumDueAtPolicyChangeEffectiveDate;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setPolicyChangesEffective(String PolicyChangesEffective) {
		this.PolicyChangesEffective = PolicyChangesEffective;
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
	public void setPremiumDueAtPolicyChangeReturn(double PremiumDueAtPolicyChangeReturn) {
		this.PremiumDueAtPolicyChangeReturn = PremiumDueAtPolicyChangeReturn;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setLimitsExposures(String LimitsExposures) {
		this.LimitsExposures = LimitsExposures;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setSeeAdditionalPageHeader(String SeeAdditionalPageHeader) {
		this.SeeAdditionalPageHeader = SeeAdditionalPageHeader;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setInsuredsLegalStatusBusinessOfInsured(String InsuredsLegalStatusBusinessOfInsured) {
		this.InsuredsLegalStatusBusinessOfInsured = InsuredsLegalStatusBusinessOfInsured;
	}
	public void setPremiumDueAtPolicyChangeAdditional(double PremiumDueAtPolicyChangeAdditional) {
		this.PremiumDueAtPolicyChangeAdditional = PremiumDueAtPolicyChangeAdditional;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
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
	public void setCompanyName(String CompanyName) {
		this.CompanyName = CompanyName;
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
	public void setPolicyNumberID(String PolicyNumberID) {
		this.PolicyNumberID = PolicyNumberID;
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
	public void setAuthorizedRepresentativeHeader(String AuthorizedRepresentativeHeader) {
		this.AuthorizedRepresentativeHeader = AuthorizedRepresentativeHeader;
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
	public void setEffectiveDateOfChange(String EffectiveDateOfChange) {
		this.EffectiveDateOfChange = EffectiveDateOfChange;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setAuthorizedRepresentativeName(String AuthorizedRepresentativeName) {
		this.AuthorizedRepresentativeName = AuthorizedRepresentativeName;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}