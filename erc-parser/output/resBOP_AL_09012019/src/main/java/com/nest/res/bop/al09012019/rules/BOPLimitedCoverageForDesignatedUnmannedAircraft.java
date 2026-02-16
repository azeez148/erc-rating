package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;
import com.nest.res.bop.al09012019.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftDetail;

public class BOPLimitedCoverageForDesignatedUnmannedAircraft  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft;
	private List<BOPLimitedCoverageForDesignatedUnmannedAircraftDetail> BOPLimitedCoverageForDesignatedUnmannedAircraftDetailList;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremium(MathHelper.roundUpDoller(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraft,"../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremium(MathHelper.roundUpDoller(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getManualPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraft,"../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedCoverageForDesignatedUnmannedAircraft.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraft.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPLimitedCoverageForDesignatedUnmannedAircraft (com.nest.res.bop.al09012019.domain.BOPLimitedCoverageForDesignatedUnmannedAircraft BOPLimitedCoverageForDesignatedUnmannedAircraft)  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraft = BOPLimitedCoverageForDesignatedUnmannedAircraft;
this.BOPLimitedCoverageForDesignatedUnmannedAircraftDetailList = BOPLimitedCoverageForDesignatedUnmannedAircraft.getBOPLimitedCoverageForDesignatedUnmannedAircraftDetail();

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	setTotalPremiumForCoverage();
	  
	}
	
	
	
	
	


	
}