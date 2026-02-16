package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void earthquakeCoveragePremium_1 ()  {
	  
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEarthquake"))) != null){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setEarthquakeCoveragePremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEarthquake/EarthquakeBuildingPremium"))));
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEQSubLimit"))) != null){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setEarthquakeCoveragePremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage,"../../BOPEQSubLimit/BldgPremium"))));
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setEarthquakeCoveragePremium_1((double)0.0);
		}
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationEQFactor",String.valueOf( "Y"))));

	  
	}
	public  BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage (com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage)  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage = BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	earthquakeCoveragePremium_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getFactor() * this.BOPOrdinanceOrLawIncrdPeriodOfRestorationEQCoverage.getEarthquakeCoveragePremium_1()));

	  
	}
	
	
	
	
	


	
}