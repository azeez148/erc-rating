package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg  {

	
	
	
	private com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;
	
	
	
	public void RelatedExpensesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRelatedExpensesPremium(MathHelper.roundUpDoller(MathHelper.roundToHundred(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesRate() * (double)this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpenses() / (double)100.0) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../../../IRPMFactor")))));

	  
	}
	public void buildingCoveragePremium_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BOPStructureBuildingCoverage/Premium"))) != null){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setBuildingCoveragePremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BOPStructureBuildingCoverage/Premium"))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setBuildingCoveragePremium_1((double)0.0);
		}
	  
	}
	public void PeriodOfRestorationFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestoration().equals((String)"")){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPeriodOfRestorationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationGreenUpgradesFactor",String.valueOf(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestoration()))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPeriodOfRestorationFactor((double)0.0);
		}
	  
	}
	public void PeriodOfRestorationPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPeriodOfRestorationPremium(MathHelper.roundUpDoller(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getBuildingCoveragePremium_1() * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestorationFactor()));

	  
	}
	public void IncreasedCostOfLossPercentConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals((String)"")){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setIncreasedCostOfLossPercentConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedCostOfLossPercentConverted",String.valueOf(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct()))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setIncreasedCostOfLossPercentConverted((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremium(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getGreenUpgradesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestorationPremium());

	  
	}
	public void RatioToUse ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRatioToUse((int)this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRatio() * (int)1000.0);

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void RateModificationFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRateModificationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateModificationFactor",String.valueOf(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRatioToUse()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPremium() != (double)0.0){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg (com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg)  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg = BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;

	  
	}
	public void calcRatio_1 ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() > (int)0.0 && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals((String)"")){
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getLimitToUse_1() != (double)0.0){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setCalcRatio_1(MathHelper.roundToThousand(Double.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit()) / Double.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getLimitToUse_1())));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setCalcRatio_1((double)0.0);
		}
		}
	  
	}
	public void GreenUpgradesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setGreenUpgradesPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../FinalBuildingRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRateModificationFactor()) * MathHelper.roundToHundred((double)this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../../../IRPMFactor")))));

	  
	}
	public void RelatedExpensesRate ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRelatedExpensesRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../FinalBuildingRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesFactor()));

	  
	}
	public void RelatedExpensesFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRelatedExpensesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RelatedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void limitToUse_1 ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() > (int)0.0 && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals((String)"")){
		if(((XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BuildingLimit"))) != null){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setLimitToUse_1((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BuildingLimit"))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setLimitToUse_1((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncreasedCostOfLossPercentConverted();
	
	RelatedExpensesFactor();
	
	limitToUse_1();
	
	calcRatio_1();
	
	Ratio();
	
	RatioToUse();
	
	PeriodOfRestorationFactor();
	
	RateModificationFactor();
	
	GreenUpgradesPremium();
	
	RelatedExpensesRate();
	
	RelatedExpensesPremium();
	
	buildingCoveragePremium_1();
	
	PeriodOfRestorationPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Ratio ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() > (int)0.0 && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals((String)"")){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRatio(MathHelper.roundToThousand(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getCalcRatio_1() / this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPercentConverted()));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRatio((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}