package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class BOPEquipmentBreakdownCovSchedule    extends Policy  {
	private int DirectCoveragesDed;
	private String TypeOfPolicyStatCode;
	private int FeeIndicator;
	private String FormNumber;
	private int PerishableGoodsDed;
	private double PolicyTermPremium;
	private Date ExpirationDt;
	private Date AddEffectiveDt;
	private double Premium;
	private Date EffectiveDt;
	private String CFCRefrigerantsLimit;
	private String PerishableGoodsLimit;
	private String ComputerEquipmtLimit;
	private String PriorId;
	private String EquipmentBreakdownCoveragesLimit;
	private double Factor;
	private String IncreasedLimits;
	private double EvaluatedPremium;
	private String FormName;
	private int TermFactorIndicator;
	private String CreatedBy;
	private int TaxIndicator;
	private int PremiumIndicator;
	private Date Expiration;
	private double ChangePremium;
	private int PerishableGoodsPercentOfLossMinimum;
	private int PerishableGoodsPercentOfLoss;
	private String StateStatCode;
	private int ShortRateIndicator;
	private double TotalProRatedChangePremium;
	private String Id;
	private int UnitNumber;
	private Date PriorRateDt;
	private double ProRatedChangePremium;
	private int IndirectCoveragesDed;
	private double ProRateFactor;
	private String ASLOBStatCode;
	private double AnnualPremium;
	private Date Modified;
	private String SublineStatCode;
	private Date RateDt;
	private double ProRatedPremium;
	private Date Created;
	private double OverridePremium;
	private String HazardousSubstancesLimit;
	private String VersionedId;
	private Date ChangeEffectiveDt;
	private String TransactionTypeStatCode;
	private int ProRateIndicator;
	private String DedHeader;
	private double ShortRateFactor;
	private String DataRestorationLimit;
	private String ParentId;
	private int CombinedAllCoveragesDed;
	private double ProRatedPriorPremium;
	private int IndirectCoveragesHours;
	private double PriorPremium;
	private String TerritoryStatCode;
	private double ShortRatePenalty;
	private Date Effective;
	private int EarnedInFullIndicator;
	private String ExpeditingExpenseLimit;
	private double SurchargeFactor;
	private String dsLimit;
	private String CoveragesHeader;
	
	
	
	
	
	
	


	public int  getPerishableGoodsPercentOfLossMinimum() {
		return this.PerishableGoodsPercentOfLossMinimum;
	}
	public double  getEvaluatedPremium() {
		return this.EvaluatedPremium;
	}
	public int  getUnitNumber() {
		return this.UnitNumber;
	}
	public String  getTerritoryStatCode() {
		return this.TerritoryStatCode;
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
	public double  getFactor() {
		return this.Factor;
	}
	public String  getComputerEquipmtLimit() {
		return this.ComputerEquipmtLimit;
	}
	public String  getTransactionTypeStatCode() {
		return this.TransactionTypeStatCode;
	}
	public double  getSurchargeFactor() {
		return this.SurchargeFactor;
	}
	public int  getDirectCoveragesDed() {
		return this.DirectCoveragesDed;
	}
	public String  getExpeditingExpenseLimit() {
		return this.ExpeditingExpenseLimit;
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
	public String  getSublineStatCode() {
		return this.SublineStatCode;
	}
	public int  getFeeIndicator() {
		return this.FeeIndicator;
	}
	public double  getShortRatePenalty() {
		return this.ShortRatePenalty;
	}
	public int  getIndirectCoveragesDed() {
		return this.IndirectCoveragesDed;
	}
	public String  getIncreasedLimits() {
		return this.IncreasedLimits;
	}
	public int  getEarnedInFullIndicator() {
		return this.EarnedInFullIndicator;
	}
	public String  getCoveragesHeader() {
		return this.CoveragesHeader;
	}
	public String  getTypeOfPolicyStatCode() {
		return this.TypeOfPolicyStatCode;
	}
	public int  getCombinedAllCoveragesDed() {
		return this.CombinedAllCoveragesDed;
	}
	public String  getPerishableGoodsLimit() {
		return this.PerishableGoodsLimit;
	}
	public int  getTaxIndicator() {
		return this.TaxIndicator;
	}
	public String  getDataRestorationLimit() {
		return this.DataRestorationLimit;
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
	public String  getEquipmentBreakdownCoveragesLimit() {
		return this.EquipmentBreakdownCoveragesLimit;
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
	public String  getHazardousSubstancesLimit() {
		return this.HazardousSubstancesLimit;
	}
	public int  getIndirectCoveragesHours() {
		return this.IndirectCoveragesHours;
	}
	public String  getDsLimit() {
		return this.dsLimit;
	}
	public Date  getExpiration() {
		return this.Expiration;
	}
	public int  getProRateIndicator() {
		return this.ProRateIndicator;
	}
	public String  getCFCRefrigerantsLimit() {
		return this.CFCRefrigerantsLimit;
	}
	public String  getASLOBStatCode() {
		return this.ASLOBStatCode;
	}
	public double  getAnnualPremium() {
		return this.AnnualPremium;
	}
	public String  getParentId() {
		return this.ParentId;
	}
	public int  getPerishableGoodsPercentOfLoss() {
		return this.PerishableGoodsPercentOfLoss;
	}
	public String  getStateStatCode() {
		return this.StateStatCode;
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
	public int  getPremiumIndicator() {
		return this.PremiumIndicator;
	}
	public String  getCreatedBy() {
		return this.CreatedBy;
	}
	public double  getPriorPremium() {
		return this.PriorPremium;
	}
	public Date  getCreated() {
		return this.Created;
	}
	public int  getPerishableGoodsDed() {
		return this.PerishableGoodsDed;
	}
	public String  getDedHeader() {
		return this.DedHeader;
	}
	public double  getChangePremium() {
		return this.ChangePremium;
	}
	public Date  getPriorRateDt() {
		return this.PriorRateDt;
	}
	
	public void setDsLimit(String dsLimit) {
		this.dsLimit = dsLimit;
	}
	public void setEarnedInFullIndicator(int EarnedInFullIndicator) {
		this.EarnedInFullIndicator = EarnedInFullIndicator;
	}
	public void setDirectCoveragesDed(int DirectCoveragesDed) {
		this.DirectCoveragesDed = DirectCoveragesDed;
	}
	public void setEquipmentBreakdownCoveragesLimit(String EquipmentBreakdownCoveragesLimit) {
		this.EquipmentBreakdownCoveragesLimit = EquipmentBreakdownCoveragesLimit;
	}
	public void setPerishableGoodsLimit(String PerishableGoodsLimit) {
		this.PerishableGoodsLimit = PerishableGoodsLimit;
	}
	public void setPriorPremium(double PriorPremium) {
		this.PriorPremium = PriorPremium;
	}
	public void setModified(Date Modified) {
		this.Modified = Modified;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}
	public void setProRatedChangePremium(double ProRatedChangePremium) {
		this.ProRatedChangePremium = ProRatedChangePremium;
	}
	public void setParentId(String ParentId) {
		this.ParentId = ParentId;
	}
	public void setIndirectCoveragesHours(int IndirectCoveragesHours) {
		this.IndirectCoveragesHours = IndirectCoveragesHours;
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
	public void setTransactionTypeStatCode(String TransactionTypeStatCode) {
		this.TransactionTypeStatCode = TransactionTypeStatCode;
	}
	public void setDedHeader(String DedHeader) {
		this.DedHeader = DedHeader;
	}
	public void setVersionedId(String VersionedId) {
		this.VersionedId = VersionedId;
	}
	public void setPerishableGoodsDed(int PerishableGoodsDed) {
		this.PerishableGoodsDed = PerishableGoodsDed;
	}
	public void setTaxIndicator(int TaxIndicator) {
		this.TaxIndicator = TaxIndicator;
	}
	public void setShortRateIndicator(int ShortRateIndicator) {
		this.ShortRateIndicator = ShortRateIndicator;
	}
	public void setHazardousSubstancesLimit(String HazardousSubstancesLimit) {
		this.HazardousSubstancesLimit = HazardousSubstancesLimit;
	}
	public void setIndirectCoveragesDed(int IndirectCoveragesDed) {
		this.IndirectCoveragesDed = IndirectCoveragesDed;
	}
	public void setComputerEquipmtLimit(String ComputerEquipmtLimit) {
		this.ComputerEquipmtLimit = ComputerEquipmtLimit;
	}
	public void setDataRestorationLimit(String DataRestorationLimit) {
		this.DataRestorationLimit = DataRestorationLimit;
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
	public void setTerritoryStatCode(String TerritoryStatCode) {
		this.TerritoryStatCode = TerritoryStatCode;
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
	public void setStateStatCode(String StateStatCode) {
		this.StateStatCode = StateStatCode;
	}
	public void setExpeditingExpenseLimit(String ExpeditingExpenseLimit) {
		this.ExpeditingExpenseLimit = ExpeditingExpenseLimit;
	}
	public void setChangePremium(double ChangePremium) {
		this.ChangePremium = ChangePremium;
	}
	public void setPerishableGoodsPercentOfLoss(int PerishableGoodsPercentOfLoss) {
		this.PerishableGoodsPercentOfLoss = PerishableGoodsPercentOfLoss;
	}
	public void setCFCRefrigerantsLimit(String CFCRefrigerantsLimit) {
		this.CFCRefrigerantsLimit = CFCRefrigerantsLimit;
	}
	public void setASLOBStatCode(String ASLOBStatCode) {
		this.ASLOBStatCode = ASLOBStatCode;
	}
	public void setUnitNumber(int UnitNumber) {
		this.UnitNumber = UnitNumber;
	}
	public void setProRateIndicator(int ProRateIndicator) {
		this.ProRateIndicator = ProRateIndicator;
	}
	public void setFormName(String FormName) {
		this.FormName = FormName;
	}
	public void setFactor(double Factor) {
		this.Factor = Factor;
	}
	public void setSublineStatCode(String SublineStatCode) {
		this.SublineStatCode = SublineStatCode;
	}
	public void setTypeOfPolicyStatCode(String TypeOfPolicyStatCode) {
		this.TypeOfPolicyStatCode = TypeOfPolicyStatCode;
	}
	public void setShortRatePenalty(double ShortRatePenalty) {
		this.ShortRatePenalty = ShortRatePenalty;
	}
	public void setOverridePremium(double OverridePremium) {
		this.OverridePremium = OverridePremium;
	}
	public void setPremium(double Premium) {
		this.Premium = Premium;
	}
	public void setPerishableGoodsPercentOfLossMinimum(int PerishableGoodsPercentOfLossMinimum) {
		this.PerishableGoodsPercentOfLossMinimum = PerishableGoodsPercentOfLossMinimum;
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
	public void setTotalProRatedChangePremium(double TotalProRatedChangePremium) {
		this.TotalProRatedChangePremium = TotalProRatedChangePremium;
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
	public void setSurchargeFactor(double SurchargeFactor) {
		this.SurchargeFactor = SurchargeFactor;
	}
	public void setEffectiveDt(Date EffectiveDt) {
		this.EffectiveDt = EffectiveDt;
	}
	public void setProRatedPremium(double ProRatedPremium) {
		this.ProRatedPremium = ProRatedPremium;
	}
	public void setIncreasedLimits(String IncreasedLimits) {
		this.IncreasedLimits = IncreasedLimits;
	}
	public void setEvaluatedPremium(double EvaluatedPremium) {
		this.EvaluatedPremium = EvaluatedPremium;
	}
	public void setCoveragesHeader(String CoveragesHeader) {
		this.CoveragesHeader = CoveragesHeader;
	}
	public void setCombinedAllCoveragesDed(int CombinedAllCoveragesDed) {
		this.CombinedAllCoveragesDed = CombinedAllCoveragesDed;
	}
}