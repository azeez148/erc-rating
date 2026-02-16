package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPDesignatedConstructionProjectsGenlAggLimit  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimit;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDesignatedConstructionProjectsGenlAggLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedConstructionProjectsGenlAggLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedConstructionProjectsGenlAggLimit,"../IRPMFactor")))));

	  
	}
	public  BOPDesignatedConstructionProjectsGenlAggLimit (com.nest.res.bop.al09012019.domain.BOPDesignatedConstructionProjectsGenlAggLimit BOPDesignatedConstructionProjectsGenlAggLimit)  {
	  this.BOPDesignatedConstructionProjectsGenlAggLimit = BOPDesignatedConstructionProjectsGenlAggLimit;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPDesignatedConstructionProjectsGenlAggLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedConstructionProjectsGenlAggLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedConstructionProjectsGenlAggLimit,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}