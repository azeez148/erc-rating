package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail;
	
	
	
	public void Premium ()  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremium(MathHelper.roundUpDoller(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.getPremium() != (double)0.0){
			this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail (com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail)  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail = BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail;

	  
	}
	
	
	
	
	


	
}