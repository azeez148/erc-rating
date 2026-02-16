package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicDataLiabilityLimitedCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPElectronicDataLiabilityLimitedCov (com.nest.res.bop.al09012019.domain.BOPElectronicDataLiabilityLimitedCov BOPElectronicDataLiabilityLimitedCov)  {
	  this.BOPElectronicDataLiabilityLimitedCov = BOPElectronicDataLiabilityLimitedCov;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPElectronicDataLiabilityLimitedCov.setPremium(MathHelper.roundUpDoller(this.BOPElectronicDataLiabilityLimitedCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataLiabilityLimitedCov,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPElectronicDataLiabilityLimitedCov.setPremium(MathHelper.roundUpDoller(this.BOPElectronicDataLiabilityLimitedCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataLiabilityLimitedCov,"../../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicDataLiabilityLimitedCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPElectronicDataLiabilityLimitedCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPElectronicDataLiabilityLimitedCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}