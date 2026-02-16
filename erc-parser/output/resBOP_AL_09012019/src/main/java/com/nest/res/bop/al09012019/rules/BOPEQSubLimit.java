package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEQSubLimit  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPEQSubLimit BOPEQSubLimit;
	
	
	
	public  BOPEQSubLimit (com.nest.res.bop.al09012019.domain.BOPEQSubLimit BOPEQSubLimit)  {
	  this.BOPEQSubLimit = BOPEQSubLimit;

	  
	}
	public void BPPPremium ()  {
	  this.BOPEQSubLimit.setBPPPremium(MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitBPPRate() * this.BOPEQSubLimit.getFactor()) * (MathHelper.getDoubleValue(this.BOPEQSubLimit.getLimitBPP()) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPEQSubLimit.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQSubLimitFactor",String.valueOf( "Y"))));

	  
	}
	public void FunctBPPValtnFactor () throws LookupException,NumberFormatException {
	  this.BOPEQSubLimit.setFunctBPPValtnFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQSubLimitFunctBPPValtnFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Factor();
	
	FunctlBldgValtnFactor();
	
	FunctBPPValtnFactor();
	
	BldgPremium();
	
	BPPPremium();
	
	FunctBPPPremium();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPEQSubLimit.setPremium(MathHelper.getDoubleValue(this.BOPEQSubLimit.getBldgPremium() + this.BOPEQSubLimit.getBPPPremium() + this.BOPEQSubLimit.getFunctBPPPremium()));

	  
	}
	public void BldgPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPEQSubLimit,"../RatingBasis"))).equals(MathHelper.getStringValue("Functional Valuation"))){
			this.BOPEQSubLimit.setBldgPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitRate() * this.BOPEQSubLimit.getFactor()) * (MathHelper.getDoubleValue(this.BOPEQSubLimit.getLimitBuilding()) / MathHelper.getDoubleValue(100.0)) * this.BOPEQSubLimit.getFunctlBldgValtnFactor())));
		}
		else{
			this.BOPEQSubLimit.setBldgPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitRate() * this.BOPEQSubLimit.getFactor()) * (MathHelper.getDoubleValue(this.BOPEQSubLimit.getLimitBuilding()) / MathHelper.getDoubleValue(100.0)))));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEQSubLimit.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPEQSubLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPEQSubLimit.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void FunctlBldgValtnFactor () throws LookupException,NumberFormatException {
	  this.BOPEQSubLimit.setFunctlBldgValtnFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQSubLimitFunctlBldgValtnFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void FunctBPPPremium ()  {
	  this.BOPEQSubLimit.setFunctBPPPremium(MathHelper.getDoubleValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPEQSubLimit,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPEQSubLimit,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPEQSubLimit.setFunctBPPPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(this.BOPEQSubLimit.getFunctBPPPremium() + MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitBPPRate() * this.BOPEQSubLimit.getFunctBPPValtnFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / MathHelper.getDoubleValue(100.0))))));
		}		}

	  
	}
	public void Premium ()  {
	  this.BOPEQSubLimit.setPremium(MathHelper.getDoubleValue(this.BOPEQSubLimit.getBldgPremium() + this.BOPEQSubLimit.getBPPPremium() + this.BOPEQSubLimit.getFunctBPPPremium()));

	  
	}
	
	
	
	
	


	
}