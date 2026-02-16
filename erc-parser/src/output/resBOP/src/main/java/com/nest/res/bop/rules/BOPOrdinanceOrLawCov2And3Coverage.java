package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPOrdinanceOrLawCov2And3Coverage  {

	
	
	
	private com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Cov3InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPOrdinanceOrLawCov2And3Coverage.setCov3InclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OrdinanceOrLawCov3CoverageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void workingLimit_1 ()  {
	  this.BOPOrdinanceOrLawCov2And3Coverage.setWorkingLimit_1((Double.valueOf(this.BOPOrdinanceOrLawCov2And3Coverage.getDsLimit()) - Double.valueOf(this.BOPOrdinanceOrLawCov2And3Coverage.getCov3InclddLimit())) / (double)100.0);

	  
	}
	public  BOPOrdinanceOrLawCov2And3Coverage (com.nest.res.bop.domain.BOPOrdinanceOrLawCov2And3Coverage BOPOrdinanceOrLawCov2And3Coverage)  {
	  this.BOPOrdinanceOrLawCov2And3Coverage = BOPOrdinanceOrLawCov2And3Coverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPOrdinanceOrLawCov2And3Coverage.getPremium() != (double)0.0){
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../Coverage"))).equals((String)"Coverage 1 with Coverages 2 and 3 Combined")){
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../../FinalBuildingRate"))) * this.BOPOrdinanceOrLawCov2And3Coverage.getWorkingLimit_1()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPOrdinanceOrLawCov2And3Coverage,"../../../../IRPMFactor")))));
		}
		else{
			this.BOPOrdinanceOrLawCov2And3Coverage.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Cov3InclddLimit();
	
	workingLimit_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}