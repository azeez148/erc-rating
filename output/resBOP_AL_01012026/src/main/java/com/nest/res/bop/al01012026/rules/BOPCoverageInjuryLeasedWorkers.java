package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCoverageInjuryLeasedWorkers  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCoverageInjuryLeasedWorkers BOPCoverageInjuryLeasedWorkers;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCoverageInjuryLeasedWorkers.setPremium(MathHelper.roundUpDoller(this.BOPCoverageInjuryLeasedWorkers.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCoverageInjuryLeasedWorkers,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPCoverageInjuryLeasedWorkers.setPremium(MathHelper.roundUpDoller(this.BOPCoverageInjuryLeasedWorkers.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCoverageInjuryLeasedWorkers,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCoverageInjuryLeasedWorkers.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCoverageInjuryLeasedWorkers.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCoverageInjuryLeasedWorkers.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPCoverageInjuryLeasedWorkers (com.nest.res.bop.al01012026.domain.BOPCoverageInjuryLeasedWorkers BOPCoverageInjuryLeasedWorkers)  {
	  this.BOPCoverageInjuryLeasedWorkers = BOPCoverageInjuryLeasedWorkers;

	  
	}
	
	
	
	
	


	
}