package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.setPremium(MathHelper.roundUpDoller(this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.setPremium(MathHelper.roundUpDoller(this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS,"../IRPMFactor")))));

	  
	}
	public  BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS (com.nest.res.bop.al01012026.domain.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS)  {
	  this.BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS = BOPExclusionPerfluoroalkylAndPolyfluoroalkylSubstancesPFAS;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}