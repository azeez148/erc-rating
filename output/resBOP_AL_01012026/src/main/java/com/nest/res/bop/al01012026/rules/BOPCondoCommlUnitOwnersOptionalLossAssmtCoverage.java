package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;
	
	
	
	public void AddlCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() > MathHelper.getIntegerValue(10000.0)){
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() == this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible()){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondominiumCommercialUnitOwnersLossAssessmentDeductibleIncludedCharge",String.valueOf( 15000)))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondominiumCommercialUnitOwnersLossAssessmentDeductibleExcludedCharge",String.valueOf( 15000)))));
		}
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void SubLimitForCondominiumAssociationDeductiblePremium ()  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductiblePremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductibleLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void eachAdditional_1 ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional_1(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible()) / MathHelper.getDoubleValue(1000.0))));
		}
	  
	}
	public void EachAdditional1000Over10000LossCost ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000Over10000LossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - MathHelper.getDoubleValue(10.0)) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000Over10000())));
		}
		}
	  
	}
	public void EachAdditional1000UpTo5000LossCost ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000LossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000())));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000LossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000())));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) >= 1.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 5.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000LossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000())));
		}
		}
		}
		}
	  
	}
	public void SubLimitForDeductibleLossCostEachAdditional1000UpTo5000 () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) >= 1.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000UpTo5000(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedSubLimitForCondominiumAssociationDeductibleLossCost",String.valueOf( "EachAdditional1000UpTo5000")))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000UpTo5000(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void Premium ()  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremium(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getBasePremiumTemp() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductiblePremium() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getAddlIncrementPremiumTemp()));

	  
	}
	public void SubLimitForDeductibleLossCostEachAdditional1000From5000To10000 () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 5.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000From5000To10000(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedSubLimitForCondominiumAssociationDeductibleLossCost",String.valueOf( "EachAdditional1000From5000To10000")))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000From5000To10000(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	eachAdditional_1();
	
	SubLimitForDeductibleLossCostEachAdditional1000UpTo5000();
	
	SubLimitForDeductibleLossCostEachAdditional1000From5000To10000();
	
	eachAdditional1000From5000To10000Limit_1();
	
	EachAdditional1000From5000To10000LossCost();
	
	eachAdditional1000UpTo5000Limit_1();
	
	EachAdditional1000UpTo5000LossCost();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void eachAdditional1000UpTo5000Limit_1 ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000Limit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(5.0)));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000Limit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(5.0)));
		}
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Charge();
	
	AddlCharge();
	
	eachAdditional_1();
	
	SubLimitForDeductibleLossCostEachAdditional1000UpTo5000();
	
	SubLimitForDeductibleLossCostEachAdditional1000From5000To10000();
	
	SubLimitForDeductibleLossCostEachAdditional1000Over10000();
	
	EachAdditional1000Over10000LossCost();
	
	eachAdditional1000From5000To10000Limit_1();
	
	eachAdditional1000UpTo5000Limit_1();
	
	SubLimitForCondominiumAssociationDeductibleLossCost();
	
	SubLimitForCondominiumAssociationDeductiblePremium();
	
	BasePremiumTemp();
	
	AddlIncrementPremiumTemp();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage (com.nest.res.bop.al01012026.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage)  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage = BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void EachAdditional1000From5000To10000LossCost ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000LossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000From5000To10000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000())));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000LossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - MathHelper.getDoubleValue(5.0)) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000())));
		}
		}
		}
	  
	}
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() <= MathHelper.getIntegerValue(10000.0)){
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() == this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible()){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondominiumCommercialUnitOwnersLossAssessmentDeductibleIncludedCharge",String.valueOf(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit())))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondominiumCommercialUnitOwnersLossAssessmentDeductibleExcludedCharge",String.valueOf(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit())))));
		}
		}
		else{
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() == this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible()){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondominiumCommercialUnitOwnersLossAssessmentDeductibleIncludedCharge",String.valueOf( 10000)))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCharge(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondominiumCommercialUnitOwnersLossAssessmentDeductibleExcludedCharge",String.valueOf( 10000)))));
		}
		}
	  
	}
	public void BasePremiumTemp ()  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setBasePremiumTemp(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void AddlIncrementPremiumTemp ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() > MathHelper.getIntegerValue(10000.0)){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlIncrementPremiumTemp(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../CommercialPropertyLCM")))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()) - MathHelper.getDoubleValue(10000.0)) / MathHelper.getDoubleValue(5000.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../../../../IRPMFactor"))))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlIncrementPremiumTemp(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremium(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getBasePremiumTemp() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductiblePremium() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getAddlIncrementPremiumTemp()));

	  
	}
	public void eachAdditional1000From5000To10000Limit_1 ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000Limit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(5.0)));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000Limit_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1()) - MathHelper.getDoubleValue(5.0))));
		}
		}
		}
	  
	}
	public void SubLimitForDeductibleLossCostEachAdditional1000Over10000 () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000Over10000(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedSubLimitForCondominiumAssociationDeductibleLossCost",String.valueOf( "EachAdditional1000Over10000")))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000Over10000(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void SubLimitForCondominiumAssociationDeductibleLossCost ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > MathHelper.getIntegerValue(0.0) && this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() < this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()){
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000Over10000LossCost() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000From5000To10000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000())));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - MathHelper.getDoubleValue(5.0)) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000())));
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) >= 1.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / MathHelper.getIntegerValue(1000.0)) <= 5.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000())));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}