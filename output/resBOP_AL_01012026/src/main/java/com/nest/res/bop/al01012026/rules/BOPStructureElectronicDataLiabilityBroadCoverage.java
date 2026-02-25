package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPStructureElectronicDataLiabilityBroadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPStructureElectronicDataLiabilityBroadCoverage BOPStructureElectronicDataLiabilityBroadCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%"))) || ((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
		if((XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../../../ElectronicDataLiabilityCovOption")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../../../ElectronicDataLiabilityCovOption"))).equals(MathHelper.getStringValue("Electronic Data Liability Broad Coverage")) && (XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../../../BOPElectronicDataLiabilityBroadCoverage")) != null){
			this.BOPStructureElectronicDataLiabilityBroadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureElectronicDataLiabilityBroadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPStructureElectronicDataLiabilityBroadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPStructureElectronicDataLiabilityBroadCoverage.setPremium(MathHelper.roundUpDoller(this.BOPStructureElectronicDataLiabilityBroadCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../../../IRPMFactor")))));

	  
	}
	public  BOPStructureElectronicDataLiabilityBroadCoverage (com.nest.res.bop.al01012026.domain.BOPStructureElectronicDataLiabilityBroadCoverage BOPStructureElectronicDataLiabilityBroadCoverage)  {
	  this.BOPStructureElectronicDataLiabilityBroadCoverage = BOPStructureElectronicDataLiabilityBroadCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPStructureElectronicDataLiabilityBroadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPStructureElectronicDataLiabilityBroadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPStructureElectronicDataLiabilityBroadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPStructureElectronicDataLiabilityBroadCoverage.setPremium(MathHelper.roundUpDoller(this.BOPStructureElectronicDataLiabilityBroadCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPStructureElectronicDataLiabilityBroadCoverage,"../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}