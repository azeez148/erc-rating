package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicCommerce  {

	
	
	
	private com.nest.res.bop.domain.BOPElectronicCommerce BOPElectronicCommerce;
	
	
	
	public  BOPElectronicCommerce (com.nest.res.bop.domain.BOPElectronicCommerce BOPElectronicCommerce)  {
	  this.BOPElectronicCommerce = BOPElectronicCommerce;

	  
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
	  
		if(this.BOPElectronicCommerce.getPremium() != (double)0.0){
			this.BOPElectronicCommerce.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPElectronicCommerce.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}