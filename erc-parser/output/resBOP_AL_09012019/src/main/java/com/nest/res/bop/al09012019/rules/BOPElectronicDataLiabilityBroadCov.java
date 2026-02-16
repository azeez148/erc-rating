package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicDataLiabilityBroadCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov;
	
	
	
	public  BOPElectronicDataLiabilityBroadCov (com.nest.res.bop.al09012019.domain.BOPElectronicDataLiabilityBroadCov BOPElectronicDataLiabilityBroadCov)  {
	  this.BOPElectronicDataLiabilityBroadCov = BOPElectronicDataLiabilityBroadCov;

	  
	}
	public void Premium ()  {
	  this.BOPElectronicDataLiabilityBroadCov.setPremium(MathHelper.roundUpDoller(this.BOPElectronicDataLiabilityBroadCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataLiabilityBroadCov,"../../../../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPElectronicDataLiabilityBroadCov.setPremium(MathHelper.roundUpDoller(this.BOPElectronicDataLiabilityBroadCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataLiabilityBroadCov,"../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicDataLiabilityBroadCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPElectronicDataLiabilityBroadCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPElectronicDataLiabilityBroadCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}