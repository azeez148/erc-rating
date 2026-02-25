package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail;

public class BOPLimitedCoverageForDesignatedUnmannedAircraft  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft;
	private com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail BOPLimitedCoverageForDesignatedUnmannedAircraftDetailRule;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraftDetail> BOPLimitedCoverageForDesignatedUnmannedAircraftDetailList;
	
	
	
	public void numberOfDronesTemp_1 ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setNumberOfDronesTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPLimitedCoverageForDesignatedUnmannedAircraft,"BOPLimitedCoverageForDesignatedUnmannedAircraftDetail") ){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setNumberOfDronesTemp_1(MathHelper.getIntegerValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getNumberOfDronesTemp_1() + MathHelper.getIntegerValue(1.0)));
		}

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_CommonRatingSub1();
	
	if(null != BOPLimitedCoverageForDesignatedUnmannedAircraftDetailList){
		for(BOPLimitedCoverageForDesignatedUnmannedAircraftDetail BOPLimitedCoverageForDesignatedUnmannedAircraftDetail:BOPLimitedCoverageForDesignatedUnmannedAircraftDetailList){
			BOPLimitedCoverageForDesignatedUnmannedAircraftDetailRule = new com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail(BOPLimitedCoverageForDesignatedUnmannedAircraftDetail);
			BOPLimitedCoverageForDesignatedUnmannedAircraftDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPLimitedCoverageForDesignatedUnmannedAircraft,"BOPLimitedCoverageForDesignatedUnmannedAircraftDetail") ){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremium(MathHelper.getDoubleValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public  BOPLimitedCoverageForDesignatedUnmannedAircraft (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft)  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft = BOPLimitedCoverageForDesignatedUnmannedAircraft;
this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetailList = BOPLimitedCoverageForDesignatedUnmannedAircraft.getBOPLimitedCoverageForDesignatedUnmannedAircraftDetail();

	  
	}
	public void IncreasedLimitsFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getUnmannedAircraftAggregateLimit().equals(MathHelper.getStringValue("")) && !this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getUnmannedAircraftEachOccurrenceLimit().equals(MathHelper.getStringValue(""))){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setIncreasedLimitsFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LiabIncrLimitFactor",String.valueOf(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getUnmannedAircraftEachOccurrenceLimit()),String.valueOf(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getUnmannedAircraftAggregateLimit()),String.valueOf(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getUnmannedAircraftAggregateLimit())))));
		}
	  
	}
	public void NumberOfDrones ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setNumberOfDrones(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getNumberOfDronesTemp_1());

	  
	}
	public void ProcessPremium1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	IncreasedLimitsFactor();
	
	numberOfDronesTemp_1();
	
	NumberOfDrones();
	
	  
	}
	
	
	
	
	


	
}