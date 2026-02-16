package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;
	
	
	
	public void AddlCharge () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() > (int)10000.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondoCommlUnitLossAssessCharge",String.valueOf( 15000))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setAddlCharge((double)0.0);
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
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage (com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage)  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage = BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage;

	  
	}
	public void SubLimitForCondominiumAssociationDeductibleLossCost ()  {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000Over10000LossCost() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000From5000To10000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000());
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - (double)5.0) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000() + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000());
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 1.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 5.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - (double)1.0) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000());
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductibleLossCost((double)0.0);
		}
		}
		}
	  
	}
	public void eachAdditional_1 ()  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional_1(MathHelper.roundUpDoller(Double.valueOf(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible()) / (double)1000.0));

	  
	}
	public void SubLimitForDeductibleLossCostEachAdditional1000From5000To10000 () throws LookupException,NumberFormatException {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 5.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000From5000To10000(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedSubLimitForCondominiumAssociationDeductibleLossCost",String.valueOf( "EachAdditional1000From5000To10000"))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000From5000To10000((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	ProcessPremium1_CommonRatingSub1();
	
	  
	}
	public void SubLimitForDeductibleLossCostEachAdditional1000Over10000 () throws LookupException,NumberFormatException {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000Over10000(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedSubLimitForCondominiumAssociationDeductibleLossCost",String.valueOf( "EachAdditional1000Over10000"))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000Over10000((double)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../../../../IRPMFactor")))) + this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductiblePremium());

		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() > (int)10000.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremium(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getPremium() + MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getAddlCharge() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../CommercialPropertyLCM")))) * MathHelper.roundUpDoller(((double)this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() - (double)10000.0) / (double)5000.0) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../../../../IRPMFactor")))));
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
	public void Charge () throws LookupException,NumberFormatException {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit() <= (int)10000.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondoCommlUnitLossAssessCharge",String.valueOf(BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getDsLimit()))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setCharge(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondoCommlUnitLossAssessCharge",String.valueOf( 10000))));
		}
	  
	}
	public void SubLimitForDeductibleLossCostEachAdditional1000UpTo5000 () throws LookupException,NumberFormatException {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 1.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000UpTo5000(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("IncreasedSubLimitForCondominiumAssociationDeductibleLossCost",String.valueOf( "EachAdditional1000UpTo5000"))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForDeductibleLossCostEachAdditional1000UpTo5000((double)0.0);
		}
	  
	}
	public void EachAdditional1000Over10000LossCost ()  {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000Over10000LossCost((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - (double)10.0) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000Over10000());
		}
	  
	}
	public void eachAdditional1000UpTo5000Limit_1 ()  {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000Limit_1((double)4.0);
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000Limit_1((double)4.0);
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getPremium() != (double)0.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void EachAdditional1000UpTo5000LossCost ()  {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000LossCost(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000());
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000LossCost(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000UpTo5000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000());
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 1.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 5.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000UpTo5000LossCost((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - (double)1.0) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000UpTo5000());
		}
		}
		}
	  
	}
	public void eachAdditional1000From5000To10000Limit_1 ()  {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000Limit_1((double)5.0);
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000Limit_1(Double.valueOf(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1()) - (double)5.0);
		}
		}
	  
	}
	public void SubLimitForCondominiumAssociationDeductiblePremium ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() > (int)1000.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductiblePremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductibleLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage,"../../../../../IRPMFactor")))));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setSubLimitForCondominiumAssociationDeductiblePremium((double)0.0);
		}
	  
	}
	public void EachAdditional1000From5000To10000LossCost ()  {
	  
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000LossCost(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional1000From5000To10000Limit_1() * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000());
		}
		else{
		if(MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) > 5.0 && MathHelper.roundUpDoller(this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForCondominiumAssociationDeductible() / (int)1000.0) <= 10.0){
			this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.setEachAdditional1000From5000To10000LossCost((this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getEachAdditional_1() - (double)5.0) * this.BOPCondoCommlUnitOwnersOptionalLossAssmtCoverage.getSubLimitForDeductibleLossCostEachAdditional1000From5000To10000());
		}
		}
	  
	}
	
	
	
	
	


	
}