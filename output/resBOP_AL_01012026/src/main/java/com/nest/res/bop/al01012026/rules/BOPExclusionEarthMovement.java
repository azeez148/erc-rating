package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionEarthMovement  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionEarthMovement BOPExclusionEarthMovement;
	
	
	
	public void Premium ()  {
	  this.BOPExclusionEarthMovement.setPremium(MathHelper.roundUpDoller(this.BOPExclusionEarthMovement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionEarthMovement,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPExclusionEarthMovement (com.nest.res.bop.al01012026.domain.BOPExclusionEarthMovement BOPExclusionEarthMovement)  {
	  this.BOPExclusionEarthMovement = BOPExclusionEarthMovement;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionEarthMovement.setPremium(MathHelper.roundUpDoller(this.BOPExclusionEarthMovement.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionEarthMovement,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionEarthMovement.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionEarthMovement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionEarthMovement.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}