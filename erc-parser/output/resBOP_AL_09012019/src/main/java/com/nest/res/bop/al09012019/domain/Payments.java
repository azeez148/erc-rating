package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class Payments    extends Policy  {
	private String DownPaymentPayType;
	private double ResetPolicyTermPremium;
	private Date ExpirationDt;
	private String SemiAnnualPaymentTextCont;
	private double Premium;
	private String CreditCardNameOnAccount;
	private String PriorId;
	private String FollowOnPaymentType;
	private double EvaluatedPremium;
	private String BillToAddressID;
	private int TermFactorIndicator;
	private double DownPaymentAmountValidation;
	private String CreatedBy;
	private String AgencyBillType;
	private double DownPaymentAmount;
	private Date Expiration;
	private String TitleFollowOnPayment;
	private double ChangePremium;
	private String CreditCardExpiration;
	private String QuarterlyPaymentText;
	private String Id;
	private int UnitNumber;
	private Date PriorRateDt;
	private double ProRateFactor;
	private String TitleCheck;
	private double FollowOnPaymentFinalAmount;
	private int DownPaymentCheckNumber;
	private double ProRatedPremium;
	private String QuarterlyPayment;
	private String SuspenseAccount;
	private double OverridePremium;
	private Date Created;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private String SuspenseVerified;
	private String MonthlyPaymentTextCont;
	private String CreditCardNumber;
	private String EFTBankRoutingNumber;
	private String AlternatePayerID;
	private String ParentId;
	private String EFTNameOnAccount;
	private double ShortRatePenalty;
	private Date Effective;
	private String SemiAnnualPaymentText;
	private String DownPaymentType;
	private String BillToID;
	private int FeeIndicator;
	private String FormNumber;
	private Date DownPaymentCheckDate;
	private double PolicyTermPremium;
	private String TitleAlternatePayer;
	private String TransactionStatus;
	private Date AddEffectiveDt;
	private Date EffectiveDt;
	private String SemiAnnualPayment;
	private String DownPaymentFeeIndicator;
	private String TitleDownPayment;
	private String TitleCredit;
	private String FormName;
	private String CreditCardCompany;
	private int TaxIndicator;
	private int PremiumIndicator;
	private String WaiveServiceFee;
	private String MonthlyPayment;
	private String ConfirmBankRoutingNumber;
	private String EFTFinancialInstitutionName;
	private String EFTAccountNumber;
	private double SuspenseAmount;
	private String MonthlyPaymentText;
	private int ShortRateIndicator;
	private String AnnualPayment;
	private String PaymentPlan;
	private double TotalProRatedChangePremium;
	private double ProRatedChangePremium;
	private double AnnualPremium;
	private Date Modified;
	private String QuarterlyPaymentTextCont;
	private Date RateDt;
	private String TitleDownLender;
	private String TitleFollowOnPayments;
	private double DownPaymentCalculationValue;
	private String BillingAccount;
	private String EFTAccountType;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private double DownPaymentFeeAmount;
	private String BillType;
	private double ProRatedPriorPremium;
	private String BillToType;
	private double PriorPremium;
	private double DownPaymentMinimumAmount;
	private String CreditCardType;
	private int EarnedInFullIndicator;
	private double FollowOnPaymentAmount;
	private String AgencyBillMethod;
	private double DownPaymentCheckAmount;
	private String ConfirmAccountNumber;
	private String TitleEFT;
	
	
	
	
	
	
	


	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public int  getUnitNumber() {
		return this.UnitNumber;
	}
	public String  getTransactionStatus() {
		return this.TransactionStatus;
	}
	public double  getProRateFactor() {
		return this.ProRateFactor;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public String  getFollowOnPaymentType() {
		return this.FollowOnPaymentType;
	}
	public String  getCreditCardCompany() {
		return this.CreditCardCompany;
	}
	public String  getConfirmAccountNumber() {
		return this.ConfirmAccountNumber;
	}
	public double  getFollowOnPaymentFinalAmount() {
		return this.FollowOnPaymentFinalAmount;
	}
	public String  getCreditCardNameOnAccount() {
		return this.CreditCardNameOnAccount;
	}
	public String  getDownPaymentType() {
		return this.DownPaymentType;
	}
	public String  getMonthlyPayment() {
		return this.MonthlyPayment;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public String  getId() {
		return this.Id;
	}
	public String  getAlternatePayerID() {
		return this.AlternatePayerID;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public String  getTitleEFT() {
		return this.TitleEFT;
	}
	public String  getPaymentPlan() {
		return this.PaymentPlan;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public Date  getDownPaymentCheckDate() {
		return this.DownPaymentCheckDate;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getTitleFollowOnPayment() {
		return this.TitleFollowOnPayment;
	}
	public double  getDownPaymentMinimumAmount() {
		return this.DownPaymentMinimumAmount;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getWaiveServiceFee() {
		return this.WaiveServiceFee;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public double  getProRatedPremium() {
		return this.ProRatedPremium;
	}
	public Date  getModified() {
		return this.Modified;
	}
	public String  getQuarterlyPaymentText() {
		return this.QuarterlyPaymentText;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public String  getMonthlyPaymentTextCont() {
		return this.MonthlyPaymentTextCont;
	}
	public double  getFollowOnPaymentAmount() {
		return this.FollowOnPaymentAmount;
	}
	public String  getCreditCardNumber() {
		return this.CreditCardNumber;
	}
	public double  getDownPaymentAmountValidation() {
		return this.DownPaymentAmountValidation;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public String  getTitleAlternatePayer() {
		return this.TitleAlternatePayer;
	}
	public String  getTitleDownPayment() {
		return this.TitleDownPayment;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public int  getDownPaymentCheckNumber() {
		return this.DownPaymentCheckNumber;
	}
	public String  getSemiAnnualPaymentText() {
		return this.SemiAnnualPaymentText;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public String  getSemiAnnualPaymentTextCont() {
		return this.SemiAnnualPaymentTextCont;
	}
	public String  getBillToID() {
		return this.BillToID;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public String  getBillType() {
		return this.BillType;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	public String  getSemiAnnualPayment() {
		return this.SemiAnnualPayment;
	}
	public String  getCreditCardExpiration() {
		return this.CreditCardExpiration;
	}
	public String  getEFTAccountNumber() {
		return this.EFTAccountNumber;
	}
	public String  getBillingAccount() {
		return this.BillingAccount;
	}
	public String  getEFTBankRoutingNumber() {
		return this.EFTBankRoutingNumber;
	}
	public double  getPolicyTermPremium() {
		return this.PolicyTermPremium;
	}
	public double  getPremium() {
		return this.Premium;
	}
	public String  getQuarterlyPaymentTextCont() {
		return this.QuarterlyPaymentTextCont;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getEFTFinancialInstitutionName() {
		return this.EFTFinancialInstitutionName;
	}
	public double  getDownPaymentCheckAmount() {
		return this.DownPaymentCheckAmount;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public String  getAgencyBillMethod() {
		return this.AgencyBillMethod;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public String  getEFTAccountType() {
		return this.EFTAccountType;
	}
	public String  getEFTNameOnAccount() {
		return this.EFTNameOnAccount;
	}
	public String  getDownPaymentPayType() {
		return this.DownPaymentPayType;
	}
	public double  getResetPolicyTermPremium() {
		return this.ResetPolicyTermPremium;
	}
	public String  getBillToType() {
		return this.BillToType;
	}
	public double  getDownPaymentFeeAmount() {
		return this.DownPaymentFeeAmount;
	}
	public String  getCreditCardType() {
		return this.CreditCardType;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public double  getDownPaymentAmount() {
		return this.DownPaymentAmount;
	}
	public String  getQuarterlyPayment() {
		return this.QuarterlyPayment;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getAnnualPayment() {
		return this.AnnualPayment;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getTitleCheck() {
		return this.TitleCheck;
	}
	public double  getDownPaymentCalculationValue() {
		return this.DownPaymentCalculationValue;
	}
	public String  getMonthlyPaymentText() {
		return this.MonthlyPaymentText;
	}
	public String  getSuspenseAccount() {
		return this.SuspenseAccount;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getBillToAddressID() {
		return this.BillToAddressID;
	}
	public String  getAgencyBillType() {
		return this.AgencyBillType;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public String  getTitleCredit() {
		return this.TitleCredit;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public String  getTitleDownLender() {
		return this.TitleDownLender;
	}
	public String  getSuspenseVerified() {
		return this.SuspenseVerified;
	}
	public String  getConfirmBankRoutingNumber() {
		return this.ConfirmBankRoutingNumber;
	}
	public String  getTitleFollowOnPayments() {
		return this.TitleFollowOnPayments;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public double  getSuspenseAmount() {
		return this.SuspenseAmount;
	}
	public String  getDownPaymentFeeIndicator() {
		return this.DownPaymentFeeIndicator;
	}
	
	public void setFollowOnPaymentFinalAmount(double FollowOnPaymentFinalAmount) {
		this.FollowOnPaymentFinalAmount = FollowOnPaymentFinalAmount;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setSuspenseAmount(double SuspenseAmount) {
		this.SuspenseAmount = SuspenseAmount;
	}
	public void setEFTAccountNumber(String EFTAccountNumber) {
		this.EFTAccountNumber = EFTAccountNumber;
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
	public void setDownPaymentPayType(String DownPaymentPayType) {
		this.DownPaymentPayType = DownPaymentPayType;
	}
	public void setEFTNameOnAccount(String EFTNameOnAccount) {
		this.EFTNameOnAccount = EFTNameOnAccount;
	}
	public void setTitleFollowOnPayments(String TitleFollowOnPayments) {
		this.TitleFollowOnPayments = TitleFollowOnPayments;
	}
	public void setTitleDownPayment(String TitleDownPayment) {
		this.TitleDownPayment = TitleDownPayment;
	}
	public void setDownPaymentCalculationValue(double DownPaymentCalculationValue) {
		this.DownPaymentCalculationValue = DownPaymentCalculationValue;
	}
	public void setCreditCardType(String CreditCardType) {
		this.CreditCardType = CreditCardType;
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
	public void setFollowOnPaymentAmount(double FollowOnPaymentAmount) {
		this.FollowOnPaymentAmount = FollowOnPaymentAmount;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setQuarterlyPaymentTextCont(String QuarterlyPaymentTextCont) {
		this.QuarterlyPaymentTextCont = QuarterlyPaymentTextCont;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setDownPaymentAmountValidation(double DownPaymentAmountValidation) {
		this.DownPaymentAmountValidation = DownPaymentAmountValidation;
	}
	public void setChangeEffectiveDt(Date ChangeEffectiveDt) {
		this.ChangeEffectiveDt = ChangeEffectiveDt;
	}
	public void setAgencyBillMethod(String AgencyBillMethod) {
		this.AgencyBillMethod = AgencyBillMethod;
	}
	public void setExpirationDt(Date ExpirationDt) {
		this.ExpirationDt = ExpirationDt;
	}
	public void setTitleFollowOnPayment(String TitleFollowOnPayment) {
		this.TitleFollowOnPayment = TitleFollowOnPayment;
	}
	public void setSemiAnnualPayment(String SemiAnnualPayment) {
		this.SemiAnnualPayment = SemiAnnualPayment;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setWaiveServiceFee(String WaiveServiceFee) {
		this.WaiveServiceFee = WaiveServiceFee;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setAgencyBillType(String AgencyBillType) {
		this.AgencyBillType = AgencyBillType;
	}
	public void setTitleCheck(String TitleCheck) {
		this.TitleCheck = TitleCheck;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setPremium(double Premium) {
		this.Premium = Premium;
	}
	public void setDownPaymentCheckNumber(int DownPaymentCheckNumber) {
		this.DownPaymentCheckNumber = DownPaymentCheckNumber;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setTransactionStatus(String TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setQuarterlyPayment(String QuarterlyPayment) {
		this.QuarterlyPayment = QuarterlyPayment;
	}
	public void setQuarterlyPaymentText(String QuarterlyPaymentText) {
		this.QuarterlyPaymentText = QuarterlyPaymentText;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setTitleDownLender(String TitleDownLender) {
		this.TitleDownLender = TitleDownLender;
	}
	public void setDownPaymentFeeAmount(double DownPaymentFeeAmount) {
		this.DownPaymentFeeAmount = DownPaymentFeeAmount;
	}
	public void setFollowOnPaymentType(String FollowOnPaymentType) {
		this.FollowOnPaymentType = FollowOnPaymentType;
	}
	public void setCreditCardNumber(String CreditCardNumber) {
		this.CreditCardNumber = CreditCardNumber;
	}
	public void setBillToAddressID(String BillToAddressID) {
		this.BillToAddressID = BillToAddressID;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setCreditCardCompany(String CreditCardCompany) {
		this.CreditCardCompany = CreditCardCompany;
	}
	public void setCreditCardExpiration(String CreditCardExpiration) {
		this.CreditCardExpiration = CreditCardExpiration;
	}
	public void setDownPaymentCheckDate(Date DownPaymentCheckDate) {
		this.DownPaymentCheckDate = DownPaymentCheckDate;
	}
	public void setBillToID(String BillToID) {
		this.BillToID = BillToID;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setTitleCredit(String TitleCredit) {
		this.TitleCredit = TitleCredit;
	}
	public void setEFTFinancialInstitutionName(String EFTFinancialInstitutionName) {
		this.EFTFinancialInstitutionName = EFTFinancialInstitutionName;
	}
	public void setEFTAccountType(String EFTAccountType) {
		this.EFTAccountType = EFTAccountType;
	}
	public void setBillingAccount(String BillingAccount) {
		this.BillingAccount = BillingAccount;
	}
	public void setConfirmBankRoutingNumber(String ConfirmBankRoutingNumber) {
		this.ConfirmBankRoutingNumber = ConfirmBankRoutingNumber;
	}
	public void setDownPaymentAmount(double DownPaymentAmount) {
		this.DownPaymentAmount = DownPaymentAmount;
	}
	public void setTitleEFT(String TitleEFT) {
		this.TitleEFT = TitleEFT;
	}
	public void setEFTBankRoutingNumber(String EFTBankRoutingNumber) {
		this.EFTBankRoutingNumber = EFTBankRoutingNumber;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setCreditCardNameOnAccount(String CreditCardNameOnAccount) {
		this.CreditCardNameOnAccount = CreditCardNameOnAccount;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setDownPaymentCheckAmount(double DownPaymentCheckAmount) {
		this.DownPaymentCheckAmount = DownPaymentCheckAmount;
	}
	public void setPaymentPlan(String PaymentPlan) {
		this.PaymentPlan = PaymentPlan;
	}
	public void setBillType(String BillType) {
		this.BillType = BillType;
	}
	public void setResetPolicyTermPremium(double ResetPolicyTermPremium) {
		this.ResetPolicyTermPremium = ResetPolicyTermPremium;
	}
	public void setSuspenseAccount(String SuspenseAccount) {
		this.SuspenseAccount = SuspenseAccount;
	}
	public void setSemiAnnualPaymentText(String SemiAnnualPaymentText) {
		this.SemiAnnualPaymentText = SemiAnnualPaymentText;
	}
	public void setTitleAlternatePayer(String TitleAlternatePayer) {
		this.TitleAlternatePayer = TitleAlternatePayer;
	}
	public void setMonthlyPaymentTextCont(String MonthlyPaymentTextCont) {
		this.MonthlyPaymentTextCont = MonthlyPaymentTextCont;
	}
	public void setAnnualPayment(String AnnualPayment) {
		this.AnnualPayment = AnnualPayment;
	}
	public void setDownPaymentFeeIndicator(String DownPaymentFeeIndicator) {
		this.DownPaymentFeeIndicator = DownPaymentFeeIndicator;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setDownPaymentMinimumAmount(double DownPaymentMinimumAmount) {
		this.DownPaymentMinimumAmount = DownPaymentMinimumAmount;
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
	public void setAlternatePayerID(String AlternatePayerID) {
		this.AlternatePayerID = AlternatePayerID;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setConfirmAccountNumber(String ConfirmAccountNumber) {
		this.ConfirmAccountNumber = ConfirmAccountNumber;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setBillToType(String BillToType) {
		this.BillToType = BillToType;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setDownPaymentType(String DownPaymentType) {
		this.DownPaymentType = DownPaymentType;
	}
	public void setSuspenseVerified(String SuspenseVerified) {
		this.SuspenseVerified = SuspenseVerified;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setSemiAnnualPaymentTextCont(String SemiAnnualPaymentTextCont) {
		this.SemiAnnualPaymentTextCont = SemiAnnualPaymentTextCont;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setMonthlyPaymentText(String MonthlyPaymentText) {
		this.MonthlyPaymentText = MonthlyPaymentText;
	}
	public void setMonthlyPayment(String MonthlyPayment) {
		this.MonthlyPayment = MonthlyPayment;
	}
}