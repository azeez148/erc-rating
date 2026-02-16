package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage = BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage," ../CommunicationSupply")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementCommunicationExcludingOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}