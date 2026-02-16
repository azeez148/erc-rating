package com.nest.res.bop.rules;


import com.nest.res.exception.LookupException;
import com.nest.res.rule.PolicyRule;
import com.nest.res.domain.Policy;
import com.nest.res.lookup.service.RateTableLookup;
import com.nest.res.util.MathHelper;
import com.nest.res.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPElectronicDataCoverage  {

	
	
	
	private com.nest.res.bop.domain.BOPElectronicDataCoverage BOPElectronicDataCoverage;
	
	
	
	public void FinalMaxBusnPrsnlPropRate ()  {
	  
		for( Policy policy : XpathNode.selectNodes(BOPElectronicDataCoverage,"../BOPLocation/BOPStructure/BOPClassification") ){

		if((MathHelper.getStringValue(XpathNode.selectNodeValue(policy,"FinalMaxBusnPrsnlPropRateFlag"))).equals((String)"Yes")){
			this.BOPElectronicDataCoverage.setFinalMaxBusnPrsnlPropRate((MathHelper.getDoubleValue(XpathNode.selectNodeValue(policy,"FinalBusnPrsnlPropRate"))));
		}		}

	  
	}
	public  BOPElectronicDataCoverage (com.nest.res.bop.domain.BOPElectronicDataCoverage BOPElectronicDataCoverage)  {
	  this.BOPElectronicDataCoverage = BOPElectronicDataCoverage;

	  
	}
	public void Factor () throws LookupException,NumberFormatException {
	  this.BOPElectronicDataCoverage.setFactor(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataFactor",String.valueOf( "Y"))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPElectronicDataCoverage.getPremium() != (double)0.0){
			this.BOPElectronicDataCoverage.setPremiumIndicator((int)1.0);
		}
		else{
			this.BOPElectronicDataCoverage.setPremiumIndicator((int)0.0);
		}
	  
	}
	public void InclddLimit () throws LookupException,NumberFormatException {
	  this.BOPElectronicDataCoverage.setInclddLimit(MathHelper.getIntegerValue((String)RateTableLookup.getRateTableLookupValue("ElectronicDataInclddLimit",String.valueOf( "Y"))));

	  
	}
	public void Premium ()  {
	  
		if(this.BOPElectronicDataCoverage.getDsLimit() > this.BOPElectronicDataCoverage.getInclddLimit()){
			this.BOPElectronicDataCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPElectronicDataCoverage.getFinalMaxBusnPrsnlPropRate() * this.BOPElectronicDataCoverage.getFactor()) * MathHelper.roundUpDoller(((double)this.BOPElectronicDataCoverage.getDsLimit() - (double)this.BOPElectronicDataCoverage.getInclddLimit()) / (double)100.0)) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPElectronicDataCoverage,"../IRPMFactor")))));
		}
		else{
			this.BOPElectronicDataCoverage.setPremium((double)0.0);
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	InclddLimit();
	
	Factor();
	
	FinalMaxBusnPrsnlPropRate();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}