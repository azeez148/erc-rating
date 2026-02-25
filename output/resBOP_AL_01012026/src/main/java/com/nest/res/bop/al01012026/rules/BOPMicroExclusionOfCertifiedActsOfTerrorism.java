package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroExclusionOfCertifiedActsOfTerrorism  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroExclusionOfCertifiedActsOfTerrorism BOPMicroExclusionOfCertifiedActsOfTerrorism;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroExclusionOfCertifiedActsOfTerrorism.setPremium(MathHelper.roundUpDoller(this.BOPMicroExclusionOfCertifiedActsOfTerrorism.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroExclusionOfCertifiedActsOfTerrorism,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPMicroExclusionOfCertifiedActsOfTerrorism (com.nest.res.bop.al01012026.domain.BOPMicroExclusionOfCertifiedActsOfTerrorism BOPMicroExclusionOfCertifiedActsOfTerrorism)  {
	  this.BOPMicroExclusionOfCertifiedActsOfTerrorism = BOPMicroExclusionOfCertifiedActsOfTerrorism;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPMicroExclusionOfCertifiedActsOfTerrorism.setPremium(MathHelper.roundUpDoller(this.BOPMicroExclusionOfCertifiedActsOfTerrorism.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroExclusionOfCertifiedActsOfTerrorism,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroExclusionOfCertifiedActsOfTerrorism.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroExclusionOfCertifiedActsOfTerrorism.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroExclusionOfCertifiedActsOfTerrorism.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}