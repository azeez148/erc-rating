package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail;

public class BOPY2KComputerRelatedProblemsExclSpecifiedCov  {

	
	
	
	private com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCov;
	private List<BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail> BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList;
	private com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailRule;
	
	
	
	public void setPremium ()  {
	  
		double finalPremium = 0;
		if(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList != null && this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList.size() > 0){
			for(com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail : BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList) {
				finalPremium = finalPremium + BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.getPremium();
			}
		}
this.BOPY2KComputerRelatedProblemsExclSpecifiedCov.setPremium(finalPremium) ;
	  
	}
	public  BOPY2KComputerRelatedProblemsExclSpecifiedCov (com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCov)  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCov = BOPY2KComputerRelatedProblemsExclSpecifiedCov;
this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList = BOPY2KComputerRelatedProblemsExclSpecifiedCov.getBOPY2KComputerRelatedProblemsExclSpecifiedCovDetail();

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList){
		for(BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail:BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList){
			BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailRule = new com.nest.res.bop.rules.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail(BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail);
			BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailRule.ProcessPremium1();

		}
	}
	setPremium();
	  
	}
	
	
	
	
	


	
}