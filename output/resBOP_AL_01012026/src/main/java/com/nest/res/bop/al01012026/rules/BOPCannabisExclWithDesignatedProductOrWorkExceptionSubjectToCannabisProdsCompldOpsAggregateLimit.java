package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimitDetail;

public class BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit  {

	
	
	
	private List<BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimitDetail> BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimitDetailList;
	private com.nest.res.bop.al01012026.domain.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.setPremium(MathHelper.roundUpDoller(this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	public  BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit (com.nest.res.bop.al01012026.domain.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit)  {
	  this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit = BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit;
this.BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimitDetailList = BOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimit.getBOPCannabisExclWithDesignatedProductOrWorkExceptionSubjectToCannabisProdsCompldOpsAggregateLimitDetail();

	  
	}
	
	
	
	
	


	
}