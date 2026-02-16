package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov3Coverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov3Coverage,"../Coverage"))).equals((String)"Coverages 1, 2 and 3") || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov3Coverage,"../Coverage"))).equals((String)"Coverage 3 Only")){
			this.BOPOrdinanceOrLawCov3Coverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov3Coverage,"../../FinalBuildingRate"))) * ((double)this.BOPOrdinanceOrLawCov3Coverage.getDsLimit() - (double)this.BOPOrdinanceOrLawCov3Coverage.getInclddLimit()) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov3Coverage,"../../../../IRPMFactor")))));
		}
		else{
			this.BOPOrdinanceOrLawCov3Coverage.setPremium((double)0.0);
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov3Coverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawCov3Coverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawCov3Coverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPOrdinanceOrLawCov3Coverage (com.nest.res.bop.domain.BOPOrdinanceOrLawCov3Coverage BOPOrdinanceOrLawCov3Coverage)  {
	  this.BOPOrdinanceOrLawCov3Coverage = BOPOrdinanceOrLawCov3Coverage;

	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov3Coverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov3CoverageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}