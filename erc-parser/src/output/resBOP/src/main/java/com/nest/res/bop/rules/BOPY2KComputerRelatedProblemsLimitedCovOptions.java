package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail;

public class BOPY2KComputerRelatedProblemsLimitedCovOptions  {

	
	
	
	private com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailRule;
	private List<BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail> BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList;
	private com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptions;
	
	
	
	public  BOPY2KComputerRelatedProblemsLimitedCovOptions (com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptions)  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptions = BOPY2KComputerRelatedProblemsLimitedCovOptions;
this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList = BOPY2KComputerRelatedProblemsLimitedCovOptions.getBOPY2KComputerRelatedProblemsLimitedCovOptionsDetail();

	  
	}
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList != null && this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail : BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList) {
				finalPremium = finalPremium + BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.getPremium();
			}
		}
this.BOPY2KComputerRelatedProblemsLimitedCovOptions.setPremium(finalPremium) ;
	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList){
		for(BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail:BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList){
			BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailRule = new com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail(BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail);
			BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}