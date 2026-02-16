package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;
	
	
	
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../EachOccLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../ProdCompldOpsAggregateLimit"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../AggregateLimit"))).equals((String)"")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setIncrLimitFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../../EachOccLimit ")),((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../../ProdCompldOpsAggregateLimit ")),((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../../AggregateLimit")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setIncrLimitFactor((double)0.0);
		}
	  
	}
	public void RatingLimit ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Limit of Insurance")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setRatingLimit(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) + this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFuncBPPVlnTotalLimit_1()) / (double)100.0);
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Gross Sales") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Payroll")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setRatingLimit((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../Exposure"))) / (double)1000.0);
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setRatingLimit((double)0.0);
		}
		}
	  
	}
	public  BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage (com.nest.res.bop.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage)  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage = BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	funcBPPVlnTotalLimit_1();
	
	RatingLimit();
	
	BaseRate();
	
	BaseRateRABOP();
	
	ClassGroupFactor();
	
	IncrLimitFactor();
	
	CombinedBaseRate();
	
	bopPropDamageLiabDedFactor_1();
	
	FinalRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Gross Sales")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))).equals((String)"")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesRate",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../RatingTerritory")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate((double)0.0);
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Payroll")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))).equals((String)"")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollRate",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../RatingTerritory")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate((double)0.0);
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Limit of Insurance")){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals((String)"Yes"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))).equals((String)"")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRate",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../RatingTerritory")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate((double)0.0);
		}
		}
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate((double)0.0);
		}
		}
		}
	  
	}
	public void Premium ()  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFinalRate() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getRatingLimit()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void BaseRateRABOP () throws LookupException,NumberFormatException {
	  
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Gross Sales"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Payroll"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Limit of Insurance")){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals((String)"Yes")){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals((String)"Smoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals((String)"Other")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals((String)"Other")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPS",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../ZipCodeOverride")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP((double)0.0);
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals((String)"Unsmoothed")){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals((String)"") && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals((String)"Other")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../ZipCode")))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals((String)"") && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals((String)"Other")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPU",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../../../ZipCodeOverride")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP((double)0.0);
		}
		}
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP((double)0.0);
		}
		}
		}
		}
		}
		}
	  
	}
	public void FinalRate ()  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getCombinedBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../LCM"))) * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getIncrLimitFactor() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBopPropDamageLiabDedFactor_1()));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getPremium() != (double)0.0){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void funcBPPVlnTotalLimit_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Limit of Insurance")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setFuncBPPVlnTotalLimit_1((double)0.0);
		for( Policy policy : XpathNode.selectNodes(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setFuncBPPVlnTotalLimit_1(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFuncBPPVlnTotalLimit_1()+Double.valueOf(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFuncBPPVlnTotalLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))));
		}

		}
	  
	}
	public void ClassGroupFactor () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Gross Sales")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesClassFactor",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../ClassGroup")))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Annual Payroll")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollClassFactor",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../ClassGroup")))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Limit of Insurance")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceClassFactor",((String)XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage," ../ClassGroup")))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor((double)0.0);
		}
		}
		}
	  
	}
	public void CombinedBaseRate ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals((String)"Yes") && ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals((String)"Smoothed") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals((String)"Unsmoothed")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals((String)"Limit of Insurance")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setCombinedBaseRate(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBaseRateRABOP() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getClassGroupFactor());
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setCombinedBaseRate(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBaseRate() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getClassGroupFactor());
		}
	  
	}
	public void bopPropDamageLiabDedFactor_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassCode"))).equals((String)"75601") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassCode"))).equals((String)"75611") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassCode"))).equals((String)"75631") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassCode"))).equals((String)"75641")){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../PropDamageLiabDed"))).equals((String)"250")){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBopPropDamageLiabDedFactor_1((double)1.0);
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBopPropDamageLiabDedFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../PropDamageLiabDedFactor"))));
		}
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBopPropDamageLiabDedFactor_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../PropDamageLiabDedFactor"))));
		}
	  
	}
	
	
	
	
	


	
}