package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2And3Coverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage;
	
	
	
	public void Cov3InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov2And3Coverage.setCov3InclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov3CoverageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverage 1 with Coverages 2 and 3 Combined"))){
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../PostLossDirectPhysicalDamageFactor")))) * this.BOPOrdinanceOrLawCov2And3Coverage.getWorkingLimit_1()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2And3Coverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void workingLimit_1 ()  {
	  this.BOPOrdinanceOrLawCov2And3Coverage.setWorkingLimit_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov2And3Coverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPOrdinanceOrLawCov2And3Coverage.getCov3InclddLimit())) / MathHelper.getDoubleValue(100.0)));

	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverage 1 with Coverages 2 and 3 Combined"))){
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../../FinalBuildingRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../PostLossDirectPhysicalDamageFactor")))) * this.BOPOrdinanceOrLawCov2And3Coverage.getWorkingLimit_1()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public  BOPOrdinanceOrLawCov2And3Coverage (com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage)  {
	  this.BOPOrdinanceOrLawCov2And3Coverage = BOPOrdinanceOrLawCov2And3Coverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Cov3InclddLimit();
	
	workingLimit_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2And3Coverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPOrdinanceOrLawCov2And3Coverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3Coverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	
	
	
	
	


	
}