package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPMicroClassification    extends Policy  {
	private int FeeIndicator;
	private double MicroLCM;
	private double TerrorismBPPRate;
	private String FormNumber;
	private double PolicyTermPremium;
	private String RatingGroup;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private String ClassDescription;
	private Date EffectiveDt;
	private double FinalBusinessPersonalPropertyRate;
	private double TerrorismBPPPremium;
	private String PriorId;
	private double TerrorismLiabilityNBCRFactor;
	private double TerrorismBPPFullRate;
	private double TerrorismLiabilityFactor;
	private String ProfessionalLiabilityHazardGroup;
	private double terrorismPostBPPPremiumTemp_1;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private double BusinessPersonalPropertyRate;
	private int TaxIndicator;
	private int PremiumIndicator;
	private double TerrorismLiabilityPremium;
	private Date Expiration;
	private List<BOPMicroClassificationBusnPrsnlPropCoverage> BOPMicroClassificationBusnPrsnlPropCoverage;
	private String LiabilityHazardGroup;
	private String TerrorismCovUnderlyingPolicyStatCode;
	private double ChangePremium;
	private double terrorismPostLiabilityPremiumTemp_1;
	private String ArtisanSales;
	private String ClassCode;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private String SICCode;
	private double ProRateFactor;
	private String NAICSCode;
	private double AnnualPremium;
	private Date Modified;
	private int TerrsmSubLimit;
	private double TerrorismFireFactor;
	private double TerrorismProRatedPostPremium;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private double TerrorismLiabilityFullFactor;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private double terrorismPreLiabilityPremiumTemp_1;
	private double terrorismPreBPPPremiumTemp_1;
	private int ProRateIndicator;
	private double ShortRateFactor;
	private String ParentId;
	private double ProRatedPriorPremium;
	private double PriorPremium;
	private int BusnPrsnlPropLimit;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private double TerrorismLiabilitySubLimitFactor;
	private List<BOPMicroClassificationLiabMedExpensesCoverage> BOPMicroClassificationLiabMedExpensesCoverage;
	private double TerrorismBPPNBCRFactor;
	private double TerrorismProRatedPriorPremium;
	private double TerrorismFirePremium;
	
	
	
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOPMicroClassificationBusnPrsnlPropCoverage) {
			childs.addAll(BOPMicroClassificationBusnPrsnlPropCoverage);
		}
		if(null != BOPMicroClassificationLiabMedExpensesCoverage) {
			childs.addAll(BOPMicroClassificationLiabMedExpensesCoverage);
		}
		return childs;
	}


	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public String  getNAICSCode() {
		return this.NAICSCode;
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
	public String  getProfessionalLiabilityHazardGroup() {
		return this.ProfessionalLiabilityHazardGroup;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public double  getTerrorismLiabilityFullFactor() {
		return this.TerrorismLiabilityFullFactor;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public double  getTerrorismFireFactor() {
		return this.TerrorismFireFactor;
	}
	public double  getMicroLCM() {
		return this.MicroLCM;
	}
	public double  getTerrorismLiabilitySubLimitFactor() {
		return this.TerrorismLiabilitySubLimitFactor;
	}
	public double  getTerrorismProRatedPriorPremium() {
		return this.TerrorismProRatedPriorPremium;
	}
	public double  getTerrorismBPPNBCRFactor() {
		return this.TerrorismBPPNBCRFactor;
	}
	public String  getClassDescription() {
		return this.ClassDescription;
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
	public List<BOPMicroClassificationBusnPrsnlPropCoverage> getBOPMicroClassificationBusnPrsnlPropCoverage() {
		return this.BOPMicroClassificationBusnPrsnlPropCoverage;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public String  getTerrorismCovUnderlyingPolicyStatCode() {
		return this.TerrorismCovUnderlyingPolicyStatCode;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public double  getTerrorismLiabilityNBCRFactor() {
		return this.TerrorismLiabilityNBCRFactor;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getSICCode() {
		return this.SICCode;
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
	public double  getTerrorismPostLiabilityPremiumTemp_1() {
		return this.terrorismPostLiabilityPremiumTemp_1;
	}
	public double  getFinalBusinessPersonalPropertyRate() {
		return this.FinalBusinessPersonalPropertyRate;
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
	public double  getTerrorismPreLiabilityPremiumTemp_1() {
		return this.terrorismPreLiabilityPremiumTemp_1;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public double  getTerrorismFirePremium() {
		return this.TerrorismFirePremium;
	}
	public double  getTerrorismBPPPremium() {
		return this.TerrorismBPPPremium;
	}
	public double  getTerrorismBPPRate() {
		return this.TerrorismBPPRate;
	}
	public String  getRatingGroup() {
		return this.RatingGroup;
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
	public double  getTerrorismLiabilityFactor() {
		return this.TerrorismLiabilityFactor;
	}
	public double  getTerrorismProRatedPostPremium() {
		return this.TerrorismProRatedPostPremium;
	}
	public int  getTerrsmSubLimit() {
		return this.TerrsmSubLimit;
	}
	public double  getTerrorismPreBPPPremiumTemp_1() {
		return this.terrorismPreBPPPremiumTemp_1;
	}
	public List<BOPMicroClassificationLiabMedExpensesCoverage> getBOPMicroClassificationLiabMedExpensesCoverage() {
		return this.BOPMicroClassificationLiabMedExpensesCoverage;
	}
	public String  getLiabilityHazardGroup() {
		return this.LiabilityHazardGroup;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public double  getTerrorismBPPFullRate() {
		return this.TerrorismBPPFullRate;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public String  getClassCode() {
		return this.ClassCode;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public double  getTerrorismLiabilityPremium() {
		return this.TerrorismLiabilityPremium;
	}
	public String  getArtisanSales() {
		return this.ArtisanSales;
	}
	public double  getBusinessPersonalPropertyRate() {
		return this.BusinessPersonalPropertyRate;
	}
	public int  getBusnPrsnlPropLimit() {
		return this.BusnPrsnlPropLimit;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public double  getTerrorismPostBPPPremiumTemp_1() {
		return this.terrorismPostBPPPremiumTemp_1;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setFinalBusinessPersonalPropertyRate(double FinalBusinessPersonalPropertyRate) {
		this.FinalBusinessPersonalPropertyRate = FinalBusinessPersonalPropertyRate;
	}
	public void setProfessionalLiabilityHazardGroup(String ProfessionalLiabilityHazardGroup) {
		this.ProfessionalLiabilityHazardGroup = ProfessionalLiabilityHazardGroup;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setTerrorismLiabilityFullFactor(double TerrorismLiabilityFullFactor) {
		this.TerrorismLiabilityFullFactor = TerrorismLiabilityFullFactor;
	}
	public void setTerrorismProRatedPostPremium(double TerrorismProRatedPostPremium) {
		this.TerrorismProRatedPostPremium = TerrorismProRatedPostPremium;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setTerrorismBPPRate(double TerrorismBPPRate) {
		this.TerrorismBPPRate = TerrorismBPPRate;
	}
	public void setSICCode(String SICCode) {
		this.SICCode = SICCode;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setRatingGroup(String RatingGroup) {
		this.RatingGroup = RatingGroup;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setBusnPrsnlPropLimit(int BusnPrsnlPropLimit) {
		this.BusnPrsnlPropLimit = BusnPrsnlPropLimit;
	}
	public void setMicroLCM(double MicroLCM) {
		this.MicroLCM = MicroLCM;
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
	public void setTerrorismPreLiabilityPremiumTemp_1(double terrorismPreLiabilityPremiumTemp_1) {
		this.terrorismPreLiabilityPremiumTemp_1 = terrorismPreLiabilityPremiumTemp_1;
	}
	public void setAddEffectiveDt(Date AddEffectiveDt) {
		this.AddEffectiveDt = AddEffectiveDt;
	}
	public void setTerrorismBPPFullRate(double TerrorismBPPFullRate) {
		this.TerrorismBPPFullRate = TerrorismBPPFullRate;
	}
	public void setBusinessPersonalPropertyRate(double BusinessPersonalPropertyRate) {
		this.BusinessPersonalPropertyRate = BusinessPersonalPropertyRate;
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
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setTerrorismPostBPPPremiumTemp_1(double terrorismPostBPPPremiumTemp_1) {
		this.terrorismPostBPPPremiumTemp_1 = terrorismPostBPPPremiumTemp_1;
	}
	public void setFormNumber(String FormNumber) {
		this.FormNumber = FormNumber;
	}
	public void setChangeEffectiveDt(Date ChangeEffectiveDt) {
		this.ChangeEffectiveDt = ChangeEffectiveDt;
	}
	public void setTerrorismFirePremium(double TerrorismFirePremium) {
		this.TerrorismFirePremium = TerrorismFirePremium;
	}
	public void setExpirationDt(Date ExpirationDt) {
		this.ExpirationDt = ExpirationDt;
	}
	public void setTerrorismLiabilitySubLimitFactor(double TerrorismLiabilitySubLimitFactor) {
		this.TerrorismLiabilitySubLimitFactor = TerrorismLiabilitySubLimitFactor;
	}
	public void setArtisanSales(String ArtisanSales) {
		this.ArtisanSales = ArtisanSales;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setTerrorismFireFactor(double TerrorismFireFactor) {
		this.TerrorismFireFactor = TerrorismFireFactor;
	}
	public void setTerrorismPreBPPPremiumTemp_1(double terrorismPreBPPPremiumTemp_1) {
		this.terrorismPreBPPPremiumTemp_1 = terrorismPreBPPPremiumTemp_1;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setNAICSCode(String NAICSCode) {
		this.NAICSCode = NAICSCode;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setClassCode(String ClassCode) {
		this.ClassCode = ClassCode;
	}
	public void setTerrorismBPPPremium(double TerrorismBPPPremium) {
		this.TerrorismBPPPremium = TerrorismBPPPremium;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setTerrorismLiabilityNBCRFactor(double TerrorismLiabilityNBCRFactor) {
		this.TerrorismLiabilityNBCRFactor = TerrorismLiabilityNBCRFactor;
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
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setTerrsmSubLimit(int TerrsmSubLimit) {
		this.TerrsmSubLimit = TerrsmSubLimit;
	}
	public void setLiabilityHazardGroup(String LiabilityHazardGroup) {
		this.LiabilityHazardGroup = LiabilityHazardGroup;
	}
	public void setTerrorismCovUnderlyingPolicyStatCode(String TerrorismCovUnderlyingPolicyStatCode) {
		this.TerrorismCovUnderlyingPolicyStatCode = TerrorismCovUnderlyingPolicyStatCode;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setTerrorismLiabilityFactor(double TerrorismLiabilityFactor) {
		this.TerrorismLiabilityFactor = TerrorismLiabilityFactor;
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
	public void setTerrorismProRatedPriorPremium(double TerrorismProRatedPriorPremium) {
		this.TerrorismProRatedPriorPremium = TerrorismProRatedPriorPremium;
	}
	public void setTerrorismBPPNBCRFactor(double TerrorismBPPNBCRFactor) {
		this.TerrorismBPPNBCRFactor = TerrorismBPPNBCRFactor;
	}
	public void setBOPMicroClassificationBusnPrsnlPropCoverage(List<BOPMicroClassificationBusnPrsnlPropCoverage> BOPMicroClassificationBusnPrsnlPropCoverage) {
		this.BOPMicroClassificationBusnPrsnlPropCoverage = BOPMicroClassificationBusnPrsnlPropCoverage;
	}
	public void setClassDescription(String ClassDescription) {
		this.ClassDescription = ClassDescription;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setTerrorismLiabilityPremium(double TerrorismLiabilityPremium) {
		this.TerrorismLiabilityPremium = TerrorismLiabilityPremium;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setBOPMicroClassificationLiabMedExpensesCoverage(List<BOPMicroClassificationLiabMedExpensesCoverage> BOPMicroClassificationLiabMedExpensesCoverage) {
		this.BOPMicroClassificationLiabMedExpensesCoverage = BOPMicroClassificationLiabMedExpensesCoverage;
	}
	public void setTerrorismPostLiabilityPremiumTemp_1(double terrorismPostLiabilityPremiumTemp_1) {
		this.terrorismPostLiabilityPremiumTemp_1 = terrorismPostLiabilityPremiumTemp_1;
	}
}