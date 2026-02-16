package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLmtdExclPersonalAndAdvertisingInjuryLawyers  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyers;
	
	
	
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremium(MathHelper.roundUpDoller(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPLmtdExclPersonalAndAdvertisingInjuryLawyers (com.nest.res.bop.al09012019.domain.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers BOPLmtdExclPersonalAndAdvertisingInjuryLawyers)  {
	  this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers = BOPLmtdExclPersonalAndAdvertisingInjuryLawyers;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.setPremium(MathHelper.roundUpDoller(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLmtdExclPersonalAndAdvertisingInjuryLawyers,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}