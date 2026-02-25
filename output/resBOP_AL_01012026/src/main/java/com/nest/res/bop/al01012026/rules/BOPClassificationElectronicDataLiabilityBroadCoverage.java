package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationElectronicDataLiabilityBroadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationElectronicDataLiabilityBroadCoverage BOPClassificationElectronicDataLiabilityBroadCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPClassificationElectronicDataLiabilityBroadCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationElectronicDataLiabilityBroadCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPClassificationElectronicDataLiabilityBroadCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationElectronicDataLiabilityBroadCoverage BOPClassificationElectronicDataLiabilityBroadCoverage)  {
	  this.BOPClassificationElectronicDataLiabilityBroadCoverage = BOPClassificationElectronicDataLiabilityBroadCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../../PctOwnerOccupied"))).equals(MathHelper.getStringValue("Less than 50%")) && (!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("09")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("10")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../ClassGroup"))).equals(MathHelper.getStringValue("16")))){
		if((XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../../../../ElectronicDataLiabilityCovOption")) != null && (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../../../../ElectronicDataLiabilityCovOption"))).equals(MathHelper.getStringValue("Electronic Data Liability Broad Coverage")) && (XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../../../../BOPElectronicDataLiabilityBroadCoverage")) != null){
			this.BOPClassificationElectronicDataLiabilityBroadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityBroadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		}
		else{
			this.BOPClassificationElectronicDataLiabilityBroadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationElectronicDataLiabilityBroadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationElectronicDataLiabilityBroadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationElectronicDataLiabilityBroadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPClassificationElectronicDataLiabilityBroadCoverage.setPremium(MathHelper.roundUpDoller(this.BOPClassificationElectronicDataLiabilityBroadCoverage.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationElectronicDataLiabilityBroadCoverage,"../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}