package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPInterruptionComputerOpsCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverage;
	
	
	
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPInterruptionComputerOpsCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("InterruptionComputerOpsFactor",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPInterruptionComputerOpsCoverage.getDsLimit() > this.BOPInterruptionComputerOpsCoverage.getInclddLimit()){
			this.BOPInterruptionComputerOpsCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPInterruptionComputerOpsCoverage.getFactor() * this.BOPInterruptionComputerOpsCoverage.getFinalMaxBusnPrsnlPropRate()) * (((double)this.BOPInterruptionComputerOpsCoverage.getDsLimit() - (double)this.BOPInterruptionComputerOpsCoverage.getInclddLimit()) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPInterruptionComputerOpsCoverage,"../IRPMFactor")))));
		}
		else{
			this.BOPInterruptionComputerOpsCoverage.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	FinalMaxBusnPrsnlPropRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPInterruptionComputerOpsCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("InterruptionComputerOpsInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void FinalMaxBusnPrsnlPropRate ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPInterruptionComputerOpsCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"FinalMaxBusnPrsnlPropRateFlag"))).equals((String)"Yes")){
			this.BOPInterruptionComputerOpsCoverage.setFinalMaxBusnPrsnlPropRate((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))));
		}		}

	  
	}
	public  BOPInterruptionComputerOpsCoverage (com.nest.res.bop.domain.BOPInterruptionComputerOpsCoverage BOPInterruptionComputerOpsCoverage)  {
	  this.BOPInterruptionComputerOpsCoverage = BOPInterruptionComputerOpsCoverage;

	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPInterruptionComputerOpsCoverage.getPremium() != (double)0.0){
			this.BOPInterruptionComputerOpsCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPInterruptionComputerOpsCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	
	
	
	
	


	
}