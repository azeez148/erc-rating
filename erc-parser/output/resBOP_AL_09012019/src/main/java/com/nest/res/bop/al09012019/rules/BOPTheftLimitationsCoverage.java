package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPTheftLimitationsCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage;
	
	
	
	public void bppRateToUse_1 ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
		if(this.BOPTheftLimitationsCoverage.getRABOPWanted_1().equals(MathHelper.getStringValue("Yes")) && (this.BOPTheftLimitationsCoverage.getRABOPType_1().equals(MathHelper.getStringValue("Smoothed")) || this.BOPTheftLimitationsCoverage.getRABOPType_1().equals(MathHelper.getStringValue("Unsmoothed")))){
		if((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRateRABOP")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRateRABOP"))) != 0.0){
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRateRABOP"))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../HurricaneLossCostsBPP"))))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		else{
		if((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRate")) != null && (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRate"))) != 0.0){
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropRate")))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setBppRateToUse_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		}
		}
	  
	}
	public void rABOPType_1 ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
		if((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPType")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPType"))).equals(MathHelper.getStringValue(""))){
			this.BOPTheftLimitationsCoverage.setRABOPType_1(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPType")))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setRABOPType_1(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
			this.BOPTheftLimitationsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPTheftLimitationsCoverage.getFactor() * MathHelper.roundToThousand(this.BOPTheftLimitationsCoverage.getBppRateToUse_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../LCM"))))) * MathHelper.getDoubleValue(this.BOPTheftLimitationsCoverage.getRatingLimit())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void rABOPWanted_1 ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
		if((XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPWanted")) != null && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPWanted"))).equals(MathHelper.getStringValue(""))){
			this.BOPTheftLimitationsCoverage.setRABOPWanted_1(MathHelper.getStringValue((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../RABOPWanted")))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setRABOPWanted_1(MathHelper.getStringValue(MathHelper.getStringValue("")));
		}
		}
	  
	}
	public void classBPPPremium_1 ()  {
	  
		if(XpathNode.selectNodes(this.BOPTheftLimitationsCoverage,"../BOPClassificationBusnPrsnlPropCoverage").size() == 0.0){
			this.BOPTheftLimitationsCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
		else{
			this.BOPTheftLimitationsCoverage.setClassBPPPremium_1(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BOPClassificationBusnPrsnlPropCoverage/Premium")))));
		}
	  
	}
	public  BOPTheftLimitationsCoverage (com.nest.res.bop.al09012019.domain.BOPTheftLimitationsCoverage BOPTheftLimitationsCoverage)  {
	  this.BOPTheftLimitationsCoverage = BOPTheftLimitationsCoverage;

	  
	}
	public void RatingLimit ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
			this.BOPTheftLimitationsCoverage.setRatingLimit(MathHelper.getIntegerValue((this.BOPTheftLimitationsCoverage.getDsLimit() - this.BOPTheftLimitationsCoverage.getInclddLimit()) / MathHelper.getIntegerValue(100.0)));
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
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0) || (MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../BusnPrsnlPropLimit"))) == MathHelper.getIntegerValue(0.0)){
			this.BOPTheftLimitationsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPTheftLimitationsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPTheftLimitationsCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TheftLimitationsFactor",String.valueOf( "Y"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getDsLimit() > this.BOPTheftLimitationsCoverage.getInclddLimit()){
			this.BOPTheftLimitationsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPTheftLimitationsCoverage.getFactor() * MathHelper.roundToThousand(this.BOPTheftLimitationsCoverage.getBppRateToUse_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../LCM"))))) * MathHelper.getDoubleValue(this.BOPTheftLimitationsCoverage.getRatingLimit())) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPTheftLimitationsCoverage,"../../../../IRPMFactor"))))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  
		if(this.BOPTheftLimitationsCoverage.getClassBPPPremium_1() != MathHelper.getDoubleValue(0.0)){
			this.BOPTheftLimitationsCoverage.setInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("TheftLimitationsInclddLimit",String.valueOf( "Y")))));
		}
		else{
			this.BOPTheftLimitationsCoverage.setInclddLimit(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPTheftLimitationsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPTheftLimitationsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPTheftLimitationsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}