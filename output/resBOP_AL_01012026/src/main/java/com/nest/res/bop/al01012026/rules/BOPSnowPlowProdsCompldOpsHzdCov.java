package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPSnowPlowProdsCompldOpsHzdCov  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCov;
	
	
	
	public void Premium ()  {
	  this.BOPSnowPlowProdsCompldOpsHzdCov.setPremium(MathHelper.roundUpDoller(this.BOPSnowPlowProdsCompldOpsHzdCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSnowPlowProdsCompldOpsHzdCov,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPSnowPlowProdsCompldOpsHzdCov.setPremium(MathHelper.roundUpDoller(this.BOPSnowPlowProdsCompldOpsHzdCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPSnowPlowProdsCompldOpsHzdCov,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPSnowPlowProdsCompldOpsHzdCov (com.nest.res.bop.al01012026.domain.BOPSnowPlowProdsCompldOpsHzdCov BOPSnowPlowProdsCompldOpsHzdCov)  {
	  this.BOPSnowPlowProdsCompldOpsHzdCov = BOPSnowPlowProdsCompldOpsHzdCov;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPSnowPlowProdsCompldOpsHzdCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPSnowPlowProdsCompldOpsHzdCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPSnowPlowProdsCompldOpsHzdCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}