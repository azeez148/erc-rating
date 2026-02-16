package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.Column;

public class Field implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1681848928397049739L;
	String id;
	String formId;
	String columnId;
	String domainTableId;
	String addChangeDeleteFlag;
	Column column;
	String columnName;
	DomainTable domainTable;
	String sequence;
	String type;
	String textAreaRows;
	String textAreaCols;
	String textDisplaySize;
	String label;
	String quoteReadOnly;
	String quoteRequired;
	String quoteDisplay;
	String quoteDisabled;
	String policyReadOnly;
	String policyRequired;
	String policyDisplay;
	String policyDisabled;
	String defaultValue;
	String minimum;
	String maximum;
	String mask;
	String linkText;
	String help;
	String helpText;
	String bureauRuleNumber;
	String comment;
	String viewResourceId;
	String modifyResourceId;
	String condition;
	String requiredCondition;
	String amendablePostIssuance;
	String amendablePreRenewal;
	String displayColumns;
	String displayController;
	String displayControllerTriggerRate;
	String auditable;
	String auditViewOnly;
	String auditCondition;
	String xslValue;
	String refTableName;
	String beforeScript;
	String beforeScriptData;
	String afterScript;
	String afterScriptData;
	String changeScript;
	String changeScriptData;
	String domainTableName;
	String dialogFileName;
	String dialogFileType;
	String lobTabName;
	String lobTabSequence;
	String lobTabCoveragePart;
	String displayMode;
	String displayModeCondition;
	String displayModeReadOnly;
	String esiTemplateFileName;
	String esiLabelsDefinedInTemplate;
	String printRequired;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getDomainTableId() {
		return domainTableId;
	}

	public void setDomainTableId(String domainTableId) {
		this.domainTableId = domainTableId;
	}

	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}

	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}

	public Column getColumn() {
		return column;
	}

	public void setColumn(Column column) {
		this.column = column;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public DomainTable getDomainTable() {
		return domainTable;
	}

	public void setDomainTable(DomainTable domainTable) {
		this.domainTable = domainTable;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTextAreaRows() {
		return textAreaRows;
	}

	public void setTextAreaRows(String textAreaRows) {
		this.textAreaRows = textAreaRows;
	}

	public String getTextAreaCols() {
		return textAreaCols;
	}

	public void setTextAreaCols(String textAreaCols) {
		this.textAreaCols = textAreaCols;
	}

	public String getTextDisplaySize() {
		return textDisplaySize;
	}

	public void setTextDisplaySize(String textDisplaySize) {
		this.textDisplaySize = textDisplaySize;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getQuoteReadOnly() {
		return quoteReadOnly;
	}

	public void setQuoteReadOnly(String quoteReadOnly) {
		this.quoteReadOnly = quoteReadOnly;
	}

	public String getQuoteRequired() {
		return quoteRequired;
	}

	public void setQuoteRequired(String quoteRequired) {
		this.quoteRequired = quoteRequired;
	}

	public String getQuoteDisplay() {
		return quoteDisplay;
	}

	public void setQuoteDisplay(String quoteDisplay) {
		this.quoteDisplay = quoteDisplay;
	}

	public String getQuoteDisabled() {
		return quoteDisabled;
	}

	public void setQuoteDisabled(String quoteDisabled) {
		this.quoteDisabled = quoteDisabled;
	}

	public String getPolicyReadOnly() {
		return policyReadOnly;
	}

	public void setPolicyReadOnly(String policyReadOnly) {
		this.policyReadOnly = policyReadOnly;
	}

	public String getPolicyRequired() {
		return policyRequired;
	}

	public void setPolicyRequired(String policyRequired) {
		this.policyRequired = policyRequired;
	}

	public String getPolicyDisplay() {
		return policyDisplay;
	}

	public void setPolicyDisplay(String policyDisplay) {
		this.policyDisplay = policyDisplay;
	}

	public String getPolicyDisabled() {
		return policyDisabled;
	}

	public void setPolicyDisabled(String policyDisabled) {
		this.policyDisabled = policyDisabled;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	public String getMaximum() {
		return maximum;
	}

	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getLinkText() {
		return linkText;
	}

	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getHelpText() {
		return helpText;
	}

	public void setHelpText(String helpText) {
		this.helpText = helpText;
	}

	public String getBureauRuleNumber() {
		return bureauRuleNumber;
	}

	public void setBureauRuleNumber(String bureauRuleNumber) {
		this.bureauRuleNumber = bureauRuleNumber;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getViewResourceId() {
		return viewResourceId;
	}

	public void setViewResourceId(String viewResourceId) {
		this.viewResourceId = viewResourceId;
	}

	public String getModifyResourceId() {
		return modifyResourceId;
	}

	public void setModifyResourceId(String modifyResourceId) {
		this.modifyResourceId = modifyResourceId;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getRequiredCondition() {
		return requiredCondition;
	}

	public void setRequiredCondition(String requiredCondition) {
		this.requiredCondition = requiredCondition;
	}

	public String getAmendablePostIssuance() {
		return amendablePostIssuance;
	}

	public void setAmendablePostIssuance(String amendablePostIssuance) {
		this.amendablePostIssuance = amendablePostIssuance;
	}

	public String getAmendablePreRenewal() {
		return amendablePreRenewal;
	}

	public void setAmendablePreRenewal(String amendablePreRenewal) {
		this.amendablePreRenewal = amendablePreRenewal;
	}

	public String getDisplayColumns() {
		return displayColumns;
	}

	public void setDisplayColumns(String displayColumns) {
		this.displayColumns = displayColumns;
	}

	public String getDisplayController() {
		return displayController;
	}

	public void setDisplayController(String displayController) {
		this.displayController = displayController;
	}

	public String getDisplayControllerTriggerRate() {
		return displayControllerTriggerRate;
	}

	public void setDisplayControllerTriggerRate(String displayControllerTriggerRate) {
		this.displayControllerTriggerRate = displayControllerTriggerRate;
	}

	public String getAuditable() {
		return auditable;
	}

	public void setAuditable(String auditable) {
		this.auditable = auditable;
	}

	public String getAuditViewOnly() {
		return auditViewOnly;
	}

	public void setAuditViewOnly(String auditViewOnly) {
		this.auditViewOnly = auditViewOnly;
	}

	public String getAuditCondition() {
		return auditCondition;
	}

	public void setAuditCondition(String auditCondition) {
		this.auditCondition = auditCondition;
	}

	public String getXslValue() {
		return xslValue;
	}

	public void setXslValue(String xslValue) {
		this.xslValue = xslValue;
	}

	public String getRefTableName() {
		return refTableName;
	}

	public void setRefTableName(String refTableName) {
		this.refTableName = refTableName;
	}

	public String getBeforeScript() {
		return beforeScript;
	}

	public void setBeforeScript(String beforeScript) {
		this.beforeScript = beforeScript;
	}

	public String getBeforeScriptData() {
		return beforeScriptData;
	}

	public void setBeforeScriptData(String beforeScriptData) {
		this.beforeScriptData = beforeScriptData;
	}

	public String getAfterScript() {
		return afterScript;
	}

	public void setAfterScript(String afterScript) {
		this.afterScript = afterScript;
	}

	public String getAfterScriptData() {
		return afterScriptData;
	}

	public void setAfterScriptData(String afterScriptData) {
		this.afterScriptData = afterScriptData;
	}

	public String getChangeScript() {
		return changeScript;
	}

	public void setChangeScript(String changeScript) {
		this.changeScript = changeScript;
	}

	public String getChangeScriptData() {
		return changeScriptData;
	}

	public void setChangeScriptData(String changeScriptData) {
		this.changeScriptData = changeScriptData;
	}

	public String getDomainTableName() {
		return domainTableName;
	}

	public void setDomainTableName(String domainTableName) {
		this.domainTableName = domainTableName;
	}

	public String getDialogFileName() {
		return dialogFileName;
	}

	public void setDialogFileName(String dialogFileName) {
		this.dialogFileName = dialogFileName;
	}

	public String getDialogFileType() {
		return dialogFileType;
	}

	public void setDialogFileType(String dialogFileType) {
		this.dialogFileType = dialogFileType;
	}

	public String getLobTabName() {
		return lobTabName;
	}

	public void setLobTabName(String lobTabName) {
		this.lobTabName = lobTabName;
	}

	public String getLobTabSequence() {
		return lobTabSequence;
	}

	public void setLobTabSequence(String lobTabSequence) {
		this.lobTabSequence = lobTabSequence;
	}

	public String getLobTabCoveragePart() {
		return lobTabCoveragePart;
	}

	public void setLobTabCoveragePart(String lobTabCoveragePart) {
		this.lobTabCoveragePart = lobTabCoveragePart;
	}

	public String getDisplayMode() {
		return displayMode;
	}

	public void setDisplayMode(String displayMode) {
		this.displayMode = displayMode;
	}

	public String getDisplayModeCondition() {
		return displayModeCondition;
	}

	public void setDisplayModeCondition(String displayModeCondition) {
		this.displayModeCondition = displayModeCondition;
	}

	public String getDisplayModeReadOnly() {
		return displayModeReadOnly;
	}

	public void setDisplayModeReadOnly(String displayModeReadOnly) {
		this.displayModeReadOnly = displayModeReadOnly;
	}

	public String getEsiTemplateFileName() {
		return esiTemplateFileName;
	}

	public void setEsiTemplateFileName(String esiTemplateFileName) {
		this.esiTemplateFileName = esiTemplateFileName;
	}

	public String getEsiLabelsDefinedInTemplate() {
		return esiLabelsDefinedInTemplate;
	}

	public void setEsiLabelsDefinedInTemplate(String esiLabelsDefinedInTemplate) {
		this.esiLabelsDefinedInTemplate = esiLabelsDefinedInTemplate;
	}

	public String getPrintRequired() {
		return printRequired;
	}

	public void setPrintRequired(String printRequired) {
		this.printRequired = printRequired;
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
