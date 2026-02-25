package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance;
	
	
	
	public void Premium ()  {
	  this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.setPremium(MathHelper.roundUpDoller(this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.setPremium(MathHelper.roundUpDoller(this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance (com.nest.res.bop.al01012026.domain.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance)  {
	  this.BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance = BOPExcessInsuranceProvisionOrderOfResponseWhenYouAreAnAdditionalInsuredOnOtherInsurance;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}