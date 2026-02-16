package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureLiabMedExpensesBldgCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage;
	
	
	
	public void structBuildingLimit ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../BuildingLimit"))) != 0){
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructBuildingLimit(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../BuildingLimit")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructBuildingLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium")) && this.BOPStructureLiabMedExpensesBldgCoverage.getTotalCondominiumBuildingSquareFootage() != MathHelper.getIntegerValue(0.0)){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureLiabMedExpensesBldgCoverage.getFinalRate() * ((MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea()) / MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalCondominiumBuildingSquareFootage())) * (MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getCondominiumBuildingLimitOfInsurance()) / MathHelper.getDoubleValue(100.0)))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../IRPMFactor"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureLiabMedExpensesBldgCoverage.getFinalRate() * (this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void totalArea_1 ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() > MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		for( Policy policy : XpathNode.selectNodes(BOPStructureLiabMedExpensesBldgCoverage,"../BOPClassification") ){
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea_1(MathHelper.getIntegerValue(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"Area")))));
		}

		}
	  
	}
	public void IncrLimitFactor () throws LookupException,NumberFormatException {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../EachOccLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../ProdCompldOpsAggregateLimit"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../AggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../EachOccLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../ProdCompldOpsAggregateLimit")),String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../AggregateLimit"))))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setIncrLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("10% or less"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("17")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("19")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("20")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("21")))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void FinalRate ()  {
	  this.BOPStructureLiabMedExpensesBldgCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPStructureLiabMedExpensesBldgCoverage.getCombinedBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../LCM"))) * this.BOPStructureLiabMedExpensesBldgCoverage.getIncrLimitFactor() * this.BOPStructureLiabMedExpensesBldgCoverage.getPropDamageLiabDedFactor()));

	  
	}
	public void BaseRateRABOP () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals(MathHelper.getStringValue("Smoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPS",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCodeOverride"))))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals(MathHelper.getStringValue("Unsmoothed"))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals(MathHelper.getStringValue("")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCodeOverride"))).equals(MathHelper.getStringValue("")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCode"))).equals(MathHelper.getStringValue("Other"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRateRABOPU",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../ZipCodeOverride"))))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateRABOP(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium")) && this.BOPStructureLiabMedExpensesBldgCoverage.getTotalCondominiumBuildingSquareFootage() != MathHelper.getIntegerValue(0.0)){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureLiabMedExpensesBldgCoverage.getFinalRate() * ((MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea()) / MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalCondominiumBuildingSquareFootage())) * (MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getCondominiumBuildingLimitOfInsurance()) / MathHelper.getDoubleValue(100.0)))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../IRPMFactor"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureLiabMedExpensesBldgCoverage.getFinalRate() * (this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void TotalArea ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructBuildingLimit() > MathHelper.getIntegerValue(0.0) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea(MathHelper.getIntegerValue(this.BOPStructureLiabMedExpensesBldgCoverage.getTotalArea_1()));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setTotalArea(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void structClassCode ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassCode"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassCode(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassCode")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassCode(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CombinedBaseRate ()  {
	  this.BOPStructureLiabMedExpensesBldgCoverage.setCombinedBaseRate(MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getBaseRateToUse_1() * this.BOPStructureLiabMedExpensesBldgCoverage.getClassGroupFactor()));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void baseRateToUse_1 ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals(MathHelper.getStringValue("Smoothed")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals(MathHelper.getStringValue("Unsmoothed")))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getBaseRateRABOP())));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPStructureLiabMedExpensesBldgCoverage.getBaseRate())));
		}
	  
	}
	public void structClassGroup ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassGroup(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../ClassGroup")))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setStructClassGroup(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void ClassGroupFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("51")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("52")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("53")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("54")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("55")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("56")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("57")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("58")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue("59"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsContrctrsClassFactor",String.valueOf(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup()),String.valueOf(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode())))));
		}
		else{
		if(!this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup().equals(MathHelper.getStringValue(""))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsClassFactor",String.valueOf(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassGroup())))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setClassGroupFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void propDamageLiabDedFactor ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals(MathHelper.getStringValue("75601")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals(MathHelper.getStringValue("75611")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals(MathHelper.getStringValue("75631")) || this.BOPStructureLiabMedExpensesBldgCoverage.getStructClassCode().equals(MathHelper.getStringValue("75641"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../PropDamageLiabDed"))).equals(MathHelper.getStringValue("250"))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPropDamageLiabDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPropDamageLiabDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../PropDamageLiabDedFactor")))));
		}
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPropDamageLiabDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../../PropDamageLiabDedFactor")))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	structClassCode();
	
	structClassGroup();
	
	structBuildingLimit();
	
	BaseRateRABOP();
	
	BaseRate();
	
	ClassGroupFactor();
	
	IncrLimitFactor();
	
	propDamageLiabDedFactor();
	
	baseRateToUse_1();
	
	CombinedBaseRate();
	
	FinalRate();
	
	totalArea_1();
	
	TotalArea();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureLiabMedExpensesBldgCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPStructureLiabMedExpensesBldgCoverage (com.nest.res.bop.al09012019.domain.BOPStructureLiabMedExpensesBldgCoverage BOPStructureLiabMedExpensesBldgCoverage)  {
	  this.BOPStructureLiabMedExpensesBldgCoverage = BOPStructureLiabMedExpensesBldgCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals(MathHelper.getStringValue("Smoothed")))){
		if(!((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue("Yes")) && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../RABOPTypeLiabilityLessors"))).equals(MathHelper.getStringValue("Unsmoothed")))){
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../RatingTerritory"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabMedExpensesLessorsRate",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureLiabMedExpensesBldgCoverage,"../../RatingTerritory"))))));
		}
		else{
			this.BOPStructureLiabMedExpensesBldgCoverage.setBaseRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	
	
	
	
	


	
}