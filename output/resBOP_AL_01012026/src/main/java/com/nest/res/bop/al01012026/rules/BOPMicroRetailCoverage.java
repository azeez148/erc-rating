package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroRetailCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroRetailCoverage BOPMicroRetailCoverage;
	
	
	
	public void CoverageOnPolicyIndicator ()  {
	  this.BOPMicroRetailCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(1.0));

	  
	}
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public void PremiumIndicator ()  {
	  
		if(this.BOPMicroRetailCoverage.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPMicroRetailCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPMicroRetailCoverage.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LossCost();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	public  BOPMicroRetailCoverage (com.nest.res.bop.al01012026.domain.BOPMicroRetailCoverage BOPMicroRetailCoverage)  {
	  this.BOPMicroRetailCoverage = BOPMicroRetailCoverage;

	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPMicroRetailCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroRetailCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailCoverage,"../../MicroLCM")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailCoverage,"../BOPMicroRetailStockCoverage/StockPremium")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailCoverage,"../../IRPMFactor")))));

	  
	}
	public void Premium ()  {
	  this.BOPMicroRetailCoverage.setPremium(MathHelper.roundUpDoller(MathHelper.roundUpDoller(MathHelper.roundToThousand(this.BOPMicroRetailCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailCoverage,"../../MicroLCM")))) + (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailCoverage,"../BOPMicroRetailStockCoverage/StockPremium")))) * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailCoverage,"../../IRPMFactor")))));

	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public void LossCost () throws LookupException,NumberFormatException {
	  this.BOPMicroRetailCoverage.setLossCost(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroRetailEndorsementLossCost",String.valueOf( "Y"))));

	  
	}
	
	
	
	
	


	
}