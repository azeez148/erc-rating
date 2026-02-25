package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;
	
	
	
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQPowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../PowerSupply")))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public  BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage = BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Not Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Not Including Overhead Power Transmission")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}