package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExtddReportingPeriodEmpBenefitsLiabCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCov;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPExtddReportingPeriodEmpBenefitsLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExtddReportingPeriodEmpBenefitsLiabCov,"../IRPMFactor")))));

	  
	}
	public  BOPExtddReportingPeriodEmpBenefitsLiabCov (com.nest.res.bop.al09012019.domain.BOPExtddReportingPeriodEmpBenefitsLiabCov BOPExtddReportingPeriodEmpBenefitsLiabCov)  {
	  this.BOPExtddReportingPeriodEmpBenefitsLiabCov = BOPExtddReportingPeriodEmpBenefitsLiabCov;

	  
	}
	public void Premium ()  {
	  this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPExtddReportingPeriodEmpBenefitsLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExtddReportingPeriodEmpBenefitsLiabCov,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExtddReportingPeriodEmpBenefitsLiabCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExtddReportingPeriodEmpBenefitsLiabCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}