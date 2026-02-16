package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclCertfdActsTerrsmCovFireLosses  {

	
	
	
	private com.nest.res.bop.domain.BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLosses;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclCertfdActsTerrsmCovFireLosses.getPremium() != (double)0.0){
			this.BOPExclCertfdActsTerrsmCovFireLosses.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclCertfdActsTerrsmCovFireLosses.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPExclCertfdActsTerrsmCovFireLosses (com.nest.res.bop.domain.BOPExclCertfdActsTerrsmCovFireLosses BOPExclCertfdActsTerrsmCovFireLosses)  {
	  this.BOPExclCertfdActsTerrsmCovFireLosses = BOPExclCertfdActsTerrsmCovFireLosses;

	  
	}
	public void Premium ()  {
	  this.BOPExclCertfdActsTerrsmCovFireLosses.setPremium(MathHelper.roundUpDoller(this.BOPExclCertfdActsTerrsmCovFireLosses.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclCertfdActsTerrsmCovFireLosses,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}