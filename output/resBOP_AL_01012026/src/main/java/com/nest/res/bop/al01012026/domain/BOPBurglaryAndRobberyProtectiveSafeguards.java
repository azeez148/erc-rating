package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPBurglaryAndRobberyProtectiveSafeguards    extends Policy  {
	private int FeeIndicator;
	private double AnnualPremium;
	private String FormNumber;
	private Date Modified;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date RateDt;
	private String AuthorizedRepresentativeHeading;
	private Date EffectiveDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private Date AuthorizedRepresentativeDate;
	private String PriorId;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private double EvaluatedPremium;
	private String AuthorizedRepresentativeTitle;
	private int ProRateIndicator;
	private String FormName;
	private int TermFactorIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private String CreatedBy;
	private double ProRatedPriorPremium;
	private int TaxIndicator;
	private String AuthorizedRepresentativeSignature;
	private int PremiumIndicator;
	private double PriorPremium;
	private Date Expiration;
	private double ShortRatePenalty;
	private double ChangePremium;
	private Date Effective;
	private int EarnedInFullIndicator;
	private int ShortRateIndicator;
	private String AuthorizedRepresentativeName;
	private double TotalProRatedChangePremium;
	private String EndorsementNotice;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double ProRateFactor;
	private List<BOPBurglaryAndRobberyProtectiveSafeguardsDetail> BOPBurglaryAndRobberyProtectiveSafeguardsDetail;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPBurglaryAndRobberyProtectiveSafeguardsDetail) {
			childs.addAll(BOPBurglaryAndRobberyProtectiveSafeguardsDetail);
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
	public String  getAuthorizedRepresentativeName() {
		return this.AuthorizedRepresentativeName;
	}
	public Date  getAuthorizedRepresentativeDate() {
		return this.AuthorizedRepresentativeDate;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public List<BOPBurglaryAndRobberyProtectiveSafeguardsDetail> getBOPBurglaryAndRobberyProtectiveSafeguardsDetail() {
		return this.BOPBurglaryAndRobberyProtectiveSafeguardsDetail;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getEndorsementNotice() {
		return this.EndorsementNotice;
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
	public String  getAuthorizedRepresentativeTitle() {
		return this.AuthorizedRepresentativeTitle;
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
	public String  getAuthorizedRepresentativeHeading() {
		return this.AuthorizedRepresentativeHeading;
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
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setAuthorizedRepresentativeDate(Date AuthorizedRepresentativeDate) {
		this.AuthorizedRepresentativeDate = AuthorizedRepresentativeDate;
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
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
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
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setAuthorizedRepresentativeTitle(String AuthorizedRepresentativeTitle) {
		this.AuthorizedRepresentativeTitle = AuthorizedRepresentativeTitle;
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
	public void setAuthorizedRepresentativeSignature(String AuthorizedRepresentativeSignature) {
		this.AuthorizedRepresentativeSignature = AuthorizedRepresentativeSignature;
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
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setBOPBurglaryAndRobberyProtectiveSafeguardsDetail(List<BOPBurglaryAndRobberyProtectiveSafeguardsDetail> BOPBurglaryAndRobberyProtectiveSafeguardsDetail) {
		this.BOPBurglaryAndRobberyProtectiveSafeguardsDetail = BOPBurglaryAndRobberyProtectiveSafeguardsDetail;
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
	public void setAuthorizedRepresentativeName(String AuthorizedRepresentativeName) {
		this.AuthorizedRepresentativeName = AuthorizedRepresentativeName;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setAuthorizedRepresentativeHeading(String AuthorizedRepresentativeHeading) {
		this.AuthorizedRepresentativeHeading = AuthorizedRepresentativeHeading;
	}
	public void setEndorsementNotice(String EndorsementNotice) {
		this.EndorsementNotice = EndorsementNotice;
	}
}