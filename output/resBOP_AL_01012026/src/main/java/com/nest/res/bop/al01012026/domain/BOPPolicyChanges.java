package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPPolicyChanges    extends Policy  {
	private int FeeIndicator;
	private List<BOPPolicyChangesOptionalCoverages> BOPPolicyChangesOptionalCoverages;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private double TotalPremiumAdditonalPremium;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private List<BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail> BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail;
	private String CompanyName;
	private String AuthorizedRepresentative;
	private String PriorId;
	private String TotalPremiumAdjustments;
	private String PremiumDueAtPolicyChangeEffectiveDate;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private String AuthorizedRepresentativeSignature;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private String PolicyChangesEffective;
	private double ChangePremium;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private double AnnualPremium;
	private Date Modified;
	private String Description;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String Changes;
	private String ParentId;
	private double ProRatedPriorPremium;
	private String PolicyNumber;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String NamedInsured;
	private String MechanicalBreakdownUserInputBox;
	private double TotalPremiumReturnPremium;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPPolicyChangesOptionalCoverages) {
			childs.addAll(BOPPolicyChangesOptionalCoverages);
		}
		if(null != BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail) {
			childs.addAll(BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail);
		}
		return childs;
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
	public String  getVersionedId() {
		return this.VersionedId;
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
	public String  getId() {
		return this.Id;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public String  getDescription() {
		return this.Description;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public List<BOPPolicyChangesOptionalCoverages> getBOPPolicyChangesOptionalCoverages() {
		return this.BOPPolicyChangesOptionalCoverages;
	}
	public String  getChanges() {
		return this.Changes;
	}
	public List<BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail> getBOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail() {
		return this.BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail;
	}
	public String  getAuthorizedRepresentative() {
		return this.AuthorizedRepresentative;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getMechanicalBreakdownUserInputBox() {
		return this.MechanicalBreakdownUserInputBox;
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
	public String  getCompanyName() {
		return this.CompanyName;
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
	public String  getCreatedBy() {
		return this.CreatedBy;
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
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public void setChanges(String Changes) {
		this.Changes = Changes;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setAuthorizedRepresentative(String AuthorizedRepresentative) {
		this.AuthorizedRepresentative = AuthorizedRepresentative;
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
	public void setNamedInsured(String NamedInsured) {
		this.NamedInsured = NamedInsured;
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
	public void setMechanicalBreakdownUserInputBox(String MechanicalBreakdownUserInputBox) {
		this.MechanicalBreakdownUserInputBox = MechanicalBreakdownUserInputBox;
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
	public void setTotalPremiumAdjustments(String TotalPremiumAdjustments) {
		this.TotalPremiumAdjustments = TotalPremiumAdjustments;
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
	public void setBOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail(List<BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail> BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail) {
		this.BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail = BOPPolicyChangesPolicyAmountAndPremiumAdjustmentDetail;
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
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
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
	public void setBOPPolicyChangesOptionalCoverages(List<BOPPolicyChangesOptionalCoverages> BOPPolicyChangesOptionalCoverages) {
		this.BOPPolicyChangesOptionalCoverages = BOPPolicyChangesOptionalCoverages;
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