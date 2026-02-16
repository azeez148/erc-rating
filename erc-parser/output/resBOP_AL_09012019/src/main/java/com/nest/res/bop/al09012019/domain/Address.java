package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class Address    extends Policy  {
	private String CountyCode;
	private String CareOfName;
	private String StreetName;
	private String POBox;
	private String CityCode;
	private String FloorNumber;
	private Date Modified;
	private String PreDirectional;
	private String CountryName;
	private String StateName;
	private String CountyFIPS;
	private String RouteBox;
	private String StreetSuffix;
	private Date Created;
	private int ScrubIndicator;
	private String UnitType;
	private String VersionedId;
	private String StreetNumber;
	private String MailStopCode;
	private String CountryCode;
	private String StateFIPS;
	private String CreatedBy;
	private String StateCode;
	private Date Expiration;
	private String RouteNumber;
	private String CityName;
	private String CountyName;
	private Date Effective;
	private String AttentionName;
	private String PostDirectional;
	private String AddressIdentifier;
	private String BuildingNumber;
	private String Id;
	private String UnitNumber;
	private String Line1;
	private String Line2;
	private String Line3;
	
	
	
	
	
	
	


	public String  getStateFIPS() {
		return this.StateFIPS;
	}
	public String  getBuildingNumber() {
		return this.BuildingNumber;
	}
	public String  getCountryName() {
		return this.CountryName;
	}
	public String  getCountyName() {
		return this.CountyName;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getStateCode() {
		return this.StateCode;
	}
	public String  getFloorNumber() {
		return this.FloorNumber;
	}
	public int  getScrubIndicator() {
		return this.ScrubIndicator;
	}
	public String  getCityName() {
		return this.CityName;
	}
	public String  getStreetNumber() {
		return this.StreetNumber;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public String  getUnitType() {
		return this.UnitType;
	}
	public String  getPostDirectional() {
		return this.PostDirectional;
	}
	public String  getAddressIdentifier() {
		return this.AddressIdentifier;
	}
	public String  getPOBox() {
		return this.POBox;
	}
	public String  getId() {
		return this.Id;
	}
	public String  getPreDirectional() {
		return this.PreDirectional;
	}
	public String  getStateName() {
		return this.StateName;
	}
	public String  getLine3() {
		return this.Line3;
	}
	public String  getLine2() {
		return this.Line2;
	}
	public String  getLine1() {
		return this.Line1;
	}
	public String  getRouteNumber() {
		return this.RouteNumber;
	}
	public String  getRouteBox() {
		return this.RouteBox;
	}
	public String  getCountryCode() {
		return this.CountryCode;
	}
	public String  getUnitNumber() {
		return this.UnitNumber;
	}
	public String  getAttentionName() {
		return this.AttentionName;
	}
	public String  getCountyCode() {
		return this.CountyCode;
	}
	public String  getCareOfName() {
		return this.CareOfName;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public String  getMailStopCode() {
		return this.MailStopCode;
	}
	public String  getStreetSuffix() {
		return this.StreetSuffix;
	}
	public String  getCityCode() {
		return this.CityCode;
	}
	public String  getStreetName() {
		return this.StreetName;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getCountyFIPS() {
		return this.CountyFIPS;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public Date  getModified() {
		return this.Modified;
	}
	
	public void setAttentionName(String AttentionName) {
		this.AttentionName = AttentionName;
	}
	public void setLine3(String Line3) {
		this.Line3 = Line3;
	}
	public void setLine2(String Line2) {
		this.Line2 = Line2;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setUnitType(String UnitType) {
		this.UnitType = UnitType;
	}
	public void setStreetName(String StreetName) {
		this.StreetName = StreetName;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setCountyCode(String CountyCode) {
		this.CountyCode = CountyCode;
	}
	public void setStateFIPS(String StateFIPS) {
		this.StateFIPS = StateFIPS;
	}
	public void setPOBox(String POBox) {
		this.POBox = POBox;
	}
	public void setCountyName(String CountyName) {
		this.CountyName = CountyName;
	}
	public void setUnitNumber(String UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setCountryName(String CountryName) {
		this.CountryName = CountryName;
	}
	public void setPreDirectional(String PreDirectional) {
		this.PreDirectional = PreDirectional;
	}
	public void setStateCode(String StateCode) {
		this.StateCode = StateCode;
	}
	public void setStreetSuffix(String StreetSuffix) {
		this.StreetSuffix = StreetSuffix;
	}
	public void setStreetNumber(String StreetNumber) {
		this.StreetNumber = StreetNumber;
	}
	public void setAddressIdentifier(String AddressIdentifier) {
		this.AddressIdentifier = AddressIdentifier;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setPostDirectional(String PostDirectional) {
		this.PostDirectional = PostDirectional;
	}
	public void setCareOfName(String CareOfName) {
		this.CareOfName = CareOfName;
	}
	public void setStateName(String StateName) {
		this.StateName = StateName;
	}
	public void setBuildingNumber(String BuildingNumber) {
		this.BuildingNumber = BuildingNumber;
	}
	public void setCityName(String CityName) {
		this.CityName = CityName;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setCountyFIPS(String CountyFIPS) {
		this.CountyFIPS = CountyFIPS;
	}
	public void setScrubIndicator(int ScrubIndicator) {
		this.ScrubIndicator = ScrubIndicator;
	}
	public void setMailStopCode(String MailStopCode) {
		this.MailStopCode = MailStopCode;
	}
	public void setRouteBox(String RouteBox) {
		this.RouteBox = RouteBox;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setLine1(String Line1) {
		this.Line1 = Line1;
	}
	public void setFloorNumber(String FloorNumber) {
		this.FloorNumber = FloorNumber;
	}
	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setCityCode(String CityCode) {
		this.CityCode = CityCode;
	}
	public void setRouteNumber(String RouteNumber) {
		this.RouteNumber = RouteNumber;
	}
}