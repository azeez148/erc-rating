package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail;
	
	
	
	public  BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail (com.nest.res.bop.al09012019.domain.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail)  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail = BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremium(MathHelper.roundUpDoller(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.setPremium(MathHelper.roundUpDoller(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPY2KComputerRelatedProblemsLimitedCovOptionsDetail,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}