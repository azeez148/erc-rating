package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al01012026.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail;

public class BOPY2KComputerRelatedProblemsExclSpecifiedCov  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCov;
	private List<BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail> BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList;
	private com.nest.res.bop.al01012026.rules.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailRule;
	
	
	
	public  BOPY2KComputerRelatedProblemsExclSpecifiedCov (com.nest.res.bop.al01012026.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCov BOPY2KComputerRelatedProblemsExclSpecifiedCov)  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCov = BOPY2KComputerRelatedProblemsExclSpecifiedCov;
this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList = BOPY2KComputerRelatedProblemsExclSpecifiedCov.getBOPY2KComputerRelatedProblemsExclSpecifiedCovDetail();

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPY2KComputerRelatedProblemsExclSpecifiedCov,"BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail") ){
			this.BOPY2KComputerRelatedProblemsExclSpecifiedCov.setPremium(MathHelper.getDoubleValue(this.BOPY2KComputerRelatedProblemsExclSpecifiedCov.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public void ProcessPremium1 ()  {
	  
	if(null != BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList){
		for(BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail:BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailList){
			BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailRule = new com.nest.res.bop.al01012026.rules.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail(BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail);
			BOPY2KComputerRelatedProblemsExclSpecifiedCovDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}