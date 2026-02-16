package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2EQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage;
	
	
	
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake"))) != null){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake/EarthquakeRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake/Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../BOPOrdinanceOrLawCov2Coverage/dsLimit"))) / (double)100.0)));
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit"))) != null){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit/EQSubLimitRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit/Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../BOPOrdinanceOrLawCov2Coverage/dsLimit"))) / (double)100.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium1 ()  {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPOrdinanceOrLawCov2EQCoverage (com.nest.res.bop.domain.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage)  {
	  this.BOPOrdinanceOrLawCov2EQCoverage = BOPOrdinanceOrLawCov2EQCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2EQCoverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}