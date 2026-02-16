package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedCoverageForDesignatedUnmannedAircraft  {

	
	
	
	private com.nest.res.bop.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft;
	
	
	
	public  BOPLimitedCoverageForDesignatedUnmannedAircraft (com.nest.res.bop.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft)  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft = BOPLimitedCoverageForDesignatedUnmannedAircraft;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremium(MathHelper.roundUpDoller(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraft,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getPremium() != (double)0.0){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}