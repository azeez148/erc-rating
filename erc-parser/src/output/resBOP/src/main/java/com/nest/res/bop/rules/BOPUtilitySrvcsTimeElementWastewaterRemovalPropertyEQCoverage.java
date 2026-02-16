package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage = BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage," ../WastewaterRemovalProperty")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWastewaterRemovalPropertyEQCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}