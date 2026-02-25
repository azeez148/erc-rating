package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage;
	
	
	
	public void CommonRating1 ()  {
	  
	PolicyIndicator_Calculation();
	
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	PremiumBIPD();
	
	  
	}
	public void PremiumBIPD ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.setPremiumBIPD(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.getUACBodilyInjuryPropertyDamageRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage,"../../../GeneralLiabilityLCM")))) * this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.getUACOwnershipAndOperationFactor() * this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.getUACPrimaryPlaceOfOperationFactor() * this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.getUACUsageFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage,"../../IncreasedLimitsFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage,"../../../PropDamageLiabDedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage,"../../../IRPMFactor")))));

	  
	}
	public  BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage)  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage = BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage,"../BodilyInjuryAndPropertyDamage"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftBIPDCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}