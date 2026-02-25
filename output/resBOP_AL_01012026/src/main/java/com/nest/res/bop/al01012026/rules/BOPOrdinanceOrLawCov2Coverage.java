package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2Coverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage;
	
	
	
	public  BOPOrdinanceOrLawCov2Coverage (com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov2Coverage BOPOrdinanceOrLawCov2Coverage)  {
	  this.BOPOrdinanceOrLawCov2Coverage = BOPOrdinanceOrLawCov2Coverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverages 1, 2 and 3")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverages 1 and 2"))){
			this.BOPOrdinanceOrLawCov2Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../PostLossDirectPhysicalDamageFactor")))) * (MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov2Coverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPOrdinanceOrLawCov2Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2Coverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPOrdinanceOrLawCov2Coverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2Coverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2Coverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawCov2Coverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2Coverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverages 1, 2 and 3")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverages 1 and 2"))){
			this.BOPOrdinanceOrLawCov2Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../PostLossDirectPhysicalDamageFactor")))) * (MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov2Coverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2Coverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPOrdinanceOrLawCov2Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}