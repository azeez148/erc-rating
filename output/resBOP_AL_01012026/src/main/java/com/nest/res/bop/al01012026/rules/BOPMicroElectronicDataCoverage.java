package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroElectronicDataCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroElectronicDataCoverage BOPMicroElectronicDataCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPMicroElectronicDataCoverage (com.nest.res.bop.al01012026.domain.BOPMicroElectronicDataCoverage BOPMicroElectronicDataCoverage)  {
	  this.BOPMicroElectronicDataCoverage = BOPMicroElectronicDataCoverage;

	  
	}
	public void Premium ()  {
	  
		if(this.BOPMicroElectronicDataCoverage.getDsLimit() != MathHelper.getIntegerValue(0.0) && this.BOPMicroElectronicDataCoverage.getDsLimit() > this.BOPMicroElectronicDataCoverage.getIncludedLimit() && (XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../BOPMicroLocation/BOPMicroClassification/FinalBusinessPersonalPropertyRate")) != null){
			this.BOPMicroElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../BOPMicroLocation/BOPMicroClassification/FinalBusinessPersonalPropertyRate"))) * this.BOPMicroElectronicDataCoverage.getFactor()) * ((MathHelper.getDoubleValue(this.BOPMicroElectronicDataCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPMicroElectronicDataCoverage.getIncludedLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPMicroElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroElectronicDataCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroElectronicDataCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroElectronicDataCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	IncludedLimit();
	
	Factor();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void IncludedLimit () throws LookupException,NumberFormatException {
	  this.BOPMicroElectronicDataCoverage.setIncludedLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("MicroElectronicDataIncludedLimit",String.valueOf( "Y"))));

	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if((MathHelper.getStringValue(XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../MicroBOP"))).equals(MathHelper.getStringValue("Yes"))){
		if(this.BOPMicroElectronicDataCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPMicroElectronicDataCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPMicroElectronicDataCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		}
		else{
			this.BOPMicroElectronicDataCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPMicroElectronicDataCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroElectronicDataFactor",String.valueOf( "Y"))));

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPMicroElectronicDataCoverage.getDsLimit() != MathHelper.getIntegerValue(0.0) && this.BOPMicroElectronicDataCoverage.getDsLimit() > this.BOPMicroElectronicDataCoverage.getIncludedLimit() && (XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../BOPMicroLocation/BOPMicroClassification/FinalBusinessPersonalPropertyRate")) != null){
			this.BOPMicroElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand((MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../BOPMicroLocation/BOPMicroClassification/FinalBusinessPersonalPropertyRate"))) * this.BOPMicroElectronicDataCoverage.getFactor()) * ((MathHelper.getDoubleValue(this.BOPMicroElectronicDataCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPMicroElectronicDataCoverage.getIncludedLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroElectronicDataCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPMicroElectronicDataCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}