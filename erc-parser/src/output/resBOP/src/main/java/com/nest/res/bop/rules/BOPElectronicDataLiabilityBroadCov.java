package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicDataLiabilityBroadCov  {

	
	
	
	private com.nest.res.bop.domain.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicDataLiabilityBroadCov.getPremium() != (double)0.0){
			this.BOPElectronicDataLiabilityBroadCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPElectronicDataLiabilityBroadCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPElectronicDataLiabilityBroadCov.setPremium(MathHelper.roundUpDoller(this.BOPElectronicDataLiabilityBroadCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataLiabilityBroadCov,"../../../../IRPMFactor")))));

	  
	}
	public  BOPElectronicDataLiabilityBroadCov (com.nest.res.bop.domain.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov)  {
	  this.BOPElectronicDataLiabilityBroadCov = BOPElectronicDataLiabilityBroadCov;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}