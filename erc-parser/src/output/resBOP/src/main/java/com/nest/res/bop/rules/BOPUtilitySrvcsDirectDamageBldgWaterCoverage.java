package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgWaterCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgWaterCoverage BOPUtilitySrvcsDirectDamageBldgWaterCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage,"../BuildingLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public  BOPUtilitySrvcsDirectDamageBldgWaterCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgWaterCoverage BOPUtilitySrvcsDirectDamageBldgWaterCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage = BOPUtilitySrvcsDirectDamageBldgWaterCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgWaterCoverage," ../WaterSupply")))));

	  
	}
	
	
	
	
	


	
}