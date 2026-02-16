package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("PeriodOfRestorationFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage,"../../BOPStructureBuildingCoverage/Premium")))));

	  
	}
	public  BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage (com.nest.res.bop.domain.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage)  {
	  this.BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage = BOPOrdinanceOrLawIncrdPeriodOfRestorationCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}