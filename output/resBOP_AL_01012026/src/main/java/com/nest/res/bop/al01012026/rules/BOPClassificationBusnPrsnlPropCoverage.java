package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPClassificationBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../FinalBusnPrsnlPropRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * this.BOPClassificationBusnPrsnlPropCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	CyberFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CyberFactor ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusion")) != null && ((XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusion/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusion/Factor"))) != 0.0)){
			this.BOPClassificationBusnPrsnlPropCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusion/Factor")))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions")) != null && ((XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor"))) != 0.0)){
			this.BOPClassificationBusnPrsnlPropCoverage.setCyberFactor(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../BOPCyberIncidentExclusionWithEnsuingCausesOfLossExceptions/Factor")))));
		}
		else{
			this.BOPClassificationBusnPrsnlPropCoverage.setCyberFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(1.0)));
		}
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) > MathHelper.getIntegerValue(0.0)){
			this.BOPClassificationBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPClassificationBusnPrsnlPropCoverage (com.nest.res.bop.al01012026.domain.BOPClassificationBusnPrsnlPropCoverage BOPClassificationBusnPrsnlPropCoverage)  {
	  this.BOPClassificationBusnPrsnlPropCoverage = BOPClassificationBusnPrsnlPropCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPClassificationBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../FinalBusnPrsnlPropRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * this.BOPClassificationBusnPrsnlPropCoverage.getCyberFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationBusnPrsnlPropCoverage,"../../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPClassificationBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPClassificationBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}