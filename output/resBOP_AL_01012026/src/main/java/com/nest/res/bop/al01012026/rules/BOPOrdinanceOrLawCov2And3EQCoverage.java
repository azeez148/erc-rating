package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2And3EQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake/EarthquakeRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake/Factor"))) * this.BOPOrdinanceOrLawCov2And3EQCoverage.getWorkingLimit_1())));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit/EQSubLimitRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit/Factor"))) * this.BOPOrdinanceOrLawCov2And3EQCoverage.getWorkingLimit_1())));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake/EarthquakeRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake/Factor"))) * this.BOPOrdinanceOrLawCov2And3EQCoverage.getWorkingLimit_1())));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit/EQSubLimitRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit/Factor"))) * this.BOPOrdinanceOrLawCov2And3EQCoverage.getWorkingLimit_1())));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverage 1 with Coverages 2 and 3 Combined")) && (XpathNode.selectNodes(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake").size() > 0.0 || XpathNode.selectNodes(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit").size() > 0.0)){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2And3EQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPOrdinanceOrLawCov2And3EQCoverage (com.nest.res.bop.al01012026.domain.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage)  {
	  this.BOPOrdinanceOrLawCov2And3EQCoverage = BOPOrdinanceOrLawCov2And3EQCoverage;

	  
	}
	public void workingLimit_1 ()  {
	  this.BOPOrdinanceOrLawCov2And3EQCoverage.setWorkingLimit_1(MathHelper.getDoubleValue(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../BOPOrdinanceOrLawCov2And3Coverage/dsLimit"))) - (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../BOPOrdinanceOrLawCov3Coverage/InclddLimit")))) / MathHelper.getDoubleValue(100.0)));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	workingLimit_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}