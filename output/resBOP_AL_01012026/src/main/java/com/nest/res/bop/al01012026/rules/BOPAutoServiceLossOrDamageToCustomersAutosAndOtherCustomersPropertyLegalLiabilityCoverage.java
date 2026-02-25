package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage;
	
	
	
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getOTCEachAutoDed().equals(MathHelper.getStringValue("")) && !this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getOTCAnyOneEventDed().equals(MathHelper.getStringValue("")) && !this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getCollisionDed().equals(MathHelper.getStringValue(""))){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutoServiceRisksDedFactor",String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getOTCEachAutoDed()),String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getOTCAnyOneEventDed()),String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getCollisionDed())))));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void limitTemp_1 ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setLimitTemp_1(MathHelper.getIntegerValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"AutoServiceLossOrDamageToCustAutosAndOtherCustPropLimit")))));
		}

	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage,"../../CommercialAutoLCM")))) * this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage,"../../IRPMFactor")))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setRate(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToCustAutosAndOtherCustPropLegalLiabCovRate",String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getDsLimit()))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	limitTemp_1();
	
	Limit();
	
	Rate();
	
	DedFactor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getLegalLiabilityCoverage().equals(MathHelper.getStringValue("Yes"))){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Limit ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setDsLimit(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getLimitTemp_1());

	  
	}
	public  BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage)  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage = BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage;

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage,"../../CommercialAutoLCM")))) * this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyLegalLiabilityCoverage,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}