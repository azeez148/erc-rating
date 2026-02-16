package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage;
	
	
	
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQPowerSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage," ../PowerSupply")))));

	  
	}
	public  BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage,"../BusnPrsnlPropLimit"))) / (double)100.0)));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBusnPrsnlPropPowerExcludingOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}