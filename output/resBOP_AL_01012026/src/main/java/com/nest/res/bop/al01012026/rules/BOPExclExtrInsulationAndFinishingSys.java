package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclExtrInsulationAndFinishingSys  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSys;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclExtrInsulationAndFinishingSys.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclExtrInsulationAndFinishingSys.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclExtrInsulationAndFinishingSys.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPExclExtrInsulationAndFinishingSys.setPremium(MathHelper.roundUpDoller(this.BOPExclExtrInsulationAndFinishingSys.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclExtrInsulationAndFinishingSys,"../IRPMFactor")))));

	  
	}
	public  BOPExclExtrInsulationAndFinishingSys (com.nest.res.bop.al01012026.domain.BOPExclExtrInsulationAndFinishingSys BOPExclExtrInsulationAndFinishingSys)  {
	  this.BOPExclExtrInsulationAndFinishingSys = BOPExclExtrInsulationAndFinishingSys;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclExtrInsulationAndFinishingSys.setPremium(MathHelper.roundUpDoller(this.BOPExclExtrInsulationAndFinishingSys.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclExtrInsulationAndFinishingSys,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}