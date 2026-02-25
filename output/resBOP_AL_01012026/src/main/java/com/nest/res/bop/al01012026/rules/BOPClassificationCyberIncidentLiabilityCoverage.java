package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationCyberIncidentLiabilityCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationCyberIncidentLiabilityCoverage BOPClassificationCyberIncidentLiabilityCoverage;
	
	
	
	public void CyberIncidentAggregateLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits")) != null && (XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/CyberIncidentAggregateLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/CyberIncidentAggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCyberIncidentAggregateLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/CyberIncidentAggregateLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null && (XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/CyberIncidentAggregateLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/CyberIncidentAggregateLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCyberIncidentAggregateLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/CyberIncidentAggregateLimit")))));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCyberIncidentAggregateLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void FinalRate ()  {
	  this.BOPClassificationCyberIncidentLiabilityCoverage.setFinalRate(MathHelper.roundToThousand(this.BOPClassificationCyberIncidentLiabilityCoverage.getAdjustedBaseRate() * this.BOPClassificationCyberIncidentLiabilityCoverage.getCyberIncidentLiabilityFactor()));

	  
	}
	public void MinimumPremium () throws LookupException,NumberFormatException {
	  this.BOPClassificationCyberIncidentLiabilityCoverage.setMinimumPremium(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentLiabilityCovMinimumPremium",String.valueOf( "Y"))));

	  
	}
	public void EvaluatedPremium ()  {
	  this.BOPClassificationCyberIncidentLiabilityCoverage.setEvaluatedPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(this.BOPClassificationCyberIncidentLiabilityCoverage.getFinalRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/RatingLimit")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../IRPMFactor")))));

	  
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
	
	EvaluatedPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void EachCyberIncidentOccurrenceLimit ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits")) != null && (XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/EachCyberIncidentOccurrenceLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/EachCyberIncidentOccurrenceLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setEachCyberIncidentOccurrenceLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits/EachCyberIncidentOccurrenceLimit")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null && (XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/EachCyberIncidentOccurrenceLimit")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/EachCyberIncidentOccurrenceLimit"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setEachCyberIncidentOccurrenceLimit(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits/EachCyberIncidentOccurrenceLimit")))));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setEachCyberIncidentOccurrenceLimit(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationCyberIncidentLiabilityCoverage.getEvaluatedPremium() >= this.BOPClassificationCyberIncidentLiabilityCoverage.getMinimumPremium()){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationCyberIncidentLiabilityCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationCyberIncidentLiabilityCoverage.getMinimumPremium()));
		}
	  
	}
	public void IncreasedLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassificationCyberIncidentLiabilityCoverage.getCyberIncidentAggregateLimit().equals(MathHelper.getStringValue("")) && !this.BOPClassificationCyberIncidentLiabilityCoverage.getEachCyberIncidentOccurrenceLimit().equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(this.BOPClassificationCyberIncidentLiabilityCoverage.getEachCyberIncidentOccurrenceLimit()),String.valueOf(this.BOPClassificationCyberIncidentLiabilityCoverage.getCyberIncidentAggregateLimit()),String.valueOf(this.BOPClassificationCyberIncidentLiabilityCoverage.getCyberIncidentAggregateLimit())))));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%")) && (!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
		if(((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../CyberIncidentLiabilityCovOption")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../CyberIncidentLiabilityCovOption"))).equals(MathHelper.getStringValue("Cyber Incident Liability Coverage"))) && ((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovSubjectToEachCyberIncidentOccurrenceAndAggregateLimits")) != null || (XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../BOPCyberIncidentLiabilityCovAndEDLCovSubjectToLossOfElectronicDataEachCyberIncidentOccAggLimits")) != null)){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void AdjustedBaseRate ()  {
	  this.BOPClassificationCyberIncidentLiabilityCoverage.setAdjustedBaseRate(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../BOPClassificationLiabMedExpensesBusnPrsnlPropCoverage/CombinedBaseRate"))) * this.BOPClassificationCyberIncidentLiabilityCoverage.getIncreasedLimitsFactor() * this.BOPClassificationCyberIncidentLiabilityCoverage.getDedFactor()));

	  
	}
	public  BOPClassificationCyberIncidentLiabilityCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationCyberIncidentLiabilityCoverage BOPClassificationCyberIncidentLiabilityCoverage)  {
	  this.BOPClassificationCyberIncidentLiabilityCoverage = BOPClassificationCyberIncidentLiabilityCoverage;

	  
	}
	public void HazardGrade () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassCode")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassCode"))).equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentLiabHazardGrade",String.valueOf(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassCode"))))));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setHazardGrade(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
	  
	}
	public void CyberIncidentLiabilityFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPClassificationCyberIncidentLiabilityCoverage.getHazardGrade().equals(MathHelper.getStringValue(""))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCyberIncidentLiabilityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentLiabilityFactor",String.valueOf(this.BOPClassificationCyberIncidentLiabilityCoverage.getHazardGrade())))));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setCyberIncidentLiabilityFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationCyberIncidentLiabilityCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPClassificationCyberIncidentLiabilityCoverage.getEvaluatedPremium() >= this.BOPClassificationCyberIncidentLiabilityCoverage.getMinimumPremium()){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationCyberIncidentLiabilityCoverage.getEvaluatedPremium()));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setPremium(MathHelper.getDoubleValue(this.BOPClassificationCyberIncidentLiabilityCoverage.getMinimumPremium()));
		}
	  
	}
	public void DedFactor ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../ClassCode"))).equals(MathHelper.getStringValue("75611"))){
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../PropDamageLiabDed"))).equals(MathHelper.getStringValue("250"))){
			this.BOPClassificationCyberIncidentLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../PropDamageLiabDedFactor")))));
		}
		}
		else{
			this.BOPClassificationCyberIncidentLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationCyberIncidentLiabilityCoverage,"../../../../PropDamageLiabDedFactor")))));
		}
	  
	}
	
	
	
	
	


	
}