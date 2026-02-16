package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov1Coverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov1Coverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawCov1Coverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawCov1Coverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPOrdinanceOrLawCov1Coverage (com.nest.res.bop.domain.BOPOrdinanceOrLawCov1Coverage BOPOrdinanceOrLawCov1Coverage)  {
	  this.BOPOrdinanceOrLawCov1Coverage = BOPOrdinanceOrLawCov1Coverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov1Coverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov1Factor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPOrdinanceOrLawCov1Coverage.setPremium(MathHelper.roundUpDoller(this.BOPOrdinanceOrLawCov1Coverage.getFactor() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov1Coverage,"../../BOPStructureBuildingCoverage/Premium")))));

	  
	}
	
	
	
	
	


	
}