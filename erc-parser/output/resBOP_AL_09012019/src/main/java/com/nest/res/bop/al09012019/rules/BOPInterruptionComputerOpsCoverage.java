package com.nest.res.bop.al09012019.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPInterruptionComputerOpsCoverage  {

	
	
	
	private com.nest.res.bop.al09012019.domain.BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverage;
	
	
	
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPInterruptionComputerOpsCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("InterruptionComputerOpsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPInterruptionComputerOpsCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InterruptionComputerOpsFactor",String.valueOf( "Y"))));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPInterruptionComputerOpsCoverage (com.nest.res.bop.al09012019.domain.BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverage)  {
	  this.BOPInterruptionComputerOpsCoverage = BOPInterruptionComputerOpsCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  
		if(this.BOPInterruptionComputerOpsCoverage.getDsLimit() > this.BOPInterruptionComputerOpsCoverage.getInclddLimit()){
			this.BOPInterruptionComputerOpsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPInterruptionComputerOpsCoverage.getFactor() * this.BOPInterruptionComputerOpsCoverage.getFinalMaxBusnPrsnlPropRate()) * ((MathHelper.getDoubleValue(this.BOPInterruptionComputerOpsCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPInterruptionComputerOpsCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInterruptionComputerOpsCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPInterruptionComputerOpsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void Premium ()  {
	  
		if(this.BOPInterruptionComputerOpsCoverage.getDsLimit() > this.BOPInterruptionComputerOpsCoverage.getInclddLimit()){
			this.BOPInterruptionComputerOpsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPInterruptionComputerOpsCoverage.getFactor() * this.BOPInterruptionComputerOpsCoverage.getFinalMaxBusnPrsnlPropRate()) * ((MathHelper.getDoubleValue(this.BOPInterruptionComputerOpsCoverage.getDsLimit()) - MathHelper.getDoubleValue(this.BOPInterruptionComputerOpsCoverage.getInclddLimit())) / MathHelper.getDoubleValue(100.0))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInterruptionComputerOpsCoverage,"../IRPMFactor"))))));
		}
		else{
			this.BOPInterruptionComputerOpsCoverage.setPremium(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPInterruptionComputerOpsCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPInterruptionComputerOpsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPInterruptionComputerOpsCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void FinalMaxBusnPrsnlPropRate ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPInterruptionComputerOpsCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"FinalMaxBusnPrsnlPropRateFlag"))).equals(MathHelper.getStringValue("Yes"))){
			this.BOPInterruptionComputerOpsCoverage.setFinalMaxBusnPrsnlPropRate(MathHelper.getDoubleValue((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate")))));
		}		}

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	FinalMaxBusnPrsnlPropRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPInterruptionComputerOpsCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPInterruptionComputerOpsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPInterruptionComputerOpsCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	
	
	
	
	


	
}