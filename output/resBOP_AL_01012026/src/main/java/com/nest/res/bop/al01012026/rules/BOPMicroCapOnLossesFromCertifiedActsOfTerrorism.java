package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroCapOnLossesFromCertifiedActsOfTerrorism  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism BOPMicroCapOnLossesFromCertifiedActsOfTerrorism;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.setPremium(MathHelper.roundUpDoller(this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism,"../IRPMFactor")))));

	  
	}
	public  BOPMicroCapOnLossesFromCertifiedActsOfTerrorism (com.nest.res.bop.al01012026.domain.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism BOPMicroCapOnLossesFromCertifiedActsOfTerrorism)  {
	  this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism = BOPMicroCapOnLossesFromCertifiedActsOfTerrorism;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.setPremium(MathHelper.roundUpDoller(this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroCapOnLossesFromCertifiedActsOfTerrorism.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}