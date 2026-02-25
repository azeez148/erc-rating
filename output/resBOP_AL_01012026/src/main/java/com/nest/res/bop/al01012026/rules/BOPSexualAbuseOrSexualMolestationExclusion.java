package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSexualAbuseOrSexualMolestationExclusion  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationExclusion BOPSexualAbuseOrSexualMolestationExclusion;
	
	
	
	public void Premium ()  {
	  this.BOPSexualAbuseOrSexualMolestationExclusion.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationExclusion,"../IRPMFactor")))));

	  
	}
	public  BOPSexualAbuseOrSexualMolestationExclusion (com.nest.res.bop.al01012026.domain.BOPSexualAbuseOrSexualMolestationExclusion BOPSexualAbuseOrSexualMolestationExclusion)  {
	  this.BOPSexualAbuseOrSexualMolestationExclusion = BOPSexualAbuseOrSexualMolestationExclusion;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSexualAbuseOrSexualMolestationExclusion.setPremium(MathHelper.roundUpDoller(this.BOPSexualAbuseOrSexualMolestationExclusion.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSexualAbuseOrSexualMolestationExclusion,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSexualAbuseOrSexualMolestationExclusion.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSexualAbuseOrSexualMolestationExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSexualAbuseOrSexualMolestationExclusion.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}