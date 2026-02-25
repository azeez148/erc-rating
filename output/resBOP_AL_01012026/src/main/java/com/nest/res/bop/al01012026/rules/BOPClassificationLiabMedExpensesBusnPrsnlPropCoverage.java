package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CombinedBaseRate ()  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setCombinedBaseRate(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBaseRateToUse_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../LCM")))) * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getClassGroupFactor()));

	  
	}
	public void bopPropDamageLiabDedFactor_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassCode"))).equals(MathHelper.getStringValue("75611"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../PropDamageLiabDed"))).equals(MathHelper.getStringValue("250"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBopPropDamageLiabDedFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBopPropDamageLiabDedFactor_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../PropDamageLiabDedFactor")))));
		}
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBopPropDamageLiabDedFactor_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../PropDamageLiabDedFactor")))));
		}
	  
	}
	public void baseRateToUse_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed"))) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBaseRateRABOP())));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBaseRate())));
		}
	  
	}
	public void Premium ()  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFinalRate() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getRatingLimit()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void funcBPPVlnTotalLimit_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Limit of Insurance"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setFuncBPPVlnTotalLimit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../BOPFunctlBusnPrsnlPropValtn/BOPFunctlBusnPrsnlPropValtnDetail") ){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setFuncBPPVlnTotalLimit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFuncBPPVlnTotalLimit_1()) + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit")))));
		}

		}
	  
	}
	public void RatingLimit ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Limit of Insurance"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setRatingLimit(MathHelper.getDoubleValue(MathHelper.getDoubleValue(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) + this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFuncBPPVlnTotalLimit_1()) / MathHelper.getDoubleValue(100.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Gross Sales")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Payroll"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setRatingLimit(MathHelper.getDoubleValue(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../Exposure"))) / MathHelper.getDoubleValue(1000.0))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setRatingLimit(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	funcBPPVlnTotalLimit_1();
	
	RatingLimit();
	
	BaseRateRABOP();
	
	BaseRate();
	
	ClassGroupFactor();
	
	IncrLimitFactor();
	
	baseRateToUse_1();
	
	CombinedBaseRate();
	
	bopPropDamageLiabDedFactor_1();
	
	FinalRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%")) && (!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../EachOccLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../ProdCompldOpsAggregateLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../AggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../EachOccLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../ProdCompldOpsAggregateLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../AggregateLimit"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BaseRateRABOP () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Gross Sales"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Payroll"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Limit of Insurance"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../ZipCodeOverride"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		}
		}
		}
	  
	}
	public  BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage)  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage = BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getFinalRate() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getRatingLimit()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Gross Sales"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Payroll"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Limit of Insurance"))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Smoothed")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../RABOPTypeLiabilityOccupants"))).equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceRate",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../../../RatingTerritory"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void FinalRate ()  {
	  this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getCombinedBaseRate() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getIncrLimitFactor() * this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.getBopPropDamageLiabDedFactor_1()));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ClassGroupFactor () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Gross Sales"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualGrossSalesClassFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassGroup"))))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Annual Payroll"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesAnnualPayrollClassFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassGroup"))))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ExposureBasis"))).equals(MathHelper.getStringValue("Limit of Insurance"))){
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLimitOfInsuranceClassFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage,"../ClassGroup"))))));
		}
		else{
			this.BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	
	
	
	
	


	
}