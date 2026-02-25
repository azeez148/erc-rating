package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BusinessInterruptionPremium ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setBusinessInterruptionPremium(MathHelper.roundUpDoller(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.getBasicPremium() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../BusinessInterruptionCoverageFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void BasicPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("No"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setBasicPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../UnmannedAircraftRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../../../CommercialPropertyLCM")))) * (((MathHelper.getDoubleValue(1.0) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../WindstormOrHailExclusionCredit")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../FloodCoverageFactor")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../EarthquakeCoverageFactor"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../DeductibleFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../NewlyAcquiredPropertyFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../../../../IRPMFactor"))))));
		}
		else{
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../BlanketCoverageUnmannedAircraftAppliesToUnmannedAircraftNotIndividuallyDescribed"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setBasicPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../UnmannedAircraftRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../../../CommercialPropertyLCM")))) * (((MathHelper.getDoubleValue(1.0) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../WindstormOrHailExclusionCredit")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../FloodCoverageFactor")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../EarthquakeCoverageFactor"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../DeductibleFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../BlanketLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setBasicPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setPremium(MathHelper.getDoubleValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.getBasicPremium() + this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.getBusinessInterruptionPremium()));

	  
	}
	public void Premium ()  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.setPremium(MathHelper.getDoubleValue(this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.getBasicPremium() + this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov.getBusinessInterruptionPremium()));

	  
	}
	public  BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov)  {
	  this.BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov = BOPLimitedCoverageForUnmannedAircraftScheduledAndOrBlanketCoverageCov;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	BasicPremium();
	
	BusinessInterruptionPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}