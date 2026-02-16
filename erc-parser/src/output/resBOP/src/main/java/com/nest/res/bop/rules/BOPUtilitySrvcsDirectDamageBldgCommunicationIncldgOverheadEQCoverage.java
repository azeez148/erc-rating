package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage;
	
	
	
	public  BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage," ../CommunicationSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage,"../BuildingLimit"))) / (double)100.0)));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageEQOverheadRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage," ../CoveredProperty")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationIncldgOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}