package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail  {

	
	
	
	private com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail;
	
	
	
	public void Premium ()  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremium(MathHelper.roundUpDoller(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.getPremium() != (double)0.0){
			this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail (com.nest.res.bop.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail)  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail = BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail;

	  
	}
	
	
	
	
	


	
}