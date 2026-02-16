package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicDataLiabilityLimitedCov  {

	
	
	
	private com.nest.res.bop.domain.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicDataLiabilityLimitedCov.getPremium() != (double)0.0){
			this.BOPElectronicDataLiabilityLimitedCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPElectronicDataLiabilityLimitedCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPElectronicDataLiabilityLimitedCov (com.nest.res.bop.domain.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov)  {
	  this.BOPElectronicDataLiabilityLimitedCov = BOPElectronicDataLiabilityLimitedCov;

	  
	}
	public void Premium ()  {
	  this.BOPElectronicDataLiabilityLimitedCov.setPremium(MathHelper.roundUpDoller(this.BOPElectronicDataLiabilityLimitedCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataLiabilityLimitedCov,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}