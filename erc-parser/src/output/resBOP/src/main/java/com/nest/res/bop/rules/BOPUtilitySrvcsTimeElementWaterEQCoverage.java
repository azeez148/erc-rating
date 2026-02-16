package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementWaterEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWaterEQCoverage BOPUtilitySrvcsTimeElementWaterEQCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementWaterEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementWaterEQCoverage BOPUtilitySrvcsTimeElementWaterEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage = BOPUtilitySrvcsTimeElementWaterEQCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementWaterEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQWaterSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage," ../WaterSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementWaterEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementWaterEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementWaterEQCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	
	
	
	
	


	
}