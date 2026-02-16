package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;
	
	
	
	public void Premium ()  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getBaseRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM")))) + MathHelper.roundToThousand(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getOverheadRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../../CommercialPropertyLCM"))))) * ((MathHelper.getIntegerValue(XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage,"../dsLimit"))) / (double)100.0)));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	BaseRate();
	
	OverheadRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void BaseRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setBaseRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQPowerSupplyRate",((String)XpathNode.selectNodeValue(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage," ../PowerSupply")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.getPremium() != (double)0.0){
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage (com.nest.res.bop.domain.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage)  {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage = BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage;

	  
	}
	public void OverheadRate () throws LookupException,NumberFormatException {
	  this.BOPUtilitySrvcsTimeElementPowerIncldgOverheadEQCoverage.setOverheadRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("TimeElementEQOverheadRate",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}