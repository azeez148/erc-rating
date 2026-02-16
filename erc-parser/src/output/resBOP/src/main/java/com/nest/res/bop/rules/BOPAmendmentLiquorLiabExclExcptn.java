package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptnDetail;

public class BOPAmendmentLiquorLiabExclExcptn  {

	
	
	
	private com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptn;
	private com.nest.res.bop.rules.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetailRule;
	private List<BOPAmendmentLiquorLiabExclExcptnDetail> BOPAmendmentLiquorLiabExclExcptnDetailList;
	
	
	
	public  BOPAmendmentLiquorLiabExclExcptn (com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptn BOPAmendmentLiquorLiabExclExcptn)  {
	  this.BOPAmendmentLiquorLiabExclExcptn = BOPAmendmentLiquorLiabExclExcptn;
this.BOPAmendmentLiquorLiabExclExcptnDetailList = BOPAmendmentLiquorLiabExclExcptn.getBOPAmendmentLiquorLiabExclExcptnDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPAmendmentLiquorLiabExclExcptnDetailList){
		for(BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail:BOPAmendmentLiquorLiabExclExcptnDetailList){
			BOPAmendmentLiquorLiabExclExcptnDetailRule = new com.nest.res.bop.rules.BOPAmendmentLiquorLiabExclExcptnDetail(BOPAmendmentLiquorLiabExclExcptnDetail);
			BOPAmendmentLiquorLiabExclExcptnDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPAmendmentLiquorLiabExclExcptnDetailList != null && this.BOPAmendmentLiquorLiabExclExcptnDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPAmendmentLiquorLiabExclExcptnDetail BOPAmendmentLiquorLiabExclExcptnDetail : BOPAmendmentLiquorLiabExclExcptnDetailList) {
				finalPremium = finalPremium + BOPAmendmentLiquorLiabExclExcptnDetail.getPremium();
			}
		}
this.BOPAmendmentLiquorLiabExclExcptn.setPremium(finalPremium) ;
	  
	}
	
	
	
	
	


	
}