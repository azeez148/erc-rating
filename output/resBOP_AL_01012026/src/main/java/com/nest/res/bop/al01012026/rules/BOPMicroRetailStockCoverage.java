package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPMicroRetailStockCoverage  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPMicroRetailStockCoverage BOPMicroRetailStockCoverage;
	
	
	
	public void PolicyIndicator_Calculation ()  {
	  
	CoverageOnPolicyIndicator();
	
	  
	}
	public  BOPMicroRetailStockCoverage (com.nest.res.bop.al01012026.domain.BOPMicroRetailStockCoverage BOPMicroRetailStockCoverage)  {
	  this.BOPMicroRetailStockCoverage = BOPMicroRetailStockCoverage;

	  
	}
	public void CommonRating1 () throws LookupException,NumberFormatException {
	  
	PolicyIndicator_Calculation();
	
	CommonRating1_CommonRatingSub1();
	
	  
	}
	public void LossCost () throws LookupException,NumberFormatException {
	  
		if(!this.BOPMicroRetailStockCoverage.getTheftDeductible().equals(MathHelper.getStringValue(""))){
			this.BOPMicroRetailStockCoverage.setLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("MicroStockLossCosts",String.valueOf(this.BOPMicroRetailStockCoverage.getTheftDeductible())))));
		}
		else{
			this.BOPMicroRetailStockCoverage.setLossCost(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void CommonRating1_CommonRatingSub1 () throws LookupException,NumberFormatException {
	  
	LossCost();
	
	StockPremium();
	
	  
	}
	public void CoverageOnPolicyIndicator ()  {
	  
		if(this.BOPMicroRetailStockCoverage.getDsLimit() == MathHelper.getIntegerValue(0.0)){
			this.BOPMicroRetailStockCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
		else{
			this.BOPMicroRetailStockCoverage.setCoverageOnPolicyIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
	  
	}
	public void StockPremium ()  {
	  this.BOPMicroRetailStockCoverage.setStockPremium(MathHelper.getDoubleValue(MathHelper.roundToThousand(this.BOPMicroRetailStockCoverage.getLossCost() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPMicroRetailStockCoverage,"../../MicroLCM")))) * (MathHelper.getDoubleValue(this.BOPMicroRetailStockCoverage.getDsLimit()) / MathHelper.getDoubleValue(100.0))));

	  
	}
	
	
	
	
	


	
}