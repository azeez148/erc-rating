package com.nest.erc.domain.alg.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;
import com.nest.erc.domain.alg.alg.inter.HasExecutable;
import com.nest.erc.domain.alg.alg.inter.RatingExecutable;

/**
 * Class for storing the information of then element
 * @author
 *
 */
public class ThenPart extends XmlElement implements XmlConstruct, HasExecutable{
	List<RatingExecutable> statementsInThen;
	private List<AttachStatement> AttachStatements;
	private List<OptOutForm> OptOutForms;

	public List<RatingExecutable> getStatementsInThen() {
		return statementsInThen;
	}

	public void setStatementsInThen(List<RatingExecutable> statementsInThen) {
		this.statementsInThen = statementsInThen;
	}
	
	
	

	public  void addChildren(XmlConstruct xmlConstruct) {
		if(xmlConstruct instanceof RatingExecutable) {
		if (this.getStatementsInThen() == null) {
			this.setStatementsInThen(new ArrayList<RatingExecutable>());
		}
		xmlConstruct.setParent(this);
		this.getStatementsInThen().add((RatingExecutable)xmlConstruct);
		}
		
		if(xmlConstruct instanceof AttachStatement) {
			if (this.getAttachStatements() == null) {
				this.setAttachStatements(new ArrayList<AttachStatement>());
			}
			xmlConstruct.setParent(this);
			this.getAttachStatements().add((AttachStatement)xmlConstruct);
		}
if(xmlConstruct instanceof OptOutForm) {
			if (this.getOptOutForms() == null) {
				this.setOptOutForms(new ArrayList<OptOutForm>());
			}
			xmlConstruct.setParent(this);
			this.getOptOutForms().add((OptOutForm)xmlConstruct);
		}
		
		/*
		if(this.getStatementsInThen().size() > 0) {
			xmlConstruct.setPreviousSibling((XmlConstruct)this.getStatementsInThen().get(this.getStatementsInThen().size()-1));
			this.getStatementsInThen().get(this.getStatementsInThen().size()-1).setNextSibling(xmlConstruct);
		}*/
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
	
	public void setAllAttribute(String elementName,Map<String, String> attribs) {
		this.setElementName(elementName);
	}

	public List<RatingExecutable> getExecutables() {
		return statementsInThen;
	}

}
