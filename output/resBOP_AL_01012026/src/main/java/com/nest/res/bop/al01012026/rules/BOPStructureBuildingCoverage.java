package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureBuildingCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage;
	
	
	
	public  BOPStructureBuildingCoverage (com.nest.res.bop.al01012026.domain.BOPStructureBuildingCoverage BOPStructureBuildingCoverage)  {
	  this.BOPStructureBuildingCoverage = BOPStructureBuildingCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPStructureBuildingCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FinalBuildingRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * this.BOPStructureBuildingCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CyberFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusion")) != null && ((XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusion/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusion/Factor"))) != 0.0)){
			this.BOPStructureBuildingCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusion/Factor")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions")) != null && ((XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor"))) != 0.0)){
			this.BOPStructureBuildingCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")))));
		}
		else{
			this.BOPStructureBuildingCoverage.setCyberFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureBuildingCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureBuildingCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureBuildingCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPStructureBuildingCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureBuildingCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPStructureBuildingCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../FinalBuildingRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../BuildingLimit"))) / MathHelper.getDoubleValue(100.0))) * this.BOPStructureBuildingCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureBuildingCoverage,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	CyberFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}