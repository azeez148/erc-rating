package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPClassificationOutdoorPropertyCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPClassificationOutdoorPropertyCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("OutdoorPropertyFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	classFinalBusnPrsnlPropRate_1();
	
	RatingLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void classFinalBusnPrsnlPropRate_1 ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
		if(((XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../FinalBusnPrsnlPropRate"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../FinalBusnPrsnlPropRate"))) != 0.0){
			this.BOPClassificationOutdoorPropertyCoverage.setClassFinalBusnPrsnlPropRate_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../FinalBusnPrsnlPropRate"))));
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setClassFinalBusnPrsnlPropRate_1((double)0.0);
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getPremium() != (double)0.0){
			this.BOPClassificationOutdoorPropertyCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPClassificationOutdoorPropertyCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("OutdoorPropertyCoverageInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
			this.BOPClassificationOutdoorPropertyCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPClassificationOutdoorPropertyCoverage.getFactor() * this.BOPClassificationOutdoorPropertyCoverage.getClassFinalBusnPrsnlPropRate_1()) * (double)this.BOPClassificationOutdoorPropertyCoverage.getRatingLimit()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPClassificationOutdoorPropertyCoverage,"../../../../IRPMFactor")))));
		}
		else{
			this.BOPClassificationOutdoorPropertyCoverage.setPremium((double)0.0);
		}
	  
	}
	public  BOPClassificationOutdoorPropertyCoverage (com.nest.res.bop.domain.BOPClassificationOutdoorPropertyCoverage BOPClassificationOutdoorPropertyCoverage)  {
	  this.BOPClassificationOutdoorPropertyCoverage = BOPClassificationOutdoorPropertyCoverage;

	  
	}
	public void RatingLimit ()  {
	  
		if(this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() > this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()){
			this.BOPClassificationOutdoorPropertyCoverage.setRatingLimit((this.BOPClassificationOutdoorPropertyCoverage.getDsLimit() - this.BOPClassificationOutdoorPropertyCoverage.getInclddLimit()) / (int)100.0);
		}
	  
	}
	
	
	
	
	


	
}