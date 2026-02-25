package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroClassificationBusnPrsnlPropCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroClassificationBusnPrsnlPropCoverage BOPMicroClassificationBusnPrsnlPropCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroClassificationBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../FinalBusinessPersonalPropertyRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPMicroClassificationBusnPrsnlPropCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../FinalBusinessPersonalPropertyRate"))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPMicroClassificationBusnPrsnlPropCoverage (com.nest.res.bop.al01012026.domain.BOPMicroClassificationBusnPrsnlPropCoverage BOPMicroClassificationBusnPrsnlPropCoverage)  {
	  this.BOPMicroClassificationBusnPrsnlPropCoverage = BOPMicroClassificationBusnPrsnlPropCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit")) != null && (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPMicroClassificationBusnPrsnlPropCoverage,"../BusnPrsnlPropLimit"))) >= MathHelper.getIntegerValue(2500.0)){
			this.BOPMicroClassificationBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroClassificationBusnPrsnlPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroClassificationBusnPrsnlPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroClassificationBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroClassificationBusnPrsnlPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}