package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;
	
	
	
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQCommunicationSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../CommunicationSupply")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
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
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Public Utility-Including Overhead Communication Lines")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../CommunicationSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Including Overhead Communication Lines")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage = BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementCommunicationIncldgOverheadEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}