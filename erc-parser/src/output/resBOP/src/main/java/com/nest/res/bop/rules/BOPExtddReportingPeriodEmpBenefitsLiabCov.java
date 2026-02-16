package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExtddReportingPeriodEmpBenefitsLiabCov  {

	
	
	
	private com.nest.res.bop.domain.BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCov;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPExtddReportingPeriodEmpBenefitsLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExtddReportingPeriodEmpBenefitsLiabCov,"../IRPMFactor")))));

	  
	}
	public  BOPExtddReportingPeriodEmpBenefitsLiabCov (com.nest.res.bop.domain.BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCov)  {
	  this.BOPExtddReportingPeriodEmpBenefitsLiabCov = BOPExtddReportingPeriodEmpBenefitsLiabCov;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExtddReportingPeriodEmpBenefitsLiabCov.getPremium() != (double)0.0){
			this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}