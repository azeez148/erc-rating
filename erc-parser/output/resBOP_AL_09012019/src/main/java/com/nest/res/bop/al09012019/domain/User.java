package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class User    extends Policy  {
	private int Active;
	private String CompanyId;
	private int Attempts;
	private String Hint;
	private Date LastLogin;
	private int MailDiaryNotification;
	private String Encword;
	private String ReferralRoutingId;
	private String Id;
	private int UserStatus;
	private String HumanId;
	private String Name;
	
	
	
	
	
	
	


	public String  getHint() {
		return this.Hint;
	}
	public int  getMailDiaryNotification() {
		return this.MailDiaryNotification;
	}
	public String  getHumanId() {
		return this.HumanId;
	}
	public String  getCompanyId() {
		return this.CompanyId;
	}
	public String  getName() {
		return this.Name;
	}
	public int  getAttempts() {
		return this.Attempts;
	}
	public int  getUserStatus() {
		return this.UserStatus;
	}
	public Date  getLastLogin() {
		return this.LastLogin;
	}
	public int  getActive() {
		return this.Active;
	}
	public String  getEncword() {
		return this.Encword;
	}
	public String  getReferralRoutingId() {
		return this.ReferralRoutingId;
	}
	public String  getId() {
		return this.Id;
	}
	
	public void setMailDiaryNotification(int MailDiaryNotification) {
		this.MailDiaryNotification = MailDiaryNotification;
	}
	public void setReferralRoutingId(String ReferralRoutingId) {
		this.ReferralRoutingId = ReferralRoutingId;
	}
	public void setEncword(String Encword) {
		this.Encword = Encword;
	}
	public void setAttempts(int Attempts) {
		this.Attempts = Attempts;
	}
	public void setUserStatus(int UserStatus) {
		this.UserStatus = UserStatus;
	}
	public void setActive(int Active) {
		this.Active = Active;
	}
	public void setLastLogin(Date LastLogin) {
		this.LastLogin = LastLogin;
	}
	public void setCompanyId(String CompanyId) {
		this.CompanyId = CompanyId;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setHint(String Hint) {
		this.Hint = Hint;
	}
	public void setHumanId(String HumanId) {
		this.HumanId = HumanId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
}