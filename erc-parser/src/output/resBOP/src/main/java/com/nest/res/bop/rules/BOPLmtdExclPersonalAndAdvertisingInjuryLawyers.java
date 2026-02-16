package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLmtdExclPersonalAndAdvertisingInjuryLawyers  {

	
	
	
	private com.nest.res.bop.domain.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyers;
	
	
	
	public  BOPLmtdExclPersonalAndAdvertisingInjuryLawyers (com.nest.res.bop.domain.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyers)  {
	  this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers = BOPLmtdExclPersonalAndAdvertisingInjuryLawyers;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.getPremium() != (double)0.0){
			this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremium(MathHelper.roundUpDoller(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers,"../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}