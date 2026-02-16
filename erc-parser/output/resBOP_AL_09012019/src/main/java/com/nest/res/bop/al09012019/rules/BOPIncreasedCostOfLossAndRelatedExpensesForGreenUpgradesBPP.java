package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremium(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getGreenUpgradesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestorationPremium()));

	  
	}
	public void FunctlBusnPrsnlPropValtnPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setFunctlBusnPrsnlPropValtnPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setFunctlBusnPrsnlPropValtnPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getFunctlBusnPrsnlPropValtnPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))))));
		}		}

	  
	}
	public void calcRatio_1 ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getDsLimit() > MathHelper.getIntegerValue(0.0) && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPct().equals(MathHelper.getStringValue("")) && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../TotBusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setCalcRatio_1(MathHelper.getDoubleValue(MathHelper.roundToThousand(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getDsLimit()) / (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../TotBusnPrsnlPropLimit"))))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setCalcRatio_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PeriodOfRestorationPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPeriodOfRestorationPremium(MathHelper.roundUpDoller((this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getBppCoveragePremium_1() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getFunctlBusnPrsnlPropValtnPremium()) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestorationFactor()));

	  
	}
	public  BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP (com.nest.res.bop.al09012019.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP)  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP = BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void IncreasedCostOfLossPercentConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPct().equals(MathHelper.getStringValue(""))){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setIncreasedCostOfLossPercentConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedCostOfLossPercentConverted",String.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPct())))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setIncreasedCostOfLossPercentConverted(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RateModificationFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRateModificationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateModificationFactor",String.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRatioToUse()))));

	  
	}
	public void GreenUpgradesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setGreenUpgradesPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../FinalBusnPrsnlPropRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRateModificationFactor()) * MathHelper.roundToHundred(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../../../../IRPMFactor")))));

	  
	}
	public void Ratio ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRatio(MathHelper.roundToThousand(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getCalcRatio_1() / this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPercentConverted()));

	  
	}
	public void PeriodOfRestorationFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestoration().equals(MathHelper.getStringValue(""))){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPeriodOfRestorationFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationGreenUpgradesFactor",String.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestoration())))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPeriodOfRestorationFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncreasedCostOfLossPercentConverted();
	
	RelatedExpensesFactor();
	
	calcRatio_1();
	
	Ratio();
	
	RatioToUse();
	
	PeriodOfRestorationFactor();
	
	RateModificationFactor();
	
	GreenUpgradesPremium();
	
	RelatedExpensesRate();
	
	RelatedExpensesPremium();
	
	bppCoveragePremium_1();
	
	FunctlBusnPrsnlPropValtnPremium();
	
	PeriodOfRestorationPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremium(MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getGreenUpgradesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestorationPremium()));

	  
	}
	public void RelatedExpensesRate ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRelatedExpensesRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../FinalBusnPrsnlPropRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesFactor()));

	  
	}
	public void RelatedExpensesFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRelatedExpensesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RelatedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void bppCoveragePremium_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../BOPClassificationBusnPrsnlPropCoverage/Premium")) != null){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setBppCoveragePremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setBppCoveragePremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void RatioToUse ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRatioToUse(MathHelper.getIntegerValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRatio() * MathHelper.getIntegerValue(1000.0)));

	  
	}
	public void RelatedExpensesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRelatedExpensesPremium(MathHelper.roundUpDoller(MathHelper.roundToHundred(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesRate() * MathHelper.getDoubleValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpenses()) / MathHelper.getDoubleValue(100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}