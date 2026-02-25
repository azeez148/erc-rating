package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public  BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage = BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../WastewaterRemovalProperty"))).equals(MathHelper.getStringValue("No Coverage")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../WastewaterRemovalProperty"))).equals(MathHelper.getStringValue("")) && ((XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../../../BOPEarthquake")) != null || (XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../../../BOPEQSubLimit")) != null)){
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQWaterSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../WastewaterRemovalProperty")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}