package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage;
	
	
	
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage,"../BusnPrsnlPropLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage," ../WaterSupply")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropWaterCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}