package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class QuoteLetter    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private String Contractors;
	private String PrintThisQuote;
	private Date Expiration;
	private String RejectionAcceptanceTerrorismCoverage;
	private String BowlingAlleyQuestionaire;
	private double ChangePremium;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private int UnitNumber;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private String QuoteSubjectToHeader;
	private double ProRateFactor;
	private String QuoteSubjectTo;
	private double AnnualPremium;
	private Date Modified;
	private Date RateDt;
	private String ChangesAmendmentsMade;
	private double ProRatedPremium;
	private double OverridePremium;
	private Date Created;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private int ProRateIndicator;
	private String CompletedAndSignedHeader;
	private double ShortRateFactor;
	private String ParentId;
	private String QuoteSujectToHeader;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private double ShortRatePenalty;
	private Date Effective;
	private String Restaurant;
	private int EarnedInFullIndicator;
	private String Habitational;
	private String Other;
	
	
	
	
	
	
	


	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public String  getChangesAmendmentsMade() {
		return this.ChangesAmendmentsMade;
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
	public String  getQuoteSujectToHeader() {
		return this.QuoteSujectToHeader;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getOther() {
		return this.Other;
	}
	public String  getRestaurant() {
		return this.Restaurant;
	}
	public String  getPrintThisQuote() {
		return this.PrintThisQuote;
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
	public String  getQuoteSubjectTo() {
		return this.QuoteSubjectTo;
	}
	public String  getBowlingAlleyQuestionaire() {
		return this.BowlingAlleyQuestionaire;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getHabitational() {
		return this.Habitational;
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
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getContractors() {
		return this.Contractors;
	}
	public String  getQuoteSubjectToHeader() {
		return this.QuoteSubjectToHeader;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public String  getRejectionAcceptanceTerrorismCoverage() {
		return this.RejectionAcceptanceTerrorismCoverage;
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
	public String  getCompletedAndSignedHeader() {
		return this.CompletedAndSignedHeader;
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
	public void setQuoteSujectToHeader(String QuoteSujectToHeader) {
		this.QuoteSujectToHeader = QuoteSujectToHeader;
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
	public void setRestaurant(String Restaurant) {
		this.Restaurant = Restaurant;
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
	public void setPrintThisQuote(String PrintThisQuote) {
		this.PrintThisQuote = PrintThisQuote;
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
	public void setBowlingAlleyQuestionaire(String BowlingAlleyQuestionaire) {
		this.BowlingAlleyQuestionaire = BowlingAlleyQuestionaire;
	}
	public void setChangesAmendmentsMade(String ChangesAmendmentsMade) {
		this.ChangesAmendmentsMade = ChangesAmendmentsMade;
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
	public void setHabitational(String Habitational) {
		this.Habitational = Habitational;
	}
	public void setQuoteSubjectTo(String QuoteSubjectTo) {
		this.QuoteSubjectTo = QuoteSubjectTo;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setCompletedAndSignedHeader(String CompletedAndSignedHeader) {
		this.CompletedAndSignedHeader = CompletedAndSignedHeader;
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
	public void setContractors(String Contractors) {
		this.Contractors = Contractors;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setRejectionAcceptanceTerrorismCoverage(String RejectionAcceptanceTerrorismCoverage) {
		this.RejectionAcceptanceTerrorismCoverage = RejectionAcceptanceTerrorismCoverage;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setOther(String Other) {
		this.Other = Other;
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
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setQuoteSubjectToHeader(String QuoteSubjectToHeader) {
		this.QuoteSubjectToHeader = QuoteSubjectToHeader;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}