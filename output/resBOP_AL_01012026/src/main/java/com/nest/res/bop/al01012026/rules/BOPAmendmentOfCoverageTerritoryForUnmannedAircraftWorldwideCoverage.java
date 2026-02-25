package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageDetail;

public class BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage;
	private List<BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageDetail> BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageDetailList;
	
	
	
	public  BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage (com.nest.res.bop.al01012026.domain.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage)  {
	  this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage = BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage;
this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageDetailList = BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getBOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverageDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getUnmannedAircraftPropertyLimitedCoveragePremium() * this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getFactor()));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("UnmannedAircraftWorldwideCoverageFactor",String.valueOf( "Y"))));

	  
	}
	public void unmannedAircraftPropertyLimitedCoveragePremiumTemp_1 ()  {
	  this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setUnmannedAircraftPropertyLimitedCoveragePremiumTemp_1(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage,"../BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage/BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail/BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov") ){
			this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setUnmannedAircraftPropertyLimitedCoveragePremiumTemp_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getUnmannedAircraftPropertyLimitedCoveragePremiumTemp_1()) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void UnmannedAircraftPropertyLimitedCoveragePremium ()  {
	  this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setUnmannedAircraftPropertyLimitedCoveragePremium(this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getUnmannedAircraftPropertyLimitedCoveragePremiumTemp_1());

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	unmannedAircraftPropertyLimitedCoveragePremiumTemp_1();
	
	UnmannedAircraftPropertyLimitedCoveragePremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void Premium ()  {
	  this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.setPremium(MathHelper.roundUpDoller(this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getUnmannedAircraftPropertyLimitedCoveragePremium() * this.BOPAmendmentOfCoverageTerritoryForUnmannedAircraftWorldwideCoverage.getFactor()));

	  
	}
	
	
	
	
	


	
}