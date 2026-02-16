package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Premium ()  {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../../../../IRPMFactor"))) * MathHelper.roundUpDoller(((double)this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getDsLimit() / (double)100.0) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../../../DedFactor"))) * MathHelper.roundToThousand(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../CommercialPropertyLCM"))))))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getPremium() != (double)0.0){
			this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public  BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage (com.nest.res.bop.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage)  {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage = BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondoCommlUnitMiscRealPropRate",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}