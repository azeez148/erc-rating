package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;
	
	
	
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	Rate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void Premium ()  {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../../../DedFactor"))) * MathHelper.roundToThousand(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../CommercialPropertyLCM"))))))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremium(MathHelper.roundUpDoller((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../../../../IRPMFactor"))) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0)) * MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../../../DedFactor"))) * MathHelper.roundToThousand(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage,"../../CommercialPropertyLCM"))))))));

	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("CondoCommlUnitMiscRealPropRate",String.valueOf( "Y"))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage (com.nest.res.bop.al09012019.domain.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage)  {
	  this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage = BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage;

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPCondoCommlUnitOwnersOptionalMiscRealPropCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	
	
	
	
	


	
}