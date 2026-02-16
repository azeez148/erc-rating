package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSnowPlowProdsCompldOpsHzdCov  {

	
	
	
	private com.nest.res.bop.domain.BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCov;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPSnowPlowProdsCompldOpsHzdCov (com.nest.res.bop.domain.BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCov)  {
	  this.BOPSnowPlowProdsCompldOpsHzdCov = BOPSnowPlowProdsCompldOpsHzdCov;

	  
	}
	public void Premium ()  {
	  this.BOPSnowPlowProdsCompldOpsHzdCov.setPremium(MathHelper.roundUpDoller(this.BOPSnowPlowProdsCompldOpsHzdCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSnowPlowProdsCompldOpsHzdCov,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSnowPlowProdsCompldOpsHzdCov.getPremium() != (double)0.0){
			this.BOPSnowPlowProdsCompldOpsHzdCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPSnowPlowProdsCompldOpsHzdCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}