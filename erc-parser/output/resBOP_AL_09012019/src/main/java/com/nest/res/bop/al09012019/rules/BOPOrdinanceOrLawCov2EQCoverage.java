package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2EQCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 ()  {
	  
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake/EarthquakeRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake/Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../BOPOrdinanceOrLawCov2Coverage/dsLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit/EQSubLimitRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit/Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../BOPOrdinanceOrLawCov2Coverage/dsLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public  BOPOrdinanceOrLawCov2EQCoverage (com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov2EQCoverage BOPOrdinanceOrLawCov2EQCoverage)  {
	  this.BOPOrdinanceOrLawCov2EQCoverage = BOPOrdinanceOrLawCov2EQCoverage;

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void ProcessPremium1 ()  {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2EQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverages 1, 2 and 3")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverages 1 and 2"))) && (XpathNode.selectNodes(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake").size() > 0.0 || XpathNode.selectNodes(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit").size() > 0.0)){
			this.BOPOrdinanceOrLawCov2EQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov2EQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake/EarthquakeRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEarthquake/Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../BOPOrdinanceOrLawCov2Coverage/dsLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit/EQSubLimitRate"))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../../BOPEQSubLimit/Factor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2EQCoverage,"../BOPOrdinanceOrLawCov2Coverage/dsLimit"))) / MathHelper.getDoubleValue(100.0)))));
		}
		else{
			this.BOPOrdinanceOrLawCov2EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	
	
	
	
	


	
}