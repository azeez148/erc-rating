package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions;
	
	
	
	public void classificationTotalLimit_1 ()  {
	  this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setClassificationTotalLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions,"../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setClassificationTotalLimit_1(MathHelper.getIntegerValue(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getClassificationTotalLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BusnPrsnlPropLimit")))));
		}

	  
	}
	public void limitType_1 ()  {
	  
		if(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getLossOrDamageToCoveredPropertyCoverageLOI() != MathHelper.getIntegerValue(0.0) && this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getLossOrDamageToCoveredPropertyCoverageLOI() == this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getFullPolicyLimit()){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setLimitType_1(MathHelper.getStringValue(MathHelper.getStringValue("Full Limit")));
		}
		else{
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setLimitType_1(MathHelper.getStringValue(MathHelper.getStringValue("Sublimit")));
		}
	  
	}
	public void aggregateLimitType_1 ()  {
	  
		if(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getAggregateLOI() != MathHelper.getIntegerValue(0.0)){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setAggregateLimitType_1(MathHelper.getStringValue(MathHelper.getStringValue("With")));
		}
		else{
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setAggregateLimitType_1(MathHelper.getStringValue(MathHelper.getStringValue("Without")));
		}
	  
	}
	public void structureTotalLimit_1 ()  {
	  this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setStructureTotalLimit_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions,"../BOPLocation/BOPStructure") ){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setStructureTotalLimit_1(MathHelper.getIntegerValue(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getStructureTotalLimit_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BuildingLimit")))));
		}

	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	structureTotalLimit_1();
	
	classificationTotalLimit_1();
	
	FullPolicyLimit();
	
	namedPerils_1();
	
	limitType_1();
	
	aggregateLimitType_1();
	
	Factor();
	
	bOPSpoilgCovCount_1();
	
	SpoilageCoverageFactor();
	
	  
	}
	public void SpoilageCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getBOPSpoilgCovCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setSpoilageCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentExclusionWithEnsuingCausesOfLossExceptionsSpoilageCoverageFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setSpoilageCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public  BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions (com.nest.res.bop.al01012026.domain.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions)  {
	  this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions = BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions;

	  
	}
	public void namedPerils_1 ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions,"../BOPNamedPerils")) != null){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setNamedPerils_1(MathHelper.getStringValue(MathHelper.getStringValue("With")));
		}
		else{
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setNamedPerils_1(MathHelper.getStringValue(MathHelper.getStringValue("Without")));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentExclusionWithEnsuingCausesOfLossExceptionsFactors",String.valueOf(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getNamedPerils_1()),String.valueOf(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getLimitType_1()),String.valueOf(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getAggregateLimitType_1()))));

	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void FullPolicyLimit ()  {
	  this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setFullPolicyLimit(MathHelper.getIntegerValue(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getStructureTotalLimit_1() + this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getClassificationTotalLimit_1()));

	  
	}
	public void bOPSpoilgCovCount_1 ()  {
	  this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setBOPSpoilgCovCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions,"../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BOPSpoilgCov"))) != null){
			this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.setBOPSpoilgCovCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions.getBOPSpoilgCovCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	
	
	
	
	


	
}