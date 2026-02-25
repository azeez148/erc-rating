package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationElectronicDataLiabilityLimitedCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationElectronicDataLiabilityLimitedCoverage BOPClassificationElectronicDataLiabilityLimitedCoverage;
	
	
	
	public  BOPClassificationElectronicDataLiabilityLimitedCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationElectronicDataLiabilityLimitedCoverage BOPClassificationElectronicDataLiabilityLimitedCoverage)  {
	  this.BOPClassificationElectronicDataLiabilityLimitedCoverage = BOPClassificationElectronicDataLiabilityLimitedCoverage;

	  
	}
	public void MinimumPremium () throws LookupException,NumberFormatException {
	  this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setMinimumPremium(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataLimitedCovMinimumPremium",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium() >= this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getMinimumPremium()){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getMinimumPremium()));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
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
	
	EvaluatedPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void HazardGrade () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassCode")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassCode"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataLimitedCovHazardGrade",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassCode"))))));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%")) && (!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
		if(((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../ElectronicDataLiabilityCovOption")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../ElectronicDataLiabilityCovOption"))).equals(MathHelper.getStringValue("Electronic Data Liability Limited Coverage"))) && ((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion")) != null || (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException")) != null || (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null)){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void FinalRate ()  {
	  this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getAdjustedBaseRate() * this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataFactor()));

	  
	}
	public void AdjustedBaseRate ()  {
	  this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setAdjustedBaseRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/CombinedBaseRate"))) * this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getIncreasedLimitsFactor() * this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getDedFactor()));

	  
	}
	public void LossOfElectronicDataFactor () throws LookupException,NumberFormatException {
	  
		if(((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion")) != null || (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null) && !this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getHazardGrade().equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataFactorBP0595",String.valueOf(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getHazardGrade())))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException")) != null && !this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getHazardGrade().equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataFactorBP1805",String.valueOf(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getHazardGrade())))));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void LossOfElectronicDataLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion")) != null && (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion/LossOfElectronicDataLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion/LossOfElectronicDataLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclusion/LossOfElectronicDataLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException")) != null && (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException/LossOfElectronicDataLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException/LossOfElectronicDataLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPElectronicDataLiabilityLimitedCovSubjectToCyberIncidentExclDeletionOfBodilyInjuryException/LossOfElectronicDataLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null && (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/LossOfElectronicDataLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/LossOfElectronicDataLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/LossOfElectronicDataLimit")))));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setLossOfElectronicDataLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
		}
	  
	}
	public void AggregateLimit ()  {
	  
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("300,000"))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("600,000")));
		}
		else{
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("500,000"))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("1,000,000")));
		}
		else{
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("1,000,000"))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("2,000,000")));
		}
		else{
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("2,000,000"))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("4,000,000")));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
		}
		}
	  
	}
	public void DedFactor ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../ClassCode"))).equals(MathHelper.getStringValue("75611"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../PropDamageLiabDed"))).equals(MathHelper.getStringValue("250"))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../PropDamageLiabDedFactor")))));
		}
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../PropDamageLiabDedFactor")))));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium() >= this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getMinimumPremium()){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getMinimumPremium()));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void IncreasedLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit().equals(MathHelper.getStringValue("")) || !this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getAggregateLimit().equals(MathHelper.getStringValue(""))){
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getLossOfElectronicDataLimit()),String.valueOf(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getAggregateLimit()),String.valueOf(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getAggregateLimit())))));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void EvaluatedPremium ()  {
	  this.BOPClassificationElectronicDataLiabilityLimitedCoverage.setEvaluatedPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPClassificationElectronicDataLiabilityLimitedCoverage.getFinalRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityLimitedCoverage,"../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}