package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP  {

	
	
	
	private com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;
	
	
	
	public void RelatedExpensesFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRelatedExpensesFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RelatedExpensesFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void bppCoveragePremium_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))) != null){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setBppCoveragePremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setBppCoveragePremium_1((double)0.0);
		}
	  
	}
	public void RatioToUse ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRatioToUse((int)this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRatio() * (int)1000.0);

	  
	}
	public void GreenUpgradesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setGreenUpgradesPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../FinalBusnPrsnlPropRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRateModificationFactor()) * MathHelper.roundToHundred((double)this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getDsLimit() / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../../../../IRPMFactor")))));

	  
	}
	public void RelatedExpensesRate ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRelatedExpensesRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../FinalBusnPrsnlPropRate"))) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesFactor()));

	  
	}
	public void calcRatio_1 ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getDsLimit() > (int)0.0 && !this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPct().equals((String)"") && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../TotBusnPrsnlPropLimit"))) > (int)0.0){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setCalcRatio_1(MathHelper.roundToThousand(Double.valueOf(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getDsLimit()) / (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../TotBusnPrsnlPropLimit")))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setCalcRatio_1((double)0.0);
		}
	  
	}
	public void RelatedExpensesPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRelatedExpensesPremium(MathHelper.roundUpDoller(MathHelper.roundToHundred(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesRate() * (double)this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpenses() / (double)100.0) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../../../../IRPMFactor")))));

	  
	}
	public void PeriodOfRestorationFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestoration().equals((String)"")){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPeriodOfRestorationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationGreenUpgradesFactor",String.valueOf(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestoration()))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPeriodOfRestorationFactor((double)0.0);
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
	public void IncreasedCostOfLossPercentConverted () throws LookupException,NumberFormatException {
	  
		if(!this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPct().equals((String)"")){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setIncreasedCostOfLossPercentConverted(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedCostOfLossPercentConverted",String.valueOf(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPct()))));
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setIncreasedCostOfLossPercentConverted((double)0.0);
		}
	  
	}
	public void RateModificationFactor () throws LookupException,NumberFormatException {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRateModificationFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("RateModificationFactor",String.valueOf(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRatioToUse()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPremium() != (double)0.0){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Ratio ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setRatio(MathHelper.roundToThousand(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getCalcRatio_1() / this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getIncreasedCostOfLossPercentConverted()));

	  
	}
	public void FunctlBusnPrsnlPropValtnPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setFunctlBusnPrsnlPropValtnPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail/BOPFunctlBusnPrsnlPropValtnCoverage") ){

		if((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))) != 0.0){
			this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setFunctlBusnPrsnlPropValtnPremium(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getFunctlBusnPrsnlPropValtnPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium"))));
		}		}

	  
	}
	public  BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP (com.nest.res.bop.domain.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP)  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP = BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP;

	  
	}
	public void PeriodOfRestorationPremium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPeriodOfRestorationPremium(MathHelper.roundUpDoller((this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getBppCoveragePremium_1() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getFunctlBusnPrsnlPropValtnPremium()) * this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestorationFactor()));

	  
	}
	public void Premium ()  {
	  this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.setPremium(this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getGreenUpgradesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getRelatedExpensesPremium() + this.BOPIncreasedCostOfLossAndRelatedExpensesForGreenUpgradesBPP.getPeriodOfRestorationPremium());

	  
	}
	
	
	
	
	


	
}