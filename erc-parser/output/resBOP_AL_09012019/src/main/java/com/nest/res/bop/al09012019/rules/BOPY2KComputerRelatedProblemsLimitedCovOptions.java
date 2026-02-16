package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail;

public class BOPY2KComputerRelatedProblemsLimitedCovOptions  {

	
	
	
	private com.nest.res.bop.al09012019.rules.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailRule;
	private List<BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail> BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList;
	private com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptions;
	
	
	
	public void ProcessPremium1 ()  {
	  
	if(null != BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList){
		for(BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail:BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList){
			BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailRule = new com.nest.res.bop.al09012019.rules.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail(BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail);
			BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailRule.ProcessPremium1();

		}
	}
	setTotalPremiumForCoverage();
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPY2KComputerRelatedProblemsLimitedCovOptions,"BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail") ){
			this.BOPY2KComputerRelatedProblemsLimitedCovOptions.setPremium(MathHelper.getDoubleValue(this.BOPY2KComputerRelatedProblemsLimitedCovOptions.getPremium() + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"Premium")))));
		}

	  
	}
	public  BOPY2KComputerRelatedProblemsLimitedCovOptions (com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsLimitedCovOptions BOPY2KComputerRelatedProblemsLimitedCovOptions)  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptions = BOPY2KComputerRelatedProblemsLimitedCovOptions;
this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetailList = BOPY2KComputerRelatedProblemsLimitedCovOptions.getBOPY2KComputerRelatedProblemsLimitedCovOptionsDetail();

	  
	}
	
	
	
	
	


	
}