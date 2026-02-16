package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;
	
	
	
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage," ../WaterSupply")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterEQCoverage,"../BusnPrsnlPropLimit"))) / (double)100.0)));

	  
	}
	
	
	
	
	


	
}