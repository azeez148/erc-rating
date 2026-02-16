package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclExtrInsulationAndFinishingSys  {

	
	
	
	private com.nest.res.bop.domain.BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSys;
	
	
	
	public  BOPExclExtrInsulationAndFinishingSys (com.nest.res.bop.domain.BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSys)  {
	  this.BOPExclExtrInsulationAndFinishingSys = BOPExclExtrInsulationAndFinishingSys;

	  
	}
	public void Premium ()  {
	  this.BOPExclExtrInsulationAndFinishingSys.setPremium(MathHelper.roundUpDoller(this.BOPExclExtrInsulationAndFinishingSys.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclExtrInsulationAndFinishingSys,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclExtrInsulationAndFinishingSys.getPremium() != (double)0.0){
			this.BOPExclExtrInsulationAndFinishingSys.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPExclExtrInsulationAndFinishingSys.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}