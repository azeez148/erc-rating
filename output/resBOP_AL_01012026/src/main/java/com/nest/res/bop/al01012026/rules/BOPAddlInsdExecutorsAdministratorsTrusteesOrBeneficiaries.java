package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries,"../IRPMFactor")))));

	  
	}
	public  BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries (com.nest.res.bop.al01012026.domain.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries)  {
	  this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries = BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.setPremium(MathHelper.roundUpDoller(this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAddlInsdExecutorsAdministratorsTrusteesOrBeneficiaries,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}