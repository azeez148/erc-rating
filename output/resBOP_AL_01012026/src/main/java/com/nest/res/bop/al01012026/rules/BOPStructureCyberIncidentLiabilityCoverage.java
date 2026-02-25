package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureCyberIncidentLiabilityCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPStructureCyberIncidentLiabilityCoverage BOPStructureCyberIncidentLiabilityCoverage;
	
	
	
	public void EachCyberIncidentOccurrenceLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits")) != null && (XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/EachCyberIncidentOccurrenceLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/EachCyberIncidentOccurrenceLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setEachCyberIncidentOccurrenceLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/EachCyberIncidentOccurrenceLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null && (XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/EachCyberIncidentOccurrenceLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/EachCyberIncidentOccurrenceLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setEachCyberIncidentOccurrenceLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/EachCyberIncidentOccurrenceLimit")))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setEachCyberIncidentOccurrenceLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void totalArea_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalArea")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalArea"))) != 0){
			this.BOPStructureCyberIncidentLiabilityCoverage.setTotalArea_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalArea")))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setTotalArea_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPStructureCyberIncidentLiabilityCoverage.getEvaluatedPremium() >= this.BOPStructureCyberIncidentLiabilityCoverage.getMinimumPremium()){
			this.BOPStructureCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureCyberIncidentLiabilityCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureCyberIncidentLiabilityCoverage.getMinimumPremium()));
		}
	  
	}
	public void DedFactor ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassCode"))).equals(MathHelper.getStringValue("75611"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../PropDamageLiabDed"))).equals(MathHelper.getStringValue("250"))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../PropDamageLiabDedFactor")))));
		}
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../PropDamageLiabDedFactor")))));
		}
	  
	}
	public void IncreasedLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructureCyberIncidentLiabilityCoverage.getCyberIncidentAggregateLimit().equals(MathHelper.getStringValue("")) && !this.BOPStructureCyberIncidentLiabilityCoverage.getEachCyberIncidentOccurrenceLimit().equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(this.BOPStructureCyberIncidentLiabilityCoverage.getEachCyberIncidentOccurrenceLimit()),String.valueOf(this.BOPStructureCyberIncidentLiabilityCoverage.getCyberIncidentAggregateLimit()),String.valueOf(this.BOPStructureCyberIncidentLiabilityCoverage.getCyberIncidentAggregateLimit())))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
		if(((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../CyberIncidentLiabilityCovOption")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../CyberIncidentLiabilityCovOption"))).equals(MathHelper.getStringValue("Cyber Incident Liability Coverage"))) && ((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits")) != null || (XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null)){
			this.BOPStructureCyberIncidentLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void HazardGrade () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassCode")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassCode"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentLiabHazardGrade",String.valueOf(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../ClassCode"))))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void EvaluatedPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium")) && this.BOPStructureCyberIncidentLiabilityCoverage.getTotalCondominiumBuildingSquareFootage_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureCyberIncidentLiabilityCoverage.setEvaluatedPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureCyberIncidentLiabilityCoverage.getFinalRate() * ((this.BOPStructureCyberIncidentLiabilityCoverage.getTotalArea_1() / this.BOPStructureCyberIncidentLiabilityCoverage.getTotalCondominiumBuildingSquareFootage_1()) * (this.BOPStructureCyberIncidentLiabilityCoverage.getCondominiumBuildingLimitOfInsurance_1() / MathHelper.getDoubleValue(100.0)))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../IRPMFactor"))))));
		}
		else{
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../PropertyType"))).equals(MathHelper.getStringValue("Office Condominium"))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setEvaluatedPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPStructureCyberIncidentLiabilityCoverage.getFinalRate() * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../IRPMFactor"))))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setEvaluatedPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureCyberIncidentLiabilityCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureCyberIncidentLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void condominiumBuildingLimitOfInsurance_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CondominiumBuildingLimitOfInsurance")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CondominiumBuildingLimitOfInsurance"))) != 0){
			this.BOPStructureCyberIncidentLiabilityCoverage.setCondominiumBuildingLimitOfInsurance_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CondominiumBuildingLimitOfInsurance")))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setCondominiumBuildingLimitOfInsurance_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CyberIncidentLiabilityFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPStructureCyberIncidentLiabilityCoverage.getHazardGrade().equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setCyberIncidentLiabilityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentLiabilityFactor",String.valueOf(this.BOPStructureCyberIncidentLiabilityCoverage.getHazardGrade())))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setCyberIncidentLiabilityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPStructureCyberIncidentLiabilityCoverage (com.nest.res.bop.al01012026.domain.BOPStructureCyberIncidentLiabilityCoverage BOPStructureCyberIncidentLiabilityCoverage)  {
	  this.BOPStructureCyberIncidentLiabilityCoverage = BOPStructureCyberIncidentLiabilityCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPStructureCyberIncidentLiabilityCoverage.getEvaluatedPremium() >= this.BOPStructureCyberIncidentLiabilityCoverage.getMinimumPremium()){
			this.BOPStructureCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureCyberIncidentLiabilityCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPStructureCyberIncidentLiabilityCoverage.getMinimumPremium()));
		}
	  
	}
	public void totalCondominiumBuildingSquareFootage_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalCondominiumBuildingSquareFootage")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalCondominiumBuildingSquareFootage"))) != 0){
			this.BOPStructureCyberIncidentLiabilityCoverage.setTotalCondominiumBuildingSquareFootage_1(MathHelper.getDoubleValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/TotalCondominiumBuildingSquareFootage")))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setTotalCondominiumBuildingSquareFootage_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	EachCyberIncidentOccurrenceLimit();
	
	CyberIncidentAggregateLimit();
	
	IncreasedLimitsFactor();
	
	DedFactor();
	
	AdjustedBaseRate();
	
	HazardGrade();
	
	CyberIncidentLiabilityFactor();
	
	FinalRate();
	
	MinimumPremium();
	
	totalArea_1();
	
	totalCondominiumBuildingSquareFootage_1();
	
	condominiumBuildingLimitOfInsurance_1();
	
	EvaluatedPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void MinimumPremium () throws LookupException,NumberFormatException {
	  this.BOPStructureCyberIncidentLiabilityCoverage.setMinimumPremium(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentLiabilityCovMinimumPremium",String.valueOf( "Y"))));

	  
	}
	public void AdjustedBaseRate ()  {
	  this.BOPStructureCyberIncidentLiabilityCoverage.setAdjustedBaseRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../BOPStructureLiabMedExpensesBldgCoverage/CombinedBaseRate"))) * this.BOPStructureCyberIncidentLiabilityCoverage.getIncreasedLimitsFactor() * this.BOPStructureCyberIncidentLiabilityCoverage.getDedFactor()));

	  
	}
	public void CyberIncidentAggregateLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits")) != null && (XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/CyberIncidentAggregateLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/CyberIncidentAggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setCyberIncidentAggregateLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/CyberIncidentAggregateLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null && (XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/CyberIncidentAggregateLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/CyberIncidentAggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPStructureCyberIncidentLiabilityCoverage.setCyberIncidentAggregateLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureCyberIncidentLiabilityCoverage,"../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/CyberIncidentAggregateLimit")))));
		}
		else{
			this.BOPStructureCyberIncidentLiabilityCoverage.setCyberIncidentAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
	  
	}
	public void FinalRate ()  {
	  this.BOPStructureCyberIncidentLiabilityCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPStructureCyberIncidentLiabilityCoverage.getAdjustedBaseRate() * this.BOPStructureCyberIncidentLiabilityCoverage.getCyberIncidentLiabilityFactor()));

	  
	}
	
	
	
	
	


	
}