package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWaterCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWaterCoverage BOPUtilitySrvcsTimeElementWaterCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../WaterSupply"))).equals(MathHelper.getStringValue("No Coverage")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../WaterSupply"))).equals(MathHelper.getStringValue(""))){
			this.BOPUtilitySrvcsTimeElementWaterCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWaterCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsTimeElementWaterCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWaterCoverage BOPUtilitySrvcsTimeElementWaterCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage = BOPUtilitySrvcsTimeElementWaterCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWaterCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementWaterSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../WaterSupply")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWaterCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWaterCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}