package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimitDetail;

public class BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit;
	private List<BOPDesignatedLocationsProductsCompletedOperationsAggregateLimitDetail> BOPDesignatedLocationsProductsCompletedOperationsAggregateLimitDetailList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit,"../IRPMFactor")))));

	  
	}
	public  BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit (com.nest.res.bop.al01012026.domain.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit)  {
	  this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit = BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit;
this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimitDetailList = BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.getBOPDesignatedLocationsProductsCompletedOperationsAggregateLimitDetail();

	  
	}
	public void Premium ()  {
	  this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDesignatedLocationsProductsCompletedOperationsAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}