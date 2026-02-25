package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionUnmannedAircraft  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionUnmannedAircraft BOPExclusionUnmannedAircraft;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionUnmannedAircraft.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionUnmannedAircraft.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionUnmannedAircraft.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPExclusionUnmannedAircraft (com.nest.res.bop.al01012026.domain.BOPExclusionUnmannedAircraft BOPExclusionUnmannedAircraft)  {
	  this.BOPExclusionUnmannedAircraft = BOPExclusionUnmannedAircraft;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionUnmannedAircraft.setPremium(MathHelper.roundUpDoller(this.BOPExclusionUnmannedAircraft.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionUnmannedAircraft,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionUnmannedAircraft.setPremium(MathHelper.roundUpDoller(this.BOPExclusionUnmannedAircraft.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionUnmannedAircraft,"../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}