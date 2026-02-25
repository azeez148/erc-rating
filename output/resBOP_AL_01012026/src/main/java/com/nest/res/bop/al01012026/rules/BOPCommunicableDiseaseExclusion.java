package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCommunicableDiseaseExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPCommunicableDiseaseExclusion BOPCommunicableDiseaseExclusion;
	
	
	
	public void Premium ()  {
	  this.BOPCommunicableDiseaseExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCommunicableDiseaseExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCommunicableDiseaseExclusion,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCommunicableDiseaseExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCommunicableDiseaseExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCommunicableDiseaseExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPCommunicableDiseaseExclusion (com.nest.res.bop.al01012026.domain.BOPCommunicableDiseaseExclusion BOPCommunicableDiseaseExclusion)  {
	  this.BOPCommunicableDiseaseExclusion = BOPCommunicableDiseaseExclusion;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCommunicableDiseaseExclusion.setPremium(MathHelper.roundUpDoller(this.BOPCommunicableDiseaseExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCommunicableDiseaseExclusion,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}