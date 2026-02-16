package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPAmendmentLiquorLiabExclExcptnDetail;

public class BOPAmendmentLiquorLiabExclExcptn  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptn;
	private com.nest.res.bop.al09012019.rules.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetailRule;
	private List<BOPAmendmentLiquorLiabExclExcptnDetail> BOPAmendmentLiquorLiabExclExcptnDetailList;
	
	
	
	public  BOPAmendmentLiquorLiabExclExcptn (com.nest.res.bop.al09012019.domain.BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptn)  {
	  this.BOPAmendmentLiquorLiabExclExcptn = BOPAmendmentLiquorLiabExclExcptn;
this.BOPAmendmentLiquorLiabExclExcptnDetailList = BOPAmendmentLiquorLiabExclExcptn.getBOPAmendmentLiquorLiabExclExcptnDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPAmendmentLiquorLiabExclExcptn,"BOPAmendmentLiquorLiabExclExcptnDetail") ){
			this.BOPAmendmentLiquorLiabExclExcptn.setPremium(MathHelper.getDoubleValue(this.BOPAmendmentLiquorLiabExclExcptn.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAmendmentLiquorLiabExclExcptnDetailList){
		for(BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail:BOPAmendmentLiquorLiabExclExcptnDetailList){
			BOPAmendmentLiquorLiabExclExcptnDetailRule = new com.nest.res.bop.al09012019.rules.BOPAmendmentLiquorLiabExclExcptnDetail(BOPAmendmentLiquorLiabExclExcptnDetail);
			BOPAmendmentLiquorLiabExclExcptnDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}