package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmpBenefitsLiabCov  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCov;
	
	
	
	public void Premium ()  {
	  this.BOPEmpBenefitsLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPEmpBenefitsLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmpBenefitsLiabCov,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEmpBenefitsLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPEmpBenefitsLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmpBenefitsLiabCov,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmpBenefitsLiabCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEmpBenefitsLiabCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEmpBenefitsLiabCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPEmpBenefitsLiabCov (com.nest.res.bop.al09012019.domain.BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCov)  {
	  this.BOPEmpBenefitsLiabCov = BOPEmpBenefitsLiabCov;

	  
	}
	
	
	
	
	


	
}