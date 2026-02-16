package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclCertfdActsTerrsmCovFireLosses  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLosses;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclCertfdActsTerrsmCovFireLosses.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclCertfdActsTerrsmCovFireLosses.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclCertfdActsTerrsmCovFireLosses.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExclCertfdActsTerrsmCovFireLosses (com.nest.res.bop.al09012019.domain.BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLosses)  {
	  this.BOPExclCertfdActsTerrsmCovFireLosses = BOPExclCertfdActsTerrsmCovFireLosses;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclCertfdActsTerrsmCovFireLosses.setPremium(MathHelper.roundUpDoller(this.BOPExclCertfdActsTerrsmCovFireLosses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclCertfdActsTerrsmCovFireLosses,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclCertfdActsTerrsmCovFireLosses.setPremium(MathHelper.roundUpDoller(this.BOPExclCertfdActsTerrsmCovFireLosses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclCertfdActsTerrsmCovFireLosses,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}