package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPEQSubLimit  {

	
	
	
	private com.nest.res.bop.domain.BOPEQSubLimit BOPEQSubLimit;
	
	
	
	public void FunctlBldgValtnFactor () throws LookupException,NumberFormatException {
	  this.BOPEQSubLimit.setFunctlBldgValtnFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQSubLimitFunctlBldgValtnFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPEQSubLimit.setPremium(this.BOPEQSubLimit.getBldgPremium() + this.BOPEQSubLimit.getBPPPremium() + this.BOPEQSubLimit.getFunctBPPPremium());

	  
	}
	public void BldgPremium ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPEQSubLimit,"../RatingBasis"))).equals((String)"Functional Valuation")){
			this.BOPEQSubLimit.setBldgPremium(MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitRate() * this.BOPEQSubLimit.getFactor()) * ((double)this.BOPEQSubLimit.getLimitBuilding() / (double)100.0) * this.BOPEQSubLimit.getFunctlBldgValtnFactor()));
		}
		else{
			this.BOPEQSubLimit.setBldgPremium(MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitRate() * this.BOPEQSubLimit.getFactor()) * ((double)this.BOPEQSubLimit.getLimitBuilding() / (double)100.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPEQSubLimit.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQSubLimitFactor",String.valueOf( "Y"))));

	  
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
	public void FunctBPPValtnFactor () throws LookupException,NumberFormatException {
	  this.BOPEQSubLimit.setFunctBPPValtnFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("EQSubLimitFunctBPPValtnFactor",String.valueOf( "Y"))));

	  
	}
	public void FunctBPPPremium ()  {
	  this.BOPEQSubLimit.setFunctBPPPremium((double)0.0);

		for( Policy policy : XpathNode.selectNodes(BOPEQSubLimit,"../BOPClassification") ){

		if(XpathNode.selectNodes(this.BOPEQSubLimit,"../BOPClassification/BOPFunctlBusnPrsnlPropValtn").size() > 0.0){
			this.BOPEQSubLimit.setFunctBPPPremium(this.BOPEQSubLimit.getFunctBPPPremium() + MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitBPPRate() * this.BOPEQSubLimit.getFunctBPPValtnFactor()) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"BOPFunctlBusnPrsnlPropValtn/TotalLimit"))) / (double)100.0)));
		}		}

	  
	}
	public void BPPPremium ()  {
	  this.BOPEQSubLimit.setBPPPremium(MathHelper.roundUpDoller((this.BOPEQSubLimit.getEQSubLimitBPPRate() * this.BOPEQSubLimit.getFactor()) * ((double)this.BOPEQSubLimit.getLimitBPP() / (double)100.0)));

	  
	}
	public  BOPEQSubLimit (com.nest.res.bop.domain.BOPEQSubLimit BOPEQSubLimit)  {
	  this.BOPEQSubLimit = BOPEQSubLimit;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPEQSubLimit.getPremium() != (double)0.0){
			this.BOPEQSubLimit.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPEQSubLimit.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}