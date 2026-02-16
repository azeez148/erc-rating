package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDesignatedLocsGenlAggLimit  {

	
	
	
	private com.nest.res.bop.domain.BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimit;
	
	
	
	public void Premium ()  {
	  this.BOPDesignatedLocsGenlAggLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedLocsGenlAggLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedLocsGenlAggLimit,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPDesignatedLocsGenlAggLimit (com.nest.res.bop.domain.BOPDesignatedLocsGenlAggLimit BOPDesignatedLocsGenlAggLimit)  {
	  this.BOPDesignatedLocsGenlAggLimit = BOPDesignatedLocsGenlAggLimit;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDesignatedLocsGenlAggLimit.getPremium() != (double)0.0){
			this.BOPDesignatedLocsGenlAggLimit.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPDesignatedLocsGenlAggLimit.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}