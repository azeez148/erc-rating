package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPFunctlBusnPrsnlPropValtnCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage;
	
	
	
	public  BOPFunctlBusnPrsnlPropValtnCoverage (com.nest.res.bop.al01012026.domain.BOPFunctlBusnPrsnlPropValtnCoverage BOPFunctlBusnPrsnlPropValtnCoverage)  {
	  this.BOPFunctlBusnPrsnlPropValtnCoverage = BOPFunctlBusnPrsnlPropValtnCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../FinalBusnPrsnlPropRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * this.BOPFunctlBusnPrsnlPropValtnCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPFunctlBusnPrsnlPropValtnCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPFunctlBusnPrsnlPropValtnCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../FinalBusnPrsnlPropRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * this.BOPFunctlBusnPrsnlPropValtnCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../IRPMFactor")))));

	  
	}
	public void CyberFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusion")) != null && ((XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusion/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusion/Factor"))) != 0.0)){
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusion/Factor")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions")) != null && ((XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor"))) != 0.0)){
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../../../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")))));
		}
		else{
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setCyberFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
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
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPFunctlBusnPrsnlPropValtnCoverage,"../dsLimit"))) != 0){
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPFunctlBusnPrsnlPropValtnCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}