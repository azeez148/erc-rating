package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage)  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage = BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("DirectDamageCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage," ../CoveredProperty ")),((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage," ../CommunicationSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(MathHelper.roundToThousand(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage,"../../../../DedFactor")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage,"../BuildingLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsDirectDamageBldgCommunicationExcludingOverheadCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}