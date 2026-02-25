package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDesignatedLocsGenlAggLimit  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimit;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPDesignatedLocsGenlAggLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedLocsGenlAggLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedLocsGenlAggLimit,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDesignatedLocsGenlAggLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDesignatedLocsGenlAggLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDesignatedLocsGenlAggLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPDesignatedLocsGenlAggLimit (com.nest.res.bop.al01012026.domain.BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimit)  {
	  this.BOPDesignatedLocsGenlAggLimit = BOPDesignatedLocsGenlAggLimit;

	  
	}
	public void Premium ()  {
	  this.BOPDesignatedLocsGenlAggLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedLocsGenlAggLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedLocsGenlAggLimit,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}