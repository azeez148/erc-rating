package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail;

public class BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage  {

	
	
	
	private List<BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail> BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailList;
	private com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailRule;
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage;
	
	
	
	public void ProcessPremium1_CommonRatingSub2 ()  {
	  
	blanketCoverageAppliesTemp_1();
	
	BlanketCoverageApplies();
	
	  
	}
	public void TotalLimit ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setTotalLimit(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getTotalLimitTemp_1());

	  
	}
	public  BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage)  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage;
this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailList = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getBOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail();

	  
	}
	public void blanketCoverageAppliesTemp_1 ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setBlanketCoverageAppliesTemp_1(MathHelper.getStringValue("No"));

		for( Policy policy : XpathNode.selectNodes(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage,"BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setBlanketCoverageAppliesTemp_1(MathHelper.getStringValue(MathHelper.getStringValue("Yes")));
		}		}

	  
	}
	public void numberOfDronesTemp_1 ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setNumberOfDronesTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage,"BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("No"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setNumberOfDronesTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getNumberOfDronesTemp_1() + MathHelper.getIntegerValue(1.0))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setNumberOfDronesTemp_1(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"NumberOfDronesBlanketCoverage")))));
		}
		}		}

	  
	}
	public void totalLimitTemp_1 ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setTotalLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage,"BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("No"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setTotalLimitTemp_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getTotalLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"dsLimit"))))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setTotalLimitTemp_1(MathHelper.getIntegerValue((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BlanketLimit")))));
		}
		}		}

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage,"BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail") ){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setPremium(MathHelper.getDoubleValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void NumberOfDrones ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setNumberOfDrones(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getNumberOfDronesTemp_1());

	  
	}
	public void ProcessPremium1_CommonRatingSub1 ()  {
	  
	numberOfDronesTemp_1();
	
	NumberOfDrones();
	
	totalLimitTemp_1();
	
	TotalLimit();
	
	  
	}
	public void BlanketCoverageApplies ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.setBlanketCoverageApplies(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverage.getBlanketCoverageAppliesTemp_1());

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailList){
		for(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail:BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailList){
			BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailRule = new com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail(BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetail);
			BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageDetailRule.ProcessPremium1();

		}
	}
	ProcessPremium1_CommonRatingSub2();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}