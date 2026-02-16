package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class WorkBook implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2401378123891096675L;
	String id;
	String parentWorkbookId;
	Company  company;//CompanyId
	Locale locale;//LocaleId
	LOB lob;//LOBId
	String CompanyId;
	String LocaleId;
	String LOBId;
	String stateId;
	String title;
	String resourceName;
	String termMinimum;
	String termMinimumUnit;
	String termMaximum;
	String termMaximumUnit;
	String termDefault;
	String termDefaultUnit;
	String comment;
	String minAgents;
	String maxAgents;
	String maxNamedInsureds;
	String effectiveDateDefaultType;
	String EffectiveDateDefaultOffset;
	String renewalStatusDefault;
	String policyNumberType;
	String policyNumberModifiable;
	String policyNumberSystemType;
	String policyNumberSystemName;
	String policyNumberPattern;
	String policyNumberCheckDigit;
	String policyNumberRenewalIterationPattern;
	String policyNumberKey;
	String policyHidePriorPolicy;
	String policyHideAdditionalInsured;
	String policyHideAgent;
	String quoteNumberType;
	String quoteNumberModifiable;
	String quoteNumberSystemType;
	String quoteNumberSystemName;
	String quoteNumberPattern;
	String quoteNumberCheckDigit;
	String quoteNumberKey;
	String quoteHidePriorPolicy;
	String quoteHideAdditionalInsured;
	String quoteHideAgent;
	String renewWithDefaultTerm;
	String preRenewalUnit;
	String preRenewalPeriod;
	String preRenewalRoutingId;
	String renewalUnit;
	String renewalPeriod;
	String renewalRoutingId;
	String reviewUnit;
	String reviewPeriod;
	String  reviewRoutingId;
	String noticeOfNonRenewalMinimumUnit;
	String noticeOfNonRenewalMinimumPeriod;
	String noticeOfNonRenewalMaximumUnit;
	String noticeOfNonRenewalMaximumPeriod;
    String premiumFormat;
    String showDiary;
    String showNote;
    String showRate;
    String showValidate;
    String showPremium;
    String showPremiumRatebookTerm;
    String showPremiumPolicyTerm;
    String showPremiumWritten;
	String showPremiumTotalWritten;
	String showTabs;
	String showMessages;
	String showMessageSource;
	String showMessageSeverity;
	String flowInitial;
	String flowLetter;
	String flowPayPlan;
	String flowHelp;
	String flowAction;
	String flowUser;
	String ratingTermPeriod;
	String ratingTermUnit;
	String proRateTermUnit;
	String noticeOfCancellationUnderwritingUnit;
	String noticeOfCancellationUnderwritingPeriod;
	String noticeOfCancellationNonPaymentUnit;
	String noticeOfCancellationNonPaymentPeriod;
	String cancellationMethodUnderwriting;
	String cancellationMethodNonPayment;
	String reinstatementPeriod;
	String reinstatementUnit;
	String futureEndorsementPeriod;
	String futureEndorsementUnit;
	String shortRateFactor;
	String releasePublishEvent;
	String ShowAddNamedInsuredAddress;
	String addNamedInsuredText;
	String addNamedInsuredAddressRequired;
	String minimumPremium;
	String minimumPremiumCoverage;
	String minimumPremiumOptionEndorsement;
	String minimumPremiumOptionCancelFlat;
	String minimumPremiumOptionCancelProRate;
	String minimumPremiumOptionCancelShortRate;
	String packageCoverage;
	String premiumDecimals;
	String renewalUpdateUnitNumber;
	String payPlanProvider;
	String futureEffectivePeriod;
	String futureEffectiveUnit;
	String pastEffectivePeriod;
	String pastEffectiveUnit;
	String suspendRenewal;
	String suspendCancellation;
	String applyButtonText;
	String auditFrequencyDefault;
	String auditFrequencyAnnual;
	String auditFrequencySemiannual;
	String auditFrequencyQuarterly;
	String auditFrequencyMonthly;
	String auditOffsetAnnual;
	String auditOffsetSemiannual;
	String auditOffsetQuarterly;
	String auditOffsetMonthly;
	String quoteHideLocale;
	String policyHideLocale;
	String tabInitialLabel;
	String tabLetterLabel;
	String tabActionLabel;
	String tabActionTextAction;
	String tabActionTextCause;
	String tabActionTextComment;
	String tabActionTextSubmit;
	String tabActionTextApply;
	String premiumRatebookTermLabel;
	String premiumPolicyTermLabel;
	String premiumWrittenLabel;
	String premiumTotalWrittenLabel;
	String viewAttachingLabel;
	String searchClientLabel;
	String searchAddressLabel;
	String agentText;
	String showHelpImage;
	String noticeOfCancellationCauseUnit;
	String noticeOfCancellationCausePeriod;
	String cancellationMethodCause;
	String agentTransferMessageRoutingId;
	String honorRatebookPeriod;
	String honorRatebookUnit;
	String reviewHonoredRoutingId;
	String multipleRating;
	String anniversaryRating;
	String anniversaryRatingMessageRoutingId;
	String autoApply;
	String flowFormSummaries;
	String autoRefreshData;
	String multiPolicyDiscountRoutingId;
	String midTermEndtProcess;
	String anniversaryRatingCondition;
	String modifyHouseholdLabel;
	String showHouseholdSearch;
	String hideClientLinks;
	String tabMessageIndicator;
	String commentRows;
	String commentCols;
	String monoline;
	String tabPolicySummaryTextAction;
	String tabPolicySummaryTextModify;
	String tabPolicySummaryTextRemove;
	String tabPolicySummaryTextView;
	String tabPolicySummaryNewAdd;
	String tabPolicySummaryNewModify;
	String tabPolicySummaryNewDisplayAdd;
	String tabPolicySummaryNewDisplayModify;
	String passRoofDataToCovParts;
	String hideAgentSelectAddress;
	String tabCovPartsLabel;
	String tabPolicySummaryTextAdd;
	String householdClientType;
	String auditCreatedMessageRoutingId;
	String auditWaivedMessageRoutingId;
	String auditCompletedMessageRoutingId;
	String anniversaryRatingUseAnnDate;
	String autoValidationFlags;
    String roundingMethod;
	String flowRiskDetail;
	String hideHeade;
	String hideClearButton;
	String hidePolicyDetail;
	String headerBasedGeneralInfo;
	String namedInsuredText;
	String forwardLabel;
	String backLabel;
	String backNavigation;
	String esiNamedInsured;
	String esiAdditionalNamedInsured;
	String esiAgent;
	String esiNamedInsuredTemplateFileName;
	String esiAdditionalNamedInsuredTemplateFileName;
	String esiAgentTemplateFileName;
	String auditSuspendedMessageRoutingId;
	String auditTemplateFileName;
	String auditFrequencyNotApplicable;
	String tabAuditTemplateLabel;
	String ratingModeToggle;
	String showAttachDBATA;
	String namedInsuredDBATAText;
	String addNamedInsuredDBATAText;
	String maxNamedInsuredDBATA;
	String maxAddNamedInsuredDBATA;
	String minimumPremiumOverride;
	String minimumPremiumExcluded;
	String minimumPremiumColumn;
	String minimumPremiumOptionEndtColumn;
	String expirationUnit;
	String expirationPeriod;
	String varyingShortRateFactor;
	String suppressNotificationText;
	String showMsg;
	String auditPurgedARDModMessageRoutingId;
	String auditCompletedARDModMessageRoutingId;
	String auditWaivedARDModMessageRoutingId;
	String ratingModePremiumRollup;
	String fullRateTabLetter;
	String fullRateTabAction;
	String rateRoofOnly;
	String automaticFormAttachment;
	String helpLabel;
	String diaryLabel;
	String noteLabel;
	String validateLabel;
	String rateLabel;
	String automaticRatingLabel;
	String displayModeLabel;
	String navigationType;
	String validationMode;
	String ratingMode;
	String externalProvider;
	String hideHeader;

	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getParentWorkbookId() {
		return parentWorkbookId;
	}



	public void setParentWorkbookId(String parentWorkbookId) {
		this.parentWorkbookId = parentWorkbookId;
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}



	public Locale getLocale() {
		return locale;
	}



	public void setLocale(Locale locale) {
		this.locale = locale;
	}



	public LOB getLob() {
		return lob;
	}



	public void setLob(LOB lob) {
		this.lob = lob;
	}



	public String getCompanyId() {
		return CompanyId;
	}



	public void setCompanyId(String companyId) {
		CompanyId = companyId;
	}



	public String getLocaleId() {
		return LocaleId;
	}



	public void setLocaleId(String localeId) {
		LocaleId = localeId;
	}



	public String getLOBId() {
		return LOBId;
	}



	public void setLOBId(String lOBId) {
		LOBId = lOBId;
	}



	public String getStateId() {
		return stateId;
	}



	public void setStateId(String stateId) {
		this.stateId = stateId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getResourceName() {
		return resourceName;
	}



	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}



	public String getTermMinimum() {
		return termMinimum;
	}



	public void setTermMinimum(String termMinimum) {
		this.termMinimum = termMinimum;
	}



	public String getTermMinimumUnit() {
		return termMinimumUnit;
	}



	public void setTermMinimumUnit(String termMinimumUnit) {
		this.termMinimumUnit = termMinimumUnit;
	}



	public String getTermMaximum() {
		return termMaximum;
	}



	public void setTermMaximum(String termMaximum) {
		this.termMaximum = termMaximum;
	}



	public String getTermMaximumUnit() {
		return termMaximumUnit;
	}



	public void setTermMaximumUnit(String termMaximumUnit) {
		this.termMaximumUnit = termMaximumUnit;
	}



	public String getTermDefault() {
		return termDefault;
	}



	public void setTermDefault(String termDefault) {
		this.termDefault = termDefault;
	}



	public String getTermDefaultUnit() {
		return termDefaultUnit;
	}



	public void setTermDefaultUnit(String termDefaultUnit) {
		this.termDefaultUnit = termDefaultUnit;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getMinAgents() {
		return minAgents;
	}



	public void setMinAgents(String minAgents) {
		this.minAgents = minAgents;
	}



	public String getMaxAgents() {
		return maxAgents;
	}



	public void setMaxAgents(String maxAgents) {
		this.maxAgents = maxAgents;
	}



	public String getMaxNamedInsureds() {
		return maxNamedInsureds;
	}



	public void setMaxNamedInsureds(String maxNamedInsureds) {
		this.maxNamedInsureds = maxNamedInsureds;
	}



	public String getEffectiveDateDefaultType() {
		return effectiveDateDefaultType;
	}



	public void setEffectiveDateDefaultType(String effectiveDateDefaultType) {
		this.effectiveDateDefaultType = effectiveDateDefaultType;
	}



	public String getEffectiveDateDefaultOffset() {
		return EffectiveDateDefaultOffset;
	}



	public void setEffectiveDateDefaultOffset(String effectiveDateDefaultOffset) {
		EffectiveDateDefaultOffset = effectiveDateDefaultOffset;
	}



	public String getRenewalStatusDefault() {
		return renewalStatusDefault;
	}



	public void setRenewalStatusDefault(String renewalStatusDefault) {
		this.renewalStatusDefault = renewalStatusDefault;
	}



	public String getPolicyNumberType() {
		return policyNumberType;
	}



	public void setPolicyNumberType(String policyNumberType) {
		this.policyNumberType = policyNumberType;
	}



	public String getPolicyNumberModifiable() {
		return policyNumberModifiable;
	}



	public void setPolicyNumberModifiable(String policyNumberModifiable) {
		this.policyNumberModifiable = policyNumberModifiable;
	}



	public String getPolicyNumberSystemType() {
		return policyNumberSystemType;
	}



	public void setPolicyNumberSystemType(String policyNumberSystemType) {
		this.policyNumberSystemType = policyNumberSystemType;
	}



	public String getPolicyNumberSystemName() {
		return policyNumberSystemName;
	}



	public void setPolicyNumberSystemName(String policyNumberSystemName) {
		this.policyNumberSystemName = policyNumberSystemName;
	}



	public String getPolicyNumberPattern() {
		return policyNumberPattern;
	}



	public void setPolicyNumberPattern(String policyNumberPattern) {
		this.policyNumberPattern = policyNumberPattern;
	}



	public String getPolicyNumberCheckDigit() {
		return policyNumberCheckDigit;
	}



	public void setPolicyNumberCheckDigit(String policyNumberCheckDigit) {
		this.policyNumberCheckDigit = policyNumberCheckDigit;
	}



	public String getPolicyNumberRenewalIterationPattern() {
		return policyNumberRenewalIterationPattern;
	}



	public void setPolicyNumberRenewalIterationPattern(String policyNumberRenewalIterationPattern) {
		this.policyNumberRenewalIterationPattern = policyNumberRenewalIterationPattern;
	}



	public String getPolicyNumberKey() {
		return policyNumberKey;
	}



	public void setPolicyNumberKey(String policyNumberKey) {
		this.policyNumberKey = policyNumberKey;
	}



	public String getPolicyHidePriorPolicy() {
		return policyHidePriorPolicy;
	}



	public void setPolicyHidePriorPolicy(String policyHidePriorPolicy) {
		this.policyHidePriorPolicy = policyHidePriorPolicy;
	}



	public String getPolicyHideAdditionalInsured() {
		return policyHideAdditionalInsured;
	}



	public void setPolicyHideAdditionalInsured(String policyHideAdditionalInsured) {
		this.policyHideAdditionalInsured = policyHideAdditionalInsured;
	}



	public String getPolicyHideAgent() {
		return policyHideAgent;
	}



	public void setPolicyHideAgent(String policyHideAgent) {
		this.policyHideAgent = policyHideAgent;
	}



	public String getQuoteNumberType() {
		return quoteNumberType;
	}



	public void setQuoteNumberType(String quoteNumberType) {
		this.quoteNumberType = quoteNumberType;
	}



	public String getQuoteNumberModifiable() {
		return quoteNumberModifiable;
	}



	public void setQuoteNumberModifiable(String quoteNumberModifiable) {
		this.quoteNumberModifiable = quoteNumberModifiable;
	}



	public String getQuoteNumberSystemType() {
		return quoteNumberSystemType;
	}



	public void setQuoteNumberSystemType(String quoteNumberSystemType) {
		this.quoteNumberSystemType = quoteNumberSystemType;
	}



	public String getQuoteNumberSystemName() {
		return quoteNumberSystemName;
	}



	public void setQuoteNumberSystemName(String quoteNumberSystemName) {
		this.quoteNumberSystemName = quoteNumberSystemName;
	}



	public String getQuoteNumberPattern() {
		return quoteNumberPattern;
	}



	public void setQuoteNumberPattern(String quoteNumberPattern) {
		this.quoteNumberPattern = quoteNumberPattern;
	}



	public String getQuoteNumberCheckDigit() {
		return quoteNumberCheckDigit;
	}



	public void setQuoteNumberCheckDigit(String quoteNumberCheckDigit) {
		this.quoteNumberCheckDigit = quoteNumberCheckDigit;
	}



	public String getQuoteNumberKey() {
		return quoteNumberKey;
	}



	public void setQuoteNumberKey(String quoteNumberKey) {
		this.quoteNumberKey = quoteNumberKey;
	}



	public String getQuoteHidePriorPolicy() {
		return quoteHidePriorPolicy;
	}



	public void setQuoteHidePriorPolicy(String quoteHidePriorPolicy) {
		this.quoteHidePriorPolicy = quoteHidePriorPolicy;
	}



	public String getQuoteHideAdditionalInsured() {
		return quoteHideAdditionalInsured;
	}



	public void setQuoteHideAdditionalInsured(String quoteHideAdditionalInsured) {
		this.quoteHideAdditionalInsured = quoteHideAdditionalInsured;
	}



	public String getQuoteHideAgent() {
		return quoteHideAgent;
	}



	public void setQuoteHideAgent(String quoteHideAgent) {
		this.quoteHideAgent = quoteHideAgent;
	}



	public String getRenewWithDefaultTerm() {
		return renewWithDefaultTerm;
	}



	public void setRenewWithDefaultTerm(String renewWithDefaultTerm) {
		this.renewWithDefaultTerm = renewWithDefaultTerm;
	}



	public String getPreRenewalUnit() {
		return preRenewalUnit;
	}



	public void setPreRenewalUnit(String preRenewalUnit) {
		this.preRenewalUnit = preRenewalUnit;
	}



	public String getPreRenewalPeriod() {
		return preRenewalPeriod;
	}



	public void setPreRenewalPeriod(String preRenewalPeriod) {
		this.preRenewalPeriod = preRenewalPeriod;
	}



	public String getPreRenewalRoutingId() {
		return preRenewalRoutingId;
	}



	public void setPreRenewalRoutingId(String preRenewalRoutingId) {
		this.preRenewalRoutingId = preRenewalRoutingId;
	}



	public String getRenewalUnit() {
		return renewalUnit;
	}



	public void setRenewalUnit(String renewalUnit) {
		this.renewalUnit = renewalUnit;
	}



	public String getRenewalPeriod() {
		return renewalPeriod;
	}



	public void setRenewalPeriod(String renewalPeriod) {
		this.renewalPeriod = renewalPeriod;
	}



	public String getRenewalRoutingId() {
		return renewalRoutingId;
	}



	public void setRenewalRoutingId(String renewalRoutingId) {
		this.renewalRoutingId = renewalRoutingId;
	}



	public String getReviewUnit() {
		return reviewUnit;
	}



	public void setReviewUnit(String reviewUnit) {
		this.reviewUnit = reviewUnit;
	}



	public String getReviewPeriod() {
		return reviewPeriod;
	}



	public void setReviewPeriod(String reviewPeriod) {
		this.reviewPeriod = reviewPeriod;
	}



	public String getReviewRoutingId() {
		return reviewRoutingId;
	}



	public void setReviewRoutingId(String reviewRoutingId) {
		this.reviewRoutingId = reviewRoutingId;
	}



	public String getNoticeOfNonRenewalMinimumUnit() {
		return noticeOfNonRenewalMinimumUnit;
	}



	public void setNoticeOfNonRenewalMinimumUnit(String noticeOfNonRenewalMinimumUnit) {
		this.noticeOfNonRenewalMinimumUnit = noticeOfNonRenewalMinimumUnit;
	}



	public String getNoticeOfNonRenewalMinimumPeriod() {
		return noticeOfNonRenewalMinimumPeriod;
	}



	public void setNoticeOfNonRenewalMinimumPeriod(String noticeOfNonRenewalMinimumPeriod) {
		this.noticeOfNonRenewalMinimumPeriod = noticeOfNonRenewalMinimumPeriod;
	}



	public String getNoticeOfNonRenewalMaximumUnit() {
		return noticeOfNonRenewalMaximumUnit;
	}



	public void setNoticeOfNonRenewalMaximumUnit(String noticeOfNonRenewalMaximumUnit) {
		this.noticeOfNonRenewalMaximumUnit = noticeOfNonRenewalMaximumUnit;
	}



	public String getNoticeOfNonRenewalMaximumPeriod() {
		return noticeOfNonRenewalMaximumPeriod;
	}



	public void setNoticeOfNonRenewalMaximumPeriod(String noticeOfNonRenewalMaximumPeriod) {
		this.noticeOfNonRenewalMaximumPeriod = noticeOfNonRenewalMaximumPeriod;
	}



	public String getPremiumFormat() {
		return premiumFormat;
	}



	public void setPremiumFormat(String premiumFormat) {
		this.premiumFormat = premiumFormat;
	}



	public String getShowDiary() {
		return showDiary;
	}



	public void setShowDiary(String showDiary) {
		this.showDiary = showDiary;
	}



	public String getShowNote() {
		return showNote;
	}



	public void setShowNote(String showNote) {
		this.showNote = showNote;
	}



	public String getShowRate() {
		return showRate;
	}



	public void setShowRate(String showRate) {
		this.showRate = showRate;
	}



	public String getShowValidate() {
		return showValidate;
	}



	public void setShowValidate(String showValidate) {
		this.showValidate = showValidate;
	}



	public String getShowPremium() {
		return showPremium;
	}



	public void setShowPremium(String showPremium) {
		this.showPremium = showPremium;
	}



	public String getShowPremiumRatebookTerm() {
		return showPremiumRatebookTerm;
	}



	public void setShowPremiumRatebookTerm(String showPremiumRatebookTerm) {
		this.showPremiumRatebookTerm = showPremiumRatebookTerm;
	}



	public String getShowPremiumPolicyTerm() {
		return showPremiumPolicyTerm;
	}



	public void setShowPremiumPolicyTerm(String showPremiumPolicyTerm) {
		this.showPremiumPolicyTerm = showPremiumPolicyTerm;
	}



	public String getShowPremiumWritten() {
		return showPremiumWritten;
	}



	public void setShowPremiumWritten(String showPremiumWritten) {
		this.showPremiumWritten = showPremiumWritten;
	}



	public String getShowPremiumTotalWritten() {
		return showPremiumTotalWritten;
	}



	public void setShowPremiumTotalWritten(String showPremiumTotalWritten) {
		this.showPremiumTotalWritten = showPremiumTotalWritten;
	}



	public String getShowTabs() {
		return showTabs;
	}



	public void setShowTabs(String showTabs) {
		this.showTabs = showTabs;
	}



	public String getShowMessages() {
		return showMessages;
	}



	public void setShowMessages(String showMessages) {
		this.showMessages = showMessages;
	}



	public String getShowMessageSource() {
		return showMessageSource;
	}



	public void setShowMessageSource(String showMessageSource) {
		this.showMessageSource = showMessageSource;
	}



	public String getShowMessageSeverity() {
		return showMessageSeverity;
	}



	public void setShowMessageSeverity(String showMessageSeverity) {
		this.showMessageSeverity = showMessageSeverity;
	}



	public String getFlowInitial() {
		return flowInitial;
	}



	public void setFlowInitial(String flowInitial) {
		this.flowInitial = flowInitial;
	}



	public String getFlowLetter() {
		return flowLetter;
	}



	public void setFlowLetter(String flowLetter) {
		this.flowLetter = flowLetter;
	}



	public String getFlowPayPlan() {
		return flowPayPlan;
	}



	public void setFlowPayPlan(String flowPayPlan) {
		this.flowPayPlan = flowPayPlan;
	}



	public String getFlowHelp() {
		return flowHelp;
	}



	public void setFlowHelp(String flowHelp) {
		this.flowHelp = flowHelp;
	}



	public String getFlowAction() {
		return flowAction;
	}



	public void setFlowAction(String flowAction) {
		this.flowAction = flowAction;
	}



	public String getFlowUser() {
		return flowUser;
	}



	public void setFlowUser(String flowUser) {
		this.flowUser = flowUser;
	}



	public String getRatingTermPeriod() {
		return ratingTermPeriod;
	}



	public void setRatingTermPeriod(String ratingTermPeriod) {
		this.ratingTermPeriod = ratingTermPeriod;
	}



	public String getRatingTermUnit() {
		return ratingTermUnit;
	}



	public void setRatingTermUnit(String ratingTermUnit) {
		this.ratingTermUnit = ratingTermUnit;
	}



	public String getProRateTermUnit() {
		return proRateTermUnit;
	}



	public void setProRateTermUnit(String proRateTermUnit) {
		this.proRateTermUnit = proRateTermUnit;
	}



	public String getNoticeOfCancellationUnderwritingUnit() {
		return noticeOfCancellationUnderwritingUnit;
	}



	public void setNoticeOfCancellationUnderwritingUnit(String noticeOfCancellationUnderwritingUnit) {
		this.noticeOfCancellationUnderwritingUnit = noticeOfCancellationUnderwritingUnit;
	}



	public String getNoticeOfCancellationUnderwritingPeriod() {
		return noticeOfCancellationUnderwritingPeriod;
	}



	public void setNoticeOfCancellationUnderwritingPeriod(String noticeOfCancellationUnderwritingPeriod) {
		this.noticeOfCancellationUnderwritingPeriod = noticeOfCancellationUnderwritingPeriod;
	}



	public String getNoticeOfCancellationNonPaymentUnit() {
		return noticeOfCancellationNonPaymentUnit;
	}



	public void setNoticeOfCancellationNonPaymentUnit(String noticeOfCancellationNonPaymentUnit) {
		this.noticeOfCancellationNonPaymentUnit = noticeOfCancellationNonPaymentUnit;
	}



	public String getNoticeOfCancellationNonPaymentPeriod() {
		return noticeOfCancellationNonPaymentPeriod;
	}



	public void setNoticeOfCancellationNonPaymentPeriod(String noticeOfCancellationNonPaymentPeriod) {
		this.noticeOfCancellationNonPaymentPeriod = noticeOfCancellationNonPaymentPeriod;
	}



	public String getCancellationMethodUnderwriting() {
		return cancellationMethodUnderwriting;
	}



	public void setCancellationMethodUnderwriting(String cancellationMethodUnderwriting) {
		this.cancellationMethodUnderwriting = cancellationMethodUnderwriting;
	}



	public String getCancellationMethodNonPayment() {
		return cancellationMethodNonPayment;
	}



	public void setCancellationMethodNonPayment(String cancellationMethodNonPayment) {
		this.cancellationMethodNonPayment = cancellationMethodNonPayment;
	}



	public String getReinstatementPeriod() {
		return reinstatementPeriod;
	}



	public void setReinstatementPeriod(String reinstatementPeriod) {
		this.reinstatementPeriod = reinstatementPeriod;
	}



	public String getReinstatementUnit() {
		return reinstatementUnit;
	}



	public void setReinstatementUnit(String reinstatementUnit) {
		this.reinstatementUnit = reinstatementUnit;
	}



	public String getFutureEndorsementPeriod() {
		return futureEndorsementPeriod;
	}



	public void setFutureEndorsementPeriod(String futureEndorsementPeriod) {
		this.futureEndorsementPeriod = futureEndorsementPeriod;
	}



	public String getFutureEndorsementUnit() {
		return futureEndorsementUnit;
	}



	public void setFutureEndorsementUnit(String futureEndorsementUnit) {
		this.futureEndorsementUnit = futureEndorsementUnit;
	}



	public String getShortRateFactor() {
		return shortRateFactor;
	}



	public void setShortRateFactor(String shortRateFactor) {
		this.shortRateFactor = shortRateFactor;
	}



	public String getReleasePublishEvent() {
		return releasePublishEvent;
	}



	public void setReleasePublishEvent(String releasePublishEvent) {
		this.releasePublishEvent = releasePublishEvent;
	}



	public String getShowAddNamedInsuredAddress() {
		return ShowAddNamedInsuredAddress;
	}



	public void setShowAddNamedInsuredAddress(String showAddNamedInsuredAddress) {
		ShowAddNamedInsuredAddress = showAddNamedInsuredAddress;
	}



	public String getAddNamedInsuredText() {
		return addNamedInsuredText;
	}



	public void setAddNamedInsuredText(String addNamedInsuredText) {
		this.addNamedInsuredText = addNamedInsuredText;
	}



	public String getAddNamedInsuredAddressRequired() {
		return addNamedInsuredAddressRequired;
	}



	public void setAddNamedInsuredAddressRequired(String addNamedInsuredAddressRequired) {
		this.addNamedInsuredAddressRequired = addNamedInsuredAddressRequired;
	}



	public String getMinimumPremium() {
		return minimumPremium;
	}



	public void setMinimumPremium(String minimumPremium) {
		this.minimumPremium = minimumPremium;
	}



	public String getMinimumPremiumCoverage() {
		return minimumPremiumCoverage;
	}



	public void setMinimumPremiumCoverage(String minimumPremiumCoverage) {
		this.minimumPremiumCoverage = minimumPremiumCoverage;
	}



	public String getMinimumPremiumOptionEndorsement() {
		return minimumPremiumOptionEndorsement;
	}



	public void setMinimumPremiumOptionEndorsement(String minimumPremiumOptionEndorsement) {
		this.minimumPremiumOptionEndorsement = minimumPremiumOptionEndorsement;
	}



	public String getMinimumPremiumOptionCancelFlat() {
		return minimumPremiumOptionCancelFlat;
	}



	public void setMinimumPremiumOptionCancelFlat(String minimumPremiumOptionCancelFlat) {
		this.minimumPremiumOptionCancelFlat = minimumPremiumOptionCancelFlat;
	}



	public String getMinimumPremiumOptionCancelProRate() {
		return minimumPremiumOptionCancelProRate;
	}



	public void setMinimumPremiumOptionCancelProRate(String minimumPremiumOptionCancelProRate) {
		this.minimumPremiumOptionCancelProRate = minimumPremiumOptionCancelProRate;
	}



	public String getMinimumPremiumOptionCancelShortRate() {
		return minimumPremiumOptionCancelShortRate;
	}



	public void setMinimumPremiumOptionCancelShortRate(String minimumPremiumOptionCancelShortRate) {
		this.minimumPremiumOptionCancelShortRate = minimumPremiumOptionCancelShortRate;
	}



	public String getPackageCoverage() {
		return packageCoverage;
	}



	public void setPackageCoverage(String packageCoverage) {
		this.packageCoverage = packageCoverage;
	}



	public String getPremiumDecimals() {
		return premiumDecimals;
	}



	public void setPremiumDecimals(String premiumDecimals) {
		this.premiumDecimals = premiumDecimals;
	}



	public String getRenewalUpdateUnitNumber() {
		return renewalUpdateUnitNumber;
	}



	public void setRenewalUpdateUnitNumber(String renewalUpdateUnitNumber) {
		this.renewalUpdateUnitNumber = renewalUpdateUnitNumber;
	}



	public String getPayPlanProvider() {
		return payPlanProvider;
	}



	public void setPayPlanProvider(String payPlanProvider) {
		this.payPlanProvider = payPlanProvider;
	}



	public String getFutureEffectivePeriod() {
		return futureEffectivePeriod;
	}



	public void setFutureEffectivePeriod(String futureEffectivePeriod) {
		this.futureEffectivePeriod = futureEffectivePeriod;
	}



	public String getFutureEffectiveUnit() {
		return futureEffectiveUnit;
	}



	public void setFutureEffectiveUnit(String futureEffectiveUnit) {
		this.futureEffectiveUnit = futureEffectiveUnit;
	}



	public String getPastEffectivePeriod() {
		return pastEffectivePeriod;
	}



	public void setPastEffectivePeriod(String pastEffectivePeriod) {
		this.pastEffectivePeriod = pastEffectivePeriod;
	}



	public String getPastEffectiveUnit() {
		return pastEffectiveUnit;
	}



	public void setPastEffectiveUnit(String pastEffectiveUnit) {
		this.pastEffectiveUnit = pastEffectiveUnit;
	}



	public String getSuspendRenewal() {
		return suspendRenewal;
	}



	public void setSuspendRenewal(String suspendRenewal) {
		this.suspendRenewal = suspendRenewal;
	}



	public String getSuspendCancellation() {
		return suspendCancellation;
	}



	public void setSuspendCancellation(String suspendCancellation) {
		this.suspendCancellation = suspendCancellation;
	}



	public String getApplyButtonText() {
		return applyButtonText;
	}



	public void setApplyButtonText(String applyButtonText) {
		this.applyButtonText = applyButtonText;
	}



	public String getAuditFrequencyDefault() {
		return auditFrequencyDefault;
	}



	public void setAuditFrequencyDefault(String auditFrequencyDefault) {
		this.auditFrequencyDefault = auditFrequencyDefault;
	}



	public String getAuditFrequencyAnnual() {
		return auditFrequencyAnnual;
	}



	public void setAuditFrequencyAnnual(String auditFrequencyAnnual) {
		this.auditFrequencyAnnual = auditFrequencyAnnual;
	}



	public String getAuditFrequencySemiannual() {
		return auditFrequencySemiannual;
	}



	public void setAuditFrequencySemiannual(String auditFrequencySemiannual) {
		this.auditFrequencySemiannual = auditFrequencySemiannual;
	}



	public String getAuditFrequencyQuarterly() {
		return auditFrequencyQuarterly;
	}



	public void setAuditFrequencyQuarterly(String auditFrequencyQuarterly) {
		this.auditFrequencyQuarterly = auditFrequencyQuarterly;
	}



	public String getAuditFrequencyMonthly() {
		return auditFrequencyMonthly;
	}



	public void setAuditFrequencyMonthly(String auditFrequencyMonthly) {
		this.auditFrequencyMonthly = auditFrequencyMonthly;
	}



	public String getAuditOffsetAnnual() {
		return auditOffsetAnnual;
	}



	public void setAuditOffsetAnnual(String auditOffsetAnnual) {
		this.auditOffsetAnnual = auditOffsetAnnual;
	}



	public String getAuditOffsetSemiannual() {
		return auditOffsetSemiannual;
	}



	public void setAuditOffsetSemiannual(String auditOffsetSemiannual) {
		this.auditOffsetSemiannual = auditOffsetSemiannual;
	}



	public String getAuditOffsetQuarterly() {
		return auditOffsetQuarterly;
	}



	public void setAuditOffsetQuarterly(String auditOffsetQuarterly) {
		this.auditOffsetQuarterly = auditOffsetQuarterly;
	}



	public String getAuditOffsetMonthly() {
		return auditOffsetMonthly;
	}



	public void setAuditOffsetMonthly(String auditOffsetMonthly) {
		this.auditOffsetMonthly = auditOffsetMonthly;
	}



	public String getQuoteHideLocale() {
		return quoteHideLocale;
	}



	public void setQuoteHideLocale(String quoteHideLocale) {
		this.quoteHideLocale = quoteHideLocale;
	}



	public String getPolicyHideLocale() {
		return policyHideLocale;
	}



	public void setPolicyHideLocale(String policyHideLocale) {
		this.policyHideLocale = policyHideLocale;
	}



	public String getTabInitialLabel() {
		return tabInitialLabel;
	}



	public void setTabInitialLabel(String tabInitialLabel) {
		this.tabInitialLabel = tabInitialLabel;
	}



	public String getTabLetterLabel() {
		return tabLetterLabel;
	}



	public void setTabLetterLabel(String tabLetterLabel) {
		this.tabLetterLabel = tabLetterLabel;
	}



	public String getTabActionLabel() {
		return tabActionLabel;
	}



	public void setTabActionLabel(String tabActionLabel) {
		this.tabActionLabel = tabActionLabel;
	}



	public String getTabActionTextAction() {
		return tabActionTextAction;
	}



	public void setTabActionTextAction(String tabActionTextAction) {
		this.tabActionTextAction = tabActionTextAction;
	}



	public String getTabActionTextCause() {
		return tabActionTextCause;
	}



	public void setTabActionTextCause(String tabActionTextCause) {
		this.tabActionTextCause = tabActionTextCause;
	}



	public String getTabActionTextComment() {
		return tabActionTextComment;
	}



	public void setTabActionTextComment(String tabActionTextComment) {
		this.tabActionTextComment = tabActionTextComment;
	}



	public String getTabActionTextSubmit() {
		return tabActionTextSubmit;
	}



	public void setTabActionTextSubmit(String tabActionTextSubmit) {
		this.tabActionTextSubmit = tabActionTextSubmit;
	}



	public String getTabActionTextApply() {
		return tabActionTextApply;
	}



	public void setTabActionTextApply(String tabActionTextApply) {
		this.tabActionTextApply = tabActionTextApply;
	}



	public String getPremiumRatebookTermLabel() {
		return premiumRatebookTermLabel;
	}



	public void setPremiumRatebookTermLabel(String premiumRatebookTermLabel) {
		this.premiumRatebookTermLabel = premiumRatebookTermLabel;
	}



	public String getPremiumPolicyTermLabel() {
		return premiumPolicyTermLabel;
	}



	public void setPremiumPolicyTermLabel(String premiumPolicyTermLabel) {
		this.premiumPolicyTermLabel = premiumPolicyTermLabel;
	}



	public String getPremiumWrittenLabel() {
		return premiumWrittenLabel;
	}



	public void setPremiumWrittenLabel(String premiumWrittenLabel) {
		this.premiumWrittenLabel = premiumWrittenLabel;
	}



	public String getPremiumTotalWrittenLabel() {
		return premiumTotalWrittenLabel;
	}



	public void setPremiumTotalWrittenLabel(String premiumTotalWrittenLabel) {
		this.premiumTotalWrittenLabel = premiumTotalWrittenLabel;
	}



	public String getViewAttachingLabel() {
		return viewAttachingLabel;
	}



	public void setViewAttachingLabel(String viewAttachingLabel) {
		this.viewAttachingLabel = viewAttachingLabel;
	}



	public String getSearchClientLabel() {
		return searchClientLabel;
	}



	public void setSearchClientLabel(String searchClientLabel) {
		this.searchClientLabel = searchClientLabel;
	}



	public String getSearchAddressLabel() {
		return searchAddressLabel;
	}



	public void setSearchAddressLabel(String searchAddressLabel) {
		this.searchAddressLabel = searchAddressLabel;
	}



	public String getAgentText() {
		return agentText;
	}



	public void setAgentText(String agentText) {
		this.agentText = agentText;
	}



	public String getShowHelpImage() {
		return showHelpImage;
	}



	public void setShowHelpImage(String showHelpImage) {
		this.showHelpImage = showHelpImage;
	}



	public String getNoticeOfCancellationCauseUnit() {
		return noticeOfCancellationCauseUnit;
	}



	public void setNoticeOfCancellationCauseUnit(String noticeOfCancellationCauseUnit) {
		this.noticeOfCancellationCauseUnit = noticeOfCancellationCauseUnit;
	}



	public String getNoticeOfCancellationCausePeriod() {
		return noticeOfCancellationCausePeriod;
	}



	public void setNoticeOfCancellationCausePeriod(String noticeOfCancellationCausePeriod) {
		this.noticeOfCancellationCausePeriod = noticeOfCancellationCausePeriod;
	}



	public String getCancellationMethodCause() {
		return cancellationMethodCause;
	}



	public void setCancellationMethodCause(String cancellationMethodCause) {
		this.cancellationMethodCause = cancellationMethodCause;
	}



	public String getAgentTransferMessageRoutingId() {
		return agentTransferMessageRoutingId;
	}



	public void setAgentTransferMessageRoutingId(String agentTransferMessageRoutingId) {
		this.agentTransferMessageRoutingId = agentTransferMessageRoutingId;
	}



	public String getHonorRatebookPeriod() {
		return honorRatebookPeriod;
	}



	public void setHonorRatebookPeriod(String honorRatebookPeriod) {
		this.honorRatebookPeriod = honorRatebookPeriod;
	}



	public String getHonorRatebookUnit() {
		return honorRatebookUnit;
	}



	public void setHonorRatebookUnit(String honorRatebookUnit) {
		this.honorRatebookUnit = honorRatebookUnit;
	}



	public String getReviewHonoredRoutingId() {
		return reviewHonoredRoutingId;
	}



	public void setReviewHonoredRoutingId(String reviewHonoredRoutingId) {
		this.reviewHonoredRoutingId = reviewHonoredRoutingId;
	}



	public String getMultipleRating() {
		return multipleRating;
	}



	public void setMultipleRating(String multipleRating) {
		this.multipleRating = multipleRating;
	}



	public String getAnniversaryRating() {
		return anniversaryRating;
	}



	public void setAnniversaryRating(String anniversaryRating) {
		this.anniversaryRating = anniversaryRating;
	}



	public String getAnniversaryRatingMessageRoutingId() {
		return anniversaryRatingMessageRoutingId;
	}



	public void setAnniversaryRatingMessageRoutingId(String anniversaryRatingMessageRoutingId) {
		this.anniversaryRatingMessageRoutingId = anniversaryRatingMessageRoutingId;
	}



	public String getAutoApply() {
		return autoApply;
	}



	public void setAutoApply(String autoApply) {
		this.autoApply = autoApply;
	}



	public String getFlowFormSummaries() {
		return flowFormSummaries;
	}



	public void setFlowFormSummaries(String flowFormSummaries) {
		this.flowFormSummaries = flowFormSummaries;
	}



	public String getAutoRefreshData() {
		return autoRefreshData;
	}



	public void setAutoRefreshData(String autoRefreshData) {
		this.autoRefreshData = autoRefreshData;
	}



	public String getMultiPolicyDiscountRoutingId() {
		return multiPolicyDiscountRoutingId;
	}



	public void setMultiPolicyDiscountRoutingId(String multiPolicyDiscountRoutingId) {
		this.multiPolicyDiscountRoutingId = multiPolicyDiscountRoutingId;
	}



	public String getMidTermEndtProcess() {
		return midTermEndtProcess;
	}



	public void setMidTermEndtProcess(String midTermEndtProcess) {
		this.midTermEndtProcess = midTermEndtProcess;
	}



	public String getAnniversaryRatingCondition() {
		return anniversaryRatingCondition;
	}



	public void setAnniversaryRatingCondition(String anniversaryRatingCondition) {
		this.anniversaryRatingCondition = anniversaryRatingCondition;
	}



	public String getModifyHouseholdLabel() {
		return modifyHouseholdLabel;
	}



	public void setModifyHouseholdLabel(String modifyHouseholdLabel) {
		this.modifyHouseholdLabel = modifyHouseholdLabel;
	}



	public String getShowHouseholdSearch() {
		return showHouseholdSearch;
	}



	public void setShowHouseholdSearch(String showHouseholdSearch) {
		this.showHouseholdSearch = showHouseholdSearch;
	}



	public String getHideClientLinks() {
		return hideClientLinks;
	}



	public void setHideClientLinks(String hideClientLinks) {
		this.hideClientLinks = hideClientLinks;
	}



	public String getTabMessageIndicator() {
		return tabMessageIndicator;
	}



	public void setTabMessageIndicator(String tabMessageIndicator) {
		this.tabMessageIndicator = tabMessageIndicator;
	}



	public String getCommentRows() {
		return commentRows;
	}



	public void setCommentRows(String commentRows) {
		this.commentRows = commentRows;
	}



	public String getCommentCols() {
		return commentCols;
	}



	public void setCommentCols(String commentCols) {
		this.commentCols = commentCols;
	}



	public String getMonoline() {
		return monoline;
	}



	public void setMonoline(String monoline) {
		this.monoline = monoline;
	}



	public String getTabPolicySummaryTextAction() {
		return tabPolicySummaryTextAction;
	}



	public void setTabPolicySummaryTextAction(String tabPolicySummaryTextAction) {
		this.tabPolicySummaryTextAction = tabPolicySummaryTextAction;
	}



	public String getTabPolicySummaryTextModify() {
		return tabPolicySummaryTextModify;
	}



	public void setTabPolicySummaryTextModify(String tabPolicySummaryTextModify) {
		this.tabPolicySummaryTextModify = tabPolicySummaryTextModify;
	}



	public String getTabPolicySummaryTextRemove() {
		return tabPolicySummaryTextRemove;
	}



	public void setTabPolicySummaryTextRemove(String tabPolicySummaryTextRemove) {
		this.tabPolicySummaryTextRemove = tabPolicySummaryTextRemove;
	}



	public String getTabPolicySummaryTextView() {
		return tabPolicySummaryTextView;
	}



	public void setTabPolicySummaryTextView(String tabPolicySummaryTextView) {
		this.tabPolicySummaryTextView = tabPolicySummaryTextView;
	}



	public String getTabPolicySummaryNewAdd() {
		return tabPolicySummaryNewAdd;
	}



	public void setTabPolicySummaryNewAdd(String tabPolicySummaryNewAdd) {
		this.tabPolicySummaryNewAdd = tabPolicySummaryNewAdd;
	}



	public String getTabPolicySummaryNewModify() {
		return tabPolicySummaryNewModify;
	}



	public void setTabPolicySummaryNewModify(String tabPolicySummaryNewModify) {
		this.tabPolicySummaryNewModify = tabPolicySummaryNewModify;
	}



	public String getTabPolicySummaryNewDisplayAdd() {
		return tabPolicySummaryNewDisplayAdd;
	}



	public void setTabPolicySummaryNewDisplayAdd(String tabPolicySummaryNewDisplayAdd) {
		this.tabPolicySummaryNewDisplayAdd = tabPolicySummaryNewDisplayAdd;
	}



	public String getTabPolicySummaryNewDisplayModify() {
		return tabPolicySummaryNewDisplayModify;
	}



	public void setTabPolicySummaryNewDisplayModify(String tabPolicySummaryNewDisplayModify) {
		this.tabPolicySummaryNewDisplayModify = tabPolicySummaryNewDisplayModify;
	}



	public String getPassRoofDataToCovParts() {
		return passRoofDataToCovParts;
	}



	public void setPassRoofDataToCovParts(String passRoofDataToCovParts) {
		this.passRoofDataToCovParts = passRoofDataToCovParts;
	}



	public String getHideAgentSelectAddress() {
		return hideAgentSelectAddress;
	}



	public void setHideAgentSelectAddress(String hideAgentSelectAddress) {
		this.hideAgentSelectAddress = hideAgentSelectAddress;
	}



	public String getTabCovPartsLabel() {
		return tabCovPartsLabel;
	}



	public void setTabCovPartsLabel(String tabCovPartsLabel) {
		this.tabCovPartsLabel = tabCovPartsLabel;
	}



	public String getTabPolicySummaryTextAdd() {
		return tabPolicySummaryTextAdd;
	}



	public void setTabPolicySummaryTextAdd(String tabPolicySummaryTextAdd) {
		this.tabPolicySummaryTextAdd = tabPolicySummaryTextAdd;
	}



	public String getHouseholdClientType() {
		return householdClientType;
	}



	public void setHouseholdClientType(String householdClientType) {
		this.householdClientType = householdClientType;
	}



	public String getAuditCreatedMessageRoutingId() {
		return auditCreatedMessageRoutingId;
	}



	public void setAuditCreatedMessageRoutingId(String auditCreatedMessageRoutingId) {
		this.auditCreatedMessageRoutingId = auditCreatedMessageRoutingId;
	}



	public String getAuditWaivedMessageRoutingId() {
		return auditWaivedMessageRoutingId;
	}



	public void setAuditWaivedMessageRoutingId(String auditWaivedMessageRoutingId) {
		this.auditWaivedMessageRoutingId = auditWaivedMessageRoutingId;
	}



	public String getAuditCompletedMessageRoutingId() {
		return auditCompletedMessageRoutingId;
	}



	public void setAuditCompletedMessageRoutingId(String auditCompletedMessageRoutingId) {
		this.auditCompletedMessageRoutingId = auditCompletedMessageRoutingId;
	}



	public String getAnniversaryRatingUseAnnDate() {
		return anniversaryRatingUseAnnDate;
	}



	public void setAnniversaryRatingUseAnnDate(String anniversaryRatingUseAnnDate) {
		this.anniversaryRatingUseAnnDate = anniversaryRatingUseAnnDate;
	}



	public String getAutoValidationFlags() {
		return autoValidationFlags;
	}



	public void setAutoValidationFlags(String autoValidationFlags) {
		this.autoValidationFlags = autoValidationFlags;
	}



	public String getRoundingMethod() {
		return roundingMethod;
	}



	public void setRoundingMethod(String roundingMethod) {
		this.roundingMethod = roundingMethod;
	}



	public String getFlowRiskDetail() {
		return flowRiskDetail;
	}



	public void setFlowRiskDetail(String flowRiskDetail) {
		this.flowRiskDetail = flowRiskDetail;
	}



	public String getHideHeade() {
		return hideHeade;
	}



	public void setHideHeade(String hideHeade) {
		this.hideHeade = hideHeade;
	}



	public String getHideClearButton() {
		return hideClearButton;
	}



	public void setHideClearButton(String hideClearButton) {
		this.hideClearButton = hideClearButton;
	}



	public String getHidePolicyDetail() {
		return hidePolicyDetail;
	}



	public void setHidePolicyDetail(String hidePolicyDetail) {
		this.hidePolicyDetail = hidePolicyDetail;
	}



	public String getHeaderBasedGeneralInfo() {
		return headerBasedGeneralInfo;
	}



	public void setHeaderBasedGeneralInfo(String headerBasedGeneralInfo) {
		this.headerBasedGeneralInfo = headerBasedGeneralInfo;
	}



	public String getNamedInsuredText() {
		return namedInsuredText;
	}



	public void setNamedInsuredText(String namedInsuredText) {
		this.namedInsuredText = namedInsuredText;
	}



	public String getForwardLabel() {
		return forwardLabel;
	}



	public void setForwardLabel(String forwardLabel) {
		this.forwardLabel = forwardLabel;
	}



	public String getBackLabel() {
		return backLabel;
	}



	public void setBackLabel(String backLabel) {
		this.backLabel = backLabel;
	}



	public String getBackNavigation() {
		return backNavigation;
	}



	public void setBackNavigation(String backNavigation) {
		this.backNavigation = backNavigation;
	}



	public String getEsiNamedInsured() {
		return esiNamedInsured;
	}



	public void setEsiNamedInsured(String esiNamedInsured) {
		this.esiNamedInsured = esiNamedInsured;
	}



	public String getEsiAdditionalNamedInsured() {
		return esiAdditionalNamedInsured;
	}



	public void setEsiAdditionalNamedInsured(String esiAdditionalNamedInsured) {
		this.esiAdditionalNamedInsured = esiAdditionalNamedInsured;
	}



	public String getEsiAgent() {
		return esiAgent;
	}



	public void setEsiAgent(String esiAgent) {
		this.esiAgent = esiAgent;
	}



	public String getEsiNamedInsuredTemplateFileName() {
		return esiNamedInsuredTemplateFileName;
	}



	public void setEsiNamedInsuredTemplateFileName(String esiNamedInsuredTemplateFileName) {
		this.esiNamedInsuredTemplateFileName = esiNamedInsuredTemplateFileName;
	}



	public String getEsiAdditionalNamedInsuredTemplateFileName() {
		return esiAdditionalNamedInsuredTemplateFileName;
	}



	public void setEsiAdditionalNamedInsuredTemplateFileName(String esiAdditionalNamedInsuredTemplateFileName) {
		this.esiAdditionalNamedInsuredTemplateFileName = esiAdditionalNamedInsuredTemplateFileName;
	}



	public String getEsiAgentTemplateFileName() {
		return esiAgentTemplateFileName;
	}



	public void setEsiAgentTemplateFileName(String esiAgentTemplateFileName) {
		this.esiAgentTemplateFileName = esiAgentTemplateFileName;
	}



	public String getAuditSuspendedMessageRoutingId() {
		return auditSuspendedMessageRoutingId;
	}



	public void setAuditSuspendedMessageRoutingId(String auditSuspendedMessageRoutingId) {
		this.auditSuspendedMessageRoutingId = auditSuspendedMessageRoutingId;
	}



	public String getAuditTemplateFileName() {
		return auditTemplateFileName;
	}



	public void setAuditTemplateFileName(String auditTemplateFileName) {
		this.auditTemplateFileName = auditTemplateFileName;
	}



	public String getAuditFrequencyNotApplicable() {
		return auditFrequencyNotApplicable;
	}



	public void setAuditFrequencyNotApplicable(String auditFrequencyNotApplicable) {
		this.auditFrequencyNotApplicable = auditFrequencyNotApplicable;
	}



	public String getTabAuditTemplateLabel() {
		return tabAuditTemplateLabel;
	}



	public void setTabAuditTemplateLabel(String tabAuditTemplateLabel) {
		this.tabAuditTemplateLabel = tabAuditTemplateLabel;
	}



	public String getRatingModeToggle() {
		return ratingModeToggle;
	}



	public void setRatingModeToggle(String ratingModeToggle) {
		this.ratingModeToggle = ratingModeToggle;
	}



	public String getShowAttachDBATA() {
		return showAttachDBATA;
	}



	public void setShowAttachDBATA(String showAttachDBATA) {
		this.showAttachDBATA = showAttachDBATA;
	}



	public String getNamedInsuredDBATAText() {
		return namedInsuredDBATAText;
	}



	public void setNamedInsuredDBATAText(String namedInsuredDBATAText) {
		this.namedInsuredDBATAText = namedInsuredDBATAText;
	}



	public String getAddNamedInsuredDBATAText() {
		return addNamedInsuredDBATAText;
	}



	public void setAddNamedInsuredDBATAText(String addNamedInsuredDBATAText) {
		this.addNamedInsuredDBATAText = addNamedInsuredDBATAText;
	}



	public String getMaxNamedInsuredDBATA() {
		return maxNamedInsuredDBATA;
	}



	public void setMaxNamedInsuredDBATA(String maxNamedInsuredDBATA) {
		this.maxNamedInsuredDBATA = maxNamedInsuredDBATA;
	}



	public String getMaxAddNamedInsuredDBATA() {
		return maxAddNamedInsuredDBATA;
	}



	public void setMaxAddNamedInsuredDBATA(String maxAddNamedInsuredDBATA) {
		this.maxAddNamedInsuredDBATA = maxAddNamedInsuredDBATA;
	}



	public String getMinimumPremiumOverride() {
		return minimumPremiumOverride;
	}



	public void setMinimumPremiumOverride(String minimumPremiumOverride) {
		this.minimumPremiumOverride = minimumPremiumOverride;
	}



	public String getMinimumPremiumExcluded() {
		return minimumPremiumExcluded;
	}



	public void setMinimumPremiumExcluded(String minimumPremiumExcluded) {
		this.minimumPremiumExcluded = minimumPremiumExcluded;
	}



	public String getMinimumPremiumColumn() {
		return minimumPremiumColumn;
	}



	public void setMinimumPremiumColumn(String minimumPremiumColumn) {
		this.minimumPremiumColumn = minimumPremiumColumn;
	}



	public String getMinimumPremiumOptionEndtColumn() {
		return minimumPremiumOptionEndtColumn;
	}



	public void setMinimumPremiumOptionEndtColumn(String minimumPremiumOptionEndtColumn) {
		this.minimumPremiumOptionEndtColumn = minimumPremiumOptionEndtColumn;
	}



	public String getExpirationUnit() {
		return expirationUnit;
	}



	public void setExpirationUnit(String expirationUnit) {
		this.expirationUnit = expirationUnit;
	}



	public String getExpirationPeriod() {
		return expirationPeriod;
	}



	public void setExpirationPeriod(String expirationPeriod) {
		this.expirationPeriod = expirationPeriod;
	}



	public String getVaryingShortRateFactor() {
		return varyingShortRateFactor;
	}



	public void setVaryingShortRateFactor(String varyingShortRateFactor) {
		this.varyingShortRateFactor = varyingShortRateFactor;
	}



	public String getSuppressNotificationText() {
		return suppressNotificationText;
	}



	public void setSuppressNotificationText(String suppressNotificationText) {
		this.suppressNotificationText = suppressNotificationText;
	}



	public String getShowMsg() {
		return showMsg;
	}



	public void setShowMsg(String showMsg) {
		this.showMsg = showMsg;
	}



	public String getAuditPurgedARDModMessageRoutingId() {
		return auditPurgedARDModMessageRoutingId;
	}



	public void setAuditPurgedARDModMessageRoutingId(String auditPurgedARDModMessageRoutingId) {
		this.auditPurgedARDModMessageRoutingId = auditPurgedARDModMessageRoutingId;
	}



	public String getAuditCompletedARDModMessageRoutingId() {
		return auditCompletedARDModMessageRoutingId;
	}



	public void setAuditCompletedARDModMessageRoutingId(String auditCompletedARDModMessageRoutingId) {
		this.auditCompletedARDModMessageRoutingId = auditCompletedARDModMessageRoutingId;
	}



	public String getAuditWaivedARDModMessageRoutingId() {
		return auditWaivedARDModMessageRoutingId;
	}



	public void setAuditWaivedARDModMessageRoutingId(String auditWaivedARDModMessageRoutingId) {
		this.auditWaivedARDModMessageRoutingId = auditWaivedARDModMessageRoutingId;
	}



	public String getRatingModePremiumRollup() {
		return ratingModePremiumRollup;
	}



	public void setRatingModePremiumRollup(String ratingModePremiumRollup) {
		this.ratingModePremiumRollup = ratingModePremiumRollup;
	}



	public String getFullRateTabLetter() {
		return fullRateTabLetter;
	}



	public void setFullRateTabLetter(String fullRateTabLetter) {
		this.fullRateTabLetter = fullRateTabLetter;
	}



	public String getFullRateTabAction() {
		return fullRateTabAction;
	}



	public void setFullRateTabAction(String fullRateTabAction) {
		this.fullRateTabAction = fullRateTabAction;
	}



	public String getRateRoofOnly() {
		return rateRoofOnly;
	}



	public void setRateRoofOnly(String rateRoofOnly) {
		this.rateRoofOnly = rateRoofOnly;
	}



	public String getAutomaticFormAttachment() {
		return automaticFormAttachment;
	}



	public void setAutomaticFormAttachment(String automaticFormAttachment) {
		this.automaticFormAttachment = automaticFormAttachment;
	}



	public String getHelpLabel() {
		return helpLabel;
	}



	public void setHelpLabel(String helpLabel) {
		this.helpLabel = helpLabel;
	}



	public String getDiaryLabel() {
		return diaryLabel;
	}



	public void setDiaryLabel(String diaryLabel) {
		this.diaryLabel = diaryLabel;
	}



	public String getNoteLabel() {
		return noteLabel;
	}



	public void setNoteLabel(String noteLabel) {
		this.noteLabel = noteLabel;
	}



	public String getValidateLabel() {
		return validateLabel;
	}



	public void setValidateLabel(String validateLabel) {
		this.validateLabel = validateLabel;
	}



	public String getRateLabel() {
		return rateLabel;
	}



	public void setRateLabel(String rateLabel) {
		this.rateLabel = rateLabel;
	}



	public String getAutomaticRatingLabel() {
		return automaticRatingLabel;
	}



	public void setAutomaticRatingLabel(String automaticRatingLabel) {
		this.automaticRatingLabel = automaticRatingLabel;
	}



	public String getDisplayModeLabel() {
		return displayModeLabel;
	}



	public void setDisplayModeLabel(String displayModeLabel) {
		this.displayModeLabel = displayModeLabel;
	}



	public String getNavigationType() {
		return navigationType;
	}



	public void setNavigationType(String navigationType) {
		this.navigationType = navigationType;
	}



	public String getValidationMode() {
		return validationMode;
	}



	public void setValidationMode(String validationMode) {
		this.validationMode = validationMode;
	}



	public String getRatingMode() {
		return ratingMode;
	}



	public void setRatingMode(String ratingMode) {
		this.ratingMode = ratingMode;
	}



	public String getExternalProvider() {
		return externalProvider;
	}



	public void setExternalProvider(String externalProvider) {
		this.externalProvider = externalProvider;
	}



	public String getHideHeader() {
		return hideHeader;
	}



	public void setHideHeader(String hideHeader) {
		this.hideHeader = hideHeader;
	}



	public void addChildren(XmlConstruct xmlConstruct) {
		// TODO Auto-generated method stub
		
	}



	public String getCharacterContent() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setCharacterContent(String characterContent) {
		// TODO Auto-generated method stub
		
	}



	public XmlConstruct getParent() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setParent(XmlConstruct parent) {
		// TODO Auto-generated method stub
		
	}



	public String getElementName() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setElementName(String elementName) {
		// TODO Auto-generated method stub
		
	}



	public XmlConstruct getPreviousSibling() {
		// TODO Auto-generated method stub
		return null;
	}



	public XmlConstruct getNextSibling() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setPreviousSibling(XmlConstruct previousSibling) {
		// TODO Auto-generated method stub
		
	}



	public void setNextSibling(XmlConstruct nextSibling) {
		// TODO Auto-generated method stub
		
	}



	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		// TODO Auto-generated method stub
		
	}



	public XmlConstruct getPreviousSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}



	public XmlConstruct getNextSimilarSibling() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
