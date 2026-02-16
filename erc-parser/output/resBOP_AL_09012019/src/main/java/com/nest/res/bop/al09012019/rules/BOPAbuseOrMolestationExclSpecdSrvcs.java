package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAbuseOrMolestationExclSpecdSrvcs  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcs;
	
	
	
	public void Premium ()  {
	  this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremium(MathHelper.roundUpDoller(this.BOPAbuseOrMolestationExclSpecdSrvcs.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAbuseOrMolestationExclSpecdSrvcs,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAbuseOrMolestationExclSpecdSrvcs.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremium(MathHelper.roundUpDoller(this.BOPAbuseOrMolestationExclSpecdSrvcs.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAbuseOrMolestationExclSpecdSrvcs,"../IRPMFactor")))));

	  
	}
	public  BOPAbuseOrMolestationExclSpecdSrvcs (com.nest.res.bop.al09012019.domain.BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcs)  {
	  this.BOPAbuseOrMolestationExclSpecdSrvcs = BOPAbuseOrMolestationExclSpecdSrvcs;

	  
	}
	
	
	
	
	


	
}