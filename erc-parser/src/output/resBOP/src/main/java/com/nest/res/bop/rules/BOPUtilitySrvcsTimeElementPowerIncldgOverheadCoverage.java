package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementPowerSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage," ../PowerSupply")))));

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementOverheadRate",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../dsLimit"))) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage,"../../../../../IRPMFactor")))));

	  
	}
	public  BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage = BOPUtilitySrvcsTimeElementPowerIncldgOverheadCoverage;

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}