package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclPersonalAdvertisingInjury  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjury;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPExclPersonalAdvertisingInjury.setPremium(MathHelper.roundUpDoller(this.BOPExclPersonalAdvertisingInjury.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclPersonalAdvertisingInjury,"../IRPMFactor")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclPersonalAdvertisingInjury.setPremium(MathHelper.roundUpDoller(this.BOPExclPersonalAdvertisingInjury.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclPersonalAdvertisingInjury,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPExclPersonalAdvertisingInjury (com.nest.res.bop.al09012019.domain.BOPExclPersonalAdvertisingInjury BOPExclPersonalAdvertisingInjury)  {
	  this.BOPExclPersonalAdvertisingInjury = BOPExclPersonalAdvertisingInjury;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclPersonalAdvertisingInjury.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclPersonalAdvertisingInjury.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclPersonalAdvertisingInjury.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}