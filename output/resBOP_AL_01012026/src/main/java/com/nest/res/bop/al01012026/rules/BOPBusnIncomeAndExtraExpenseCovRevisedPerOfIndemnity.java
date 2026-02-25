package com.nest.res.bop.al01012026.rules;


import com.nest.res.common.exception.LookupException;
import com.nest.res.common.rule.PolicyRule;
import com.nest.res.common.domain.Policy;
import com.nest.res.common.lookup.service.RateTableLookup;
import com.nest.res.common.util.MathHelper;
import com.nest.res.common.util.XpathNode;
import java.util.List;
import java.text.ParseException;

public class BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity  {

	
	
	
	private com.nest.res.bop.al01012026.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;
	
	
	
	public void PremiumIndicator ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getPremium() != MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(1.0)));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremiumIndicator(MathHelper.getIntegerValue(MathHelper.getIntegerValue(0.0)));
		}
	  
	}
	public void LimitFactor () throws LookupException,NumberFormatException {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getNumOfMonths() != MathHelper.getIntegerValue(0.0)){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue((String)RateTableLookup.getRateTableLookupValue("BusnIncomeExtraExpenseCovRevisedPerOfIndemnityFactor",String.valueOf(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getNumOfMonths())))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setLimitFactor(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void setTotalPremiumForCoverage ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getModifiedLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../BOPStructureBuildingCoverage/Premium")))) + MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getModifiedLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../TotalBusnPrsnlPropCovPremium"))))));

	  
	}
	public void modifiedLimitFactor_1 ()  {
	  
		if(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getLimitFactor() > MathHelper.getDoubleValue(0.0)){
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setModifiedLimitFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0) - (MathHelper.getDoubleValue(1.0) - MathHelper.getDoubleValue(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getLimitFactor())))));
		}
		else{
			this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setModifiedLimitFactor_1(MathHelper.getDoubleValue(MathHelper.getDoubleValue(0.0)));
		}
	  
	}
	public void ProcessPremium1 () throws LookupException,NumberFormatException {
	  
	ProcessPremium1_ProcessPremiumSub1();
	
	  
	}
	public  BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity (com.nest.res.bop.al01012026.domain.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity)  {
	  this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity = BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity;

	  
	}
	public void Premium ()  {
	  this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.setPremium(MathHelper.getDoubleValue(MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getModifiedLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../BOPStructureBuildingCoverage/Premium")))) + MathHelper.roundUpDoller(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity.getModifiedLimitFactor_1() * (MathHelper.getDoubleValue(XpathNode.selectNodeValue(this.BOPBusnIncomeAndExtraExpenseCovRevisedPerOfIndemnity,"../TotalBusnPrsnlPropCovPremium"))))));

	  
	}
	public void ProcessPremium1_ProcessPremiumSub1 () throws LookupException,NumberFormatException {
	  
	LimitFactor();
	
	modifiedLimitFactor_1();
	
	Premium();
	
	PremiumIndicator();
	
	  
	}
	
	
	
	
	


	
}