package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2And3EQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage;
	
	
	
	public  BOPOrdinanceOrLawCov2And3EQCoverage (com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3EQCoverage BOPOrdinanceOrLawCov2And3EQCoverage)  {
	  this.BOPOrdinanceOrLawCov2And3EQCoverage = BOPOrdinanceOrLawCov2And3EQCoverage;

	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake"))) != null){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake/EarthquakeRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEarthquake/Factor"))) * this.BOPOrdinanceOrLawCov2And3EQCoverage.getWorkingLimit_1()));
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit"))) != null){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit/EQSubLimitRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../../BOPEQSubLimit/Factor"))) * this.BOPOrdinanceOrLawCov2And3EQCoverage.getWorkingLimit_1()));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremium((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	workingLimit_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void workingLimit_1 ()  {
	  this.BOPOrdinanceOrLawCov2And3EQCoverage.setWorkingLimit_1(((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../BOPOrdinanceOrLawCov2And3Coverage/dsLimit"))) - (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3EQCoverage,"../BOPOrdinanceOrLawCov3Coverage/InclddLimit")))) / (double)100.0);

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2And3EQCoverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawCov2And3EQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}