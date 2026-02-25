package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage;
import com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage;

public class BOPLimitedCoverageForDesignatedUnmannedAircraftDetail  {

	
	
	
	private com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageRule;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage> BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageList;
	private com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageRule;
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail BOPLimitedCoverageForDesignatedUnmannedAircraftDetail;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage> BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageList;
	
	
	
	public void Premium ()  {
	  
		if(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getNonOwnedUnmannedAircraftOperatedByOtherParties().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail,"../../IRPMFactor"))))));
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail,"BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage/PremiumBIPD"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail,"BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage/PremiumPAI"))))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageList){
		for(BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage:BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageList){
			BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageRule = new com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage(BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage);
			BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageRule.CommonRating1();

		}
	}
	if(null != BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageList){
		for(BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage:BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageList){
			BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageRule = new com.nest.res.bop.al01012026.rules.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage(BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage);
			BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageRule.CommonRating1();

		}
	}
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getNonOwnedUnmannedAircraftOperatedByOtherParties().equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail,"../../IRPMFactor"))))));
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail,"BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage/PremiumBIPD"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail,"BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage/PremiumPAI"))))));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPLimitedCoverageForDesignatedUnmannedAircraftDetail (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail BOPLimitedCoverageForDesignatedUnmannedAircraftDetail)  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail = BOPLimitedCoverageForDesignatedUnmannedAircraftDetail;
this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverageList = BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getBOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage();
this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverageList = BOPLimitedCoverageForDesignatedUnmannedAircraftDetail.getBOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage();

	  
	}
	
	
	
	
	


	
}