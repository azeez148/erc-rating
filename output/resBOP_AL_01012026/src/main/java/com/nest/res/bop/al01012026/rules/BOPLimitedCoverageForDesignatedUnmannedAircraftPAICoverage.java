package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage (com.nest.res.bop.al01012026.domain.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage)  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage = BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage;

	  
	}
	public void CommonRating1_CommonRatingSub1 ()  {
	  
	PremiumPAI();
	
	  
	}
	public void CommonRating1 ()  {
	  
	PolicyIndicator_Calculation();
	
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void PremiumPAI ()  {
	  this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.setPremiumPAI(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.getUACPersonalAdvertisingInjuryRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage,"../../../GeneralLiabilityLCM")))) * this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.getUACOwnershipAndOperationFactor() * this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.getUACPrimaryPlaceOfOperationFactor() * this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.getUACUsageFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage,"../../IncreasedLimitsFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage,"../../../PropDamageLiabDedFactor")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage,"../../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage,"../PersonalAndAdvertisingInjury"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPLimitedCoverageForDesignatedUnmannedAircraftPAICoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}