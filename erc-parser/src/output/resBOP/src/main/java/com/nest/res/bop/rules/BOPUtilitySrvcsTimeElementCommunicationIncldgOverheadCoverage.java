package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementOverheadRate",String.valueOf( "Y"))));

	  
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
	public  BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage)  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage = BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementCommunicationSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage," ../CommunicationSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}