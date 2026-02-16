package com.nest.erc.domain.alg.rc;

import java.io.Serializable;
import java.util.Map;

import com.nest.erc.domain.alg.XmlConstruct;

public class RateBook implements XmlConstruct, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6952007752980300548L;
	String id;
	WorkBook workBook;
	String workbookId;
	RateBook parentRatebook;
	String title;
	String newBusinessEffective;
	String newBusinessExpiration;
	String renewalEffective;
	String renewalExpiration;
	String published;
	String released;
	String autoPublish;
	String maxTabsPerLine;
	String ratingProviderProgID;
	String assemblyName;
	String exclusion;
	String comment;
	String priorId;
	String revision;
	String coveragePartsSequence;
	String visualStudioVersion;
	String pdrForms;
	String pdrRating;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public WorkBook getWorkBook() {
		return workBook;
	}


	public void setWorkBook(WorkBook workBook) {
		this.workBook = workBook;
	}


	public String getWorkbookId() {
		return workbookId;
	}


	public void setWorkbookId(String workbookId) {
		this.workbookId = workbookId;
	}


	public RateBook getParentRatebook() {
		return parentRatebook;
	}


	public void setParentRatebook(RateBook parentRatebook) {
		this.parentRatebook = parentRatebook;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getNewBusinessEffective() {
		return newBusinessEffective;
	}


	public void setNewBusinessEffective(String newBusinessEffective) {
		this.newBusinessEffective = newBusinessEffective;
	}


	public String getNewBusinessExpiration() {
		return newBusinessExpiration;
	}


	public void setNewBusinessExpiration(String newBusinessExpiration) {
		this.newBusinessExpiration = newBusinessExpiration;
	}


	public String getRenewalEffective() {
		return renewalEffective;
	}


	public void setRenewalEffective(String renewalEffective) {
		this.renewalEffective = renewalEffective;
	}


	public String getRenewalExpiration() {
		return renewalExpiration;
	}


	public void setRenewalExpiration(String renewalExpiration) {
		this.renewalExpiration = renewalExpiration;
	}


	public String getPublished() {
		return published;
	}


	public void setPublished(String published) {
		this.published = published;
	}


	public String getReleased() {
		return released;
	}


	public void setReleased(String released) {
		this.released = released;
	}


	public String getAutoPublish() {
		return autoPublish;
	}


	public void setAutoPublish(String autoPublish) {
		this.autoPublish = autoPublish;
	}


	public String getMaxTabsPerLine() {
		return maxTabsPerLine;
	}


	public void setMaxTabsPerLine(String maxTabsPerLine) {
		this.maxTabsPerLine = maxTabsPerLine;
	}


	public String getRatingProviderProgID() {
		return ratingProviderProgID;
	}


	public void setRatingProviderProgID(String ratingProviderProgID) {
		this.ratingProviderProgID = ratingProviderProgID;
	}


	public String getAssemblyName() {
		return assemblyName;
	}


	public void setAssemblyName(String assemblyName) {
		this.assemblyName = assemblyName;
	}


	public String getExclusion() {
		return exclusion;
	}


	public void setExclusion(String exclusion) {
		this.exclusion = exclusion;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getPriorId() {
		return priorId;
	}


	public void setPriorId(String priorId) {
		this.priorId = priorId;
	}


	public String getRevision() {
		return revision;
	}


	public void setRevision(String revision) {
		this.revision = revision;
	}


	public String getCoveragePartsSequence() {
		return coveragePartsSequence;
	}


	public void setCoveragePartsSequence(String coveragePartsSequence) {
		this.coveragePartsSequence = coveragePartsSequence;
	}


	public String getVisualStudioVersion() {
		return visualStudioVersion;
	}


	public void setVisualStudioVersion(String visualStudioVersion) {
		this.visualStudioVersion = visualStudioVersion;
	}


	public String getPdrForms() {
		return pdrForms;
	}


	public void setPdrForms(String pdrForms) {
		this.pdrForms = pdrForms;
	}


	public String getPdrRating() {
		return pdrRating;
	}


	public void setPdrRating(String pdrRating) {
		this.pdrRating = pdrRating;
	}


	public void addChildren(XmlConstruct xmlConstruct) {
		this.setParentRatebook((RateBook)xmlConstruct);
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
