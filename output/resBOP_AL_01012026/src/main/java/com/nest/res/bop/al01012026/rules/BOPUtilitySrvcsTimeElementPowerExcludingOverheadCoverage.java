package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;
	
	
	
	public  BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage = BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Not Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Not Including Overhead Power Transmission"))){
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementPowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../PowerSupply")))));

	  
	}
	
	
	
	
	


	
}