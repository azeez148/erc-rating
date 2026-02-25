package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;
	
	
	
	public void setTotalPremiumForCoverage ()  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../dsLimit"))) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../../../../../IRPMFactor")))));

	  
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
	public void CoverageOnPolicyIndicator ()  {
	  
		if(!(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../WastewaterRemovalProperty"))).equals(MathHelper.getStringValue("No Coverage")) && !(MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../WastewaterRemovalProperty"))).equals(MathHelper.getStringValue(""))){
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementWaterSupplyRate",String.valueOf(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../WastewaterRemovalProperty")))));

	  
	}
	public  BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage (com.nest.res.bop.al01012026.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage = BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}