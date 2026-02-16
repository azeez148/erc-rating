package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;
	
	
	
	public  BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage;

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQOverheadRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage," ../CoveredProperty")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQPowerSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage," ../PowerSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgPowerIncldgOverheadEQCoverage,"../BuildingLimit"))) / (double)100.0)));

	  
	}
	
	
	
	
	


	
}