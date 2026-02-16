package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class BOPWindstormProtectiveDevices    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private double WindstormLossMitigationFactor;
	private Date ExpirationDt;
	private String RoofGeometry;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String PriorId;
	private double Factor;
	private double EvaluatedPremium;
	private String RoofDescOption;
	private String FormName;
	private int TermFactorIndicator;
	private int YearBuilt;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double NewResidentialConstructionFactor;
	private double ChangePremium;
	private String MeetsDebrisImpact;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private int UnitNumber;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private double ProRateFactor;
	private double AnnualPremium;
	private Date Modified;
	private String RoofWallConnection;
	private Date RateDt;
	private double ProRatedPremium;
	private double OverridePremium;
	private Date Created;
	private String WindowProtection;
	private String RoofCovering;
	private String DoorType;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private String NumOfStoriesInBldg;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private String BldgType;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private String PremisesDescription;
	private double ShortRatePenalty;
	private String RatingTerritory;
	private String RoofCoveringConvertedOption;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String BuildingNumber;
	private String PremisesNumber;
	private String RoofDeckAttachment;
	
	
	
	
	
	
	


	public String  getPremisesDescription() {
		return this.PremisesDescription;
	}
	public String  getBuildingNumber() {
		return this.BuildingNumber;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public int  getUnitNumber() {
		return this.UnitNumber;
	}
	public double  getPolicyTermPremium() {
		return this.PolicyTermPremium;
	}
	public double  getProRateFactor() {
		return this.ProRateFactor;
	}
	public double  getPremium() {
		return this.Premium;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public String  getRoofWallConnection() {
		return this.RoofWallConnection;
	}
	public double  getFactor() {
		return this.Factor;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getId() {
		return this.Id;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getRoofCovering() {
		return this.RoofCovering;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public double  getNewResidentialConstructionFactor() {
		return this.NewResidentialConstructionFactor;
	}
	public String  getRatingTerritory() {
		return this.RatingTerritory;
	}
	public String  getWindowProtection() {
		return this.WindowProtection;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public int  getTermFactorIndicator() {
		return this.TermFactorIndicator;
	}
	public Date  getEffective() {
		return this.Effective;
	}
	public Date  getModified() {
		return this.Modified;
	}
	public double  getProRatedPremium() {
		return this.ProRatedPremium;
	}
	public Date  getAddEffectiveDt() {
		return this.AddEffectiveDt;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public String  getPremisesNumber() {
		return this.PremisesNumber;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public String  getRoofDeckAttachment() {
		return this.RoofDeckAttachment;
	}
	public double  getWindstormLossMitigationFactor() {
		return this.WindstormLossMitigationFactor;
	}
	public String  getDoorType() {
		return this.DoorType;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public String  getMeetsDebrisImpact() {
		return this.MeetsDebrisImpact;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getRoofDescOption() {
		return this.RoofDescOption;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public String  getBldgType() {
		return this.BldgType;
	}
	public String  getNumOfStoriesInBldg() {
		return this.NumOfStoriesInBldg;
	}
	public int  getYearBuilt() {
		return this.YearBuilt;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getRoofCoveringConvertedOption() {
		return this.RoofCoveringConvertedOption;
	}
	public String  getRoofGeometry() {
		return this.RoofGeometry;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setPremisesNumber(String PremisesNumber) {
		this.PremisesNumber = PremisesNumber;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setMeetsDebrisImpact(String MeetsDebrisImpact) {
		this.MeetsDebrisImpact = MeetsDebrisImpact;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setPremisesDescription(String PremisesDescription) {
		this.PremisesDescription = PremisesDescription;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setNumOfStoriesInBldg(String NumOfStoriesInBldg) {
		this.NumOfStoriesInBldg = NumOfStoriesInBldg;
	}
	public void setPolicyTermPremium(double PolicyTermPremium) {
		this.PolicyTermPremium = PolicyTermPremium;
	}
	public void setPriorId(String PriorId) {
		this.PriorId = PriorId;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setYearBuilt(int YearBuilt) {
		this.YearBuilt = YearBuilt;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setChangeEffectiveDt(Date ChangeEffectiveDt) {
		this.ChangeEffectiveDt = ChangeEffectiveDt;
	}
	public void setExpirationDt(Date ExpirationDt) {
		this.ExpirationDt = ExpirationDt;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setRoofGeometry(String RoofGeometry) {
		this.RoofGeometry = RoofGeometry;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setRoofCovering(String RoofCovering) {
		this.RoofCovering = RoofCovering;
	}
	public void setNewResidentialConstructionFactor(double NewResidentialConstructionFactor) {
		this.NewResidentialConstructionFactor = NewResidentialConstructionFactor;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setFactor(double Factor) {
		this.Factor = Factor;
	}
	public void setRoofDeckAttachment(String RoofDeckAttachment) {
		this.RoofDeckAttachment = RoofDeckAttachment;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setBldgType(String BldgType) {
		this.BldgType = BldgType;
	}
	public void setWindstormLossMitigationFactor(double WindstormLossMitigationFactor) {
		this.WindstormLossMitigationFactor = WindstormLossMitigationFactor;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setPremium(double Premium) {
		this.Premium = Premium;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setBuildingNumber(String BuildingNumber) {
		this.BuildingNumber = BuildingNumber;
	}
	public void setRoofDescOption(String RoofDescOption) {
		this.RoofDescOption = RoofDescOption;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setRoofWallConnection(String RoofWallConnection) {
		this.RoofWallConnection = RoofWallConnection;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setRoofCoveringConvertedOption(String RoofCoveringConvertedOption) {
		this.RoofCoveringConvertedOption = RoofCoveringConvertedOption;
	}
	public void setDoorType(String DoorType) {
		this.DoorType = DoorType;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setWindowProtection(String WindowProtection) {
		this.WindowProtection = WindowProtection;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setRatingTerritory(String RatingTerritory) {
		this.RatingTerritory = RatingTerritory;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
}