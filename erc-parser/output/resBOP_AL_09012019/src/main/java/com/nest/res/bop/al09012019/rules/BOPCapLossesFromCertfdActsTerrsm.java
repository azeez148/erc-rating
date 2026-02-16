package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCapLossesFromCertfdActsTerrsm  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsm;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPCapLossesFromCertfdActsTerrsm.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCapLossesFromCertfdActsTerrsm.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCapLossesFromCertfdActsTerrsm.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPCapLossesFromCertfdActsTerrsm (com.nest.res.bop.al09012019.domain.BOPCapLossesFromCertfdActsTerrsm BOPCapLossesFromCertfdActsTerrsm)  {
	  this.BOPCapLossesFromCertfdActsTerrsm = BOPCapLossesFromCertfdActsTerrsm;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPCapLossesFromCertfdActsTerrsm.setPremium(MathHelper.roundUpDoller(this.BOPCapLossesFromCertfdActsTerrsm.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCapLossesFromCertfdActsTerrsm,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCapLossesFromCertfdActsTerrsm.setPremium(MathHelper.roundUpDoller(this.BOPCapLossesFromCertfdActsTerrsm.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCapLossesFromCertfdActsTerrsm,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}