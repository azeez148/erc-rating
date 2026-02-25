package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.setPremium(MathHelper.roundUpDoller(this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism (com.nest.res.bop.al01012026.domain.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism)  {
	  this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism = BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.setPremium(MathHelper.roundUpDoller(this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroLimitationsOfCoverageForCertifiedActsOfTerrorism,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}