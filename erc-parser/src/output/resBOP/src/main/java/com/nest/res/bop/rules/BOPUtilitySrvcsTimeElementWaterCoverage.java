package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWaterCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWaterCoverage BOPUtilitySrvcsTimeElementWaterCoverage;
	
	
	
	public  BOPUtilitySrvcsTimeElementWaterCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWaterCoverage BOPUtilitySrvcsTimeElementWaterCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage = BOPUtilitySrvcsTimeElementWaterCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage," ../WaterSupply")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWaterCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWaterCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWaterCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}