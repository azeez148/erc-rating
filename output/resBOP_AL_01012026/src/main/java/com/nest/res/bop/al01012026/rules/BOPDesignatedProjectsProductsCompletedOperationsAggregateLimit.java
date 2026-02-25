package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimitDetail;

public class BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit;
	private List<BOPDesignatedProjectsProductsCompletedOperationsAggregateLimitDetail> BOPDesignatedProjectsProductsCompletedOperationsAggregateLimitDetailList;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit (com.nest.res.bop.al01012026.domain.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit)  {
	  this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit = BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit;
this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimitDetailList = BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.getBOPDesignatedProjectsProductsCompletedOperationsAggregateLimitDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPDesignatedProjectsProductsCompletedOperationsAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}