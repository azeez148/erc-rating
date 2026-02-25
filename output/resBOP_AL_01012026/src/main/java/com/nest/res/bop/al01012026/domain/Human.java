package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class Human    extends Policy  {
	private Date Modified;
	private String CreatedBy;
	private String FirstName;
	private Date Expiration;
	private String Prefix;
	private String Gender;
	private String MiddleName;
	private String HighNetWorth;
	private Date Effective;
	private Date Created;
	private String MaritalStatus;
	private String Suffix;
	private String Identifier;
	private String Number;
	private String SocialSecurity;
	private String VersionedId;
	private String ContactPreference;
	private String LastName;
	private String Id;
	private Date BirthDate;
	
	
	
	
	
	
	


	public String  getSocialSecurity() {
		return this.SocialSecurity;
	}
	public String  getIdentifier() {
		return this.Identifier;
	}
	public String  getFirstName() {
		return this.FirstName;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getPrefix() {
		return this.Prefix;
	}
	public String  getContactPreference() {
		return this.ContactPreference;
	}
	public Date  getBirthDate() {
		return this.BirthDate;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public String  getHighNetWorth() {
		return this.HighNetWorth;
	}
	public String  getMiddleName() {
		return this.MiddleName;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public String  getSuffix() {
		return this.Suffix;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getLastName() {
		return this.LastName;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public String  getNumber() {
		return this.Number;
	}
	public String  getId() {
		return this.Id;
	}
	public Date  getModified() {
		return this.Modified;
	}
	public String  getMaritalStatus() {
		return this.MaritalStatus;
	}
	public String  getGender() {
		return this.Gender;
	}
	
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setHighNetWorth(String HighNetWorth) {
		this.HighNetWorth = HighNetWorth;
	}
	public void setBirthDate(Date BirthDate) {
		this.BirthDate = BirthDate;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setPrefix(String Prefix) {
		this.Prefix = Prefix;
	}
	public void setSuffix(String Suffix) {
		this.Suffix = Suffix;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setIdentifier(String Identifier) {
		this.Identifier = Identifier;
	}
	public void setNumber(String Number) {
		this.Number = Number;
	}
	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public void setSocialSecurity(String SocialSecurity) {
		this.SocialSecurity = SocialSecurity;
	}
	public void setContactPreference(String ContactPreference) {
		this.ContactPreference = ContactPreference;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public void setMaritalStatus(String MaritalStatus) {
		this.MaritalStatus = MaritalStatus;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
}