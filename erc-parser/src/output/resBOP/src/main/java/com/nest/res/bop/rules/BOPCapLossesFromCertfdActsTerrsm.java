package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCapLossesFromCertfdActsTerrsm  {

	
	
	
	private com.nest.res.bop.domain.BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsm;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPCapLossesFromCertfdActsTerrsm.setPremium(MathHelper.roundUpDoller(this.BOPCapLossesFromCertfdActsTerrsm.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCapLossesFromCertfdActsTerrsm,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCapLossesFromCertfdActsTerrsm.getPremium() != (double)0.0){
			this.BOPCapLossesFromCertfdActsTerrsm.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCapLossesFromCertfdActsTerrsm.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPCapLossesFromCertfdActsTerrsm (com.nest.res.bop.domain.BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsm)  {
	  this.BOPCapLossesFromCertfdActsTerrsm = BOPCapLossesFromCertfdActsTerrsm;

	  
	}
	
	
	
	
	


	
}