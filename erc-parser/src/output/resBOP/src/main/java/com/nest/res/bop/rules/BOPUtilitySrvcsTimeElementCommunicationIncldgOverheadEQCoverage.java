package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQOverheadRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage = BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage," ../CommunicationSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}