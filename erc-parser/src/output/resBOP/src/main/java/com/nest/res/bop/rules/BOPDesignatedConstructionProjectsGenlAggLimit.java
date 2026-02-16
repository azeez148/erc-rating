package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDesignatedConstructionProjectsGenlAggLimit  {

	
	
	
	private com.nest.res.bop.domain.BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimit;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedConstructionProjectsGenlAggLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedConstructionProjectsGenlAggLimit,"../IRPMFactor")))));

	  
	}
	public  BOPDesignatedConstructionProjectsGenlAggLimit (com.nest.res.bop.domain.BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimit)  {
	  this.BOPDesignatedConstructionProjectsGenlAggLimit = BOPDesignatedConstructionProjectsGenlAggLimit;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDesignatedConstructionProjectsGenlAggLimit.getPremium() != (double)0.0){
			this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}