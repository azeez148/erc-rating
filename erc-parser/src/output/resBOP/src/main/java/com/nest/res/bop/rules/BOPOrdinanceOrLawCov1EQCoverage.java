package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov1EQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov1EQCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov1EQFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPOrdinanceOrLawCov1EQCoverage (com.nest.res.bop.domain.BOPOrdinanceOrLawCov1EQCoverage BOPOrdinanceOrLawCov1EQCoverage)  {
	  this.BOPOrdinanceOrLawCov1EQCoverage = BOPOrdinanceOrLawCov1EQCoverage;

	  
	}
	public void Premium ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake"))) != null){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1EQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEarthquake/EarthquakeBuildingPremium")))));
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit"))) != null){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1EQCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1EQCoverage,"../../BOPEQSubLimit/BldgPremium")))));
		}
		else{
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremium((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov1EQCoverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawCov1EQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}