package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclPersonalAdvertisingInjury  {

	
	
	
	private com.nest.res.bop.domain.BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjury;
	
	
	
	public void Premium ()  {
	  this.BOPExclPersonalAdvertisingInjury.setPremium(MathHelper.roundUpDoller(this.BOPExclPersonalAdvertisingInjury.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclPersonalAdvertisingInjury,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclPersonalAdvertisingInjury.getPremium() != (double)0.0){
			this.BOPExclPersonalAdvertisingInjury.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclPersonalAdvertisingInjury.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPExclPersonalAdvertisingInjury (com.nest.res.bop.domain.BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjury)  {
	  this.BOPExclPersonalAdvertisingInjury = BOPExclPersonalAdvertisingInjury;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}