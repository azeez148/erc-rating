package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFunctlBldgValtnCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtnCoverage BOPFunctlBldgValtnCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	CyberFactor();
	
	PostLossOrdinanceOrLawDirectPDFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PostLossOrdinanceOrLawDirectPDFactor () throws LookupException,NumberFormatException {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../PostLossOrdinanceOrLawDirectPD"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPFunctlBldgValtnCoverage.setPostLossOrdinanceOrLawDirectPDFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("FunctlBldgPostLossOrdOrLawDirectPDFactor",String.valueOf( "Y")))));
		}
		else{
			this.BOPFunctlBldgValtnCoverage.setPostLossOrdinanceOrLawDirectPDFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPFunctlBldgValtnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../FinalBuildingRate"))) * this.BOPFunctlBldgValtnCoverage.getPostLossOrdinanceOrLawDirectPDFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../LimitOfInsurance"))) / MathHelper.getDoubleValue(100.0))) * this.BOPFunctlBldgValtnCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../LimitOfInsurance"))) != 0){
			this.BOPFunctlBldgValtnCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFunctlBldgValtnCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFunctlBldgValtnCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFunctlBldgValtnCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFunctlBldgValtnCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CyberFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusion")) != null && ((XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusion/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusion/Factor"))) != 0.0)){
			this.BOPFunctlBldgValtnCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusion/Factor")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions")) != null && ((XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor"))) != 0.0)){
			this.BOPFunctlBldgValtnCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")))));
		}
		else{
			this.BOPFunctlBldgValtnCoverage.setCyberFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	public  BOPFunctlBldgValtnCoverage (com.nest.res.bop.al01012026.domain.BOPFunctlBldgValtnCoverage BOPFunctlBldgValtnCoverage)  {
	  this.BOPFunctlBldgValtnCoverage = BOPFunctlBldgValtnCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFunctlBldgValtnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../FinalBuildingRate"))) * this.BOPFunctlBldgValtnCoverage.getPostLossOrdinanceOrLawDirectPDFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../LimitOfInsurance"))) / MathHelper.getDoubleValue(100.0))) * this.BOPFunctlBldgValtnCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBldgValtnCoverage,"../../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}