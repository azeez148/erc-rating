package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;
	
	
	
	public  BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage = BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage;

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage," ../WastewaterRemovalProperty")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}