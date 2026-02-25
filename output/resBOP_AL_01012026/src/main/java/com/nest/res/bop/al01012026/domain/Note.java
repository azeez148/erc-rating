package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class Note    extends Policy  {
	private String ParentId;
	private Date Entered;
	private String CreatedBy;
	private Date Modified;
	private String NoteText;
	private Date Expiration;
	private String Severity;
	private Date Effective;
	private Date Created;
	private String NoteSubType;
	private String NoteType;
	private String VersionedId;
	private String EnteredBy;
	private String Id;
	
	
	
	
	
	
	


	public Date  getEntered() {
		return this.Entered;
	}
	public String  getEnteredBy() {
		return this.EnteredBy;
	}
	public String  getNoteText() {
		return this.NoteText;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getNoteType() {
		return this.NoteType;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public String  getNoteSubType() {
		return this.NoteSubType;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getSeverity() {
		return this.Severity;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public String  getId() {
		return this.Id;
	}
	public Date  getModified() {
		return this.Modified;
	}
	
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setNoteText(String NoteText) {
		this.NoteText = NoteText;
	}
	public void setEntered(Date Entered) {
		this.Entered = Entered;
	}
	public void setSeverity(String Severity) {
		this.Severity = Severity;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setNoteSubType(String NoteSubType) {
		this.NoteSubType = NoteSubType;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setNoteType(String NoteType) {
		this.NoteType = NoteType;
	}
	public void setEnteredBy(String EnteredBy) {
		this.EnteredBy = EnteredBy;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
}