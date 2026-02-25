package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementPowerSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../PowerSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Public Utility-Including Overhead Power Transmission")) || (MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../PowerSupply"))).equals(MathHelper.getStringValue("Other Than Public Utility-Including Overhead Power Transmission"))){
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage = BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementOverheadRate",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}