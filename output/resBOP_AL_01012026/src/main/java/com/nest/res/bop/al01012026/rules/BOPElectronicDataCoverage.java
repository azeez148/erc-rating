package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicDataCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPElectronicDataCoverage BOPElectronicDataCoverage;
	
	
	
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPElectronicDataCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPElectronicDataCoverage.getDsLimit() > this.BOPElectronicDataCoverage.getInclddLimit()){
			this.BOPElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPElectronicDataCoverage.getFinalMaxBusnPrsnlPropRate() * this.BOPElectronicDataCoverage.getFactor()) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPElectronicDataCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPElectronicDataCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void FinalMaxBusnPrsnlPropRate ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPElectronicDataCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"FinalMaxBusnPrsnlPropRateFlag"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPElectronicDataCoverage.setFinalMaxBusnPrsnlPropRate(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate")))));
		}		}

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPElectronicDataCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("No"))){
		if(this.BOPElectronicDataCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPElectronicDataCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPElectronicDataCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		}
		else{
			this.BOPElectronicDataCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void Premium ()  {
	  
		if(this.BOPElectronicDataCoverage.getDsLimit() > this.BOPElectronicDataCoverage.getInclddLimit()){
			this.BOPElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPElectronicDataCoverage.getFinalMaxBusnPrsnlPropRate() * this.BOPElectronicDataCoverage.getFactor()) * MathHelper.roundUpDoller((MathHelper.getDoubleValue(this.BOPElectronicDataCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPElectronicDataCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicDataCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPElectronicDataCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPElectronicDataCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPElectronicDataCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	FinalMaxBusnPrsnlPropRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPElectronicDataCoverage (com.nest.res.bop.al01012026.domain.BOPElectronicDataCoverage BOPElectronicDataCoverage)  {
	  this.BOPElectronicDataCoverage = BOPElectronicDataCoverage;

	  
	}
	
	
	
	
	


	
}