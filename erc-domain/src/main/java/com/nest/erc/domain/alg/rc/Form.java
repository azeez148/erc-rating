package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.ds.Table;

public class Form implements XmlConstruct,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2151141049683949692L;
	String id;
	RateBook rateBook;
	Table table;
	String rateBookId;
	String tableId;
	String tableName;
	String type;
	String sequence;
	String subSequence;
	String addChangeDeleteFlag;
	String name;
	String parentName;
	String hidePremium;
	String condition;
	String number;
	String treeItemLabel;
	String treeItemHoverText;
	String minOccurs;
	String maxOccurs;
	String bureauRuleNumber;
	String comment;
	String templateFile;
	String hidden;
	String tabCondition;
	String tabResourceName;
	String btnResAdd;
	String btnCndAdd;
	String btnLblAdd;
	String btnResModify;
	String btnCndModify;
	String btnLblModify;
	String btnResDelete;
	String btnCndDelete;
	String btnLblDelete;
	String btnResViewDetail;
	String btnCndViewDetail;
	String btnLblViewDetail;
	String btnResCopy;
	String btnCndCopy;
	String btnLblCopy;
	String btnResRenumber;
	String btnCndRenumber;
	String btnLblRenumber;
	String btnResView;
	String btnCndView;
	String btnLblView;
	String beforeScript;
	String beforeScriptData;
	String afterScript;
	String afterScriptData;
	String displayMode;
	String displayModeCondition;
	String combineWithDetail;
	String backToTop;
	String backToTopLbl;
	String attachmentCondition;
	String attachmentXPath;
	String attachmentSequence;
	String variable;
	String scheduled;
	List<Field>fieldList;
	List<Forms>formsList;
	Map<String,Field> fieldMap = new HashMap<String, Field>();
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RateBook getRateBook() {
		return rateBook;
	}

	public void setRateBook(RateBook rateBook) {
		this.rateBook = rateBook;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public String getRateBookId() {
		return rateBookId;
	}

	public void setRateBookId(String rateBookId) {
		this.rateBookId = rateBookId;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getSubSequence() {
		return subSequence;
	}

	public void setSubSequence(String subSequence) {
		this.subSequence = subSequence;
	}

	public String getAddChangeDeleteFlag() {
		return addChangeDeleteFlag;
	}

	public void setAddChangeDeleteFlag(String addChangeDeleteFlag) {
		this.addChangeDeleteFlag = addChangeDeleteFlag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getHidePremium() {
		return hidePremium;
	}

	public void setHidePremium(String hidePremium) {
		this.hidePremium = hidePremium;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTreeItemLabel() {
		return treeItemLabel;
	}

	public void setTreeItemLabel(String treeItemLabel) {
		this.treeItemLabel = treeItemLabel;
	}

	public String getTreeItemHoverText() {
		return treeItemHoverText;
	}

	public void setTreeItemHoverText(String treeItemHoverText) {
		this.treeItemHoverText = treeItemHoverText;
	}

	public String getMinOccurs() {
		return minOccurs;
	}

	public void setMinOccurs(String minOccurs) {
		this.minOccurs = minOccurs;
	}

	public String getMaxOccurs() {
		return maxOccurs;
	}

	public void setMaxOccurs(String maxOccurs) {
		this.maxOccurs = maxOccurs;
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

	public String getTemplateFile() {
		return templateFile;
	}

	public void setTemplateFile(String templateFile) {
		this.templateFile = templateFile;
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getTabCondition() {
		return tabCondition;
	}

	public void setTabCondition(String tabCondition) {
		this.tabCondition = tabCondition;
	}

	public String getTabResourceName() {
		return tabResourceName;
	}

	public void setTabResourceName(String tabResourceName) {
		this.tabResourceName = tabResourceName;
	}

	public String getBtnResAdd() {
		return btnResAdd;
	}

	public void setBtnResAdd(String btnResAdd) {
		this.btnResAdd = btnResAdd;
	}

	public String getBtnCndAdd() {
		return btnCndAdd;
	}

	public void setBtnCndAdd(String btnCndAdd) {
		this.btnCndAdd = btnCndAdd;
	}

	public String getBtnLblAdd() {
		return btnLblAdd;
	}

	public void setBtnLblAdd(String btnLblAdd) {
		this.btnLblAdd = btnLblAdd;
	}

	public String getBtnResModify() {
		return btnResModify;
	}

	public void setBtnResModify(String btnResModify) {
		this.btnResModify = btnResModify;
	}

	public String getBtnCndModify() {
		return btnCndModify;
	}

	public void setBtnCndModify(String btnCndModify) {
		this.btnCndModify = btnCndModify;
	}

	public String getBtnLblModify() {
		return btnLblModify;
	}

	public void setBtnLblModify(String btnLblModify) {
		this.btnLblModify = btnLblModify;
	}

	public String getBtnResDelete() {
		return btnResDelete;
	}

	public void setBtnResDelete(String btnResDelete) {
		this.btnResDelete = btnResDelete;
	}

	public String getBtnCndDelete() {
		return btnCndDelete;
	}

	public void setBtnCndDelete(String btnCndDelete) {
		this.btnCndDelete = btnCndDelete;
	}

	public String getBtnLblDelete() {
		return btnLblDelete;
	}

	public void setBtnLblDelete(String btnLblDelete) {
		this.btnLblDelete = btnLblDelete;
	}

	public String getBtnResViewDetail() {
		return btnResViewDetail;
	}

	public void setBtnResViewDetail(String btnResViewDetail) {
		this.btnResViewDetail = btnResViewDetail;
	}

	public String getBtnCndViewDetail() {
		return btnCndViewDetail;
	}

	public void setBtnCndViewDetail(String btnCndViewDetail) {
		this.btnCndViewDetail = btnCndViewDetail;
	}

	public String getBtnLblViewDetail() {
		return btnLblViewDetail;
	}

	public void setBtnLblViewDetail(String btnLblViewDetail) {
		this.btnLblViewDetail = btnLblViewDetail;
	}

	public String getBtnResCopy() {
		return btnResCopy;
	}

	public void setBtnResCopy(String btnResCopy) {
		this.btnResCopy = btnResCopy;
	}

	public String getBtnCndCopy() {
		return btnCndCopy;
	}

	public void setBtnCndCopy(String btnCndCopy) {
		this.btnCndCopy = btnCndCopy;
	}

	public String getBtnLblCopy() {
		return btnLblCopy;
	}

	public void setBtnLblCopy(String btnLblCopy) {
		this.btnLblCopy = btnLblCopy;
	}

	public String getBtnResRenumber() {
		return btnResRenumber;
	}

	public void setBtnResRenumber(String btnResRenumber) {
		this.btnResRenumber = btnResRenumber;
	}

	public String getBtnCndRenumber() {
		return btnCndRenumber;
	}

	public void setBtnCndRenumber(String btnCndRenumber) {
		this.btnCndRenumber = btnCndRenumber;
	}

	public String getBtnLblRenumber() {
		return btnLblRenumber;
	}

	public void setBtnLblRenumber(String btnLblRenumber) {
		this.btnLblRenumber = btnLblRenumber;
	}

	public String getBtnResView() {
		return btnResView;
	}

	public void setBtnResView(String btnResView) {
		this.btnResView = btnResView;
	}

	public String getBtnCndView() {
		return btnCndView;
	}

	public void setBtnCndView(String btnCndView) {
		this.btnCndView = btnCndView;
	}

	public String getBtnLblView() {
		return btnLblView;
	}

	public void setBtnLblView(String btnLblView) {
		this.btnLblView = btnLblView;
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

	public String getCombineWithDetail() {
		return combineWithDetail;
	}

	public void setCombineWithDetail(String combineWithDetail) {
		this.combineWithDetail = combineWithDetail;
	}

	public String getBackToTop() {
		return backToTop;
	}

	public void setBackToTop(String backToTop) {
		this.backToTop = backToTop;
	}

	public String getBackToTopLbl() {
		return backToTopLbl;
	}

	public void setBackToTopLbl(String backToTopLbl) {
		this.backToTopLbl = backToTopLbl;
	}

	public String getAttachmentCondition() {
		return attachmentCondition;
	}

	public void setAttachmentCondition(String attachmentCondition) {
		this.attachmentCondition = attachmentCondition;
	}

	public String getAttachmentXPath() {
		return attachmentXPath;
	}

	public void setAttachmentXPath(String attachmentXPath) {
		this.attachmentXPath = attachmentXPath;
	}

	public String getAttachmentSequence() {
		return attachmentSequence;
	}

	public void setAttachmentSequence(String attachmentSequence) {
		this.attachmentSequence = attachmentSequence;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getScheduled() {
		return scheduled;
	}

	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

	public List<Forms> getFormsList() {
		return formsList;
	}

	public void setFormsList(List<Forms> formsList) {
		this.formsList = formsList;
	}
	
	public Map<String, Field> getFieldMap() {
		return fieldMap;
	}

	public void setFieldMap(Map<String, Field> fieldMap) {
		this.fieldMap = fieldMap;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof Field){
			if (this.getFieldList()== null) {
				this.setFieldList(new ArrayList<Field>());
			}
			xmlConstruct.setParent(this);
			this.getFieldList().add((Field)xmlConstruct);
		}
		if(xmlConstruct instanceof Forms){
			if (this.getFormsList()== null) {
				this.setFormsList(new ArrayList<Forms>());
			}
			xmlConstruct.setParent(this);
			this.getFormsList().add((Forms)xmlConstruct);
		}
		
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
