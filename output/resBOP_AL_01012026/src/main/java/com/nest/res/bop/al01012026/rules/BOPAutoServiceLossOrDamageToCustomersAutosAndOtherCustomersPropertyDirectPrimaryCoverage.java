package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage;
	
	
	
	public  BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage (com.nest.res.bop.al01012026.domain.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage)  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage = BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage;

	  
	}
	public void DedFactor () throws LookupException,NumberFormatException {
	  
		if(!this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getOTCEachAutoDed().equals(MathHelper.getStringValue("")) && !this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getOTCAnyOneEventDed().equals(MathHelper.getStringValue("")) && !this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getCollisionDed().equals(MathHelper.getStringValue(""))){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("AutoServiceRisksDedFactor",String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getOTCEachAutoDed()),String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getOTCAnyOneEventDed()),String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getCollisionDed())))));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setDedFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getDirectPrimaryCoverage().equals(MathHelper.getStringValue("Yes"))){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void Rate () throws LookupException,NumberFormatException {
	  
		if(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getDsLimit() > MathHelper.getIntegerValue(0.0)){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("LossOrDamageToCustAutosAndOtherCustPropDirectPrimaryCovRate",String.valueOf(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getDsLimit())))));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setRate(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage,"../../CommercialAutoLCM")))) * this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage,"../../IRPMFactor")))));

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Limit ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setDsLimit(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getLimitTemp_1());

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void limitTemp_1 ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setLimitTemp_1(MathHelper.getIntegerValue(0.0));

		for( Policy policy : XpathNode.selectNodes(BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage,"../../BOPLocation/BOPStructure/BOPClassification") ){
			this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setLimitTemp_1(MathHelper.getIntegerValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getLimitTemp_1() + (MathHelper.getIntegerValue(XpathNode.selectNodeValue(policy,"AutoServiceLossOrDamageToCustAutosAndOtherCustPropLimit")))));
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
	public void setTotalPremiumForCoverage ()  {
	  this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getRate() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage,"../../CommercialAutoLCM")))) * this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage.getDedFactor()) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPAutoServiceLossOrDamageToCustomersAutosAndOtherCustomersPropertyDirectPrimaryCoverage,"../../IRPMFactor")))));

	  
	}
	
	
	
	
	


	
}