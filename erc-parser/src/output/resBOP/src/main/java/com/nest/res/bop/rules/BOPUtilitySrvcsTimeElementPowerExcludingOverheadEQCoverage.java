package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQPowerSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage," ../PowerSupply")))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage = BOPUtilitySrvcsTimeElementPowerExcludingOverheadEQCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	
	
	
	
	


	
}