package com.nest.res.bop.al09012019.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPEarthquake    extends Policy  {
	private int FeeIndicator;
	private String FormNumber;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private double EQOptnlIncrDedAdjdFactor;
	private String PctMasonryVeneer;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private double BCEGFactor;
	private double FunctionalBPPValuationPremium;
	private String LandType;
	private String PriorId;
	private double GradingFactor;
	private String Classification;
	private double Factor;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private double MasonryVeneerFactor;
	private String ProportionateDeductible;
	private int DedTierNJ;
	private String BuildingClassLink;
	private String CreatedBy;
	private int TaxIndicator;
	private double EQMandatoryDedPctFactor;
	private int PremiumIndicator;
	private Date Expiration;
	private double EarthquakeBPPRate;
	private double StoryFactor;
	private double ChangePremium;
	private double FunctionalBPPValuationFactor;
	private String MandatoryDedPctTN;
	private String DedStatCode;
	private int ShortRateIndicator;
	private double EarthquakeBuildingPremium;
	private double EQOptnlIncrDedPctFactorTN;
	private double FunctionalBuildingValuationFactor;
	private double TotalProRatedChangePremium;
	private String Id;
	private double PercentageDeductible;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int UnitNumber;
	private double EQOptnlIncrDedAdjdFactorTN;
	private double ProRateFactor;
	private double OrdinanceOrLawEQFactor;
	private double AnnualPremium;
	private double EarthquakeBPPPremium;
	private double EQStoryFactorNJ;
	private String MandatoryDedPct;
	private Date Modified;
	private String OptnlIncrdDedPct;
	private Date RateDt;
	private double EarthquakeRate;
	private double ProRatedPremium;
	private String OptnlIncrdDedPctTN;
	private Date Created;
	private String DedTier;
	private double EQMandatoryDedPctFactorTN;
	private double OverridePremium;
	private int EquivalentDollarDeductible;
	private Date ChangeEffectiveDt;
	private String VersionedId;
	private int ProRateIndicator;
	private String RoofTank;
	private double SprinkleredFactor;
	private double EQOptnlIncrDedPctFactor;
	private double ShortRateFactor;
	private double TotBusnPrsnlPropPremium;
	private String ParentId;
	private double ProRatedPriorPremium;
	private String Zone;
	private double PriorPremium;
	private double ShortRatePenalty;
	private double RoofTankHazardFactor;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String BuildingNumber;
	private String PremisesNumber;
	private String NumStories;
	private double DedFactor;
	private double LandTypeFactor;
	
	
	
	
	
	
	


	public String  getBuildingNumber() {
		return this.BuildingNumber;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public double  getStoryFactor() {
		return this.StoryFactor;
	}
	public String  getClassification() {
		return this.Classification;
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
	public int  getEquivalentDollarDeductible() {
		return this.EquivalentDollarDeductible;
	}
	public Date  getExpirationDt() {
		return this.ExpirationDt;
	}
	public String  getVersionedId() {
		return this.VersionedId;
	}
	public double  getEQOptnlIncrDedAdjdFactor() {
		return this.EQOptnlIncrDedAdjdFactor;
	}
	public double  getFactor() {
		return this.Factor;
	}
	public double  getPercentageDeductible() {
		return this.PercentageDeductible;
	}
	public String  getDedTier() {
		return this.DedTier;
	}
	public Date  getEffectiveDt() {
		return this.EffectiveDt;
	}
	public double  getGradingFactor() {
		return this.GradingFactor;
	}
	public double  getOverridePremium() {
		return this.OverridePremium;
	}
	public String  getId() {
		return this.Id;
	}
	public double  getEarthquakeRate() {
		return this.EarthquakeRate;
	}
	public Date  getRateDt() {
		return this.RateDt;
	}
	public double  getProRatedPriorPremium() {
		return this.ProRatedPriorPremium;
	}
	public double  getEQMandatoryDedPctFactor() {
		return this.EQMandatoryDedPctFactor;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public String  getProportionateDeductible() {
		return this.ProportionateDeductible;
	}
	public String  getDedStatCode() {
		return this.DedStatCode;
	}
	public double  getEarthquakeBuildingPremium() {
		return this.EarthquakeBuildingPremium;
	}
	public String  getZone() {
		return this.Zone;
	}
	public String  getLandType() {
		return this.LandType;
	}
	public double  getEQOptnlIncrDedPctFactorTN() {
		return this.EQOptnlIncrDedPctFactorTN;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getMandatoryDedPctTN() {
		return this.MandatoryDedPctTN;
	}
	public String  getPctMasonryVeneer() {
		return this.PctMasonryVeneer;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getNumStories() {
		return this.NumStories;
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
	public double  getEarthquakeBPPRate() {
		return this.EarthquakeBPPRate;
	}
	public double  getEQMandatoryDedPctFactorTN() {
		return this.EQMandatoryDedPctFactorTN;
	}
	public double  getMasonryVeneerFactor() {
		return this.MasonryVeneerFactor;
	}
	public String  getFormName() {
		return this.FormName;
	}
	public double  getOrdinanceOrLawEQFactor() {
		return this.OrdinanceOrLawEQFactor;
	}
	public double  getFunctionalBPPValuationPremium() {
		return this.FunctionalBPPValuationPremium;
	}
	public double  getEQOptnlIncrDedAdjdFactorTN() {
		return this.EQOptnlIncrDedAdjdFactorTN;
	}
	public String  getPriorId() {
		return this.PriorId;
	}
	public String  getBuildingClassLink() {
		return this.BuildingClassLink;
	}
	public double  getTotalProRatedChangePremium() {
		return this.TotalProRatedChangePremium;
	}
	public double  getProRatedChangePremium() {
		return this.ProRatedChangePremium;
	}
	public double  getLandTypeFactor() {
		return this.LandTypeFactor;
	}
	public double  getEarthquakeBPPPremium() {
		return this.EarthquakeBPPPremium;
	}
	public double  getEQOptnlIncrDedPctFactor() {
		return this.EQOptnlIncrDedPctFactor;
	}
	public int  getDedTierNJ() {
		return this.DedTierNJ;
	}
	public double  getFunctionalBuildingValuationFactor() {
		return this.FunctionalBuildingValuationFactor;
	}
	public String  getRoofTank() {
		return this.RoofTank;
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
	public double  getRoofTankHazardFactor() {
		return this.RoofTankHazardFactor;
	}
	public double  getSprinkleredFactor() {
		return this.SprinkleredFactor;
	}
	public int  getShortRateIndicator() {
		return this.ShortRateIndicator;
	}
	public Date  getChangeEffectiveDt() {
		return this.ChangeEffectiveDt;
	}
	public double  getDedFactor() {
		return this.DedFactor;
	}
	public String  getFormNumber() {
		return this.FormNumber;
	}
	public double  getEQStoryFactorNJ() {
		return this.EQStoryFactorNJ;
	}
	public double  getFunctionalBPPValuationFactor() {
		return this.FunctionalBPPValuationFactor;
	}
	public double  getShortRateFactor() {
		return this.ShortRateFactor;
	}
	public String  getMandatoryDedPct() {
		return this.MandatoryDedPct;
	}
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public double  getBCEGFactor() {
		return this.BCEGFactor;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public String  getOptnlIncrdDedPctTN() {
		return this.OptnlIncrdDedPctTN;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public String  getOptnlIncrdDedPct() {
		return this.OptnlIncrdDedPct;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public double  getTotBusnPrsnlPropPremium() {
		return this.TotBusnPrsnlPropPremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setLandType(String LandType) {
		this.LandType = LandType;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setFunctionalBPPValuationFactor(double FunctionalBPPValuationFactor) {
		this.FunctionalBPPValuationFactor = FunctionalBPPValuationFactor;
	}
	public void setOptnlIncrdDedPctTN(String OptnlIncrdDedPctTN) {
		this.OptnlIncrdDedPctTN = OptnlIncrdDedPctTN;
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
	public void setRoofTank(String RoofTank) {
		this.RoofTank = RoofTank;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setEQStoryFactorNJ(double EQStoryFactorNJ) {
		this.EQStoryFactorNJ = EQStoryFactorNJ;
	}
	public void setEarthquakeBPPRate(double EarthquakeBPPRate) {
		this.EarthquakeBPPRate = EarthquakeBPPRate;
	}
	public void setDedTierNJ(int DedTierNJ) {
		this.DedTierNJ = DedTierNJ;
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
	public void setEQOptnlIncrDedPctFactor(double EQOptnlIncrDedPctFactor) {
		this.EQOptnlIncrDedPctFactor = EQOptnlIncrDedPctFactor;
	}
	public void setBCEGFactor(double BCEGFactor) {
		this.BCEGFactor = BCEGFactor;
	}
	public void setEarthquakeRate(double EarthquakeRate) {
		this.EarthquakeRate = EarthquakeRate;
	}
	public void setRateDt(Date RateDt) {
		this.RateDt = RateDt;
	}
	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}
	public void setEarthquakeBPPPremium(double EarthquakeBPPPremium) {
		this.EarthquakeBPPPremium = EarthquakeBPPPremium;
	}
	public void setEQOptnlIncrDedAdjdFactorTN(double EQOptnlIncrDedAdjdFactorTN) {
		this.EQOptnlIncrDedAdjdFactorTN = EQOptnlIncrDedAdjdFactorTN;
	}
	public void setSprinkleredFactor(double SprinkleredFactor) {
		this.SprinkleredFactor = SprinkleredFactor;
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
	public void setStoryFactor(double StoryFactor) {
		this.StoryFactor = StoryFactor;
	}
	public void setShortRateFactor(double ShortRateFactor) {
		this.ShortRateFactor = ShortRateFactor;
	}
	public void setBuildingClassLink(String BuildingClassLink) {
		this.BuildingClassLink = BuildingClassLink;
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
	public void setProportionateDeductible(String ProportionateDeductible) {
		this.ProportionateDeductible = ProportionateDeductible;
	}
	public void setPercentageDeductible(double PercentageDeductible) {
		this.PercentageDeductible = PercentageDeductible;
	}
	public void setEQOptnlIncrDedPctFactorTN(double EQOptnlIncrDedPctFactorTN) {
		this.EQOptnlIncrDedPctFactorTN = EQOptnlIncrDedPctFactorTN;
	}
	public void setAnnualPremium(double AnnualPremium) {
		this.AnnualPremium = AnnualPremium;
	}
	public void setNumStories(String NumStories) {
		this.NumStories = NumStories;
	}
	public void setTermFactorIndicator(int TermFactorIndicator) {
		this.TermFactorIndicator = TermFactorIndicator;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setDedTier(String DedTier) {
		this.DedTier = DedTier;
	}
	public void setRoofTankHazardFactor(double RoofTankHazardFactor) {
		this.RoofTankHazardFactor = RoofTankHazardFactor;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setEarthquakeBuildingPremium(double EarthquakeBuildingPremium) {
		this.EarthquakeBuildingPremium = EarthquakeBuildingPremium;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setOptnlIncrdDedPct(String OptnlIncrdDedPct) {
		this.OptnlIncrdDedPct = OptnlIncrdDedPct;
	}
	public void setZone(String Zone) {
		this.Zone = Zone;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setFactor(double Factor) {
		this.Factor = Factor;
	}
	public void setDedStatCode(String DedStatCode) {
		this.DedStatCode = DedStatCode;
	}
	public void setMandatoryDedPct(String MandatoryDedPct) {
		this.MandatoryDedPct = MandatoryDedPct;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setFunctionalBuildingValuationFactor(double FunctionalBuildingValuationFactor) {
		this.FunctionalBuildingValuationFactor = FunctionalBuildingValuationFactor;
	}
	public void setClassification(String Classification) {
		this.Classification = Classification;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setEQOptnlIncrDedAdjdFactor(double EQOptnlIncrDedAdjdFactor) {
		this.EQOptnlIncrDedAdjdFactor = EQOptnlIncrDedAdjdFactor;
	}
	public void setPremium(double Premium) {
		this.Premium = Premium;
	}
	public void setEffective(Date Effective) {
		this.Effective = Effective;
	}
	public void setDedFactor(double DedFactor) {
		this.DedFactor = DedFactor;
	}
	public void setFeeIndicator(int FeeIndicator) {
		this.FeeIndicator = FeeIndicator;
	}
	public void setEQMandatoryDedPctFactor(double EQMandatoryDedPctFactor) {
		this.EQMandatoryDedPctFactor = EQMandatoryDedPctFactor;
	}
	public void setProRateFactor(double ProRateFactor) {
		this.ProRateFactor = ProRateFactor;
	}
	public void setEQMandatoryDedPctFactorTN(double EQMandatoryDedPctFactorTN) {
		this.EQMandatoryDedPctFactorTN = EQMandatoryDedPctFactorTN;
	}
	public void setBuildingNumber(String BuildingNumber) {
		this.BuildingNumber = BuildingNumber;
	}
	public void setLandTypeFactor(double LandTypeFactor) {
		this.LandTypeFactor = LandTypeFactor;
	}
	public void setPctMasonryVeneer(String PctMasonryVeneer) {
		this.PctMasonryVeneer = PctMasonryVeneer;
	}
	public void setPriorRateDt(Date PriorRateDt) {
		this.PriorRateDt = PriorRateDt;
	}
	public void setMasonryVeneerFactor(double MasonryVeneerFactor) {
		this.MasonryVeneerFactor = MasonryVeneerFactor;
	}
	public void setTotBusnPrsnlPropPremium(double TotBusnPrsnlPropPremium) {
		this.TotBusnPrsnlPropPremium = TotBusnPrsnlPropPremium;
	}
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
	}
	public void setProRatedPriorPremium(double ProRatedPriorPremium) {
		this.ProRatedPriorPremium = ProRatedPriorPremium;
	}
	public void setOrdinanceOrLawEQFactor(double OrdinanceOrLawEQFactor) {
		this.OrdinanceOrLawEQFactor = OrdinanceOrLawEQFactor;
	}
	public void setPremiumIndicator(int PremiumIndicator) {
		this.PremiumIndicator = PremiumIndicator;
	}
	public void setExpiration(Date Expiration) {
		this.Expiration = Expiration;
	}
	public void setFunctionalBPPValuationPremium(double FunctionalBPPValuationPremium) {
		this.FunctionalBPPValuationPremium = FunctionalBPPValuationPremium;
	}
	public void setMandatoryDedPctTN(String MandatoryDedPctTN) {
		this.MandatoryDedPctTN = MandatoryDedPctTN;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setEquivalentDollarDeductible(int EquivalentDollarDeductible) {
		this.EquivalentDollarDeductible = EquivalentDollarDeductible;
	}
	public void setGradingFactor(double GradingFactor) {
		this.GradingFactor = GradingFactor;
	}
}