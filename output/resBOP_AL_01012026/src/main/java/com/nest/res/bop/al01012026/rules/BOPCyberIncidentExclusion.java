package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCyberIncidentExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCyberIncidentExclusion BOPCyberIncidentExclusion;
	
	
	
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	bOPSpoilgCovCount_1();
	
	SpoilageCoverageFactor();
	
	  
	}
	public  BOPCyberIncidentExclusion (com.nest.res.bop.al01012026.domain.BOPCyberIncidentExclusion BOPCyberIncidentExclusion)  {
	  this.BOPCyberIncidentExclusion = BOPCyberIncidentExclusion;

	  
	}
	public void SpoilageCoverageFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPCyberIncidentExclusion.getBOPSpoilgCovCount_1() > MathHelper.getIntegerValue(0.0)){
			this.BOPCyberIncidentExclusion.setSpoilageCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentExclusionSpoilageCoverageFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPCyberIncidentExclusion.setSpoilageCoverageFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPCyberIncidentExclusion.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CyberIncidentExclusionFactor",String.valueOf( "Y"))));

	  
	}
	public void bOPSpoilgCovCount_1 ()  {
	  this.BOPCyberIncidentExclusion.setBOPSpoilgCovCount_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPCyberIncidentExclusion,"../BOPLocation/BOPStructure/BOPClassification") ){

		if(((XpathNode.selectNodeValue(policy,"BOPSpoilgCov"))) != null){
			this.BOPCyberIncidentExclusion.setBOPSpoilgCovCount_1(MathHelper.getIntegerValue(MathHelper.getIntegerValue(this.BOPCyberIncidentExclusion.getBOPSpoilgCovCount_1() + MathHelper.getIntegerValue(1.0))));
		}		}

	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	CommonRating1_CommonRatingSub1();
	
	  
	}
	
	
	
	
	


	
}