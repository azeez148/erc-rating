package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail (com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail)  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail = BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremium(MathHelper.roundUpDoller(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail,"../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremium(MathHelper.roundUpDoller(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPY2KComputerRelatedProblemsExclSpecifiedCovDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}