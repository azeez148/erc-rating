package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;
	
	
	
	public  BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Including Overhead Power Transmission")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQPowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../PowerSupply")))));

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQOverheadRate",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}