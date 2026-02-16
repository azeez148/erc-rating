package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../../CommercialPropertyLCM")))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public  BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage = BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage;

	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementPowerSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage," ../PowerSupply")))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerExcludingOverheadCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}