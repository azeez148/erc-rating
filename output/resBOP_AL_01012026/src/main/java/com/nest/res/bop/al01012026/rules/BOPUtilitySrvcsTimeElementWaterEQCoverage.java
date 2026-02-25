package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWaterEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWaterEQCoverage BOPUtilitySrvcsTimeElementWaterEQCoverage;
	
	
	
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQWaterSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../WaterSupply")))));

	  
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
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWaterEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWaterEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsTimeElementWaterEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWaterEQCoverage BOPUtilitySrvcsTimeElementWaterEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage = BOPUtilitySrvcsTimeElementWaterEQCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../WaterSupply"))).equals(MathHelper.getStringValue("No Coverage")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../WaterSupply"))).equals(MathHelper.getStringValue("")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWaterEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}