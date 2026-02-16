package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage)  {
	  this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage = BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadCoverage," ../CommunicationSupply")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}