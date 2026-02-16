package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;
	
	
	
	public void Ratio ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() > MathHelper.getIntegerValue(0.0) && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals(MathHelper.getStringValue(""))){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRatio(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getCalcRatio_1() / this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPercentConverted())));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRatio(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RelatedExpensesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRelatedExpensesPremium(MathHelper.roundUpDoller(MathHelper.roundToHundred(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesRate() * MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpenses()) / MathHelper.getDoubleValue(100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../../../IRPMFactor")))));

	  
	}
	public void GreenUpgradesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setGreenUpgradesPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../FinalBuildingRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRateModificationFactor()) * MathHelper.roundToHundred(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../../../IRPMFactor")))));

	  
	}
	public void RateModificationFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRateModificationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateModificationFactor",String.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRatioToUse()))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void buildingCoveragePremium_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BOPStructureBuildingCoverage/Premium")) != null){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setBuildingCoveragePremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BOPStructureBuildingCoverage/Premium")))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setBuildingCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
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
	public void setTotalPremiumForCoverage ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremium(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getGreenUpgradesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestorationPremium()));

	  
	}
	public void IncreasedCostOfLossPercentConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals(MathHelper.getStringValue(""))){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setIncreasedCostOfLossPercentConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedCostOfLossPercentConverted",String.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct())))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setIncreasedCostOfLossPercentConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremium(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getGreenUpgradesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestorationPremium()));

	  
	}
	public void PeriodOfRestorationFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestoration().equals(MathHelper.getStringValue(""))){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPeriodOfRestorationFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationGreenUpgradesFactor",String.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestoration())))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPeriodOfRestorationFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RatioToUse ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRatioToUse(MathHelper.getIntegerValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRatio() * MathHelper.getIntegerValue(1000.0)));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void limitToUse_1 ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() > MathHelper.getIntegerValue(0.0) && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals(MathHelper.getStringValue(""))){
		if((XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BuildingLimit")) != null){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setLimitToUse_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../BuildingLimit")))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setLimitToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void calcRatio_1 ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit() > MathHelper.getIntegerValue(0.0) && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getIncreasedCostOfLossPct().equals(MathHelper.getStringValue(""))){
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getLimitToUse_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setCalcRatio_1(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getDsLimit()) / MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getLimitToUse_1()))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setCalcRatio_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void RelatedExpensesRate ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRelatedExpensesRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg,"../FinalBuildingRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getRelatedExpensesFactor()));

	  
	}
	public  BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg (com.nest.res.bop.al09012019.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg)  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg = BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg;

	  
	}
	public void PeriodOfRestorationPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setPeriodOfRestorationPremium(MathHelper.roundUpDoller(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getBuildingCoveragePremium_1() * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.getPeriodOfRestorationFactor()));

	  
	}
	public void RelatedExpensesFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBldg.setRelatedExpensesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RelatedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}