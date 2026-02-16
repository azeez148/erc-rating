package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEmpBenefitsLiabCov  {

	
	
	
	private com.nest.res.bop.domain.BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCov;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPEmpBenefitsLiabCov.getPremium() != (double)0.0){
			this.BOPEmpBenefitsLiabCov.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEmpBenefitsLiabCov.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPEmpBenefitsLiabCov (com.nest.res.bop.domain.BOPEmpBenefitsLiabCov BOPEmpBenefitsLiabCov)  {
	  this.BOPEmpBenefitsLiabCov = BOPEmpBenefitsLiabCov;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPEmpBenefitsLiabCov.setPremium(MathHelper.roundUpDoller(this.BOPEmpBenefitsLiabCov.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPEmpBenefitsLiabCov,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}