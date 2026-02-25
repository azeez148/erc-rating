package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureElectronicDataLiabilityLimitedCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPStructureElectronicDataLiabilityLimitedCoverage BOPStructureElectronicDataLiabilityLimitedCoverage;
	
	
	
	public void AggregateLimit ()  {
	  
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("300,000"))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("600,000")));
		}
		else{
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("500,000"))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("1,000,000")));
		}
		else{
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("1,000,000"))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("2,000,000")));
		}
		else{
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("2,000,000"))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("4,000,000")));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
		}
		}
	  
	}
	public void FinalRate ()  {
	  this.BOPStructureElectronicDataLiabilityLimitedCoverage.setFinalRate(null);

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LossOfElectronicDataLimit();
	
	AggregateLimit();
	
	IncreasedLimitsFactor();
	
	DedFactor();
	
	AdjustedBaseRate();
	
	HazardGrade();
	
	LossOfElectronicDataFactor();
	
	FinalRate();
	
	MinimumPremium();
	
	totalArea_1();
	
	totalCondominiumBuildingSquareFootage_1();
	
	condominiumBuildingLimitOfInsurance_1();
	
	EvaluatedPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void totalCondominiumBuildingSquareFootage_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalCondominiumBuildingSquareFootage")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalCondominiumBuildingSquareFootage"))) != 0){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setTotalCondominiumBuildingSquareFootage_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalCondominiumBuildingSquareFootage")))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setTotalCondominiumBuildingSquareFootage_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void EvaluatedPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium")) && this.BOPStructureElectronicDataLiabilityLimitedCoverage.getTotalCondominiumBuildingSquareFootage_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setEvaluatedPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getFinalRate() * ((this.BOPStructureElectronicDataLiabilityLimitedCoverage.getTotalArea_1() / this.BOPStructureElectronicDataLiabilityLimitedCoverage.getTotalCondominiumBuildingSquareFootage_1()) * (this.BOPStructureElectronicDataLiabilityLimitedCoverage.getCondominiumBuildingLimitOfInsurance_1() / MathHelper.getDoubleValue(100.0)))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../IRPMFactor"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setEvaluatedPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getFinalRate() * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setEvaluatedPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AdjustedBaseRate ()  {
	  this.BOPStructureElectronicDataLiabilityLimitedCoverage.setAdjustedBaseRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CombinedBaseRate"))) * this.BOPStructureElectronicDataLiabilityLimitedCoverage.getIncreasedLimitsFactor() * this.BOPStructureElectronicDataLiabilityLimitedCoverage.getDedFactor()));

	  
	}
	public void HazardGrade () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassCode")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassCode"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataLimitedCovHazardGrade",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassCode"))))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public  BOPStructureElectronicDataLiabilityLimitedCoverage (com.nest.res.bop.al01012026.domain.BOPStructureElectronicDataLiabilityLimitedCoverage BOPStructureElectronicDataLiabilityLimitedCoverage)  {
	  this.BOPStructureElectronicDataLiabilityLimitedCoverage = BOPStructureElectronicDataLiabilityLimitedCoverage;

	  
	}
	public void IncreasedLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructureElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("")) || !this.BOPStructureElectronicDataLiabilityLimitedCoverage.getAggregateLimit().equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit()),String.valueOf(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getAggregateLimit()),String.valueOf(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getAggregateLimit())))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
		if(((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../ElectronicDataLiabilityCovOption")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../ElectronicDataLiabilityCovOption"))).equals(MathHelper.getStringValue("Electronic Data Liability Limited Coverage"))) && ((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion")) != null || (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException")) != null || (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null)){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void MinimumPremium () throws LookupException,NumberFormatException {
	  this.BOPStructureElectronicDataLiabilityLimitedCoverage.setMinimumPremium(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataLimitedCovMinimumPremium",String.valueOf( "Y"))));

	  
	}
	public void condominiumBuildingLimitOfInsurance_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CondominiumBuildingLimitOfInsurance")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CondominiumBuildingLimitOfInsurance"))) != 0){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setCondominiumBuildingLimitOfInsurance_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CondominiumBuildingLimitOfInsurance")))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setCondominiumBuildingLimitOfInsurance_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium() >= this.BOPStructureElectronicDataLiabilityLimitedCoverage.getMinimumPremium()){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getMinimumPremium()));
		}
	  
	}
	public void LossOfElectronicDataLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion")) != null && (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion/LossOfElectronicDataLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion/LossOfElectronicDataLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion/LossOfElectronicDataLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException")) != null && (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException/LossOfElectronicDataLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException/LossOfElectronicDataLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException/LossOfElectronicDataLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null && (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/LossOfElectronicDataLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/LossOfElectronicDataLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/LossOfElectronicDataLimit")))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
		}
	  
	}
	public void LossOfElectronicDataFactor () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion")) != null || (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null) && !this.BOPStructureElectronicDataLiabilityLimitedCoverage.getHazardGrade().equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataFactorBP0595",String.valueOf(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getHazardGrade())))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException")) != null && !this.BOPStructureElectronicDataLiabilityLimitedCoverage.getHazardGrade().equals(MathHelper.getStringValue(""))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataFactorBP1805",String.valueOf(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getHazardGrade())))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void totalArea_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalArea")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalArea"))) != 0){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setTotalArea_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalArea")))));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setTotalArea_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void DedFactor ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../ClassCode"))).equals(MathHelper.getStringValue("75611"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../PropDamageLiabDed"))).equals(MathHelper.getStringValue("250"))){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../PropDamageLiabDedFactor")))));
		}
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage,"../../../PropDamageLiabDedFactor")))));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium() >= this.BOPStructureElectronicDataLiabilityLimitedCoverage.getMinimumPremium()){
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPStructureElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureElectronicDataLiabilityLimitedCoverage.getMinimumPremium()));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}