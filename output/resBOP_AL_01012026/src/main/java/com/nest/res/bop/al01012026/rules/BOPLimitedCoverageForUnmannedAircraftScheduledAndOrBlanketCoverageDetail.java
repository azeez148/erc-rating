package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov;

public class BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail;
	private com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovRule;
	private List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setPremium(MathHelper.getDoubleValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail,"BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov/Premium")))));

	  
	}
	public void FloodCoverageFactor () throws LookupException,NumberFormatException {
	  
		if((XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail,"../../BOPFloodCov")) != null){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setFloodCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Flood Coverage")))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setFloodCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail)  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail;
this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovList = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov();

	  
	}
	public void WindstormOrHailExclusionCredit () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail,"../../BOPStructure/BOPWindstormOrHailExclusion").size() > 0.0){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setWindstormOrHailExclusionCredit(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Windstorm Or Hail Exclusion")))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setWindstormOrHailExclusionCredit(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void BusinessInterruptionCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getBusinessInterruptionCoverage().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setBusinessInterruptionCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("UnmannedAircraftBusinessInterruptionFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setBusinessInterruptionCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void EarthquakeCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(XpathNode.selectNodes(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail,"../../BOPStructure/BOPEQSubLimit").size() > 0.0 || XpathNode.selectNodes(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail,"../../BOPStructure/BOPEarthquake").size() > 0.0){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setEarthquakeCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OffPremisesEndorsementsModifyingCoveredCOLFactor",String.valueOf( "Earthquake And Volcanic Eruption Coverage")))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setEarthquakeCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void NewlyAcquiredPropertyFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getBlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed().equals(MathHelper.getStringValue("No"))){
		if(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getCoverageExtensionForNewlyAcquiredPropertyIncludingTemporarySubstitutePropertyAppliesToScheduledCoverageonly().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setNewlyAcquiredPropertyFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("UnmannedAircraftNewlyAcquiredPropertyFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setNewlyAcquiredPropertyFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setNewlyAcquiredPropertyFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovList){
		for(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov:BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovList){
			BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovRule = new com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov);
			BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCovRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void UnmannedAircraftRate () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getRiskClass().equals(MathHelper.getStringValue(""))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setUnmannedAircraftRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("UnmannedAircraftRate",String.valueOf(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getRiskClass())))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setUnmannedAircraftRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	UnmannedAircraftRate();
	
	DeductibleFactor();
	
	NewlyAcquiredPropertyFactor();
	
	BusinessInterruptionCoverageFactor();
	
	FloodCoverageFactor();
	
	EarthquakeCoverageFactor();
	
	WindstormOrHailExclusionCredit();
	
	  
	}
	public void DeductibleFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getDeductible().equals(MathHelper.getStringValue("")) && !this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getDeductible().equals(MathHelper.getStringValue("1,000"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("UnmannedAircraftDeductibleFactor",String.valueOf(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getDeductible())))));
		}
		else{
		if(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getDeductible().equals(MathHelper.getStringValue("1,000"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OptnlFixedDedFactorWithLOI",String.valueOf(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.getDeductible()),String.valueOf(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail,"../TotalLimit"))))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail.setDeductibleFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	
	
	
	
	


	
}