package com.nest.erc.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.nest.erc.domain.alg.ds.Column;
import com.nest.erc.domain.alg.ds.DSWrapper;
import com.nest.erc.domain.alg.ds.Table;
import com.nest.erc.domain.alg.ds.Tables;
import com.nest.erc.domain.alg.rc.DomainTable;
import com.nest.erc.domain.alg.rc.DomainTableEntry;
import com.nest.erc.domain.alg.rc.Field;
import com.nest.erc.domain.alg.rc.Form;
import com.nest.erc.domain.alg.rc.Forms;
import com.nest.erc.domain.alg.rc.RCWrapper;
import com.nest.erc.domain.alg.rc.RateBookColumn;
import com.nest.erc.domain.alg.rc.RateBookColumns;
import com.nest.erc.domain.alg.rc.RateBookTable;
import com.nest.erc.domain.alg.rc.RateBookTables;
import com.nest.erc.domain.alg.rc.RateTable;
import com.nest.erc.domain.alg.rc.RateTableEntry;
import com.nest.erc.domain.alg.rc.Resource;
import com.nest.erc.domain.alg.rc.Script;

@Component
public class RCXmlRelationSetter implements RCXmlRelationSetterService {
	
	@Autowired
	private ERCParserProjectProperties projectProperties;	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public  RCWrapper readRcXml(String rcXMLFileName) {
		String inputFolder = projectProperties.getInputFilelocation();
		String rcFileName = inputFolder +rcXMLFileName;
        RCXmlParser rcParser = new RCXmlParser();
        RCWrapper rcWrapper= rcParser.parseXML(rcFileName);
		return rcWrapper;
	}
	/**
	 * 
	 * @param form
	 * @param rcWrapper
	 */
	@Override
	public void attachDomainTableToForm(Form form,RCWrapper rcWrapper){
		List<Field> fieldList = form.getFieldList();
		if(null!=fieldList){
			for(Field field:fieldList){
				attachDomainTableToField(field, rcWrapper);
			}
		}
		iterateForms(form, rcWrapper);
	}
	/**
	 * 
	 * @param field
	 * @param rcWrapper
	 * @return
	 */
	private Field attachDomainTableToField(Field field,RCWrapper rcWrapper){
		for(DomainTable domainTable:rcWrapper.getDomainTableList()){
			if(domainTable.getId().equals(field.getDomainTableId())){
				field.setDomainTable(domainTable);
				break;
			}
		}
		return field;
	}
	/**
	 * 
	 * @param form
	 * @param dsWrapper
	 * @return
	 */
	private Form attachTableToForm(Form form,DSWrapper dsWrapper){
		Tables tables = dsWrapper.getTables();
		Table table = tables.getTable();
		
		if(form.getTableId().equals(table.getId())){
			form.setTable(table);
		}
		iterateForms(form, table);
		
		return form;
	}
	/**
	 * 
	 * @param form
	 * @param rcWrapper
	 */
	private void iterateForms(Form form, RCWrapper rcWrapper) {
		List<Forms> formsList = form.getFormsList();
		if (formsList == null)
			return;
		for(Forms forms: formsList){
			Form childForm = forms.getForm();
			List<Field> fieldList = childForm.getFieldList();
			if(null!=fieldList){
				for(Field field:fieldList){
					attachDomainTableToField(field, rcWrapper);
				}
			}
			iterateForms(childForm, rcWrapper);
		}
	}
	/**
	 * 
	 * @param form
	 * @param table
	 */
	private void iterateChildTables(Form form, Table table) {
		List<Tables>  tablesList = table.getTablesList();
		if(null!=tablesList){
			 for(Tables childTables:tablesList){
				 Table childTable = childTables.getTable();
				 if(form.getTableId().equals(childTable.getId())){
					 form.setTable(childTable);
					 break;
				 }else{
					 iterateChildTables(form,childTable);
				 }
			 }
		}
	}
	/**
	 * 
	 * @param form
	 * @param table
	 */
	private void iterateForms(Form form, Table table){
		List<Forms> formsList = form.getFormsList();
		if(null!=formsList){
			for(Forms forms :formsList){
				Form childForm = forms.getForm();
				iterateChildTables(childForm,table);
				iterateForms(childForm,table);
			}
		}
		
	}
	/**
	 * 
	 * @param form
	 * @param dsWrapper
	 * @return
	 */
	private Form attachColumnToField(Form form,DSWrapper dsWrapper){
		Tables tables = dsWrapper.getTables();
		Table table = tables.getTable();
		List<Column> columnList = table.getColumnList();
		List<Field> fieldList = form.getFieldList();
		for(Field field:fieldList){
			for(Column column:columnList){
				if(field.getColumnId().equals(column.getId())){
					field.setColumn(column);
					break;
				}
			}
		}

		iterateFields(form, table);
		
		return form;
	}
	/**
	 * 
	 * @param form
	 * @param table
	 */
	private void iterateFields(Form form, Table table){
		List<Forms> formsList = form.getFormsList();
		if(null!=formsList){
			for(Forms forms :formsList){
				Form childForm = forms.getForm();
				List<Field> fieldList=childForm.getFieldList();
				if(null!=fieldList){
					for(Field field:fieldList){
						iterateChildColumns(field,table);
					}
				}
				iterateFields(childForm,table);
			}
		}
		
	}
	/**
	 * 
	 * @param field
	 * @param table
	 */
	
	private void iterateChildColumns(Field field, Table table) {
		List<Tables>  tablesList = table.getTablesList();
		if(null!=tablesList){
			for(Tables childTables:tablesList){
				 Table childTable = childTables.getTable();
				 List<Column> columnList = childTable.getColumnList();
				 for(Column column:columnList){
					 if(field.getColumnId().equals(column.getId())){
						 field.setColumn(column);
						 break;
					 }
				 }
				 iterateChildColumns(field,childTable);
			 }
		}
	}
	/**
	 * 
	 * @param rcWrapperCW
	 * @param rcWrapperState
	 * @return
	 */
	public RCWrapper mergeRateContent(RCWrapper rcWrapperCW,RCWrapper rcWrapperState) {
		
		//----------------test before . this can be removed after testing----------------
		testingMergeForms(rcWrapperCW);
		//-------------------------------------------------------------------------------
	
		Map<String,RateTable> rateTableMapCW = rcWrapperCW.getRateTableMap();
		Map<String,RateTable> rateTableMapState = rcWrapperState.getRateTableMap();
		
		removeDeletedRateTableEntry(rateTableMapState);
		
		for (Map.Entry<String, RateTable> entry : rateTableMapState.entrySet())
		{   
			RateTable rateTableCW = rateTableMapCW.get(entry.getKey());
			RateTable rateTableState = entry.getValue();
			//  scenario rate table entries are note present in cw
			if(null!=rateTableCW && null==rateTableCW.getRateTableEntryList() && null!=rateTableState.getRateTableEntryList()) {
				rateTableState.setAddChangeDeleteFlag("A");//new entries added
			}else if(null != rateTableState.getAddChangeDeleteFlag() && !rateTableState.getAddChangeDeleteFlag().equals("D")) {
		
				rateTableState.setAddChangeDeleteFlag("C"); // changed rate table
			}
			rateTableMapCW.put(entry.getKey(), rateTableState);
		}
		List<RateTable> rateTableList = new ArrayList<RateTable>(rateTableMapCW.values());
		rcWrapperCW.setRateTableList(rateTableList);
		
		// merging domain table
		Map<String,DomainTable> domainTableMapCW = rcWrapperCW.getDomainTableMap();
		Map<String,DomainTable> domainTableMapState = rcWrapperState.getDomainTableMap();
		
		removeDeletedDomainTableEntry(domainTableMapState);
		
		for (Map.Entry<String, DomainTable> entry : domainTableMapState.entrySet())
		{
			if((null != domainTableMapCW.get(entry.getKey()) && null == domainTableMapCW.get(entry.getKey()).getDomainTableEntryList() )&& null!=entry.getValue().getDomainTableEntryList()){
				//System.out.println(domainTableMapCW.get(entry.getKey()).getName());
			}
			domainTableMapCW.put(entry.getKey(), entry.getValue());
		}
		List<DomainTable> domainTableList = new ArrayList<DomainTable>(domainTableMapCW.values());
		rcWrapperCW.setDomainTableList(domainTableList);
		
		// merging resource list
		
		Map<String,Resource> resourceMapCW = rcWrapperCW.getResourceMap();
		Map<String,Resource> resourceMapState = rcWrapperState.getResourceMap();
		for (Map.Entry<String, Resource> entry : resourceMapState.entrySet())
		{
			resourceMapCW.put(entry.getKey(), entry.getValue());
		}
		List<Resource> resourceList = new ArrayList<Resource>(resourceMapCW.values());
		rcWrapperCW.setResourceList(resourceList);
		
		//merging script list
		
		Map<String,Script> scriptMapCW = rcWrapperCW.getScriptMap();
		Map<String,Script> scriptMapState = rcWrapperState.getScriptMap();
		for (Map.Entry<String, Script> entry : scriptMapState.entrySet())
		{
			scriptMapCW.put(entry.getKey(), entry.getValue());
		}
		List<Script> scriptList = new ArrayList<Script>(scriptMapCW.values());
		rcWrapperCW.setScriptList(scriptList);
		
		
		// merging ratebookTables
		
		RateBookTables rateBookTablesCW = rcWrapperCW.getRatebookTables();
		RateBookTables rateBookTablesState = rcWrapperState.getRatebookTables();
		Map<String, RateBookTable> rateBookTablesStateMap = rateBookTablesState.getRateBookTableMap();
		Map<String, RateBookTable> rateBookTablesCWMap = rateBookTablesCW.getRateBookTableMap();
		
		
		for (Map.Entry<String, RateBookTable> entry : rateBookTablesStateMap.entrySet())
		{
			rateBookTablesCWMap.put(entry.getKey(), entry.getValue());
		}
		
		removeDeletedRateBookTable(rateBookTablesCWMap);
		
		List<RateBookTable> rateBookTableList = new ArrayList<RateBookTable>(rateBookTablesCWMap.values());
		rateBookTablesCW.setRateBookTableList(rateBookTableList);
		rcWrapperCW.setRatebookTables(rateBookTablesCW);
		
		//merging ratebook columns
		
		RateBookColumns rateBookColumnsCW = rcWrapperCW.getRateBookColumns();
		RateBookColumns rateBookColumnsState = rcWrapperState.getRateBookColumns();
		Map<String, RateBookColumn> rateBookColumnsStateMap = rateBookColumnsState.getRateBookColumnsMap();
		Map<String, RateBookColumn> rateBookColumnsCWMap = rateBookColumnsCW.getRateBookColumnsMap();
						
		for (Map.Entry<String, RateBookColumn> entry : rateBookColumnsStateMap.entrySet())
		{
			rateBookColumnsCWMap.put(entry.getKey(), entry.getValue());
		}
		removeDeletedRateBookColumn(rateBookColumnsCWMap);
		
		List<RateBookColumn> rateBookColumnList = new ArrayList<RateBookColumn>(rateBookColumnsCWMap.values());
		rateBookColumnsCW.setRateBookColumns(rateBookColumnList);
		rcWrapperCW.setRateBookColumns(rateBookColumnsCW);
		

		List<Forms> formsCWList = rcWrapperCW.getFormsList();
		List<Forms> formsStateList = rcWrapperState.getFormsList();
		for(Forms formsState:formsStateList) {
			iterateCWForms(formsCWList.get(0), formsState);
		}
		
		//----------------test after . this can be removed after testing----------------
		
		rcWrapperCW.setScriptList(null);
		testingMergeForms(rcWrapperCW);
		//------------------------------------------------------------------------------
				
		return rcWrapperCW;
	}
	private void removeDeletedRateTableEntry(Map<String, RateTable> rateTableMapState) {
		for (Map.Entry<String, RateTable> entry : rateTableMapState.entrySet())
		{
			RateTable rateTable = entry.getValue();
			List<RateTableEntry> rateTableEntryList = rateTable.getRateTableEntryList();
			int entryCount = rateTableEntryList.size();
			int deletedEntryCount = 0;
			if(null!=rateTableEntryList) {
				Iterator<RateTableEntry> it = rateTableEntryList.iterator();
				while (it.hasNext()) {
					RateTableEntry rateTableEntry = it.next();
					if(null!=rateTableEntry.getAddChangeDeleteFlag() && rateTableEntry.getAddChangeDeleteFlag().equals("D")) {
						it.remove();
						deletedEntryCount = deletedEntryCount + 1;
					}
				}	
			}
			if(deletedEntryCount == entryCount) {
				rateTable.setAddChangeDeleteFlag("D");
			}
		}
	}
	private void removeDeletedDomainTableEntry(Map<String, DomainTable> domainTableMapState) {
		for (Map.Entry<String, DomainTable> entry : domainTableMapState.entrySet())
		{
			DomainTable domainTable = entry.getValue();
			List<DomainTableEntry> domainTableEntryList = domainTable.getDomainTableEntryList();
			if(domainTableEntryList != null) {
				Iterator<DomainTableEntry> it = domainTableEntryList.iterator();
				while (it.hasNext()) {
					DomainTableEntry domainTableEntry = it.next();
					if(null!=domainTableEntry.getAddChangeDeleteFlag() && domainTableEntry.getAddChangeDeleteFlag().equals("D")) {
						it.remove();
					}
				}	
			}
		}
	}
	private void removeDeletedRateBookTable(Map<String, RateBookTable> rateBookTablesCWMap) {
		Iterator<Map.Entry<String, RateBookTable>> it = rateBookTablesCWMap.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<String, RateBookTable> entry = it.next();
		    RateBookTable rateBookTable = entry.getValue();
		    if(null!=rateBookTable.getAddChangeDeleteFlag() && rateBookTable.getAddChangeDeleteFlag().equals("D")) {
				it.remove();
			}
		}
		
	}
	private void removeDeletedRateBookColumn(Map<String, RateBookColumn> rateBookCoulmnCW) {
		
		Iterator<Map.Entry<String, RateBookColumn>> it = rateBookCoulmnCW.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<String, RateBookColumn> entry = it.next();
		    RateBookColumn rateBookcolumn = entry.getValue();
		    if(null!=rateBookcolumn.getAddChangeDeleteFlag() && rateBookcolumn.getAddChangeDeleteFlag().equals("D")) {
		    	it.remove();
			}
		}
		
	}
	
	private void testingMergeForms(RCWrapper rcWrapperCW) {
		List<DomainTable> domainTableList = rcWrapperCW.getDomainTableList();
		for(DomainTable domainTable:domainTableList) {
			List<DomainTableEntry> domainTableEntryList = domainTable.getDomainTableEntryList();
			if(null!=domainTableEntryList) {
				for(DomainTableEntry domainTableEntry:domainTableEntryList) {
					if(domainTableEntry.getDataValue().equals("")) {
						//System.out.println("here");
					}
				}
			}
			
		}
		
		List<RateTable> rateTableList = rcWrapperCW.getRateTableList();
		for(RateTable rateTable:rateTableList) {
			List<RateTableEntry> rateTableEntryList = rateTable.getRateTableEntryList();
			if(rateTable.getName().equals("PharmacistsBroadIncrLimitFactor"))
			if(null!=rateTableEntryList) {
			}
			
		}
		
		
		// testing ratebook columns
		Iterator<Map.Entry<String, RateBookColumn>> it = rcWrapperCW.getRateBookColumns().getRateBookColumnsMap().entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<String, RateBookColumn> entry = it.next();
		    RateBookColumn rateBookTable = entry.getValue();
		    if(null!=rateBookTable.getColumnName()&& rateBookTable.getColumnName().equals("GrossSales")) {
			}
		}
		
		List<Forms> formsCWList = rcWrapperCW.getFormsList();
		List<Forms> formList = formsCWList.get(0).getForm().getFormsList();
		for(Forms forms:formList) {
			Form formCWChild = forms.getForm();
			if(formCWChild.getTableName().equals("BOPALChanges")) { //new form in AL
			}
			if(formCWChild.getTableName().equals("BOPPharmacistsBroadCov")) { // deleted form in AL
			}
		}
		
		testInnerFormField(formsCWList.get(0));
		
	}
	
	private void testInnerFormField(Forms formsCW) {
		Form formCW = formsCW.getForm();
		List<Field> fieldList = formCW.getFieldList();
		if(null!=fieldList) {
			for(Field field:fieldList) {
				if(field.getColumnName().equals("WindstormMitigationDiscountApplies")) { // new field in AL building detail
				}
				if(field.getColumnName().equals("RatingTerritory")) { // new field in AL building detail
				}
			}
		}
		if(null!=formCW.getFormsList()) {
			for(Forms forms:formCW.getFormsList()) {
				testInnerFormField(forms);   
			}
		}
		
	}
	
	private void iterateCWForms(Forms formsCW, Forms formsState) {
		Form formState = formsState.getForm();
		Form formCW = formsCW.getForm();
		if (formCW.getName().equals(formState.getParentName()) || formCW.getName().equals(formState.getName())) {
			iterateFormsState(formsCW,formState);
			return;
		}
		if(null!=formCW.getFormsList()) {
			for(Forms forms:formCW.getFormsList()) {
				iterateCWForms(forms, formsState);   
			}
		}
		
	}
	
	private void iterateFormsState(Forms formsCW, Form formState ) {
		Form formCW = formsCW.getForm();
		if(formState.getTableName().equals(formCW.getTableName()) && formState.getType().equals(formCW.getType())) {
			copyFormAttributes(formState, formsCW);
		}else {
			List<Forms> formsList = formCW.getFormsList();
			Iterator<Forms> it = formsList.iterator();
			boolean newForm = true;
			while (it.hasNext()) {
				Forms forms = it.next();
				Form formCWChild = forms.getForm();
				if(formState.getTableName().equals(formCWChild.getTableName()) && formState.getType().equals(formCWChild.getType())) {
	//				if(null!=formState.getAddChangeDeleteFlag() && formState.getAddChangeDeleteFlag().equals("D")) {
	//					formCWChild.setAfterScript("yes");
	//					formsList.remove(forms);
	//					newForm = false;
	//					break;
	//				}
					copyFormAttributes(formState, forms);
					newForm = false;
					break;
				}
			}	
			if(newForm) {
				Forms newForms = new Forms();
				newForms.setForm(formState);
				formCW.getFormsList().add(newForms);
			}
		
		}
	}
	
	private void copyFormAttributes(Form formState, Forms formsCW) {
		Form formCW = formsCW.getForm();
		formCW.setType(formState.getType()); 
		formCW.setSequence(formState.getSequence());
		formCW.setSubSequence(formState.getSubSequence());
		formCW.setAddChangeDeleteFlag(formState.getAddChangeDeleteFlag());
		formCW.setName(formState.getName());
		formCW.setParentName(formState.getParentName());
		formCW.setHidePremium(formState.getHidePremium());
		formCW.setCondition(formState.getCondition());
		formCW.setNumber(formState.getNumber());
		formCW.setTreeItemLabel(formState.getTreeItemLabel());
		formCW.setTreeItemHoverText(formState.getTreeItemHoverText());
		formCW.setMinOccurs(formState.getMinOccurs());
		formCW.setMaxOccurs(formState.getMaxOccurs());
		formCW.setBureauRuleNumber(formState.getBureauRuleNumber());
		formCW.setComment(formState.getComment());
		formCW.setTemplateFile(formState.getTemplateFile());
		formCW.setHidden(formState.getHidden());
		formCW.setTabCondition(formState.getTabCondition());
		formCW.setTabResourceName(formState.getTabResourceName());
		formCW.setBtnResAdd(formState.getBtnResAdd());
		formCW.setBtnCndAdd(formState.getBtnCndAdd());
		formCW.setBtnLblAdd(formState.getBtnLblAdd());
		formCW.setBtnResModify(formState.getBtnResModify());
		formCW.setBtnCndModify(formState.getBtnResModify());
		formCW.setBtnLblModify(formState.getBtnResModify());
		formCW.setBtnResDelete(formState.getBtnResDelete());
		formCW.setBtnCndDelete(formState.getBtnCndDelete());
		formCW.setBtnLblDelete(formState.getBtnLblDelete());
		formCW.setBtnResViewDetail(formState.getBtnResViewDetail());
		formCW.setBtnCndViewDetail(formState.getBtnCndViewDetail());
		formCW.setBtnLblViewDetail(formState.getBtnLblViewDetail());
		formCW.setBtnResCopy(formState.getBtnResCopy());
		formCW.setBtnCndCopy(formState.getBtnCndCopy());
		formCW.setBtnLblCopy(formState.getBtnLblCopy());
		formCW.setBtnResRenumber(formState.getBtnResRenumber());
		formCW.setBtnCndRenumber(formState.getBtnCndRenumber());
		formCW.setBtnLblRenumber(formState.getBtnLblRenumber());
		formCW.setBtnResView(formState.getBtnResView());
		formCW.setBtnCndView(formState.getBtnCndView());
		formCW.setBtnLblView(formState.getBtnLblView());
		formCW.setBeforeScript(formState.getBeforeScript());
		formCW.setBeforeScriptData(formState.getBeforeScriptData());
		formCW.setAfterScript(formState.getAfterScript());
		formCW.setAfterScriptData(formState.getAfterScriptData());
		formCW.setDisplayMode(formState.getDisplayMode());
		formCW.setDisplayModeCondition(formState.getDisplayModeCondition());
		formCW.setCombineWithDetail(formState.getCombineWithDetail());
		formCW.setBackToTop(formState.getBackToTop());
		formCW.setBackToTopLbl(formState.getBackToTopLbl());
		formCW.setAttachmentCondition(formState.getAttachmentCondition());
		formCW.setAttachmentXPath(formState.getAttachmentXPath());
		formCW.setAttachmentSequence(formState.getAttachmentSequence());
		formCW.setVariable(formState.getVariable());
		formCW.setScheduled(formState.getScheduled());
		
		List<Field> fieldList = formState.getFieldList();
		if(null!=fieldList) {
			for(Field field:fieldList) {
				setCWFields(field,formCW.getFieldList());
			}
		}
		List<Forms> formsList = formState.getFormsList();
		if(null!=formsList) {
			for(Forms forms:formsList){
				iterateCWForms(formsCW, forms);
				
			}
		}
		return;
	}
	
	public void setCWFields(Field fieldState, List<Field> fieldListCW) {
		Iterator<Field> it = fieldListCW.iterator();
		boolean newField = true;
		while (it.hasNext()) {
			Field fieldCW = it.next();
			if(fieldState.getColumnName().equals(fieldCW.getColumnName())) {
			//if(fieldState.getAddChangeDeleteFlag().equals("D")) {
				//System.out.println("here");
//					fieldListCW.remove(fieldCW);
//					newField = false;
//					break;
			//}
//				else {
				BeanUtils.copyProperties(fieldState, fieldCW);
				newField = false;
				break;
				//}
			}
		}
		if(newField) {
			fieldListCW.add(fieldState);
		}

	}
}
