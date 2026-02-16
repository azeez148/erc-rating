package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTheftLimitationsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage;
	
	
	
	public void rABOPType_1 ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
		if(((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPType"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPType"))).equals((String)"")){
			this.BOPTheftLimitationsCoverage.setRABOPType_1((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPType"))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setRABOPType_1((String)"");
		}
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getPremium() != (double)0.0){
			this.BOPTheftLimitationsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPTheftLimitationsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void RatingLimit ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
			this.BOPTheftLimitationsCoverage.setRatingLimit((this.BOPTheftLimitationsCoverage.getDsLimit() - this.BOPTheftLimitationsCoverage.getInclddLimit()) / (int)100.0);
		}
	  
	}
	public void rABOPWanted_1 ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
		if(((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPWanted"))) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPWanted"))).equals((String)"")){
			this.BOPTheftLimitationsCoverage.setRABOPWanted_1((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPWanted"))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setRABOPWanted_1((String)"");
		}
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftLimitationsCoverage.getClassBPPPremium_1() != (double)0.0){
			this.BOPTheftLimitationsCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("TheftLimitationsInclddLimit",String.valueOf( "Y"))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setInclddLimit((int)0.0);
		}
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPTheftLimitationsCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPTheftLimitationsCoverage.setClassBPPPremium_1((double)0.0);
		}
		else{
			this.BOPTheftLimitationsCoverage.setClassBPPPremium_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium"))));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void bppRateToUse_1 ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
		if(this.BOPTheftLimitationsCoverage.getRABOPWanted_1().equals((String)"Yes") && (this.BOPTheftLimitationsCoverage.getRABOPType_1().equals((String)"Smoothed") || this.BOPTheftLimitationsCoverage.getRABOPType_1().equals((String)"Unsmoothed"))){
		if(((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRateRABOP"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRateRABOP"))) != 0.0){
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRateRABOP"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../HurricaneLossCostsBPP"))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1((double)0.0);
		}
		}
		else{
		if(((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRate"))) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRate"))) != 0.0){
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRate"))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1((double)0.0);
		}
		}
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	classBPPPremium_1();
	
	InclddLimit();
	
	Factor();
	
	rABOPWanted_1();
	
	rABOPType_1();
	
	bppRateToUse_1();
	
	RatingLimit();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPTheftLimitationsCoverage (com.nest.res.bop.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage)  {
	  this.BOPTheftLimitationsCoverage = BOPTheftLimitationsCoverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPTheftLimitationsCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TheftLimitationsFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
			this.BOPTheftLimitationsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPTheftLimitationsCoverage.getFactor() * MathHelper.roundToThousand(this.BOPTheftLimitationsCoverage.getBppRateToUse_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../LCM"))))) * (double)this.BOPTheftLimitationsCoverage.getRatingLimit()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../../../../IRPMFactor")))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setPremium((double)0.0);
		}
	  
	}
	
	
	
	
	


	
}