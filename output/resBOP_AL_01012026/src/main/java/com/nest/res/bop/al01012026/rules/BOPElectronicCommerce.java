package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicCommerce  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPElectronicCommerce BOPElectronicCommerce;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPElectronicCommerce.setPremium(MathHelper.roundUpDoller(this.BOPElectronicCommerce.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicCommerce,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPElectronicCommerce.setPremium(MathHelper.roundUpDoller(this.BOPElectronicCommerce.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicCommerce,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicCommerce.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPElectronicCommerce.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPElectronicCommerce.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPElectronicCommerce (com.nest.res.bop.al01012026.domain.BOPElectronicCommerce BOPElectronicCommerce)  {
	  this.BOPElectronicCommerce = BOPElectronicCommerce;

	  
	}
	
	
	
	
	


	
}