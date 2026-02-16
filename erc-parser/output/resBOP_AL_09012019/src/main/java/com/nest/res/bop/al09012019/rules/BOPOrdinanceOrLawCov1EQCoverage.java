package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov1EQCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov1EQCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov1EQFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPOrdinanceOrLawCov1EQCoverage (com.nest.res.bop.al09012019.domain.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage)  {
	  this.BOPOrdinanceOrLawCov1EQCoverage = BOPOrdinanceOrLawCov1EQCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../Coverage"))).equals(MathHelper.getStringValue("Coverage 3 Only")) && (XpathNode.selectNodes(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake").size() > 0.0 || XpathNode.selectNodes(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit").size() > 0.0) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../Coverage"))).equals(MathHelper.getStringValue("Neither Coverage 1, 2, or 3"))){
			this.BOPOrdinanceOrLawCov1EQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov1EQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1EQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake/EarthquakeBuildingPremium"))))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1EQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit/BldgPremium"))))));
		}
		else{
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake")) != null){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1EQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake/EarthquakeBuildingPremium"))))));
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit")) != null){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1EQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit/BldgPremium"))))));
		}
		else{
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov1EQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}