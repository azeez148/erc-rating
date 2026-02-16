package com.nest.erc.domain.alg.impl.executable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;
import com.nest.erc.domain.alg.impl.AttachStatement;
import com.nest.erc.domain.alg.impl.Condition;
import com.nest.erc.domain.alg.impl.ElsePart;
import com.nest.erc.domain.alg.impl.OptOutForm;
import com.nest.erc.domain.alg.impl.ThenPart;
import com.nest.erc.domain.alg.impl.XmlElement;

public class IfAndElse extends XmlElement implements RatingExecutable {
	private String state;
	private String recordType;
	private String excelSheet;
	private int excelRow;

	Condition condition;
	ThenPart thenPart;
	ElsePart elsePart;

	private List<AttachStatement> AttachStatements;
	private List<OptOutForm> OptOutForms;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public ThenPart getThenPart() {
		return thenPart;
	}

	public void setThenPart(ThenPart thenPart) {
		this.thenPart = thenPart;
	}

	public ElsePart getElsePart() {
		return elsePart;
	}

	public void setElsePart(ElsePart elsePart) {
		this.elsePart = elsePart;
	}

	public void addChildren(XmlConstruct xmlConstruct) {
		if (xmlConstruct instanceof Condition) {
			this.setCondition((Condition) xmlConstruct);
			xmlConstruct.setParent(this);
		} else if (xmlConstruct instanceof ElsePart) {
			this.setElsePart((ElsePart) xmlConstruct);
			xmlConstruct.setParent(this);
		} else if (xmlConstruct instanceof ThenPart) {
			this.setThenPart((ThenPart) xmlConstruct);
			xmlConstruct.setParent(this);
		} else if (xmlConstruct instanceof AttachStatement) {
			if (this.getAttachStatements() == null) {
				this.setAttachStatements(new ArrayList<AttachStatement>());
			}
			xmlConstruct.setParent(this);
			this.getAttachStatements().add((AttachStatement) xmlConstruct);
		} else if (xmlConstruct instanceof OptOutForm) {
			if (this.getOptOutForms() == null) {
				this.setOptOutForms(new ArrayList<OptOutForm>());
			}
			xmlConstruct.setParent(this);
			this.getOptOutForms().add((OptOutForm) xmlConstruct);
		}

	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getExcelSheet() {
		return excelSheet;
	}

	public void setExcelSheet(String excelSheet) {
		this.excelSheet = excelSheet;
	}

	public int getExcelRow() {
		return excelRow;
	}

	public void setExcelRow(int excelRow) {
		this.excelRow = excelRow;
	}

	public List<AttachStatement> getAttachStatements() {
		return AttachStatements;
	}

	public void setAttachStatements(List<AttachStatement> attachStatements) {
		AttachStatements = attachStatements;
	}

	public List<OptOutForm> getOptOutForms() {
		return OptOutForms;
	}

	public void setOptOutForms(List<OptOutForm> optOutForms) {
		OptOutForms = optOutForms;
	}
	
	public void setAllAttribute(String elementName, Map<String, String> attribs) {
		this.setElementName(elementName);
		this.setState(attribs.getOrDefault("state",null));
		this.setRecordType(attribs.getOrDefault("recordType",null));
		this.setExcelSheet(attribs.getOrDefault("excelSheet",null));
		this.setExcelRow(Integer.parseInt(attribs.getOrDefault("excelRow",null)));
	}
}
