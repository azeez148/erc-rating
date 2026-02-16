package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAbuseOrMolestationExclSpecdSrvcs  {

	
	
	
	private com.nest.res.bop.domain.BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcs;
	
	
	
	public  BOPAbuseOrMolestationExclSpecdSrvcs (com.nest.res.bop.domain.BOPAbuseOrMolestationExclSpecdSrvcs BOPAbuseOrMolestationExclSpecdSrvcs)  {
	  this.BOPAbuseOrMolestationExclSpecdSrvcs = BOPAbuseOrMolestationExclSpecdSrvcs;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAbuseOrMolestationExclSpecdSrvcs.getPremium() != (double)0.0){
			this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPAbuseOrMolestationExclSpecdSrvcs.setPremium(MathHelper.roundUpDoller(this.BOPAbuseOrMolestationExclSpecdSrvcs.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAbuseOrMolestationExclSpecdSrvcs,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}